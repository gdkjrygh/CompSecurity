// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.handshake;


// Referenced classes of package com.mixpanel.android.java_websocket.handshake:
//            HandshakeBuilder, ServerHandshake

public interface ServerHandshakeBuilder
    extends HandshakeBuilder, ServerHandshake
{

    public abstract void setHttpStatus(short word0);

    public abstract void setHttpStatusMessage(String s);
}
