// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.TripPendingRating;

final class ghi
    implements ide
{

    final ghh a;

    private ghi(ghh ghh1)
    {
        a = ghh1;
        super();
    }

    ghi(ghh ghh1, byte byte0)
    {
        this(ghh1);
    }

    private void a(ClientStatus clientstatus)
    {
        if (clientstatus != null && clientstatus.getTripPendingRating() != null && !TextUtils.isEmpty(clientstatus.getTripPendingRating().getId()))
        {
            a.c.c(new fdo(clientstatus.getTripPendingRating().getId()));
        }
    }

    public final void call(Object obj)
    {
        a((ClientStatus)obj);
    }
}
