// VideoStore.java
public class VideoStore {
    private Video[] store;
    private int count;

    public VideoStore(int size) {
        store = new Video[size];
        count = 0;
    }

    public void addVideo(String name) {
        store[count++] = new Video(name);
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    public void doCheckout(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].doCheckout();
                System.out.println("Video \"" + name + "\" checked out.");
                return;
            }
        }
        System.out.println("Video not found!");
    }

    public void doReturn(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].doReturn();
                System.out.println("Video \"" + name + "\" returned.");
                return;
            }
        }
        System.out.println("Video not found!");
    }

    public void receiveRating(String name, int rating) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].receiveRating(rating);
                System.out.println("Rating " + rating + " has been mapped to the video \"" + name + "\".");
                return;
            }
        }
        System.out.println("Video not found!");
    }

    public void listInventory() {
        System.out.println("\n-----------------------------------");
        System.out.println("Video Inventory:");
        System.out.println("Name\t|\tCheckout\t|\tRating");
        System.out.println("-----------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(store[i].getName() + "\t|\t" + store[i].getCheckout() + "\t\t|\t" + store[i].getRating());
        }
        System.out.println("-----------------------------------\n");
    }
}

