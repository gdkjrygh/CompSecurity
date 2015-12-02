// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.DisableEmergencyRequest;
import com.ubercab.client.core.model.EmergencyEventDetails;
import com.ubercab.client.core.network.EmergencyApi;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class djz
{

    private final gju a;
    private final EmergencyApi b;
    private final dak c;
    private dka d;

    public djz(gju gju1, EmergencyApi emergencyapi, dak dak1)
    {
        a = gju1;
        b = emergencyapi;
        c = dak1;
    }

    static dka a(djz djz1)
    {
        return djz1.d;
    }

    public final void a(dka dka)
    {
        d = dka;
    }

    public final void a(String s)
    {
        Callback callback = new Callback() {

            final djz a;

            public final void failure(RetrofitError retrofiterror)
            {
            }

            public final void success(Object obj, Response response)
            {
            }

            
            {
                a = djz.this;
                super();
            }
        };
        b.disableEmergency(s, DisableEmergencyRequest.create(Long.valueOf(gju.a())), callback);
    }

    public final void a(String s, String s1, String s2, String s3, String s4)
    {
        Double double2 = null;
        Callback callback = new Callback(s) {

            final String a;
            final djz b;

            public final void failure(RetrofitError retrofiterror)
            {
            }

            public final void success(Object obj1, Response response)
            {
                if (djz.a(b) != null)
                {
                    djz.a(b).a(a);
                }
            }

            
            {
                b = djz.this;
                a = s;
                super();
            }
        };
        Object obj = c.c();
        Double double1;
        if (obj != null)
        {
            obj = ((RiderLocation) (obj)).getUberLatLng();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            double1 = Double.valueOf(((UberLatLng) (obj)).a());
        } else
        {
            double1 = null;
        }
        if (obj != null)
        {
            double2 = Double.valueOf(((UberLatLng) (obj)).b());
        }
        s = EmergencyEventDetails.create(s, s1, s2, s3, s4, double1, double2, Long.valueOf(gju.a()));
        b.enableEmergency(s2, s, callback);
    }
}
