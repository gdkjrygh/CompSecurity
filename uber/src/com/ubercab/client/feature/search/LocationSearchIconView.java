// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.ubercab.client.core.app.RiderApplication;

public class LocationSearchIconView extends ImageView
{

    private int a;
    private Animation b;

    public LocationSearchIconView(Context context)
    {
        this(context, null);
    }

    public LocationSearchIconView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LocationSearchIconView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = AnimationUtils.loadAnimation(context, 0x7f04000f);
        b.setInterpolator(new LinearInterpolator());
    }

    public final void a()
    {
        setAnimation(null);
        setImageResource(a);
    }

    public final void a(int i)
    {
        a = i;
    }

    public final void b()
    {
        setImageResource(0x7f0201fe);
        if (!((RiderApplication)getContext().getApplicationContext()).i())
        {
            setAnimation(b);
        }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
    }
}
