// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.chat.realtime.request.body;


// Referenced classes of package com.ubercab.chat.realtime.request.body:
//            Shape_ChatMessageBody, ChatPayloadBody

public abstract class ChatMessageBody
{

    public ChatMessageBody()
    {
    }

    public static ChatMessageBody create()
    {
        return new Shape_ChatMessageBody();
    }

    public abstract String getClientMessageId();

    public abstract String getClientThreadId();

    public abstract String getMessageType();

    public abstract ChatPayloadBody getPayload();

    public abstract String getSenderId();

    public abstract String getThreadId();

    public abstract String getTripId();

    public abstract ChatMessageBody setClientMessageId(String s);

    public abstract ChatMessageBody setClientThreadId(String s);

    public abstract ChatMessageBody setMessageType(String s);

    public abstract ChatMessageBody setPayload(ChatPayloadBody chatpayloadbody);

    public abstract ChatMessageBody setSenderId(String s);

    public abstract ChatMessageBody setThreadId(String s);

    public abstract ChatMessageBody setTripId(String s);
}
