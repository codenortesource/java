package codenorte; 
// La instrucción break
public class java_usobreak {

    public static void main(String args[]) {

        int i;
        for (i = 1; i <= 10; i++) // iteraciones <= 10
        {
            if (i == 5) // si i= 5,
            {
                break;         // termina el ciclo
            }
            System.out.printf("%d ", i);
        }
    }
}

