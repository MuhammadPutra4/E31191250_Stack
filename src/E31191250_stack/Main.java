package e31191250_stack;

import java.util.Scanner;

/**
 *
 * @author ADI
 */
public class Main {

    public static void main(String[] args) {
        int pilihan;//variable pilihan bertipe integer
        int data;//variable data bertipe integer
        Stack result = new Stack();//pendeklarasian dengan memanggil nama dari kelas Stack
        do {//perulangan
            System.out.println("1.PUSH");//memilih menu push
            System.out.println("2.POP ITEM");//memilih item pop           
            System.out.println("3.LIHAT ISI DATA");//memilih item pilihan data
            System.out.println("4.KELUAR");//memilih item keluar
            Scanner input = new Scanner(System.in);
            pilihan = input.nextInt();//pilihan sama dengan input
            if (pilihan == 1) {//jika pilihan 1
                System.out.print("data yang ditambahkan :");//maka akan ditampilkan data yang ditambahkan adalah
                data = input.nextInt();//data sama dengan input,nextInt
                result.push(data);//panggil method push

            } else if (pilihan == 2) {//jika pilihan 2
                result.pop();//result.pop

            } else if (pilihan == 3) {//jika pilihan 3
                result.display();//ressult.display
            } else if (pilihan == 0) {//jika pilihan 0
                System.exit(0);//maka system.exit
            } else {//jika pilihan tidak 
                System.out.println("pilihan tidak ada");//maka akan ditampilkan pilihan tidak ada
            }
        } while (pilihan != 0);//program mengulang pilihan
    }
}
