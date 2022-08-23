package lt.baigiamasis.running_batch.model;
import lombok.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Setting {

    private String label;
    private boolean value;

}