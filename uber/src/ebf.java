// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.ubercab.client.feature.eta.ShareEtaActivity;
import com.ubercab.rider.realtime.response.RiderSetInfo;

public final class ebf
    implements icg
{

    final ShareEtaActivity a;

    private ebf(ShareEtaActivity shareetaactivity)
    {
        a = shareetaactivity;
        super();
    }

    public ebf(ShareEtaActivity shareetaactivity, byte byte0)
    {
        this(shareetaactivity);
    }

    private void a(RiderSetInfo ridersetinfo)
    {
        ShareEtaActivity.a(a);
        a.a(ridersetinfo.getTrip());
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((RiderSetInfo)obj);
    }

    public final void a(Throwable throwable)
    {
        a.u();
        Toast.makeText(a, 0x7f070631, 0).show();
        a.setResult(0);
        a.finish();
    }
}
