// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.map;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.gtp.a.a.c.c;
import com.jiubang.goweather.e.a;
import java.io.File;

// Referenced classes of package com.go.weatherex.map:
//            e, b, c

class d extends AsyncTask
{

    final b a;

    private d(b b1)
    {
        a = b1;
        super();
    }

    d(b b1, com.go.weatherex.map.c c1)
    {
        this(b1);
    }

    static void a(d d1, Object aobj[])
    {
        d1.publishProgress(aobj);
    }

    protected transient Bitmap a(String as[])
    {
        Object obj = new File(c.a(), "radarMap");
        int i;
        int j;
        if (((File) (obj)).exists())
        {
            if (r.b(((File) (obj))) > 0xa00000L)
            {
                r.a(((File) (obj)));
                ((File) (obj)).mkdirs();
            }
        } else
        {
            ((File) (obj)).mkdirs();
        }
        as = as[0];
        if (TextUtils.isEmpty(as)) goto _L2; else goto _L1
_L1:
        obj = new File(((File) (obj)), g.a(as));
        boolean flag;
        if (!((File) (obj)).exists())
        {
            i = 3;
            do
            {
                flag = com.jiubang.goweather.e.a.a(((File) (obj)), as, new e(this));
                j = i - 1;
                if (flag)
                {
                    break;
                }
                i = j;
            } while (j > 0);
        } else
        {
            flag = true;
        }
        if (!flag) goto _L2; else goto _L3
_L3:
        as = BitmapFactory.decodeFile(((File) (obj)).getPath());
_L5:
        obj = as;
        if (as == null)
        {
            obj = BitmapFactory.decodeResource(a.getResources(), 0x7f0200db);
        }
        return ((Bitmap) (obj));
_L2:
        as = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void a(Bitmap bitmap)
    {
        if (!a.isAdded())
        {
            return;
        } else
        {
            com.go.weatherex.map.b.a(a, bitmap);
            return;
        }
    }

    protected transient void a(Integer ainteger[])
    {
        super.onProgressUpdate(ainteger);
        com.go.weatherex.map.b.a(a).b.setVisibility(0);
        com.go.weatherex.map.b.a(a).b.setText((new StringBuilder()).append(ainteger[0]).append("%").toString());
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Bitmap)obj);
    }

    protected void onProgressUpdate(Object aobj[])
    {
        a((Integer[])aobj);
    }
}
