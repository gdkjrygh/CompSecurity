// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.text.format.DateUtils;
import io.wecloud.message.c.a;
import io.wecloud.message.e.c;
import io.wecloud.message.h.b;
import io.wecloud.message.h.f;
import io.wecloud.message.h.g;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class i
{

    public static HttpEntity a(Context context)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("handle", String.valueOf(0)));
        arraylist.add(new BasicNameValuePair("shandle", String.valueOf(1)));
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("phead", b(context));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        context = io.wecloud.message.h.b.a(jsonobject.toString(), "www.wecloud.io");
        if (!TextUtils.isEmpty(context) && !TextUtils.isEmpty(jsonobject.toString()) && jsonobject.toString().equals(context))
        {
            arraylist.add(new BasicNameValuePair("pversion", "2"));
        } else
        {
            arraylist.add(new BasicNameValuePair("pversion", String.valueOf(3)));
        }
        c.b("RequestProtocol", (new StringBuilder("encry data = ")).append(context).toString());
        arraylist.add(new BasicNameValuePair("data", context));
        try
        {
            context = new UrlEncodedFormEntity(arraylist, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return context;
    }

    public static JSONObject b(Context context)
    {
        JSONObject jsonobject = new JSONObject();
        if (context == null) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray;
        Iterator iterator;
        jsonobject.put("pversion", 3);
        jsonobject.put("sdk", 103);
        jsonobject.put("aid", f.a(context));
        jsonobject.put("goid", io.wecloud.message.c.a.d(context));
        jsonobject.put("local", f.d(context));
        Object obj = Locale.getDefault();
        jsonobject.put("lang", String.format("%s_%s", new Object[] {
            ((Locale) (obj)).getLanguage().toLowerCase(), ((Locale) (obj)).getCountry().toLowerCase()
        }));
        jsonobject.put("net", g.b(context));
        obj = new ArrayList();
        ((ArrayList) (obj)).add(context.getPackageName());
        jsonarray = new JSONArray();
        iterator = ((ArrayList) (obj)).iterator();
_L21:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        jsonobject.put("appkeyarray", jsonarray);
        jsonobject.put("tz", TimeZone.getDefault().getRawOffset() / 0x36ee80);
        if (!context.getPackageName().equals(io.wecloud.message.h.a.b(context))) goto _L2; else goto _L5
_L5:
        Object obj1;
        Object obj2;
        jsonobject.put("imei", f.c(context));
        jsonobject.put("imsi", f.b(context));
        jsonobject.put("sys", android.os.Build.VERSION.SDK_INT);
        jsonobject.put("model", Build.MODEL);
        obj1 = new StringBuffer();
        obj2 = new ArrayList();
        ((ArrayList) (obj2)).addAll(f.e(context));
        if (obj2 == null) goto _L7; else goto _L6
_L6:
        if (((ArrayList) (obj2)).isEmpty()) goto _L7; else goto _L8
_L8:
        obj2 = ((ArrayList) (obj2)).iterator();
_L23:
        if (((Iterator) (obj2)).hasNext()) goto _L9; else goto _L7
_L7:
        if (((StringBuffer) (obj1)).length() <= 0) goto _L11; else goto _L10
_L10:
        obj1 = ((StringBuffer) (obj1)).toString();
_L28:
        jsonobject.put("gmail", obj1);
        obj2 = io.wecloud.message.c.a.w(context);
        obj1 = obj2;
        if (TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            obj1 = "0.0,0.0";
        }
        long l;
        jsonobject.put("latitude", obj1);
        jsonobject.put("ram", (new StringBuilder()).append(f.a()).toString());
        jsonobject.put("rom", f.g(context));
        jsonobject.put("cpu", Runtime.getRuntime().availableProcessors());
        jsonobject.put("screensize", f.f(context));
        obj1 = new StringBuffer();
        l = io.wecloud.message.c.a.q(context);
        if (!io.wecloud.message.c.a.r(context)) goto _L13; else goto _L12
_L12:
        if (DateUtils.isToday(l))
        {
            break MISSING_BLOCK_LABEL_937;
        }
        obj2 = io.wecloud.message.h.a.c(context).iterator();
_L24:
        if (((Iterator) (obj2)).hasNext()) goto _L15; else goto _L14
_L14:
        obj2 = io.wecloud.message.c.a.t(context);
        if (!TextUtils.isEmpty(((CharSequence) (obj2)))) goto _L17; else goto _L16
_L16:
        io.wecloud.message.c.a.c(context, ((StringBuffer) (obj1)).toString());
        io.wecloud.message.c.a.d(context, true);
        context = ((Context) (obj1));
_L25:
        if (context.length() <= 0) goto _L19; else goto _L18
_L18:
        context = context.toString();
_L27:
        jsonobject.put("installapps", context);
_L2:
        return jsonobject;
_L4:
        JSONObject jsonobject1;
        String s3;
        int j;
        try
        {
            obj1 = (String)iterator.next();
            obj2 = io.wecloud.message.h.a.e(context, ((String) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return jsonobject;
        }
        if (obj2 == null) goto _L21; else goto _L20
_L20:
        s3 = io.wecloud.message.h.a.f(((Context) (obj2)), "APPKEY");
        if (TextUtils.isEmpty(s3)) goto _L21; else goto _L22
_L22:
        jsonobject1 = new JSONObject();
        jsonobject1.put("appkey", s3);
        if (context.getPackageName().equals(obj1))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        jsonobject1.put("active", j);
        jsonobject1.put("pkg", obj1);
        if (io.wecloud.message.h.a.b(context, ((String) (obj1))))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        jsonobject1.put("ischannel", j);
        jsonobject1.put("cversion", io.wecloud.message.h.a.e(((Context) (obj2))));
        jsonobject1.put("cvname", io.wecloud.message.h.a.f(((Context) (obj2))));
        obj2 = io.wecloud.message.h.a.d(context, ((String) (obj1)));
        obj1 = obj2;
        if (TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            obj1 = "0";
        }
        jsonobject1.put("channel", obj1);
        jsonarray.put(jsonobject1);
          goto _L21
_L9:
        String s = (String)((Iterator) (obj2)).next();
        if (!TextUtils.isEmpty(s))
        {
            if (((StringBuffer) (obj1)).length() > 0)
            {
                ((StringBuffer) (obj1)).append(",");
            }
            ((StringBuffer) (obj1)).append(s);
        }
          goto _L23
_L15:
        String s1 = (String)((Iterator) (obj2)).next();
        if (!TextUtils.isEmpty(s1))
        {
            if (((StringBuffer) (obj1)).length() > 0)
            {
                ((StringBuffer) (obj1)).append(",");
            }
            ((StringBuffer) (obj1)).append(s1);
        }
          goto _L24
_L17:
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            break MISSING_BLOCK_LABEL_937;
        }
        if (!((String) (obj2)).trim().equals(((StringBuffer) (obj1)).toString().trim()))
        {
            break MISSING_BLOCK_LABEL_825;
        }
        obj1 = new StringBuffer();
        io.wecloud.message.c.a.d(context, System.currentTimeMillis());
        io.wecloud.message.c.a.d(context, false);
        context = ((Context) (obj1));
          goto _L25
        io.wecloud.message.c.a.c(context, ((StringBuffer) (obj1)).toString());
        io.wecloud.message.c.a.d(context, true);
        context = ((Context) (obj1));
          goto _L25
_L13:
        obj2 = io.wecloud.message.h.a.c(context).iterator();
_L26:
        if (!((Iterator) (obj2)).hasNext())
        {
            io.wecloud.message.c.a.c(context, ((StringBuffer) (obj1)).toString());
            io.wecloud.message.c.a.d(context, true);
            break MISSING_BLOCK_LABEL_937;
        }
        String s2 = (String)((Iterator) (obj2)).next();
        if (!TextUtils.isEmpty(s2))
        {
            if (((StringBuffer) (obj1)).length() > 0)
            {
                ((StringBuffer) (obj1)).append(",");
            }
            ((StringBuffer) (obj1)).append(s2);
        }
        if (true) goto _L26; else goto _L19
_L19:
        context = "";
          goto _L27
        context;
        return jsonobject;
_L11:
        obj1 = "";
          goto _L28
        context = ((Context) (obj1));
          goto _L25
    }
}
