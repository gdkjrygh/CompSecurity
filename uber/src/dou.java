// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.realtime.error.GlobalStateErrors;
import com.ubercab.client.core.realtime.model.PollingResponse;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import java.util.List;

final class dou
    implements ide
{

    final dot a;

    private dou(dot dot1)
    {
        a = dot1;
        super();
    }

    dou(dot dot1, byte byte0)
    {
        this(dot1);
    }

    private void a(PollingResponse pollingresponse)
    {
        if (pollingresponse.getError() != null)
        {
            pollingresponse = pollingresponse.getError().getRealtimeError();
            if (pollingresponse != null && GlobalStateErrors.get().contains(pollingresponse.getCode()))
            {
                return;
            } else
            {
                dot.a(a).y();
                return;
            }
        } else
        {
            dot.a(a).z();
            return;
        }
    }

    public final void call(Object obj)
    {
        a((PollingResponse)obj);
    }
}
