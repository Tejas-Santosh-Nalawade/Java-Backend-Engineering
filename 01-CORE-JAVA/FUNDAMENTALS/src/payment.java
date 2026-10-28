class payment {
    private final String payment_id;
    protected final long amount;
    private String status;
    private static int createdCount = 0;

    payment(String payment_id, long amount, String status) {
        if(payment_id == null || payment_id.trim().isEmpty()) {
            throw new IllegalArgumentException("Payment ID is required");
        }
        if(amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        this.payment_id = payment_id;
        this.amount = amount;
        this.status = status;
        createdCount++;

    }

    public static void main(String[] args) {
        payment first = new payment("PAY101", 500, "PAID");
        System.out.println(first.getPayment_id());
        System.out.println(first.getAmount());
        System.out.println(first.getStatus());
        first.cancel();
//        first.payment_id = "PAY101";
//        first.amount = 10000;
//        first.status = "PAID";

        payment second = new payment("PAY102", 1000, "PENDING");
        System.out.println(second.getAmount());
        System.out.println(payment.getCreatedCount());
//        payment third = new payment();
//        second.payment_id = "PAY102";
//        second.amount = 10000;
//        second.status = "PENDING";

//        first.cancel();
        second.cancel();
    }

    public long getAmount() {
        return amount;
    }
    public String getPayment_id() {
        return payment_id;
    }
    public String getStatus() {
        return status;
    }
    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setAmount(long amount) {
        this.amount = amount;
    }
    public static int getCreatedCount() {
        return createdCount;
    }
    public static void printAmount(){
        System.out.println(amount);
    }

    void cancel(){
        if("PENDING".equals(status)){
            status = "CANCELLED";
            System.out.println("Payment cancelled");
        }else{
            System.out.println("Only pending payment can be cancelled");
        }
    }
}