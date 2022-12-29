package batch_22_23.method_overload;

public class Demo {

    void sum(){
        System.out.println(1+2);
    }
    void sum(int a){
        System.out.println(a+a);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,String b){ 
    }
    void sum(String b,int a){ 
    }
    
    void sum(String a , String b){
        System.out.println(a+b);
    }
    
}
