// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import com.facebook.ads.AdSettings;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.facebook.ads.a:
//            ag, ae

public class p
{

    private static final Uri a = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");

    public static a a(ContentResolver contentresolver)
    {
        Cursor cursor = contentresolver.query(a, new String[] {
            "aid", "androidid", "limit_tracking"
        }, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        contentresolver = cursor;
        if (cursor.moveToFirst()) goto _L3; else goto _L2
_L2:
        contentresolver = cursor;
        a a1 = new a(null, null, false);
        contentresolver = a1;
        if (cursor != null)
        {
            cursor.close();
            contentresolver = a1;
        }
_L5:
        return contentresolver;
_L3:
        contentresolver = cursor;
        a1 = new a(cursor.getString(cursor.getColumnIndex("aid")), cursor.getString(cursor.getColumnIndex("androidid")), Boolean.valueOf(cursor.getString(cursor.getColumnIndex("limit_tracking"))).booleanValue());
        contentresolver = a1;
        if (cursor == null) goto _L5; else goto _L4
_L4:
        cursor.close();
        return a1;
        contentresolver;
        cursor = null;
_L9:
        contentresolver = cursor;
        a1 = new a(null, null, false);
        contentresolver = a1;
        if (cursor == null) goto _L5; else goto _L6
_L6:
        cursor.close();
        return a1;
        Exception exception;
        exception;
        contentresolver = null;
_L8:
        if (contentresolver != null)
        {
            contentresolver.close();
        }
        throw exception;
        exception;
        if (true) goto _L8; else goto _L7
_L7:
        contentresolver;
          goto _L9
    }

    public static transient Object a(Object obj, Method method, Object aobj[])
    {
        try
        {
            obj = method.invoke(obj, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        return obj;
    }

    public static Object a(JSONObject jsonobject, String s)
    {
        Object obj = jsonobject.opt(s);
        jsonobject = ((JSONObject) (obj));
        if (obj != null)
        {
            jsonobject = ((JSONObject) (obj));
            if (obj instanceof String)
            {
                jsonobject = ((JSONObject) ((new JSONTokener((String)obj)).nextValue()));
            }
        }
        if (jsonobject != null && !(jsonobject instanceof JSONObject) && !(jsonobject instanceof JSONArray))
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return jsonobject;
        }
    }

    public static String a(InputStream inputstream)
    {
        Object obj = null;
        inputstream = new BufferedInputStream(inputstream);
        InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
        char ac[];
        obj = new StringBuilder();
        ac = new char[2048];
_L3:
        int i = inputstreamreader.read(ac);
        if (i == -1) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj)).append(ac, 0, i);
          goto _L3
        Exception exception;
        exception;
        obj = inputstream;
        inputstream = exception;
_L5:
        a(((Closeable) (obj)));
        a(((Closeable) (inputstreamreader)));
        throw inputstream;
_L2:
        obj = ((StringBuilder) (obj)).toString();
        a(((Closeable) (inputstream)));
        a(((Closeable) (inputstreamreader)));
        return ((String) (obj));
        inputstream;
        inputstreamreader = null;
        continue; /* Loop/switch isn't completed */
        exception;
        inputstreamreader = null;
        obj = inputstream;
        inputstream = exception;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String a(Map map)
    {
        JSONObject jsonobject = new JSONObject();
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            try
            {
                jsonobject.put((String)entry.getKey(), entry.getValue());
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
            }
        }

        return jsonobject.toString();
    }

    public static transient Method a(Class class1, String s, Class aclass[])
    {
        try
        {
            class1 = class1.getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    public static transient Method a(String s, String s1, Class aclass[])
    {
        try
        {
            s = a(Class.forName(s), s1, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static void a(Context context, String s)
    {
        if (AdSettings.isTestMode(context))
        {
            Log.d("FBAudienceNetworkLog", (new StringBuilder()).append(s).append(" (displayed for test ads only)").toString());
        }
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            return;
        }
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            return;
        }
    }

    public static boolean a()
    {
        String s = AdSettings.getUrlPrefix();
        return !ag.a(s) && s.endsWith(".sb");
    }

    public static boolean a(Context context, View view, int i, int j, int k)
    {
        if (!((PowerManager)context.getSystemService("power")).isScreenOn())
        {
            return false;
        }
        if (view == null || view.getParent() == null || view.getVisibility() != 0)
        {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 11 && view.getAlpha() < 0.9F)
        {
            return false;
        }
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        context = context.getResources().getDisplayMetrics();
        if (ai[0] < 0 || ((DisplayMetrics) (context)).widthPixels - ai[0] < i)
        {
            return false;
        }
        i = (int)(((double)j * (100D - (double)k)) / 100D);
        if (ai[1] < 0 && Math.abs(ai[1]) > i)
        {
            return false;
        }
        return (ai[1] + j) - ((DisplayMetrics) (context)).heightPixels <= i;
    }

    public static HttpClient b()
    {
        if (!a())
        {
            break MISSING_BLOCK_LABEL_125;
        }
        Object obj;
        obj = KeyStore.getInstance(KeyStore.getDefaultType());
        ((KeyStore) (obj)).load(null, null);
        obj = new ae(((KeyStore) (obj)));
        ((SSLSocketFactory) (obj)).setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basichttpparams, "UTF-8");
        SchemeRegistry schemeregistry = new SchemeRegistry();
        schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeregistry.register(new Scheme("https", ((org.apache.http.conn.scheme.SocketFactory) (obj)), 443));
        obj = new DefaultHttpClient(new ThreadSafeClientConnManager(basichttpparams, schemeregistry), basichttpparams);
        return ((HttpClient) (obj));
        Exception exception;
        exception;
        return new DefaultHttpClient();
    }


    private class a
    {

        protected String a;
        protected String b;
        protected boolean c;

        public a(String s, String s1, boolean flag)
        {
            a = s;
            b = s1;
            c = flag;
        }
    }

}
