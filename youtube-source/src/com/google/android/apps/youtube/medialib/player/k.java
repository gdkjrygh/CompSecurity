// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;


// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            z, i, y, ak

final class k
    implements z
{

    final i a;

    private k(i j)
    {
        a = j;
        super();
    }

    k(i j, byte byte0)
    {
        this(j);
    }

    public final void a()
    {
        i.a(a);
        i.d(a).setVideoSize(i.b(a), i.c(a));
    }

    public final void b()
    {
        if (i.d(a) != null && i.e(a) != null && i.f(a) != null)
        {
            i.e(a).a(i.f(a), i.d(a).b(), i.d(a).c());
        }
    }

    public final void c()
    {
        i.g(a);
    }
}
