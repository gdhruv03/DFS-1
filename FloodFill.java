/**
 * Time complexity : O(N*M) where N and M are dimensions of the matrix
 * Space Complexity : O(1)

 * Here we be applying dfs on the co ordinate we need to color, if will check all four co ordinates if it needs to be colored as well
 */

public class FloodFill{
    int[][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};
    int prevColor =0;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        prevColor = image[sr][sc];
        dfs(image,sr,sc,newColor);
        return image;
    }

    public void dfs(int[][] image,int sr,int sc,int newColor)
    {
        if(image[sr][sc] != prevColor) return;
        image[sr][sc] = newColor;

        for(int[] d :dirs)
        {
            int i = sr + d[0];
            int j = sc + d[1];
            if(i >= 0 && i <= image.length - 1 && j >= 0 && j <= image[0].length -1
                    && image[i][j]!=newColor)
            {
                dfs(image,i,j,newColor);
            }
        }
    }
}