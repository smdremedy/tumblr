
package com.adaptris.tumblrviewer;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Meta {

    @Expose
    private Long status;
    @Expose
    private String msg;

    /**
     * 
     * @return
     *     The status
     */
    public Long getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 
     * @param msg
     *     The msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
