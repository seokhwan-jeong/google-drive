package googledrive.domain;

import googledrive.VideoProcessingApplication;
import googledrive.domain.StreamProcessed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Video_table")
@Data
//<<< DDD / Aggregate Root
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileid;

    private String videoUrl;

    private String uploader;

    private Date processDt;

    @PostPersist
    public void onPostPersist() {
        StreamProcessed streamProcessed = new StreamProcessed(this);
        streamProcessed.publishAfterCommit();
    }

    public static VideoRepository repository() {
        VideoRepository videoRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoRepository.class
        );
        return videoRepository;
    }

    //<<< Clean Arch / Port Method
    public static void ifStartVideoStreamming(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
