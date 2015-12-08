// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.RemoteException;
import com.google.android.apps.youtube.api.jar.a.ct;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.medialib.player.aa;
import com.google.android.apps.youtube.medialib.player.y;
import com.google.android.apps.youtube.medialib.player.z;

public abstract class a
    implements y
{

    protected z a;
    private ct b;

    public a(ct ct1)
    {
        b = (ct)com.google.android.apps.youtube.common.fromguava.c.a(ct1, "client cannot be null");
    }

    public final void a()
    {
        g();
        b = null;
    }

    public final boolean a(boolean flag)
    {
        return false;
    }

    public final int b()
    {
        throw new UnsupportedOperationException("Access to video frame dimensions not supported");
    }

    public final int c()
    {
        throw new UnsupportedOperationException("Access to video frame dimensions not supported");
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

    public final void e()
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        b.c();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void f()
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        if (a != null)
        {
            a.c();
        }
        b.a();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public void setListener(z z1)
    {
        a = (z)com.google.android.apps.youtube.common.fromguava.c.a(z1, "listener cannot be null");
    }

    public void setOnLetterboxChangedListener(aa aa)
    {
        throw new UnsupportedOperationException("Zoom not supported");
    }

    public void setVideoSize(int i, int j)
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

    public void setZoom(int i)
    {
        throw new UnsupportedOperationException("Zoom not supported");
    }
}
