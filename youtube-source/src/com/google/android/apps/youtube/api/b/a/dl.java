// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Handler;
import android.os.RemoteException;
import android.view.View;
import com.google.android.apps.youtube.api.jar.a.di;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.bm;
import com.google.android.apps.youtube.core.player.overlay.bn;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            dm

public final class dl
    implements bm
{

    private final dm a;
    private final di b;

    public dl(Handler handler, di di1)
    {
        b = (di)com.google.android.apps.youtube.common.fromguava.c.a(di1, "client cannot be null");
        a = new dm(handler);
        try
        {
            di1.a(a);
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
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        b.a();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void a(int i)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b.a(i);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void a(String s, List list, boolean flag)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        b.a(s, list, flag);
        return;
        s;
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
        b.b();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setListener(bn bn)
    {
        a.a(bn);
    }

    public final void setVisible(boolean flag)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b.a(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }
}
