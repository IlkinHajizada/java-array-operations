public class Array {
    int[] items;
    int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {
        if (count >= items.length) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        count--;
        for (; index < count; index++)
            items[index] = items[index + 1];
    }

    public int indexOf(int item) {

        for (int i = 0; i < count; i++) {

            if (items[i] == item) {
                return i;
            }

        }

        return -1;

    }
}

