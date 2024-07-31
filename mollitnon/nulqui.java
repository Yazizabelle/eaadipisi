// Java example
int sum_even = 0;
for (int num = 1; num <= 10; num++) {
    if (num % 2 == 0) {
        sum_even += num; // Accumulate even numbers
    }
}
System.out.println(sum_even); // Output will be 30 (sum of even numbers from 1 to 10)
