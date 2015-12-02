// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.verification.MobileVerificationWaitFragment;
import com.ubercab.rider.realtime.model.Client;

public final class gjj
    implements ide
{

    final MobileVerificationWaitFragment a;

    private gjj(MobileVerificationWaitFragment mobileverificationwaitfragment)
    {
        a = mobileverificationwaitfragment;
        super();
    }

    public gjj(MobileVerificationWaitFragment mobileverificationwaitfragment, byte byte0)
    {
        this(mobileverificationwaitfragment);
    }

    private void a(Client client)
    {
        if (client.getHasConfirmedMobile())
        {
            MobileVerificationWaitFragment.a(a);
        }
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
