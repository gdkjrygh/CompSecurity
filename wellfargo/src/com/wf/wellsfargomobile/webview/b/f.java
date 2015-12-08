// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.b;

import android.app.DownloadManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import com.wf.wellsfargomobile.BaseWebViewActivity;

// Referenced classes of package com.wf.wellsfargomobile.webview.b:
//            d

class f extends BroadcastReceiver
{

    final BaseWebViewActivity a;
    final d b;

    f(d d, BaseWebViewActivity basewebviewactivity)
    {
        b = d;
        a = basewebviewactivity;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!"android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction()))
        {
            break MISSING_BLOCK_LABEL_218;
        }
        DownloadManager downloadmanager = (DownloadManager)a.getSystemService("download");
        long l = intent.getLongExtra("extra_download_id", 0L);
        intent = new android.app.DownloadManager.Query();
        intent.setFilterById(new long[] {
            l
        });
        intent = downloadmanager.query(intent);
        if (intent.moveToFirst() && 8 == intent.getInt(intent.getColumnIndex("status")))
        {
            android.support.v4.app.NotificationCompat.Builder builder = (new android.support.v4.app.NotificationCompat.Builder(context)).setSmallIcon(0x7f020107).setColor(context.getResources().getColor(0x7f0e0044)).setContentTitle(a.getString(0x7f08005d)).setContentText(a.getString(0x7f08005c));
            builder.setAutoCancel(true);
            Intent intent1 = new Intent("android.intent.action.VIEW");
            intent1.setData(Uri.parse(intent.getString(intent.getColumnIndex("local_uri"))));
            builder.setContentIntent(PendingIntent.getActivity(context, 0, intent1, 0));
            ((NotificationManager)a.getSystemService("notification")).notify(1, builder.build());
        }
        intent.close();
        return;
        context;
        intent.close();
        throw context;
    }
}
