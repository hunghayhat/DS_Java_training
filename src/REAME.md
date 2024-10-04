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
	- Constructors 
   		+ Là 1 hàm (phương thức) đặc biệt được dùng để khởi tạo đối tượng. Nó được gọi khi 1 đối tượng của một lớp được tạo và có thể sử dụng để set giá trị khởi tạo cho các thuộc tính của đối tượng
      	```
      			public class Main {
      				int x;  // Create a class attribute
        			// Create a class constructor for the Main class
        			public Main() {
        				x = 5;  // Set the initial value for the class attribute x
        			}
       	```
      		+ Tên constructor phải trùng với tên class, **không** có return type
	- Classes vs Objects
		- **Class**: là mẫu cho các đối tượng (vỏ ngoài)
		- **Object**: Đối tượng là thể hiện của một lớp
		- Khi các đối tượng được tạo, nó sẽ thừa kế tất cả các biến và phương thức từ lớp tương ứng
   
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
    - Đa hình (Polymorphism)
	- this vs super  
	- Method Overloading và Overriding  
	- Dynamic method dispatch (Polymorphism)  
	- Cơ chế Upcasting và Downcasting
	- Abstract class  
	- Interface  
	- Inheritance vs implement Interface  
	- Interface vs Abstract class  
	- Anonymous Class  
	- Singelton Class  
	- Enum  
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
