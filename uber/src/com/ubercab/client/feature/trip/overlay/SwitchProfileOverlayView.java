// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.ubercab.client.feature.profiles.ProfileContainerView;
import czi;
import eyy;
import fqp;
import gco;
import hkr;

// Referenced classes of package com.ubercab.client.feature.trip.overlay:
//            CoachMarkPathView

public class SwitchProfileOverlayView extends RelativeLayout
{

    public hkr a;
    public eyy b;
    CoachMarkPathView mCoachMarkPathView;
    ProfileContainerView mProfileContainerView;

    public SwitchProfileOverlayView(Context context)
    {
        this(context, null);
    }

    public SwitchProfileOverlayView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SwitchProfileOverlayView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (!isInEditMode())
        {
            ((fqp)((czi)getContext()).d()).a(this);
        }
    }

    public final void a(int i)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)mProfileContainerView.getLayoutParams();
        layoutparams.setMargins(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.rightMargin, i);
    }

    public final void a(gco gco)
    {
        mProfileContainerView.a(gco);
    }

    public final void a(boolean flag)
    {
        mProfileContainerView.a(flag, false);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.inject(this);
            mCoachMarkPathView.b();
            mCoachMarkPathView.a();
            return;
        }
    }
}
