// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.chat.realtime.response;

import java.util.List;

public abstract class ChatMessages
{

    public ChatMessages()
    {
    }

    public abstract List getMessages();

    public abstract String getThreadId();

    abstract ChatMessages setMessages(List list);

    abstract ChatMessages setThreadId(String s);
}
