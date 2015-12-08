// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.handshake;


// Referenced classes of package com.mixpanel.android.java_websocket.handshake:
//            Handshakedata

public interface ServerHandshake
    extends Handshakedata
{

    public abstract short getHttpStatus();

    public abstract String getHttpStatusMessage();
}
