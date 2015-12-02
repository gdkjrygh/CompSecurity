// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.RiderBalance;
import com.ubercab.client.core.model.RtUnpaidBillsResponse;
import com.ubercab.client.core.network.AccountBalanceApi;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class djw
{

    private final AccountBalanceApi a;
    private final cev b;

    public djw(cev cev, AccountBalanceApi accountbalanceapi)
    {
        b = cev;
        a = accountbalanceapi;
    }

    static cev a(djw djw1)
    {
        return djw1.b;
    }

    public final void a(String s)
    {
        Callback callback = new Callback() {

            final djw a;

            private void a(RtUnpaidBillsResponse rtunpaidbillsresponse)
            {
                djw.a(a).c(new erk(rtunpaidbillsresponse.getUnpaidBills()));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                djw.a(a).c(new erk(null));
            }

            public final void success(Object obj, Response response)
            {
                a((RtUnpaidBillsResponse)obj);
            }

            
            {
                a = djw.this;
                super();
            }
        };
        a.getUnpaidBills(s, callback);
    }

    public final void b(String s)
    {
        Callback callback = new Callback() {

            final djw a;

            private void a(RiderBalance riderbalance, Response response)
            {
                djw.a(a).c(new dlw(riderbalance, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                djw.a(a).c(new dlw(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((RiderBalance)obj, response);
            }

            
            {
                a = djw.this;
                super();
            }
        };
        a.getCreditBalance(s, callback);
    }
}
