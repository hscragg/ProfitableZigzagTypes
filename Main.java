class Main {
  public static void main(String[] args) {
    int[] value = { 3, 4, 6, 345, 999, 333, 32, 420, 21, 1933, 1738 };

    for (int i = 10; i >= 0; i--) {

      if (value[i] % 2 == 0) {

        System.out.println(value[i]);
      }
    }

  }
}