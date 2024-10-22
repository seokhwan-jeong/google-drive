package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Indexed extends AbstractEvent {

    private Long id;
    private String fileid;
    private String uploader;
    private Date indexDt;

    public Indexed(Index aggregate) {
        super(aggregate);
    }

    public Indexed() {
        super();
    }
}
//>>> DDD / Domain Event
