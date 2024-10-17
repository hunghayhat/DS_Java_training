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
	- Error vs Exception: đều là throwable object, nhưng chúng đại diện cho các loại vấn đề khác nhau có tể xảy ra trong quá trình thực thi chương trình.
    	- Đều là lớp con của  `**java.lang.Throwable**`
    	- **Error**: do các vấn đề nghiêm trọng ngoài tầm kiểm soát của chương trình (hết bộ nhớ, hệ thống sập...), được biểu diễn bằng Error class và các lớp con của nó
      		+ Gồm 3 loại : **thời gian biên dịch**, **thời gian chạy**, **hợp lý**
        	+ Một số error phổ biến
      			+ **OutOfMemoryError**: Xảy ra khi Máy ảo Java (JVM) hết bộ nhớ.
        		+ **StackOverflowError**: Xảy ra khi ngăn xếp cuộc gọi tràn do có quá nhiều lệnh gọi phương thức.
            	+ **NoClassDefFoundError**: Xảy ra khi không tìm thấy lớp bắt buộc.
          
        - **Exception**: dùng để sử lý các lỗi có thể phục hồi từ bên trong chương trình, được biểu diễn bằng Exception class và các lớp con của nó.
      		+ **NullPointerException** : Xảy ra khi truy cập tham chiếu null.
        	+ **IllegalArgumentException**: Xảy ra khi một đối số không hợp lệ được truyền vào một phương thức.
            + **IOException**: Xảy ra khi thao tác I/O không thành công.
	- Checked Exception and Unchecked Exception:
    	- Checked Exception: sẽ được check tại thời điểm complile. Nếu 1 đoan code với 1 phương thức ném ra checked exception, phương thức sẽ phải xử lý exception hoặc phải chỉ định exception sử dụng **throws**
        	+ Partially Checked Exception: sẽ có 1 vài lớp con của nó không được check (**Exception**,...)
            + Fully Checked Exception: tất cả các lớp con cũng được kiểm tra:
          		+ **IOException**: Ngoại lệ liên quan đến file input / output
            	+ **SQLException**: Ngoại lệ liên quan đến cú pháp SQL
                + **DataAccessException**: Ngoại lệ liên quan đến việc truy cập CSDL
                + **ClassNotFoundException**: Bị ném khi JVM không thể tìm thấy một lớp mà nó cần, do lỗi dòng lệnh, sự cố đường dẫn hoặc tệp, class bị thiếu...
                + **InstantiationException**: Ngoại lệ khi cố gắng tạo đối tượng của một abstract class hoặc interface
          
		- Unchecked Exception: là các ngoại lệ thời gian chạy không cần phải bắt hoặc khai báo trong mệnh đề throws. Các ngoại lệ này thường do lỗi lập trình gây ra, chẳng hạn như cố gắng truy cập vào một chỉ mục nằm ngoài giới hạn trong một mảng hoặc cố gắng chia cho số không.
      		+ Bao gồm tất cả các lớp con của lớp RuntimeException cũng như Error và các lớp con của nó.
        	+ Ví dụ về unchecked exception trong Java:
          		+ **ArrayIndexOutOfBoundsException**: Ngoại lệ này được đưa ra khi bạn cố truy cập vào một chỉ mục mảng nằm ngoài giới hạn.
            	+ **NullPointerException**: Ngoại lệ này được đưa ra khi bạn cố truy cập vào một tham chiếu đối tượng null.
                + **ArithmeticException**: Ngoại lệ này được đưa ra khi bạn cố chia cho 0 hoặc thực hiện một phép tính số học không hợp lệ.
    			+ **NumberFormatException**: Ngoại lệ bị ném khi một phương thức chuyển đổi một Chuỗi thành số nhưng không thể chuyển đổi.
                + **IllegalStateException**: Ngoại lệ bị ném ra khi trạng thái của môi trường không phù hợp với hoạt động cố gắng thực hiện, ví dụ: Sử dụng Scanner đã bị đóng.
              
	- try...catch...finally: Quá trình xử lý exception được gọi là catch exception (bắt ngoại lệ), nếu Runtime System không xử lý được ngoại lệ thì chương trình sẽ kết thúc.
    	- Try: sử dụng để chứa 1 đoạn code thực thi mà có thể trong quá trình thực thi sẽ xảy ra ngoại lệ.
      		+ Sau 1 khối lệnh **try** => phải khai báo **catch** hoặc **finally** hoặc cả 2.
        
		- Catch: sử dụng để xử lý nếu xảy ra exception, nếu không thì nó bị bỏ qua.
      		+ Catch phải được sử dụng ngay sau try, có thể sử dụng nhiều khối **catch** nhưng chỉ được từ 1 khối **try** duy nhất.
        - Finally: khối code luôn được thực hiện khi khai báo.
    - throw vs throws: cũng là 1 cách dùng kết hợp try/catch để xử lý exception
        - **throw**: từ khoá **throw** trong java được sử dụng để ném 1 checked/unchecked exception
      		- Luồng chạy của chương trình sẽ bị dừng ngay khi throw được gọi. Chương trình sẽ tiến hnh tìm khối **try-catch** gần nhất để xử lý exception. Nếu không tìm thấy, chương trình sẽ tim khối **try-catch** cao hơn cho đến khi tìm được khối nào thì trình xử lý sẽ mặc định tạm ngưng chương trình.
                + Nằm bên trong hàm
                + Dùng để trả về 1 exception xác định
                + Nếu là checked exception thì cần đi chung với throws, unchecked exception thì không cần
                + Theo sau throw là duy nhất 1 trường hợp/ thực thể (instance) ngoại lệ.
      	- **throws**: không giải quyết được ngoại lệ, chỉ "kêu lên": "ê, chỗ này đang có ngoại lệ" => để việc xử lý cho thằng khác làm :D
          		+ Nằm ngay sau phần khai báo tên hàm/ phương thức
          		+ Dùng để thông báo sự tồn tại của exception
          		+ Nếu là checked exception thì không cần đi chung với throws
          		+ Nếu là unchecked exception thì không cần throws
          		+ Theo sau throws có thể là 1 hoặc nhiều class.
	- try with resources: là 1 cấu trúc trong Java, giúp tự động đóng các tài nguyên (file, socket hay DB connections) sau khi sử dụng => ngăn ngừa rò rỉ tài nguyên
    
	`try (FileReader fileReader = new FileReader("example.txt")) {
	// Đọc file hoặc xử lý với fileReader
	} catch (IOException e) {
	// Xử lý lỗi nếu không thể đọc file
	}`
	
12. Multithreading (7 ngày)  
	- Định nghĩa: thread (luồng) là 1 tiến trình con (sub-process). Một đơn vị xử lý nhỏ nhất của máy tính có thể thực hiện 1 công việc riêng biệt. Trong java, các luồng được quản lý bởi JVM.
    	+ Multi-thread: là 1 tiến trình thực hiện nhiều luồng đồng thời. (Vd: trình duyệt web, nghe nhạc...)
        + Multi-tasking: khả năng chạy đồng thời 1/nhiều chương trình cùng 1 lúc trên 1 hệ điều hành.
        + Có 2 cách để đạt được đa nhiệm:
      		+ Đa nhiệm dựa trên process và multiprocessing (mỗi tiến trình dùng 1 vùng bộ nhớ)
        	+ Đa nhiệm dựa trên luồng và đa lồng (các luồng chia sẻ không gian địa chỉ ô nhớ giống nhau)
        + Ưu điểm của đa luồng:
      		+ Không chặn người dùng sử dụng vì luồng là độc lập => xử lý nhiều công việc 1 lúc
        	+ Mỗi luồng có thể dùng chung và chia sẻ tài nguyên trong quá trình chạy, nhưng cũng có thể thực hiện độc lập
            + Không ảnh hưởng đến luồng khác nếu xảy ra ngoại lệ
            + Có thể thực hiện nhiều hoạt động với nhau để tiết kiệm tgian.
        + Nhược điểm cua đa luồng:
      		+ Càng nhiều luồng thì càng phức tạp
        	+ Xử lý vấn đề tranh chấp bộ nhớ, đồng bộ dữ liệu sẽ phức tạp
            + Cần phát hiện tránh các luồng chết (dead lock), luồng chạy mà không làm gì
	- Thread class: 1 cách để tạo thread => extend **Thread** class rồi override phương thức **run()** của nó
	  `public class Main extends Thread {
          public void run() {
                System.out.println("This code is running in a thread");
          }
      }`
	- Runnable interface: 1 cách khác để tạo thread là implement **Runnable** interface:
    	`public class Main implements Runnalble {
    		public void run() {
    			System.out.println("This code is running a thread");
    		}
    	}`
	- Thread lifecycle:
    	- Vòng đời của thread trong Java được kiểm soát bởi JVM. Java định nghĩa các trạng thái của luồng trong các thuộc tính static của lớp Thread.State:
      		+ **NEW**: luồng vừa được khởi tạo của lớp Thread nhưng chưa được start() =>> được tạo ra nhưng chưa được cấp phát tài nguyên. Nếu gọi các phương thức ép buộc như stop, resume, suspend,... thì sẽ xảy ra ngoại lệ **IllegalThreadException**
        	+ **RUNNABLE**: Sau khi gọi phương thức start() thì luồng test đã được cấp phát tài nguyên và các lịch điều phối CPU cho luồng test cũng bắt đầu có hiệu lực. Ở đây, chúng ta dùng trạng thái là Runnable chứ không phải Running, vì luồng không thực sự luôn chạy mà tùy vào hệ thống mà có sự điều phối CPU khác nhau.
            + **WAITING**: Thread chờ không giới hạn cho đến khi một luồng khác đánh thức nó.
            + **TIMED_WAITING**: Thread chờ trong một thời gian nhất định, hoặc là có một luồng khác đánh thức nó.
            + **BLOCKED**: Đây là 1 dạng của trạng thái “Not Runnable”, là trạng thái khi Thread vẫn còn sống, nhưng hiện tại không được chọn để chạy. Thread chờ một monitor để unlock một đối tượng mà nó cần.
            + **TERMINATED**: Một thread ở trong trạng thái terminated hoặc dead khi phương thức run() của nó bị thoát.
	- Thread priority: mỗi luồng có 1 độ ưu tiên, được biểu thị bằng các số từ 1-10
    	- Mức ưu tiên mặc định: 5 (public static int NORM_PRIORITY)
      	- Mức ưu tiên min: 1 (public static int MIN_PRIORITY)
        - Mức ưu tiên max: (public static int MAX_PRIORITY)
        - Chúng ta sẽ sử dụng phương thức currentThread() để lấy tên của luồng hiện tại. Người dùng cũng có thể sử dụng phương thức setName() nếu muốn đặt tên luồng theo ý muốn để dễ hiểu.
		  Phương thức getName() sẽ được sử dụng để lấy tên của luồng.
        - **public final int getPriority()**: phương thức **java.lang.Thread.getPriority()** trả về mức độ ưu tiên của luồng đã cho
        - public final void setPriority(int newPriority): phương thức java.lang.Thread.setPriority() thay đổi mức độ ưu tiên của luồng thành giá trị newPriority. Phương thức này ném IllegalArgumentException nếu giá trị của tham số newPriority vượt quá giới hạn minimum(1) và maximum(10).
	- Các method trong Thread class:
    	+ **suspend()**: Phương thức này tạm dừng hoạt động của một luồng bằng cách ngưng cung cấp CPU cho luồng đó. Luồng vẫn tồn tại và có thể được khởi động lại bằng phương thức resume(). Chú ý rằng việc sử dụng suspend() không nên được khuyến nghị vì nó có thể dẫn đến các vấn đề như deadlock.
        + **resume()**: Phương thức này sử dụng để tiếp tục hoạt động của một luồng sau khi nó đã bị tạm dừng bằng suspend()
        + **stop()**: Phương thức này dùng để kết thúc một luồng bằng cách ném ra ngoại lệ ThreadDeath. Tuy nhiên, việc sử dụng stop() không được khuyến nghị, vì nó có thể gây ra các vấn đề như sảy ra deadlock và không giải phóng tài nguyên một cách đúng đắn.
        + **destroy()**: dùng để đột ngột dừng luồng. Tương tự **stop()**, sử dụng destroy() không được khuyến nghị.
        + **isAlive()**: kiểm tra xem 1 luồng còn sống (active) hay không. Nó trả về true nếu luồng đã được khởi động bằng start() và vẫn còn hoạt động, ngược lại trả về false.
        + **yield()**: dùng để nhường CPU cho các luồng khác trong hàng đợi Ready. Nó ngừng cấp CPU trong lần nhận CPU đó và cho phép các luồng khác được chạy.
          + Một số phương thức khác:
          	+ **sleep()**: Sử dụng để ngừng luồng trong một khoảng thời gian nhất định.
          	+ **join()**: Sử dụng để đợi một luồng khác hoàn thành trước khi luồng hiện tại tiếp tục thực thi.
          	+ **getName()**: Trả về tên của luồng.
          	+ **setName()**: Thay đổi tên của luồng.
          	+ **getId()**: Trả về ID của luồng.
          	+ **getState()**: Trả về trạng thái của luồng.
          	+ **currentThread()**: Trả về tham chiếu của luồng đang được thi hành.
          	+ **getPriority()**: Trả về mức độ ưu tiên của luồng.
          	+ **setPriority()**: Thay đổi mức độ ưu tiên của luồng.
          	+ **isDaemon()**: Kiểm tra xem luồng có phải là luồng daemon hay không.
          	+ **setDaemon()**: Xác định xem luồng có phải là luồng daemon hay không.
          	+ **interrupt()**: Sử dụng để gián đoạn một luồng, thường dùng để kết thúc một luồng đang chạy.
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
