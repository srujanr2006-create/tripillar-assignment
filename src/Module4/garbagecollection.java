package Module4;

public class garbagecollection {
        public void finalize(){
            System.out.println("garbage collection");
        }
        public static void main(String[] args) {
            for(int i=0; i<10000; i++) {
                garbagecollection obj = new garbagecollection();
                obj = null;
            }
            System.gc();//call garbage collection
        }
    }



