// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.verification.MobileVerificationSmsFragment;
import com.ubercab.rider.realtime.model.Client;

public final class gja
    implements ide
{

    final MobileVerificationSmsFragment a;

    private gja(MobileVerificationSmsFragment mobileverificationsmsfragment)
    {
        a = mobileverificationsmsfragment;
        super();
    }

    public gja(MobileVerificationSmsFragment mobileverificationsmsfragment, byte byte0)
    {
        this(mobileverificationsmsfragment);
    }

    private void a(Client client)
    {
        a.a(client.getMobileDigits(), client.getMobileCountryIso2());
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
