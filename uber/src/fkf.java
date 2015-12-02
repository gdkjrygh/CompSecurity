// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.realtime.model.PollingResponse;
import com.ubercab.client.feature.signup.CompleteSignupActivity;
import com.ubercab.rider.realtime.response.BootstrapRider;

public final class fkf
    implements ide
{

    final CompleteSignupActivity a;

    private fkf(CompleteSignupActivity completesignupactivity)
    {
        a = completesignupactivity;
        super();
    }

    public fkf(CompleteSignupActivity completesignupactivity, byte byte0)
    {
        this(completesignupactivity);
    }

    private void a(PollingResponse pollingresponse)
    {
        a.u();
        if (pollingresponse.isSuccessful() && pollingresponse.getResponse() != null)
        {
            if ((pollingresponse = ((BootstrapRider)pollingresponse.getResponse()).getClient()) != null)
            {
                a.a(pollingresponse);
                return;
            }
        }
    }

    public final void call(Object obj)
    {
        a((PollingResponse)obj);
    }
}
