package lt.baigiamasis.running_batch.model;
import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Settings {
    private List<SettingsGroup> groupList;
}
