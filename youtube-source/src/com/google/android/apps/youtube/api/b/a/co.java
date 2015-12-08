// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Handler;
import android.os.RemoteException;
import android.view.View;
import com.google.android.apps.youtube.api.jar.a.cq;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.ak;
import com.google.android.apps.youtube.core.player.overlay.al;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            cp

public final class co
    implements ak
{

    private final cp a;
    private cq b;

    public co(Handler handler, cq cq1)
    {
        b = (cq)com.google.android.apps.youtube.common.fromguava.c.a(cq1, "client cannot be null");
        a = new cp(handler);
        try
        {
            cq1.a(a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Handler handler)
        {
            return;
        }
    }

    public final void a()
    {
        b = null;
    }

    public final void a(long l, boolean flag, boolean flag1)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        b.a(l, flag, flag1);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final View b()
    {
        return null;
    }

    public final com.google.android.apps.youtube.core.player.overlay.PlayerOverlaysLayout.LayoutParams c()
    {
        return null;
    }

    public final void d()
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        b.a();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setListener(al al)
    {
        a.a(al);
    }
}
