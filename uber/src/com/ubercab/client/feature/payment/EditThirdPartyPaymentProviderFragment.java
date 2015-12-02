// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dar;
import dfp;
import djb;
import dkn;
import dlp;
import dpg;
import dui;
import dul;
import eoq;
import eor;
import eoy;
import epa;
import epi;
import epk;
import epl;
import epm;
import eri;
import eyy;
import hkj;
import hkr;
import hku;
import ica;
import icl;
import ico;
import java.util.List;
import l;

// Referenced classes of package com.ubercab.client.feature.payment:
//            EditPaymentProfileActivity

public class EditThirdPartyPaymentProviderFragment extends czb
{

    public chp c;
    public cev d;
    public hkr e;
    public hku f;
    public eoy g;
    public hkj h;
    public dpg i;
    public dkn j;
    public eyy k;
    public String l;
    private epa m;
    public Button mButtonDelete;
    ImageView mImageViewPaymentProvider;
    TextView mTextViewEmail;
    private icl n;
    private icl o;

    public EditThirdPartyPaymentProviderFragment()
    {
    }

    public static EditThirdPartyPaymentProviderFragment a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("payment_profile_uuid", s);
        s = new EditThirdPartyPaymentProviderFragment();
        s.setArguments(bundle);
        return s;
    }

    public static epa a(EditThirdPartyPaymentProviderFragment editthirdpartypaymentproviderfragment)
    {
        return editthirdpartypaymentproviderfragment.m;
    }

    private void a()
    {
        b(getString(0x7f0701d3));
        if (i.h())
        {
            n = h.a(l).a(ico.a()).a(new epl(this, (byte)0));
            return;
        } else
        {
            j.a(l);
            return;
        }
    }

    private void a(epm epm1)
    {
        epm1.a(this);
    }

    public static boolean a(EditThirdPartyPaymentProviderFragment editthirdpartypaymentproviderfragment, List list)
    {
        return editthirdpartypaymentproviderfragment.a(list);
    }

    private boolean a(List list)
    {
        List list1 = list;
        if (!k.f()) goto _L2; else goto _L1
_L1:
        if (list != null) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        list1 = dui.a(list);
_L2:
        if (list1 != null && list1.size() > 1)
        {
            return true;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private epm b()
    {
        return eoq.a().a(new djb(this)).a((epi)((EditPaymentProfileActivity)getActivity()).d()).a();
    }

    protected final czj a(dfp dfp)
    {
        return b();
    }

    public final void a(int i1, int j1)
    {
        if (i1 == 1 && j1 == -1)
        {
            a();
        }
    }

    public final volatile void a(czj czj)
    {
        a((epm)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onClickButtonDelete()
    {
        c.a(l.dZ);
        eoy.a(d());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            l = bundle.getString("payment_profile_uuid");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030123, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDeletePaymentProfileResponseEvent(dlp dlp1)
    {
        e();
        if (!dlp1.e())
        {
            c(dlp1.a(getActivity()));
            return;
        } else
        {
            c.a(l.ec);
            return;
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onPause()
    {
        super.onPause();
        m = null;
        o.b();
        if (n != null)
        {
            n.b();
        }
    }

    public void onPingEvent(dar dar1)
    {
        if (i.n())
        {
            return;
        }
        dar1 = dar1.a();
        if (!dul.k(dar1))
        {
            d.c(new eri());
            return;
        }
        if (dar1.getClient().findPaymentProfileByUuid(l) == null)
        {
            d.c(new eri());
            return;
        }
        boolean flag = a(dar1.getClient().getPaymentProfiles());
        dar1 = mButtonDelete;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        dar1.setVisibility(i1);
    }

    public void onResume()
    {
        super.onResume();
        m = (epa)getActivity();
        o = f.d().c(new epk(this, (byte)0));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        view = e.c();
        if (view != null)
        {
            view = view.findPaymentProfileByUuid(l);
        } else
        {
            view = null;
        }
        if (view == null)
        {
            return;
        }
        mTextViewEmail.setText(view.getAccountName());
        view = view.getCardType();
        if (view == null) goto _L2; else goto _L1
_L1:
        byte byte0 = -1;
        view.hashCode();
        JVM INSTR lookupswitch 3: default 100
    //                   -1911368973: 169
    //                   872368606: 154
    //                   1963873898: 139;
           goto _L3 _L4 _L5 _L6
_L3:
        byte0;
        JVM INSTR tableswitch 0 2: default 128
    //                   0 184
    //                   1 269
    //                   2 303;
           goto _L7 _L8 _L9 _L10
_L7:
        throw new RuntimeException("Payment type is not supported.");
_L6:
        if (view.equals("Alipay"))
        {
            byte0 = 0;
        }
          goto _L3
_L5:
        if (view.equals("Baidu Wallet"))
        {
            byte0 = 1;
        }
          goto _L3
_L4:
        if (view.equals("PayPal"))
        {
            byte0 = 2;
        }
          goto _L3
_L8:
        mImageViewPaymentProvider.setContentDescription(getString(0x7f070053));
        mImageViewPaymentProvider.setImageDrawable(getResources().getDrawable(0x7f020083));
_L2:
        mButtonDelete.setText(getString(0x7f0701cf));
        view = d().b();
        view.a(getString(0x7f070328));
        view.d(false);
        view.c(true);
        view.b(true);
        view.a(true);
        return;
_L9:
        mImageViewPaymentProvider.setContentDescription(getString(0x7f07052b));
        mImageViewPaymentProvider.setImageDrawable(getResources().getDrawable(0x7f020087));
        continue; /* Loop/switch isn't completed */
_L10:
        mImageViewPaymentProvider.setContentDescription(getString(0x7f07033e));
        mImageViewPaymentProvider.setImageDrawable(getResources().getDrawable(0x7f02027b));
        if (true) goto _L2; else goto _L11
_L11:
    }
}
