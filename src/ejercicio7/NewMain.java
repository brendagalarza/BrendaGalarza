
package ejercicio7;

public class NewMain {

    public static void main(String[] args) {
       personaService datos = new personaService();
        Persona [] p = new Persona[4];
       
      float pesoBa = 0;
        float pesoId = 0;
        float pesoSo = 0;
        float edadMayores = 0;
        float edadMenores = 0;
        
        
        for (int i = 0; i < p.length; i++) {
            p[i] = datos.crearPersona();
            System.out.println("");
            
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.println("persona : " + i);
        
            
            p[0] = null;
            
           
            try {
                if(datos.esMayor(p[i])){
                System.out.println("Es mayor");
                edadMayores++;
            }
            else {
                System.out.println("Es menor");
                edadMenores++;
                }
            } catch (Exception e) {
                    System.out.println("ERROR--> ");
            }
    
                
            
            switch (datos.calcularMC(p[i])) {
                case Persona.pesoMinimo:
                    System.out.println("Bajo peso");
                    pesoBa++;
                    break;
                case Persona.pesoideal:
                    System.out.println("Peso Ideal");
                    pesoId++;
                    break;
                case Persona.sobrePeso:
                    System.out.println("Sobre peso");
                    pesoSo++;
               
            }
            System.out.println("Muestro porcentajes");
            
            
        }
        System.out.println("Personas con bajo peso : " + pesoBa + " , en % : " + (pesoBa*100)/ ( pesoBa+pesoId+pesoSo)  );
        System.out.println("Personas con bajo peso : " + pesoBa + " , en % : " + (pesoId*100)/ ( pesoBa+pesoId+pesoSo)  );
        System.out.println("Personas con bajo peso : " + pesoBa + " , en % : " + (pesoSo*100)/ ( pesoBa+pesoId+pesoSo)  );
        System.out.println("Personas mayores de edad : " + edadMayores + " , en % " + (edadMayores*100 / (edadMayores+edadMenores)));
               System.out.println("Personas mayores de edad : " + edadMenores + " , en % " + (edadMenores*100 / (edadMayores+edadMenores)));
    }
    
}
