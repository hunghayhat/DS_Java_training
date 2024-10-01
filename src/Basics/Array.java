package Basics;

public class Array {
    public static void main(String[] args) {
        //String with for-each loop
        String[] footballers = {"Messi", "Ronaldo", "Mbappe", "Neymar", "Isco"};
        int min_length = footballers[0].length();
        for (String i:footballers){
            if (i.length() < footballers[0].length()){
                min_length = i.length();
            }
        }
        System.out.println("Độ dài chuỗi nhỏ nhất trong mảng là: " + min_length);

        // Multidimensional Arrays
        int[][] a = {{1, 3, 5}, {2, 4, 6}};
        System.out.println(a[1][1]); // Output: 4

    }


}
