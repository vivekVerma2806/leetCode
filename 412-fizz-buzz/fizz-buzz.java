class Solution {
    private boolean divBy5(int n){
        if(n==0) return true;
        int first_di=n%10;// rem pata chal jaiye ga 
        return first_di==5 || first_di==0 ? true : false;
    }
    private boolean divBy3(int n){
        if(n==0) return true;

        int sum=0;
        while(n!=0){
            int d=n%10;
            sum+=d;
            n=n/10;
        }
        return sum%3==0 ? true : false;
    }
    public List<String> fizzBuzz(int n) {
       List<String>ans=new ArrayList<>();
        
        for(int i=1; i<=n;i++){
            if(divBy3(i) && divBy5(i)){
                ans.add("FizzBuzz");
            }else if(divBy3(i)){
                ans.add("Fizz");
            }else if(divBy5(i)){
                ans.add("Buzz");
            }else{
                //int ko string main  dalna hain  
                
                ans.add(Integer.toString(i));
            }
        }
        return ans;
    }
}