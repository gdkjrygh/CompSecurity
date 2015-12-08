// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.a;

import android.content.ContentResolver;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.coupon.b.b;
import com.gtp.go.weather.coupon.c.a;
import com.gtp.go.weather.sharephoto.a.f;
import com.gtp.go.weather.sharephoto.d.h;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.gtp.go.weather.coupon.a:
//            e, a, h

class g extends AsyncTask
{

    final e a;
    private int b;
    private ArrayList c;

    public g(e e1, int i, ArrayList arraylist)
    {
        a = e1;
        super();
        b = i;
        c = arraylist;
    }

    protected transient ArrayList a(Object aobj[])
    {
        Object obj;
        int i;
        aobj = f.a(com.gtp.go.weather.coupon.a.e.a(a), w.n(com.gtp.go.weather.coupon.a.e.a(a)));
        if (aobj != null)
        {
            aobj = ((JSONObject) (aobj)).toString();
        } else
        {
            aobj = "";
        }
        if (TextUtils.isEmpty(((CharSequence) (aobj))))
        {
            return null;
        }
        obj = com.gtp.go.weather.coupon.a.e.a(a);
        if (b == 0)
        {
            i = 1;
        } else
        {
            i = b;
        }
        aobj = com.gtp.go.weather.coupon.c.a.a(((Context) (obj)), "http://gows.goforandroid.com/goweatherexSns/coupon/couponlist", ((String) (aobj)), i);
        if (TextUtils.isEmpty(((CharSequence) (aobj)))) goto _L2; else goto _L1
_L1:
        aobj = new JSONObject(((String) (aobj)));
        if (aobj == null) goto _L4; else goto _L3
_L3:
        obj = ((JSONObject) (aobj)).optJSONObject("head");
_L8:
        if (obj == null) goto _L6; else goto _L5
_L5:
        i = ((JSONObject) (obj)).optInt("result", -1);
_L9:
label0:
        {
            obj = ((Object) (aobj));
            if (i == 1)
            {
                i = 1;
                break label0;
            }
        }
          goto _L7
_L4:
        obj = null;
          goto _L8
_L6:
        i = -1;
          goto _L9
        Object obj1;
        obj1;
        aobj = null;
_L14:
        obj = ((Object) (aobj));
        if (com.gtp.a.a.b.c.a())
        {
            ((JSONException) (obj1)).printStackTrace();
            obj = ((Object) (aobj));
        }
_L7:
        i = 0;
        aobj = ((Object []) (obj));
        {
            if (i == 0)
            {
                return null;
            }
            obj = new ArrayList();
            JSONObject jsonobject;
            b b1;
            int j;
            if (aobj != null)
            {
                aobj = ((JSONObject) (aobj)).optJSONArray("coupons");
            } else
            {
                aobj = null;
            }
            if (aobj != null)
            {
                i = ((JSONArray) (aobj)).length();
            } else
            {
                i = 0;
            }
            j = 0;
        }
        if (j >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = ((JSONArray) (aobj)).getJSONObject(j);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_352;
        }
        b1 = new b();
        b1.a(jsonobject.getLong("couponId"));
        b1.b(jsonobject.getLong("sourceCouponId"));
        b1.a(jsonobject.getString("title"));
        b1.b(jsonobject.getString("desc"));
        b1.a(jsonobject.getInt("couponType"));
        b1.c(jsonobject.optString("expTime"));
        b1.d(jsonobject.optString("code"));
        b1.e(jsonobject.getString("logoUrl"));
        b1.g(jsonobject.optString("shopName"));
        if (!com.gtp.go.weather.coupon.c.a.c(b1.g()))
        {
            ((ArrayList) (obj)).add(b1);
        }
_L13:
        j++;
        if (true) goto _L11; else goto _L10
_L10:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_208;
        jsonobject;
        try
        {
            if (com.gtp.a.a.b.c.a())
            {
                jsonobject.printStackTrace();
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            if (com.gtp.a.a.b.c.a())
            {
                jsonobject.printStackTrace();
            }
        }
        if (true) goto _L13; else goto _L12
_L12:
        if (b == 0)
        {
            com.gtp.go.weather.coupon.a.e.a(a).getContentResolver().delete(WeatherContentProvider.C, null, null);
            com.gtp.go.weather.coupon.a.e.a(a, ((ArrayList) (obj)), null);
        } else
        {
            com.gtp.go.weather.coupon.a.e.a(a, ((ArrayList) (obj)), c);
        }
        if (!((ArrayList) (obj)).isEmpty())
        {
            aobj = com.gtp.go.weather.coupon.a.a.a(com.gtp.go.weather.coupon.a.e.a(a), new String[] {
                "coupon_id"
            }, null, null);
            Iterator iterator = ((ArrayList) (obj)).iterator();
label1:
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                b b2 = (b)iterator.next();
                Iterator iterator1 = ((ArrayList) (aobj)).iterator();
                b b3;
                do
                {
                    if (!iterator1.hasNext())
                    {
                        continue label1;
                    }
                    b3 = (b)iterator1.next();
                } while (b2.b() != b3.b());
                b2.c(true);
            } while (true);
        }
        return ((ArrayList) (obj));
_L2:
        return null;
        iterator;
          goto _L14
    }

    protected void a(ArrayList arraylist)
    {
        super.onPostExecute(arraylist);
        if (com.gtp.go.weather.coupon.a.e.b(a) != null)
        {
            com.gtp.go.weather.coupon.a.e.b(a).a(arraylist, b);
        }
        if (arraylist != null && com.gtp.go.weather.coupon.a.e.c(a) != null)
        {
            arraylist = arraylist.iterator();
            do
            {
                if (!arraylist.hasNext())
                {
                    break;
                }
                Object obj = (b)arraylist.next();
                if (!((b) (obj)).k())
                {
                    obj = new com.jiubang.core.c.a.a(((b) (obj)).i(), a.a, (new StringBuilder()).append(h.a(((b) (obj)).i())).append(".png").toString());
                    com.gtp.go.weather.coupon.a.e.c(a).a(((com.jiubang.core.c.a.a) (obj)));
                }
            } while (true);
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
