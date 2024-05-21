import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A (uncomment first)
   public Location getNextLoc(int row, int col) {
     boolean nextRow=false;
     boolean nextCol=false;
     if (row<grid.length-1){
       nextRow=true;
     }
     if (col<grid[0].length-1){
       nextCol=true;
     }
     int num1=Integer. MAX_VALUE; int num2=Integer. MAX_VALUE;
     if (nextRow){
       num1=grid[row+1][col];
     }
     if (nextCol){
        num2=grid[row][col+1];
      }
     if (num1<num2){
       Location x= new Location(row+1,col);
       return x;
     }
     else {
       Location x= new Location(row,col+1);
       return x;
     }
   }

  
  // PART B
   public int sumPath(int row, int col) {
     int sum=grid[row][col];
     while (row<grid.length-1 && col<grid[0].length-1){
       Location x= getNextLoc(row,col);
       sum+=grid[x.getRow()][x.getCol()];
       row=x.getRow();
       col=x.getCol();
     }
     sum+=grid[grid.length-1][grid[0].length-1];
     return sum;
   }

  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
