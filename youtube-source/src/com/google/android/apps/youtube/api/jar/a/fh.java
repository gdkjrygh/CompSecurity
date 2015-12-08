// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.br;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            dm, fi, fl, fj, 
//            fk

public final class fh extends dm
{

    private final br a;
    private final Handler b;

    public fh(br br1, Handler handler)
    {
        a = (br)com.google.android.apps.youtube.common.fromguava.c.a(br1, "target cannot be null");
        b = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler, "uiHandler cannot be null");
    }

    static br a(fh fh1)
    {
        return fh1.a;
    }

    public final void a()
    {
        b.post(new fi(this));
    }

    public final void a(Bitmap bitmap)
    {
        b.post(new fl(this, bitmap));
    }

    public final void b()
    {
        b.post(new fj(this));
    }

    public final void c()
    {
        b.post(new fk(this));
    }
}
