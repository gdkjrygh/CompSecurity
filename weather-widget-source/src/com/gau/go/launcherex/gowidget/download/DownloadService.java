// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.download;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.gau.go.launcherex.gowidget.download:
//            d, c, e

public class DownloadService extends Service
{

    private int a;

    public DownloadService()
    {
        a = 0;
    }

    static int a(DownloadService downloadservice)
    {
        int i = downloadservice.a;
        downloadservice.a = i - 1;
        return i;
    }

    static int b(DownloadService downloadservice)
    {
        return downloadservice.a;
    }

    public void a(e e1)
    {
        if (e1 != null)
        {
            (new d(this, e1)).execute(new Object[] {
                new Object()
            });
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        a = a + 1;
        if (intent != null)
        {
            Object obj = Long.valueOf(intent.getLongExtra("download_task_id_key", -1L));
            if (((Long) (obj)).longValue() != -1L)
            {
                c c1 = c.a(getApplicationContext());
                if (c1 != null && c1.a() != null)
                {
                    obj = (e)c1.a().get(obj);
                    if (obj != null)
                    {
                        a(((e) (obj)));
                    }
                }
            }
        }
        return super.onStartCommand(intent, i, j);
    }
}
