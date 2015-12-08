// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;


// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            v, p

final class w
    implements Runnable
{

    final p a;
    final v b;

    w(v v1, p p)
    {
        b = v1;
        a = p;
        super();
    }

    public final void run()
    {
        v.a(b);
    }
}
