// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.feature.launch.MagicActivity;
import com.ubercab.client.feature.onboarding.PreloadOnBoardingActivity;
import com.ubercab.client.feature.trip.TripActivity;
import com.ubercab.webclient.app.WebClientActivity;

public final class edt
{

    private final Activity a;
    private final gmg b;
    private final rw c;
    private final dod d;
    private final eee e;
    private final dce f;
    private final dal g;

    edt(Activity activity, gmg gmg1, rw rw1, dod dod1, eee eee1, dce dce1, dal dal1)
    {
        a = activity;
        b = gmg1;
        c = rw1;
        d = dod1;
        e = eee1;
        f = dce1;
        g = dal1;
    }

    private void a(Intent intent)
    {
        Uri uri = a.getIntent().getData();
        String s = a.getIntent().getScheme();
        if (uri != null && uri.isHierarchical() && s != null && "uber".equals(s))
        {
            intent.putExtra("EXTRA_DEEPLINK_CLIENT_ID", dwk.b(uri));
        }
    }

    private Intent b()
    {
        if (!e() && !"CHINA".equals(f.a()))
        {
            return new Intent(a, com/ubercab/webclient/app/WebClientActivity);
        }
        Intent intent = new Intent(a, com/ubercab/client/feature/trip/TripActivity);
        if (a.getIntent().hasExtra("trip_notification_action"))
        {
            intent.setAction(a.getIntent().getStringExtra("trip_notification_action"));
        }
        intent.setData(a.getIntent().getData());
        intent.addFlags(0x4000000);
        return intent;
    }

    private boolean c()
    {
        RiderApplication.a(a);
        if (eee.a())
        {
            if (d.a())
            {
                d.f();
                d.b();
                return true;
            }
            if (!d.c())
            {
                return true;
            }
        }
        return false;
    }

    private Intent d()
    {
        Intent intent;
        if (!e() && !"CHINA".equals(f.a()))
        {
            intent = new Intent(a, com/ubercab/webclient/app/WebClientActivity);
        } else
        {
            Intent intent1 = new Intent(a, com/ubercab/client/feature/launch/MagicActivity);
            if (b.a(dbf.A))
            {
                a(intent1);
            }
            Uri uri = a.getIntent().getData();
            intent = intent1;
            if (uri != null)
            {
                intent = intent1;
                if ("login.uber.com".equals(uri.getHost()))
                {
                    a.getIntent().setData(null);
                    intent1.putExtra("extra_password_reset_email_token", uri.getLastPathSegment()).setFlags(0x10008000);
                    return intent1;
                }
            }
        }
        return intent;
    }

    private boolean e()
    {
        int i = rw.a(a);
        return i != 1 && i != 9;
    }

    public final Intent a()
    {
        if (g.v())
        {
            if (a.getIntent().hasExtra("extra_intent_to_relaunch"))
            {
                return (Intent)a.getIntent().getParcelableExtra("extra_intent_to_relaunch");
            } else
            {
                return b();
            }
        }
        if (c())
        {
            return new Intent(a, com/ubercab/client/feature/onboarding/PreloadOnBoardingActivity);
        } else
        {
            return d();
        }
    }
}
