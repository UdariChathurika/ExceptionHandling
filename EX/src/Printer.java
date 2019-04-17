public class Printer {
    void print(int noc){

            validate(noc);

//            if(noc < 0 ) {
//                throw new IllegalArgumentException("NOC should be > 0");
//            }

            for (int i = noc; i != 0; i--) {
                System.out.println("printer");
            }

    }

    boolean validate(int noc){
        if (noc < 0) {
            throw new IllegalArgumentException("NOC should be > 0");
        }
        return true;
    }
}
