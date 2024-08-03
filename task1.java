{
    public static void main(String[] args) {
        int[] circle = new int []{1, 2, 3, 4, 5, 6};
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество интервалов");
        int m = scan.nextInt();
        System.out.println("Введите длину интервалов");
        int n = scan.nextInt();
        for(int i : circle) {
            System.out.println(circle[i]);
        }
    }
}
