// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.EditThirdPartyPaymentProviderFragment;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.ui.Button;

public final class epk
    implements ide
{

    final EditThirdPartyPaymentProviderFragment a;

    private epk(EditThirdPartyPaymentProviderFragment editthirdpartypaymentproviderfragment)
    {
        a = editthirdpartypaymentproviderfragment;
        super();
    }

    public epk(EditThirdPartyPaymentProviderFragment editthirdpartypaymentproviderfragment, byte byte0)
    {
        this(editthirdpartypaymentproviderfragment);
    }

    private void a(Client client)
    {
        if ((client.getPaymentProfiles() == null || client.findPaymentProfileByUuid(a.l) == null) && !a.i.h())
        {
            a.d.c(new eri());
            return;
        }
        boolean flag = EditThirdPartyPaymentProviderFragment.a(a, client.getPaymentProfiles());
        client = a.mButtonDelete;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        client.setVisibility(i);
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
