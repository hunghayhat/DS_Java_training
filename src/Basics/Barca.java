package Basics;
//Class's example
public class Barca {
    //Multiple attribute: nhiều thuộc tính
    String[] HLV = {"Pep", "Johan"};
    String[] footballers = {"Messi", "Xavi", "Iniesta"};
    final int x = 19; //Không thể ghi đè


    public static void main(String[] args) {
        Barca footballers = new Barca();
        Barca managers = new Barca();
        System.out.println(managers.HLV[0]);
//        managers.x = 10; không thể gán 1 giá trị mới cho x
        System.out.println(managers.x);
        System.out.println("2008 là năm hoàng kim của Barca với sát thủ " +footballers.footballers[0]+ " với sự dẫn dắt của HLV " + managers.HLV[0] +"!");
    }
}
