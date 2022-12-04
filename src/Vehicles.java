public enum Vehicles {
    MERCEDES_BENZ(6000) {
        @Override
        public String getColor() {
            return "RED";
        }
    },
    BMW(5000) {
        @Override
        public String getColor() {
            return "GREEN";
        }
    },
    MAZDA(4000) {
        @Override
        public String getColor() {
            return "BLACK";
        }
    },
    OPEL(4500) {
        @Override
        public String getColor() {
            return "YELLOW";
        }
    },
    VOLVO(5500) {
        @Override
        public String getColor() {
            return "PINK";
        }
    };
    int price;
    Vehicles(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Назва автомобіля - " + super.toString() + ", колір - " + getColor() +
                ", вартість - " + price + " $";
    }

    public abstract String getColor();
}
