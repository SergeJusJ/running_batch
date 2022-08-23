package lt.baigiamasis.running_batch.controller;
import lt.baigiamasis.running_batch.model.Settings;
import lt.baigiamasis.running_batch.service.SettingsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping({ "/", "/index" })
public class IndexCtrl {

    private final SettingsService settingsService;

    @Autowired
    public IndexCtrl(SettingsService settingsService) {
        this.settingsService = settingsService;
    }

    @GetMapping
    public String main(Model model) {
        model.addAttribute("settings", settingsService.defaultUserProfileSettings());
        return "index";
    }

    @PostMapping
    public String save(Settings settings, Model model) {
        model.addAttribute("settings", settings);
        return "saved";
    }
}