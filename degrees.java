
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        while(option != 3) {
            option = menu(input);
            switch (option) {
               case 1:
                   System.out.println("You entered option 1");
                   break;
                case 2:
                   System.out.println("You entered option 2");
                   break;
                case 3:
                   System.out.println("Goodbye!");
                   break;
                default: 
                   System.out.println("Invalid Option");
                   break;
            }
        }
