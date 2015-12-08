// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.post;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.ui.UIUtil;
import org.json.JSONException;
import org.json.JSONObject;

class DeviceJson
{

    public static final String APP_VERSION = "appVersion";
    public static final String BRAND = "brand";
    public static final String IS_TABLET = "formFactor";
    public static final String MANUFACTURER = "manufacturer";
    public static final String MODEL = "model";
    public static final String OS = "os";
    public static final String OS_NAME = "Android";
    public static final String PRODUCT = "product";
    public static final String SDK_INT = "sdk";
    private final JSONObject jsonObject = new JSONObject();

    DeviceJson()
        throws JSONException
    {
        jsonObject.put("product", Build.PRODUCT);
        jsonObject.put("manufacturer", Build.MANUFACTURER);
        jsonObject.put("model", Build.MODEL);
        jsonObject.put("brand", Build.BRAND);
        jsonObject.put("os", (new StringBuilder()).append("Android  ").append(android.os.Build.VERSION.RELEASE).toString());
        jsonObject.put("sdk", android.os.Build.VERSION.SDK_INT);
        JSONObject jsonobject = jsonObject;
        String s;
        if (UIUtil.isTablet(AbstractTwcApplication.getRootContext()))
        {
            s = "TABLET";
        } else
        {
            s = "PHONE";
        }
        jsonobject.put("formFactor", s);
        try
        {
            s = AbstractTwcApplication.getRootContext().getPackageManager().getPackageInfo("com.weather.Weather", 0).versionName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception = " ";
        }
        jsonObject.put("appVersion", s);
    }

    public JSONObject getJsonObject()
    {
        return jsonObject;
    }
}
