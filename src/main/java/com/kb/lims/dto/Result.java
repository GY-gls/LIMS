package com.kb.lims.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private boolean success;
    private Integer code;
    private String message;
    private Object data;

    /**
     * 创建一个表示成功结果的对象
     * 该方法用于封装操作成功的返回信息，包括状态、状态码、消息和数据
     *
     * @param data 成功操作后返回的数据，可以是任意类型
     * @return 返回一个包含成功信息的Result对象
     */
    public static Result success(Object data){
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(200);
        result.setMessage("success");
        result.setData(data);
        return result;
    }

    /**
     * 创建一个表示错误结果的对象
     * 该方法用于封装操作失败的返回信息，包括状态、状态码和消息
     *
     * @param code 错误的状态码，表示不同的错误类型
     * @param message 错误的消息，描述错误的详细信息
     * @return 返回一个包含错误信息的Result对象
     */
    public static Result error(Integer code,String message){
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(code);
        result.setMessage(message);
        result.setData(null);
        return result;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
