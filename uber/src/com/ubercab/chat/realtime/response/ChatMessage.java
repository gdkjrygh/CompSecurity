// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.chat.realtime.response;


// Referenced classes of package com.ubercab.chat.realtime.response:
//            ChatPayload

public abstract class ChatMessage
{

    public ChatMessage()
    {
    }

    public abstract String getClientMessageId();

    public abstract String getMessageId();

    public abstract String getMessageType();

    public abstract ChatPayload getPayload();

    public abstract String getSenderId();

    public abstract int getSequenceNumber();

    public abstract String getThreadId();

    public abstract long getTimestamp();

    abstract ChatMessage setClientMessageId(String s);

    abstract ChatMessage setMessageId(String s);

    abstract ChatMessage setMessageType(String s);

    abstract ChatMessage setPayload(ChatPayload chatpayload);

    abstract ChatMessage setSenderId(String s);

    abstract ChatMessage setSequenceNumber(int i);

    abstract ChatMessage setThreadId(String s);

    abstract ChatMessage setTimestamp(long l);
}
