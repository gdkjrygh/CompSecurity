// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.contact;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Toast;
import butterknife.ButterKnife;
import chp;
import cia;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.AnonymousPhoneNumberResponse;
import com.ubercab.locale.phone.PhoneNumberView;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import cwm;
import cwz;
import cys;
import cyz;
import czj;
import dbf;
import dfp;
import diw;
import dkj;
import dlf;
import dlz;
import doc;
import drc;
import duj;
import fte;
import fup;
import fut;
import fuu;
import fuv;
import fzc;
import gmg;
import gpm;
import hkr;
import hrs;
import java.util.Map;
import l;
import n;

public class ContactDriverAnonymouslyFragment extends cyz
    implements gpm
{

    public chp a;
    public drc b;
    public hkr c;
    public gmg d;
    public cys g;
    public dkj h;
    int i;
    private boolean j;
    private PhoneNumberView k;
    Button mButtonCall;
    Button mButtonEdit;
    Button mButtonText;
    TextView mTextViewPhoneNumber;
    ViewStub mViewStubEdit;

    public ContactDriverAnonymouslyFragment()
    {
    }

    private void a(int i1, String s)
    {
        switch (i1)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Invalid action: ")).append(i1).toString());

        case 0: // '\0'
            fut.a(getActivity(), s);
            return;

        case 1: // '\001'
            fut.b(getActivity(), s);
            return;

        case 2: // '\002'
            fut.c(getActivity(), s);
            break;
        }
    }

    public static void a(RiderActivity rideractivity)
    {
        (new ContactDriverAnonymouslyFragment()).show(rideractivity.getSupportFragmentManager(), com/ubercab/client/feature/trip/contact/ContactDriverAnonymouslyFragment.getName());
    }

    static void a(ContactDriverAnonymouslyFragment contactdriveranonymouslyfragment, int i1)
    {
        contactdriveranonymouslyfragment.d(i1);
    }

    private void a(fup fup1)
    {
        fup1.a(this);
    }

    private void a(String s, cia cia, String s1)
    {
        s = AnalyticsEvent.create(s).setName(cia).setValue(s1);
        a.a(s);
    }

    private boolean a(int i1, AnonymousPhoneNumberResponse anonymousphonenumberresponse)
    {
        if (!d.a(dbf.cG)) goto _L2; else goto _L1
_L1:
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        if (TextUtils.isEmpty(anonymousphonenumberresponse.getAnonymousVoiceNumber())) goto _L6; else goto _L5
_L5:
        return true;
_L6:
        return false;
_L4:
        if (i1 != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(anonymousphonenumberresponse.getAnonymousSmsNumber()))
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (TextUtils.isEmpty(anonymousphonenumberresponse.getAnonymousNumber()))
        {
            return false;
        }
        if (true) goto _L5; else goto _L7
_L7:
        return false;
    }

    private fup b(dfp dfp)
    {
        return fuu.a().a(new diw(this)).a(dfp).a();
    }

    private String b(boolean flag)
    {
        return String.format("%s:%s", new Object[] {
            f(), String.valueOf(flag)
        });
    }

    private void d()
    {
        boolean flag = duj.e(k.g(), k.d());
        if (!flag)
        {
            k.a(new hrs(0x7f070288));
        } else
        {
            k.a(null);
        }
        mButtonCall.setEnabled(flag);
        mButtonText.setEnabled(flag);
    }

    private void d(int i1)
    {
        String s1 = null;
        cwz.a(getActivity());
        e(i1);
        String s;
        TripDriver tripdriver;
        Object obj;
        if (k != null)
        {
            s = duj.c(k.g(), k.d());
        } else
        {
            s = duj.c(mTextViewPhoneNumber.getText().toString(), null);
        }
        obj = c.f();
        if (obj != null)
        {
            tripdriver = ((Trip) (obj)).getDriver();
        } else
        {
            tripdriver = null;
        }
        if (tripdriver != null)
        {
            City city = c.b();
            if (city != null)
            {
                s1 = city.getCityName();
            }
            obj = ((Trip) (obj)).getUuid();
            if (3 == i1)
            {
                h.a(((String) (obj)), s1, s);
                return;
            } else
            {
                i = i1;
                h.a(tripdriver.getUuid(), ((String) (obj)), s1, s);
                return;
            }
        } else
        {
            cwm.a(getActivity(), 0x7f070353);
            dismiss();
            return;
        }
    }

    private void e(int i1)
    {
        i1;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 56
    //                   1 56
    //                   2 106
    //                   3 56;
           goto _L1 _L2 _L2 _L3 _L2
_L1:
        throw new IllegalArgumentException((new StringBuilder("Invalid action: ")).append(i1).toString());
_L2:
        mButtonCall.setText(0x7f0700a8);
_L5:
        mButtonEdit.setEnabled(false);
        mButtonText.setEnabled(false);
        mButtonCall.setEnabled(false);
        if (k != null)
        {
            k.setEnabled(false);
        }
        return;
_L3:
        mButtonText.setText(0x7f0700a8);
        if (true) goto _L5; else goto _L4
_L4:
    }

    private boolean e()
    {
        return d.a(dbf.cE);
    }

    private String f()
    {
        if (e())
        {
            return "anonymous_inbound";
        } else
        {
            return "anonymous_outbound";
        }
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
        a((fup)czj);
    }

    public final void a(String s)
    {
        j = true;
        d();
    }

    public final void a(boolean flag)
    {
    }

    public final boolean a(int i1)
    {
        return false;
    }

    public final void g_()
    {
        j = true;
        d();
    }

    public void onAnonymousPhoneNumberResponseEvent(dlf dlf1)
    {
        if (dlf1.i() && a(i, (AnonymousPhoneNumberResponse)dlf1.g()))
        {
            if (d.a(dbf.cG))
            {
                int i1 = i;
                if (i == 0)
                {
                    dlf1 = ((AnonymousPhoneNumberResponse)dlf1.g()).getAnonymousVoiceNumber();
                } else
                {
                    dlf1 = ((AnonymousPhoneNumberResponse)dlf1.g()).getAnonymousSmsNumber();
                }
                a(i1, dlf1);
            } else
            {
                a(i, ((AnonymousPhoneNumberResponse)dlf1.g()).getAnonymousNumber());
            }
        } else
        {
            cwm.a(getActivity(), 0x7f070353);
        }
        dismiss();
    }

    public void onClickCall()
    {
        a("tap", n.N, b(j));
        RiderActivity rideractivity = b();
        if (e())
        {
            d(3);
            return;
        }
        if (g.a("android.permission.CALL_PHONE") || rideractivity == null)
        {
            d(0);
            return;
        } else
        {
            g.a(rideractivity, new doc() {

                final ContactDriverAnonymouslyFragment a;

                public final void a(Map map, boolean flag)
                {
                    map = a;
                    int i1;
                    if (flag)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = 1;
                    }
                    ContactDriverAnonymouslyFragment.a(map, i1);
                }

            
            {
                a = ContactDriverAnonymouslyFragment.this;
                super();
            }
            }, new String[] {
                "android.permission.CALL_PHONE"
            });
            return;
        }
    }

    public void onClickEdit()
    {
        a("tap", n.K, f());
        if (mViewStubEdit == null || mViewStubEdit.getParent() == null)
        {
            return;
        } else
        {
            Object obj = mViewStubEdit.inflate();
            mViewStubEdit = null;
            k = (PhoneNumberView)((View) (obj)).findViewById(0x7f0e00cf);
            String s = mTextViewPhoneNumber.getText().toString();
            obj = duj.a(s, null);
            s = duj.d(s, null);
            k.a(s, ((String) (obj)));
            k.a(this);
            mTextViewPhoneNumber.setVisibility(8);
            mButtonEdit.setVisibility(8);
            d();
            return;
        }
    }

    public void onClickText()
    {
        a("tap", n.M, b(j));
        d(2);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, 0x7f09017b);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030047, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onInitiateAnonymousInboundCallResponseEvent(dlz dlz1)
    {
        if (dlz1.i())
        {
            Toast.makeText(getActivity(), 0x7f070354, 1).show();
        } else
        {
            cwm.a(getActivity(), 0x7f070353);
        }
        dismiss();
    }

    public void onResume()
    {
        super.onResume();
        a("impression", l.aB, f());
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
        Object obj = null;
        boolean flag = false;
        super.onViewCreated(view, bundle);
        view = c.c();
        if (view != null)
        {
            view = view.getMobile();
        } else
        {
            view = null;
        }
        if (TextUtils.isEmpty(view))
        {
            cwm.a(getActivity(), 0x7f070353);
            dismiss();
            return;
        }
        mTextViewPhoneNumber.setText(duj.a(view));
        if (e())
        {
            mButtonCall.setText(0x7f0700aa);
        }
        bundle = c.f();
        view = obj;
        if (bundle != null)
        {
            view = bundle.getDriver();
        }
        int i1;
        boolean flag1;
        if (view != null && fut.a(b, d, view))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        flag1 = fut.a(b);
        view = mButtonCall;
        if (i1 != 0)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
        view = mButtonText;
        if (flag1)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
    }
}
