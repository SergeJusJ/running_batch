package lt.baigiamasis.running_batch.service;

import java.util.Arrays;

import lt.baigiamasis.running_batch.model.Setting;
import lt.baigiamasis.running_batch.model.Settings;
import lt.baigiamasis.running_batch.model.SettingsGroup;
import org.springframework.stereotype.Service;


@Service
public class SettingsService {

    public Settings defaultUserProfileSettings() {
        return Settings.builder()
                .groupList(Arrays.asList(customer(), reports(), members()))
                .build();
    }

    private SettingsGroup customer() {
        return SettingsGroup.builder()
                .group("Customer")
                .settingList(Arrays.asList(Setting.builder()
                                .label("Enable Notifications")
                                .value(false)
                                .build(),
                        Setting.builder()
                                .label("Enable Case Tracking")
                                .value(false)
                                .build(),
                        Setting.builder()
                                .label("Support")
                                .value(false)
                                .build()))
                .build();
    }

    private SettingsGroup reports() {
        return SettingsGroup.builder()
                .group("Reports")
                .settingList(Arrays.asList(Setting.builder()
                                .label("Generate Reports")
                                .value(false)
                                .build(),
                        Setting.builder()
                                .label("Enable Report Export")
                                .value(false)
                                .build(),
                        Setting.builder()
                                .label("Allow Data Collection")
                                .value(false)
                                .build()))
                .build();
    }

    private SettingsGroup members() {
        return SettingsGroup.builder()
                .group("Members")
                .settingList(Arrays.asList(Setting.builder()
                                .label("Enable Member Sign Up")
                                .value(false)
                                .build(),
                        Setting.builder()
                                .label("Allow User Feedback")
                                .value(false)
                                .build(),
                        Setting.builder()
                                .label("Enable Customer Portal")
                                .value(false)
                                .build()))
                .build();
    }
}