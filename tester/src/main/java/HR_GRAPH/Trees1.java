package HR_GRAPH;

public class Trees1 {

    private Trees1 left;
    private Trees1 right;
    int data;

    public Trees1(int data) {
        this.data = data;
        System.out.println(data + " left: " + left + " right: " + right);
    }

    public void step(int value) {
        if (value <= data) {
            if (left == null) {
                left = new Trees1(value);
            } else {
                left.step(value);
            }

        } else {
            if (right == null) {
                right = new Trees1(value);
            } else {
                right.step(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public static void main(String[] args) {
        Trees1 start = new Trees1(10);
        start.step(3);
        System.out.println(start.left.data);
    }

}
