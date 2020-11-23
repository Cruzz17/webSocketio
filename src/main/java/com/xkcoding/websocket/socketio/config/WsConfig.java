package com.xkcoding.websocket.socketio.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 * WebSocket配置类
 * </p>
 *
 * @package: com.xkcoding.websocket.socketio.config
 * @description: WebSocket配置类
 * @author: cwy
 * @date: Created in 2020-11-18 16:41
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: cwy
 */
@ConfigurationProperties(prefix = "ws.server")
@Data
public class WsConfig {
    /**
     * 端口号
     */
    private Integer port;

    /**
     * host
     */
    private String host;
}
