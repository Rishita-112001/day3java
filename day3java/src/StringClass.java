public class StringClass {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = new String("abc");

        //if(s1 == s2){System.out.println("will not work")}
        //as it compares address of the string
        if (s1.equals(s2)){//this method compares the value
            System.out.println("GOOD");

        }else{
            System.out.println("NOT GOOD");
        }

        String s3 = new String("Welcome to CDAC");
        System.out.println(s3.charAt(s3.length()-2));
        System.out.println(s3.indexOf("C"));//TELLS THE INDEX OF THE CHARACTER
        System.out.println(s3.toLowerCase());//TO CONVERT THE STRING INTO LOWERCASE
        System.out.println(s3);
        System.out.println(s3.contains("CDAC1"));//TO CHECK IF THE STRING OR WORD IS IN THE STRING

        String s4 = s3.replace("CDAC","Programming");//TO REPLACE ANY WORD IN A STRING
        System.out.println(s3);
        System.out.println(s4);

        String s5 = s4.substring(10);//TO PRINT THE STRING FROM A PARTICULAR PLACE
        System.out.println(s5);
        System.out.println(s3+1);//TO ADD ANYTHING TO STRING
    }
}
