// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.Handler;
import com.google.android.apps.youtube.api.b.a.ax;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.am;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            cx, ec, dz, ea, 
//            eb

public final class dy extends cx
{

    private final am a;
    private final Handler b;
    private ec c;

    public dy(am am1, Handler handler)
    {
        a = (am)com.google.android.apps.youtube.common.fromguava.c.a(am1, "target cannot be null");
        b = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler, "uiHandler cannot be null");
    }

    static ec a(dy dy1)
    {
        return dy1.c;
    }

    static ec a(dy dy1, ec ec1)
    {
        dy1.c = ec1;
        return ec1;
    }

    static am b(dy dy1)
    {
        return dy1.a;
    }

    public final void a()
    {
        if (c != null)
        {
            c.a();
            c = null;
        }
    }

    public final void a(ax ax)
    {
        b.post(new dz(this, ax));
    }

    public final void a(boolean flag)
    {
        b.post(new ea(this, flag));
    }

    public final void b(boolean flag)
    {
        b.post(new eb(this, flag));
    }
}
