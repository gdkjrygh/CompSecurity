// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.Toast;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.feature.eta.ShareEtaActivity;
import com.ubercab.rider.realtime.response.ShareYoRide;

public final class ebh
    implements icg
{

    final ShareEtaActivity a;
    private final Context b;
    private final int c;

    private ebh(ShareEtaActivity shareetaactivity, Context context, int i)
    {
        a = shareetaactivity;
        super();
        b = context;
        c = i;
    }

    public ebh(ShareEtaActivity shareetaactivity, Context context, int i, byte byte0)
    {
        this(shareetaactivity, context, i);
    }

    private void a(ShareYoRide shareyoride)
    {
        ShareEtaActivity.a(a, shareyoride.getShareUrl(), c);
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((ShareYoRide)obj);
    }

    public final void a(Throwable throwable)
    {
        a.u();
        throwable = AnalyticsEvent.create("impression").setName(l.gA);
        Toast.makeText(b, a.getString(0x7f070631), 0).show();
        a.h.a(throwable);
        a.setResult(0);
        a.finish();
    }
}
