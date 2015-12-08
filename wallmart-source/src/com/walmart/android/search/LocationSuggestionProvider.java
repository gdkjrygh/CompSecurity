// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.search;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.walmart.android.service.HTTPService;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmart.android.search:
//            SuggestionProvider, SearchData

public abstract class LocationSuggestionProvider
    implements SuggestionProvider
{
    private static class PlacesPrediction
    {

        public Prediction predictions[];
        public String status;

        private PlacesPrediction()
        {
        }
    }

    private static final class Prediction
    {

        public String description;
        public Term terms[];

        private Prediction()
        {
        }
    }

    public static class Prediction.Term
    {

        public String value;

        public Prediction.Term()
        {
        }
    }


    private static final String PARAM_INPUT = "&input=";
    private static final String PARAM_KEY = "&key=";
    private static final String PARAM_LOCATION = "&location=";
    private static final String PARAM_RADIUS = "&radius=";
    private static final String PARAM_SENSOR = "&sensor=";
    private static final String PARAM_TYPES = "&types=";
    private static final String PLACES_BASE_URL = "https://maps.googleapis.com/maps/api/place/autocomplete/json?";
    private static final String REFERER_HEADER = "Referer";
    private static final String TAG = "LocationSuggestionProvider";
    private String mApiKey;
    private BasicResponseHandler mBasicResponseHandler;
    private String mCountryRestriction;
    private HttpClient mHttpClient;
    private String mLocation;
    private ObjectMapper mObjectMapper;
    private String mRadius;
    private String mReferrer;

    public LocationSuggestionProvider(Context context, String s)
    {
        mHttpClient = HTTPService.createHttpClient(context);
        mBasicResponseHandler = new BasicResponseHandler();
        mObjectMapper = new ObjectMapper();
        mObjectMapper.configure(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mApiKey = s;
    }

    public abstract SearchData createSearchData(String s);

    public List getSuggestions(String s)
    {
        Object obj;
        ArrayList arraylist;
        arraylist = new ArrayList();
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("https://maps.googleapis.com/maps/api/place/autocomplete/json?").append("&input=").append(Uri.encode(s)).append("&types=").append("geocode").append("&sensor=").append("true").append("&key=").append(mApiKey);
        if (mLocation != null)
        {
            ((StringBuilder) (obj)).append("&location=").append(mLocation).append("&radius=").append(mRadius);
        }
        if (mCountryRestriction != null)
        {
            ((StringBuilder) (obj)).append((new StringBuilder()).append("&components=country:").append(mCountryRestriction).toString());
        }
        obj = new HttpGet(((StringBuilder) (obj)).toString());
        if (mReferrer != null)
        {
            ((HttpGet) (obj)).addHeader("Referer", mReferrer);
        }
        s = null;
        obj = mHttpClient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        obj = mBasicResponseHandler.handleResponse(((org.apache.http.HttpResponse) (obj)));
        s = ((String) (obj));
_L4:
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int j;
        s = ((PlacesPrediction)mObjectMapper.readValue(s, com/walmart/android/search/LocationSuggestionProvider$PlacesPrediction)).predictions;
        j = s.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(createSearchData(((Prediction) (s[i])).description));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        break; /* Loop/switch isn't completed */
        exception;
        Log.w("LocationSuggestionProvider", "Suggestions error", exception);
        if (true) goto _L4; else goto _L3
        s;
        Log.w("LocationSuggestionProvider", "Suggestions error", s);
_L3:
        return arraylist;
    }

    public void setCountryRestriction(String s)
    {
        mCountryRestriction = s;
    }

    public void setLocationBias(String s, String s1)
    {
        mLocation = s;
        mRadius = s1;
    }

    public void setReferrer(String s)
    {
        mReferrer = s;
    }
}
