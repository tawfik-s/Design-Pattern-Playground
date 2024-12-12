package com.tawfeek.structural.proxy;

// 1. Define a common interface
interface Image {
    void display();
}

// 2. The RealSubject class (Real Image)
class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();
    }

    // Simulate an expensive operation: loading image from disk
    private void loadImageFromDisk() {
        System.out.println("Loading " + fileName + " from disk...");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}

// 3. The Proxy class
class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage; // The real object that the proxy handles

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // Lazy initialization: Load the real image only when needed
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

// 4. Client class to demonstrate the Proxy
public class ProxyPatternExample {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image1 is loaded and displayed
        System.out.println("Client calls display for image1:");
        image1.display();

        System.out.println();

        // Image1 is already loaded, no need to reload
        System.out.println("Client calls display for image1 again:");
        image1.display();

        System.out.println();

        // Image2 is loaded and displayed for the first time
        System.out.println("Client calls display for image2:");
        image2.display();
    }
}