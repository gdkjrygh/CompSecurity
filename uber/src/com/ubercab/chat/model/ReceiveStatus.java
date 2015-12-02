// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.chat.model;


// Referenced classes of package com.ubercab.chat.model:
//            Shape_ReceiveStatus

public abstract class ReceiveStatus
{

    public static final int STATUS_NETWORK_ERROR = 2;
    public static final int STATUS_NEW_MESSAGE = 1;
    public static final int STATUS_PAYLOAD_WRITE_ERROR = 3;

    public ReceiveStatus()
    {
    }

    public static ReceiveStatus create(int i, String s, String s1)
    {
        return (new Shape_ReceiveStatus()).setConnectedUserId(s1).setStatus(i).setThreadId(s);
    }

    public abstract String getConnectedUserId();

    public abstract int getStatus();

    public abstract String getThreadId();

    abstract ReceiveStatus setConnectedUserId(String s);

    abstract ReceiveStatus setStatus(int i);

    abstract ReceiveStatus setThreadId(String s);
}
