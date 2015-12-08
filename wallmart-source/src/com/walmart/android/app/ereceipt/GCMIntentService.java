// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ereceipt;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.squareup.otto.Bus;
import com.urbanairship.push.GCMPushReceiver;
import com.walmart.android.app.MainThreadIntentService;
import com.walmart.android.app.main.MainActivity;
import com.walmart.android.app.saver.SaverNotificationUtils;
import com.walmart.android.config.FragmentConfig;
import com.walmart.android.data.AppConfig;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.util.TextUtils;
import com.walmart.android.util.WalmartUri;
import com.walmart.android.utils.UrlUtils;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.fastpickup.FastPickupService;
import com.walmartlabs.android.photo.gcm.PhotoGcmHelper;
import com.walmartlabs.ereceipt.EReceiptNotificationUtils;
import com.walmartlabs.payment.service.mpay.MobilePayNotificationManager;
import com.walmartlabs.utils.WLog;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.walmart.android.app.ereceipt:
//            GCMBroadcastReceiver

public class GCMIntentService extends MainThreadIntentService
{

    private static final String GCM_NOTIFICATION_COUNTER_PREF = "COUNTER";
    private static final String GCM_NOTIFICATION_PREFS = "GCM_NOTIFICATION_PREFS";
    private static final String TAG = com/walmart/android/app/ereceipt/GCMIntentService.getSimpleName();
    private static final String TEXT_KEY = "text";
    private static final String TITLE_KEY = "title";
    public static final String URL_KEY = "url";
    private static final String VUDU_KEY = "vudu";
    private final Handler mHandler = new Handler();

    public GCMIntentService()
    {
    }

    private static int getNextRequestCode(Context context)
    {
        context = context.getSharedPreferences("GCM_NOTIFICATION_PREFS", 0);
        int i = context.getInt("COUNTER", 0) + 1;
        context = context.edit();
        context.putInt("COUNTER", i);
        context.apply();
        return i;
    }

    private boolean handleEReceiptPushNotification(final Intent intent, final WalmartUri uri)
    {
        AppConfigManager.get().start(getApplicationContext(), new com.walmart.android.wmservice.AppConfigManager.AppConfigCallback() {

            final GCMIntentService this$0;
            final Intent val$intent;
            final WalmartUri val$uri;

            public void onAppConfig(AppConfig appconfig)
            {
                boolean flag = SharedPreferencesUtil.isEReceiptNotificationsEnabled(GCMIntentService.this);
                WLog.d(GCMIntentService.TAG, (new StringBuilder()).append("Received eReceipt push notification. Notifications enabled: ").append(flag).toString());
                Object obj = EReceiptNotificationUtils.getEReceipt(intent);
                boolean flag1 = intent.getBooleanExtra("submittedToSC", false);
                if (obj != null && flag)
                {
                    Object obj1 = new Intent(GCMIntentService.this, com/walmart/android/app/main/MainActivity);
                    ((Intent) (obj1)).setAction("android.intent.action.VIEW");
                    ((Intent) (obj1)).setData(Uri.parse(uri.getOriginalUri()));
                    ((Intent) (obj1)).setFlags(0x10000000);
                    ((Intent) (obj1)).putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.SAVER_DASHBOARD).getName());
                    ((Intent) (obj1)).putExtra("START_SYNC", true);
                    ((Intent) (obj1)).putExtra("EXTRA_RECEIPT_ID", ((com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt) (obj)).uuid);
                    if (((com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt) (obj)).store != null)
                    {
                        ((Intent) (obj1)).putExtra("EXTRA_STORE_ID", ((com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt) (obj)).store.id);
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
                                Float.valueOf(((com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt) (obj)).getPriceInDollar())
                            });
                        }
                    }
                    obj1 = (new android.support.v4.app.NotificationCompat.Builder(GCMIntentService.this)).setSmallIcon(0x7f0202ef).setTicker(getString(j)).setContentTitle(getString(i)).setContentText(appconfig).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(appconfig)).setContentIntent(((PendingIntent) (obj1))).setAutoCancel(true).build();
                    EReceiptNotificationUtils.showNotification(((com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt) (obj)).uuid, GCMIntentService.this, ((Notification) (obj1)));
                    obj = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pushNotificationId");
                    ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj)).putString("notificationId", TextUtils.truncate(appconfig, 60));
                    MessageBus.getBus().post(obj);
                }
                intentHandled(intent);
            }

            
            {
                this$0 = GCMIntentService.this;
                intent = intent1;
                uri = walmarturi;
                super();
            }
        });
        return false;
    }

    private boolean handleReceive(Intent intent)
    {
        String s;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag1 = false;
        flag3 = false;
        if (intent.getStringExtra("vudu") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = intent.getStringExtra("url");
        if (!flag) goto _L2; else goto _L1
_L1:
        if (UrlUtils.isHttpUrl(s) && SharedPreferencesUtil.isVuduNotificationsEnabled(this))
        {
            showUrlNotification(s, intent.getStringExtra("title"), intent.getStringExtra("text"));
        }
        flag2 = true;
        flag = true;
_L4:
        if (!flag)
        {
            flag2 = handleUAPushNotification(intent);
        }
        return flag2;
_L2:
        if (s != null)
        {
            WalmartUri walmarturi = WalmartUri.parse(s);
            if (walmarturi != null && walmarturi.getType() == 16)
            {
                flag2 = handleEReceiptPushNotification(intent, walmarturi);
                flag = true;
            } else
            if (walmarturi != null && walmarturi.getType() == 17)
            {
                flag2 = handleSaverPushNotification(intent, walmarturi);
                flag = true;
            } else
            if (walmarturi != null && walmarturi.getType() == 21)
            {
                s = intent.getStringExtra("title");
                String s1 = intent.getStringExtra("text");
                FastPickupService.startPushNotification(this, walmarturi.getParam(0), s, s1, intent.getExtras());
                flag2 = true;
                flag = true;
            } else
            if (walmarturi != null && walmarturi.getType() == 25)
            {
                flag2 = handleWalmartPayPushNotification(intent, walmarturi);
                flag = true;
            } else
            {
                flag = flag1;
                flag2 = flag3;
                if (UrlUtils.isHttpUrl(s))
                {
                    flag = flag1;
                    flag2 = flag3;
                    if (SharedPreferencesUtil.isPromotionNotificationsEnabled(this))
                    {
                        showUrlNotification(s, intent.getStringExtra("title"), intent.getStringExtra("text"));
                        flag2 = true;
                        flag = true;
                    }
                }
            }
        } else
        {
            flag = flag1;
            flag2 = flag3;
            if (intent.getStringExtra("photo-message") != null)
            {
                PhotoGcmHelper.onReceive(this, intent);
                flag2 = true;
                flag = true;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean handleSaverPushNotification(Intent intent, WalmartUri walmarturi)
    {
        boolean flag;
        flag = SharedPreferencesUtil.isSaverNotificationsEnabled(this);
        WLog.d(TAG, (new StringBuilder()).append("Received Saver push notification. Notifications enabled: ").append(flag).toString());
        if (!flag) goto _L2; else goto _L1
_L1:
        String s;
        String s1;
        Intent intent1;
        int i;
        s1 = walmarturi.getParam(0);
        s = intent.getStringExtra("text");
        i = SaverNotificationUtils.getGCMAmountSaved(intent);
        intent = SaverNotificationUtils.getGCMDate(intent);
        intent1 = new Intent(this, com/walmart/android/app/main/MainActivity);
        intent1.setData(Uri.parse(walmarturi.getOriginalUri()));
        intent1.setAction("android.intent.action.VIEW");
        intent1.setFlags(0x10000000);
        intent1.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.SAVER_DASHBOARD).getName());
        intent1.putExtra("START_SYNC", true);
        intent1.putExtra("EXTRA_AMOUNT", i);
        intent1.putExtra("EXTRA_DATE", intent);
        intent1.putExtra("EXTRA_TC_NUMBER", s1);
        intent = s;
        if (s != null) goto _L4; else goto _L3
_L3:
        if (i <= 0) goto _L6; else goto _L5
_L5:
        intent = getString(0x7f09048e);
_L4:
        walmarturi = PendingIntent.getActivity(this, SaverNotificationUtils.getNextRequestCode(this), intent1, 0);
        SaverNotificationUtils.showNotification(s1, this, (new android.support.v4.app.NotificationCompat.Builder(this)).setSmallIcon(0x7f0202ef).setTicker(getString(0x7f0904de)).setContentTitle(getString(0x7f0904de)).setContentText(intent).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(intent)).setContentIntent(walmarturi).setAutoCancel(true).build());
        walmarturi = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Results Notification").putString("section", "Saver").putString("subCategory", "Receipt");
        MessageBus.getBus().post(walmarturi);
        walmarturi = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pushNotificationId");
        walmarturi.putString("notificationId", TextUtils.truncate(intent, 60));
        MessageBus.getBus().post(walmarturi);
_L2:
        return true;
_L6:
        intent = s;
        if (i == 0)
        {
            intent = getString(0x7f090490);
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    private boolean handleUAPushNotification(Intent intent)
    {
        WLog.d(TAG, "Received UA push notification");
        if (SharedPreferencesUtil.isPromotionNotificationsEnabled(this))
        {
            intent = new Intent(intent);
            intent.setClassName(this, com/urbanairship/push/GCMPushReceiver.getName());
            sendOrderedBroadcast(intent, null);
        } else
        {
            WLog.d(TAG, "UA push notifications are disabled");
        }
        return true;
    }

    private boolean handleWalmartPayPushNotification(final Intent notification, WalmartUri walmarturi)
    {
        boolean flag = SharedPreferencesUtil.isEReceiptNotificationsEnabled(this);
        WLog.d(TAG, (new StringBuilder()).append("Received Walmart Pay push notification. Notifications enabled: ").append(flag).toString());
        if (flag)
        {
            final String transactionId = walmarturi.toString();
            transactionId = transactionId.substring(transactionId.lastIndexOf('/') + 1);
            notification = notification.getStringExtra("text");
            Intent intent = new Intent(this, com/walmart/android/app/main/MainActivity);
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(walmarturi.getOriginalUri()));
            walmarturi = PendingIntent.getActivity(this, getNextRequestCode(this), intent, 0);
            notification = (new android.support.v4.app.NotificationCompat.Builder(this)).setSmallIcon(0x7f02017f).setContentTitle(getResources().getString(0x7f090079)).setContentText(notification).setContentIntent(walmarturi).setDefaults(16).build();
            Services.get().getAuthentication().renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

                final GCMIntentService this$0;
                final Notification val$notification;
                final String val$transactionId;

                public void onFailure(int i)
                {
                    WLog.d(GCMIntentService.TAG, "Failed to renew auth");
                }

                public void onSuccess()
                {
                    WLog.d(GCMIntentService.TAG, "Successfully renewed auth");
                    MobilePayNotificationManager.get().notifyMobilePay(transactionId, GCMIntentService.this, notification);
                }

            
            {
                this$0 = GCMIntentService.this;
                transactionId = s;
                notification = notification1;
                super();
            }
            });
        }
        return true;
    }

    private void printExtras(Intent intent)
    {
        if (intent != null)
        {
            Iterator iterator = intent.getExtras().keySet().iterator();
            while (iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                Object obj = intent.getExtras().get(s);
                WLog.d(TAG, String.format("%s: %s (%s)", new Object[] {
                    s, obj.toString(), obj.getClass().getName()
                }));
            }
        }
    }

    private void showUrlNotification(String s, String s1, String s2)
    {
        String s3 = s1;
        if (android.text.TextUtils.isEmpty(s1))
        {
            s3 = getString(0x7f090079);
        }
        if (s2 != null)
        {
            s1 = s2;
        } else
        {
            s1 = "";
        }
        s2 = new Intent("android.intent.action.VIEW", Uri.parse(s));
        s2.setFlags(0x10000000);
        s2 = PendingIntent.getActivity(this, getNextRequestCode(this), s2, 0);
        s2 = (new android.support.v4.app.NotificationCompat.Builder(this)).setSmallIcon(0x7f0202ef).setTicker(s3).setContentTitle(s3).setContentText(s1).setContentIntent(s2).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(s1)).setAutoCancel(true).build();
        ((NotificationManager)getSystemService("notification")).notify(s, 0, s2);
        s = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pushNotificationId");
        s.putString("notificationId", TextUtils.truncate(s1, 60));
        MessageBus.getBus().post(s);
    }

    protected void intentHandled(Intent intent)
    {
        super.intentHandled(intent);
        GCMBroadcastReceiver.completeWakefulIntent(intent);
    }

    public final boolean onHandleIntent(Intent intent)
    {
        if (intent.getAction().equals("com.google.android.c2dm.intent.RECEIVE"))
        {
            return handleReceive(intent);
        } else
        {
            return true;
        }
    }


}
