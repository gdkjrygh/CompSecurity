// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.PaymentCheckBalanceResponse;
import com.ubercab.client.core.model.PaymentDepositRequestResponse;
import com.ubercab.client.core.model.PaymentSendCodeResponse;
import com.ubercab.client.core.model.PaymentValidateCodeResponse;
import com.ubercab.client.core.network.PaymentApi;
import java.util.HashMap;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dki
{

    private final cev a;
    private final dal b;
    private final PaymentApi c;

    public dki(cev cev, dal dal, PaymentApi paymentapi)
    {
        a = cev;
        c = paymentapi;
        b = dal;
    }

    static cev a(dki dki1)
    {
        return dki1.a;
    }

    public final void a(String s)
    {
        Callback callback = new Callback(s) {

            final String a;
            final dki b;

            private void a(PaymentCheckBalanceResponse paymentcheckbalanceresponse, Response response)
            {
                dki.a(b).c(new dml(paymentcheckbalanceresponse, response, a));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dki.a(b).c(new dml(retrofiterror, a));
            }

            public final void success(Object obj, Response response)
            {
                a((PaymentCheckBalanceResponse)obj, response);
            }

            
            {
                b = dki.this;
                a = s;
                super();
            }
        };
        c.checkBalance(s, callback);
    }

    public final void a(String s, int i, String s1)
    {
        Callback callback = new Callback() {

            final dki a;

            private void a(PaymentDepositRequestResponse paymentdepositrequestresponse, Response response)
            {
                dki.a(a).c(new dmm(paymentdepositrequestresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dki.a(a).c(new dmm(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((PaymentDepositRequestResponse)obj, response);
            }

            
            {
                a = dki.this;
                super();
            }
        };
        c.depositRequest(s, Integer.toString(i), s1, callback);
    }

    public final void a(String s, String s1)
    {
        Callback callback = new Callback() {

            final dki a;

            private void a(PaymentValidateCodeResponse paymentvalidatecoderesponse, Response response)
            {
                dki.a(a).c(new dmo(paymentvalidatecoderesponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dki.a(a).c(new dmo(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((PaymentValidateCodeResponse)obj, response);
            }

            
            {
                a = dki.this;
                super();
            }
        };
        s1 = gkg.a("code", s1);
        c.validateCode(s, s1, callback);
    }

    public final void b(String s)
    {
        Callback callback = new Callback() {

            final dki a;

            private void a(PaymentSendCodeResponse paymentsendcoderesponse, Response response)
            {
                dki.a(a).c(new dmn(paymentsendcoderesponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dki.a(a).c(new dmn(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((PaymentSendCodeResponse)obj, response);
            }

            
            {
                a = dki.this;
                super();
            }
        };
        c.sendCode(s, new HashMap(), callback);
    }
}
