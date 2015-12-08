// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.a.ag;
import com.facebook.ads.a.h;
import com.facebook.ads.a.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.ads.a.a:
//            a

public class c extends a
{

    private static final String a = com/facebook/ads/a/a/c.getSimpleName();
    private final Context b;
    private final Uri c;

    public c(Context context, Uri uri)
    {
        b = context;
        c = uri;
    }

    private Intent a(u u1)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(0x10000000);
        if (!ag.a(u1.a()) && !ag.a(u1.b()))
        {
            intent.setComponent(new ComponentName(u1.a(), u1.b()));
        }
        if (!ag.a(u1.c()))
        {
            intent.setData(Uri.parse(u1.c()));
        }
        return intent;
    }

    private Intent b(u u1)
    {
        Object obj;
        Object obj1;
label0:
        {
            if (ag.a(u1.a()))
            {
                return null;
            }
            if (!h.a(b, u1.a()))
            {
                return null;
            }
            obj = u1.c();
            if (!ag.a(((String) (obj))) && (((String) (obj)).startsWith("tel:") || ((String) (obj)).startsWith("telprompt:")))
            {
                return new Intent("android.intent.action.CALL", Uri.parse(((String) (obj))));
            }
            obj1 = b.getPackageManager();
            if (ag.a(u1.b()) && ag.a(((String) (obj))))
            {
                return ((PackageManager) (obj1)).getLaunchIntentForPackage(u1.a());
            }
            obj = a(u1);
            obj1 = ((PackageManager) (obj1)).queryIntentActivities(((Intent) (obj)), 0x10000);
            if (((Intent) (obj)).getComponent() != null)
            {
                break label0;
            }
            Iterator iterator = ((List) (obj1)).iterator();
            ResolveInfo resolveinfo;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                resolveinfo = (ResolveInfo)iterator.next();
            } while (!resolveinfo.activityInfo.packageName.equals(u1.a()));
            ((Intent) (obj)).setComponent(new ComponentName(resolveinfo.activityInfo.packageName, resolveinfo.activityInfo.name));
        }
        if (((List) (obj1)).isEmpty() || ((Intent) (obj)).getComponent() == null)
        {
            return null;
        } else
        {
            return ((Intent) (obj));
        }
    }

    private List e()
    {
        Object obj = c.getQueryParameter("appsite_data");
        if (!ag.a(((String) (obj))) && !"[]".equals(obj)) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist = new ArrayList();
        JSONArray jsonarray;
        int i;
        try
        {
            jsonarray = (new JSONObject(((String) (obj)))).optJSONArray("android");
        }
        catch (JSONException jsonexception)
        {
            Log.w(a, "Error parsing appsite_data", jsonexception);
            return arraylist;
        }
        obj = arraylist;
        if (jsonarray == null) goto _L4; else goto _L3
_L3:
        i = 0;
_L6:
        obj = arraylist;
        if (i >= jsonarray.length()) goto _L4; else goto _L5
_L5:
        obj = u.a(jsonarray.optJSONObject(i));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        arraylist.add(obj);
        i++;
          goto _L6
    }

    public com.facebook.ads.a.b.a a()
    {
        return com.facebook.ads.a.b.a.a;
    }

    public void a(Map map)
    {
        a(b, c);
        map = c();
        if (map != null)
        {
            for (map = map.iterator(); map.hasNext();)
            {
                Intent intent = (Intent)map.next();
                try
                {
                    b.startActivity(intent);
                    return;
                }
                catch (Exception exception)
                {
                    Log.d(a, "Failed to open app intent, falling back", exception);
                }
            }

        }
        d();
    }

    protected Uri b()
    {
        String s = c.getQueryParameter("store_url");
        if (!ag.a(s))
        {
            return Uri.parse(s);
        } else
        {
            return Uri.parse(String.format("market://details?id=%s", new Object[] {
                c.getQueryParameter("store_id")
            }));
        }
    }

    protected List c()
    {
        Object obj = e();
        ArrayList arraylist = new ArrayList();
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Intent intent = b((u)((Iterator) (obj)).next());
                if (intent != null)
                {
                    arraylist.add(intent);
                }
            } while (true);
        }
        return arraylist;
    }

    public void d()
    {
        Intent intent;
        intent = new Intent("android.intent.action.VIEW", b());
        intent.addFlags(0x10000000);
        b.startActivity(intent);
_L1:
        return;
        Exception exception;
        exception;
        Log.d(a, (new StringBuilder()).append("Failed to open market url: ").append(c.toString()).toString(), exception);
        String s = c.getQueryParameter("store_url_web_fallback");
        if (s != null && s.length() > 0)
        {
            Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse(s));
            intent1.addFlags(0x10000000);
            try
            {
                b.startActivity(intent1);
                return;
            }
            catch (Exception exception1)
            {
                Log.d(a, (new StringBuilder()).append("Failed to open fallback url: ").append(s).toString(), exception1);
            }
            return;
        }
          goto _L1
    }

}
