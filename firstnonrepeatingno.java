// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class firstnonrepeatingno {
    public static void main(String[] args) {
        String s = "SanSeev";
        int c=0,flag=0;
        for(int i=0;i<s.length();i++){
            flag=0;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    flag=1;
                }
            }
            if(flag==0){
                System.out.println(s.charAt(i));
                break;
            }
            else{
                continue;
            }
        }
    }
}
