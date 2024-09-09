// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// code to only display the lowercase from a given string and its size also
class Demo {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String s ="Try Programiz Pro";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)>=97&&s.charAt(i)<=123){
                sb.append(s.charAt(i));
            }
        }
        sb.append(":"+sb.length());
        System.out.println(sb);


    }
}
