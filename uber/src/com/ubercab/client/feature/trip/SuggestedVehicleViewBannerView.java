// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import czi;
import dux;
import fqi;
import fqp;

public class SuggestedVehicleViewBannerView extends LinearLayout
    implements android.view.View.OnClickListener
{

    private fqi a;
    TextView mViewSuggestedVehicleViewText;

    public SuggestedVehicleViewBannerView(Context context)
    {
        this(context, null);
    }

    public SuggestedVehicleViewBannerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SuggestedVehicleViewBannerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setOnClickListener(this);
        if (!isInEditMode())
        {
            ((fqp)((czi)context).d()).a(this);
        }
    }

    public final void a()
    {
        a = null;
        ButterKnife.reset(this);
        ((ViewGroup)getParent()).removeView(this);
    }

    public final void a(fqi fqi1)
    {
        a = fqi1;
    }

    public final void a(String s)
    {
        setVisibility(0);
        s = dux.a(s, getResources().getColor(0x7f0d007d));
        mViewSuggestedVehicleViewText.setText(s);
    }

    public void onClick(View view)
    {
        a.a();
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
    }
}
