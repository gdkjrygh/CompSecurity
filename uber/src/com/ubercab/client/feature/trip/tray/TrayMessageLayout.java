// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.tray;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import czi;
import dal;
import fqp;
import geu;
import gfp;

public class TrayMessageLayout extends FrameLayout
{

    public dal a;
    private Interpolator b;
    private float c;
    private int d;
    private int e;
    public TextView mTextView;

    public TrayMessageLayout(Context context)
    {
        super(context);
        b = new AccelerateDecelerateInterpolator();
    }

    public TrayMessageLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new AccelerateDecelerateInterpolator();
    }

    public TrayMessageLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new AccelerateDecelerateInterpolator();
    }

    public static int a(TrayMessageLayout traymessagelayout)
    {
        return traymessagelayout.d;
    }

    public static int b(TrayMessageLayout traymessagelayout)
    {
        return traymessagelayout.e;
    }

    public static Interpolator c(TrayMessageLayout traymessagelayout)
    {
        return traymessagelayout.b;
    }

    public static float d(TrayMessageLayout traymessagelayout)
    {
        return traymessagelayout.c;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
        ((fqp)((czi)getContext()).d()).a(this);
        TypedValue typedvalue = new TypedValue();
        getResources().getValue(0x7f0802a8, typedvalue, true);
        c = typedvalue.getFloat();
        d = getContext().getResources().getDimensionPixelSize(0x7f0802a9);
        e = getContext().getResources().getDimensionPixelSize(0x7f0802a6);
        gfp.a(this, new geu(this));
    }
}
