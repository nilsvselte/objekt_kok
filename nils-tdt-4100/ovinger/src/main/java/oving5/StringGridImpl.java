package oving5;
import java.util.ArrayList;
import java.util.List;
public class StringGridImpl implements StringGrid {

    private int rows;
    private int columnCount; 
    private List<String> grid = new ArrayList<String>();


    //Constructor
    public StringGridImpl(int rows, int columnCount){
        this.rows = rows;
        this.columnCount= columnCount;
        for(int i=0; i<(rows*columnCount);i++){
            grid.add(null);
        }
    }

    @Override
    public int getRowCount() {
        return this.rows;
    }

    @Override
    public int getColumnCount() {
        return this.columnCount;
    }

    @Override
    public String getElement(int row, int column) {
        return grid.get(getIndex(column,row));
    }

    @Override
    public void setElement(int row, int column, String element) {
        grid.set(getIndex(column, row),element);
    }
    private int getIndex(int column, int row){
        return column*this.rows + row;
    }
    
}
