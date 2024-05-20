public class SwitchCase2 {
    public static void main(String[] args) {
        String plano = "M"; //M /T

        switch (plano) {
            case "T": {
                System.out.println("5GB youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
                
                break;
        
            default:
                break;
        }
    }
}
