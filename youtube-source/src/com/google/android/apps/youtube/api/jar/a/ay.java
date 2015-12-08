// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.RemoteException;
import com.google.android.apps.youtube.api.b.a.ai;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.h;

final class ay
    implements h
{

    private ai a;

    public ay(ai ai1)
    {
        a = (ai)com.google.android.apps.youtube.common.fromguava.c.a(ai1, "service cannot be null");
    }

    public final void a()
    {
        a = null;
    }

    public final void a(boolean flag)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        a.a(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }

    public final void b()
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        a.c();
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }

    public final void c()
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        a.a();
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }

    public final void d()
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        a.b();
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }

    public final void e()
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        a.d();
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }
}
