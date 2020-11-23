package com.xkcoding.websocket.socketio.config;

/**
 * <p>
 * 事件常量
 * </p>
 *
 * @package: com.xkcoding.websocket.socketio.config
 * @description: 事件常量
 * @author: cwy
 * @date: Created in 2020-11-18 19:36
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: cwy
 */
public interface Event {
    /**
     * 聊天事件
     */
    String CHAT = "chat" ;

    /**
     * 广播消息
     */
    String BROADCAST = "broadcast" ;

    /**
     * 群聊
     */
    String GROUP = "group" ;

    /**
     * 加入群聊
     */
    String JOIN = "join" ;

}
