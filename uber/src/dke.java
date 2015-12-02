// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.CombinedLocationHistoryResponse;
import com.ubercab.client.core.model.LocationAutocompleteResponse;
import com.ubercab.client.core.model.LocationHistoryResponse;
import com.ubercab.client.core.model.LocationSearchResponse;
import com.ubercab.client.core.model.LocationSearchResult;
import com.ubercab.client.core.model.LocationTagAddResponse;
import com.ubercab.client.core.model.LocationTagDeleteResponse;
import com.ubercab.client.core.model.TaggedLocationsResponse;
import com.ubercab.client.core.model.UpfrontFareResponse;
import com.ubercab.client.core.network.LocationApi;
import java.util.HashMap;
import java.util.Locale;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dke
    implements dkd
{

    private final cev a;
    private final LocationApi b;
    private final dal c;
    private final gmg d;

    public dke(cev cev, LocationApi locationapi, gmg gmg1, dal dal1)
    {
        a = cev;
        b = locationapi;
        d = gmg1;
        c = dal1;
    }

    static cev a(dke dke1)
    {
        return dke1.a;
    }

    private boolean c()
    {
        return !d.b(dbf.ae);
    }

    public final void a()
    {
        Callback callback = new Callback() {

            final dke a;

            private void a(CombinedLocationHistoryResponse combinedlocationhistoryresponse, Response response)
            {
                dke.a(a).c(new dll(combinedlocationhistoryresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dke.a(a).c(new dll(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((CombinedLocationHistoryResponse)obj, response);
            }

            
            {
                a = dke.this;
                super();
            }
        };
        b.frequentLocations(callback);
    }

    public final void a(double d1, double d2)
    {
        Callback callback = new Callback(d1, d2) {

            final double a;
            final double b;
            final dke c;

            private void a(LocationHistoryResponse locationhistoryresponse, Response response)
            {
                dke.a(c).c(new dme(a, b, locationhistoryresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dke.a(c).c(new dme(a, b, retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((LocationHistoryResponse)obj, response);
            }

            
            {
                c = dke.this;
                a = d1;
                b = d2;
                super();
            }
        };
        String s = Locale.getDefault().getLanguage();
        b.history(d1, d2, s, callback);
    }

    public final void a(double d1, double d2, String s)
    {
        Callback callback = new Callback(s) {

            final String a;
            final dke b;

            private void a(LocationAutocompleteResponse locationautocompleteresponse, Response response)
            {
                dke.a(b).c(new dmc(a, locationautocompleteresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dke.a(b).c(new dmc(a, retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((LocationAutocompleteResponse)obj, response);
            }

            
            {
                b = dke.this;
                a = s;
                super();
            }
        };
        String s1 = Locale.getDefault().getLanguage();
        if (c())
        {
            b.autocompleteV2(d1, d2, s, s1, callback);
            return;
        } else
        {
            b.autocomplete(d1, d2, s, s1, callback);
            return;
        }
    }

    public final void a(String s)
    {
        Callback callback = new Callback() {

            final dke a;

            private void a(LocationTagDeleteResponse locationtagdeleteresponse, Response response)
            {
                dke.a(a).c(new dmh(locationtagdeleteresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dke.a(a).c(new dmh(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((LocationTagDeleteResponse)obj, response);
            }

            
            {
                a = dke.this;
                super();
            }
        };
        b.deleteTag(s, callback);
    }

    public final void a(String s, String s1)
    {
        Callback callback = new Callback(s, s1) {

            final String a;
            final String b;
            final dke c;

            private void a(LocationSearchResult locationsearchresult, Response response)
            {
                dke.a(c).c(new dmd(a, b, locationsearchresult, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dke.a(c).c(new dmd(a, b, retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((LocationSearchResult)obj, response);
            }

            
            {
                c = dke.this;
                a = s;
                b = s1;
                super();
            }
        };
        String s2 = Locale.getDefault().getLanguage();
        if (c())
        {
            b.detailsV2(s, s1, s2, callback);
            return;
        } else
        {
            b.details(s, s1, s2, callback);
            return;
        }
    }

    public final void a(String s, String s1, String s2, String s3)
    {
        Callback callback = new Callback() {

            final dke a;

            private void a(LocationTagAddResponse locationtagaddresponse, Response response)
            {
                dke.a(a).c(new dmg(locationtagaddresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dke.a(a).c(new dmg(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((LocationTagAddResponse)obj, response);
            }

            
            {
                a = dke.this;
                super();
            }
        };
        String s4 = Locale.getDefault().getLanguage();
        String s5 = c.z();
        b.addOrModifyTag(s, s1, s2, s3, s4, s5, new HashMap(), callback);
    }

    public final void b()
    {
        Callback callback = new Callback() {

            final dke a;

            private void a(TaggedLocationsResponse taggedlocationsresponse, Response response)
            {
                dke.a(a).c(new dnl(taggedlocationsresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dke.a(a).c(new dnl(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((TaggedLocationsResponse)obj, response);
            }

            
            {
                a = dke.this;
                super();
            }
        };
        b.taggedLocations(callback);
    }

    public final void b(double d1, double d2, String s)
    {
        Callback callback = new Callback(s) {

            final String a;
            final dke b;

            private void a(LocationSearchResponse locationsearchresponse, Response response)
            {
                dke.a(b).c(new dmf(a, locationsearchresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dke.a(b).c(new dmf(a, retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((LocationSearchResponse)obj, response);
            }

            
            {
                b = dke.this;
                a = s;
                super();
            }
        };
        String s1 = Locale.getDefault().getLanguage();
        if (c())
        {
            b.searchV2(d1, d2, s, s1, Integer.valueOf(1), callback);
            return;
        } else
        {
            b.search(d1, d2, s, s1, Integer.valueOf(1), callback);
            return;
        }
    }

    public final void c(double d1, double d2, String s)
    {
        Callback callback = new Callback() {

            final dke a;

            private void a(UpfrontFareResponse upfrontfareresponse, Response response)
            {
                dke.a(a).c(new dnt(upfrontfareresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dke.a(a).c(new dnt(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((UpfrontFareResponse)obj, response);
            }

            
            {
                a = dke.this;
                super();
            }
        };
        String s1 = Locale.getDefault().getLanguage();
        b.upfrontFares(d1, d2, s, s1, callback);
    }
}
