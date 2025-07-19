public class IntegerSetTest {
    public static void main(String[] args) {
        System.out.println("--- Starting CharSet Manual Tests ---");
        int passed = 0;
        int failed = 0;
        
        
        // Test 1: การสร้าง, เพิ่มข้อมูล, และการเรียงลำดับ
        System.out.println("\n--- Testing add() and sorting ---");
        IntegerSet a = new IntegerSet();
        a.add(50);
        a.add(40);
        a.add(60);
        String s = "[40, 50, 60]";
        if (a.toString().equals(s)){
            System.out.println("Passed: Add and sort works correctly.");
            passed++;
        } else{
            System.out.println("Failed"+a.toString());
            failed++;
        }

        // Test 2: การเพิ่มข้อมูลที่ซ้ำซ้อน
        System.out.println("\n--- Testing adding duplicates ---");
        a.add(40);
        if (a.size()==3) {
            System.out.println("Passed: Adding a duplicate does not change the size.");
            passed++;
        } else {
            System.out.println("Failed: Size should be 3 but got " + a.size());
            failed++;
        }


        // Test 3: การลบตัวเลข
        System.out.println("\n--- Testing remove() ---"); 
        a.remove(60); 
        String s2 = "[40, 50]";
        if (a.toString().equals(s2)){
            System.out.println("Passed: Remove works correctly.");
            passed++;
        } else{
            System.out.println("Failed"+a.toString());
            failed++;
        }
        
        // Test 4: การตรวจสอบตัวเลข
        System.out.println("\n--- Testing contains() ---");
        
        if (a.contains(40)&&!a.contains(60)){
            System.out.println("Passed: Contains works correctly after removal.");
            passed++;
        } else{
            System.out.println("Failed"+a.toString());
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
