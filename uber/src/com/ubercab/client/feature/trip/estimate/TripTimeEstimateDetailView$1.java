// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.estimate;

import cjf;
import cjk;
import cjn;
import cjw;
import cjz;
import cka;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.ui.TextView;
import fxz;

// Referenced classes of package com.ubercab.client.feature.trip.estimate:
//            TripTimeEstimateDetailView

final class e
    implements cka
{

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

    (TripTimeEstimateDetailView triptimeestimatedetailview, RiderLocation riderlocation, String s, String s1, String s2, fxz fxz1)
    {
        f = triptimeestimatedetailview;
        a = riderlocation;
        b = s;
        c = s1;
        d = s2;
        e = fxz1;
        super();
    }
}
