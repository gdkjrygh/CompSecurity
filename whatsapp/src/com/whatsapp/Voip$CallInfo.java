// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public class bytesReceived
{

    private long bytesReceived;
    private long bytesSent;
    private long callActiveTime;
    private long callDuration;
    private String callId;
    private  callState;
    private boolean isCaller;
    private boolean isEndedByMe;
    private String peerId;

    public long getBytesReceived()
    {
        return bytesReceived;
    }

    public long getBytesSent()
    {
        return bytesSent;
    }

    public long getCallActiveTime()
    {
        return callActiveTime;
    }

    public long getCallDuration()
    {
        return callDuration;
    }

    public String getCallId()
    {
        return callId;
    }

    public  getCallState()
    {
        return callState;
    }

    public String getPeerId()
    {
        return peerId;
    }

    public boolean isCaller()
    {
        return isCaller;
    }

    public boolean isEndedByMe()
    {
        return isEndedByMe;
    }

    public ( , String s, String s1, boolean flag, boolean flag1, long l, 
            long l1, long l2, long l3)
    {
        callState = ;
        callId = s;
        peerId = s1;
        isCaller = flag;
        isEndedByMe = flag1;
        callActiveTime = l;
        callDuration = l1;
        bytesSent = l2;
        bytesReceived = l3;
    }
}
