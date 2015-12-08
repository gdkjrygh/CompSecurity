// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.RemoteException;
import android.view.View;
import com.google.android.apps.youtube.api.jar.a.ce;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.a;
import com.google.android.apps.youtube.core.player.overlay.b;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            bk

public final class bj
    implements a
{

    private final bk a;
    private ce b;

    public bj(Handler handler, ce ce1)
    {
        b = (ce)com.google.android.apps.youtube.common.fromguava.c.a(ce1, "client cannot be null");
        a = new bk(handler);
        try
        {
            ce1.a(a);
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

    public final void a(int i, int j)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        b.a(i, j);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void a(String s, boolean flag, boolean flag1, String s1)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        b.a(s, flag, flag1, s1);
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

    public final void setAdTitle(String s)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b.a(s);
        return;
        s;
    }

    public final void setChannel(Bitmap bitmap)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b.a(bitmap);
        return;
        bitmap;
    }

    public final void setFullscreen(boolean flag)
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

    public final void setListener(b b1)
    {
        a.a(b1);
    }
}
