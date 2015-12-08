// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a.b.b;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.sharephoto.b.g;
import java.io.File;
import java.util.HashMap;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            ad, f, g

class h extends AsyncTask
{

    final f a;

    private h(f f1)
    {
        a = f1;
        super();
    }

    h(f f1, com.gtp.go.weather.sharephoto.photo.g g1)
    {
        this(f1);
    }

    protected transient g a(g ag[])
    {
        ag = ag[0];
        if (ag != null && !TextUtils.isEmpty(ag.x()))
        {
            c.a("download_photo", (new StringBuilder()).append("=================\u300BUrl = ").append(ag.x()).toString());
            Object obj = new File((new StringBuilder()).append(ad.a).append(f.a(a, ag.x())).append(".png").toString());
            c.a("download_photo", (new StringBuilder()).append("=================\u300BFile = ").append(((File) (obj)).toString()).toString());
            if (!((File) (obj)).exists())
            {
                if (w.a())
                {
                    obj = new File(ad.a);
                    if (!((File) (obj)).exists())
                    {
                        ((File) (obj)).mkdirs();
                    }
                    obj = (new StringBuilder()).append(((File) (obj)).getPath()).append(File.separator).append(f.a(a, ag.x())).append(".png").toString();
                    if (b.a(ag.x(), f.a(a), ((String) (obj))))
                    {
                        c.a("download_photo", (new StringBuilder()).append("=================\u300BimgPath = ").append(((String) (obj))).toString());
                        ag.m(((String) (obj)));
                        obj = new ContentValues();
                        ((ContentValues) (obj)).put("compose_path", ag.y());
                        f.a(a).getContentResolver().update(WeatherContentProvider.w, ((ContentValues) (obj)), "photo_id=?", new String[] {
                            String.valueOf(ag.a())
                        });
                        return ag;
                    }
                }
            } else
            {
                ag.m(((File) (obj)).getAbsolutePath());
                obj = new ContentValues();
                ((ContentValues) (obj)).put("compose_path", ag.y());
                f.a(a).getContentResolver().update(WeatherContentProvider.w, ((ContentValues) (obj)), "photo_id=?", new String[] {
                    String.valueOf(ag.a())
                });
                return ag;
            }
        }
        com.gtp.go.weather.sharephoto.photo.f.b(a).remove(Long.valueOf(ag.a()));
        return null;
    }

    protected void a(g g1)
    {
        if (g1 != null)
        {
            long l = g1.a();
            g1 = g1.y();
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_SHARE_PHOTO_REFRESH");
            intent.putExtra("extra_share_photo_id", l);
            intent.putExtra("extra_share_photo_path", g1);
            f.a(a).sendBroadcast(intent);
        }
        com.gtp.go.weather.sharephoto.photo.f.c(a);
        f.d(a);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((g[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((g)obj);
    }
}
