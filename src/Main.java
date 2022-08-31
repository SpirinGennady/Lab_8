public class Main {
    public static void main (String[] args){
        Worker worker = new Worker();

        Reader[] readers = new Reader[]{

        };
        for (Reader reader : readers) {
            reader.Take();
        }
        System.out.println("����� � ���������� �����");

        Administrator[] administrators = new Administrator[]{
                new Managing(),
                worker
        };
        for (Administrator administrator : administrators) {
            administrator.Admin();
        }
        System.out.println("������� � ������ ����� � ���������� � ���������� ������� ��������");

        Supplier[] suppliers = new Supplier[]{

        };
        for (Supplier supplier : suppliers) {
            supplier.Supply();
        }
        System.out.println("�������� ����� � ����������");

        Librarian[] librarians = new Librarian[]{

        };
        for (Librarian librarian : librarians) {
            librarian.Booking();
        }
        System.out.println("���������� �����");
    }
}class Visitor implements Reader {

    @Override
    public void Take() {
    }
}
interface Reader{
    public void Take();
}
class Worker implements Reader, Librarian, Administrator{
    @Override
    public void Take() {
    }

    @Override
    public void Booking() {
    }

    @Override
    public void Admin() {
        }
}
interface Librarian{
    public void Booking();
}
class Managing implements Supplier, Administrator {
    @Override
    public void Admin() {
    }

    @Override
   public void Supply() {
       }
}
interface Supplier {
   public void Supply();
}
interface Administrator {
    public void Admin();
}


