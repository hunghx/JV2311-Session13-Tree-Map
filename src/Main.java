import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println();


        // HashMap - Key -Value
        // key map khong trung lap
        // co the luu tru key null
        Map<String,String> hashMap = new HashMap<>();
        // them moi phan tu vao map
        hashMap.put(null,"Nguyen Van D");
        hashMap.put("0989547655","Nguyen Van A");
        hashMap.put("0957954755","Nguyen Van C");
        hashMap.put("0985442625","Nguyen Van B");
        System.out.println(hashMap);
        // thay doi gia tri cua 1 phan tu
        hashMap.put("0989547655","Nguyen Thi E");
        System.out.println(hashMap);
        // xoa 1 cap key value
        hashMap.remove(null);
        System.out.println(hashMap);
        // lay ra phan tu thong qua key
        System.out.println(hashMap.get("0989547655"));

        // moi cap KEY-VALUE => ENTRY
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        for (Map.Entry<String,String> entry : entrySet){
            System.out.println("Key - "+entry.getKey());
            System.out.println("Value - "+entry.getValue());
        }
        // kiem tra ton tai
        System.out.println(hashMap.containsKey("0989547655"));
        System.out.println(hashMap.containsValue("Nguyen Van B"));

        // LinkedHashMap
        Map<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(null,"Nguyen Van D");
        linkedHashMap.put("0989547655","Nguyen Van A");
        linkedHashMap.put("0957954755","Nguyen Van C");
        linkedHashMap.put("0985442625","Nguyen Van B");
        System.out.println(linkedHashMap);

        // TreeMap : cac Key phai cos the sap xep duoc
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10,"A");
        treeMap.put(5,"B");
        treeMap.put(9,"C");
        treeMap.put(-1,"D");
        System.out.println(treeMap);
        // TreeMap : tim kiem trong cay nhi phan
        System.out.println(treeMap.ceilingEntry(7));


    }


}
