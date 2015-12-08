// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.text.TextUtils;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.sharephoto.a.f;
import com.gtp.go.weather.sharephoto.b.g;
import com.gtp.go.weather.sharephoto.b.o;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            ad, ac, ah

class ai extends AsyncTask
{

    final ad a;
    private int b;
    private int c;
    private int d;
    private String e;

    public ai(ad ad1, int i, int j, String s)
    {
        a = ad1;
        super();
        b = -1;
        c = i;
        d = j;
        e = s;
    }

    protected transient ArrayList a(ArrayList aarraylist[])
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        if (aarraylist == null || aarraylist.length <= 0) goto _L2; else goto _L1
_L1:
        aarraylist = aarraylist[0];
        if (aarraylist == null || aarraylist.isEmpty()) goto _L2; else goto _L3
_L3:
        Object obj2;
        obj2 = aarraylist.iterator();
        aarraylist = ((ArrayList []) (obj1));
_L5:
        Object obj3;
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break MISSING_BLOCK_LABEL_163;
            }
            obj3 = (g)((Iterator) (obj2)).next();
        } while (obj3 == null);
        switch (((g) (obj3)).g())
        {
        default:
            obj1 = obj;
            obj = aarraylist;
            aarraylist = ((ArrayList []) (obj1));
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_135;
        }
_L6:
        ArrayList aarraylist1[] = ((ArrayList []) (obj));
        obj = aarraylist;
        aarraylist = aarraylist1;
        if (true) goto _L5; else goto _L4
_L4:
        aarraylist1 = aarraylist;
        if (aarraylist == null)
        {
            aarraylist1 = new ArrayList();
        }
        aarraylist1.add(obj3);
        aarraylist = ((ArrayList []) (obj));
        obj = aarraylist1;
          goto _L6
        aarraylist1 = ((ArrayList []) (obj));
        if (obj == null)
        {
            aarraylist1 = new ArrayList();
        }
        aarraylist1.add(obj3);
        obj = aarraylist;
        aarraylist = aarraylist1;
          goto _L6
        aarraylist1 = aarraylist;
_L23:
        com.gtp.a.a.b.c.a("photo", (new StringBuilder()).append("================= \u5F00\u59CB\u83B7\u53D6\u56FE\u7247 ================= \u56FE\u7247\u7C7B\u578B => ").append(d).toString());
        if (d == 2)
        {
            com.gtp.a.a.b.c.a("photo", (new StringBuilder()).append("mCityId --> ").append(e).toString());
        }
        aarraylist = f.a(ad.b(a));
        if (aarraylist != null)
        {
            obj2 = aarraylist.toString();
        } else
        {
            obj2 = "";
        }
        com.gtp.a.a.b.c.a("photo", (new StringBuilder()).append("phead --> ").append(((String) (obj2))).toString());
        if (TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            return null;
        }
        obj3 = com.gtp.go.weather.sharephoto.a.g.a(ad.b(a)).b().a();
        com.gtp.a.a.b.c.a("photo", (new StringBuilder()).append("userId --> ").append(((String) (obj3))).toString());
        aarraylist = "";
        d;
        JVM INSTR tableswitch 1 3: default 368
    //                   1 590
    //                   2 596
    //                   3 602;
           goto _L7 _L8 _L9 _L10
_L7:
        boolean flag1;
        int k;
        long l;
        com.gtp.a.a.b.c.a("photo", (new StringBuilder()).append("url --> ").append(aarraylist).toString());
        if (c < 0)
        {
            c = 0;
        }
        com.gtp.a.a.b.c.a("photo", (new StringBuilder()).append("mDataPage --> ").append(c).toString());
        l = System.currentTimeMillis();
        obj2 = ac.a(ad.b(a), aarraylist, ((String) (obj2)), ((String) (obj3)), e, c);
        k = (int)(System.currentTimeMillis() - l);
        com.gtp.a.a.b.c.a("time_photo", (new StringBuilder()).append("\u672C\u6B21\u670D\u52A1\u5668\u83B7\u53D6\u56FE\u7247\u6570\u636E\u5171\u7528\u4E86 ").append(k).append(" \u6BEB\u79D2\uFF01").toString());
        com.gtp.a.a.b.c.a("photo", (new StringBuilder()).append("\u3010result\u3011 --> ").append(((String) (obj2))).toString());
        if (TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            break MISSING_BLOCK_LABEL_1059;
        }
        flag1 = false;
        aarraylist = new JSONObject(((String) (obj2)));
        if (aarraylist == null) goto _L12; else goto _L11
_L11:
        aarraylist = aarraylist.optJSONObject("head");
_L15:
        if (aarraylist == null) goto _L14; else goto _L13
_L13:
        int i = aarraylist.optInt("result", -1);
_L16:
        boolean flag;
        flag = flag1;
        if (i == 1)
        {
            flag = true;
        }
_L17:
        if (!flag)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_641;
_L8:
        aarraylist = "http://gows.goforandroid.com/goweatherexSns/image/choiceImageIssued";
          goto _L7
_L9:
        aarraylist = "http://gows.goforandroid.com/goweatherexSns/image/cityImageIssued";
          goto _L7
_L10:
        aarraylist = "http://gows.goforandroid.com/goweatherexSns/image/userImageIssued";
          goto _L7
_L12:
        aarraylist = null;
          goto _L15
_L14:
        i = -1;
          goto _L16
        aarraylist;
        flag = flag1;
        if (com.gtp.a.a.b.c.a())
        {
            aarraylist.printStackTrace();
            flag = flag1;
        }
          goto _L17
        boolean flag2;
        boolean flag3;
        aarraylist = new ArrayList();
        ArrayList arraylist = new ArrayList();
        b = ad.a(a, c, ((String) (obj2)), d, aarraylist, arraylist);
        obj2 = new ArrayList();
        if (c == 0)
        {
            if (com.gtp.go.weather.sharephoto.photo.ad.c(a))
            {
                ad.a(a, false);
                ad.b(a, true);
                ad.d(a);
                com.gtp.a.a.b.c.a("delete_photos", "clearAllPhotodata");
            }
            ad.a(a, arraylist, ((ArrayList) (obj)));
            ad.a(a, ((ArrayList) (obj2)), d, e, arraylist);
        }
        if (ad.e(a))
        {
            ad.a(a, aarraylist, aarraylist1);
            ad.a(a, ((ArrayList) (obj2)), d, e, aarraylist, null);
        } else
        {
            ad.a(a, ((ArrayList) (obj2)), d, e, aarraylist, aarraylist1);
        }
        if (obj2 == null || ((ArrayList) (obj2)).isEmpty()) goto _L19; else goto _L18
_L18:
        flag3 = false;
        ad.b(a).getContentResolver().applyBatch("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", ((ArrayList) (obj2)));
        flag2 = true;
_L21:
        com.gtp.a.a.b.c.a("photo", (new StringBuilder()).append("\u7C7B\u578B\u662F").append(d).append("\u7684\u56FE\u7247\u4FDD\u5B58\u53CA\u66F4\u65B0\u662F\u5426\u6210\u529F:").append(flag2).toString());
_L19:
        if (c == 0)
        {
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); aarraylist.add((g)((Iterator) (obj)).next())) { }
        }
        break; /* Loop/switch isn't completed */
        obj;
        flag2 = flag3;
        if (com.gtp.a.a.b.c.a())
        {
            ((RemoteException) (obj)).printStackTrace();
            flag2 = flag3;
        }
        continue; /* Loop/switch isn't completed */
        obj;
        flag2 = flag3;
        if (com.gtp.a.a.b.c.a())
        {
            ((OperationApplicationException) (obj)).printStackTrace();
            flag2 = flag3;
        }
        if (true) goto _L21; else goto _L20
_L20:
        if (ad.e(a) && com.gtp.go.weather.sharephoto.photo.ad.f(a))
        {
            ad.a(a, aarraylist);
        }
        int j = (int)((System.currentTimeMillis() - l) + (long)k);
        com.gtp.a.a.b.c.a("time_photo", (new StringBuilder()).append("\u672C\u6B21\u89E3\u6790\u4EE5\u53CA\u6570\u636E\u5E93\u4FDD\u5B58\u5171\u7528\u4E86 ").append(j).append(" \u6BEB\u79D2\uFF01").toString());
        return aarraylist;
        return null;
_L2:
        obj = null;
        aarraylist1 = null;
        if (true) goto _L23; else goto _L22
_L22:
    }

    protected void a(ArrayList arraylist)
    {
        super.onPostExecute(arraylist);
        if (ad.a(a) != null)
        {
            if (c == 0)
            {
                ad.a(a).a(d, e, b, arraylist, ad.e(a));
                ad.b(a, false);
            } else
            {
                ad.a(a).a(d, e, c, arraylist);
            }
        }
        ad.b(a, arraylist);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((ArrayList[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((ArrayList)obj);
    }
}
