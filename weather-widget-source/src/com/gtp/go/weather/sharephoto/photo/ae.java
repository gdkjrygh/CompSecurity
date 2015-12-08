// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.os.AsyncTask;
import com.gtp.go.weather.sharephoto.b.g;
import java.util.ArrayList;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            ad, a

class ae extends AsyncTask
{

    final a a;
    final long b;
    final ad c;

    ae(ad ad1, a a1, long l)
    {
        c = ad1;
        a = a1;
        b = l;
        super();
    }

    protected transient g a(Long along[])
    {
        Object obj = null;
        along = (new StringBuilder()).append("photo_id=").append(String.valueOf(along[0])).toString();
        ArrayList arraylist = c.b(new String[] {
            "photo_id", "user_id", "photo_type", "favour", "backcount", "is_myfavourite", "city_id", "city", "belong_page", "image_type", 
            "up_time_long", "up_time_date", "desc", "addr", "latlng", "original_url", "original_path", "original_w_h", "watermark_url", "watermark_path", 
            "watermark_w_h", "compose_url", "compose_path", "compose_w_h"
        }, along, null);
        along = obj;
        if (arraylist != null)
        {
            along = obj;
            if (!arraylist.isEmpty())
            {
                along = (g)arraylist.get(0);
            }
        }
        return along;
    }

    protected void a(g g1)
    {
        if (a != null)
        {
            a.a(Long.valueOf(b), g1);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Long[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((g)obj);
    }
}
