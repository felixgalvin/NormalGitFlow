public static void main(String[] args) {
    System.out.println("Choose Features!\n1. Add a new feature\n2. View existing features\n3. Delete a feature");

    switch (input.nextInt()) {
        case 1:
            System.out.println("You have chosen to add a new feature.");
            Add();
            break;
        case 2:
            System.out.println("You have chosen to view existing features.");
            view();
            break;
        case 3:
            System.out.println("You have chosen to delete a feature.");
            delete();
            break;
        default:
            System.out.println("Invalid choice. Please try again.");
    }
}