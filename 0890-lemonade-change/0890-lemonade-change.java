class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int arr[] = new int[2];
        for(int i=0;i<n;i++){
            if(bills[i]==5) arr[0]++;
            else if(bills[i]==10){
                if(arr[0]>0) 
                {
                    arr[1]++; 
                    arr[0]--;
                }
            else return false;
            }
            else{
                if(bills[i] == 20 && arr[0]>0 && arr[1]>0) 
                {
                    arr[0]--;
                    arr[1]--;
                }
                else if(bills[i] == 20 && arr[0]>2){
                    arr[0]-=3;
                }
                else return false;
            }
        }
        return true;
    }
}