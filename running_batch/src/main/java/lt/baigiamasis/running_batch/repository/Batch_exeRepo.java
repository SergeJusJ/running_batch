package lt.baigiamasis.running_batch.repository;

import lt.baigiamasis.running_batch.model.BatchExecution;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface Batch_exeRepo extends CrudRepository<BatchExecution,Integer> {


}
