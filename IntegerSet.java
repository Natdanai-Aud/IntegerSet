import java.util.ArrayList;

/** ADT ที่เก็บตัวเลข แบบไม่ซ้ำกันและเรียงลำดับ
 */

public class IntegerSet {
    ArrayList<Integer>Numbers; //Rep
    //AF เซตของตัวเลขทั้งหมดอยู่ใน Numbers
    //RI ที่เก็บเลขจำนวนเต็มใดๆ เรียงจากน้อยไปมาก และห้ามมี null หรือตัวเลขซ้ำ

    /**
     * Constructor เริ่มต้นสร้าง Arraylist เก็บตัวเลข
     */
    public IntegerSet(){
        Numbers = new ArrayList<>();
        CheckRep();
    }
    /**
     * ตรวจสอบว่า Rep Invariant เป็นจริงหรือไม่
     */
    private void CheckRep() {
        if(Numbers == null)
            throw new RuntimeException("Numbers is null");
        if(Numbers.size()>1){
            for (int i = 0; i < Numbers.size() - 1 ; i++) {
                if (Numbers.get(i)>=Numbers.get(i+1)) {
                    throw new RuntimeException("error sort");
                }
            }
        }
    }
    /**
     * @param x ตัวเลขที่ต้องการเพิ่ม
     */
    public void add(Integer x){
        
        if (!Numbers.contains(x) && Numbers != null && x != null) {
            if (Numbers.size()==0) {
                Numbers.add(x);
            }else{
                if (x < Numbers.get(0)) { //add ด้านหน้า
                    Numbers.add(0,x);
                }else{
                    for (int i = 0; i < Numbers.size(); i++) {
                        if (i==Numbers.size()-1) { //add หลังสุด
                            Numbers.add(x);
                            break;
                        }
                        if (Numbers.get(i) <x && x<Numbers.get(i+1)) { //add ตรงกลาง
                            Numbers.add(i+1,x);
                            break;
                        }
                    }
                }
            }
        }
        CheckRep();
    }
    /**
     * @param x ตัวเลขที่ต้องการลบ
     */
    public void remove(Integer x){
        if (x == null) 
            return;
            Numbers.remove(x);
            CheckRep();
        
    }
    /**
     * @param x ตัวเลขที่ต้องการตรวจสอบ
     * @return true หากมี x อยู่ในเซต, false หากไม่มี
     */
    public boolean contains(Integer x) {
        return Numbers.contains(x);
    }
    
    /**
     * คืนค่าขนาดของเซต
     * @return จำนวนสมาชิกในเซต
     */
    public int size() {
        return Numbers.size();
    }

    /**
     * @return ส่งค่าจากตัวเลขเป็นchar  เพื่อเช็คข้อความ
     */
    public String toString(){
        return Numbers.toString();
    }
}
