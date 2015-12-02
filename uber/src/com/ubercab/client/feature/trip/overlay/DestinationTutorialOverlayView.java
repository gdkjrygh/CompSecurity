// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.overlay;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import chp;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.feature.trip.address.AddressView;
import dal;
import dfp;
import gck;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l;

// Referenced classes of package com.ubercab.client.feature.trip.overlay:
//            CoachMarkPathView

public class DestinationTutorialOverlayView extends FrameLayout
    implements android.view.View.OnClickListener
{

    public chp a;
    public dal b;
    private int c;
    private ObjectAnimator d;
    private List e;
    AddressView mAddressView;
    CoachMarkPathView mCoachMarkPathView;
    ViewGroup mViewGroupText;

    public DestinationTutorialOverlayView(Context context)
    {
        this(context, null);
    }

    public DestinationTutorialOverlayView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DestinationTutorialOverlayView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        e = new CopyOnWriteArrayList();
        if (!isInEditMode())
        {
            ((RiderApplication)context.getApplicationContext()).b().a(this);
        }
    }

    private void a()
    {
        setVisibility(8);
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((gck)iterator.next()).b()) { }
    }

    private void b()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((gck)iterator.next()).c()) { }
    }

    public final void a(int i)
    {
        setVisibility(0);
        mCoachMarkPathView.b();
        getBackground().setAlpha(0);
        mViewGroupText.setAlpha(0.0F);
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)mAddressView.getLayoutParams();
        layoutparams.topMargin = i;
        mAddressView.setLayoutParams(layoutparams);
        d.start();
        mCoachMarkPathView.a();
        mViewGroupText.animate().alpha(1.0F).setDuration(c).setStartDelay(c).start();
        a.a(l.aT);
        b();
    }

    public final void a(gck gck1)
    {
        e.add(gck1);
    }

    public final void b(gck gck1)
    {
        e.remove(gck1);
    }

    public void onAddressClick()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((gck)iterator.next()).a()) { }
        a();
    }

    public void onClick(View view)
    {
        a();
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
            setOnClickListener(this);
            mAddressView.c(8);
            mAddressView.a(0);
            mAddressView.b(0);
            Context context = getContext();
            mAddressView.b(context.getString(0x7f0701d9));
            d = ObjectAnimator.ofInt(getBackground(), "alpha", new int[] {
                0, 255
            });
            d.setDuration(getResources().getInteger(0x7f0b0009));
            c = getResources().getInteger(0x7f0b000a);
            return;
        }
    }
}
