int max = 0; // Declare an integer variable max and initialize it to 0

// Example usage in a loop to find the maximum value in an array
int[] numbers = {3, 5, 7, 2, 8};
for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] > max) {
        max = numbers[i]; // Update max if the current number is greater than max
    }
}

System.out.println("The maximum value is: " + max); // Output the maximum value
