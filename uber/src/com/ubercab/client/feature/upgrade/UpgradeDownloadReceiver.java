// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.upgrade;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import gib;
import java.io.File;

public class UpgradeDownloadReceiver extends BroadcastReceiver
{

    private long a;

    public UpgradeDownloadReceiver(long l)
    {
        a = l;
    }

    public void onReceive(Context context, Intent intent)
    {
        DownloadManager downloadmanager = (DownloadManager)context.getSystemService("download");
        intent = Long.valueOf(intent.getLongExtra("extra_download_id", 0L));
        if (intent.longValue() == a)
        {
            intent = downloadmanager.query((new android.app.DownloadManager.Query()).setFilterById(new long[] {
                intent.longValue()
            }));
            if (intent != null && intent.moveToFirst())
            {
                int i = intent.getInt(intent.getColumnIndex("status"));
                if (i == 8)
                {
                    gib.a(context, Uri.fromFile(new File(intent.getString(intent.getColumnIndex("local_filename")))));
                } else
                if (i == 16)
                {
                    context = new android.app.AlertDialog.Builder(context);
                    context.setTitle(0x7f0706c5);
                    context.setMessage(0x7f0706c4);
                    context.setNeutralButton(0x7f070780, null);
                    context.show();
                    return;
                }
            }
        }
    }
}
