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
                .groupList(Arrays.asList(batch()))
                .build();
    }


    private SettingsGroup batch() {
        return SettingsGroup.builder()
                //.group("Select Batch running order:")
                .settingList(Arrays.asList(Setting.builder()
                                .label("Archiving")
                                .value(true)
                                .build(),
                        Setting.builder()
                                .label("GDW_Schema_Export")
                                .value(true)
                                .build(),
                        Setting.builder()
                                .label("Suspend_Backround_Processes")
                                .value(true)
                                .build(),
                        Setting.builder()
                                .label("Enable_Cash")
                                .value(true)
                                .build(),
                        Setting.builder()
                                .label("PURGE_CACHE")
                                .value(true)
                                .build()

                        )

                )
                .build();
    }

  /*  private SettingsGroup reports() {
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
    }*/


}