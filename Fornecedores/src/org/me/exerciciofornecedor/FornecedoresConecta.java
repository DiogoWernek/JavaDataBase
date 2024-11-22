package org.me.exerciciofornecedor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FornecedoresConecta {
        private static final String URL = "jdbc:derby://localhost:1527/BDTeste";
        private static final String USERNAME = "Empresa";
        private static final String PASSWORD = "empresa";
        private Connection connection = null;
        
        private PreparedStatement insertNovoFornecedor = null;
        private PreparedStatement alteraFornecedor = null;
        private PreparedStatement excluiFornecedor = null;

        
        public FornecedoresConecta () throws ClassNotFoundException{
         try
         {
         Class.forName("org.apache.derby.jdbc.ClientDriver");
         connection = DriverManager.getConnection (URL, USERNAME, PASSWORD);
         insertNovoFornecedor = connection.prepareStatement (
         "INSERT INTO EMPRESA.TABAGENDA " + "(NOME , CNPJ, EMAIL, ENDERECO, CIDADE, ESTADO, TELEFONE) " +
         "VALUES (?, ?, ?, ?, ?, ?, ?)");
         }
         catch (SQLException sqlException)
         {
         sqlException.printStackTrace();
         System.exit(1);
         }
        }
        public int adicionaFornecedor(
         String nome, String CNPJ, String mail, String ender, String cid, String es, String fone )
         {
         int result = 0;
        try{
         insertNovoFornecedor.setString(1, nome);
         insertNovoFornecedor.setString(2, CNPJ);
         insertNovoFornecedor.setString(3, mail);
         insertNovoFornecedor.setString(4, ender);
         insertNovoFornecedor.setString(5, cid);
         insertNovoFornecedor.setString(6, es);
         insertNovoFornecedor.setString(7, fone);

         result = insertNovoFornecedor.executeUpdate();
         }
        catch (SQLException sqlException)
        {
         sqlException.printStackTrace();
         close();
        }
         return result;
         }
        public void close (){
         try
         {
         connection.close();
         }
         catch (SQLException sqlException)
        {
         sqlException.printStackTrace();
        }
    }

    public List<Fornecedores> getNomeFornecedor(String nome) {
        List<Fornecedores> resultados = new ArrayList<>();
        String sql = "SELECT * FROM EMPRESA.TABAGENDA WHERE NOME = ?";

        try (PreparedStatement selecionaFornecedor = connection.prepareStatement(sql)) {
            selecionaFornecedor.setString(1, nome);

            try (ResultSet resultSet = selecionaFornecedor.executeQuery()) {
                while (resultSet.next()) {
                    resultados.add(new Fornecedores(
                        resultSet.getInt("ID"),
                        resultSet.getString("NOME"),
                        resultSet.getString("CNPJ"),
                        resultSet.getString("EMAIL"),
                        resultSet.getString("ENDERECO"),
                        resultSet.getString("CIDADE"),
                        resultSet.getString("ESTADO"),
                        resultSet.getString("TELEFONE")
                    ));
                }
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return resultados;
    }

    public int atualizaFornecedor(
        String nome, String CNPJ, String mail, String ender, String cid, String es, String fone, int cod) {
        int result = 0;
        String sql = "UPDATE EMPRESA.TABAGENDA SET NOME = ?, CNPJ = ?, EMAIL = ?, ENDERECO = ?, CIDADE = ?, ESTADO = ?, TELEFONE = ? WHERE ID = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, CNPJ);
            stmt.setString(3, mail);
            stmt.setString(4, ender);
            stmt.setString(5, cid);
            stmt.setString(6, es);
            stmt.setString(7, fone);
            stmt.setInt(8, cod);

            result = stmt.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return result;
    }

        
    public boolean deletaFornecedor(int id) {
        boolean exclui = false;
        String sql = "DELETE FROM EMPRESA.TABAGENDA WHERE ID = ?";

        try (PreparedStatement excluiStmt = connection.prepareStatement(sql)) {
            excluiStmt.setInt(1, id);
            int linhasAfetadas = excluiStmt.executeUpdate();
            if (linhasAfetadas > 0) {
                exclui = true;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return exclui;
    }
}
