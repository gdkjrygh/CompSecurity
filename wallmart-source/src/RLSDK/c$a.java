// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.util.Locale;

// Referenced classes of package RLSDK:
//            c, o, p, a

private static final class <init> extends AsyncTask
{

    private static transient String a()
    {
        Object obj = new StringBuilder();
        a a1;
        try
        {
            ((StringBuilder) (obj)).append("http://api.redlaser.com/getstatus");
            ((StringBuilder) (obj)).append((new StringBuilder("?sdkver=")).append(o.a).toString());
            ((StringBuilder) (obj)).append((new StringBuilder("&udid=")).append(p.a()).toString());
            ((StringBuilder) (obj)).append((new StringBuilder("&key=")).append(URLEncoder.encode(c.e, "UTF-8")).toString());
            ((StringBuilder) (obj)).append("&platform=android");
            ((StringBuilder) (obj)).append((new StringBuilder("&os=")).append(URLEncoder.encode(android.os.d.VERSION.RELEASE, "UTF-8")).toString());
            ((StringBuilder) (obj)).append((new StringBuilder("&dv=")).append(URLEncoder.encode(Build.MODEL, "UTF-8")).toString());
            ((StringBuilder) (obj)).append((new StringBuilder("&locale=")).append(URLEncoder.encode(Locale.getDefault().toString(), "UTF-8")).toString());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            Log.e("StatusManager.LaunchPingTask", "Logic error sanitizing launch ping URL parameters.", unsupportedencodingexception);
            return "";
        }
        try
        {
            if (c.d != null)
            {
                ((StringBuilder) (obj)).append((new StringBuilder("&appver=")).append(URLEncoder.encode(c.d, "UTF-8")).toString());
            }
        }
        catch (Exception exception) { }
        obj = ((StringBuilder) (obj)).toString();
        a1 = new a(c.b());
        try
        {
            obj = a1.a(((String) (obj)));
        }
        catch (MalformedURLException malformedurlexception)
        {
            Log.e("StatusManager.LaunchPingTask", "Logic error. Bad launch ping URL.", malformedurlexception);
            return "";
        }
        catch (IOException ioexception)
        {
            Log.e("StatusManager.LaunchPingTask", "Logic error. Bad URL cache.", ioexception);
            return "";
        }
        return RLSDK.a.a(((java.io.InputStream) (obj)));
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
label0:
        {
            String s = (String)obj;
            if (s != null)
            {
                obj = c.b.edit();
                String as[] = s.split(",");
                int j = as.length;
                int i = 0;
                while (i < j) 
                {
                    String as1[] = as[i].split("=");
                    if (as1.length == 2)
                    {
                        String s1 = as1[0];
                        String s2 = as1[1];
                        if (s1.equalsIgnoreCase("disableCapture"))
                        {
                            ((android.content.edPreferences.Editor) (obj)).putString("disableCapture", s2);
                        } else
                        if (s1.equalsIgnoreCase("disableCaptureMessage"))
                        {
                            ((android.content.edPreferences.Editor) (obj)).putString("disableCaptureMessage", s2);
                        }
                    }
                    i++;
                }
                ((android.content.edPreferences.Editor) (obj)).commit();
            }
            if (c.a.compareTo(e) != 0)
            {
                if (!c.b.getString("disableCapture", "NO").equalsIgnoreCase("YES"))
                {
                    break label0;
                }
                c.a = c;
            }
            return;
        }
        if (c.e == "psdk")
        {
            c.a = a;
            return;
        } else
        {
            c.a = b;
            return;
        }
    }

    private Object()
    {
    }

    Object(byte byte0)
    {
        this();
    }
}
