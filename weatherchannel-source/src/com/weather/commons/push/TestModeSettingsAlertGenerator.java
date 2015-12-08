// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.weather.commons.locations.LocationManager;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.List;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.push:
//            AlertResponseField, ProductType

public class TestModeSettingsAlertGenerator
{

    private static final String ACTION = "com.google.android.c2dm.intent.RECEIVE";
    private static final String CONTENT_KEY = "content";
    private static final String TAG = "AlertGenerator";
    private final Context context;
    private final LocationManager locationManager;
    private final Random random = new Random();

    public TestModeSettingsAlertGenerator(Context context1, LocationManager locationmanager)
    {
        context = (Context)Preconditions.checkNotNull(context1);
        locationManager = (LocationManager)Preconditions.checkNotNull(locationmanager);
    }

    private SavedLocation pickLocation()
    {
        List list = locationManager.getFollowMeAndFixedLocations();
        if (list.isEmpty())
        {
            return null;
        } else
        {
            return (SavedLocation)list.get(random.nextInt(list.size()));
        }
    }

    private void sendSignificantWeatherAlert(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        if (pickLocation() == null)
        {
            return;
        }
        try
        {
            jsonobject.put(AlertResponseField.SIGNIFICANT_WEATHER_ALERT_LOCALIZED_TEXT.getName(), s1);
            jsonobject.put(AlertResponseField.SIGNIFICANT_WEATHER_ALERT_TYPE_CODE.getName(), s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtil.e("AlertGenerator", LoggingMetaTags.TWC_ALERTS, s.getMessage(), new Object[0]);
        }
        s = new Intent();
        s.putExtra("content", jsonobject.toString());
        s.setAction("com.google.android.c2dm.intent.RECEIVE");
        context.sendOrderedBroadcast(s, null);
        return;
    }

    public void sendBreakingNewsAlert()
    {
        JSONObject jsonobject = new JSONObject();
        Intent intent;
        try
        {
            jsonobject.put(AlertResponseField.PRODUCT.getName(), "breakingnews");
            jsonobject.put(AlertResponseField.ARTICLE_ID.getName(), "003d4bde-da37-4de5-94ce-9ae1465af0d5");
            jsonobject.put(AlertResponseField.ARTICLE_URL.getName(), "http://www.weather.com/article//dwi-news/news/hurac\303\241n-polo-\302\277otra-amenaza-para-baja-california-2014...");
            jsonobject.put(AlertResponseField.IMG_SRC.getName(), "http://dsx01.int.aws.weather.com/util/image/w/a46084a9-06f8-4706-aafa-ceb89b82dd1f.jpg?v=at&amp;...");
            jsonobject.put(AlertResponseField.TITLE.getName(), "Hurac\303\241n Polo: \302\277Otra Amenaza para Baja California?");
        }
        catch (JSONException jsonexception)
        {
            Log.e("AlertGenerator", jsonexception.getMessage(), jsonexception);
        }
        intent = new Intent();
        intent.putExtra("content", jsonobject.toString());
        intent.setAction("com.google.android.c2dm.intent.RECEIVE");
        context.sendOrderedBroadcast(intent, null);
    }

    public void sendDenseFogAlert()
    {
        sendSignificantWeatherAlert(ProductType.DENSE_FOG.getProductName(), "Dense fog expected from 2:00 pm until 3:00 pm");
    }

    public void sendExtremeColdAlert()
    {
        sendSignificantWeatherAlert(ProductType.EXTREME_COLD.getProductName(), "Extreme cold expected from 2:00 pm until 3:00 pm");
    }

    public void sendExtremeHeatAlert()
    {
        sendSignificantWeatherAlert(ProductType.EXTREME_HEAT.getProductName(), "Extreme heat is expected for Atlanta, GA from 2:00 pm until 3:00 pm");
    }

    public void sendHeavyRainAlert()
    {
        sendSignificantWeatherAlert(ProductType.HEAVY_RAIN.getProductName(), "Heavy rains are expected for Atlanta, GA from 2:00 pm until 3:00 pm");
    }

    public void sendHeavySnowfallAlert()
    {
        sendSignificantWeatherAlert(ProductType.HEAVY_SNOWFALL.getProductName(), "Heavy snowfall expected from 2:00 pm until 3:00 pm");
    }

    public void sendHighWindAlert()
    {
        sendSignificantWeatherAlert(ProductType.HIGH_WIND.getProductName(), "High wind expected from 2:00 pm until 3:00 pm");
    }

    public void sendIceAlert()
    {
        sendSignificantWeatherAlert(ProductType.ICE.getProductName(), "Ice is expected from 2:00 pm until 3:00 pm");
    }

    public void sendLightningAlert()
    {
        JSONObject jsonobject = new JSONObject();
        Intent intent;
        try
        {
            jsonobject.put(AlertResponseField.PRODUCT.getName(), ProductType.PRODUCT_LIGHTNING_STRIKES.getProductName());
            jsonobject.put(AlertResponseField.TEXT.getName(), "There was a lightning strike");
        }
        catch (JSONException jsonexception)
        {
            Log.e("AlertGenerator", jsonexception.getMessage(), jsonexception);
        }
        intent = new Intent();
        intent.putExtra("content", jsonobject.toString());
        intent.setAction("com.google.android.c2dm.intent.RECEIVE");
        context.sendOrderedBroadcast(intent, null);
    }

    public void sendPollenAlert()
    {
        JSONObject jsonobject = new JSONObject();
        Object obj = pickLocation();
        if (obj == null)
        {
            return;
        }
        try
        {
            jsonobject.put("product", "pollen");
            jsonobject.put("locationCode", ((SavedLocation) (obj)).getKeyTypeCountry());
            jsonobject.put("prsntNm", ((SavedLocation) (obj)).getPresentationName());
            jsonobject.put("zipCd", ((SavedLocation) (obj)).getZipCode());
            jsonobject.put("treeLevel", "HIGH");
            jsonobject.put("grassLevel", "VERY HIGH");
            jsonobject.put("weedsLevel", "VERY HIGH");
        }
        catch (JSONException jsonexception)
        {
            Log.e("AlertGenerator", jsonexception.getMessage(), jsonexception);
        }
        obj = new Intent();
        ((Intent) (obj)).putExtra("content", jsonobject.toString());
        ((Intent) (obj)).setAction("com.google.android.c2dm.intent.RECEIVE");
        context.sendOrderedBroadcast(((Intent) (obj)), null);
        return;
    }

    public void sendRainSnowAlert()
    {
        JSONObject jsonobject = new JSONObject();
        Object obj = pickLocation();
        if (obj == null)
        {
            return;
        }
        try
        {
            jsonobject.put(AlertResponseField.PRODUCT.getName(), "precip");
            jsonobject.put(AlertResponseField.LOCATION_CODE.getName(), ((SavedLocation) (obj)).getKeyTypeCountry());
            jsonobject.put(AlertResponseField.LOCALIZED_HEADLINE.getName(), "Today's precipitation forecast for Atlanta, GA (30316): Considerable cloudiness");
        }
        catch (JSONException jsonexception)
        {
            Log.e("AlertGenerator", jsonexception.getMessage(), jsonexception);
        }
        obj = new Intent();
        ((Intent) (obj)).putExtra("content", jsonobject.toString());
        ((Intent) (obj)).setAction("com.google.android.c2dm.intent.RECEIVE");
        context.sendOrderedBroadcast(((Intent) (obj)), null);
        return;
    }

    public void sendRealTimeRainAlert()
    {
        JSONObject jsonobject = new JSONObject();
        Intent intent;
        try
        {
            jsonobject.put(AlertResponseField.PRODUCT.getName(), ProductType.PRODUCT_REAL_TIME_RAIN.getProductName());
            jsonobject.put(AlertResponseField.TITLE.getName(), "A brief thunderstorm will begin at 10:59.");
        }
        catch (JSONException jsonexception)
        {
            Log.e("AlertGenerator", jsonexception.getMessage(), jsonexception);
        }
        intent = new Intent();
        intent.putExtra("content", jsonobject.toString());
        intent.setAction("com.google.android.c2dm.intent.RECEIVE");
        context.sendOrderedBroadcast(intent, null);
    }

    public void sendSevereAlert()
    {
        Object obj;
        String s;
        obj = new JSONObject();
        Object obj1;
        try
        {
            obj1 = pickLocation();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("AlertGenerator", ((JSONException) (obj)).getMessage(), ((Throwable) (obj)));
            return;
        }
        if (obj1 == null)
        {
            return;
        }
        ((JSONObject) (obj)).put(AlertResponseField.SEVERITY_NUM.getName(), 1);
        ((JSONObject) (obj)).put(AlertResponseField.PRODUCT.getName(), "severe");
        ((JSONObject) (obj)).put(AlertResponseField.ETNPHENOM.getName(), "SV");
        ((JSONObject) (obj)).put(AlertResponseField.SIGNIFICANCE.getName(), "W");
        ((JSONObject) (obj)).put(AlertResponseField.OFFICE_ID.getName(), "OfficeId");
        ((JSONObject) (obj)).put(AlertResponseField.ETN.getName(), "ETN");
        ((JSONObject) (obj)).put(AlertResponseField.COUNTRY_CODE.getName(), ((SavedLocation) (obj1)).getCountryCode());
        ((JSONObject) (obj)).put(AlertResponseField.CITY.getName(), ((SavedLocation) (obj1)).getCity());
        ((JSONObject) (obj)).put(AlertResponseField.STATE.getName(), ((SavedLocation) (obj1)).getState());
        ((JSONObject) (obj)).put(AlertResponseField.COUNTRY.getName(), "United States");
        ((JSONObject) (obj)).put(AlertResponseField.DESCRIPTION.getName(), "SEVERE THUNDERSTORM WARNING");
        ((JSONObject) (obj)).put(AlertResponseField.TWC_EVENT_ID.getName(), "141606");
        ((JSONObject) (obj)).put(AlertResponseField.PRESENTATION_NAME.getName(), ((SavedLocation) (obj1)).getPresentationName());
        s = ((SavedLocation) (obj1)).getCountyId();
        if (!Strings.isNullOrEmpty(s))
        {
            break MISSING_BLOCK_LABEL_292;
        }
        ((JSONObject) (obj)).put(AlertResponseField.LOC_TYPE.getName(), "Z");
        ((JSONObject) (obj)).put(AlertResponseField.LOCATION.getName(), ((SavedLocation) (obj1)).getZoneId());
_L1:
        obj1 = new Intent();
        ((Intent) (obj1)).putExtra("content", ((JSONObject) (obj)).toString());
        ((Intent) (obj1)).setAction("com.google.android.c2dm.intent.RECEIVE");
        context.sendOrderedBroadcast(((Intent) (obj1)), null);
        return;
        ((JSONObject) (obj)).put(AlertResponseField.LOC_TYPE.getName(), "C");
        ((JSONObject) (obj)).put(AlertResponseField.LOCATION.getName(), s);
          goto _L1
    }

    public void sendThunderstormAlert()
    {
        sendSignificantWeatherAlert(ProductType.THUNDERSTORM.getProductName(), "Thunderstorms are expected for Atlanta, GA from 2:00 pm until 3:00 pm");
    }
}
