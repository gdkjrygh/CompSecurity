// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public abstract class FeedBounceActivity extends Activity
{

    private final String TAG = getClass().getSimpleName();
    private final Class feedActivity;

    protected FeedBounceActivity(Class class1)
    {
        feedActivity = class1;
    }

    protected abstract String getModuleId();

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        if (bundle != null)
        {
            Intent intent = new Intent(bundle);
            intent.setClass(this, feedActivity);
            intent.putExtra("com.weather.moduleId", getModuleId());
            intent.putExtra("com.weather.isHideable", false);
            bundle.addFlags(0x4000000);
            LogUtil.d(TAG, LoggingMetaTags.TWC_DEEPLINK, (new StringBuilder()).append("onCreate: bounceIntent=").append(intent).append(", extras=").append(intent.getExtras()).toString(), new Object[0]);
            startActivity(intent);
        }
        finish();
    }
}
