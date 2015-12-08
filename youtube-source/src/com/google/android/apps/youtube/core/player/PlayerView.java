// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.youtube.core.BaseApplication;
import com.google.android.apps.youtube.core.a;
import com.google.android.apps.youtube.core.player.overlay.PlayerOverlaysLayout;
import com.google.android.apps.youtube.core.utils.l;
import com.google.android.apps.youtube.medialib.player.DefaultPlayerSurface;
import com.google.android.apps.youtube.medialib.player.v14.SafeTexturePlayerSurface;
import com.google.android.apps.youtube.medialib.player.y;

public class PlayerView extends PlayerOverlaysLayout
{

    private y a;
    private View b;
    private boolean c;

    public PlayerView(Context context)
    {
        this(context, null);
    }

    public PlayerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (l.a(((BaseApplication)((Activity)context).getApplication()).y().au()))
        {
            c = false;
            context = new SafeTexturePlayerSurface(context);
            a = context;
            b = context;
            setVideoView(b);
            return;
        } else
        {
            c = true;
            context = new DefaultPlayerSurface(context);
            a = context;
            b = context;
            setVideoView(b);
            return;
        }
    }

    public final y b()
    {
        return a;
    }

    public void setSliding(boolean flag)
    {
        if (c)
        {
            if (flag)
            {
                b.setVisibility(8);
            } else
            {
                b.setVisibility(0);
            }
        }
        super.setSliding(flag);
    }
}
