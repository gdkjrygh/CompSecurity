// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;


// Referenced classes of package com.google.android.apps.youtube.core.player:
//            n, Director

final class o
    implements Runnable
{

    final Director a;
    final n b;

    o(n n1, Director director)
    {
        b = n1;
        a = director;
        super();
    }

    public final void run()
    {
        n.a(b);
    }
}
