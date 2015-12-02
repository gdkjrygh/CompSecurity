// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.chat.realtime.response;


public abstract class PostChatMessageResponse
{

    public PostChatMessageResponse()
    {
    }

    public abstract String getClientMessageId();

    public abstract String getClientThreadId();

    public abstract String getMessageId();

    public abstract int getSequenceNumber();

    public abstract String getThreadId();

    public abstract long getTimestamp();

    public abstract PostChatMessageResponse setClientMessageId(String s);

    public abstract PostChatMessageResponse setClientThreadId(String s);

    public abstract PostChatMessageResponse setMessageId(String s);

    public abstract PostChatMessageResponse setSequenceNumber(int i);

    public abstract PostChatMessageResponse setThreadId(String s);

    public abstract PostChatMessageResponse setTimestamp(long l);
}
