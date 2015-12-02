// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.estimate;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import cjf;
import cjk;
import cjn;
import cjw;
import cjy;
import cjz;
import cka;
import com.ubercab.android.map.MapView;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.ui.TextView;
import fxz;
import gjz;

public class TripTimeEstimateDetailView extends RelativeLayout
{

    TextView mArrivalTime;
    TextView mDestinationAddress;
    TextView mLateArrivalMessage;
    MapView mMapView;
    TextView mTimeRange;

    public TripTimeEstimateDetailView(Context context)
    {
        this(context, null);
    }

    public TripTimeEstimateDetailView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TripTimeEstimateDetailView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void a()
    {
        mMapView.e();
    }

    public final void a(Bundle bundle, cjy cjy)
    {
        mMapView.a(bundle, cjy);
    }

    public final void a(RiderLocation riderlocation, String s, String s1, String s2, fxz fxz)
    {
        gjz.a(riderlocation);
        gjz.a(s1);
        gjz.a(s2);
        gjz.a(s);
        gjz.a(fxz);
        mMapView.a(new cka(riderlocation, s1, s2, s, fxz) {

            final RiderLocation a;
            final String b;
            final String c;
            final String d;
            final fxz e;
            final TripTimeEstimateDetailView f;

            public final void a(cjn cjn1)
            {
                Object obj = cjn1.c();
                ((cjw) (obj)).c();
                ((cjw) (obj)).d();
                ((cjw) (obj)).i();
                ((cjw) (obj)).e();
                ((cjw) (obj)).g();
                ((cjw) (obj)).a(false);
                ((cjw) (obj)).f();
                ((cjw) (obj)).b(false);
                new cjk();
                cjn1.b(cjk.a(a.getUberLatLng(), 15F));
                new cjf();
                obj = cjf.a(0x7f020284);
                cjn1.a((new cjz()).a(((cje) (obj))).a(a.getUberLatLng()));
                f.mDestinationAddress.setText(a.getShortAddress());
                f.mLateArrivalMessage.setText(b);
                f.mTimeRange.setText(c);
                f.mArrivalTime.setText(d);
                e.e();
            }

            
            {
                f = TripTimeEstimateDetailView.this;
                a = riderlocation;
                b = s;
                c = s1;
                d = s2;
                e = fxz1;
                super();
            }
        });
    }

    public final void b()
    {
        mMapView.d();
    }

    public final void c()
    {
        mMapView.b();
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
            return;
        }
    }
}
