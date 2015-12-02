// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.rider.realtime.model.Location;
import com.ubercab.rider.realtime.model.Trip;

final class dcn
    implements ide
{

    final dch a;

    private dcn(dch dch1)
    {
        a = dch1;
        super();
    }

    dcn(dch dch1, byte byte0)
    {
        this(dch1);
    }

    private void a(gjy gjy1)
    {
        gjy1 = (Trip)gjy1.d();
        break MISSING_BLOCK_LABEL_8;
        if (dch.a(a).a(dbf.bM) && gjy1 != null)
        {
            gjy1 = gjy1.getPickupLocation();
            if (gjy1 != null)
            {
                dch.a(a, new UberLatLng(gjy1.getLatitude(), gjy1.getLongitude()));
                return;
            }
        }
        return;
    }

    public final void call(Object obj)
    {
        a((gjy)obj);
    }
}
