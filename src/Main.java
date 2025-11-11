
void main() {
    int[] number = new int[10];
    int min = 100;
    int max = 0;

    for (int i = 0; i < 10; i++) {
        int rand = (int)(Math.random() * 101);
        number[i] = rand;
    }
    for (int i= 0; i < 10; i++) {

        if (min > number[i]){
            min = number[i];
        }
        if(max < number[i]){
            max = number[i];
        }
        System.out.print(number[i] + " ");
    }
    System.out.println("\n");
    System.out.println("The smallest number is " + min);
    System.out.println("THe largest number is " + max);
}
