// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.paytm;

import android.app.Application;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.PaymentCheckBalanceResponse;
import com.ubercab.client.core.model.event.ClientEvent;
import com.ubercab.client.feature.payment.EditPaymentProfileActivity;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dfp;
import djb;
import dki;
import dkn;
import dlp;
import dml;
import dpg;
import dtj;
import eoy;
import epa;
import epi;
import eri;
import etm;
import etn;
import euh;
import eui;
import euj;
import gmg;
import hkj;
import hku;
import ica;
import icl;
import ico;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.payment.paytm:
//            PaytmOtpActivity, PaytmAddFundsActivity

public class PaytmWalletFragment extends czb
{

    public chp c;
    public Application d;
    public cev e;
    public hku f;
    public eoy g;
    public gmg h;
    public dki i;
    public dpg j;
    public hkj k;
    public dkn l;
    private boolean m;
    Button mButtonAddFunds;
    Button mButtonDelete;
    ImageView mImageViewWalletPaymentProvider;
    ProgressBar mProgressBarCurrentBalanceRequest;
    TextView mTextViewBalanceValue;
    public TextView mTextViewNumber;
    private MenuItem n;
    private String o;
    private String p;
    private icl q;
    private icl r;
    private epa s;

    public PaytmWalletFragment()
    {
    }

    public static PaytmWalletFragment a(String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("payment_profile_uuid", s1);
        s1 = new PaytmWalletFragment();
        s1.setArguments(bundle);
        return s1;
    }

    public static String a(PaytmWalletFragment paytmwalletfragment)
    {
        return paytmwalletfragment.o;
    }

    public static String a(PaytmWalletFragment paytmwalletfragment, String s1)
    {
        paytmwalletfragment.p = s1;
        return s1;
    }

    private void a(euj euj1)
    {
        euj1.a(this);
    }

    private void a(boolean flag)
    {
        boolean flag1 = false;
        m = flag;
        getActivity().invalidateOptionsMenu();
        Button button = mButtonAddFunds;
        int i1;
        if (!flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        button.setVisibility(i1);
        button = mButtonDelete;
        if (flag)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        button.setVisibility(i1);
    }

    public static String b(PaytmWalletFragment paytmwalletfragment)
    {
        return paytmwalletfragment.p;
    }

    private void b()
    {
        b(getString(0x7f0701d3));
        if (j.h())
        {
            r = k.a(o).a(ico.a()).a(new eui(this, (byte)0));
            return;
        } else
        {
            l.a(o);
            return;
        }
    }

    public static epa c(PaytmWalletFragment paytmwalletfragment)
    {
        return paytmwalletfragment.s;
    }

    private void g()
    {
        if (m)
        {
            c.a(l.ju);
            return;
        } else
        {
            c.a(l.jt);
            return;
        }
    }

    private euj h()
    {
        return etm.a().a((epi)((EditPaymentProfileActivity)getActivity()).d()).a(new djb(this)).a();
    }

    protected final czj a(dfp dfp)
    {
        return h();
    }

    public final void a(int i1, int j1)
    {
        if (i1 != 1) goto _L2; else goto _L1
_L1:
        if (j1 != -1) goto _L4; else goto _L3
_L3:
        c.a(n.cp);
        b();
_L6:
        return;
_L4:
        if (j1 == 0)
        {
            c.a(n.co);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (i1 == 2 && j1 == -1)
        {
            startActivity(PaytmOtpActivity.a(d, p, true));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final volatile void a(czj czj)
    {
        a((euj)czj);
    }

    public final boolean a()
    {
        boolean flag = false;
        if (m)
        {
            a(false);
            flag = true;
        }
        return flag;
    }

    public final cic f()
    {
        l l1 = l.jt;
        if (m)
        {
            l1 = l.ju;
        }
        return l1;
    }

    public void onClickButtonAddFunds()
    {
        c.a(n.ab);
        startActivity(PaytmAddFundsActivity.a(d, h, p));
    }

    public void onClickButtonDelete()
    {
        c.a(n.ac);
        c.a(l.dZ);
        eoy.a(d());
    }

    public void onClientEvent(ClientEvent clientevent)
    {
        if (!j.n())
        {
            if ((clientevent = clientevent.getClient()) != null)
            {
                mTextViewNumber.setText(clientevent.getMobile());
                if (clientevent.getPaymentProfiles() == null && !j.h())
                {
                    e.c(new eri());
                    return;
                }
                clientevent = clientevent.findPaymentProfileByUuid(o);
                if (clientevent == null)
                {
                    if (!j.h())
                    {
                        e.c(new eri());
                        return;
                    }
                } else
                {
                    p = clientevent.getUuid();
                    i.a(p);
                    return;
                }
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        Bundle bundle1 = getArguments();
        if (bundle1 != null)
        {
            o = bundle1.getString("payment_profile_uuid");
        }
        if (bundle != null)
        {
            m = bundle.getBoolean("is_edit_mode", false);
        }
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f10000b, menu);
        n = menu.findItem(0x7f0e06b4);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030118, viewgroup, false);
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

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = false;
        if (menuitem == n)
        {
            g();
            c.a(n.ad);
            if (!m)
            {
                flag = true;
            }
            a(flag);
            return true;
        } else
        {
            return false;
        }
    }

    public void onPause()
    {
        super.onPause();
        q.b();
        if (r != null)
        {
            r.b();
        }
    }

    public void onPaymentCheckBalanceResponseEvent(dml dml1)
    {
        mProgressBarCurrentBalanceRequest.setVisibility(8);
        if (!dml1.i())
        {
            if (dml1.n() == 403)
            {
                dtj.a((RiderActivity)getActivity(), 2, getString(0x7f070391), getString(0x7f070390), getString(0x7f07038f), getString(0x7f07007b));
            }
            c(getString(0x7f070042));
            return;
        } else
        {
            dml1 = ((PaymentCheckBalanceResponse)dml1.g()).getDisplayAmount();
            mTextViewBalanceValue.setText(dml1);
            return;
        }
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        if (n != null)
        {
            MenuItem menuitem = n;
            if (m)
            {
                menu = getString(0x7f0701e4);
            } else
            {
                menu = getString(0x7f0701f4);
            }
            menuitem.setTitle(menu);
        }
    }

    public void onResume()
    {
        super.onResume();
        a(m);
        q = f.d().c(new euh(this, (byte)0));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is_edit_mode", m);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        view = d().b();
        view.a(getString(0x7f070328));
        view.b(true);
        mButtonAddFunds.setText(getString(0x7f070048));
        mButtonDelete.setText(getString(0x7f0701d1));
    }
}
