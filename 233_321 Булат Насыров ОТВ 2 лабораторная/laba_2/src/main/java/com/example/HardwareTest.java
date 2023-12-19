import com.example.domain.Hardware;

public class HardwareTest {
    public static void main(String[] args) {
        Hardware hardware = new Hardware();
        hardware.setId(1L);
        hardware.setName("ABOBA");
        hardware.setCost(11111.94);

        System.out.println("Hardware ID: "+hardware.getId());
        System.out.println("Hardware Name: "+hardware.getName());
        System.out.println("Hardware cost: "+hardware.getCost());

    }
}