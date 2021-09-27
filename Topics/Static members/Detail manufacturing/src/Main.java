class ManufacturingController {
    static int count = 0;

    public static String requestProduct(String product) {
        count++;
        return ManufacturingController.getNumberOfProducts() + ". Requested " + product;
    }

    public static int getNumberOfProducts() {
        return count;
    }
}