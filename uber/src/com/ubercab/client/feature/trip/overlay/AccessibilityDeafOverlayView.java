// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import cgh;
import cgt;
import chc;
import chp;
import com.ubercab.client.feature.trip.address.AddressView;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import czi;
import dfp;
import gcg;
import gel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l;

// Referenced classes of package com.ubercab.client.feature.trip.overlay:
//            CoachMarkPathView

public class AccessibilityDeafOverlayView extends FrameLayout
    implements android.view.View.OnClickListener
{

    public chp a;
    public cgh b;
    private final chc c;
    private List d;
    AddressView mAddressView;
    CoachMarkPathView mCoachMarkPathView;
    ImageView mDriverImage;

    public AccessibilityDeafOverlayView(Context context)
    {
        this(context, null);
    }

    public AccessibilityDeafOverlayView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AccessibilityDeafOverlayView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = new gel(getResources(), 0x7f0d0078);
        d = new ArrayList();
        if (!isInEditMode())
        {
            ((dfp)((czi)context.getApplicationContext()).d()).a(this);
        }
    }

    private void a()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((gcg)iterator.next()).b()) { }
    }

    private void a(ImageView imageview, String s)
    {
        if (s == null)
        {
            imageview.setImageResource(0x7f020141);
            return;
        } else
        {
            b.a(s).c().a(0x7f080269, 0x7f080269).a(c).a(0x7f020141).b(0x7f020141).a(imageview);
            return;
        }
    }

    public final void a(Trip trip)
    {
        Object obj = trip.getDriver();
        if (obj == null)
        {
            return;
        }
        Object obj1 = ((TripDriver) (obj)).getPictureUrl();
        obj = ((TripDriver) (obj)).getName();
        a(mDriverImage, ((String) (obj1)));
        obj1 = (TextView)findViewById(0x7f0e0091);
        TextView textview = (TextView)findViewById(0x7f0e0090);
        if (trip.getDestination() != null)
        {
            ((TextView) (obj1)).setText(getContext().getString(0x7f0701c7, new Object[] {
                obj
            }));
            textview.setText(getContext().getString(0x7f0701c6, new Object[] {
                obj
            }));
            mAddressView.setVisibility(4);
            mCoachMarkPathView.setVisibility(4);
            a.a(l.i);
            return;
        } else
        {
            ((TextView) (obj1)).setText(getContext().getString(0x7f0701c5, new Object[] {
                obj
            }));
            textview.setText(getContext().getString(0x7f0701c4, new Object[] {
                obj
            }));
            mCoachMarkPathView.b();
            mCoachMarkPathView.a();
            a.a(l.h);
            return;
        }
    }

    public final void a(gcg gcg1)
    {
        d.add(gcg1);
    }

    public final void b(gcg gcg1)
    {
        d.remove(gcg1);
    }

    public void onAddressClick()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((gcg)iterator.next()).a()) { }
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
            startAnimation(AnimationUtils.loadAnimation(context, 0x7f04000c));
            return;
        }
    }
}
