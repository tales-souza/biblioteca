
package data;

import java.io.PrintStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class TabelaUsuarios extends AbstractTableModel {
    
    private static final String[] colNomes={
        "Código", "Nome ","Login","Senha","Perfil"
    };

   
    private ArrayList<String[]> ResultSets;
    
    public TabelaUsuarios( ResultSet rs ) throws SQLException {
        setResult( rs );
    }
   
    
    
    

   @Override
    public int getRowCount() {
        return ResultSets.size();
    }

    @Override
    public int getColumnCount() {
        return colNomes.length;
    }
    
    @Override
    public String getColumnName( int param ){
        return colNomes[param];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] row = ResultSets.get(rowIndex);
        return row[columnIndex];
    }

    public void setResult(ResultSet rs) throws SQLException {
        
        ResultSets = new ArrayList<String[]>();
        
        while (rs.next()){
            String[] row = {
                rs.getString("id"),
                rs.getString("nome"),
                rs.getString("login"),
                rs.getString("senha"),
                rs.getString("perfil") 
            };

            ResultSets.add(row);
       
    }
        
        fireTableStructureChanged();
        
}
    
    public void deleteRow( int row ){
        ResultSets.remove(row);
        fireTableRowsDeleted(row, row);
    }
}
