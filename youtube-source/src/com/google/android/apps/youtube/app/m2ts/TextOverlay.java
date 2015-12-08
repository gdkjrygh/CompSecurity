// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.m2ts;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import com.google.android.apps.youtube.core.player.overlay.av;
import com.google.android.apps.youtube.core.player.overlay.ax;
import com.google.android.apps.youtube.core.ui.YouTubeTextView;
import com.google.android.youtube.g;

public class TextOverlay extends YouTubeTextView
    implements av, ax
{

    public TextOverlay(Context context)
    {
        super(context);
        setBackgroundColor(Color.argb(127, 0, 0, 0));
        setTextColor(Color.argb(127, 255, 255, 255));
        setGravity(17);
        setTextSize(2, context.getResources().getDimension(g.H));
        setVisibility(8);
    }

    public final View b()
    {
        return this;
    }

    public final com.google.android.apps.youtube.core.player.overlay.PlayerOverlaysLayout.LayoutParams c()
    {
        return new com.google.android.apps.youtube.core.player.overlay.PlayerOverlaysLayout.LayoutParams(-1, -1);
    }

    public void setMinimized(boolean flag)
    {
    }
}
