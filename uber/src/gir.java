// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.verification.MobileVerificationActivity;
import com.ubercab.client.feature.verification.MobileVerificationWaitFragment;
import com.ubercab.rider.realtime.model.Client;

public final class gir
    implements ide
{

    final MobileVerificationActivity a;

    private gir(MobileVerificationActivity mobileverificationactivity)
    {
        a = mobileverificationactivity;
        super();
    }

    public gir(MobileVerificationActivity mobileverificationactivity, byte byte0)
    {
        this(mobileverificationactivity);
    }

    private void a(Client client)
    {
        while (MobileVerificationActivity.a(a, com/ubercab/client/feature/verification/MobileVerificationWaitFragment) != null || !client.getHasConfirmedMobile()) 
        {
            return;
        }
        a.finish();
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
