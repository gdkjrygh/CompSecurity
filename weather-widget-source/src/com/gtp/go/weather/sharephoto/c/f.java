// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.c;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.AsyncTask;
import android.os.RemoteException;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gtp.go.weather.sharephoto.b.c;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.e.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.gtp.go.weather.sharephoto.c:
//            d

class f extends AsyncTask
{

    final com.gtp.go.weather.sharephoto.c.d a;
    private ConcurrentHashMap b;
    private ConcurrentHashMap c;
    private ConcurrentHashMap d;

    public f(com.gtp.go.weather.sharephoto.c.d d1, ConcurrentHashMap concurrenthashmap, ConcurrentHashMap concurrenthashmap1, ConcurrentHashMap concurrenthashmap2)
    {
        a = d1;
        super();
        b = concurrenthashmap;
        c = concurrenthashmap1;
        d = concurrenthashmap2;
    }

    private void a(ArrayList arraylist, com.jiubang.goweather.b.c c1, JSONObject jsonobject, ConcurrentHashMap concurrenthashmap)
    {
        Iterator iterator = concurrenthashmap.keySet().iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        c c2 = (c)concurrenthashmap.get((Long)iterator.next());
        ArrayList arraylist1 = new ArrayList();
        arraylist1.add(new BasicNameValuePair("phead", jsonobject.toString()));
        arraylist1.add(new BasicNameValuePair("userId", c2.a()));
        arraylist1.add(new BasicNameValuePair("imageId", (new StringBuilder()).append(c2.b()).append("").toString()));
        e e1;
        Object obj;
        JSONException jsonexception;
        com.jiubang.goweather.b.f f1;
        int i;
        int j;
        if (c2.d() == 2 || c2.d() == 1)
        {
            arraylist1.add(new BasicNameValuePair("isFavour", (new StringBuilder()).append(c2.c()).append("").toString()));
            e1 = new e("http://gows.goforandroid.com/goweatherexSns/image/imageFavour", "POST");
        } else
        if (c2.d() == 3)
        {
            arraylist1.add(new BasicNameValuePair("illegalType", (new StringBuilder()).append(c2.c()).append("").toString()));
            e1 = new e("http://gows.goforandroid.com/goweatherexSns/image/accuse", "POST");
        } else
        {
            e1 = null;
        }
        if (e1 != null) goto _L3; else goto _L2
_L2:
        return;
_L3:
        e1.a(arraylist1);
        i = 0;
_L14:
        if (i >= 3) goto _L5; else goto _L4
_L4:
        f1 = new com.jiubang.goweather.b.f();
        obj = null;
        if (c2.d() == 2 || c2.d() == 1)
        {
            arraylist1.add(new BasicNameValuePair("isFavour", (new StringBuilder()).append(c2.c()).append("").toString()));
            obj = c1.a("http://gows.goforandroid.com/goweatherexSns/image/imageFavour", e1, f1);
        } else
        if (c2.d() == 3)
        {
            arraylist1.add(new BasicNameValuePair("illegalType", (new StringBuilder()).append(c2.c()).append("").toString()));
            obj = c1.a("http://gows.goforandroid.com/goweatherexSns/image/accuse", e1, f1);
        }
        if (obj == null) goto _L2; else goto _L6
_L6:
        if (obj == null) goto _L8; else goto _L7
_L7:
        obj = (new JSONObject(com.jiubang.goweather.e.a.a(((java.io.InputStream) (obj)), "ISO-8859-1"))).optJSONObject("head");
        if (obj == null) goto _L10; else goto _L9
_L9:
        j = ((JSONObject) (obj)).optInt("result", -1);
_L15:
        if (j != 1) goto _L8; else goto _L11
_L11:
        com.gtp.a.a.b.c.a("UploadLikeAndBgHandler", (new StringBuilder()).append("upload resultString == 1, photoId = ").append(c2.b()).toString());
        c2.a(true);
        if (c2.d() != 1) goto _L13; else goto _L12
_L12:
        arraylist.add(ContentProviderOperation.newDelete(WeatherContentProvider.y).withSelection("photo_id=? and data_type=?", new String[] {
            String.valueOf(c2.b()), String.valueOf(1)
        }).build());
          goto _L5
        obj;
        ((IOException) (obj)).printStackTrace();
_L8:
        i++;
          goto _L14
_L10:
        j = -1;
          goto _L15
_L13:
        if (c2.d() != 2) goto _L17; else goto _L16
_L16:
        arraylist.add(ContentProviderOperation.newDelete(WeatherContentProvider.y).withSelection("photo_id=? and data_type=?", new String[] {
            String.valueOf(c2.b()), String.valueOf(2)
        }).build());
          goto _L5
        jsonexception;
        jsonexception.printStackTrace();
          goto _L8
_L17:
        if (c2.d() != 3) goto _L5; else goto _L18
_L18:
        arraylist.add(ContentProviderOperation.newDelete(WeatherContentProvider.y).withSelection("photo_id=? and data_type=?", new String[] {
            String.valueOf(c2.b()), String.valueOf(3)
        }).build());
          goto _L5
    }

    protected transient ArrayList a(Void avoid[])
    {
        avoid = com.jiubang.goweather.b.d.a();
        JSONObject jsonobject = com.gtp.go.weather.sharephoto.a.f.a(com.gtp.go.weather.sharephoto.c.d.a(a));
        ArrayList arraylist = new ArrayList();
        a(arraylist, ((com.jiubang.goweather.b.c) (avoid)), jsonobject, c);
        a(arraylist, ((com.jiubang.goweather.b.c) (avoid)), jsonobject, b);
        a(arraylist, ((com.jiubang.goweather.b.c) (avoid)), jsonobject, d);
        avoid.a();
        return arraylist;
    }

    protected void a(ArrayList arraylist)
    {
        super.onPostExecute(arraylist);
        if (arraylist == null || arraylist.isEmpty())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        com.gtp.go.weather.sharephoto.c.d.a(a).getContentResolver().applyBatch("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", arraylist);
_L2:
        if (b != null)
        {
            arraylist = b.keySet().iterator();
            do
            {
                if (!arraylist.hasNext())
                {
                    break;
                }
                Long long1 = (Long)arraylist.next();
                c c1 = (c)b.get(long1);
                if (c1 != null && c1.e())
                {
                    com.gtp.go.weather.sharephoto.c.d.c(a).remove(long1);
                }
            } while (true);
        }
        break; /* Loop/switch isn't completed */
        arraylist;
        if (com.gtp.a.a.b.c.a())
        {
            arraylist.printStackTrace();
        }
        continue; /* Loop/switch isn't completed */
        arraylist;
        if (com.gtp.a.a.b.c.a())
        {
            arraylist.printStackTrace();
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (c != null)
        {
            arraylist = c.keySet().iterator();
            do
            {
                if (!arraylist.hasNext())
                {
                    break;
                }
                Long long2 = (Long)arraylist.next();
                c c2 = (c)c.get(long2);
                c c4 = (c)com.gtp.go.weather.sharephoto.c.d.d(a).get(long2);
                if (c2 != null && c4 != null && c2.e() && c2.c() == c4.c())
                {
                    com.gtp.go.weather.sharephoto.c.d.d(a).remove(long2);
                }
            } while (true);
        }
        if (d != null)
        {
            arraylist = d.keySet().iterator();
            do
            {
                if (!arraylist.hasNext())
                {
                    break;
                }
                Long long3 = (Long)arraylist.next();
                c c3 = (c)d.get(long3);
                c c5 = (c)com.gtp.go.weather.sharephoto.c.d.e(a).get(long3);
                if (c3 != null && c5 != null && c3.e() && c3.c() == c5.c())
                {
                    com.gtp.go.weather.sharephoto.c.d.e(a).remove(long3);
                }
            } while (true);
        }
        if (com.gtp.go.weather.sharephoto.c.d.c(a).size() == 0 && com.gtp.go.weather.sharephoto.c.d.d(a).size() == 0 && com.gtp.go.weather.sharephoto.c.d.e(a).size() == 0)
        {
            com.gtp.go.weather.sharephoto.c.d.a(a).unregisterReceiver(com.gtp.go.weather.sharephoto.c.d.f(a));
            com.gtp.go.weather.sharephoto.c.d.a(a, false);
            return;
        } else
        {
            com.gtp.go.weather.sharephoto.c.d.a(a, System.currentTimeMillis() + 0x493e0L);
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((ArrayList)obj);
    }
}
