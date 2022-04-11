import Classes.Barbarian;

class Main {
    public static void main(String[] args) {
        Barbarian Vander = new Barbarian("Vander", 1, 18, 14, 15, 8, 10, 12);
  
        System.out.println(Vander.toString());
        Vander.lvlup();
        System.out.println(Vander.toString());

    }
  }