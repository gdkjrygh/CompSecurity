// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.push.notifications;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.weather.Weather.settings.alerts.donotdisturb.DoNotDisturbValidator;
import com.weather.commons.push.AlertList;
import com.weather.commons.push.ProductType;
import com.weather.commons.push.notifications.NotificationCreator;
import com.weather.util.StringUtils;
import com.weather.util.time.validator.TimeValidationException;
import org.json.JSONException;

// Referenced classes of package com.weather.Weather.push.notifications:
//            AlertNotificationData, AlertNotificationDataBuilderFactory, AlertNotificationDataBuilder

public class AlertProcessingService extends IntentService
{

    private static final String TAG = "AlertProcessingService";

    public AlertProcessingService()
    {
        super("AlertProcessingService");
    }

    private String extractIntentData(Intent intent)
        throws IllegalStateException
    {
        Object obj = intent.getExtras();
        intent = "";
        if (obj != null)
        {
            intent = ((Bundle) (obj)).getString("content");
            obj = ((Bundle) (obj)).getString("message");
            if (intent == null)
            {
                intent = ((Intent) (obj));
            }
        }
        if (StringUtils.isBlank(intent))
        {
            throw new IllegalStateException("Intent with out alert data to process");
        } else
        {
            return intent;
        }
    }

    private void sendNotification(AlertNotificationData alertnotificationdata)
        throws JSONException
    {
        if (alertnotificationdata != null)
        {
            Object obj = alertnotificationdata.getAlertList().addAlert(alertnotificationdata.getAlertJsonData());
            android.app.Notification notification = alertnotificationdata.getNotificationCreator().create(((java.util.Collection) (obj)), this, alertnotificationdata.getSoundUri(), alertnotificationdata.getVibrationSetting(), alertnotificationdata.getLightColor(), alertnotificationdata.getContentInfo());
            int i = alertnotificationdata.getNotificationCreator().getNotificationId(((java.util.Collection) (obj)));
            obj = (NotificationManager)getSystemService("notification");
            ((NotificationManager) (obj)).notify(i, notification);
            if (alertnotificationdata.getNotificationCreator().hasBackgroundImage())
            {
                ((NotificationManager) (obj)).notify(i, notification);
                return;
            }
        }
    }

    private void validateDoNotDisturb(ProductType producttype)
        throws TimeValidationException
    {
        (new DoNotDisturbValidator()).setProductType(producttype).validate();
    }

    protected void onHandleIntent(Intent intent)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = "";
        obj1 = obj2;
        obj = obj2;
        intent = extractIntentData(intent);
        obj1 = intent;
        obj = intent;
        obj2 = intent;
        AlertNotificationDataBuilder alertnotificationdatabuilder = AlertNotificationDataBuilderFactory.getNotificationDataBuilder(intent);
        obj1 = intent;
        obj = intent;
        obj2 = intent;
        validateDoNotDisturb(alertnotificationdatabuilder.getProductType());
        obj1 = intent;
        obj = intent;
        obj2 = intent;
        try
        {
            sendNotification(alertnotificationdatabuilder.buildNotificationData(intent));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            obj = obj2;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            obj = obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        Log.e("AlertProcessingService", (new StringBuilder()).append(intent.getMessage()).append('\n').append(((String) (obj))).toString());
        return;
    }
}
