import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Archivos {

   public Producto productos[] = new Producto[3];
   private File archivo;
   private FileWriter escribir;
   private PrintWriter linea;
   private FileReader fr;
   private BufferedReader br;
   private String cadena;

   public Archivos() {

   }

   public void menu() {
      System.out.println("1: Introducir los productos ");
      System.out.println("2: Visualizarlos en pantalla ");
      System.out.println("3: Guardar archivo de texto ");
      System.out.println("4: Leer archivo ");
      System.out.println("5: Salir");
   }

   public Producto[] guardarProducto() {

      System.out.println("--------------------------------------");
      System.out.println("Introduce 3 productos y luego guardelos");
      System.out.println("--------------------------------------");

      for (int i = 0; i < productos.length; i++) {
         Producto code = new Producto();
         code.setCode(code.getInt("Introduce el code del producto"));
         Producto descripcion = new Producto();
         descripcion.setDescripcion(descripcion.getString("Introduce la descripcion del producto"));
         Producto peso = new Producto();
         peso.setPeso(peso.getDob("Introduce el peso del producto"));
         Producto producto = new Producto(code.getCode(), descripcion.getDescripcion(), peso.getPeso());
         productos[i] = producto;
      }
      return productos;
   }

   public void visualizarProducto(Producto producto[]) {

      for (int i = 0; i < producto.length; i++) {
         if (producto[i] == null) {
            System.out.println("--------------------------------------");
            System.out.println("no hay producto inserte uno");
            System.out.println("--------------------------------------");
            return;
         } else {
            producto[i].getDetalles();

         }

      }
   }

   public void guardarDocumentoTexto(Producto productos[]) {
      this.archivo = new File("productos.txt");
      if (!archivo.exists()) {
         try {
            archivo.createNewFile();
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            for (int i = 0; i < 3; i++) {
               if (productos[i] == null) {
                  System.out.println("--------------------------------------");
                  System.out.println("no hay producto inserte uno");
                  System.out.println("--------------------------------------");
                  return;
               } else {
                  linea.println("-----------------------------------------");
                  linea.println("Code :" + productos[i].getCode());
                  linea.println("Descripcion :" + productos[i].getDescripcion());
                  linea.println("Peso :" + productos[i].getPeso());
                  linea.println("-----------------------------------------");

               }
            }
            linea.close();
            escribir.close();
         } catch (Exception ex) {
            System.out.println("Error");
         }

      } else {
         try {
            archivo.createNewFile();
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            for (int i = 0; i < 3; i++) {
               if (productos[i] == null) {
                  System.out.println("--------------------------------------");
                  System.out.println("no hay producto inserte uno");
                  System.out.println("--------------------------------------");
                  return;
               } else {

                  linea.println("-----------------------------------------");
                  linea.println("Code :" + productos[i].getCode());
                  linea.println("Descripcion :" + productos[i].getDescripcion());
                  linea.println("Peso :" + productos[i].getPeso());
                  linea.println("-----------------------------------------");

               }

            }
            linea.close();
            escribir.close();
         } catch (Exception ex) {
            System.out.println("Error");
         }
      }

   }

   public void leerArchivo() {

      try {
         fr = new FileReader("productos.txt");
         br = new BufferedReader(fr);
         while ((cadena = br.readLine()) != null) {
            System.out.println("" + cadena);
         }

      } catch (Exception ex) {
         System.out.println("Error");
      }

   }

}
