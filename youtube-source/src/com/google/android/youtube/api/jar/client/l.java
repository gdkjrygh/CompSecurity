// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.api.jar.client;


// Referenced classes of package com.google.android.youtube.api.jar.client:
//            a, RemoteEmbeddedPlayer

final class l
    implements Runnable
{

    final int a;
    final int b;
    final a c;

    l(a a1, int i, int j)
    {
        c = a1;
        a = i;
        b = j;
        super();
    }

    public final void run()
    {
        RemoteEmbeddedPlayer.a(c.a, a);
        RemoteEmbeddedPlayer.b(c.a, b);
    }
}
