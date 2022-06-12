
public class Empresa {

  public static void main(String[] args) {

    Producto productos[] = new Producto[3];
    boolean salir = false;
    int opcion;

    while (!salir) {

      Archivos menu = new Archivos();
      menu.menu();

      Producto ob = new Producto();
      int obs = ob.getInt("Introduce un numero para seleccionar opcion menu");
      opcion = obs;

      switch (opcion) {

        case 1:

          Archivos guardar = new Archivos();
          Producto objeto[] = guardar.guardarProducto();
          productos = objeto;
          break;
        case 2:
          Archivos visualizar = new Archivos();
          visualizar.visualizarProducto(productos);
          break;
        case 3:
          Archivos guardarTxt = new Archivos();
          guardarTxt.guardarDocumentoTexto(productos);
          break;
        case 4:
          Archivos leerDocumentoTexto = new Archivos();
          leerDocumentoTexto.leerArchivo();
          break;
        case 5:
          salir = true;
          break;
      }

    }
  }
}
