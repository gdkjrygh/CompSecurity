// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.api.jar.client;


// Referenced classes of package com.google.android.youtube.api.jar.client:
//            a, RemoteEmbeddedPlayer

final class n
    implements Runnable
{

    final int a;
    final a b;

    n(a a1, int i)
    {
        b = a1;
        a = i;
        super();
    }

    public final void run()
    {
        RemoteEmbeddedPlayer.a(b.a, a);
    }
}
