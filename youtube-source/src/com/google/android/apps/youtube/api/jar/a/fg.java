// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.RemoteException;
import com.google.android.apps.youtube.api.b.a.bg;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.bn;

final class fg
    implements bn
{

    private bg a;

    public fg(bg bg1)
    {
        a = (bg)c.a(bg1, "service cannot be null");
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
        L.c((new StringBuilder("survey call to onClickSkipButton failed ")).append(remoteexception).toString());
        return;
    }

    public final void a(int ai[])
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        a.a(ai);
        return;
        ai;
        L.c((new StringBuilder("survey call to onAnswer failed ")).append(ai).toString());
        return;
    }
}
