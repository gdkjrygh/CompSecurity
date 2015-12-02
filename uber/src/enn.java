// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.feature.payment.AddPaymentFragment;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.NetworkError;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.rider.realtime.response.CreatePaymentProfileResponse;

public final class enn
    implements icg
{

    final AddPaymentFragment a;

    private enn(AddPaymentFragment addpaymentfragment)
    {
        a = addpaymentfragment;
        super();
    }

    public enn(AddPaymentFragment addpaymentfragment, byte byte0)
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
        Object obj;
        Error error;
        a.e();
        a.c.a(l.dN);
        obj = null;
        error = (Error)throwable;
        if (error.getNetworkError() == null) goto _L2; else goto _L1
_L1:
        throwable = error.getNetworkError().getMessage();
_L4:
        obj = throwable;
        if (TextUtils.isEmpty(throwable))
        {
            obj = a.getString(0x7f070631);
        }
        a.c(((String) (obj)));
        return;
_L2:
        if (error.getRealtimeError() != null)
        {
            throwable = error.getRealtimeError().getMessage();
        } else
        {
            throwable = ((Throwable) (obj));
            if (error.getUnknownError() != null)
            {
                throwable = error.getUnknownError().getMessage();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
