// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.tray;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.ubercab.client.feature.music.MusicTrayView;
import czi;
import fqp;
import gdq;
import gew;
import gfp;
import gmg;

public class TrayMusicLayout extends FrameLayout
{

    public gmg a;
    private int b;
    private int c;
    public MusicTrayView mViewMusicTray;

    public TrayMusicLayout(Context context)
    {
        super(context);
    }

    public TrayMusicLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TrayMusicLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static int a(TrayMusicLayout traymusiclayout)
    {
        return traymusiclayout.b;
    }

    public static int b(TrayMusicLayout traymusiclayout)
    {
        return traymusiclayout.c;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ((fqp)((czi)getContext()).d()).a(this);
        ButterKnife.inject(this);
        gfp.a(this, new gew(this, (byte)0));
        b = getResources().getDimensionPixelSize(0x7f080299);
        c = getResources().getDimensionPixelSize(0x7f080298);
        mViewMusicTray.setBackgroundResource(0);
    }

    // Unreferenced inner class com/ubercab/client/feature/trip/tray/TrayMusicLayout$1

/* anonymous class */
    public final class _cls1
    {

        public static final int a[];

        static 
        {
            a = new int[gdq.values().length];
            try
            {
                a[gdq.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[gdq.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[gdq.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
