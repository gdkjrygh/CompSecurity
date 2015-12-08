// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b;

import android.os.Handler;
import com.google.android.apps.youtube.api.j;
import com.google.android.apps.youtube.api.s;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.player.internal.ac;
import com.google.android.youtube.player.internal.y;

// Referenced classes of package com.google.android.apps.youtube.api.b:
//            h, d, b, c, 
//            e, f, g

public final class a extends ac
{

    private final Handler a;
    private final h b;
    private final s c;

    public a(Handler handler, j j1, y y)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(j1);
        com.google.android.apps.youtube.common.fromguava.c.a(y);
        a = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler);
        b = new h(this, y);
        c = new s(b, j1.f(), j1.h(), j1.o());
    }

    static s a(a a1)
    {
        return a1.c;
    }

    static h b(a a1)
    {
        return a1.b;
    }

    public final void a()
    {
        a.post(new d(this));
    }

    public final void a(String s1)
    {
        a.post(new b(this, s1));
    }

    public final void a(String s1, int i)
    {
        a.post(new com.google.android.apps.youtube.api.b.c(this, s1, i));
    }

    public final void b()
    {
        a.post(new e(this));
    }

    public final void c()
    {
        a.post(new f(this));
    }

    public final void d()
    {
        a.post(new g(this));
    }
}
