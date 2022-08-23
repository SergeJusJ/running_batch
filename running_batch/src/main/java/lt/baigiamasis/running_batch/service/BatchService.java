package lt.baigiamasis.running_batch.service;
import lt.baigiamasis.running_batch.model.BatchExecution;
import lt.baigiamasis.running_batch.repository.Batch_exeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BatchService {
    @Autowired
    private Batch_exeRepo batch_exeRepo;

    public Optional<BatchExecution> getBatch_exebyID(int batchID) {
        return batch_exeRepo.findById(batchID);
    }
    public Iterable<BatchExecution> getAllBatches(){
        return batch_exeRepo.findAll();

    }

}