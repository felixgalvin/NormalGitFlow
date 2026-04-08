public static void main(String[] args) {
    System.out.println("Choose Features!\n1. Add a new feature\n2. View existing features\n3. Delete a feature");

    switch (input.nextInt()) {
        case 1:
            System.out.println("You have chosen to add a new feature.");
            // Code to add a new feature
            break;
        case 2:
            System.out.println("You have chosen to view existing features.");
            // Code to view existing features
            break;
        case 3:
            System.out.println("You have chosen to delete a feature.");
            // Code to delete a feature
            break;
        default:
            System.out.println("Invalid choice. Please try again.");
    }
}