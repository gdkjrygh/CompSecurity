// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.gcm;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import com.google.android.gms.gcm.b;
import java.util.Calendar;

// Referenced classes of package com.wf.wellsfargomobile.gcm:
//            PNRouterActivity, GcmBroadcastReceiver

public class GcmIntentService extends IntentService
{

    public GcmIntentService()
    {
        super("GcmIntentService");
    }

    public static void a(Context context, Intent intent, String s, long l)
    {
        Object obj = new Intent(context, com/wf/wellsfargomobile/gcm/PNRouterActivity);
        ((Intent) (obj)).putExtra("push_notification_indicator", true);
        ((Intent) (obj)).setData(Uri.parse((new StringBuilder()).append("content://").append(l).toString()));
        Object obj1 = intent.getStringExtra("PNSTOKEN");
        intent = intent.getStringExtra("PNSDEST");
        if (!TextUtils.isEmpty(intent))
        {
            Log.d("GCMIntentService", (new StringBuilder()).append("deepLinkDestination=").append(intent).toString());
            ((Intent) (obj)).putExtra("PNSDEST", intent);
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                Log.d("GCMIntentService", (new StringBuilder()).append("accountHash=").append(((String) (obj1))).toString());
                ((Intent) (obj)).putExtra("PNSTOKEN", ((String) (obj1)));
            }
        }
        intent = PendingIntent.getActivity(context, 0, ((Intent) (obj)), 0x10000000);
        obj = RingtoneManager.getDefaultUri(2);
        obj1 = new android.support.v4.app.NotificationCompat.Builder(context);
        ((android.support.v4.app.NotificationCompat.Builder) (obj1)).setSmallIcon(0x7f020107).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(s)).setTicker(s).setColor(context.getResources().getColor(0x7f0e0044)).setContentText(s).setContentTitle(context.getString(0x7f080153)).setWhen(System.currentTimeMillis()).setAutoCancel(true).setSound(((Uri) (obj))).setContentIntent(intent);
        intent = ((android.support.v4.app.NotificationCompat.Builder) (obj1)).build();
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            RemoteViews remoteviews = new RemoteViews(context.getPackageName(), 0x7f04003f);
            remoteviews.setTextViewText(0x7f0f00e1, s);
            remoteviews.setTextViewText(0x7f0f00df, context.getString(0x7f080153));
            remoteviews.setLong(0x7f0f00e0, "setTime", System.currentTimeMillis());
            intent.contentView = remoteviews;
        }
        ((NotificationManager)context.getSystemService("notification")).notify((int)l, intent);
    }

    protected void onHandleIntent(Intent intent)
    {
        Bundle bundle;
        String s1;
        bundle = intent.getExtras();
        s1 = b.a(this).a(intent);
        Intent intent1 = new Intent("action_gcm_message_arrival");
        intent1.putExtras(intent);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent1);
        if (bundle.isEmpty()) goto _L2; else goto _L1
_L1:
        byte byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 3: default 92
    //                   -2062414158: 142
    //                   102161: 158
    //                   814694033: 126;
           goto _L3 _L4 _L5 _L6
_L3:
        byte0;
        JVM INSTR tableswitch 0 2: default 120
    //                   0 174
    //                   1 186
    //                   2 198;
           goto _L2 _L7 _L8 _L9
_L2:
        GcmBroadcastReceiver.completeWakefulIntent(intent);
        return;
_L6:
        if (s1.equals("send_error"))
        {
            byte0 = 0;
        }
          goto _L3
_L4:
        if (s1.equals("deleted_messages"))
        {
            byte0 = 1;
        }
          goto _L3
_L5:
        if (s1.equals("gcm"))
        {
            byte0 = 2;
        }
          goto _L3
_L7:
        Log.d("GCMIntentService", "Received send error message");
          goto _L2
_L8:
        Log.d("GCMIntentService", "Received deleted messages notification");
          goto _L2
_L9:
        String s = intent.getStringExtra("message");
        if (s == null || "".equals(s))
        {
            Log.e("GCMIntentService", "notification is missing the message, not generating notification UI");
        } else
        {
            a(this, intent, s, Calendar.getInstance().getTimeInMillis());
        }
          goto _L2
    }
}
