// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.gtp.go.weather.sharephoto.takephoto.ab;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            ad

class ag extends AsyncTask
{

    final ContentResolver a;
    final long b;
    final ad c;

    ag(ad ad1, ContentResolver contentresolver, long l)
    {
        c = ad1;
        a = contentresolver;
        b = l;
        super();
    }

    protected transient Void a(Void avoid[])
    {
        if (a.delete(WeatherContentProvider.w, "photo_id = ? AND (photo_type = ? OR ( photo_type = ? AND image_type = ? ))", new String[] {
    String.valueOf(b), String.valueOf(3), String.valueOf(2), String.valueOf(1)
}) < 1)
        {
            a.delete(WeatherContentProvider.x, "photo_id = ?", new String[] {
                String.valueOf(b)
            });
            r.a(ab.a(b));
        }
        return null;
    }

    protected void a(Void void1)
    {
        void1 = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_USER_PHOTO");
        void1.putExtra("extra_delete_photo_id", b);
        ad.b(c).sendBroadcast(void1);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }
}
