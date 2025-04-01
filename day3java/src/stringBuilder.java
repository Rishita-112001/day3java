public class stringBuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("I LOVE PROGRAMMING");
        sb.append(" And Welcome To PG-DAI Course");//to add any string to original string
        System.out.println(sb);

        sb.insert(23,"Greetings ,");//to insert any string at a specific location in the string
        sb.replace(33,34,"and ");//to replace any string in the original string
        sb.delete(0,7);//to delete

        System.out.println(sb);
    }
}
