// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.severe;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.weather.commons.push.AlertResponseField;
import com.weather.dal2.TwcDataServer;
import com.weather.dal2.net.JsonObjectMapper;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.net.SimpleHttpGetRequest;
import com.weather.util.device.LocaleUtil;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;

public class PushAlertBeRecordFetcher
{

    public PushAlertBeRecordFetcher()
    {
    }

    private static boolean checkIntent(Intent intent)
    {
        return intent.hasExtra(AlertResponseField.LOCATION.getName()) && intent.hasExtra(AlertResponseField.OFFICE_ID.getName()) && intent.hasExtra(AlertResponseField.ETNPHENOM.getName()) && intent.hasExtra(AlertResponseField.SIGNIFICANCE.getName()) && intent.hasExtra(AlertResponseField.ETN.getName());
    }

    public static String makeUrl(Intent intent)
    {
        if (checkIntent(intent))
        {
            Object obj = intent.getExtras();
            intent = ((Bundle) (obj)).getString(AlertResponseField.LOCATION.getName());
            String s = ((Bundle) (obj)).getString(AlertResponseField.OFFICE_ID.getName());
            String s1 = ((Bundle) (obj)).getString(AlertResponseField.ETNPHENOM.getName());
            String s2 = ((Bundle) (obj)).getString(AlertResponseField.SIGNIFICANCE.getName());
            obj = ((Bundle) (obj)).getString(AlertResponseField.ETN.getName());
            String s3 = LocaleUtil.getLocale().toString();
            return Uri.parse((new StringBuilder()).append(TwcDataServer.getDsxDataUrl()).append("/wxd/v3/BERecord").toString()).buildUpon().appendPath(s3).appendPath(intent).appendPath(s).appendPath(s1).appendPath(s2).appendPath(((String) (obj))).appendQueryParameter("api", TwcDataServer.getApiKey()).build().toString();
        } else
        {
            return null;
        }
    }

    protected static List parse(String s)
        throws JSONException
    {
        return (List)JsonObjectMapper.fromJson(s, (new _cls1()).getType());
    }

    public void asyncFetch(Intent intent, Receiver receiver)
    {
        if (checkIntent(intent))
        {
            (new SimpleHttpGetRequest()).asyncFetch(makeUrl(intent), false, null, receiver);
        }
    }

    /* member class not found */
    class _cls1 {}

}
