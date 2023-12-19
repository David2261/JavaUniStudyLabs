import com.example.domain.Hardware;
import com.example.domain.Motherboard;
import com.example.domain.Processor;
import com.example.domain.Videocard;

//import java.util.stream.Stream;

public class HardwareTest {
    public static void main(String[] args) {
        Hardware hardware = new Hardware(1L, "Abstract hardware", 11111.94);
        Hardware motherboard = new Motherboard(2L, "Mock motherboard", 12000.0, "Mock socket");
        Hardware processor = new Processor(3L, "Mock processor", 47500.0, "Mock socket", "Mock model");
        Hardware videocard = new Videocard(4L, "Mock videocard", 92900.0, "Mock model", "Mock series");

//        var stream = Stream.of(hardware, motherboard, processor, videocard);
//        stream.forEach(HardwareTest::getData);

        getData(hardware);
        getData(motherboard);
        getData(processor);
        getData(videocard);
    }

    public static void getData(Hardware hardware) {
        System.out.println(hardware.getId());
        System.out.println(hardware.getName());
        System.out.println(hardware.getCost());
        System.out.println();
    }
}