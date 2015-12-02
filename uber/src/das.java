// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.crash.model.MetaData;
import com.ubercab.network.uspout.UspoutClient;
import com.ubercab.network.uspout.model.Message;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class das
{

    private final glf a;
    private final chp b;
    private final gmg c;
    private final UspoutClient d;

    public das(glf glf1, chp chp1, gmg gmg1, UspoutClient uspoutclient)
    {
        a = glf1;
        b = chp1;
        c = gmg1;
        d = uspoutclient;
    }

    static glf a(das das1)
    {
        return das1.a;
    }

    public final void a()
    {
        MetaData metadata = a.a();
        if (metadata != null)
        {
            if (c.a(dbf.I))
            {
                b.a(AnalyticsEvent.create("lifecycle").setName(dcz.b));
            }
            d.a(new Callback() {

                final das a;

                private void a()
                {
                    das.a(a).c();
                }

                public final void failure(RetrofitError retrofiterror)
                {
                }

                public final void success(Object obj, Response response)
                {
                    a();
                }

            
            {
                a = das.this;
                super();
            }
            }, new Message[] {
                Message.create(a.b(), metadata.getTimestamp().longValue(), metadata.getLatitude(), metadata.getLongitude())
            });
        }
    }
}
