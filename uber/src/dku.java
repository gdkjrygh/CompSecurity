// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.mobileapptracker.MobileAppTracker;
import com.security.class1.Class1;
import com.security.class3.Class3;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.SwitchProductResponse;
import com.ubercab.client.core.network.SwitchProductApi;
import com.ubercab.rider.realtime.model.FareInfo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dku
{

    private final cev a;
    private final SwitchProductApi b;
    private final cyy c;
    private final Context d;
    private final gju e;
    private final dak f;
    private final MobileAppTracker g;
    private final Class1 h;
    private final Class3 i;
    private final dao j;

    public dku(cev cev, SwitchProductApi switchproductapi, Context context, cyy cyy1, gju gju1, dak dak1, MobileAppTracker mobileapptracker, 
            Class1 class1, Class3 class3, dao dao1)
    {
        a = cev;
        b = switchproductapi;
        c = cyy1;
        d = context;
        e = gju1;
        f = dak1;
        g = mobileapptracker;
        h = class1;
        i = class3;
        j = dao1;
    }

    static cev a(dku dku1)
    {
        return dku1.a;
    }

    private Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("appId", cyy.c());
        hashmap.put("device", "android");
        hashmap.put("deviceId", cwt.a(d));
        hashmap.put("deviceModel", Build.MODEL);
        hashmap.put("deviceOS", android.os.Build.VERSION.RELEASE);
        hashmap.put("epoch", Long.valueOf(gju.a()));
        hashmap.put("language", cwt.a());
        Object obj;
        String s1;
        if (j.q())
        {
            hashmap.put("version", j.r());
        } else
        {
            hashmap.put("version", cyy.a());
        }
        obj = f.c();
        if (obj != null)
        {
            hashmap.put("altitude", Double.valueOf(((RiderLocation) (obj)).getAltitude()));
            hashmap.put("latitude", Double.valueOf(((RiderLocation) (obj)).getUberLatLng().a()));
            hashmap.put("longitude", Double.valueOf(((RiderLocation) (obj)).getUberLatLng().b()));
        }
        obj = new HashMap();
        try
        {
            String s = i.Method5();
            if (!TextUtils.isEmpty(s))
            {
                ((Map) (obj)).put("permId", s);
            }
            s = h.Method5();
            if (!TextUtils.isEmpty(s))
            {
                ((Map) (obj)).put("authId", s);
            }
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror) { }
        catch (SecurityException securityexception) { }
        s1 = g.getGoogleAdvertisingId();
        if (!TextUtils.isEmpty(s1))
        {
            ((Map) (obj)).put("googleAdvertisingId", s1);
        }
        if (!((Map) (obj)).isEmpty())
        {
            hashmap.put("deviceIds", new JSONObject(((Map) (obj))));
        }
        return hashmap;
    }

    public final void a(String s, FareInfo fareinfo)
    {
        Map map = a();
        if (fareinfo != null)
        {
            map.put("fareInfo", fareinfo);
        }
        fareinfo = new Callback() {

            final dku a;

            private void a(SwitchProductResponse switchproductresponse, Response response)
            {
                dku.a(a).c(new dnj(switchproductresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dku.a(a).c(new dnj(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((SwitchProductResponse)obj, response);
            }

            
            {
                a = dku.this;
                super();
            }
        };
        b.switchProduct(s, map, fareinfo);
    }
}
