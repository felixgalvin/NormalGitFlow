public static void delete() {
    System.out.println("Enter the name of the feature you want to delete:");
    String featureToDelete = input.next();

    if (features.remove(featureToDelete)) {
        System.out.println("Feature '" + featureToDelete + "' has been deleted.");
    } else {
        System.out.println("Feature '" + featureToDelete + "' not found.");
    }
}