package sample;

public class BloxWorld {
    int width;
    int height;
    Blox[][] world;

    public BloxWorld(int width, int height) {
        this.width = width;
        this.height = height;
        this.world = new Blox[width][height];
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public Blox[][] getWorld() {
        return world;
    }
    public Blox getBloxAt(int i, int j) {
        return world[i][j];
    }
    public void setBlox(int x, int y, Blox blox) {
        world[x][y] = blox;
    }
    public void printWorld() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (world[i][j] == null) {
                    System.out.print(0);
                }
                else {
                    world[i][j].printBlox();
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
