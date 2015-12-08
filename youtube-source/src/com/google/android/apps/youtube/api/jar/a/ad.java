// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.RemoteException;
import com.google.android.apps.youtube.api.b.a.af;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.b;

final class ad
    implements b
{

    private af a;

    public ad(af af1)
    {
        a = (af)com.google.android.apps.youtube.common.fromguava.c.a(af1, "service cannot be null");
    }

    public final void a()
    {
        a = null;
    }

    public final void a(int i, int j)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        a.a(i, j);
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
        a.b();
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
        a.c();
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
        a.d();
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }
}
