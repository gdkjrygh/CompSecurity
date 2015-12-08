// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.Handler;
import com.google.android.apps.youtube.api.b.a.bg;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.bm;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            dj, fb, fe, fa, 
//            fd, fc, ff, fg

public final class ez extends dj
{

    private final bm a;
    private final Handler b;
    private fg c;

    public ez(bm bm1, Handler handler)
    {
        a = (bm)com.google.android.apps.youtube.common.fromguava.c.a(bm1, "target cannot be null");
        b = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler, "uiHandler cannot be null");
    }

    static fg a(ez ez1)
    {
        return ez1.c;
    }

    static fg a(ez ez1, fg fg)
    {
        ez1.c = fg;
        return fg;
    }

    static bm b(ez ez1)
    {
        return ez1.a;
    }

    public final void a()
    {
        b.post(new fb(this));
    }

    public final void a(int i)
    {
        b.post(new fe(this, i));
    }

    public final void a(bg bg)
    {
        b.post(new fa(this, bg));
    }

    public final void a(String s, List list, boolean flag)
    {
        b.post(new fd(this, s, list, flag));
    }

    public final void a(boolean flag)
    {
        b.post(new fc(this, flag));
    }

    public final void b()
    {
        b.post(new ff(this));
    }
}
