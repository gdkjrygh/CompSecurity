// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.gtp.go.weather.sharephoto.a.f;
import com.gtp.go.weather.sharephoto.a.g;
import org.json.JSONObject;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            ad, ac, a

class af extends AsyncTask
{

    final long a;
    final a b;
    final ad c;

    af(ad ad1, long l, a a1)
    {
        c = ad1;
        a = l;
        b = a1;
        super();
    }

    protected transient Boolean a(Void avoid[])
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        avoid = f.a(ad.b(c));
        g g1 = g.a(ad.b(c));
        avoid = ac.a(ad.b(c), "http://gows.goforandroid.com/goweatherexSns/image/deleteImage", avoid.toString(), g1.d(), a);
        flag = flag1;
        if (TextUtils.isEmpty(avoid)) goto _L2; else goto _L1
_L1:
        int i;
        try
        {
            avoid = (new JSONObject(avoid)).optJSONObject("head");
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            avoid.printStackTrace();
            flag = flag1;
            continue; /* Loop/switch isn't completed */
        }
        if (avoid == null) goto _L4; else goto _L3
_L3:
        i = avoid.optInt("result", 0);
        if (i == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L2:
        return Boolean.valueOf(flag);
_L4:
        flag = false;
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected void a(Boolean boolean1)
    {
        if (b != null)
        {
            b.a(Long.valueOf(a), boolean1);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }
}
