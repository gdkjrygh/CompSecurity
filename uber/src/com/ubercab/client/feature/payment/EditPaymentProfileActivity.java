// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.payment.paytm.PaytmWalletFragment;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import czj;
import czq;
import dfe;
import dfp;
import dui;
import eoo;
import eop;
import epa;
import epi;
import eri;
import hkr;
import java.util.Collection;
import java.util.Collections;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.payment:
//            EditThirdPartyPaymentProviderFragment, EditDelegatePaymentProfileFragment, EditCreditCardFragment

public class EditPaymentProfileActivity extends RiderActivity
    implements epa
{

    public chp h;
    public hkr i;
    public czq j;
    private PaymentProfile k;

    public EditPaymentProfileActivity()
    {
    }

    public static Intent a(Context context, String s1, boolean flag)
    {
        context = new Intent(context, com/ubercab/client/feature/payment/EditPaymentProfileActivity);
        context.putExtra("payment_profile_uuid", s1);
        context.putExtra("payment_profile_selected", flag);
        return context;
    }

    private void a(epi epi1)
    {
        epi1.a(this);
    }

    private void a(String s1, boolean flag, boolean flag1)
    {
        h.a(l.ed);
        if (!dui.b(k)) goto _L2; else goto _L1
_L1:
        if ((PaytmWalletFragment)a(com/ubercab/client/feature/payment/paytm/PaytmWalletFragment) == null)
        {
            a(0x7f0e028d, ((android.support.v4.app.Fragment) (PaytmWalletFragment.a(s1))), true);
        }
_L4:
        return;
_L2:
        if (!"PayPal".equals(k.getCardType()) && !"Baidu Wallet".equals(k.getCardType()) && !"Alipay".equals(k.getCardType()))
        {
            break; /* Loop/switch isn't completed */
        }
        if ((EditThirdPartyPaymentProviderFragment)a(com/ubercab/client/feature/payment/EditThirdPartyPaymentProviderFragment) == null)
        {
            a(0x7f0e028d, ((android.support.v4.app.Fragment) (EditThirdPartyPaymentProviderFragment.a(s1))), true);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!"Delegate".equals(k.getCardType()))
        {
            continue; /* Loop/switch isn't completed */
        }
        if ((EditDelegatePaymentProfileFragment)a(com/ubercab/client/feature/payment/EditDelegatePaymentProfileFragment) != null) goto _L4; else goto _L5
_L5:
        a(0x7f0e028d, ((android.support.v4.app.Fragment) (EditDelegatePaymentProfileFragment.a(s1))), true);
        return;
        if ((EditCreditCardFragment)a(com/ubercab/client/feature/payment/EditCreditCardFragment) != null) goto _L4; else goto _L6
_L6:
        a(0x7f0e028d, ((android.support.v4.app.Fragment) (EditCreditCardFragment.a(s1, flag, flag1))), true);
        return;
    }

    private epi b(dfp dfp)
    {
        return eoo.a().a(new dfe(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a()
    {
        setResult(-1);
        finish();
    }

    public final void a(int i1, int j1, Bundle bundle)
    {
        super.a(i1, j1, bundle);
        if (dui.b(k))
        {
            ((PaytmWalletFragment)a(com/ubercab/client/feature/payment/paytm/PaytmWalletFragment)).a(i1, j1);
            return;
        }
        if ("PayPal".equals(k.getCardType()) || "Alipay".equals(k.getCardType()) || "Baidu Wallet".equals(k.getCardType()))
        {
            ((EditThirdPartyPaymentProviderFragment)a(com/ubercab/client/feature/payment/EditThirdPartyPaymentProviderFragment)).a(i1, j1);
            return;
        } else
        {
            ((EditCreditCardFragment)a(com/ubercab/client/feature/payment/EditCreditCardFragment)).a(i1, j1);
            return;
        }
    }

    public final volatile void a(czj czj)
    {
        a((epi)czj);
    }

    protected final void b(Bundle bundle)
    {
        boolean flag1 = false;
        super.b(bundle);
        setContentView(0x7f030104);
        bundle = getIntent().getStringExtra("payment_profile_uuid");
        boolean flag2 = getIntent().getBooleanExtra("is_verify_mode", false);
        boolean flag3 = getIntent().getBooleanExtra("payment_profile_selected", false);
        Client client = i.c();
        boolean flag = flag1;
        if (client != null)
        {
            flag = flag1;
            if (client.getPaymentProfiles() != null)
            {
                flag = true;
            }
        }
        if (flag)
        {
            k = client.findPaymentProfileByUuid(bundle);
        }
        if (k == null)
        {
            finish();
            return;
        } else
        {
            a(bundle, flag2, flag3);
            return;
        }
    }

    protected final Collection e()
    {
        return Collections.singleton(j);
    }

    public void onBackPressed()
    {
        Object obj = (EditCreditCardFragment)a(com/ubercab/client/feature/payment/EditCreditCardFragment);
        if (obj == null || !((EditCreditCardFragment) (obj)).b())
        {
            if ((obj = (PaytmWalletFragment)a(com/ubercab/client/feature/payment/paytm/PaytmWalletFragment)) == null || !((PaytmWalletFragment) (obj)).a())
            {
                h.a(n.cq);
                super.onBackPressed();
                return;
            }
        }
    }

    public void onDeletedPaymentProfileEvent(eri eri)
    {
        setResult(-1);
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            onBackPressed();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
