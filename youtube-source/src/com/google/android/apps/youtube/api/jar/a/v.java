// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.apps.youtube.api.b.a.af;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.a;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            cf, ad, ab, ac, 
//            w, z, y, aa, 
//            x

public final class v extends cf
{

    private final a a;
    private final Handler b;
    private ad c;

    public v(a a1, Handler handler)
    {
        a = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1, "target cannot be null");
        b = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler, "uiHandler cannot be null");
    }

    static ad a(v v1)
    {
        return v1.c;
    }

    static ad a(v v1, ad ad1)
    {
        v1.c = ad1;
        return ad1;
    }

    static a b(v v1)
    {
        return v1.a;
    }

    public final void a()
    {
        if (c != null)
        {
            c.a();
            c = null;
        }
    }

    public final void a(int i, int j)
    {
        b.post(new ab(this, i, j));
    }

    public final void a(Bitmap bitmap)
    {
        b.post(new ac(this, bitmap));
    }

    public final void a(af af)
    {
        b.post(new w(this, af));
    }

    public final void a(String s)
    {
        b.post(new z(this, s));
    }

    public final void a(String s, boolean flag, boolean flag1, String s1)
    {
        b.post(new y(this, s, flag, flag1, s1));
    }

    public final void a(boolean flag)
    {
        b.post(new aa(this, flag));
    }

    public final void b()
    {
        b.post(new x(this));
    }
}
