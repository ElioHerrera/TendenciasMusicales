package tendenciasmusicales;

public class Presentacion {
  
    public String logo(){
        System.out.println("\n𝖯𝖱𝖤𝖬𝖨𝖴𝖬                                        𝕐𝕠𝕦𝕋𝕦𝕓𝕖 （ ▶ ）\n" +
"_____________________________________________________________\n");
        
        return null;
    }
    
    public void esperar(int tiempo){
     try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void cargando() {
        for (int i = 0; i < 2; i++) {  // Repetir el proceso dos veces
            System.out.print("       🇱​​​​​🇴​​​​​🇦​​​​​🇩​​​​​🇮​​​​​🇳​​​​​🇬  ");
            esperar(350);

            for (int j = 0; j < 5; j++) {
                System.out.print(" •"); 
                esperar(250);
            }
            
// Borra solo si no es la última iteración
            if (i < 1) {
                borrarTodo();
            }
                    }
               borrarTodo();
    }
   
    
   private void borrarTodo() {
        System.out.print("\r                    \r");
    }
}