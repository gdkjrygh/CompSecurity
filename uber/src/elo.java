// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ubercab.client.feature.partner.external.PartnerOnboardingFinishedActivity;
import com.ubercab.client.feature.trip.TripActivity;

public final class elo
    implements cps
{

    public elo()
    {
    }

    public final Intent a(Context context)
    {
        return new Intent(context, com/ubercab/client/feature/trip/TripActivity);
    }

    public final Intent a(String s)
    {
        return new Intent("android.intent.action.VIEW", Uri.parse(s));
    }

    public final Intent b(Context context)
    {
        return new Intent(context, com/ubercab/client/feature/partner/external/PartnerOnboardingFinishedActivity);
    }

    public final Intent c(Context context)
    {
        return new Intent(context, com/ubercab/client/feature/partner/external/PartnerOnboardingFinishedActivity);
    }

    public final Intent d(Context context)
    {
        return new Intent(context, com/ubercab/client/feature/trip/TripActivity);
    }

    public final Intent e(Context context)
    {
        return new Intent(context, com/ubercab/client/feature/trip/TripActivity);
    }
}
