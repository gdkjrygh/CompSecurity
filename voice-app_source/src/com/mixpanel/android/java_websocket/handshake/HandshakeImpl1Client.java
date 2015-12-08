// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.handshake;


// Referenced classes of package com.mixpanel.android.java_websocket.handshake:
//            HandshakedataImpl1, ClientHandshakeBuilder

public class HandshakeImpl1Client extends HandshakedataImpl1
    implements ClientHandshakeBuilder
{

    private String resourceDescriptor;

    public HandshakeImpl1Client()
    {
        resourceDescriptor = "*";
    }

    public String getResourceDescriptor()
    {
        return resourceDescriptor;
    }

    public void setResourceDescriptor(String s)
        throws IllegalArgumentException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        } else
        {
            resourceDescriptor = s;
            return;
        }
    }
}
