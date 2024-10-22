package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String uploader;
    private String filename;
    private String status;

    public FileUploaded(File aggregate) {
        super(aggregate);
    }

    public FileUploaded() {
        super();
    }
}
//>>> DDD / Domain Event
