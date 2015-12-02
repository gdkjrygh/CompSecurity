// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.EditCreditCardFragment;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;

public final class epc
    implements icg
{

    final EditCreditCardFragment a;

    private epc(EditCreditCardFragment editcreditcardfragment)
    {
        a = editcreditcardfragment;
        super();
    }

    public epc(EditCreditCardFragment editcreditcardfragment, byte byte0)
    {
        this(editcreditcardfragment);
    }

    private void b()
    {
        EditCreditCardFragment.b(a);
        if (EditCreditCardFragment.d(a) != null)
        {
            EditCreditCardFragment.d(a).a();
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
        throwable = (Error)throwable;
        if (throwable.isRealtimeError())
        {
            EditCreditCardFragment.a(a, throwable.getRealtimeError().getMessage());
        } else
        {
            EditCreditCardFragment.a(a, a.getString(0x7f070570));
        }
        if (EditCreditCardFragment.d(a) != null)
        {
            EditCreditCardFragment.d(a).a();
        }
    }
}
