 import java.util.Scanner;
 import java.util.ArrayList;
 
/**
 *
 * @author 26218
 * 
 */
public class Hapuskata {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.clear();
        list.add(0, "Saya");
        list.add(1, "sedang");
        list.add(2, "belajar");
        list.add(3, "struktur");
        list.add(4, "data");
        System.out.println("Data list :"+list);
        Scanner scan=new Scanner(System.in);
        System.out.println("Masukan index yang akan dihapus :");
        int index=scan.nextInt();
        list.remove(index);
        System.out.println("hasil setelah dihapus : " +list);
    }
    
}