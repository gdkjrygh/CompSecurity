// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.AsyncTask;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gtp.go.weather.sharephoto.b.a.d;
import com.gtp.go.weather.sharephoto.b.e;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoDetailActivity

class c extends AsyncTask
{

    final long a;
    final PhotoDetailActivity b;

    c(PhotoDetailActivity photodetailactivity, long l)
    {
        b = photodetailactivity;
        a = l;
        super();
    }

    protected transient e a(Long along[])
    {
        along = b;
        String s = (new StringBuilder()).append("photo_id=").append(a).toString();
        along = d.a(along, new String[] {
            "_id", "photo_id", "photo_path", "photo_upload_size", "watermark_path", "watermark_upload_size", "description", "city_id", "city_name"
        }, s, null);
        if (along != null && !along.isEmpty())
        {
            Object obj = b.getContentResolver();
            android.net.Uri uri = WeatherContentProvider.y;
            String s1 = (new StringBuilder()).append("photo_id=").append(a).toString();
            obj = ((ContentResolver) (obj)).query(uri, new String[] {
                "photo_id"
            }, s1, null, null);
            if (obj != null)
            {
                PhotoDetailActivity photodetailactivity = b;
                boolean flag;
                if (((Cursor) (obj)).getCount() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                PhotoDetailActivity.a(photodetailactivity, flag);
                ((Cursor) (obj)).close();
            }
            return (e)along.get(0);
        } else
        {
            return null;
        }
    }

    protected void a(e e1)
    {
        if (e1 != null)
        {
            String s = e1.g();
            String s1 = e1.h();
            PhotoDetailActivity.a(b, e1.c());
            PhotoDetailActivity.a(b, s, s1);
            return;
        } else
        {
            com.gtp.a.a.b.c.a("lishen", (new StringBuilder()).append("\u627E\u4E0D\u5230id\u4E3A").append(a).append("\u7684\u56FE\u7247\u3002").toString());
            b.finish();
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Long[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((e)obj);
    }
}
