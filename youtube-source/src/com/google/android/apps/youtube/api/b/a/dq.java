// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.graphics.Bitmap;
import android.os.RemoteException;
import android.view.View;
import com.google.android.apps.youtube.api.jar.a.dl;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.br;

public final class dq
    implements br
{

    private dl a;

    public dq(dl dl1)
    {
        a = (dl)com.google.android.apps.youtube.common.fromguava.c.a(dl1, "client cannot be null");
    }

    public final void a()
    {
        a = null;
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
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        a.a();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void e()
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        a.b();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void f()
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        a.c();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setThumbnail(Bitmap bitmap)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        a.a(bitmap);
        return;
        bitmap;
    }
}
