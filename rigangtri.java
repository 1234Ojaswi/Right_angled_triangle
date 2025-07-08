class rigangtri{
  public static void right_angled_tri(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
  public static void main(String[] args) {
        int n = 5;
        System.out.println("Right angled triangle");
        right_angled_tri(n);
  }
}
