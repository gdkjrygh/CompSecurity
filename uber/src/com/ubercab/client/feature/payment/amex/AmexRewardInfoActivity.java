// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.amex;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.RewardInfo;
import czj;
import czq;
import dfe;
import dfp;
import eqw;
import erb;
import erc;
import gjy;
import gka;
import gki;
import gkk;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.payment.amex:
//            AmexRewardInfoFragment

public class AmexRewardInfoActivity extends RiderActivity
{

    public czq h;

    public AmexRewardInfoActivity()
    {
    }

    public static Intent a(Context context, PaymentProfile paymentprofile)
    {
        String s1 = paymentprofile.getUuid();
        String s2 = paymentprofile.getCardNumber();
        paymentprofile = paymentprofile.getRewardInfo();
        boolean flag;
        if (paymentprofile != null && paymentprofile.isEarnOnly())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return a(context, s1, s2, flag);
    }

    public static Intent a(Context context, String s1, String s2, boolean flag)
    {
        return (new Intent(context, com/ubercab/client/feature/payment/amex/AmexRewardInfoActivity)).putExtra("payment_profile_uuid", s1).putExtra("card_number", s2).putExtra("is_earn_only", flag);
    }

    public static PaymentProfile a(List list)
    {
        if (list != null && !list.isEmpty())
        {
            list = b(list);
            if (!list.isEmpty())
            {
                return c(list);
            }
        }
        return null;
    }

    private void a(eqw eqw1)
    {
        eqw1.a(this);
    }

    private void a(String s1, String s2, boolean flag)
    {
        if (a(com/ubercab/client/feature/payment/amex/AmexRewardInfoFragment) == null)
        {
            a(0x7f0e028d, ((android.support.v4.app.Fragment) (AmexRewardInfoFragment.a(s1, s2, flag))), true);
        }
    }

    private eqw b(dfp dfp)
    {
        return erb.a().a(new dfe(this)).a(dfp).a();
    }

    private static List b(List list)
    {
        return gkk.a(gki.a(list, new gka() {

            private static boolean a(PaymentProfile paymentprofile)
            {
                paymentprofile = paymentprofile.getRewardInfo();
                return paymentprofile != null && paymentprofile.isEligible() && !paymentprofile.isEnrolled() && !paymentprofile.hasTakenEnrollAction();
            }

            public final boolean apply(Object obj)
            {
                return a((PaymentProfile)obj);
            }

        }));
    }

    private static PaymentProfile c(List list)
    {
        return (PaymentProfile)gki.d(list, new gka() {

            private static boolean a(PaymentProfile paymentprofile)
            {
                paymentprofile = paymentprofile.getRewardInfo();
                return paymentprofile != null && paymentprofile.eligibleToUsePoints();
            }

            public final boolean apply(Object obj)
            {
                return a((PaymentProfile)obj);
            }

        }).a(list.get(0));
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eqw)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f0300fd);
        bundle = getIntent();
        a(bundle.getStringExtra("payment_profile_uuid"), bundle.getStringExtra("card_number"), bundle.getBooleanExtra("is_earn_only", false));
    }

    protected final Collection e()
    {
        return Collections.singleton(h);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            finish();
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
