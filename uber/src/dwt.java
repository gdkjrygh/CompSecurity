// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.OkHttpClient;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.vendor.google.model.DirectionsResponse;
import com.ubercab.client.core.vendor.google.network.DirectionsApi;
import java.util.Locale;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.OkClient;
import retrofit.client.Response;

public final class dwt
{

    private final cev a;
    private final DirectionsApi b;

    public dwt(cev cev, OkHttpClient okhttpclient)
    {
        a = cev;
        b = (DirectionsApi)(new retrofit.RestAdapter.Builder()).setClient(new OkClient(okhttpclient)).setEndpoint("https://maps.googleapis.com").build().create(com/ubercab/client/core/vendor/google/network/DirectionsApi);
    }

    static cev a(dwt dwt1)
    {
        return dwt1.a;
    }

    private static String a(RiderLocation riderlocation)
    {
        riderlocation = riderlocation.getUberLatLng();
        return String.format("%s,%s", new Object[] {
            Double.valueOf(riderlocation.a()), Double.valueOf(riderlocation.b())
        });
    }

    public final void a(RiderLocation riderlocation, RiderLocation riderlocation1)
    {
        Callback callback = new Callback() {

            final dwt a;

            private void a(DirectionsResponse directionsresponse, Response response)
            {
                dwt.a(a).c(new dwu(directionsresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dwt.a(a).c(new dwu(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((DirectionsResponse)obj, response);
            }

            
            {
                a = dwt.this;
                super();
            }
        };
        b.directions(a(riderlocation), a(riderlocation1), "driving", Locale.getDefault().getLanguage(), callback);
    }
}
