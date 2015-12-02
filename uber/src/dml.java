// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.PaymentCheckBalanceResponse;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dml extends dmx
{

    private final String a;

    public dml(PaymentCheckBalanceResponse paymentcheckbalanceresponse, Response response, String s)
    {
        super(paymentcheckbalanceresponse, response);
        a = s;
    }

    public dml(RetrofitError retrofiterror, String s)
    {
        super(retrofiterror);
        a = s;
    }

    public final String a()
    {
        return a;
    }
}
