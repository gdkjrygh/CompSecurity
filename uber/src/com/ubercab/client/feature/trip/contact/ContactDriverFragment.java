// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.contact;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import com.ubercab.ui.Button;
import cys;
import cyz;
import czj;
import dfp;
import diw;
import doc;
import drc;
import fte;
import fur;
import fut;
import fuw;
import fux;
import fzc;
import gmg;
import hkr;
import java.util.Map;
import l;
import n;

public class ContactDriverFragment extends cyz
{

    public chp a;
    public drc b;
    public hkr c;
    public gmg d;
    public cys g;
    private String h;
    Button mCallButton;
    Button mSmsButton;
    TextView mTextViewDeafDriver;
    View mViewDeafDriver;

    public ContactDriverFragment()
    {
    }

    static String a(ContactDriverFragment contactdriverfragment)
    {
        return contactdriverfragment.h;
    }

    public static void a(RiderActivity rideractivity)
    {
        (new ContactDriverFragment()).show(rideractivity.getSupportFragmentManager(), com/ubercab/client/feature/trip/contact/ContactDriverFragment.getName());
    }

    private void a(fur fur1)
    {
        fur1.a(this);
    }

    private fur b(dfp dfp)
    {
        return fuw.a().a(new diw(this)).a(dfp).a();
    }

    public final cic a()
    {
        return l.aB;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fur)czj);
    }

    public void onClickButtonCall()
    {
        a.a(n.N);
        RiderActivity rideractivity = b();
        if (g.a("android.permission.CALL_PHONE") || rideractivity == null)
        {
            fut.a(getActivity(), h);
            dismiss();
            return;
        } else
        {
            g.a(rideractivity, new doc() {

                final ContactDriverFragment a;

                public final void a(Map map, boolean flag)
                {
                    if (flag)
                    {
                        fut.a(a.getActivity(), ContactDriverFragment.a(a));
                    } else
                    {
                        fut.b(a.getActivity(), ContactDriverFragment.a(a));
                    }
                    a.dismissAllowingStateLoss();
                }

            
            {
                a = ContactDriverFragment.this;
                super();
            }
            }, new String[] {
                "android.permission.CALL_PHONE"
            });
            return;
        }
    }

    public void onClickButtonMessage()
    {
        fut.c(getActivity(), h);
        a.a(n.M);
        dismiss();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, 0x7f09017b);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030049, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroy();
        ButterKnife.reset(this);
    }

    public void onTripUiStateChangedEvent(fzc fzc1)
    {
        if (!fte.c(fzc1.b()))
        {
            dismiss();
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        byte byte0 = 8;
        super.onViewCreated(view, bundle);
        view = c.f();
        if (view != null)
        {
            view = view.getDriver();
        } else
        {
            view = null;
        }
        if (view == null)
        {
            dismiss();
        } else
        {
            h = view.getMobile();
            boolean flag = fut.a(b, d, view);
            boolean flag1 = fut.a(b);
            boolean flag2 = fut.a(d, view);
            bundle = mCallButton;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            bundle.setVisibility(i);
            bundle = mSmsButton;
            if (flag1)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            bundle.setVisibility(i);
            bundle = mViewDeafDriver;
            i = byte0;
            if (flag2)
            {
                i = 0;
            }
            bundle.setVisibility(i);
            if (flag2)
            {
                mTextViewDeafDriver.setText(getString(0x7f0701c2, new Object[] {
                    view.getName()
                }));
                return;
            }
        }
    }
}
