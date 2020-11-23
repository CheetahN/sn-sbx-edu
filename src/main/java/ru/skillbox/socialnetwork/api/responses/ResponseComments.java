package ru.skillbox.socialnetwork.api.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)

public class ResponseComments {
    private String error;
    private long timestamp;
    private int total;
    private int offset;
    private int perPage;
    private ResponseComment data;

    public ResponseComments(String error, int total, int offset, int perPage, ResponseComment data){
        this.error = error;
        this.timestamp = System.currentTimeMillis();
        this.total = total;
        this.offset = offset;
        this.perPage = perPage;
        this.data = data;
    }
}
