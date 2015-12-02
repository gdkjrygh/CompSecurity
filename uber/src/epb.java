// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.EditCreditCardFragment;
import com.ubercab.rider.realtime.model.Client;

public final class epb
    implements ide
{

    final EditCreditCardFragment a;

    private epb(EditCreditCardFragment editcreditcardfragment)
    {
        a = editcreditcardfragment;
        super();
    }

    public epb(EditCreditCardFragment editcreditcardfragment, byte byte0)
    {
        this(editcreditcardfragment);
    }

    private void a(Client client)
    {
        client = client.findPaymentProfileByUuid(EditCreditCardFragment.a(a));
        if (client != null) goto _L2; else goto _L1
_L1:
        if (!a.k.h()) goto _L4; else goto _L3
_L3:
        EditCreditCardFragment.b(a);
_L6:
        return;
_L4:
        a.e.c(new eri());
        return;
_L2:
        if (!EditCreditCardFragment.c(a))
        {
            EditCreditCardFragment.a(a, client);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
