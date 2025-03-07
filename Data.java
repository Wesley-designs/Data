public class Data
{
//public static final int MAX = /* value not shown */;
private int[][] grid;
/** Fills all elements of grid with randomly generated values, as described in part (a)
* Precondition: grid is not null.
* grid has at least one element.
*/
public void repopulate()
{
    int hori = (int)(Math.random()*10)+1; //row
    int vert = (int)(Math.random()*10)+1; //col
    grid = new int[hori][vert];

    for (int i=0; i<hori; i++) {
        for (int o=0; o<vert; o++) {
            int randnum = 100;
            while ((randnum%100 == 0) || (randnum%10!=0)) {
                randnum = ((int)((Math.random()*10)*(Math.random()*10)))*10;
            }
            grid[i][o] = randnum;
        }
    }
}

public String get2D()
{
    String a = "";
    for (int[] x : grid) {
        for (int y : x) {
            a+=" " + y;
        }
        a+=" |";
    }
    return a;
}

public String toString()
{
    String s = "";
    for (int[] row : grid)
    {
        for (int col : row) s += col + " ";
        s += "\n";
    }
    return s;
}

/** Returns the number of columns in grid that are in increasing order, as described
* in part (b)
* Precondition: grid is not null.
* grid has at least one element.
*/
public int countIncreasingCols()
{
    int count = 0;
    int h = grid.length;
    int y = grid[0].length;
    for (int o=0; o<y; o++) {
        int subcount = 0;
        for (int i=0; i<h-1; i++) {
            if (grid[i+1][o]>=grid[i][o]) {
                subcount++;
            }
        }
        if (subcount == h-1) {
            count++;
        }
    }
    return count;
}
// There may be instance variables, constructors, and methods that are not shown.
}