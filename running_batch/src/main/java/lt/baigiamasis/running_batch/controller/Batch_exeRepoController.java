package lt.baigiamasis.running_batch.controller;

import lt.baigiamasis.running_batch.model.BatchExecution;
import lt.baigiamasis.running_batch.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//filtras pagal data ir busena (ExitCode);
//https://www.baeldung.com/spring-boot-crud-thymeleaf
//https://medium.com/@srikanthnakka/spring-boot-thymeleaf-crud-example-tutorial-page-1-of-2-29d7d6953ace
//https://javabeginnerstutorial.com/spring-boot/making-spring-boot-thymeleaf-crud-application/
//https://www.geeksforgeeks.org/spring-boot-thymeleaf-with-example/


@Controller
@RequestMapping (path="/batch_exe")

public class Batch_exeRepoController {
    @Autowired
    private BatchService batchService;

    // http://localhost:8080/batch_exe/all

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<BatchExecution> getAllBatches (){
        return batchService.getAllBatches();

    }
    // http://localhost:8080/batch_exe/id/1
    @GetMapping (path = "/id/{id}")
    public @ResponseBody
    Optional <BatchExecution> getBatch_exebyID (@PathVariable int id){
        return batchService.getBatch_exebyID(id);
    }

    //http://localhost:8080/batch_exe/firstpage/1
    @GetMapping ("/firstpage/{id}")
    public String getFirstPage( @PathVariable (value = "id") int id, Model model) {
        Optional<BatchExecution> batch = getBatch_exebyID(id);
        model.addAttribute("jobid","Job ID: " + batch);
        return "index";
    }
    @GetMapping("/jquerypage")
    public String getJqueryPage(Model model){
        return "jquerypage";
    }

}