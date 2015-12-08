// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.b;

import java.net.MulticastSocket;

// Referenced classes of package com.google.android.apps.ytremote.b:
//            j

final class m
    implements Runnable
{

    final MulticastSocket a;
    final j b;

    m(j j1, MulticastSocket multicastsocket)
    {
        b = j1;
        a = multicastsocket;
        super();
    }

    public final void run()
    {
        j.a(b, a, j.b());
    }
}
