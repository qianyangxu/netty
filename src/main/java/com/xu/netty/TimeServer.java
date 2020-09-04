package com.xu.netty;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

public class TimeServer {

    public void bind(int port) throws Exception {
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();
    }
}
