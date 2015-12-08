// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.gau.go.launcherex.gowidget.download:
//            c, e, a

public class DownloadBrocastReceiver extends BroadcastReceiver
{

    public DownloadBrocastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (context != null && intent != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        c c1;
        if ((obj = intent.getAction()) == null || "".equals(((String) (obj)).trim()))
        {
            continue; /* Loop/switch isn't completed */
        }
        c1 = c.a(context.getApplicationContext());
        if (!"com.gau.go.launcherex.gowidget.download.DownloadBrocastReceiver.GOWEATHER_DOWNLOAD_STOP".equals(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        long l = intent.getLongExtra("download_task_id_key", 0x8000000000000000L);
        if (l != 0x8000000000000000L && c1 != null)
        {
            c1.a(l);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!"com.gau.go.launcherex.gowidget.download.DownloadBrocastReceiver.GOWEATHER_DOWNLOAD_RESTART".equals(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        long l1 = intent.getLongExtra("download_task_id_key", 0x8000000000000000L);
        if (l1 != 0x8000000000000000L && c1 != null)
        {
            c1.b(l1);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (!"com.gau.go.launcherex.gowidget.download.DownloadBrocastReceiver.GOWEATHER_DOWNLOAD_START".equals(obj))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (c1 != null)
        {
            long l2 = intent.getLongExtra("download_task_id_key", 0x8000000000000000L);
            obj = null;
            if (l2 != 0x8000000000000000L)
            {
                obj = c1.d(l2);
            }
            String s = intent.getStringExtra("download_file_name_key");
            String s1 = intent.getStringExtra("download_url_key");
            String s2 = intent.getStringExtra("download_save_file_path_key");
            intent = intent.getStringExtra("download_package_name_key");
            if (obj == null)
            {
                intent = new e(l2, s1, s, 0L, 0, s2, intent);
                intent.a(new a(context.getApplicationContext()));
                c1.a(intent);
                return;
            }
            if (((e) (obj)).h() == 7 || ((e) (obj)).h() == 4)
            {
                ((e) (obj)).b(s);
                ((e) (obj)).a(s1);
                c1.b(((e) (obj)));
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (!"com.gau.go.launcherex.gowidget.download.DownloadBrocastReceiver.GOWEATHER_DOWNLOAD_DELETE".equals(obj)) goto _L1; else goto _L5
_L5:
        long l3 = intent.getLongExtra("download_task_id_key", 0x8000000000000000L);
        if (l3 != 0x8000000000000000L && c1 != null)
        {
            c1.c(l3);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }
}
