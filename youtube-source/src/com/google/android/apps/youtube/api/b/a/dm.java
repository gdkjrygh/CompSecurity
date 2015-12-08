// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Handler;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.bn;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            bh, dn, do

final class dm extends bh
{

    private final Handler a;
    private bn b;

    public dm(Handler handler)
    {
        a = (Handler)c.a(handler, "uiHandler cannot be null");
    }

    static bn a(dm dm1)
    {
        return dm1.b;
    }

    public final void a(int i, int j)
    {
        a.post(new dn(this, i, j));
    }

    public final void a(bn bn1)
    {
        b = (bn)c.a(bn1, "listener cannot be null");
    }

    public final void a(int ai[])
    {
        a.post(new do(this, ai));
    }
}
