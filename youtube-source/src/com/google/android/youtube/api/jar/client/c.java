// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.api.jar.client;


// Referenced classes of package com.google.android.youtube.api.jar.client:
//            a, RemoteEmbeddedPlayer

final class c
    implements Runnable
{

    final boolean a;
    final a b;

    c(a a1, boolean flag)
    {
        b = a1;
        a = flag;
        super();
    }

    public final void run()
    {
        RemoteEmbeddedPlayer.e(b.a, a);
    }
}
