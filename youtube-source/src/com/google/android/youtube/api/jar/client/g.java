// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.api.jar.client;


// Referenced classes of package com.google.android.youtube.api.jar.client:
//            a, RemoteEmbeddedPlayer

final class g
    implements Runnable
{

    final String a;
    final String b;
    final boolean c;
    final boolean d;
    final int e;
    final int f;
    final a g;

    g(a a1, String s, String s1, boolean flag, boolean flag1, int i, int j)
    {
        g = a1;
        a = s;
        b = s1;
        c = flag;
        d = flag1;
        e = i;
        f = j;
        super();
    }

    public final void run()
    {
        RemoteEmbeddedPlayer.a(g.a, a, b);
        RemoteEmbeddedPlayer.a(g.a, c);
        RemoteEmbeddedPlayer.b(g.a, d);
        RemoteEmbeddedPlayer.a(g.a, e);
        RemoteEmbeddedPlayer.b(g.a, f);
    }
}
