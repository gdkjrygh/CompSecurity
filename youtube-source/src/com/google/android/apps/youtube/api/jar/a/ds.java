// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.RemoteException;
import com.google.android.apps.youtube.api.b.a.au;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.al;

final class ds
    implements al
{

    private au a;

    public ds(au au1)
    {
        a = (au)c.a(au1, "service cannot be null");
    }

    public final void a()
    {
        a = null;
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
}
