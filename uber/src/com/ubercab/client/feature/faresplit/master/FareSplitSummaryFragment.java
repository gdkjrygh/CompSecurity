// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.faresplit.master;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import cev;
import cgh;
import chp;
import cic;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.FareSplit;
import com.ubercab.rider.realtime.model.FareSplitClient;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.ui.TextView;
import cyz;
import czj;
import dar;
import dfp;
import diw;
import dkn;
import dls;
import dlu;
import dpg;
import dre;
import ebn;
import ebo;
import eca;
import ecb;
import ecc;
import ecd;
import ece;
import ecf;
import ecg;
import hkm;
import hkr;
import hku;
import ica;
import icl;
import ico;
import java.util.List;
import n;

// Referenced classes of package com.ubercab.client.feature.faresplit.master:
//            FareSplitInviteActivity

public class FareSplitSummaryFragment extends cyz
    implements ecb
{

    public chp a;
    public cev b;
    public hkr c;
    public hku d;
    public cgh g;
    public dpg h;
    public dkn i;
    public hkm j;
    private eca k;
    private icl l;
    private icl m;
    ImageButton mButtonInvite;
    ListView mListViewSummary;
    ProgressBar mProgressBarLoading;
    TextView mTextViewTitle;
    ViewGroup mViewGroupContent;
    private icl n;

    public FareSplitSummaryFragment()
    {
    }

    public static void a(FareSplitSummaryFragment faresplitsummaryfragment)
    {
        faresplitsummaryfragment.a(false);
    }

    public static void a(FareSplitSummaryFragment faresplitsummaryfragment, City city, ClientStatus clientstatus, Eyeball eyeball, Trip trip)
    {
        faresplitsummaryfragment.a(city, clientstatus, eyeball, trip);
    }

    private void a(City city, ClientStatus clientstatus, Eyeball eyeball, Trip trip)
    {
        int i1 = 0;
        clientstatus = dre.a(clientstatus, eyeball, trip);
        if (clientstatus == null || clientstatus.getClients().isEmpty())
        {
            dismiss();
            return;
        }
        mTextViewTitle.setText(getString(0x7f07023c, new Object[] {
            Integer.valueOf(clientstatus.getClients().size())
        }));
        k.a(clientstatus);
        eyeball = clientstatus.getClientSelf();
        if (eyeball == null || !eyeball.getIsInitiator())
        {
            mButtonInvite.setVisibility(8);
            return;
        }
        int j1 = dre.a(city, trip);
        int k1 = clientstatus.getClients().size();
        city = mButtonInvite;
        if (k1 >= j1)
        {
            i1 = 8;
        }
        city.setVisibility(i1);
    }

    private void a(ecf ecf1)
    {
        ecf1.a(this);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            mProgressBarLoading.setVisibility(0);
            mViewGroupContent.setVisibility(4);
            return;
        } else
        {
            mProgressBarLoading.setVisibility(4);
            mViewGroupContent.setVisibility(0);
            return;
        }
    }

    private ecf b(dfp dfp)
    {
        return ebn.a().a(new diw(this)).a(dfp).a();
    }

    private void b(FareSplitClient faresplitclient)
    {
        faresplitclient = faresplitclient.getMobileDigits();
        if (TextUtils.isEmpty(faresplitclient))
        {
            return;
        }
        a(true);
        if (!h.v())
        {
            i.b(faresplitclient);
            return;
        } else
        {
            n = j.a(faresplitclient).a(ico.a()).a(new ecg(this, (byte)0));
            return;
        }
    }

    private void d()
    {
        a(true);
        if (!h.g())
        {
            i.a();
            return;
        } else
        {
            m = j.b().a(ico.a()).a(new ece(this, (byte)0));
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

    public final void a(FareSplitClient faresplitclient)
    {
        if (faresplitclient == null)
        {
            return;
        }
        if (faresplitclient.getIsSelf())
        {
            d();
            a.a(n.ar);
            return;
        } else
        {
            b(faresplitclient);
            a.a(n.aq);
            return;
        }
    }

    public final volatile void a(czj czj)
    {
        a((ecf)czj);
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 == 2001 && j1 == -1)
        {
            a(c.b(), c.d(), c.e(), c.f());
        }
    }

    public void onClickButtonInvite()
    {
        startActivityForResult(new Intent(getActivity(), com/ubercab/client/feature/faresplit/master/FareSplitInviteActivity), 2001);
        a.a(n.as);
    }

    public void onClickButtonOk()
    {
        dismiss();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, 0);
        k = new eca(getActivity(), g);
        k.a(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03006b, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        a.a(n.an);
    }

    public void onFareSplitDeclineResponseEvent(dls dls)
    {
        dismiss();
    }

    public void onFareSplitUnInviteReceived(dlu dlu)
    {
        a(false);
    }

    public void onPause()
    {
        super.onPause();
        l.b();
        if (m != null)
        {
            m.b();
        }
        if (n != null)
        {
            n.b();
        }
    }

    public void onPingEvent(dar dar)
    {
        if (h.n())
        {
            return;
        } else
        {
            a(c.b(), c.d(), c.e(), c.f());
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        l = ica.a(d.b(), d.f(), d.g(), d.h(), new ecd((byte)0)).a(ico.a()).c(new ecc(this, (byte)0));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mButtonInvite.setContentDescription(getString(0x7f07023f));
        mListViewSummary.setAdapter(k);
    }
}
