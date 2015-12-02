// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.faresplit.master.FareSplitInviteActivity;
import com.ubercab.rider.realtime.model.ClientStatus;

public final class ebr
    implements ide
{

    final FareSplitInviteActivity a;

    private ebr(FareSplitInviteActivity faresplitinviteactivity)
    {
        a = faresplitinviteactivity;
        super();
    }

    public ebr(FareSplitInviteActivity faresplitinviteactivity, byte byte0)
    {
        this(faresplitinviteactivity);
    }

    private void a(ClientStatus clientstatus)
    {
        if (clientstatus != null)
        {
            if (!"OnTrip".equals(clientstatus = clientstatus.getStatus()) && !"WaitingForPickup".equals(clientstatus))
            {
                a.setResult(0);
                a.finish();
                return;
            }
        }
    }

    public final void call(Object obj)
    {
        a((ClientStatus)obj);
    }
}
