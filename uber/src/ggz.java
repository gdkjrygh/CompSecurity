// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.telephony.TelephonyManager;
import com.ubercab.client.feature.verification.AutomaticMobileVerificationActivity;
import com.ubercab.client.feature.verification.MobileVerificationActivity;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import java.util.concurrent.TimeUnit;

public class ggz extends ghw
{

    private static final long h;
    gju c;
    hkr d;
    gmg e;
    giz f;
    dri g;
    private boolean i;
    private boolean j;

    public ggz()
    {
    }

    private void a(Client client)
    {
        i = true;
        boolean flag = g.b("com.uber.SMS_RECEIVER");
        if (b() && flag && e.a(dbf.cN))
        {
            if (e.b(dbf.ab))
            {
                startActivity(new Intent(getActivity(), com/ubercab/client/feature/verification/AutomaticMobileVerificationActivity));
                return;
            } else
            {
                client = new Intent(getActivity(), com/ubercab/client/feature/verification/MobileVerificationActivity);
                client.setAction("com.ubercab.ACTION_MOBILE_VERIFICATION_WAIT");
                startActivity(client);
                return;
            }
        }
        Intent intent;
        if (client.getHasToOptInSmsNotifications())
        {
            client = "com.ubercab.ACTION_MOBILE_VERIFICATION_SMS";
        } else
        {
            client = "com.ubercab.ACTION_MOBILE_VERIFICATION_TOKEN";
        }
        intent = new Intent(getActivity(), com/ubercab/client/feature/verification/MobileVerificationActivity);
        intent.setAction(client);
        startActivity(intent);
    }

    private void a(gha gha1)
    {
        gha1.a(this);
    }

    private boolean a()
    {
        Client client = d.c();
        if (client != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (!client.isMobileRevoked().booleanValue())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!j)
        {
            gjm.a(d());
            j = true;
            return false;
        }
        continue; /* Loop/switch isn't completed */
        if (client.getHasConfirmedMobile()) goto _L1; else goto _L3
_L3:
        f.e();
        if (a(d.b(), client))
        {
            a(client);
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private boolean a(City city, Client client)
    {
        if (i)
        {
            return false;
        }
        long l;
        long l1;
        if (city != null)
        {
            city = city.getCityName();
        } else
        {
            city = "no_city";
        }
        city = String.format("mv_%s%s", new Object[] {
            client.getMobileDigits(), city
        });
        client = g();
        l = client.getLong(city, 0L);
        l1 = gju.a();
        if (l1 - l > h)
        {
            client.edit().putLong(city, l1).apply();
            return true;
        } else
        {
            return false;
        }
    }

    private gha b(dfp dfp)
    {
        return ggp.a().a(new djb(this)).a(dfp).a();
    }

    private boolean b()
    {
        if (!getActivity().getPackageManager().hasSystemFeature("android.hardware.telephony"))
        {
            return false;
        }
        TelephonyManager telephonymanager = (TelephonyManager)getActivity().getSystemService("phone");
        return telephonymanager != null && telephonymanager.getSimState() != 1;
    }

    private SharedPreferences g()
    {
        return getActivity().getSharedPreferences(".mobile_verification_worker", 0);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((gha)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            i = bundle.getBoolean("verification_seen");
            j = bundle.getBoolean("update_number_dialog_seen");
        }
    }

    public void onResume()
    {
        super.onResume();
        a();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("verification_seen", i);
        bundle.putBoolean("update_number_dialog_seen", j);
    }

    static 
    {
        h = TimeUnit.DAYS.toMillis(7L);
    }
}
