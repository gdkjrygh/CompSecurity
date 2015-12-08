// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.location.Location;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            dj, do, cg, ce, 
//            cz, cs, dd, aa, 
//            an, ac, da

public final class cu
{

    private static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd");

    public static cg a(Context context, ce ce1, String s)
    {
        String s1;
        Object obj;
        String s2;
        Object obj3;
        obj3 = new JSONObject(s);
        s = ((JSONObject) (obj3)).optString("ad_base_url", null);
        obj = ((JSONObject) (obj3)).optString("ad_url", null);
        s2 = ((JSONObject) (obj3)).optString("ad_size", null);
        s1 = ((JSONObject) (obj3)).optString("ad_html", null);
        if (!((JSONObject) (obj3)).has("interstitial_timeout")) goto _L2; else goto _L1
_L1:
        long l = (long)(((JSONObject) (obj3)).getDouble("interstitial_timeout") * 1000D);
_L39:
        Object obj1 = ((JSONObject) (obj3)).optString("orientation", null);
        int i = -1;
        if (!"portrait".equals(obj1)) goto _L4; else goto _L3
_L3:
        i = dj.b();
_L7:
        if (TextUtils.isEmpty(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(s))
        {
            com.google.android.gms.internal.do.d("Could not parse the mediation config: Missing required ad_base_url field");
            return new cg(0);
        }
          goto _L5
_L4:
        if ("landscape".equals(obj1))
        {
            i = dj.a();
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L9; else goto _L8
_L8:
        obj = cs.a(context, ce1.en.iM, ((String) (obj)));
        s = ((cg) (obj)).gO;
        s1 = ((cg) (obj)).hz;
_L38:
        obj1 = ((JSONObject) (obj3)).optJSONArray("click_urls");
        if (obj != null) goto _L11; else goto _L10
_L10:
        context = null;
_L17:
        if (obj1 == null) goto _L13; else goto _L12
_L16:
        int j;
        if (j >= ((JSONArray) (obj1)).length()) goto _L15; else goto _L14
_L14:
        ce1.add(((JSONArray) (obj1)).getString(j));
        j++;
          goto _L16
_L9:
        com.google.android.gms.internal.do.d("Could not parse the mediation config: Missing required ad_html or ad_url field.");
        context = new cg(0);
        return context;
_L11:
        context = ((cg) (obj)).fO;
          goto _L17
_L37:
        Object obj2 = ((JSONObject) (obj3)).optJSONArray("impression_urls");
        if (obj != null) goto _L19; else goto _L18
_L18:
        context = null;
_L27:
        if (obj2 == null) goto _L21; else goto _L20
_L20:
        ce1 = context;
        if (context != null) goto _L23; else goto _L22
_L22:
        ce1 = new LinkedList();
          goto _L23
_L26:
        if (j >= ((JSONArray) (obj2)).length()) goto _L25; else goto _L24
_L24:
        ce1.add(((JSONArray) (obj2)).getString(j));
        j++;
          goto _L26
_L19:
        context = ((cg) (obj)).fP;
          goto _L27
_L36:
        obj3 = ((JSONObject) (obj3)).optJSONArray("manual_impression_urls");
        if (obj != null) goto _L29; else goto _L28
_L28:
        context = null;
_L35:
        if (obj3 == null) goto _L31; else goto _L30
_L30:
        ce1 = context;
        if (context != null) goto _L33; else goto _L32
_L32:
        ce1 = new LinkedList();
          goto _L33
_L34:
        if (j >= ((JSONArray) (obj3)).length())
        {
            break MISSING_BLOCK_LABEL_616;
        }
        ce1.add(((JSONArray) (obj3)).getString(j));
        j++;
          goto _L34
_L29:
        context = ((cg) (obj)).hD;
          goto _L35
_L31:
        l1 = l;
        j = i;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_527;
        }
        if (((cg) (obj)).orientation != -1)
        {
            i = ((cg) (obj)).orientation;
        }
        l1 = l;
        j = i;
        if (((cg) (obj)).hA <= 0L)
        {
            break MISSING_BLOCK_LABEL_527;
        }
        l1 = ((cg) (obj)).hA;
        j = i;
        context = new cg(s, s1, ((List) (obj1)), ((List) (obj2)), l1, false, -1L, context, -1L, j, s2);
        return context;
_L21:
        obj2 = context;
          goto _L36
_L13:
        obj1 = context;
          goto _L37
_L5:
        obj = null;
          goto _L38
_L2:
        l = -1L;
          goto _L39
_L12:
        ce1 = context;
        long l1;
        if (context == null)
        {
            try
            {
                ce1 = new LinkedList();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                com.google.android.gms.internal.do.d((new StringBuilder("Could not parse the mediation config: ")).append(context.getMessage()).toString());
                return new cg(0);
            }
        }
        j = 0;
          goto _L16
_L15:
        obj1 = ce1;
          goto _L37
_L23:
        j = 0;
          goto _L26
_L25:
        obj2 = ce1;
          goto _L36
_L33:
        j = 0;
          goto _L34
        context = ce1;
          goto _L31
    }

    private static Integer a(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    private static String a(int i)
    {
        return String.format(Locale.US, "#%06x", new Object[] {
            Integer.valueOf(0xffffff & i)
        });
    }

    public static String a(ce ce1, da da1)
    {
        Object obj;
        float f;
        HashMap hashmap;
        Object obj1;
        ac aac[];
        ac ac1;
        int i;
        int j;
        int k;
        long l;
        long l1;
        long l2;
        try
        {
            hashmap = new HashMap();
            if (ce1.ht != null)
            {
                hashmap.put("ad_pos", ce1.ht);
            }
            obj = ce1.hu;
            obj1 = dd.a();
        }
        // Misplaced declaration of an exception variable
        catch (ce ce1)
        {
            com.google.android.gms.internal.do.d((new StringBuilder("Problem serializing ad request to JSON: ")).append(ce1.getMessage()).toString());
            return null;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        hashmap.put("abf", obj1);
        if (((aa) (obj)).eB != -1L)
        {
            hashmap.put("cust_age", a.format(new Date(((aa) (obj)).eB)));
        }
        if (((aa) (obj)).extras != null)
        {
            hashmap.put("extras", ((aa) (obj)).extras);
        }
        if (((aa) (obj)).eC != -1)
        {
            hashmap.put("cust_gender", Integer.valueOf(((aa) (obj)).eC));
        }
        if (((aa) (obj)).eD != null)
        {
            hashmap.put("kw", ((aa) (obj)).eD);
        }
        if (((aa) (obj)).tagForChildDirectedTreatment != -1)
        {
            hashmap.put("tag_for_child_directed_treatment", Integer.valueOf(((aa) (obj)).tagForChildDirectedTreatment));
        }
        if (((aa) (obj)).eE)
        {
            hashmap.put("adtest", "on");
        }
        if (((aa) (obj)).versionCode < 2) goto _L2; else goto _L1
_L1:
        if (((aa) (obj)).eF)
        {
            hashmap.put("d_imp_hdr", Integer.valueOf(1));
        }
        if (!TextUtils.isEmpty(((aa) (obj)).eG))
        {
            hashmap.put("ppid", ((aa) (obj)).eG);
        }
        if (((aa) (obj)).eH == null) goto _L2; else goto _L3
_L3:
        obj1 = ((aa) (obj)).eH;
        if (Color.alpha(((an) (obj1)).fd) != 0)
        {
            hashmap.put("acolor", a(((an) (obj1)).fd));
        }
        if (Color.alpha(((an) (obj1)).backgroundColor) != 0)
        {
            hashmap.put("bgcolor", a(((an) (obj1)).backgroundColor));
        }
        if (Color.alpha(((an) (obj1)).fe) != 0 && Color.alpha(((an) (obj1)).ff) != 0)
        {
            hashmap.put("gradientto", a(((an) (obj1)).fe));
            hashmap.put("gradientfrom", a(((an) (obj1)).ff));
        }
        if (Color.alpha(((an) (obj1)).fg) != 0)
        {
            hashmap.put("bcolor", a(((an) (obj1)).fg));
        }
        hashmap.put("bthick", Integer.toString(((an) (obj1)).fh));
        ((an) (obj1)).fi;
        JVM INSTR tableswitch 0 3: default 1528
    //                   0 1538
    //                   1 1545
    //                   2 1552
    //                   3 1559;
           goto _L4 _L5 _L6 _L7 _L8
_L28:
        if (obj == null) goto _L10; else goto _L9
_L9:
        hashmap.put("btype", obj);
_L10:
        ((an) (obj1)).fj;
        JVM INSTR tableswitch 0 2: default 1533
    //                   0 1573
    //                   1 1580
    //                   2 1566;
           goto _L11 _L12 _L13 _L14
_L29:
        if (obj == null) goto _L16; else goto _L15
_L15:
        hashmap.put("callbuttoncolor", obj);
_L16:
        if (((an) (obj1)).fk != null)
        {
            hashmap.put("channel", ((an) (obj1)).fk);
        }
        if (Color.alpha(((an) (obj1)).fl) != 0)
        {
            hashmap.put("dcolor", a(((an) (obj1)).fl));
        }
        if (((an) (obj1)).fm != null)
        {
            hashmap.put("font", ((an) (obj1)).fm);
        }
        if (Color.alpha(((an) (obj1)).fn) != 0)
        {
            hashmap.put("hcolor", a(((an) (obj1)).fn));
        }
        hashmap.put("headersize", Integer.toString(((an) (obj1)).fo));
        if (((an) (obj1)).fp != null)
        {
            hashmap.put("q", ((an) (obj1)).fp);
        }
_L2:
        hashmap.put("format", ce1.eq.eJ);
        if (ce1.eq.width == -1)
        {
            hashmap.put("smart_w", "full");
        }
        if (ce1.eq.height == -2)
        {
            hashmap.put("smart_h", "auto");
        }
        if (ce1.eq.eL == null) goto _L18; else goto _L17
_L17:
        obj = new StringBuilder();
        aac = ce1.eq.eL;
        k = aac.length;
        i = 0;
_L25:
        if (i >= k) goto _L20; else goto _L19
_L19:
        ac1 = aac[i];
        if (((StringBuilder) (obj)).length() != 0)
        {
            ((StringBuilder) (obj)).append("|");
        }
        if (ac1.width != -1) goto _L22; else goto _L21
_L21:
        j = (int)((float)ac1.widthPixels / da1.q);
_L26:
        ((StringBuilder) (obj)).append(j);
        ((StringBuilder) (obj)).append("x");
        if (ac1.height != -2) goto _L24; else goto _L23
_L23:
        j = (int)((float)ac1.heightPixels / da1.q);
_L27:
        ((StringBuilder) (obj)).append(j);
        i++;
          goto _L25
_L22:
        j = ac1.width;
          goto _L26
_L24:
        j = ac1.height;
          goto _L27
_L20:
        hashmap.put("sz", obj);
_L18:
        hashmap.put("slotname", ce1.adUnitId);
        hashmap.put("pn", ce1.applicationInfo.packageName);
        if (ce1.hv != null)
        {
            hashmap.put("vc", Integer.valueOf(ce1.hv.versionCode));
        }
        hashmap.put("ms", ce1.hw);
        hashmap.put("seq_num", ce1.hx);
        hashmap.put("session_id", ce1.hy);
        hashmap.put("js", ce1.en.iM);
        hashmap.put("am", Integer.valueOf(da1.a));
        hashmap.put("cog", a(da1.b));
        hashmap.put("coh", a(da1.c));
        if (!TextUtils.isEmpty(da1.d))
        {
            hashmap.put("carrier", da1.d);
        }
        hashmap.put("gl", da1.e);
        if (da1.f)
        {
            hashmap.put("simulator", Integer.valueOf(1));
        }
        hashmap.put("ma", a(da1.g));
        hashmap.put("sp", a(da1.h));
        hashmap.put("hl", da1.i);
        if (!TextUtils.isEmpty(da1.j))
        {
            hashmap.put("mv", da1.j);
        }
        hashmap.put("muv", Integer.valueOf(da1.k));
        if (da1.l != -2)
        {
            hashmap.put("cnt", Integer.valueOf(da1.l));
        }
        hashmap.put("gnt", Integer.valueOf(da1.m));
        hashmap.put("pt", Integer.valueOf(da1.n));
        hashmap.put("rm", Integer.valueOf(da1.o));
        hashmap.put("riv", Integer.valueOf(da1.p));
        hashmap.put("u_sd", Float.valueOf(da1.q));
        hashmap.put("sh", Integer.valueOf(da1.s));
        hashmap.put("sw", Integer.valueOf(da1.r));
        if (ce1.hu.versionCode >= 2 && ce1.hu.eI != null)
        {
            ce1 = ce1.hu.eI;
            da1 = new HashMap();
            f = ce1.getAccuracy();
            l = ce1.getTime();
            l1 = (long)(ce1.getLatitude() * 10000000D);
            l2 = (long)(ce1.getLongitude() * 10000000D);
            da1.put("radius", Float.valueOf(f * 1000F));
            da1.put("lat", Long.valueOf(l1));
            da1.put("long", Long.valueOf(l2));
            da1.put("time", Long.valueOf(l * 1000L));
            hashmap.put("uule", da1);
        }
        if (com.google.android.gms.internal.do.a(2))
        {
            ce1 = dj.a(hashmap).toString(2);
            com.google.android.gms.internal.do.c((new StringBuilder("Ad Request JSON: ")).append(ce1).toString());
        }
        ce1 = dj.a(hashmap).toString();
        return ce1;
_L4:
        obj = null;
          goto _L28
_L11:
        obj = null;
          goto _L29
_L5:
        obj = "none";
          goto _L28
_L6:
        obj = "dashed";
          goto _L28
_L7:
        obj = "dotted";
          goto _L28
_L8:
        obj = "solid";
          goto _L28
_L14:
        obj = "dark";
          goto _L29
_L12:
        obj = "light";
          goto _L29
_L13:
        obj = "medium";
          goto _L29
    }

}
