package numero;

public  class numero {
     public int n1;
     public int n2;
     public int n3;
    public void VeificarTriagulo(){
        if (n1 == n2 && n1 == n3){
            System.out.println("seu triangulo e Equilátero!");
        } else if (n1 != n2 && n1 != n3 && n2 != n3) {
            System.out.println("seu triangulo é Escaleno!");
        }else {
            System.out.println("seu triangulo é Isósceles");
        }

    }
}
