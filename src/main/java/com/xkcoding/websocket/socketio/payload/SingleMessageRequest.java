package com.xkcoding.websocket.socketio.payload;

import lombok.Data;

/**
 * <p>
 * 私聊消息载荷
 * </p>
 *
 * @package: com.xkcoding.websocket.socketio.payload
 * @description: 私聊消息载荷
 * @author: cwy
 * @date: Created in 2020-11-18 17:02
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: cwy
 */
@Data
public class SingleMessageRequest {
    /**
     * 消息发送方用户id
     */
    private String fromUid;

    /**
     * 消息接收方用户id
     */
    private String toUid;

    /**
     * 消息内容
     */
    private String message;
}
