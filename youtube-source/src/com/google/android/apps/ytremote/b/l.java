// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.b;

import android.util.Log;
import java.io.IOException;
import java.net.MulticastSocket;

// Referenced classes of package com.google.android.apps.ytremote.b:
//            j

final class l
    implements Runnable
{

    final String a;
    final MulticastSocket b;
    final j c;

    l(j j1, String s, MulticastSocket multicastsocket)
    {
        c = j1;
        a = s;
        b = multicastsocket;
        super();
    }

    public final void run()
    {
        java.net.DatagramPacket datagrampacket;
        try
        {
            datagrampacket = j.a(a);
        }
        catch (IOException ioexception)
        {
            Log.e(j.a(), "Error sending M-search:", ioexception);
            return;
        }
        if (datagrampacket == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        b.send(datagrampacket);
    }
}
