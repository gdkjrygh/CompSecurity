// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.EditThirdPartyPaymentProviderFragment;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;

public final class epl
    implements icg
{

    final EditThirdPartyPaymentProviderFragment a;

    private epl(EditThirdPartyPaymentProviderFragment editthirdpartypaymentproviderfragment)
    {
        a = editthirdpartypaymentproviderfragment;
        super();
    }

    public epl(EditThirdPartyPaymentProviderFragment editthirdpartypaymentproviderfragment, byte byte0)
    {
        this(editthirdpartypaymentproviderfragment);
    }

    private void b()
    {
        a.e();
        a.c.a(l.ec);
        if (EditThirdPartyPaymentProviderFragment.a(a) != null)
        {
            EditThirdPartyPaymentProviderFragment.a(a).a();
        }
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        b();
    }

    public final void a(Throwable throwable)
    {
        a.e();
        throwable = (Error)throwable;
        if (throwable.getRealtimeError() != null)
        {
            a.c(throwable.getRealtimeError().getMessage());
            return;
        } else
        {
            a.c(a.getString(0x7f070570));
            return;
        }
    }
}
