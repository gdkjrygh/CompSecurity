// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.drafts;

import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.handshake.ClientHandshake;
import com.mixpanel.android.java_websocket.handshake.ClientHandshakeBuilder;

// Referenced classes of package com.mixpanel.android.java_websocket.drafts:
//            Draft_10, Draft

public class Draft_17 extends Draft_10
{

    public Draft_17()
    {
    }

    public Draft.HandshakeState acceptHandshakeAsServer(ClientHandshake clienthandshake)
        throws InvalidHandshakeException
    {
        if (readVersion(clienthandshake) == 13)
        {
            return Draft.HandshakeState.MATCHED;
        } else
        {
            return Draft.HandshakeState.NOT_MATCHED;
        }
    }

    public Draft copyInstance()
    {
        return new Draft_17();
    }

    public ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clienthandshakebuilder)
    {
        super.postProcessHandshakeRequestAsClient(clienthandshakebuilder);
        clienthandshakebuilder.put("Sec-WebSocket-Version", "13");
        return clienthandshakebuilder;
    }
}
