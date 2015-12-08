// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.os.AsyncTask;
import android.text.TextUtils;
import java.util.ArrayList;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            ad, ah

class al extends AsyncTask
{

    final ad a;
    private int b;
    private String c;

    public al(ad ad1, boolean flag, int i, String s)
    {
        a = ad1;
        super();
        b = i;
        c = s;
    }

    protected transient ArrayList a(Object aobj[])
    {
        Object obj;
        if (!TextUtils.isEmpty(c))
        {
            obj = "photo_type=? and city_id=?";
            aobj = new String[2];
            aobj[0] = String.valueOf(b);
            aobj[1] = c;
        } else
        {
            obj = "photo_type=?";
            aobj = new String[1];
            aobj[0] = String.valueOf(b);
        }
        aobj = a.b(new String[] {
            "photo_id", "user_id", "photo_type", "favour", "backcount", "is_myfavourite", "city_id", "city", "belong_page", "image_type", 
            "up_time_long", "up_time_date", "desc", "addr", "latlng", "original_url", "original_path", "original_w_h", "watermark_url", "watermark_path", 
            "watermark_w_h", "compose_url", "compose_path", "compose_w_h"
        }, ((String) (obj)), ((String []) (aobj)));
        obj = a.a(new String[] {
            "photo_id", "data_type", "data_value"
        }, "data_type=?", new String[] {
            String.valueOf(1)
        });
        ad.a(a, ((ArrayList) (aobj)), ((java.util.HashMap) (obj)));
        return ((ArrayList) (aobj));
    }

    protected void a(ArrayList arraylist)
    {
        super.onPostExecute(arraylist);
        if (ad.a(a) != null)
        {
            ad.a(a).a(b, c, arraylist);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((ArrayList)obj);
    }
}
