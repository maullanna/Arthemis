interface Weapon {
    void use();
}

interface Character {
    void attack();
    void use();
}

class Mage implements Character, Weapon {
    public void attack() {
        System.out.println("Mage attacks with a wand.");
    }

    public void use() {
        System.out.println("Mage uses a wand.");
    }
}

class Warrior implements Character, Weapon {
    public void attack() {
        System.out.println("Warrior attacks with a sword.");
    }

    public void use() {
        System.out.println("Warrior uses a sword.");
    }
}