// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.tray;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.Button;
import czi;
import dbf;
import fqp;
import geo;
import gfn;
import gfp;
import gmg;

public class TrayContactLayout extends LinearLayout
{

    public gmg a;
    public gfn b;
    private int c;
    public Button mContactButton;

    public TrayContactLayout(Context context)
    {
        super(context);
    }

    public TrayContactLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TrayContactLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private boolean a()
    {
        return a.a(dbf.ai);
    }

    public static boolean a(TrayContactLayout traycontactlayout)
    {
        return traycontactlayout.a();
    }

    public static int b(TrayContactLayout traycontactlayout)
    {
        return traycontactlayout.c;
    }

    protected void onContact()
    {
        b.g();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ((fqp)((czi)getContext()).d()).a(this);
            ButterKnife.inject(this);
            gfp.a(this, new geo(this, (byte)0));
            c = getResources().getDimensionPixelSize(0x7f08029d);
            return;
        }
    }
}
