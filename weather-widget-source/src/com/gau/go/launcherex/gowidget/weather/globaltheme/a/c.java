// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.a;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a.a.b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.a:
//            a, b

class c extends AsyncTask
{

    final a a;

    private c(a a1)
    {
        a = a1;
        super();
    }

    c(a a1, com.gau.go.launcherex.gowidget.weather.globaltheme.a.b b1)
    {
        this(a1);
    }

    private void a(int i, android.content.SharedPreferences.Editor editor)
    {
        b b1 = new b(i);
        editor.putString((new StringBuilder()).append("key_adid_location_").append(b1.b()).toString(), b1.a());
    }

    protected transient Integer a(Object aobj[])
    {
        int i;
        int j;
        j = 0;
        long l1 = com.gau.go.launcherex.gowidget.weather.globaltheme.a.a.a(a).getLong("key_adid_request_time", 0L);
        long l2 = System.currentTimeMillis();
        i = com.gau.go.launcherex.gowidget.weather.globaltheme.a.a.a(a).getInt("key_adid_request_frequency", 0);
        l1 = l2 - l1;
        if (l1 > 0L && l1 <= (long)(60000 * i))
        {
            com.gtp.a.a.b.c.a("adid", (new StringBuilder()).append("\u672A\u8FBE\u5230\u518D\u6B21\u83B7\u53D6\u5E7F\u544AID\u6570\u636E\u7684\u65F6\u95F4\uFF0C\u8FD8\u5DEE").append((long)(i * 60000) - l1).append("\u6BEB\u79D2\u66F4\u65B0").toString());
            return Integer.valueOf(0);
        }
        aobj = "";
        Object obj = com.gau.go.launcherex.gowidget.weather.globaltheme.a.a.a(a, b(a));
        if (obj != null)
        {
            aobj = ((JSONObject) (obj)).toString();
        }
        com.gtp.a.a.b.c.a("adid", (new StringBuilder()).append("postData --> ").append(((String) (aobj))).toString());
        if (TextUtils.isEmpty(((CharSequence) (aobj))))
        {
            return Integer.valueOf(0);
        }
        obj = b(a, b(a));
        com.gtp.a.a.b.c.a("adid", (new StringBuilder()).append("url --> ").append(((String) (obj))).toString());
        aobj = com.gau.go.launcherex.gowidget.weather.globaltheme.a.b.b.a(b(a), ((String) (obj)), 0, 1, ((String) (aobj)));
        com.gtp.a.a.b.c.a("adid", (new StringBuilder()).append("result --> ").append(((String) (aobj))).toString());
        if (TextUtils.isEmpty(((CharSequence) (aobj))))
        {
            return Integer.valueOf(0);
        }
        i = j;
        JSONObject jsonobject = new JSONObject(((String) (aobj)));
        i = j;
        j = jsonobject.optJSONObject("result").optInt("status", 0);
        if (j != 1) goto _L2; else goto _L1
_L1:
        i = j;
        JSONArray jsonarray = new JSONArray(jsonobject.getString("ads").toString());
        if (jsonarray == null) goto _L4; else goto _L3
_L3:
        i = j;
        int k = jsonarray.length();
_L25:
        i = j;
        android.content.SharedPreferences.Editor editor = com.gau.go.launcherex.gowidget.weather.globaltheme.a.a.a(a).edit();
        if (k <= 0) goto _L6; else goto _L5
_L5:
        i = j;
        ArrayList arraylist = new ArrayList();
        int l = 0;
_L17:
        if (l >= k) goto _L8; else goto _L7
_L7:
        i = j;
        b b1 = new b();
        i = j;
        JSONObject jsonobject1 = jsonarray.getJSONObject(l);
        i = j;
        b1.a(jsonobject1.getInt("location"));
        i = j;
        JSONArray jsonarray1 = jsonobject1.getJSONArray("reqSDKBean");
        if (jsonarray1 == null) goto _L10; else goto _L9
_L9:
        i = j;
        Object obj1 = b1.c();
        i = j;
        aobj = b1.d();
        int j1 = 0;
_L26:
        i = j;
        if (j1 >= jsonarray1.length())
        {
            break MISSING_BLOCK_LABEL_669;
        }
        i = j;
        JSONObject jsonobject2 = jsonarray1.getJSONObject(j1);
        Object obj2;
        Object obj3;
        obj2 = ((Object) (aobj));
        obj3 = obj1;
        if (jsonobject2 == null)
        {
            break MISSING_BLOCK_LABEL_1118;
        }
        i = j;
        obj2 = new StringBuilder();
        i = j;
        if (!TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L12; else goto _L11
_L11:
        obj1 = "";
_L15:
        i = j;
        obj3 = ((StringBuilder) (obj2)).append(((String) (obj1))).append(jsonobject2.getString("reqSDK").toLowerCase()).toString();
        i = j;
        obj1 = new StringBuilder();
        i = j;
        if (!TextUtils.isEmpty(((CharSequence) (aobj)))) goto _L14; else goto _L13
_L13:
        aobj = "";
_L16:
        i = j;
        obj2 = ((StringBuilder) (obj1)).append(((String) (aobj))).append(jsonobject2.getString("reqId").toLowerCase()).toString();
        break MISSING_BLOCK_LABEL_1118;
_L12:
        i = j;
        obj1 = (new StringBuilder()).append(((String) (obj1))).append("|").toString();
          goto _L15
_L14:
        i = j;
        aobj = (new StringBuilder()).append(((String) (aobj))).append("|").toString();
          goto _L16
        i = j;
        b1.a(((String) (obj1)));
        i = j;
        b1.b(((String) (aobj)));
_L10:
        i = j;
        if (jsonobject1.getBoolean("isOpen"))
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        i = j;
        b1.b(j1);
        i = j;
        b1.c(jsonobject1.getInt("reqNum"));
        i = j;
        b1.d(jsonobject1.optInt("reqSelf", 0));
        i = j;
        arraylist.add(b1);
        i = j;
        editor.putString((new StringBuilder()).append("key_adid_location_").append(b1.b()).toString(), b1.a());
_L19:
        l++;
          goto _L17
        aobj;
        i = j;
        if (!com.gtp.a.a.b.c.a()) goto _L19; else goto _L18
_L18:
        i = j;
        ((Exception) (aobj)).printStackTrace();
          goto _L19
_L2:
        return Integer.valueOf(j);
_L8:
        i = j;
        if (arraylist.size() != 1) goto _L21; else goto _L20
_L20:
        i = j;
        aobj = (b)arraylist.get(0);
        i = j;
        if (((b) (aobj)).b() != 1) goto _L23; else goto _L22
_L22:
        i = j;
        a(2, editor);
        break MISSING_BLOCK_LABEL_1132;
_L24:
        int i1;
        for (; i == 0; i = 0)
        {
            break MISSING_BLOCK_LABEL_944;
        }

        i = j;
        a(2, editor);
        i = j;
        a(1, editor);
        i = j;
        i1 = jsonobject.optInt("reqFrequency", 480);
        k = i1;
        if (i1 == -1)
        {
            k = 480;
        }
        i = j;
        com.gtp.a.a.b.c.a("adid", (new StringBuilder()).append("\u5E7F\u544A\u66F4\u65B0\u9891\u7387\uFF1AreqFrequency = ").append(k).toString());
        i = j;
        editor.putInt("key_adid_request_frequency", k);
        i = j;
        editor.putLong("key_adid_request_time", System.currentTimeMillis());
        i = j;
        try
        {
            editor.commit();
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            j = i;
            if (com.gtp.a.a.b.c.a())
            {
                ((JSONException) (aobj)).printStackTrace();
                j = i;
            }
        }
          goto _L2
_L23:
        i = j;
        if (((b) (aobj)).b() != 2)
        {
            break MISSING_BLOCK_LABEL_1132;
        }
        i = j;
        a(1, editor);
        break MISSING_BLOCK_LABEL_1132;
_L21:
        i = j;
        k = arraylist.size();
        if (k == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L24
_L6:
        i = 1;
          goto _L24
_L4:
        k = 0;
          goto _L25
        j1++;
        aobj = ((Object []) (obj2));
        obj1 = obj3;
          goto _L26
    }

    protected void a(Integer integer)
    {
        super.onPostExecute(integer);
        if (integer.intValue() != 1);
        com.gau.go.launcherex.gowidget.weather.globaltheme.a.a.a(a, false);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Integer)obj);
    }
}
