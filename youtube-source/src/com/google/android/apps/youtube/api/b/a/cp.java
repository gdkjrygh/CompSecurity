// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Handler;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.al;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            av, cq

final class cp extends av
    implements al
{

    private final Handler a;
    private al b;

    public cp(Handler handler)
    {
        a = (Handler)c.a(handler, "uiHandler cannot be null");
    }

    static al a(cp cp1)
    {
        return cp1.b;
    }

    public final void a(al al1)
    {
        b = (al)c.a(al1, "listener cannot be null");
    }

    public final void b()
    {
        a.post(new cq(this));
    }
}
