public class QuestionNo50 {

    public double myPow(double x,int n){
        if(n==0)return 1.0;
        if(n<0){
            x=1/x;
            n=-n;
        }
        return computeAns(x,n);
    }
    public double computeAns(double x,int n){
        if(n==0){
        return 1.0;
    }
    double ans=computeAns(x,n/2);
    double finalAnswer=ans*ans;
    if(n%2==1){
        finalAnswer=finalAnswer*x;
    }
    else{
        return finalAnswer;
    }
    return finalAnswer;
 }
}