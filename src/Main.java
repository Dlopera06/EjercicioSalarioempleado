//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
         * Una empresa desea registrar la informacion de cada empleado, para ello cada empleado debe ingresar con usuario y ontraseña designada, una vez ingresado el empleado debe registrar la siguiente información
         * 1. Nombre completo
         * 2. documento identidad
         * 3. Valor hora
         * 4. Cantidad de horas
         * 5. Seleccionar un dia de descanso en la semana (l-v)
         * El sistema le debe mostrar el salario neto, salario bruto, deducción por pensión, deducción
         *  por salud, aux de transporte (si aplica) y bonificacion del 10% si no supera 2smmlv (sin influir auxilio de transporte
         * Toda la información del empleado se debe mostrar en un mensaje descriptivo
         */
        Scanner sc= new Scanner (System.in);
        String NombreEmpleado="";
        String DocumentroIdentidad="";
        String Diadescanso="";
        String UsuarioEmpleado = "";
        String Contrasenaempelado = "";
        double SalarioBruto= 0;
        double SalarioNeto = 0;
        double RetencionSalud = 0;
        double RetenconPension= 0;
        double Valohora = 0;
        double Cantidadhoras =0;
        int AuxilioTransporte=200000;
        double Bonificacionempleado =0;

        System.out.println("ingrese su usuario");
        UsuarioEmpleado = sc.nextLine();
        System.out.println("Ingrese su contraseña");
        Contrasenaempelado = sc.nextLine();
        if (UsuarioEmpleado.equals("admin") && Contrasenaempelado.equals("admin")){
            System.out.println("Ha ingresado de manera correcta");

        } else {
            System.out.println("Error de credenciales");
        }
    }
}