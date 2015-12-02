// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.EditDelegatePaymentProfileFragment;
import com.ubercab.rider.realtime.model.Client;

public final class epf
    implements ide
{

    final EditDelegatePaymentProfileFragment a;

    private epf(EditDelegatePaymentProfileFragment editdelegatepaymentprofilefragment)
    {
        a = editdelegatepaymentprofilefragment;
        super();
    }

    public epf(EditDelegatePaymentProfileFragment editdelegatepaymentprofilefragment, byte byte0)
    {
        this(editdelegatepaymentprofilefragment);
    }

    private void a(Client client)
    {
        if (client == null || client.getPaymentProfiles() == null || client.findPaymentProfileByUuid(a.g) == null)
        {
            a.c.c(new eri());
        }
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
