// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.safetynet.SafetyNetShareTripActivity;
import com.ubercab.rider.realtime.model.ClientStatus;

public final class fep
    implements ide
{

    final SafetyNetShareTripActivity a;

    private fep(SafetyNetShareTripActivity safetynetsharetripactivity)
    {
        a = safetynetsharetripactivity;
        super();
    }

    public fep(SafetyNetShareTripActivity safetynetsharetripactivity, byte byte0)
    {
        this(safetynetsharetripactivity);
    }

    private void a(ClientStatus clientstatus)
    {
        clientstatus = clientstatus.getStatus();
        if (!"OnTrip".equals(clientstatus) && !"WaitingForPickup".equals(clientstatus))
        {
            a.finish();
        }
    }

    public final void call(Object obj)
    {
        a((ClientStatus)obj);
    }
}
