import java.util.Scanner;

public class Producto {
    private int code;
    private String descripcion;
    private Double peso;
    private Scanner sc;

    public Producto() {
        sc = new Scanner(System.in);
    }

    public Producto(int code, String descripcion, Double peso) {
        this.code = code;
        this.descripcion = descripcion;
        this.peso = peso;
    }

    public Scanner getSC() {
        return sc;
    }

    public String getString(String titulo) {
        String st = "";
        while (st.equals("")) {
            System.out.println(titulo);
            st = sc.nextLine();
            if (!st.matches("^[A-Za-z ]*$")) {
                st = "";
            }
        }

        return st;
    }

    public int getInt(String titulo) {

        String inter = "";
        while (inter.equals("")) {
            System.out.println(titulo);
            inter = sc.nextLine();
            if (!inter.matches("^[0-9]*$")) {
                inter = "";
            }
        }
        return Integer.parseInt(inter);
    }

    public Double getDob(String titulo) {

        String inter = "";
        while (inter.equals("")) {
            System.out.println(titulo);
            inter = sc.nextLine();
            if (!inter.matches("^[0-9/.]*$")) {
                inter = "";
            }
        }
        return Double.valueOf(inter);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void getDetalles() {
        System.out.println("--------------------------------------");
        System.out.println("code : " + this.getCode());
        System.out.println("descripcion : " + this.getDescripcion());
        System.out.println("peso : " + this.getPeso());
        System.out.println("--------------------------------------");
    }

}
