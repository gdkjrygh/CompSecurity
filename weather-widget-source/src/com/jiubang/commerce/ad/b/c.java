// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.b;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.jiubang.commerce.ad.e.t;
import com.jiubang.commerce.ad.url.d;
import com.jiubang.commerce.service.IntelligentPreloadService;
import com.jiubang.commerce.utils.b;
import com.jiubang.commerce.utils.g;
import com.jiubang.commerce.utils.k;
import com.jiubang.commerce.utils.p;
import com.jiubang.commerce.utils.q;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class c
{

    public static String a = "http://newstoredata.goforandroid.com/newstore/";
    private static boolean b = false;

    public static String a()
    {
        return "http://adserver.goforandroid.com/restv2";
    }

    public static String a(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s1;
        if (b)
        {
            s1 = "http://183.61.112.38:8080/newstore/";
        } else
        {
            s1 = a;
        }
        return stringbuilder.append(s1).append("common?funid=").append(s).append("&rd=").append(System.currentTimeMillis()).toString();
    }

    public static JSONObject a(Context context, int i)
    {
        boolean flag = false;
        if (context == null)
        {
            return null;
        }
        Object obj = t.a();
        String s = ((t) (obj)).b();
        String s1 = ((t) (obj)).c();
        String s2 = ((t) (obj)).e();
        obj = ((t) (obj)).d();
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put("advposid", String.valueOf(i));
            jsonobject.put("pkgs", com.jiubang.commerce.utils.b.c(context));
            jsonobject.put("channel", s2);
            jsonobject.put("vcode", com.jiubang.commerce.utils.b.b(context, context.getPackageName()));
            jsonobject.put("vname", com.jiubang.commerce.utils.b.c(context, context.getPackageName()));
            jsonobject.put("country", p.a(q.b(context)));
            jsonobject.put("lang", p.b(q.d(context)));
            jsonobject.put("goid", s);
            jsonobject.put("aid", p.d(q.a(context)));
            jsonobject.put("imei", q.g(context));
            jsonobject.put("imsi", q.c(context));
            jsonobject.put("sys", android.os.Build.VERSION.RELEASE);
            jsonobject.put("sdk", android.os.Build.VERSION.SDK_INT);
            jsonobject.put("net", k.d(context));
            jsonobject.put("sbuy", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        i = ((flag) ? 1 : 0);
        if (g.a(context))
        {
            i = 1;
        }
        jsonobject.put("hasmarket", i);
        jsonobject.put("dpi", q.f(context));
        jsonobject.put("resolution", q.e(context));
        jsonobject.put("adid", s1);
        jsonobject.put("ua", d.a(context));
        jsonobject.put("cid", obj);
        jsonobject.put("pversion", 21);
        jsonobject.put("uid", q.g(context));
        return jsonobject;
    }

    public static JSONObject a(Context context, int i, int j)
    {
        t t1 = t.a();
        return a(context, t1.b(), t1.c(), t1.e(), i, j);
    }

    public static JSONObject a(Context context, String s, Integer integer)
    {
        t t1 = t.a();
        String s2 = t1.f();
        String s1 = s2;
        if ("2".equals(t1.g()))
        {
            s1 = s2;
            if (IntelligentPreloadService.d(context))
            {
                s1 = "1";
            }
        }
        return a(context, t1.b(), t1.c(), t1.d(), t1.e(), s1, t1.g(), s, integer);
    }

    public static JSONObject a(Context context, String s, String s1, String s2, int i, int j)
    {
        boolean flag = false;
        if (context == null)
        {
            return null;
        }
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put("advposids", String.valueOf(j));
            jsonobject.put("channel", s2);
            jsonobject.put("vcode", com.jiubang.commerce.utils.b.b(context, context.getPackageName()));
            jsonobject.put("vname", com.jiubang.commerce.utils.b.c(context, context.getPackageName()));
            jsonobject.put("country", p.a(q.b(context)));
            jsonobject.put("lang", p.b(q.d(context)));
            jsonobject.put("goid", s);
            jsonobject.put("aid", p.d(q.a(context)));
            jsonobject.put("imei", q.g(context));
            jsonobject.put("imsi", q.c(context));
            jsonobject.put("sys", android.os.Build.VERSION.RELEASE);
            jsonobject.put("sdk", android.os.Build.VERSION.SDK_INT);
            jsonobject.put("net", k.d(context));
            jsonobject.put("sbuy", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        j = ((flag) ? 1 : 0);
        if (g.a(context))
        {
            j = 1;
        }
        jsonobject.put("hasmarket", j);
        jsonobject.put("dpi", q.f(context));
        jsonobject.put("resolution", q.e(context));
        jsonobject.put("adid", s1);
        jsonobject.put("count", i);
        jsonobject.put("cip", "");
        jsonobject.put("ua", d.a(context));
        jsonobject.put("fields", "");
        return jsonobject;
    }

    private static JSONObject a(Context context, String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            Integer integer)
    {
        boolean flag;
        flag = true;
        if (context == null)
        {
            return null;
        }
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        jsonobject.put("pversion", 21);
        jsonobject.put("aid", p.d(q.a(context)));
        jsonobject.put("cid", s2);
        if (!"2".equals(p.d(s5))) goto _L2; else goto _L1
_L1:
        s2 = "99";
_L4:
        jsonobject.put("cversion", s2);
        jsonobject.put("cversionname", com.jiubang.commerce.utils.b.c(context, context.getPackageName()));
        jsonobject.put("uid", q.g(context));
        jsonobject.put("gadid", s1);
        jsonobject.put("goid", s);
        jsonobject.put("channel", s3);
        jsonobject.put("local", p.a(q.b(context)));
        jsonobject.put("lang", p.b(q.d(context)));
        jsonobject.put("sdk", android.os.Build.VERSION.SDK_INT);
        jsonobject.put("imsi", q.c(context));
        jsonobject.put("sys", android.os.Build.VERSION.RELEASE);
        jsonobject.put("model", Build.MODEL);
        jsonobject.put("requesttime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date()));
        jsonobject.put("entranceId", s5);
        int i;
        if (g.a(context))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        try
        {
            jsonobject.put("hasmarket", i);
            jsonobject.put("net", k.d(context));
            jsonobject.put("dpi", q.e(context));
            jsonobject.put("dataChannel", s4);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        context = s6;
        if (TextUtils.isEmpty(s6))
        {
            context = "buychannel-none";
        }
        jsonobject.put("buychannel", context);
        i = ((flag) ? 1 : 0);
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_346;
        }
        i = Math.max(integer.intValue(), 1);
        jsonobject.put("cdays", i);
        jsonobject.put("sdkabversion", 6);
        return jsonobject;
_L2:
        i = com.jiubang.commerce.utils.b.b(context, context.getPackageName());
        s2 = Integer.valueOf(i);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String b()
    {
        return "http://adviap.goforandroid.com/adv_iap/userTag";
    }

    public static Map c()
    {
        String s = t.a().d();
        HashMap hashmap = new HashMap();
        if (TextUtils.isEmpty(s))
        {
            hashmap.put("prodKey", "QI1ORHMZK7Q58R0Y7FCH0Z9S");
            hashmap.put("accessKey", "BFEJ0NGAJTXAANYHHEIC7BIFC456ZAXJ");
            return hashmap;
        }
        if ("8".equals(s))
        {
            hashmap.put("prodKey", "E52B8QOI0EL3WWN1W3303F0E");
            hashmap.put("accessKey", "GQ6ZO3H6E08VKSYT5JH5GRX54D8STTCR");
            return hashmap;
        }
        if ("11".equals(s))
        {
            hashmap.put("prodKey", "QYT61Y5YD2SQFKVZ1J5LQ0V3");
            hashmap.put("accessKey", "KQOE2K47M5WXRBTIGGR52U4YHPQZNUXA");
            return hashmap;
        }
        if ("6".equals(s))
        {
            hashmap.put("prodKey", "669IO7IIH1LVEGMY1V7MM29Z");
            hashmap.put("accessKey", "8ZW4DQF9KXYSD4SY01TFW4O3FTU3IAQ8");
            return hashmap;
        }
        if ("7".equals(s))
        {
            hashmap.put("prodKey", "7WARFBXAFC7VA35FWHDDN6I9");
            hashmap.put("accessKey", "ZOIG12T0XCAAWXTRX5FN0GBF52EBCK9H");
            return hashmap;
        }
        if ("5".equals(s))
        {
            hashmap.put("prodKey", "QNRUVO790PNQNGCM65TU387I");
            hashmap.put("accessKey", "4EP7066V6ZQ3KCWZD33I3R04RW3JVL66");
            return hashmap;
        }
        if ("9".equals(s) || "4".equals(s))
        {
            hashmap.put("prodKey", "8YZN10M5Y87YMR8QYM73SWSM");
            hashmap.put("accessKey", "94HYC3NQ5PFIE38YT85Z8SCVZBWRJVG4");
            return hashmap;
        }
        if ("12".equals(s))
        {
            hashmap.put("prodKey", "PTE0ICLOEGNIOOLS08LJPTVR");
            hashmap.put("accessKey", "Q1BGHV5DTEHRT87FIB0LCE7K61N0W58Z");
            return hashmap;
        }
        if ("13".equals(s))
        {
            hashmap.put("prodKey", "6U267MSOA2F6S896QJO0NYDJ");
            hashmap.put("accessKey", "FVMRFDZDD3ZO9YGRIH2063KOS6QMGZMZ");
            return hashmap;
        }
        if ("15".equals(s))
        {
            hashmap.put("prodKey", "27LYD9AGENAJPCU3O0XV9WLF");
            hashmap.put("accessKey", "YO0FINC2I0JSPDMB2KWMLZRJ94BHT6IA");
            return hashmap;
        }
        if ("16".equals(s))
        {
            hashmap.put("prodKey", "QYWXEZGVND26KHVYF9SF7NGK");
            hashmap.put("accessKey", "28J3ZCJLXTW06HJYEPOEKOSVVQADNNML");
            return hashmap;
        }
        if ("19".equals(s))
        {
            hashmap.put("prodKey", "I6140ZNLO7SHXTUQ4QD20FSD");
            hashmap.put("accessKey", "D4PILZZL2QDKQU8882XZ6O9KCR2KHTQS");
            return hashmap;
        }
        if ("20".equals(s))
        {
            hashmap.put("prodKey", "OOXT0131V6M6WICWLF9TSV6I");
            hashmap.put("accessKey", "JXLK1Z8CIF9Z58BSCPP8LL734VL0LI77");
            return hashmap;
        } else
        {
            hashmap.put("prodKey", "QI1ORHMZK7Q58R0Y7FCH0Z9S");
            hashmap.put("accessKey", "BFEJ0NGAJTXAANYHHEIC7BIFC456ZAXJ");
            return hashmap;
        }
    }

}
