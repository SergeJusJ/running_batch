package lt.baigiamasis.running_batch.controller;

import lt.baigiamasis.running_batch.model.Setting;
import lt.baigiamasis.running_batch.repository.Batch_exeRepo;
import lt.baigiamasis.running_batch.service.SettingsService;
import org.jboss.jandex.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
        private Batch_exeRepo batch_exeRepo;


    public BootStrapData(Batch_exeRepo batch_exeRepo) {
        this.batch_exeRepo = batch_exeRepo;
    }

    @Override
    public void run(String... args) throws Exception {
//        systemRepo.findAll().forEach(System.out::println);
        System.out.println("________________Batch_Info 1_________________________________");
        System.out.println(batch_exeRepo.findById(1));

//        System.out.println("-------------------");
//        System.out.println(customerRepository.findById(112));

    }
}
