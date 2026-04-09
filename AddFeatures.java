public static void Add() {
    System.out.println("Enter the name of the new feature:");
    String newFeature = input.next();

    if (features.add(newFeature)) {
        System.out.println("Feature '" + newFeature + "' has been added.");
    } else {
        System.out.println("Feature '" + newFeature + "' already exists.");
    }
}