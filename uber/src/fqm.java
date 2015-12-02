// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ubercab.client.feature.trip.TripActivity;

public final class fqm extends BroadcastReceiver
{

    private final TripActivity a;

    private fqm(TripActivity tripactivity)
    {
        a = tripactivity;
    }

    public fqm(TripActivity tripactivity, byte byte0)
    {
        this(tripactivity);
    }

    public final void onReceive(Context context, Intent intent)
    {
        TripActivity.a(a, intent);
        TripActivity.f(a);
        abortBroadcast();
    }
}
