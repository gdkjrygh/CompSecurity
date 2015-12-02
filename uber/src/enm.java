// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.feature.payment.AddPaymentFragment;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.rider.realtime.response.CreatePaymentProfileResponse;

public final class enm
    implements icg
{

    final AddPaymentFragment a;

    private enm(AddPaymentFragment addpaymentfragment)
    {
        a = addpaymentfragment;
        super();
    }

    public enm(AddPaymentFragment addpaymentfragment, byte byte0)
    {
        this(addpaymentfragment);
    }

    private void a(CreatePaymentProfileResponse createpaymentprofileresponse)
    {
        a.e();
        a.e.c(new erl(createpaymentprofileresponse.getNewPaymentProfileUuid()));
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((CreatePaymentProfileResponse)obj);
    }

    public final void a(Throwable throwable)
    {
        a.e();
        a.c.a(l.dN);
        throwable = ((Error)throwable).getRealtimeError();
        AddPaymentFragment addpaymentfragment;
        boolean flag;
        if (throwable != null && !TextUtils.isEmpty(throwable.getMessage()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        addpaymentfragment = a;
        if (flag)
        {
            throwable = throwable.getMessage();
        } else
        {
            throwable = a.getString(0x7f070631);
        }
        addpaymentfragment.c(throwable);
    }
}
