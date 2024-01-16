class Komputer {
    String processor = "Intel Core i9";
    String merk = "Asus";
    String memory = "16 GB";

    String cekKomputer() {
        return "Ini berasal dari class Komputer";
    }
}

class Laptop extends Komputer {
    String storage = "SSD 1TB";

    String cekLaptop() {
        return "Ini berasal dari class Laptop";
    }
}

class Netbook extends Laptop {
    String lihatSpec() {
        return "Merk: " + merk + ", processor: " + processor + ", jumlah memory: " + memory + ", storage: " + storage;
    }

    String cekNetbook() {
        return "Ini berasal dari class Netbook";
    }
}

