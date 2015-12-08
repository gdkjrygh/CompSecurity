// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;


// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            r, p, y

final class s
    implements Runnable
{

    final int a;
    final int b;
    final r c;

    s(r r1, int i, int j)
    {
        c = r1;
        a = i;
        b = j;
        super();
    }

    public final void run()
    {
        p.e(c.a).setVideoSize(a, b);
    }
}
