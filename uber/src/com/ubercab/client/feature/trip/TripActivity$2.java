// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip;

import android.content.Intent;
import chp;
import com.ubercab.android.partner.funnel.signup.SignUpActivity;
import com.ubercab.android.partner.funnel.signup.model.PartnerFunnelClient;
import com.ubercab.client.feature.about.AboutActivity;
import com.ubercab.client.feature.mobilemessage.MobileMessageNotificationsActivity;
import com.ubercab.client.feature.promo.PromoActivity;
import com.ubercab.client.feature.settings.SettingsActivity;
import com.ubercab.client.feature.share.ShareActivity;
import com.ubercab.rds.feature.trip.TripHistoryActivity;
import com.ubercab.rider.realtime.model.Client;
import cwm;
import dal;
import hkr;
import n;

// Referenced classes of package com.ubercab.client.feature.trip:
//            TripActivity

final class a
    implements Runnable
{

    final long a;
    final TripActivity b;

    public final void run()
    {
        Object obj;
        switch ((int)a)
        {
        default:
            return;

        case 4: // '\004'
            b.startActivity(new Intent(b, com/ubercab/client/feature/about/AboutActivity));
            return;

        case 1: // '\001'
            b.i.a(n.bY);
            TripActivity.a(b);
            return;

        case 0: // '\0'
            b.startActivity(new Intent(b, com/ubercab/client/feature/settings/SettingsActivity));
            return;

        case 2: // '\002'
            b.startActivity(new Intent(b, com/ubercab/client/feature/promo/PromoActivity));
            b.i.a(n.dN);
            return;

        case 3: // '\003'
            b.startActivity(new Intent(b, com/ubercab/client/feature/share/ShareActivity));
            b.i.a(n.av);
            return;

        case 5: // '\005'
            TripActivity.b(b);
            b.i.a(n.eo);
            return;

        case 6: // '\006'
            b.startActivity(TripHistoryActivity.a(b).setAction("com.ubercab.rds.ACTION_TRIP_RECEIPT").putExtra("com.ubercab.rds.RETURN_LOCATION", "com.ubercab.rds.RETURN_TRIP_HISTORY"));
            b.i.a(n.az);
            return;

        case 7: // '\007'
            b.startActivity(new Intent(b, com/ubercab/client/feature/mobilemessage/MobileMessageNotificationsActivity));
            b.i.a(n.bN);
            return;

        case 8: // '\b'
            obj = b.k.c();
            break;
        }
        if (obj != null)
        {
            obj = PartnerFunnelClient.create().setFirstName(((Client) (obj)).getFirstName()).setLastName(((Client) (obj)).getLastName()).setMobile(((Client) (obj)).getMobile()).setPictureUrl(((Client) (obj)).getPictureUrl()).setToken(b.x.x()).setUuid(b.x.z());
            obj = SignUpActivity.a(b, ((PartnerFunnelClient) (obj)));
            b.startActivity(((Intent) (obj)));
            b.i.a(n.en);
            return;
        } else
        {
            cwm.a(b, 0x7f070631);
            return;
        }
    }

    pActivity(TripActivity tripactivity, long l)
    {
        b = tripactivity;
        a = l;
        super();
    }
}
