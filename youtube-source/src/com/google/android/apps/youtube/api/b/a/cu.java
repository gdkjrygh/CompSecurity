// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.RemoteException;
import android.view.View;
import com.google.android.apps.youtube.api.jar.a.cz;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.be;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitlesStyle;
import java.util.List;

public final class cu
    implements be
{

    private cz a;

    public cu(cz cz1)
    {
        a = (cz)com.google.android.apps.youtube.common.fromguava.c.a(cz1, "client cannot be null");
    }

    public final void a()
    {
        a = null;
    }

    public final void a(List list)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        a.a(list);
        return;
        list;
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

    public final void setFontScale(float f)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        a.a(f);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setSubtitlesStyle(SubtitlesStyle subtitlesstyle)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        a.a(subtitlesstyle);
        return;
        subtitlesstyle;
    }
}
