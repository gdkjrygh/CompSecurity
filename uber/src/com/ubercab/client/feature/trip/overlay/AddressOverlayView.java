// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.overlay;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.ubercab.client.feature.trip.address.AddressView;
import gcj;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.ubercab.client.feature.trip.overlay:
//            CoachMarkPathView

public class AddressOverlayView extends LinearLayout
{

    private int a;
    private ObjectAnimator b;
    private List c;
    AddressView mAddressView;
    CoachMarkPathView mCoachMarkPathView;
    TextView mTextBody;
    TextView mTextTitle;
    ViewGroup mViewGroupText;

    public AddressOverlayView(Context context)
    {
        this(context, null);
    }

    public AddressOverlayView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AddressOverlayView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = new CopyOnWriteArrayList();
    }

    public final AddressView a()
    {
        return mAddressView;
    }

    public final void a(int i)
    {
        mCoachMarkPathView.a(1.0F);
        mCoachMarkPathView.a(i);
    }

    public final void a(gcj gcj1)
    {
        c.add(gcj1);
    }

    public final void a(String s, String s1)
    {
        mTextTitle.setText(s);
        mTextBody.setText(s1);
    }

    public final void b(int i)
    {
        setVisibility(0);
        mCoachMarkPathView.b();
        getBackground().setAlpha(0);
        mViewGroupText.setAlpha(0.0F);
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)mAddressView.getLayoutParams();
        layoutparams.topMargin = i;
        mAddressView.setLayoutParams(layoutparams);
        b.start();
        mCoachMarkPathView.a();
        mViewGroupText.animate().alpha(1.0F).setDuration(a).setStartDelay(a).start();
    }

    public void onAddressClick()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((gcj)iterator.next()).b()) { }
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
            b = ObjectAnimator.ofInt(getBackground(), "alpha", new int[] {
                0, 255
            });
            b.setDuration(getResources().getInteger(0x7f0b0009));
            a = getResources().getInteger(0x7f0b000a);
            return;
        }
    }
}
