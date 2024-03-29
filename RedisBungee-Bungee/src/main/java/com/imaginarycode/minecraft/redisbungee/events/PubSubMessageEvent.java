/*
 * Copyright (c) 2013-present RedisBungee contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 *
 *  http://www.eclipse.org/legal/epl-v10.html
 */

package com.imaginarycode.minecraft.redisbungee.events;

import com.imaginarycode.minecraft.redisbungee.api.events.IPubSubMessageEvent;
import net.md_5.bungee.api.plugin.Event;

/**
 * This event is posted when a PubSub message is received.
 * <p>
 * <strong>Warning</strong>: This event is fired in a separate thread!
 *
 * @since 0.2.6
 */

public class PubSubMessageEvent extends Event implements IPubSubMessageEvent {
    private final String channel;
    private final String message;

    public PubSubMessageEvent(String channel, String message) {
        this.channel = channel;
        this.message = message;
    }

    @Override
    public String getChannel() {
        return channel;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
