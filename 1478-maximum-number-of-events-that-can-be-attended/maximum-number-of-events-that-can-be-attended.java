class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer>q=new PriorityQueue<>();
        int i=0,day=0,res=0,n=events.length;
        while(i<n || !q.isEmpty()){
            if(q.isEmpty()){
                day=events[i][0];
                // move to next day starting
            }
            // putting in queue on the basis of end time
            while(i<n && events[i][0]==day){
                q.add(events[i][1]);
                i++;
            }
            while(!q.isEmpty() && q.peek()<day){
                q.poll();
            }
            if(!q.isEmpty()){
                q.poll();
                res++;
            }
            day++;
        }
        return res;
    }
}