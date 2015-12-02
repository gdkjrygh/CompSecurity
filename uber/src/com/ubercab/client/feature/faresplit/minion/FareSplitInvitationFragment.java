// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.faresplit.minion;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import butterknife.ButterKnife;
import cev;
import cgh;
import cgt;
import chp;
import cic;
import com.ubercab.client.core.model.Ping;
import com.ubercab.rider.realtime.model.FareSplit;
import com.ubercab.rider.realtime.model.FareSplitClient;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.ui.TextView;
import cyz;
import czj;
import dar;
import dfp;
import diw;
import dkn;
import dky;
import dlr;
import dls;
import dpg;
import dty;
import dxg;
import ecj;
import eck;
import ecl;
import ecm;
import ecn;
import eco;
import hkm;
import hku;
import ica;
import icl;
import ico;
import n;

public class FareSplitInvitationFragment extends cyz
    implements android.content.DialogInterface.OnKeyListener
{

    public chp a;
    public cev b;
    public hku c;
    public cgh d;
    public dpg g;
    public dkn h;
    public hkm i;
    private PaymentProfile j;
    private icl k;
    private icl l;
    private icl m;
    ImageView mImageViewPicture;
    ProgressBar mProgressBarLoading;
    TextView mTextViewFee;
    TextView mTextViewSubtitle;
    View mViewContent;

    public FareSplitInvitationFragment()
    {
    }

    public static void a(FareSplitInvitationFragment faresplitinvitationfragment)
    {
        faresplitinvitationfragment.a(false);
    }

    private void a(eco eco1)
    {
        eco1.a(this);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            mProgressBarLoading.setVisibility(0);
            mViewContent.setVisibility(4);
            return;
        } else
        {
            mProgressBarLoading.setVisibility(4);
            mViewContent.setVisibility(0);
            return;
        }
    }

    private eco b(dfp dfp)
    {
        return ecj.a().a(new diw(this)).a(dfp).a();
    }

    private void d()
    {
label0:
        {
            {
                String s1 = null;
                String s = null;
                a(true);
                if (g.a())
                {
                    break label0;
                }
                if (j != null && "PayPal".equals(j.getCardType()))
                {
                    s1 = j.getUuid();
                    s = dxg.a(getActivity());
                } else
                {
                    s1 = null;
                }
                h.d(s1, s);
            }
            a.a(n.am);
            return;
        }
        if (j != null)
        {
            s = s1;
            if ("PayPal".equals(j.getCardType()))
            {
                s = dxg.a(getActivity());
            }
            k = i.a(j.getUuid(), s).a(ico.a()).a(new ecl(this, (byte)0));
        }
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_72;
        }
    }

    private void e()
    {
        a(true);
        a.a(n.ap);
        if (!g.g())
        {
            h.a();
            return;
        } else
        {
            l = i.b().a(ico.a()).a(new ecm(this, (byte)0));
            return;
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

    public final void a(FareSplit faresplit)
    {
        FareSplitClient faresplitclient1 = null;
        FareSplitClient faresplitclient;
        if (faresplit != null)
        {
            faresplitclient = faresplit.getClientInitiator();
        } else
        {
            faresplitclient = null;
        }
        if (faresplit != null)
        {
            faresplitclient1 = faresplit.getClientSelf();
        }
        if (faresplitclient == null || faresplitclient1 == null || !"Pending".equals(faresplitclient1.getStatus()))
        {
            dismiss();
            return;
        }
        faresplit = dty.a(faresplitclient);
        mTextViewSubtitle.setText(getString(0x7f07023a, new Object[] {
            faresplit
        }));
        mTextViewFee.setText(faresplitclient1.getFeeString());
        faresplit = faresplitclient.getPictureUrl();
        if (!TextUtils.isEmpty(faresplit)) goto _L2; else goto _L1
_L1:
        mImageViewPicture.setImageResource(0x7f02006f);
_L4:
        a(false);
        return;
_L2:
        if (!faresplit.equals(mImageViewPicture.getTag()))
        {
            mImageViewPicture.setTag(faresplit);
            d.a(faresplit).a(0x7f02006f).b(0x7f02006f).a(mImageViewPicture);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(PaymentProfile paymentprofile)
    {
        j = paymentprofile;
    }

    public final volatile void a(czj czj)
    {
        a((eco)czj);
    }

    public void onAcceptFareSplitResponse(dky dky1)
    {
        if (!dky1.a())
        {
            Toast.makeText(getActivity(), dky1.b(), 0).show();
            a(false);
            return;
        } else
        {
            dismiss();
            return;
        }
    }

    public void onButtonAcceptClicked()
    {
        d();
    }

    public void onButtonDeclineClicked()
    {
        e();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, 0x7f09017a);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = super.onCreateDialog(bundle);
        bundle.setCancelable(false);
        bundle.setCanceledOnTouchOutside(false);
        bundle.setOnKeyListener(this);
        return bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater = layoutinflater.inflate(0x7f03006a, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onFareSplitAcceptResponseEvent(dlr dlr1)
    {
        if (!dlr1.e())
        {
            Toast.makeText(getActivity(), dlr1.a(getActivity()), 0).show();
            a(false);
            return;
        } else
        {
            dismiss();
            return;
        }
    }

    public void onFareSplitDeclineResponseEvent(dls dls1)
    {
        if (!dls1.e())
        {
            Toast.makeText(getActivity(), dls1.a(getActivity()), 0).show();
            a(false);
            return;
        } else
        {
            dismiss();
            return;
        }
    }

    public boolean onKey(DialogInterface dialoginterface, int i1, KeyEvent keyevent)
    {
        return i1 == 4;
    }

    public void onPause()
    {
        super.onPause();
        if (k != null)
        {
            k.b();
        }
        if (l != null)
        {
            l.b();
        }
        m.b();
    }

    public void onPingEvent(dar dar1)
    {
        if (g.n())
        {
            return;
        }
        dar1 = dar1.a();
        if (dar1 != null)
        {
            dar1 = dar1.getFareSplit();
        } else
        {
            dar1 = null;
        }
        a(dar1);
    }

    public void onResume()
    {
        super.onResume();
        m = c.g().c(new ecn(this, (byte)0));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        a(true);
    }
}
