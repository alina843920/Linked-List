public class Main {
    public static void main(String[] args){
        var ourList = new LinkedList();
        ourList.append(1);
        ourList.append(345);
        ourList.insertOnTop(999);
        System.out.println(ourList);
    }
}