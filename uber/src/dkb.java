// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.model.FareEstimateResponse;
import com.ubercab.client.core.network.FareEstimateApi;
import com.ubercab.client.core.network.model.VehicleViewSurge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dkb
{

    private final cev a;
    private final FareEstimateApi b;

    public dkb(cev cev, FareEstimateApi fareestimateapi)
    {
        b = fareestimateapi;
        a = cev;
    }

    static cev a(dkb dkb1)
    {
        return dkb1.a;
    }

    private static String a(List list)
    {
        return (new bjw()).a(list);
    }

    public final void a(UberLatLng uberlatlng, UberLatLng uberlatlng1, Map map, long l)
    {
        Callback callback = new Callback(l) {

            final long a;
            final dkb b;

            private void a(FareEstimateResponse fareestimateresponse, Response response)
            {
                dkb.a(b).c(new dlq(a, fareestimateresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkb.a(b).c(new dlq(a, retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((FareEstimateResponse)obj, response);
            }

            
            {
                b = dkb.this;
                a = l;
                super();
            }
        };
        ArrayList arraylist = new ArrayList();
        Set set = map.keySet();
        String s;
        for (Iterator iterator = set.iterator(); iterator.hasNext(); arraylist.add(new VehicleViewSurge(s, (Float)map.get(s))))
        {
            s = (String)iterator.next();
        }

        map = a(((List) (arraylist)));
        b.fareEstimates(uberlatlng.a(), uberlatlng.b(), uberlatlng1.a(), uberlatlng1.b(), new ArrayList(set), map, callback);
    }
}
