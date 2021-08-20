
import java.util.Arrays;
import java.util.Objects;

public class Phone implements Comparable<Phone> {
    private final String brand;
    private final long serialNum;
    private final String colour;
    private final String[] attributesArray;

    public Phone(String brand, long serialNum, String colour, String[] attributesArray) {
        if (brand == null || colour == null || serialNum == 0 ) {
            throw new NullPointerException();
        }
        this.brand = brand;
        this.serialNum = serialNum;
        this.colour = colour;
        this.attributesArray = attributesArray;
    }
    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public long getSerialNumber() {
        return serialNum;
    }

    public String[] getArray() {
        return attributesArray;
    }
    @Override
    public int hashCode() {

        return Objects.hash(serialNum);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +

                ", serialNumber=" + serialNum +
                ", colour=" + colour +
                '}';
    }

    public void param() throws ArrayIndexOutOfBoundsException{
        Arrays.sort(attributesArray);
        System.out.println(Arrays.toString(attributesArray));

        try{
            System.out.println(attributesArray[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        }
    @Override
    public boolean equals(Object phone) { // определяем равенство по полям brand, serialNumber и name
        if (this == phone) return true;
        if (phone == null || getClass() != phone.getClass()) return false;
        Phone product = (Phone) phone;
        return serialNum == product.serialNum &&
                brand.equals(product.brand) &&
                colour.equals(product.colour)&&
                attributesArray.equals(product.attributesArray);

    }
    @Override
    public int compareTo(Phone phone) {
        return colour.compareTo(phone.colour);
    }
}



