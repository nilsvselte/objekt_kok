package oving5;

import java.util.Iterator;

public class StringGridIterator implements Iterator<String> {
    private boolean rowMajor;
    private int currentRow =0;
    private int currentColumn =0;
    private int currentIndex = 0;
    private int maxColumn;
    private int maxRow;
    private StringGrid grid;
    private int maxIndex;
    private int rowMajorHandler;
    //main (debug)
    // public static void main(String[] args) {
    //     StringGrid grid = new StringGridImpl(2, 3);
    //     StringGridIterator iterator = new StringGridIterator(grid, false);
	// 	grid.setElement(0, 0, "0, 0");
	// 	grid.setElement(0, 1, "0, 1");
	// 	grid.setElement(0, 2, "0, 2");
	// 	grid.setElement(1, 0, "1, 0");
	// 	grid.setElement(1, 1, "1, 1");
	// 	grid.setElement(1, 2, "1, 2");

    //     System.out.println(iterator.hasNext());
    //     System.out.println(iterator.next());
    //     System.out.println(iterator.next());
    //     System.out.println(iterator.next());
    //     System.out.println(iterator.next());
    //     System.out.println(iterator.next());
    //     System.out.println(iterator.next());
    //     System.out.println(iterator.hasNext());
    //     }
    // Contructor
    public StringGridIterator(StringGrid grid, boolean rowMajor) {
        this.rowMajor = rowMajor;
        this.grid = grid;
        this.maxColumn = grid.getColumnCount()-1;
        this.maxRow = grid.getRowCount()-1;
        this.maxIndex = this.maxRow * this.maxColumn;
        if (rowMajor) {
            this.currentColumn--;
        } else{
            this.currentRow--;
        }
    }

    @Override
    public boolean hasNext() {
        return ((this.currentRow<maxRow)||(this.currentColumn<maxColumn)) ? true:false; 
    }

    @Override
    public String next() {
        System.out.println("Current col "+currentColumn+"Current row: "+ currentRow);
        indexHandler();
        return grid.getElement(currentRow,currentColumn);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
    private void indexHandler(){
        if(this.rowMajor){
            if(this.currentColumn+1>maxColumn){
                this.currentColumn=0;
                this.currentRow+=1;
                if (currentRow>maxRow){
                    throw new IndexOutOfBoundsException();
                }
            }else{
                this.currentColumn+=1;
            }
        } else{
            if(this.currentRow+1>maxRow){
                this.currentRow=0;
                this.currentColumn+=1;
                if (currentRow>maxRow){
                    throw new IndexOutOfBoundsException();
                }
            }
            else{
                this.currentRow+=1;
            }

        }
    }







    //SKRIV OM
//     private int findNextIndex() {
//         if (this.rowMajor) {
//             if ((this.currentIndex + 1) > this.maxRow) {
//                 this.rowMajorHandler += 1;
//                 this.currentIndex = 0;
//                 if (this.rowMajorHandler > this.maxColumn) {
//                     return 0;
//                 } else {
//                     return this.rowMajorHandler;
//                 }
//             } else {
//                 this.currentIndex += 1;
//                 return this.currentIndex * this.maxRow + this.rowMajorHandler;
//             }
//         }
//         if((this.currentIndex+1)>this.maxIndex){
//             this.currentIndex += 1;
//             return this.currentIndex;
//         }
//         return 0;
//     }

}