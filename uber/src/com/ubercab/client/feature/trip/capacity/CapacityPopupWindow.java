// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.capacity;

import android.app.Activity;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import cev;
import com.ubercab.rider.realtime.model.VehicleView;
import czd;
import fuh;
import fui;
import fvd;

// Referenced classes of package com.ubercab.client.feature.trip.capacity:
//            CapacityDraggableLayout

public class CapacityPopupWindow extends czd
    implements fuh
{

    private final FrameLayout a = (FrameLayout)LayoutInflater.from(a()).inflate(0x7f03003b, null, false);
    private fui b;
    CapacityDraggableLayout mLayoutModules;

    public CapacityPopupWindow(Activity activity, cev cev, VehicleView vehicleview)
    {
        super(activity, cev);
        ButterKnife.inject(this, a);
        setContentView(a);
        setAnimationStyle(0x7f0900d2);
        setWidth(-1);
        setHeight(-1);
        mLayoutModules.setVisibility(8);
        mLayoutModules.a(fvd.a(activity.getResources(), vehicleview));
        a.setOnClickListener(new android.view.View.OnClickListener() {

            final CapacityPopupWindow a;

            public final void onClick(View view)
            {
                a.mLayoutModules.a();
            }

            
            {
                a = CapacityPopupWindow.this;
                super();
            }
        });
        mLayoutModules.a(this);
        setOnDismissListener(new android.widget.PopupWindow.OnDismissListener() {

            final CapacityPopupWindow a;

            public final void onDismiss()
            {
                if (CapacityPopupWindow.a(a) != null)
                {
                    CapacityPopupWindow.a(a).a();
                }
            }

            
            {
                a = CapacityPopupWindow.this;
                super();
            }
        });
    }

    static fui a(CapacityPopupWindow capacitypopupwindow)
    {
        return capacitypopupwindow.b;
    }

    private void e()
    {
        mLayoutModules.setVisibility(8);
        mLayoutModules.removeAllViews();
        (new Handler()).post(new Runnable() {

            final CapacityPopupWindow a;

            public final void run()
            {
                if (a.isShowing())
                {
                    a.dismiss();
                }
            }

            
            {
                a = CapacityPopupWindow.this;
                super();
            }
        });
    }

    public final void a(int i)
    {
        if (b != null)
        {
            b.a(i);
        }
    }

    public final void a(fui fui1)
    {
        b = fui1;
    }

    public final void b()
    {
        mLayoutModules.a();
    }

    public final void c()
    {
        mLayoutModules.a();
    }

    public final void d()
    {
        showAtLocation(a().getWindow().getDecorView(), 48, 0, 0);
        TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F);
        translateanimation.setDuration(450L);
        translateanimation.setStartOffset(300L);
        mLayoutModules.startAnimation(translateanimation);
        mLayoutModules.setVisibility(0);
    }

    public final void o_()
    {
        e();
    }
}
