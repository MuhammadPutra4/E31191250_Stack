package e31191250_stack;

/**
 *
 * @author ADI
 */
public class Stack {

    private boolean empty, full;//variable empty dan full bertipe boolean untuk mengecek true atau false
    private int pos;//variable posisi bertipe integer untu menetukan posisi
    private int max_data = 4;//maksimal data 4
    private int item[] = new int[max_data];//mendeklarasikan data dengan nama item

    public void Stack() {//constractor untuuk mengatur nilai awal kelas Stack
        full = false;//full sama dengan false
        empty = true;//empty sama dengan true
        pos = 0;//dengan posisi 0
    }

    public boolean isFull() {//method untuk mengecek benar atau tidak dengan nama isFull
        return (full);
    }

    public boolean isEmpty() {//method untuk mengecek tempat, kosong atau tidak
        return (empty);
    }

    public void push(int data) {//method untuk menambahkan Stack
        if (!isFull()) {//jika benar
            item[pos++] = data;//maka item ditambahkan sama dengan data
            empty = false;//empty sama dengan false
            if (pos == max_data) {//jika posisi sama dengan maksima data
                full = true;//maka full sama dengan true
            }
            System.out.println("Data sudah ditambahkan");//menampilkan hasil data sudah ditambahkan
        } else {//jika salah
            System.out.println("Data sudah penuh");//maka akan ditampilkan data sudah penuh
        }
        return;
    }

    public int pop() {//method pop
        int x = 0;//variable x sama dengan 0
        if (!isEmpty()) {//untuk menampung array dari item
            x = item[--pos];//cek apakah array nya kosong, item indexnya dikurangi
            full = false;//full sama dengan false
            System.out.println("Data yang di pop dalah:\t" + item[pos]);//maka akan ditampilkan data yang dipop item dalam index
            item[pos] = 0;//item pos sama dengan 0
            if (pos == 0) {//jika pos sama dengan 0
                System.out.println("Stack adalah kosong");//maka akan ditampilkan stack adalah kosong
            } else {//jika salah
                System.out.println("Data sudah diambil");//maka akan ditampilkan data sudah diambil
            }
        } else {//jika salah
            System.out.println("Stack masih kosong! \n");//maka akan ditampilkan stack masih kosong
        }
        return (x);
    }

    public void display() {//methoduntuk menampilkan
        System.out.print("isi stack adalah:\t");//menampilkan isi stack
        for (int i = 0; i < pos; i++) {//perulangan, jika i sama dengan 0, i kurang dari posisi maka i increment
            System.out.print("" + item[i] + ",");//item
        }
        System.out.println("\n");

    }
}
