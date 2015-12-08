// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Handler;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.an;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            ay, ct

final class cs extends ay
    implements an
{

    private final Handler a;
    private an b;

    public cs(Handler handler)
    {
        a = (Handler)c.a(handler, "uiHandler cannot be null");
    }

    static an a(cs cs1)
    {
        return cs1.b;
    }

    public final void a(an an1)
    {
        b = (an)c.a(an1, "listener cannot be null");
    }

    public final void b()
    {
        a.post(new ct(this));
    }
}
