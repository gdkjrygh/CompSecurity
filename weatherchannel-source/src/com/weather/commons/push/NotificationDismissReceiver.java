// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.commons.push:
//            AlertResponseField, ProductType, AlertList

public class NotificationDismissReceiver extends BroadcastReceiver
{

    private static final String TAG = "NotificationDismissReceiver";

    public NotificationDismissReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getStringExtra(AlertResponseField.PRODUCT.getName());
        intent = ProductType.getProduct(context);
        LogUtil.d("NotificationDismissReceiver", LoggingMetaTags.TWC_GENERAL, "Dismissing notifications of type %s", new Object[] {
            intent
        });
        if (intent != null)
        {
            static class _cls1
            {

                static final int $SwitchMap$com$weather$commons$push$ProductType[];

                static 
                {
                    $SwitchMap$com$weather$commons$push$ProductType = new int[ProductType.values().length];
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_POLLEN.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_SEVERE.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_RAINSNOW.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_BREAKINGNEWS.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_REAL_TIME_RAIN.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_LIGHTNING_STRIKES.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1..SwitchMap.com.weather.commons.push.ProductType[intent.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                AlertList.pollenList.clearList();
                return;

            case 2: // '\002'
                AlertList.severeList.clearList();
                return;

            case 3: // '\003'
                AlertList.rainSnowList.clearList();
                return;

            case 4: // '\004'
                AlertList.breakingNewsList.clearList();
                return;

            case 5: // '\005'
                AlertList.realTimeRainAlertMessageAlertList.clearList();
                return;

            case 6: // '\006'
                AlertList.lightningStrikeAlertMessageList.clearList();
                break;
            }
            return;
        } else
        {
            Log.e("NotificationDismissReceiver", (new StringBuilder()).append("Alert has unknown product =").append(context).toString());
            return;
        }
    }
}
