// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ereceipt;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import com.squareup.otto.Bus;
import com.walmart.android.app.main.MainActivity;
import com.walmart.android.config.FragmentConfig;
import com.walmart.android.data.AppConfig;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.util.TextUtils;
import com.walmart.android.util.WalmartUri;
import com.walmartlabs.ereceipt.EReceiptNotificationUtils;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.ereceipt:
//            GCMIntentService

class val.uri
    implements com.walmart.android.wmservice.pConfigCallback
{

    final GCMIntentService this$0;
    final Intent val$intent;
    final WalmartUri val$uri;

    public void onAppConfig(AppConfig appconfig)
    {
        boolean flag = SharedPreferencesUtil.isEReceiptNotificationsEnabled(GCMIntentService.this);
        WLog.d(GCMIntentService.access$000(), (new StringBuilder()).append("Received eReceipt push notification. Notifications enabled: ").append(flag).toString());
        Object obj = EReceiptNotificationUtils.getEReceipt(val$intent);
        boolean flag1 = val$intent.getBooleanExtra("submittedToSC", false);
        if (obj != null && flag)
        {
            Object obj1 = new Intent(GCMIntentService.this, com/walmart/android/app/main/MainActivity);
            ((Intent) (obj1)).setAction("android.intent.action.VIEW");
            ((Intent) (obj1)).setData(Uri.parse(val$uri.getOriginalUri()));
            ((Intent) (obj1)).setFlags(0x10000000);
            ((Intent) (obj1)).putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.mentName.SAVER_DASHBOARD).getName());
            ((Intent) (obj1)).putExtra("START_SYNC", true);
            ((Intent) (obj1)).putExtra("EXTRA_RECEIPT_ID", ((com.walmartlabs.ereceipt.service.eceipt) (obj)).uuid);
            if (((com.walmartlabs.ereceipt.service.eceipt) (obj)).store != null)
            {
                ((Intent) (obj1)).putExtra("EXTRA_STORE_ID", ((com.walmartlabs.ereceipt.service.eceipt) (obj)).store.store);
            }
            ((Intent) (obj1)).putExtra("EXTRA_FROM_SCANNER", false);
            ((Intent) (obj1)).putExtra("EXTRA_ERECEIPT_SUBMITTED_SAVER", flag1);
            obj1 = PendingIntent.getActivity(GCMIntentService.this, EReceiptNotificationUtils.getNextRequestCode(GCMIntentService.this), ((Intent) (obj1)), 0);
            int i;
            int j;
            if (flag1)
            {
                j = 0x7f0904de;
                i = 0x7f0904de;
                appconfig = getString(0x7f0900d4);
            } else
            {
                j = 0x7f0900d6;
                if (appconfig != null && appconfig.saverManualSubmit)
                {
                    i = 0x7f0904de;
                    appconfig = getString(0x7f0904da);
                } else
                {
                    i = 0x7f0900d7;
                    appconfig = getString(0x7f0900d5, new Object[] {
                        Float.valueOf(((com.walmartlabs.ereceipt.service.eceipt) (obj)).getPriceInDollar())
                    });
                }
            }
            obj1 = (new android.support.v4.app.Builder(GCMIntentService.this)).setSmallIcon(0x7f0202ef).setTicker(getString(j)).setContentTitle(getString(i)).setContentText(appconfig).setStyle((new android.support.v4.app.BigTextStyle()).bigText(appconfig)).setContentIntent(((PendingIntent) (obj1))).setAutoCancel(true).build();
            EReceiptNotificationUtils.showNotification(((com.walmartlabs.ereceipt.service.eceipt) (obj)).uuid, GCMIntentService.this, ((android.app.Notification) (obj1)));
            obj = new com.walmartlabs.anivia.uilder("pushNotificationId");
            ((com.walmartlabs.anivia.uilder) (obj)).putString("notificationId", TextUtils.truncate(appconfig, 60));
            MessageBus.getBus().post(obj);
        }
        intentHandled(val$intent);
    }

    le()
    {
        this$0 = final_gcmintentservice;
        val$intent = intent1;
        val$uri = WalmartUri.this;
        super();
    }
}
