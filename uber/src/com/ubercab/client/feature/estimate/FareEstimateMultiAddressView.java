// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.estimate;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.feature.trip.address.AddressView;
import eaz;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FareEstimateMultiAddressView extends LinearLayout
{

    private List a;
    AddressView mAddressViewDestination;
    AddressView mAddressViewPickup;

    public FareEstimateMultiAddressView(Context context)
    {
        this(context, null);
    }

    public FareEstimateMultiAddressView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FareEstimateMultiAddressView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new CopyOnWriteArrayList();
    }

    public final void a(RiderLocation riderlocation, RiderLocation riderlocation1)
    {
        mAddressViewPickup.a(riderlocation);
        mAddressViewDestination.a(riderlocation1);
    }

    public final void a(eaz eaz1)
    {
        a.add(eaz1);
    }

    public final void a(String s)
    {
        mAddressViewPickup.a(s);
    }

    public final void b(eaz eaz1)
    {
        a.remove(eaz1);
    }

    public final void b(String s)
    {
        mAddressViewPickup.b(s);
    }

    public final void c(String s)
    {
        mAddressViewDestination.a(s);
    }

    public void onClickAddressViewDestination()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((eaz)iterator.next()).b()) { }
    }

    public void onClickAddressViewPickup()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((eaz)iterator.next()).a()) { }
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
            mAddressViewPickup.e(0x7f02027f);
            mAddressViewPickup.f(0x7f02010d);
            mAddressViewPickup.a(2);
            mAddressViewPickup.b(1);
            mAddressViewDestination.e(0x7f02012e);
            mAddressViewDestination.f(0x7f0200e9);
            mAddressViewDestination.a(2);
            mAddressViewDestination.b(1);
            return;
        }
    }
}
