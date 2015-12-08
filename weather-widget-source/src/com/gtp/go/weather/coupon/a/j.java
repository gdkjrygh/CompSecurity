// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.a;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.coupon.c.a;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.gtp.go.weather.coupon.a:
//            e, i

class j extends AsyncTask
{

    final e a;
    private String b;
    private long c;
    private i d;

    public j(e e1, String s, long l, i k)
    {
        a = e1;
        super();
        b = s;
        c = l;
        d = k;
    }

    protected transient Boolean a(Object aobj[])
    {
        boolean flag1;
        flag1 = false;
        if (c == 0L || TextUtils.isEmpty(b))
        {
            return Boolean.valueOf(false);
        }
        aobj = com.gtp.go.weather.coupon.c.a.a(com.gtp.go.weather.coupon.a.e.a(a), "http://www.retailmenot.com/ajax/sendCouponEmail.php", c, b);
        if (TextUtils.isEmpty(((CharSequence) (aobj)))) goto _L2; else goto _L1
_L1:
        aobj = new JSONObject(((String) (aobj)));
        if (aobj == null) goto _L4; else goto _L3
_L3:
        aobj = ((JSONObject) (aobj)).optString("form");
_L7:
        boolean flag2 = TextUtils.isEmpty(((CharSequence) (aobj)));
        boolean flag;
        flag = flag1;
        if (!flag2)
        {
            flag = true;
        }
_L5:
        return Boolean.valueOf(flag);
_L4:
        aobj = null;
        continue; /* Loop/switch isn't completed */
        aobj;
        flag = flag1;
        if (com.gtp.a.a.b.c.a())
        {
            ((JSONException) (aobj)).printStackTrace();
            flag = flag1;
        }
        if (true) goto _L5; else goto _L2
_L2:
        return Boolean.valueOf(false);
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected void a(Boolean boolean1)
    {
        super.onPostExecute(boolean1);
        if (d != null)
        {
            d.a(boolean1.booleanValue());
            d = null;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }
}
