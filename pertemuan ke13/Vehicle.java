interface Vehicle {
    void test();
}

class Car implements Vehicle {
    public void test() {
        System.out.println("Testing a car");
    }
}

class Bike implements Vehicle {
    public void test() {
        System.out.println("Testing a bike");
    }
}

class PrepBytes implements Vehicle {
    public void test() {
        System.out.println("Testing a PrepBytes vehicle");
    }

    public static void main(String[] args) {
        PrepBytes pb = new PrepBytes();
        pb.test();
}
}