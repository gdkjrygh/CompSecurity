// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.estimate;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import butterknife.ButterKnife;
import cic;
import cjy;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.feature.mobilemessage.MobileMessageDraggableLayout;
import cyz;
import czj;
import dce;
import dfp;
import diw;
import dtz;
import eez;
import fte;
import fxx;
import fxy;
import fxz;
import fya;
import l;

// Referenced classes of package com.ubercab.client.feature.trip.estimate:
//            TripTimeEstimateDetailView

public class TripTimeEstimateDialogFragment extends cyz
    implements eez, fxz
{

    public RiderApplication a;
    public dce b;
    public fte c;
    TripTimeEstimateDetailView d;
    private cjy g;
    private Bundle h;
    MobileMessageDraggableLayout mLayoutModules;

    public TripTimeEstimateDialogFragment()
    {
    }

    private void a(fya fya1)
    {
        fya1.a(this);
    }

    private fya b(dfp dfp)
    {
        return fxx.a().a(new diw(this)).a(dfp).a();
    }

    private void f()
    {
        mLayoutModules.setVisibility(8);
        (new Handler()).post(new Runnable() {

            final TripTimeEstimateDialogFragment a;

            public final void run()
            {
                a.dismiss();
            }

            
            {
                a = TripTimeEstimateDialogFragment.this;
                super();
            }
        });
    }

    public final cic a()
    {
        return l.bp;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fya)czj);
    }

    public final void d()
    {
        mLayoutModules.b();
    }

    public final void e()
    {
        Animation animation = AnimationUtils.loadAnimation(getContext(), 0x7f04000c);
        animation.setDuration(450L);
        animation.setStartOffset(300L);
        mLayoutModules.startAnimation(animation);
        mLayoutModules.setVisibility(0);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(0, 0x103000a);
        g = dtz.a(a, b.a());
        h = bundle;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new Dialog(getActivity(), getTheme()) {

            final TripTimeEstimateDialogFragment a;

            public final void onBackPressed()
            {
                a.mLayoutModules.b();
            }

            
            {
                a = TripTimeEstimateDialogFragment.this;
                super(context, i);
            }
        };
        bundle.setOnShowListener(new android.content.DialogInterface.OnShowListener() {

            final TripTimeEstimateDialogFragment a;

            public final void onShow(DialogInterface dialoginterface)
            {
                dialoginterface = a.getArguments();
                a.d.a(a.c.i(), dialoginterface.getString("estimate_arrival_time"), dialoginterface.getString("late_arrival_message"), dialoginterface.getString("trip_time_range_text"), a);
            }

            
            {
                a = TripTimeEstimateDialogFragment.this;
                super();
            }
        });
        return bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f0300a9, viewgroup, false);
        ButterKnife.inject(this, viewgroup);
        d = (TripTimeEstimateDetailView)layoutinflater.inflate(0x7f0301dc, null, false);
        d.a(h, g);
        mLayoutModules.addView(d);
        mLayoutModules.setVisibility(8);
        viewgroup.setOnClickListener(new android.view.View.OnClickListener() {

            final TripTimeEstimateDialogFragment a;

            public final void onClick(View view)
            {
                a.mLayoutModules.b();
            }

            
            {
                a = TripTimeEstimateDialogFragment.this;
                super();
            }
        });
        mLayoutModules.a(this);
        return viewgroup;
    }

    public void onDestroy()
    {
        super.onDestroy();
        d.c();
    }

    public void onPause()
    {
        super.onPause();
        d.b();
    }

    public void onResume()
    {
        super.onResume();
        d.a();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    public final void p_()
    {
        f();
    }

    public final void q_()
    {
        f();
    }
}
