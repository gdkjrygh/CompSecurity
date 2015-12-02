// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.surge;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.Toast;
import butterknife.ButterKnife;
import cev;
import cgh;
import cgt;
import chp;
import cic;
import com.ubercab.client.core.ui.DiscreteCharacterInputLayout;
import com.ubercab.client.core.vendor.google.GmmProductSurge;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.DropNotification;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import cwm;
import cwz;
import cyz;
import czb;
import czj;
import daj;
import dal;
import dfp;
import djb;
import dpg;
import drc;
import drf;
import dsk;
import dvb;
import fok;
import fol;
import fov;
import fpa;
import fpc;
import fpd;
import fpe;
import fpf;
import gju;
import gmg;
import hji;
import hkr;
import java.util.HashMap;
import java.util.Map;
import l;
import n;

public class SurgeFragment extends czb
    implements dsk
{

    public chp c;
    public drc d;
    public cev e;
    public hkr f;
    public hji g;
    public dal h;
    public daj i;
    public gju j;
    public cgh k;
    public gmg l;
    public dpg m;
    TextView mMultiplierTextView;
    Button mNotificationButton;
    TextView mRateExpirationTextView;
    TextView mSobrietyInstructions;
    DiscreteCharacterInputLayout mSobrietyMultiplierLayout;
    TextView mSobrietyNormalRate;
    ImageView mSurgeFareTypeImageView;
    TextView mSurgeFareTypeTextView;
    TextView mSurgeRationaleTextView;
    private boolean n;
    private GmmProductSurge o;
    private DynamicFare p;
    private Handler q;

    public SurgeFragment()
    {
    }

    private Spannable a(String s, String s1, int i1)
    {
        SpannableString spannablestring = new SpannableString(s);
        int j1 = s.indexOf(s1);
        if (j1 >= 0)
        {
            spannablestring.setSpan(new ForegroundColorSpan(getResources().getColor(i1)), j1, s1.length() + j1, 18);
        }
        return spannablestring;
    }

    public static SurgeFragment a(boolean flag, GmmProductSurge gmmproductsurge)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("display_sobriety", flag);
        bundle.putParcelable("gmm_surge_displayed", gmmproductsurge);
        gmmproductsurge = new SurgeFragment();
        gmmproductsurge.setArguments(bundle);
        return gmmproductsurge;
    }

    private DynamicFare a(String s)
    {
        DynamicFare dynamicfare = null;
        Object obj = f.e();
        if (obj != null)
        {
            obj = ((Eyeball) (obj)).getDynamicFares();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            dynamicfare = (DynamicFare)((Map) (obj)).get(s);
        }
        return dynamicfare;
    }

    private VehicleView a()
    {
        City city = f.b();
        if (city != null)
        {
            return city.findVehicleViewById(h.E());
        } else
        {
            return null;
        }
    }

    private void a(View view)
    {
        ButterKnife.inject(this, ((ViewStub)view.findViewById(0x7f0e056a)).inflate());
        view = a(getString(0x7f07045a, new Object[] {
            Float.valueOf(p.getMultiplier())
        }), String.valueOf(p.getMultiplier()), 0x7f0d0078);
        mSobrietyInstructions.setText(view);
        view = a(getString(0x7f07045b, new Object[] {
            Float.valueOf(p.getMultiplier())
        }), String.valueOf(p.getMultiplier()), 0x7f0d006f);
        mSobrietyNormalRate.setText(view);
        view = new HashMap();
        view.put(Character.valueOf('.'), Integer.valueOf(0x7f020326));
        mSobrietyMultiplierLayout.a(this);
        mSobrietyMultiplierLayout.a(String.valueOf(p.getMultiplier()), view);
    }

    private void a(View view, VehicleView vehicleview)
    {
        ButterKnife.inject(this, ((ViewStub)view.findViewById(0x7f0e0569)).inflate());
        Object obj = d.b();
        if (obj != null)
        {
            mSurgeRationaleTextView.setText(((CharSequence) (obj)));
        }
        mMultiplierTextView.setText((new StringBuilder()).append(p.getMultiplier()).append("x").toString());
        String s = vehicleview.getGroupDisplayName();
        obj = s;
        if (TextUtils.isEmpty(s))
        {
            obj = vehicleview.getDescription();
        }
        mSurgeFareTypeTextView.setText(getString(0x7f070450, new Object[] {
            obj
        }));
        obj = drf.a(vehicleview);
        k.a(((android.net.Uri) (obj))).a(mSurgeFareTypeImageView);
        mSurgeFareTypeImageView.setContentDescription(vehicleview.getDescription());
        long l1 = p.getExpirationTime();
        obj = dvb.a(getActivity(), l1 * 1000L, ",");
        mRateExpirationTextView.setText(getString(0x7f070456, new Object[] {
            obj
        }));
        obj = p.getDropNotification();
        if (obj != null && ((DropNotification) (obj)).isEnabled())
        {
            mNotificationButton.setVisibility(0);
        }
        if (a(vehicleview))
        {
            b(view);
        }
    }

    private void a(fov fov1)
    {
        fov1.a(this);
    }

    private boolean a(VehicleView vehicleview)
    {
        if (o != null && vehicleview != null && TextUtils.equals(o.a(), vehicleview.getUuid()))
        {
            vehicleview = o.b();
            if (vehicleview != null && !vehicleview.equals(Float.valueOf(p.getMultiplier())))
            {
                return true;
            }
        }
        return false;
    }

    private fov b(dfp dfp)
    {
        return fok.a().a(new djb(this)).a(dfp).a();
    }

    private void b(View view)
    {
        Object obj = g();
        if (obj == null)
        {
            return;
        }
        obj = Toast.makeText(view.getContext(), ((CharSequence) (obj)), 1);
        ((Toast) (obj)).setGravity(49, 0, cwm.b(view.getContext()));
        view = ((Toast) (obj)).getView();
        if (view != null)
        {
            view = (android.widget.TextView)view.findViewById(0x102000b);
            if (view != null)
            {
                view.setGravity(17);
            }
        }
        ((Toast) (obj)).show();
    }

    private Spanned g()
    {
        Float float1 = o.b();
        if (float1 == null)
        {
            return null;
        }
        int i1;
        if (Float.compare(float1.floatValue(), p.getMultiplier()) > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            i1 = 0x7f070455;
        } else
        {
            i1 = 0x7f070457;
        }
        return Html.fromHtml(getString(i1, new Object[] {
            String.format("<b>%sx</b>", new Object[] {
                o.b()
            }), String.format("<b>%sx</b>", new Object[] {
                Float.valueOf(p.getMultiplier())
            })
        }));
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fov)czj);
    }

    public final cic f()
    {
        return cyz.e;
    }

    public final void h_()
    {
        e.c(new fpf(p.getMultiplier()));
    }

    public final void i_()
    {
        c.a(n.hi);
        e.c(new fpa(p.getFareId()));
    }

    public void onAcceptClick()
    {
        c.a(n.hf);
        e.c(new fpa(p.getFareId()));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            o = (GmmProductSurge)bundle.getParcelable("gmm_surge_displayed");
        }
        q = new Handler(new android.os.Handler.Callback() {

            final SurgeFragment a;

            public final boolean handleMessage(Message message)
            {
                if (message.what == 1)
                {
                    a.e.c(new fpd());
                }
                return false;
            }

            
            {
                a = SurgeFragment.this;
                super();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = getArguments();
        if (bundle != null)
        {
            n = bundle.getBoolean("display_sobriety", false);
            o = (GmmProductSurge)bundle.getParcelable("gmm_surge_displayed");
        }
        return layoutinflater.inflate(0x7f0301c3, viewgroup, false);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (mSobrietyMultiplierLayout != null)
        {
            mSobrietyMultiplierLayout.b(this);
        }
        ButterKnife.reset(this);
    }

    public void onPause()
    {
        super.onPause();
        cwz.b(getActivity(), mSobrietyMultiplierLayout);
        q.removeCallbacksAndMessages(null);
    }

    public void onResume()
    {
        super.onResume();
        Object obj = a();
        if (obj != null)
        {
            if ((obj = a(((VehicleView) (obj)).getId())) != null)
            {
                long l1;
                long l2;
                if (m.n())
                {
                    Long long1 = g.getLastTransactionTimeMillis();
                    if (long1 == null)
                    {
                        l1 = 0L;
                    } else
                    {
                        l1 = long1.longValue();
                    }
                } else
                {
                    l1 = i.c();
                }
                l2 = ((DynamicFare) (obj)).getExpirationTime();
                l1 = gju.b() - l1;
                if (l1 >= l2)
                {
                    e.c(new fpd());
                    return;
                } else
                {
                    q.sendEmptyMessageDelayed(1, (l2 - l1) * 1000L);
                    return;
                }
            }
        }
    }

    public void onSobrietyBackClick()
    {
        e.c(new fpe());
    }

    public void onSurgeNotificationClick()
    {
        c.a(n.hc);
        e.c(new fpc(p.getFareId()));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        bundle = a();
        DynamicFare dynamicfare;
        if (bundle != null)
        {
            if ((dynamicfare = a(bundle.getId())) != null)
            {
                p = dynamicfare;
                if (n)
                {
                    c.a(l.id);
                    a(view);
                    return;
                } else
                {
                    c.a(l.ic);
                    a(view, bundle);
                    return;
                }
            }
        }
    }
}
