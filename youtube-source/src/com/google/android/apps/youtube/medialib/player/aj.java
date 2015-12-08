// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;


// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            ai, af, x

final class aj
    implements Runnable
{

    final ai a;

    aj(ai ai1)
    {
        a = ai1;
        super();
    }

    public final void run()
    {
        if (af.f(a.a).j() || af.f(a.a).i())
        {
            af.d(a.a).b();
        }
        af.e(a.a);
    }
}
