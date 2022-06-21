package day2;

public class Print50Even {
    public static void main(String[] args) {
        byUsingFor();
        System.out.println();
        byUsingWhile();
    }

    private static void byUsingWhile() {
        int i = 2;
        int count = 1;
        while(count <= 50){
            if(i % 2 == 0){
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }

    private static void byUsingFor() {

        for(int i = 2,count = 1;count <= 50;){
            if(i % 2 == 0){
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
}
