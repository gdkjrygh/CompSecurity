// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.verification.MobileVerificationTokenFragment;
import com.ubercab.rider.realtime.model.Client;

public final class gjf
    implements ide
{

    final MobileVerificationTokenFragment a;

    private gjf(MobileVerificationTokenFragment mobileverificationtokenfragment)
    {
        a = mobileverificationtokenfragment;
        super();
    }

    public gjf(MobileVerificationTokenFragment mobileverificationtokenfragment, byte byte0)
    {
        this(mobileverificationtokenfragment);
    }

    private void a(Client client)
    {
        if (a.h.a(dbf.Y))
        {
            return;
        } else
        {
            String s = client.getMobileCountryIso2();
            client = duj.d(client.getCurrentMobile(), s);
            a.a(client, s);
            return;
        }
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
