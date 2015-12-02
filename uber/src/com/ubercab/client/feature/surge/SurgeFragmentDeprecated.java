// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.surge;

import android.content.DialogInterface;
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
import czj;
import daj;
import dal;
import dfp;
import diw;
import dpg;
import drc;
import drf;
import dsk;
import dvb;
import foi;
import foj;
import fow;
import fpa;
import fpb;
import fpc;
import fpd;
import fpe;
import fpf;
import gju;
import hji;
import hkr;
import java.util.HashMap;
import java.util.Map;
import l;
import n;

public class SurgeFragmentDeprecated extends cyz
    implements dsk
{

    public static final String a = (new StringBuilder()).append(com/ubercab/client/feature/surge/SurgeFragmentDeprecated.getCanonicalName()).append(".surge").toString();
    public static final String b = (new StringBuilder()).append(com/ubercab/client/feature/surge/SurgeFragmentDeprecated.getCanonicalName()).append(".sobriety").toString();
    public chp c;
    public drc d;
    public cev g;
    public gju h;
    public hkr i;
    public hji j;
    public cgh k;
    public daj l;
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
    public dal n;
    private boolean o;
    private GmmProductSurge p;
    private DynamicFare q;
    private Handler r;

    public SurgeFragmentDeprecated()
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

    public static SurgeFragmentDeprecated a(boolean flag, GmmProductSurge gmmproductsurge)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("display_sobriety", flag);
        bundle.putParcelable("gmm_surge_displayed", gmmproductsurge);
        gmmproductsurge = new SurgeFragmentDeprecated();
        gmmproductsurge.setArguments(bundle);
        return gmmproductsurge;
    }

    private DynamicFare a(String s)
    {
        DynamicFare dynamicfare = null;
        Object obj = i.e();
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

    private void a(View view)
    {
        ButterKnife.inject(this, ((ViewStub)view.findViewById(0x7f0e056a)).inflate());
        view = a(getString(0x7f07045a, new Object[] {
            Float.valueOf(q.getMultiplier())
        }), String.valueOf(q.getMultiplier()), 0x7f0d0078);
        mSobrietyInstructions.setText(view);
        view = a(getString(0x7f07045b, new Object[] {
            Float.valueOf(q.getMultiplier())
        }), String.valueOf(q.getMultiplier()), 0x7f0d006f);
        mSobrietyNormalRate.setText(view);
        view = new HashMap();
        view.put(Character.valueOf('.'), Integer.valueOf(0x7f020326));
        mSobrietyMultiplierLayout.a(this);
        mSobrietyMultiplierLayout.a(String.valueOf(q.getMultiplier()), view);
    }

    private void a(View view, VehicleView vehicleview)
    {
        ButterKnife.inject(this, ((ViewStub)view.findViewById(0x7f0e0569)).inflate());
        Object obj = d.b();
        if (obj != null)
        {
            mSurgeRationaleTextView.setText(((CharSequence) (obj)));
        }
        mMultiplierTextView.setText(String.format("%sx", new Object[] {
            Float.valueOf(q.getMultiplier())
        }));
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
        long l1 = q.getExpirationTime();
        obj = dvb.a(getActivity(), l1 * 1000L, ",");
        mRateExpirationTextView.setText(getString(0x7f070456, new Object[] {
            obj
        }));
        obj = q.getDropNotification();
        if (obj != null && ((DropNotification) (obj)).isEnabled())
        {
            mNotificationButton.setVisibility(0);
        }
        if (a(vehicleview))
        {
            b(view);
        }
    }

    private void a(fow fow1)
    {
        fow1.a(this);
    }

    private boolean a(VehicleView vehicleview)
    {
        if (p != null && vehicleview != null && TextUtils.equals(p.a(), vehicleview.getUuid()))
        {
            vehicleview = p.b();
            if (vehicleview != null && !vehicleview.equals(Float.valueOf(q.getMultiplier())))
            {
                return true;
            }
        }
        return false;
    }

    private fow b(dfp dfp)
    {
        return foi.a().a(new diw(this)).a(dfp).a();
    }

    private void b(View view)
    {
        Object obj = e();
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

    private VehicleView d()
    {
        City city = i.b();
        if (city != null)
        {
            return city.findVehicleViewById(n.E());
        } else
        {
            return null;
        }
    }

    private Spanned e()
    {
        Float float1 = p.b();
        if (float1 == null)
        {
            return null;
        }
        int i1;
        if (Float.compare(float1.floatValue(), q.getMultiplier()) > 0)
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
                p.b()
            }), String.format("<b>%sx</b>", new Object[] {
                Float.valueOf(q.getMultiplier())
            })
        }));
    }

    public final cic a()
    {
        return cyz.e;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fow)czj);
    }

    public final void h_()
    {
        g.c(new fpf(q.getMultiplier()));
    }

    public final void i_()
    {
        c.a(n.hi);
        g.c(new fpa(q.getFareId()));
    }

    public void onAcceptClick()
    {
        c.a(n.hf);
        g.c(new fpa(q.getFareId()));
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        if (o)
        {
            g.c(new fpe());
            return;
        } else
        {
            g.c(new fpb());
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, 0x7f09017b);
        if (bundle != null)
        {
            p = (GmmProductSurge)bundle.getParcelable("gmm_surge_displayed");
        }
        r = new Handler(new android.os.Handler.Callback() {

            final SurgeFragmentDeprecated a;

            public final boolean handleMessage(Message message)
            {
                if (message.what == 1)
                {
                    a.g.c(new fpd());
                }
                return false;
            }

            
            {
                a = SurgeFragmentDeprecated.this;
                super();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = getArguments();
        if (bundle != null)
        {
            o = bundle.getBoolean("display_sobriety", false);
            p = (GmmProductSurge)bundle.getParcelable("gmm_surge_displayed");
        }
        return layoutinflater.inflate(0x7f0301c4, viewgroup, false);
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
        r.removeCallbacksAndMessages(null);
    }

    public void onResume()
    {
        super.onResume();
        Object obj = d();
        if (obj != null)
        {
            if ((obj = a(((VehicleView) (obj)).getId())) != null)
            {
                long l1;
                long l2;
                if (m.n())
                {
                    Long long1 = j.getLastTransactionTimeMillis();
                    if (long1 == null)
                    {
                        l1 = 0L;
                    } else
                    {
                        l1 = long1.longValue();
                    }
                } else
                {
                    l1 = l.c();
                }
                l2 = ((DynamicFare) (obj)).getExpirationTime();
                l1 = gju.b() - l1;
                if (l1 >= l2)
                {
                    g.c(new fpd());
                    return;
                } else
                {
                    r.sendEmptyMessageDelayed(1, (l2 - l1) * 1000L);
                    return;
                }
            }
        }
    }

    public void onSobrietyBackClick()
    {
        g.c(new fpe());
    }

    public void onSurgeNotificationClick()
    {
        c.a(n.hc);
        g.c(new fpc(q.getFareId()));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        bundle = d();
        DynamicFare dynamicfare;
        if (bundle != null)
        {
            if ((dynamicfare = a(bundle.getId())) != null)
            {
                q = dynamicfare;
                if (o)
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
