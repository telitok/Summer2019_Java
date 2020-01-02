package day61_ExcelReadWrite;

public class TestExcelReadWrite {
	
    public static void main(String[] args) {
		String path = "/Users/tugbaelitok/Desktop/TestData.xlsx";
		String sheetName = "Sheet1";
   	 ExcelReadWrite obj = new ExcelReadWrite(path,sheetName); // we create object with the only constructor in the class
   	 
   	 
   	 String data1 = obj.readData(1, 0);
   	 
   	 System.out.println(data1);
   	 
   	 obj.writeData(1, 0, "Mehmet");
   	 
   	 System.out.println(obj.readData(1, 0));   // prints Mehmet
   	 // Or we can assign it to a variable and call it
   	 String data2 = obj.readData(1, 0);
   	 System.out.println(data2);
   	 
	}

}
