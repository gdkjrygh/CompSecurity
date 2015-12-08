// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.Handler;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.be;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitlesStyle;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            da, ef, eh, ei, 
//            ee, eg

public final class ed extends da
{

    private final be a;
    private final Handler b;

    public ed(be be1, Handler handler)
    {
        a = (be)c.a(be1, "target cannot be null");
        b = (Handler)c.a(handler, "uiHandler cannot be null");
    }

    static be a(ed ed1)
    {
        return ed1.a;
    }

    public final void a()
    {
        b.post(new ef(this));
    }

    public final void a(float f)
    {
        b.post(new eh(this, f));
    }

    public final void a(SubtitlesStyle subtitlesstyle)
    {
        b.post(new ei(this, subtitlesstyle));
    }

    public final void a(List list)
    {
        b.post(new ee(this, list));
    }

    public final void b()
    {
        b.post(new eg(this));
    }
}
