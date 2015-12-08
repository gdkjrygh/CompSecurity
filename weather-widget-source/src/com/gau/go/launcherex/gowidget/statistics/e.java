// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;

// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            c, d

class e extends AsyncTask
{

    final c a;

    private e(c c1)
    {
        a = c1;
        super();
    }

    e(c c1, d d)
    {
        this(c1);
    }

    protected transient Void a(Void avoid[])
    {
        avoid = c.a(a).getFileStreamPath("network_time_and_status_statistics_email.txt");
        break MISSING_BLOCK_LABEL_13;
        if (avoid != null && avoid.exists() && !avoid.isDirectory() && avoid.length() > 20480L)
        {
            avoid.delete();
            avoid = c.a(a).getFileStreamPath("collect_data_weather_refresh_error_info.txt");
            if (avoid != null)
            {
                avoid.delete();
                return null;
            }
        }
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }
}
