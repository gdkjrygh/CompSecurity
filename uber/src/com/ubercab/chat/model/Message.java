// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.chat.model;

import com.ubercab.chat.realtime.response.ChatMessage;
import java.util.Comparator;

// Referenced classes of package com.ubercab.chat.model:
//            Shape_Message, Payload

public abstract class Message
{

    public static final Comparator SEQUENCE_NUMBER_COMPARATOR = new _cls1();
    public static final int UNKNOWN_SEQUENCE_NUMBER = -1;
    public static final long UNKNOWN_TIME_STAMP = -1L;

    public Message()
    {
    }

    public static Message create()
    {
        return new Shape_Message();
    }

    public static Message create(Message message, String s, int i, long l)
    {
        return (new Shape_Message()).setClientMessageId(message.getClientMessageId()).setClientThreadId(message.getClientThreadId()).setIsOutgoing(message.getIsOutgoing()).setIsRead(message.getIsRead()).setMessageId(s).setMessageType(message.getMessageType()).setPayload(message.getPayload()).setSenderId(message.getSenderId()).setSequenceNumber(i).setThreadId(message.getThreadId()).setTimestamp(l).setTripId(message.getTripId());
    }

    public static Message create(ChatMessage chatmessage)
    {
        return (new Shape_Message()).setClientMessageId(chatmessage.getClientMessageId()).setMessageId(chatmessage.getMessageId()).setMessageType(chatmessage.getMessageType()).setPayload(Payload.create(chatmessage.getPayload())).setSenderId(chatmessage.getSenderId()).setSequenceNumber(chatmessage.getSequenceNumber()).setThreadId(chatmessage.getThreadId()).setTimestamp(chatmessage.getTimestamp());
    }

    public static Message create(String s, String s1, Payload payload, String s2, String s3, String s4)
    {
        return (new Shape_Message()).setClientMessageId(s).setIsOutgoing(true).setIsRead(true).setMessageType(s1).setPayload(payload).setSenderId(s2).setSequenceNumber(-1).setThreadId(s3).setTimestamp(-1L).setTripId(s4);
    }

    public abstract String getClientMessageId();

    public abstract String getClientThreadId();

    public abstract boolean getIsOutgoing();

    public abstract boolean getIsRead();

    public abstract String getMessageId();

    public abstract String getMessageType();

    public abstract Payload getPayload();

    public abstract String getSenderId();

    public abstract int getSequenceNumber();

    public abstract String getThreadId();

    public abstract long getTimestamp();

    public abstract String getTripId();

    public boolean isPendingOutgoingMessage()
    {
        return getMessageId() == null;
    }

    abstract Message setClientMessageId(String s);

    abstract Message setClientThreadId(String s);

    public abstract Message setIsOutgoing(boolean flag);

    public abstract Message setIsRead(boolean flag);

    abstract Message setMessageId(String s);

    abstract Message setMessageType(String s);

    abstract Message setPayload(Payload payload);

    abstract Message setSenderId(String s);

    abstract Message setSequenceNumber(int i);

    abstract Message setThreadId(String s);

    abstract Message setTimestamp(long l);

    abstract Message setTripId(String s);


    /* member class not found */
    class _cls1 {}

}
