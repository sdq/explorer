package io.nebulas.explorer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class NaxRecord implements Serializable {
    public static final int SOURCE_UNKNOWN = 0;
    public static final int SOURCE_ = 1;
    public static final int SOURCE_PLEDGE = 2;
    public static final int SOURCE_VOTE = 3;

    private int id;
    private String address;
    private String txHash;
    private long block;
    private String amount;
    private int source;
    private Date timestamp;
    private Date createdAt;
}
