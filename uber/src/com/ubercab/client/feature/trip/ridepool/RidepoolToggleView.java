// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.ridepool;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import gdk;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.ubercab.client.feature.trip.ridepool:
//            RidepoolToggleItemView

public class RidepoolToggleView extends FrameLayout
{

    private final List a;
    RidepoolToggleItemView mLeftToggleView;
    RidepoolToggleItemView mRightToggleView;

    public RidepoolToggleView(Context context)
    {
        this(context, null, 0);
    }

    public RidepoolToggleView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RidepoolToggleView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new CopyOnWriteArrayList();
    }

    private void a()
    {
        mLeftToggleView.setSelected(true);
        mRightToggleView.setSelected(false);
    }

    private void b()
    {
        mRightToggleView.setSelected(true);
        mLeftToggleView.setSelected(false);
    }

    public final void a(gdk gdk1)
    {
        a.add(gdk1);
    }

    public final void a(String s)
    {
        mLeftToggleView.b(s);
    }

    public final void b(String s)
    {
        mLeftToggleView.c(s);
    }

    public final void c(String s)
    {
        mLeftToggleView.a(s);
    }

    public final void d(String s)
    {
        mRightToggleView.b(s);
    }

    public final void e(String s)
    {
        mRightToggleView.c(s);
    }

    public final void f(String s)
    {
        mRightToggleView.a(s);
    }

    public void onClickLeftToggleItem()
    {
        a();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gdk)iterator.next()).a()) { }
    }

    public void onClickRightToggleItem()
    {
        b();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gdk)iterator.next()).b()) { }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (!isInEditMode())
        {
            ButterKnife.inject(this);
        }
        int i = (int)getResources().getDimension(0x7f0801f0);
        int j = (int)getResources().getDimension(0x7f0801f1);
        mLeftToggleView.setBackgroundResource(0x7f0202ce);
        mLeftToggleView.setPadding(i, i, i, j);
        mRightToggleView.setBackgroundResource(0x7f0202cf);
        mRightToggleView.setPadding(i, i, i, j);
    }
}
