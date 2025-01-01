class Armstrong{
    public static void main(String[] args){
        for(int i=100;i<=999;i++){
            int sum=0;
            int temp=i;
            while(temp>0){
                int rem=temp%10;
                sum+=(rem*rem*rem);
                temp/=10;
            }
            if(sum==i){
                System.out.print(sum+" ");
            }
        }
    }
}