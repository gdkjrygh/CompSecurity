// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.chat.model;


// Referenced classes of package com.ubercab.chat.model:
//            Shape_SendStatus

public abstract class SendStatus
{

    public static final int STATUS_NETWORK_ERROR = 1;
    public static final int STATUS_PAYLOAD_READ_ERROR = 2;
    public static final int STATUS_SENDING = 3;
    public static final int STATUS_SUCCESS = 4;

    public SendStatus()
    {
    }

    public static SendStatus create(int i, String s, String s1)
    {
        return (new Shape_SendStatus()).setConnectedUserId(s1).setStatus(i).setThreadId(s);
    }

    public abstract String getConnectedUserId();

    public abstract int getStatus();

    public abstract String getThreadId();

    abstract SendStatus setConnectedUserId(String s);

    abstract SendStatus setStatus(int i);

    abstract SendStatus setThreadId(String s);
}
