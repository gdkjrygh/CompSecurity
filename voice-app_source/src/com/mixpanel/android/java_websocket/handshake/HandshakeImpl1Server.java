// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.handshake;


// Referenced classes of package com.mixpanel.android.java_websocket.handshake:
//            HandshakedataImpl1, ServerHandshakeBuilder

public class HandshakeImpl1Server extends HandshakedataImpl1
    implements ServerHandshakeBuilder
{

    private short httpstatus;
    private String httpstatusmessage;

    public HandshakeImpl1Server()
    {
    }

    public short getHttpStatus()
    {
        return httpstatus;
    }

    public String getHttpStatusMessage()
    {
        return httpstatusmessage;
    }

    public void setHttpStatus(short word0)
    {
        httpstatus = word0;
    }

    public void setHttpStatusMessage(String s)
    {
        httpstatusmessage = s;
    }
}
