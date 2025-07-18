public class IntegerSetTest {
    public static void main(String[] args) {
        System.out.println("--- Starting CharSet Manual Tests ---");
        int passed = 0;
        int failed = 0;
        IntegerSet a = new IntegerSet();
        a.add(50);
        a.add(70);
        a.add(40);
        a.add(60);
        
        // Test 1: การสร้าง, เพิ่มข้อมูล, และการเรียงลำดับ
        System.out.println("\n--- Testing add() and sorting ---");
        String s = "[40, 50, 60, 70]";
        if (a.toString().equals(s)){
            System.out.println("Pass");
            passed++;
        } else{
            System.out.println("Fail"+a.toString());
            failed++;
        }

        // Test 2: การลบตัวเลข
        a.remove(60);
        System.out.println("\n--- Testing remove() ---");  
        String s2 = "[40, 50, 70]";
        if (a.toString().equals(s2)){
            System.out.println("Pass");
            passed++;
        } else{
            System.out.println("Fail"+a.toString());
            failed++;
        }
        
        // Test 3: การตรวจสอบตัวเลข
        System.out.println("\n--- Testing contains() ---");
        
        if (a.contains(40)&&!a.contains(40)){
            System.out.println("Pass");
            passed++;
        } else{
            System.out.println("Fail"+a.toString());
            failed++;
        }




        System.out.println("\n--------------------");
        System.out.println("--- Test Summary ---");
        System.out.println("Passed: " + passed + ", Failed: " + failed);
        if (failed == 0) {
            System.out.println("Excellent! All tests passed!");
        } else {
            System.out.println("Some tests failed.");
        }
    }
}
