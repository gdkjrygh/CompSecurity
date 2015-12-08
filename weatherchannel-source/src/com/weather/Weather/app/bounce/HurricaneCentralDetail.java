// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app.bounce;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.weather.Weather.hurricane.HurricaneCentralActivity;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public class HurricaneCentralDetail extends Activity
{

    private static final String TAG = "HurricaneCentral";

    public HurricaneCentralDetail()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null)
        {
            Intent intent1 = new Intent(intent);
            intent1.setClass(this, com/weather/Weather/hurricane/HurricaneCentralActivity);
            bundle = null;
            if (intent.getData() != null)
            {
                bundle = intent.getData().getQueryParameter("stormId");
                intent1.putExtra("com.weather.Weather.hurricane.STORM_ID_ARG_KEY", bundle);
            }
            intent.addFlags(0x4000000);
            LogUtil.d("HurricaneCentral", LoggingMetaTags.TWC_DEEPLINK, (new StringBuilder()).append("onCreate: bounceIntent=").append(intent1).append(", stormId=").append(bundle).toString(), new Object[0]);
            startActivity(intent1);
        }
        finish();
    }
}
