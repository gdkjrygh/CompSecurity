// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.a.a.a;
import com.facebook.ads.a.a.b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.ads.a:
//            e, g, h, p, 
//            ad

public class aa
    implements e
{

    private static final String a = com/facebook/ads/a/aa.getSimpleName();
    private final Uri b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final com.facebook.ads.NativeAd.Image g;
    private final com.facebook.ads.NativeAd.Image h;
    private final com.facebook.ads.NativeAd.Rating i;
    private final String j;
    private final String k;
    private final g l;
    private final Collection m;
    private final boolean n;
    private final com.facebook.ads.NativeAd.Image o;
    private final String p;
    private boolean q;
    private boolean r;

    private aa(Uri uri, String s, String s1, String s2, String s3, com.facebook.ads.NativeAd.Image image, com.facebook.ads.NativeAd.Image image1, 
            com.facebook.ads.NativeAd.Rating rating, String s4, String s5, g g1, Collection collection, boolean flag, com.facebook.ads.NativeAd.Image image2, 
            String s6)
    {
        b = uri;
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = image;
        h = image1;
        i = rating;
        j = s4;
        k = s5;
        l = g1;
        m = collection;
        n = flag;
        o = image2;
        p = s6;
    }

    public static aa a(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            jsonobject = null;
        } else
        {
            Uri uri = Uri.parse(jsonobject.optString("fbad_command"));
            String s = jsonobject.optString("title");
            String s1 = jsonobject.optString("body");
            String s2 = jsonobject.optString("call_to_action");
            String s3 = jsonobject.optString("social_context");
            com.facebook.ads.NativeAd.Image image = com.facebook.ads.NativeAd.Image.fromJSONObject(jsonobject.optJSONObject("icon"));
            com.facebook.ads.NativeAd.Image image1 = com.facebook.ads.NativeAd.Image.fromJSONObject(jsonobject.optJSONObject("image"));
            com.facebook.ads.NativeAd.Rating rating = com.facebook.ads.NativeAd.Rating.fromJSONObject(jsonobject.optJSONObject("star_rating"));
            String s4 = jsonobject.optString("impression_report_url");
            String s5 = jsonobject.optString("click_report_url");
            boolean flag = jsonobject.optBoolean("manual_imp");
            Object obj = null;
            Object obj1 = jsonobject.optJSONObject("ad_choices_icon");
            if (obj1 != null)
            {
                obj = com.facebook.ads.NativeAd.Image.fromJSONObject(((JSONObject) (obj1)));
            }
            obj1 = jsonobject.optString("ad_choices_link_url");
            g g1 = com.facebook.ads.a.g.a(jsonobject.optString("invalidation_behavior"));
            try
            {
                jsonobject = new JSONArray(jsonobject.optString("detection_strings"));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                jsonobject.printStackTrace();
                jsonobject = null;
            }
            obj = new aa(uri, s, s1, s2, s3, image, image1, rating, s4, s5, g1, com.facebook.ads.a.h.a(jsonobject), flag, ((com.facebook.ads.NativeAd.Image) (obj)), ((String) (obj1)));
            jsonobject = ((JSONObject) (obj));
            if (!((aa) (obj)).n())
            {
                return null;
            }
        }
        return jsonobject;
    }

    private Map m()
    {
        return Collections.singletonMap("mil", String.valueOf(true));
    }

    private boolean n()
    {
        return c != null && c.length() > 0 && e != null && e.length() > 0 && g != null && h != null;
    }

    public g a()
    {
        return l;
    }

    public void a(Context context, Map map, boolean flag)
    {
        if (!r)
        {
            HashMap hashmap = new HashMap();
            if (map != null)
            {
                hashmap.put("touch", com.facebook.ads.a.p.a(map));
            }
            if (flag)
            {
                hashmap.putAll(m());
            }
            (new ad(hashmap)).execute(new String[] {
                k
            });
            r = true;
            com.facebook.ads.a.p.a(context, "Click logged");
        }
        context = com.facebook.ads.a.a.b.a(context, b);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        context.a(null);
        return;
        context;
        Log.e(a, "Error executing action", context);
        return;
    }

    public void a(boolean flag)
    {
        if (!q)
        {
            Map map;
            if (flag)
            {
                map = m();
            } else
            {
                map = null;
            }
            (new ad(map)).execute(new String[] {
                j
            });
            q = true;
        }
    }

    public Collection b()
    {
        return m;
    }

    public com.facebook.ads.NativeAd.Image c()
    {
        return g;
    }

    public com.facebook.ads.NativeAd.Image d()
    {
        return h;
    }

    public String e()
    {
        return c;
    }

    public String f()
    {
        return d;
    }

    public String g()
    {
        return e;
    }

    public String h()
    {
        return f;
    }

    public com.facebook.ads.NativeAd.Rating i()
    {
        return i;
    }

    public boolean j()
    {
        return n;
    }

    public com.facebook.ads.NativeAd.Image k()
    {
        return o;
    }

    public String l()
    {
        return p;
    }

}
