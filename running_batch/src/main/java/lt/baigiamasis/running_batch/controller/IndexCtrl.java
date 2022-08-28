package lt.baigiamasis.running_batch.controller;

import lt.baigiamasis.running_batch.model.BatchExecution;
import lt.baigiamasis.running_batch.model.Setting;
import lt.baigiamasis.running_batch.model.Settings;
import lt.baigiamasis.running_batch.service.BatchService;
import lt.baigiamasis.running_batch.service.SettingsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.StreamSupport;


@Controller
@RequestMapping({ "/", "/index" })
public class IndexCtrl {

    private final SettingsService settingsService;

    @Autowired
    public IndexCtrl(SettingsService settingsService) {
        this.settingsService = settingsService;
    }

    @Autowired
    private BatchService batchService;
    private Settings st;

    @GetMapping(path = "/all")
    public String getAllBatches (Model model){
        model.addAttribute("logs", batchService.getAllBatches());
        return "logs";
    }

    @GetMapping
    public String main(Model model) {

        model.addAttribute("settings", settingsService.defaultUserProfileSettings());
        return "index";
    }

    @PostMapping
    public String save(Settings settings, Model model) {
        model.addAttribute("settings", settings);
        String label = "Archiving";

        //System.out.println((settings.getGroupList().get(0).getSettingList().stream().findFirst().get().getLabel()));
        if (settings.getGroupList().get(0).getSettingList().stream().findFirst().get().isValue())
            System.out.println("***********OK");

        List<Setting> settingsGroupList = settings.getGroupList().get(0).getSettingList();
//settingsGroupList.get(1).getLabel()
        Iterator<Setting> iterator = settingsGroupList.iterator();

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");

       int maxValue = 0;

        BatchExecution tmpBatch = new BatchExecution();

     maxValue = (int) StreamSupport.stream(batchService.getAllBatches().spliterator(), false).count();

       // tmpBatch.setJobID(batchService.getAllBatches());
        BatchExecution newBatch = batchService.create(tmpBatch);

        while (iterator.hasNext()) {
            Setting setting = iterator.next();
            if (setting.isValue()) {
                System.out.println("****Job running :  " + setting.getLabel());
            //TODO real batch here


//tmpBatch.setSystemDate(LocalTime.now());
//tmpBatch.setStartTime(LocalTime.now());

           tmpBatch.setBatch_name(setting.getLabel());
          //  BatchExecution newBatch = batchService.create(tmpBatch);
            //    BatchExecution newBatch = batchService.create(tmpBatch);


            }
        }

    return "saved";
    }





  /*  Iterable<BatchExecution> getAllBatches() {
//        return "Test succes!!!!!!";
        return batchService.getAllBatches();*/


}