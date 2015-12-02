// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.PaymentSendCodeResponse;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dmn extends dmx
{

    public dmn(PaymentSendCodeResponse paymentsendcoderesponse, Response response)
    {
        super(paymentsendcoderesponse, response);
    }

    public dmn(RetrofitError retrofiterror)
    {
        super(retrofiterror);
    }
}
