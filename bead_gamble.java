class Child {
  int beads;
  String name;

  public Child(int num, String name_) {
    beads = num;
    name = name_;
  }

  public void beadGamble(Child enemy, int num) {
    if(num > enemy.beads)
      System.out.println(enemy.name + " is too poor to play this gamble");
    else {
    beads += num;
    enemy.beads -= num;
    }
  }
  public int getBeads() {
    return beads;
  }
}

class BeadGamble {
  public static void main(String argv[]) {
    Child c1 = new Child(15, "James");
    Child c2 = new Child(9, "Shin");

    c1.beadGamble(c2, 2);

    System.out.println(c1.name + " has " + c1.getBeads());
    System.out.println(c2.name + " has " + c2.getBeads());

    c2.beadGamble(c1, 7);

    System.out.println(c1.name + " has " + c1.getBeads());
    System.out.println(c2.name + " has " + c2.getBeads());

  }
}
