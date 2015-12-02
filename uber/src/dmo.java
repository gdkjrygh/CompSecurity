// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.PaymentValidateCodeResponse;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dmo extends dmx
{

    public dmo(PaymentValidateCodeResponse paymentvalidatecoderesponse, Response response)
    {
        super(paymentvalidatecoderesponse, response);
    }

    public dmo(RetrofitError retrofiterror)
    {
        super(retrofiterror);
    }
}
