// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.AlipaySignature;
import com.ubercab.client.core.network.AlipayApi;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class djy
{

    private final cev a;
    private final AlipayApi b;

    public djy(cev cev, AlipayApi alipayapi)
    {
        a = cev;
        b = alipayapi;
    }

    static cev a(djy djy1)
    {
        return djy1.a;
    }

    public final void a(String s)
    {
        b.getSignature(s, new Callback() {

            final djy a;

            private void a(AlipaySignature alipaysignature, Response response)
            {
                djy.a(a).c(new dkz(alipaysignature, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                djy.a(a).c(new dkz(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((AlipaySignature)obj, response);
            }

            
            {
                a = djy.this;
                super();
            }
        });
    }
}
