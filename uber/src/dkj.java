// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.AnonymousPhoneNumberRequest;
import com.ubercab.client.core.model.AnonymousPhoneNumberResponse;
import com.ubercab.client.core.network.PhoneNumberAnonymizationApi;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dkj
{

    private final dkk a = new dkk((byte)0);
    private final cev b;
    private final PhoneNumberAnonymizationApi c;
    private final cyy d;
    private final dak e;

    public dkj(cev cev1, PhoneNumberAnonymizationApi phonenumberanonymizationapi, cyy cyy1, dak dak1)
    {
        b = cev1;
        c = phonenumberanonymizationapi;
        d = cyy1;
        e = dak1;
    }

    private UberLatLng a()
    {
        RiderLocation riderlocation = e.b();
        if (riderlocation != null)
        {
            return riderlocation.getUberLatLng();
        }
        riderlocation = e.c();
        if (riderlocation != null)
        {
            return riderlocation.getUberLatLng();
        } else
        {
            return null;
        }
    }

    static dkk a(dkj dkj1)
    {
        return dkj1.a;
    }

    static cev b(dkj dkj1)
    {
        return dkj1.b;
    }

    public final void a(String s, String s1, String s2)
    {
        Double double2 = null;
        Callback callback = new Callback() {

            final dkj a;

            public final void failure(RetrofitError retrofiterror)
            {
                dkj.b(a).c(new dlz(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                dkj.b(a).c(new dlz(obj, response));
            }

            
            {
                a = dkj.this;
                super();
            }
        };
        UberLatLng uberlatlng = a();
        Double double1;
        if (uberlatlng != null)
        {
            double1 = Double.valueOf(uberlatlng.a());
        } else
        {
            double1 = null;
        }
        if (uberlatlng != null)
        {
            double2 = Double.valueOf(uberlatlng.b());
        }
        s1 = AnonymousPhoneNumberRequest.create(s2, s1, cwt.a(), cyy.b(), double1, double2);
        c.initiateAnonymousInboundCall(s, s1, callback);
    }

    public final void a(String s, String s1, String s2, String s3)
    {
        Double double1 = null;
        if (a.a(s, s1, s2, s3))
        {
            b.c(new dlf(a.a(), null));
            return;
        }
        Callback callback = new Callback(s, s1, s2, s3) {

            final String a;
            final String b;
            final String c;
            final String d;
            final dkj e;

            private void a(AnonymousPhoneNumberResponse anonymousphonenumberresponse, Response response)
            {
                dkj.a(e).a(a, b, c, d, anonymousphonenumberresponse);
                dkj.b(e).c(new dlf(anonymousphonenumberresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkj.b(e).c(new dlf(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((AnonymousPhoneNumberResponse)obj, response);
            }

            
            {
                e = dkj.this;
                a = s;
                b = s1;
                c = s2;
                d = s3;
                super();
            }
        };
        UberLatLng uberlatlng = a();
        if (uberlatlng != null)
        {
            s = Double.valueOf(uberlatlng.a());
        } else
        {
            s = null;
        }
        if (uberlatlng != null)
        {
            double1 = Double.valueOf(uberlatlng.b());
        }
        s = AnonymousPhoneNumberRequest.create(s3, s2, cwt.a(), cyy.b(), s, double1);
        c.getAnonymousNumber(s1, s, callback);
    }
}
