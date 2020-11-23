package com.xkcoding.websocket.socketio.init;

import com.corundumstudio.socketio.SocketIOServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * <p>
 * websocket服务器启动
 * </p>
 *
 * @package: com.xkcoding.websocket.socketio.init
 * @description: websocket服务器启动
 * @author: cwy
 * @date: Created in 2020-11-18 17:07
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: cwy
 */
@Component
@Slf4j
public class ServerRunner implements CommandLineRunner {
    @Autowired
    private SocketIOServer server;

    @Override
    public void run(String... args) {
        server.start();
        log.info("websocket 服务器启动成功。。。");
    }
}
