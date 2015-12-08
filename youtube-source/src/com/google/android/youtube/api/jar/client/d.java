// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.api.jar.client;


// Referenced classes of package com.google.android.youtube.api.jar.client:
//            a, RemoteEmbeddedPlayer

final class d
    implements Runnable
{

    final a a;

    d(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        RemoteEmbeddedPlayer.y(a.a);
    }
}
