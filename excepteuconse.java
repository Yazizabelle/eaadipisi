public class FileSaver {

    // Method to save content to a file
    public static boolean saveToFile(String content, String filePath) {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(content);
            return true; // Return true if save is successful
        } catch (IOException e) {
            System.err.println("An error occurred while saving the file: " + e.getMessage());
            return false; // Return false if an error occurs
        }
    }
    
    public static void main(String[] args) {
        // Example usage of the saveToFile method
        String contentToSave = "Example content to save in file.";
        String filePath = "example.txt";
        
        // Save the content to the file and print the result
        boolean isSaved = saveToFile(contentToSave, filePath);
        if (isSaved) {
            System.out.println("Content saved successfully to " + filePath);
        } else {
            System.out.println("Failed to save content.");
        }
    }
}
