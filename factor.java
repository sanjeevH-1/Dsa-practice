// Online Java Compiler
// factor

class factor {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int n=-54;
        if(n!=0){
            n=Math.abs(n);
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    System.out.print(i+" ,");
                }
            }
        }
        else{
            System.out.println("no factor");
        }
    }
}
