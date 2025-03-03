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
    int hori = (int)Math.random()*10;
    int vert = (int)Math.random()*10;
    grid = new int[hori][vert];

    for (int i=0; i<vert; i++) {
        for (int o=0; i<hori; i++) {
            int randnum = 100;
            while ((randnum%100 == 0) || (randnum%10!=0)) {
                randnum = (int)((Math.random()*10)*(Math.random()*10)*10);
            }
            grid[i][o] = randnum;
        }
    }
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
    for (int i=0; i<h-1; i++) {
        for (int o=0; i<v; i++) {
            if (grid[i][o]>=grid[i+1][o]) {
                count++;
            }
        }
    }
    return count;
}
// There may be instance variables, constructors, and methods that are not shown.
}