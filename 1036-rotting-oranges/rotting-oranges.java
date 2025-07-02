class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh=0;
        Queue<int[]>q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0)return 0;
        int time=0;
         int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        while(!q.isEmpty()){
            int size=q.size();
            boolean rotten=false;
           
            for(int i=0;i<size;i++){
                int[] count=q.poll();
                int x=count[0],y=count[1];
                for(int k=0;k<4;k++){
                    int nx=x+dx[k];
                    int ny=y+dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<m && grid[nx][ny]==1){
                        grid[nx][ny]=2;
                        q.add(new int[]{nx,ny});
                        fresh--;
                        rotten =true;
                    }
                }
            }
            if(rotten)time++;

        }
        return fresh==0?time:-1;
    }
}