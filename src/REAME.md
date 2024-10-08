1. Cài đặt mội trường ( 1 ngày)  
	- JDK  
	- IntelliJ  
2. JDK, JRE, JVM (1 ngày)
	1. JDK:
		1. JDK viết tắt của Java Development Kit là một bộ phần mềm cung cấp môi trường phát triển ứng dụng viết bằng ngôn ngữ Java. JDK bao gồm cả Java Runtime Environment() giúp lập trình viên có thể chạy thử để kiểm tra ứng dụng trong quá trình phát triển ứng dụng.
	2. JRE:
		1. JRE khởi tạo JVM và đảm bảo các phụ thuộc có sẵn cho các chương trình của bạn.
	3. JVM:
		1. JVM (Java Virtual Machine): là máy ảo Java. Nó được dùng để thực thi các chương trình Java.
			Mỗi nền tảng/hệ điều hành khác nhau (Windows, IOS, Linux…) lại có một loại JVM khác nhau. Hiểu nôm na thì các chương trình Java của các bạn chạy trên JVM. Nói Java đa nền tảng, thực chất thì nó được hỗ trợ JVM trên nhiều nền tảng. Chương trình Java chạy được trên Window/Linux/IOS vì nó có JVM chạy được trên các nền tảng đó.
		JVM là thành phần nền tảng Java thực thi các chương trình của bạn.
		JDK cho phép bạn tạo các chương trình Java có thể được thực thi và chạy bởi JVM và JRE.
3. Kiểu dữ liệu (1 ngày)  
	- Primitive  (Nguyên thuỷ)
		- byte, short , int , long, float, double, char, boolean
	- Non-primitive  (Không nguyên thuỷ)
		- Class, Interface, Array, String
	- Wrapper class ( lớp wrapper) cho kiểu dữ liệu primitive. AutoBoxing and AutoUnboxing  
		- Java cung cấp các lớp bao bọc (wrapper classes) cho các kiểu dữ liệu primitive, cho phép chúng trở thành đối tượng. 
		- - **AutoBoxing**: Tự động chuyển đổi từ kiểu primitive sang wrapper class. Ví dụ:
		    ```
		    int num = 10;
		    Integer wrappedNum = num; // AutoBoxing
		    ```
		    
		- **AutoUnboxing**: Tự động chuyển đổi từ wrapper class về kiểu primitive. Ví dụ:
		    ```
		    Integer wrappedNum = 10;
		    int num = wrappedNum; // AutoUnboxing
		    ```
	- Kích thước và khoảng giá trị của các kiểu dữ liệu primitive  
	- Double vs BigDecimal  
		 - **Double**: Là kiểu dữ liệu số thực với độ chính xác giới hạn (khoảng 15 chữ số thập phân). Dùng cho các phép toán nhanh nhưng có thể gặp vấn đề về độ chính xác trong các phép toán tài chính.
    
		- **BigDecimal**: Là lớp giúp xử lý các phép toán số học với độ chính xác cao. Phù hợp cho các ứng dụng yêu cầu tính toán chính xác, như tài chính. Ví dụ:
		    ```
		    BigDecimal bd1 = new BigDecimal("0.1");
		    BigDecimal bd2 = new BigDecimal("0.2");
		    BigDecimal result = bd1.add(bd2); // Kết quả chính xác
		    ```

4. Biến (2 ngày)  
	- Khai báo và gán giá trị cho biến  
	- Toán tử  
	- Các cách so sánh 2 biến  
	- Type Casting  
5. Memory (2 ngày)  
	- Vùng nhớ Heap và Stack  
	- String Pool  
6. Câu lệnh điều kiện (1 ngày)  
	- If...else if...else  
	- Switch Case  
7. Vòng lặp (1 ngày)  
	- while, do...while  
	- for  
8. Arrays (1 ngày)  
	- Mảng 1 chiều  
	- Mảng 2 chiều  
	- Lặp qua 1 mảng  
9. Methods (3 ngày)  
	- Sự khác nhau khi truyền giá trị Primitive vs Object  
	- Method Overloading  
	- Variable Argument  
	- Method signature  
10.  Class (7 ngày)  
	- class Attributes: có vai trò giống như biến của class
        - Truy cập qua dấu **.**
	- Class Methods: gồm 2 phương thức **static** hoặc **public**
		- **static**: có thể truy cập mà không cần tạo đối tượng của lớp
		- **public**: chỉ có thể truy cập qua các **objects**
        	```
     			 public class Main {
        			int x;
        			public static void main(String[] args) {
    					Main myObj = new Main();
        				myObj.x = 40;
    					System.out.println(myObj.x);
    				}
     			}
     		```
    	- Constructors: Là 1 hàm (phương thức) đặc biệt được dùng để khởi tạo đối tượng. Nó được gọi khi 1 đối tượng của một lớp được tạo và có thể sử dụng để set giá trị khởi tạo cho các thuộc tính của đối tượng. Tên constructor phải trùng với tên class, **không** có return type
          ```
              public class Main {
                  int x;  // Create a class attribute
                // Create a class constructor for the Main class
                public Main() {
                    x = 5;  // Set the initial value for the class attribute x
                }
           }
           ```
        - Classes vs Objects
            + **Class**: là mẫu cho các đối tượng (vỏ ngoài)
            + **Object**: Đối tượng là thể hiện của một lớp
            + Khi các đối tượng được tạo, nó sẽ thừa kế tất cả các biến và phương thức từ lớp tương ứng
   
        - Package: dùng để nhóm các class liên quan. Có vai trò giống folder. => Tránh xung đột name, dễ bảo trì code.
               - Package gồm 2 loại chính: 
                   + Built-in Packages: API Java: https://docs.oracle.com/javase/8/docs/api/
                   + User-defined Packages
                   + Để import toàn bộ package, ở cuối thêm dấu **"*"**
                           ```
                       import java.util.*;
                           ```
        - Access Modifier:
            - Classes: 
              + **Public**: có thể kết nối qua bất cứ lớp nào
              + **default**: chỉ có thể kết nối với những class ở trong cùng package
   
            - Attributes, method, constructors:
              + **public**: tất cả các lớp
              + **private**: chỉ có thể kết nối với các lớp đã được khai báo
              + **default**: kết nối với các lớp trong cùng package
              + **protected**: có thể kết nối trong cùng 1 package và các lớp con
   
        - Static members, Static blocks: có thể kết nối mà không cần tạo object của class.
        - Final members: nếu không muốn tồn tại khả năng ghi đè thì khai báo thuộc tính của class duới dạng final:
                  ```
                      public class Main {
                          final int x = 10;
                          final double PI = 3.14;

                    public static void main(String[] args) {
                        Main myObj = new Main();
                        myObj.x = 50; // will generate an error: cannot assign a value to a final variable
                        myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
                        System.out.println(myObj.x);
                        }
                    }
                  ```
        - Đóng gói (Encapsulation): giấu những data **nhạy cảm** từ users
               - Khai báo biến/thuộc tính dưới dạng **private**
               - Các biến từ lớp khác vẫn có thể truy cập được nếu cung cấp phương thức **get** và **set**
                   + **get** trả về giá trị của biến
                    + **set** đặt giá trị cho biến
                   + Cách đặt tên phương thức: bắt đầu bằng **get**/**set** + tên biến (camelName)
               -Tại sao cần sử dụng đóng gói:
                + Kiểm soát thuộc tính và phương thức tốt hơn
                   + Các thuộc tính trở thành read-only (get), write-only (set)
                      + Có thể thay đổi 1 phần của code mà không ảnh hưởng đến phần khác
                   + Tăng cường tính bảo mật
                ```
                     public class Person {
                     private String name;
   
                   //Getter
                   public String getName(){
                       return name;
                   }
   
                   //Setter
                   public void setName (String newName){
                       this.name = newName; // "this" dùng để chỉ đối tượng hiện tại
                   }
                   }
                ```

        - Kế thừa (Inheritance): 1 lớp có thể kế thừa các phương thức/thuộc tính của các lớp khác
               - 2 loại: 
                   + **subclass** (child)
                    + **superclass** (parent)
               - Để thừa kế từ 1 class, dùng keyword **extends**
            - Tác dụng: dễ tái sử dụng (set **protected**). Nếu set private thì sẽ không truy cập được.

        - Constructors trong kế thừa:
               - Khi một lớp con được tạo ra, trước tiên constructor của lớp cha sẽ được gọi
               - Nếu constructor của lớp cha không có tham số (mặc định), Java sẽ tự động gọi constructor đó khi lớp con được tạo
               - Nếu lớp cha không có constructor mặc định mà chỉ có constructor có tham số th phải gọi constructor đó 1 cách tường minh từ constructor của lớp con bằng sử dụng **super**
     
        - Đa hình (Polymorphism): mang nghĩa "nhiều dạng", xảy ra khi có nhiều lớp liên quan với nhau qua kế thừa

        - this vs super:
          + **super**: dùng để kết nối với những phương thức của lớp cha
            + Không thể sử dụng để định danh
            + Gọi method/constructor của super-class
            + Mục đích chính là gọi các biến/phương thức/constructor của lớp cha
     
          + **this**: kết nối với những phương thức của lớp hiện tại, và sử dụng trong những trường hợp:
            + Tham chiếu biến thể hiện của lớp hiện tại
            + Gọi/khởi tạo hàm tạo của lớp hiện tại
            + Có thể được chuyển làm đối số khi gọi method/constructor
            + Trả về thể hiện của lớp hiện tại
     
        - Method Overloading và Overriding 
     		+ **Method Overloading (nạp chồng phương thức)**: tạo ra nhiều phương thức trong cùng 1 lớp, cùng tên nhưng khác nhau về số lượng hay kiểu tham số.
             + Cung cấp khả năng thực hiện cùng 1 hành động nhưng với kiểu dữ liệu đầu vào khác nhau
             + Cách thực hiện: các phương thức phải có cùng tên, nhưng tham số phải khác nhau.
     		+ **Method Overriding (ghi đè phương thức)**: 1 phương thức của lớp con có cùng chữ ký (tên, dsach tham số) trong lớp cha.
             + Cho phép lớp con cung cấp 1 cách triển khai cụ thể của phương thức đã được khai báo trong lớp cha
             + Lớp con định nghĩa lại phương thức của lớp cha, nếu muốn thì có thể thay đổi nội dung của phương thức.
             
        - Dynamic method dispatch (Polymorphism): xảy ra khi một phương thức được ghi đè trong lớp con được gọi thông qua tham chiếu lớp cha (superclass reference). Phương thức nào được gọi sẽ dựa trên đối tượng thực sự mà tham chiếu trỏ đến tại thời gian chạy
     		+ Khi một phương thức bị ghi đè, quyết định sử dụng phương thức nào (từ lớp cha hay lớp con) sẽ phụ thuộc vào đối tượng thực sự mà tham chiếu đang trỏ tới tại runtime.
          	+ Khi sử dụng Dynamic Method Dispatch, bạn có thể tạo một tham chiếu của lớp cha để tham chiếu tới đối tượng của lớp con. Khi gọi phương thức bị ghi đè, phương thức trong lớp con sẽ được thực thi (nếu lớp con đã ghi đè phương thức đó).
        	+ Chỉ có **phương thức** mới tham gia và Dynamic Method Dispatch, còn **thuộc tính** thì **không**. Giá trị của thuộc tính phụ thuộc vào kiểu của tham chiếu, chứ không phải đối tượng tại runtime.
          
        - Cơ chế Upcasting và Downcasting
     		+ Upcasting: quá trình chuyển đổi (cast) một đối tượng của l con (subclass) thành đối tượng của lớp cha (superclass)
             + Mục đích: tận dụng tính đa hình và tránh việc phải biết chính xác lớp con của đối tượng.
             + Cơ chế: an toàn + tự động. Không cần sử dụng từ khoá "cast", java tự thực hiện.
          
     		+ Downcasting: quá trình chuyển đổi 1 đối tượng của lớp cha về lớp con. Không an toàn và phải được thực hiện thủ công.
             + Mục đích: sử dụng khi muốn truy cập các phương thức và thuộc tính cụ thể của lớp con từ một tham chiếu của lớp cha.
             + Cơ chế: không tự động, có thể gây lỗi ClassCastException tại runtime nếu đối tượng không phải là một thể hiện của lớp con.
     
        - Inner class: Lồng 1 class trong 1 class khác => nhóm các lớp thuộc về nhau => mã dễ đọc, dễ bảo trì
     		+ Để truy cập lớp bên trong, tạo 1 đối tượng của lớp ngoài, sau đó tạo 1 đối tượng của lớp bên trong.
        	+ Nếu inner class là private thì lớp bên ngoài không truy cập được
          
        - Abstract class: là lớp hạn chế, không thể dùng để tạo đối tượng (để truy cập, nó phải được thừa kế từ một lớp khác) 
          + Một lớp trừu tượng có thể có cả phương thức trừu tượng và phương thức thông thường:
                   `abstract class Animal {
                   public abstract void animalSound();
                   public void sleep() {
                       System.out.println("ZZZ")	
                }
                }`
          + Abstract method: chỉ có thể sử dụng trong lớp trừu tượng, và không có body. Body được cung cấp bởi subclass (thừa kế) 
          + Lợi ích của việc sử dụng abstract class/method:
          	+ Tăng tính bảo mật -> ẩn các chi tiết nhất định và chỉ hiển th những nội dung quan trọng
          
        - Interface: một cách khác để trừu tượng hoá dữ liệu trong Java
     		+ Interface là 1 **completely abstract class** dùng để nhóm các phương thức liên quan với phần body **rỗng**
          		`interface Animal {
          			public void animalSound(); //interface method
          			public void run(); // interface method
          		`
        	+ Để kêt nối đến các phương thức interface, interface phải được **implemented** (tương tự thừa kế) bởi 1 lớp khác với keyword **implement**
          	+ Giống lớp trừu tượng, interfaces không dùng để tạo objects
            + Interface method không có body, body của nó sẽ được cung cấp bởi "implement" class
            + Trên implementation của 1 interface, phải ghi đè (override toàn bộ phương thức của nó)
            + Các thuộc tính mặc định của interface là **public**, **static** và **final**
            + 1 interface không thể chứa hàm tao (constructor) vì nó không thể tạo objects
            + Java không hỗ trợ đa kế thừa (multiple inheritance) - tức là 1 class chỉ có thể thừa kế từ 1 superclass. 
          		-> Có thể làm được với interfaces, vì 1 class có thể implement nhiều interfaces!
          		`class DemoClass implements FirstInterface, SecondInterface {}`
     
        - Anonymous Class: là một loại lớp không có tên (ẩn danh), được sử dụng để khai báo và khởi tạo một lớp ngay tại chỗ trong một biểu thức. Anonymous Class thường được sử dụng khi bạn cần triển khai một interface hoặc một class mà chỉ được sử dụng một lần, giúp cho code ngắn gọn và dễ đọc hơn.
     		+ Một vài đặc điểm chính
           		+ Không có tên: không cần định nghĩa tên lớp khi dùng anonymous class
             	+ Được sử dụng 1 lần: thường được khai báo và sử dụng ngay trong phương thức hoặc khối lệnh, không cần tái sử dụng
             	+ Dùng để triển khai interface hoặc class abstract
              	+ Anonymous Class giúp triển khai một lớp con ngay trong biểu thức mà không cần phải tạo ra một lớp cụ thể.
      
        - Singelton Class: là 1 mẫu thiết kế (design pattern) -> đảm bảo chỉ có 1 đối tượng duy nhất trong lớp đó được tạo ra trong suốt vòng đời của ứng dụng
          + Đặc điểm:
            + Chỉ có 1 đối tượng duy nhất
            + Toàn cục (global access): cung cấp quyền truy cập đến đối tượng này từ mọi nơi trong chương trình
          + Cách triển khai:
            + Sử dụng 1 biến static để lưu trữ instance duy nhất
            + Tạo 1 constructor private để ngăn việc tạo đối tượng từ bên ngoài
            + Cung cấp 1 phương thức static để truy cập instance duy nhất này
     
        - Enum: viết tắt của Enumerations - sự liệt kê: là 1 class đặc biệt đại diện cho 1 nhóm các hằng số (giống biến **final**)
     		+ Enum có thể giống như 1 class, có thuộc tính và phương thức. Khác biệt duy nhất là hằng số enum là **public**, **static** và **final**
        	+ Enum không thể dùng để tạo object và extends đến lớp khác, nhưng nó có thể implement interface
            + Lợi ích: Thích hợp khi có những giá trị không thay đổi như ngày tháng năm, màu sắc...
11. Exception Handling (3 ngày)  
	- Error vs Exception  
	- Checked Exception and Unchecked Exception  
	- try...catch...finally  
	- throw vs throws  
	- try with resources  
12. Multithreading (7 ngày)  
	- Thread class  
	- Runnable interface  
	- Thread lifecycle  
	- Thread priority  
	- Các method trong Thread class  
	- Thread safe  
	- Thread synchronization  
	- Inter-Thread Communication  
	- Deadlock  
	- Thread pool  
	- Executors  
13. Annotations (3 ngày)  
	- Annotations là gì  
	- Built-in annotations  
	- Custom annotations  
	- 14.Lambda Expressions (2 ngày)  
	- Lambda Expressions là gì  
	- Variables scope và Capturing Variables  
	- Method Reference  
14. Java IO Streams (5 ngày)  
	- InputStream, OutputStream  
	- Reader, Writer  
	- FileInputStream vs FileReader  
	- FileOuputStream vs FileWriter  
	- BufferedInputStream vs BufferedReader  
	- BufferedOutputStream vs BufferedWriter  
	- InputStreamReader  
	- File handling: Create, Read, Write, Delete  
	- Serialization  
	- DataInputStream, DataOutputStream  
	- ObjectInputStream, ObjectOutputStream  
	- PipedInputStream, PipedOutputStream  
15. Generics (4 ngày)
	- Generics là gì  
	- Generic Class  
	- Multiple parameter  
	- Subtypes  
	- Bounded types  
	- Generic Method  
	- WildCard  
	- Lower Bound  
	- Upper Bound  
16. Collection (4 ngày)  
	- List: ArrayList, LinkedList, Vector, Stack  
	- Map: HashMap, LinkedHashMap, HashTable, TreeMap  
	- Queue: PriorityQueue, ArrayQueue  
	- Set: HashSet, LinkedHashSet, TreeSet  
	- Iterator  
	- Comparable  
	- Comparator  
	- StringTokenizer  
	- Properties  
17. Date and Time (3 ngày)  
	- Date class  
	- LocalDate, LocalTime, LocalDateTime  
	- TimeZone, ZonedDateTime  
	- Period, Duration  
	- Date Formatter  
18. Networking (4 ngày)  
	- URL  
	- URLConnection  
	- InetAddress  
	- Socket  
	- ServerSocket  
	- DatagramSocket  
	- DatagramPacket  
	- MulticastSocket  
19. JDBC (7 ngày)  
	- JDBC là gì  
	- Kết nối db và thực thi query:  
	- DriverManager, Driver, Connection, Statement, ResultSet  
	- Connection pool  
	- DataSource  
	- PreparedStatement  
	- CallableStatement  
	- Transactions  
	- Savepoint  
	- Batch Processing  
20. Bonus (5 ngày)  
	- String vs String Buffer vs String Builder  
	- java.util.Date vs java.sql.Date
	- Dependency Injection  
	- JavaBeans
