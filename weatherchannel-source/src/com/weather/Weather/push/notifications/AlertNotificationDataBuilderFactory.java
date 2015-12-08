// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.push.notifications;

import android.location.Location;
import com.google.common.base.Preconditions;
import com.weather.commons.push.AlertResponseField;
import com.weather.commons.push.ProductType;
import com.weather.commons.push.PushService;
import com.weather.commons.ups.backend.UpsConstants;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.StringUtils;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.log.alerts.AlertLogEntry;
import com.weather.util.log.alerts.AlertsLogger;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.EnumMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.Weather.push.notifications:
//            SevereAlertNotificationDataBuilder, PollenAlertNotificationDataBuilder, RainSnowAlertNotificationDataBuilder, BreakingNewsAlertNotificationDataBuilder, 
//            LighteningStrikeAlertNotificationDataBuilder, RealTimeRainAlertNotificationDataBuilder, HeavyRainAlertNotificationDataBuilder, ThunderStormAlertNotificationDataBuilder, 
//            ExtremeHeatAlertNotificationDataBuilder, HighWindAlertNotificationDataBuilder, DenseFogAlertNotificationDataBuilder, ExtremeColdAlertNotificationDataBuilder, 
//            HeavySnowfallAlertNotificationDataBuilder, IceAlertNotificationDataBuilder, AlertNotificationDataBuilder

public final class AlertNotificationDataBuilderFactory
{

    private static final Map handlerMap;

    private AlertNotificationDataBuilderFactory()
    {
    }

    private static ProductType getAlertProductType(String s)
        throws IllegalStateException, JSONException
    {
        JSONObject jsonobject = new JSONObject(s);
        Object obj;
        try
        {
            obj = jsonobject.getString(AlertResponseField.PRODUCT.getName());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            obj = null;
        }
        s = ((String) (obj));
        if (StringUtils.isBlank(((String) (obj))))
        {
            try
            {
                s = jsonobject.getString(AlertResponseField.SIGNIFICANT_WEATHER_ALERT_TYPE_CODE.getName());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s = null;
            }
        }
        if (StringUtils.isBlank(s))
        {
            throw new IllegalStateException("Alert has no product");
        }
        obj = ProductType.getProduct(s);
        if (obj == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Product ").append(s).append(" has no app code to handle it").toString());
        } else
        {
            logToPrefs(((ProductType) (obj)).getProductName(), jsonobject);
            return ((ProductType) (obj));
        }
    }

    public static AlertNotificationDataBuilder getNotificationDataBuilder(String s)
        throws IllegalStateException, JSONException
    {
        return (AlertNotificationDataBuilder)handlerMap.get(getAlertProductType(s));
    }

    private static void logToPrefs(String s, JSONObject jsonobject)
    {
        double d;
        double d2;
        double d3;
        double d5;
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(jsonobject);
        d3 = 0.0D;
        d5 = 0.0D;
        d = d3;
        d2 = d3;
        if (!jsonobject.has(AlertResponseField.FIELD_LAT.getName()))
        {
            break MISSING_BLOCK_LABEL_51;
        }
        d2 = d3;
        d = jsonobject.getDouble(AlertResponseField.FIELD_LAT.getName());
        double d4;
        d3 = d;
        d4 = d5;
        d2 = d;
        if (!jsonobject.has(AlertResponseField.FIELD_LONG.getName()))
        {
            break MISSING_BLOCK_LABEL_92;
        }
        d2 = d;
        d4 = jsonobject.getDouble(AlertResponseField.FIELD_LONG.getName());
        d3 = d;
_L2:
        Object obj = FollowMe.getInstance().getLocation();
        double d1 = 0.0D;
        d2 = 0.0D;
        if (obj != null)
        {
            d1 = ((SavedLocation) (obj)).getLat();
            d2 = ((SavedLocation) (obj)).getLng();
        }
        Object obj1 = PushService.getRegistrationIdFromSharedPrefs(AbstractTwcApplication.getRootContext());
        String s1 = TwcPrefs.getInstance().getString(com.weather.util.prefs.TwcPrefs.Keys.UPS_USER_ID, "");
        String s2 = UpsConstants.getAndroidDeviceId();
        obj = obj1;
        if (obj1 == null)
        {
            obj = "";
        }
        obj1 = new Location("alertLoc");
        ((Location) (obj1)).setLatitude(d3);
        ((Location) (obj1)).setLongitude(d4);
        Location location = new Location("deviceLoc");
        location.setLatitude(d1);
        location.setLongitude(d2);
        s = new AlertLogEntry(((Location) (obj1)), location, System.currentTimeMillis(), s, jsonobject.toString(), ((String) (obj)), s1, s2);
        AlertsLogger.getInstance().addLogEntry(s);
        return;
        JSONException jsonexception;
        jsonexception;
        d3 = d2;
        d4 = d5;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        handlerMap = new EnumMap(com/weather/commons/push/ProductType);
        handlerMap.put(ProductType.PRODUCT_SEVERE, new SevereAlertNotificationDataBuilder());
        handlerMap.put(ProductType.PRODUCT_POLLEN, new PollenAlertNotificationDataBuilder());
        handlerMap.put(ProductType.PRODUCT_RAINSNOW, new RainSnowAlertNotificationDataBuilder());
        handlerMap.put(ProductType.PRODUCT_BREAKINGNEWS, new BreakingNewsAlertNotificationDataBuilder());
        handlerMap.put(ProductType.PRODUCT_LIGHTNING_STRIKES, new LighteningStrikeAlertNotificationDataBuilder());
        handlerMap.put(ProductType.PRODUCT_REAL_TIME_RAIN, new RealTimeRainAlertNotificationDataBuilder());
        handlerMap.put(ProductType.HEAVY_RAIN, new HeavyRainAlertNotificationDataBuilder());
        handlerMap.put(ProductType.THUNDERSTORM, new ThunderStormAlertNotificationDataBuilder());
        handlerMap.put(ProductType.EXTREME_HEAT, new ExtremeHeatAlertNotificationDataBuilder());
        handlerMap.put(ProductType.HIGH_WIND, new HighWindAlertNotificationDataBuilder());
        handlerMap.put(ProductType.DENSE_FOG, new DenseFogAlertNotificationDataBuilder());
        handlerMap.put(ProductType.EXTREME_COLD, new ExtremeColdAlertNotificationDataBuilder());
        handlerMap.put(ProductType.HEAVY_SNOWFALL, new HeavySnowfallAlertNotificationDataBuilder());
        handlerMap.put(ProductType.ICE, new IceAlertNotificationDataBuilder());
    }
}
