class Phone {

        private String name;
        private String brand;
        private String description;
        private String price;

        public Phone(String name, String brand, String description, String price) {
            this.name = name;
            this.brand = brand;
            this.description = description;
            this.price = price;
        }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

}