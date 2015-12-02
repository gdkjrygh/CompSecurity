// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.mapapi.navi;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import com.baidu.mapapi.model.a;
import com.baidu.mapapi.utils.OpenClientUtil;
import com.baidu.mapapi.utils.c;
import com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException;
import com.baidu.platform.comapi.a.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.baidu.mapapi.navi:
//            NaviParaOption, IllegalNaviArgumentException

public class BaiduMapNavigation
{

    private static boolean a = true;

    public BaiduMapNavigation()
    {
    }

    private static String a(Context context)
    {
label0:
        {
            Object obj = null;
            PackageManager packagemanager;
            try
            {
                packagemanager = context.getApplicationContext().getPackageManager();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                packagemanager = null;
                context = obj;
                if (false)
                {
                } else
                {
                    break label0;
                }
            }
            try
            {
                context = packagemanager.getApplicationInfo(context.getPackageName(), 0);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = obj;
            }
        }
        return (String)packagemanager.getApplicationLabel(context);
    }

    private static void a(NaviParaOption naviparaoption, Context context)
    {
        Object obj;
        JSONArray jsonarray;
        b b1;
        b b2;
        JSONObject jsonobject;
        JSONObject jsonobject1;
        if (naviparaoption == null || context == null)
        {
            throw new IllegalPoiSearchArgumentException("para or context can not be null.");
        }
        if (naviparaoption.a == null || naviparaoption.c == null)
        {
            break MISSING_BLOCK_LABEL_453;
        }
        b1 = com.baidu.mapapi.model.a.a(naviparaoption.a);
        b2 = com.baidu.mapapi.model.a.a(naviparaoption.c);
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("http://app.navi.baidu.com/mobile/#navi/naving/");
        ((StringBuilder) (obj)).append("&sy=0");
        ((StringBuilder) (obj)).append("&endp=");
        ((StringBuilder) (obj)).append("&start=");
        ((StringBuilder) (obj)).append("&startwd=");
        ((StringBuilder) (obj)).append("&endwd=");
        ((StringBuilder) (obj)).append("&fromprod=map_sdk");
        ((StringBuilder) (obj)).append("&app_version=");
        ((StringBuilder) (obj)).append("3.5.0");
        jsonarray = new JSONArray();
        jsonobject = new JSONObject();
        jsonobject1 = new JSONObject();
        jsonobject.put("type", "1");
        if (naviparaoption.b == null || naviparaoption.b.equals("")) goto _L2; else goto _L1
_L1:
        jsonobject.put("keyword", naviparaoption.b);
_L5:
        jsonobject.put("xy", (new StringBuilder()).append(String.valueOf(b1.b())).append(",").append(String.valueOf(b1.a())).toString());
        jsonarray.put(jsonobject);
        jsonobject1.put("type", "1");
        if (naviparaoption.d == null || naviparaoption.d.equals("")) goto _L4; else goto _L3
_L3:
        jsonobject.put("keyword", naviparaoption.d);
_L7:
        jsonobject1.put("xy", (new StringBuilder()).append(String.valueOf(b2.b())).append(",").append(String.valueOf(b2.a())).toString());
        jsonarray.put(jsonobject1);
_L6:
        if (jsonarray.length() > 0)
        {
            ((StringBuilder) (obj)).append("&positions=");
            ((StringBuilder) (obj)).append(jsonarray.toString());
        }
        ((StringBuilder) (obj)).append("&ctrl_type=");
        ((StringBuilder) (obj)).append("&mrsl=");
        ((StringBuilder) (obj)).append("/vt=map&state=entry");
        naviparaoption = Uri.parse(((StringBuilder) (obj)).toString());
        obj = new Intent();
        ((Intent) (obj)).setAction("android.intent.action.VIEW");
        ((Intent) (obj)).setFlags(0x10000000);
        ((Intent) (obj)).setData(naviparaoption);
        context.startActivity(((Intent) (obj)));
        return;
_L2:
        jsonobject.put("keyword", "");
          goto _L5
        naviparaoption;
        naviparaoption.printStackTrace();
          goto _L6
_L4:
        jsonobject.put("keyword", "");
          goto _L7
        throw new IllegalNaviArgumentException("you must set start and end point.");
          goto _L5
    }

    public static boolean openBaiduMapNavi(NaviParaOption naviparaoption, Context context)
    {
        if (naviparaoption == null || context == null)
        {
            throw new IllegalPoiSearchArgumentException("para or context can not be null.");
        }
        if (naviparaoption.c == null || naviparaoption.a == null)
        {
            throw new IllegalNaviArgumentException("start point or end point can not be null.");
        }
        int i = OpenClientUtil.getBaiduMapVersion(context);
        if (i != 0)
        {
            if (i >= 830)
            {
                return c.a(naviparaoption, context, 5);
            }
            Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.2");
            if (a)
            {
                a(naviparaoption, context);
                return true;
            } else
            {
                throw new IllegalPoiSearchArgumentException("Baidumap app version is too lowl.Version is greater than 8.2");
            }
        }
        Log.e("baidumapsdk", "BaiduMap app is not installed.");
        if (a)
        {
            a(naviparaoption, context);
            return true;
        } else
        {
            throw new IllegalPoiSearchArgumentException("BaiduMap app is not installed.");
        }
    }

    public static void openWebBaiduMapNavi(NaviParaOption naviparaoption, Context context)
    {
        if (naviparaoption == null || context == null)
        {
            throw new IllegalPoiSearchArgumentException("para or context can not be null.");
        }
        if (naviparaoption.a != null && naviparaoption.c != null)
        {
            Object obj = com.baidu.mapapi.model.a.a(naviparaoption.a);
            naviparaoption = com.baidu.mapapi.model.a.a(naviparaoption.c);
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("http://daohang.map.baidu.com/mobile/#navi/naving/start=");
            stringbuilder.append(((b) (obj)).b());
            stringbuilder.append(",");
            stringbuilder.append(((b) (obj)).a());
            stringbuilder.append("&endp=");
            stringbuilder.append(naviparaoption.b());
            stringbuilder.append(",");
            stringbuilder.append(naviparaoption.a());
            stringbuilder.append("&fromprod=");
            stringbuilder.append(a(context));
            stringbuilder.append("/vt=map&state=entry");
            naviparaoption = Uri.parse(stringbuilder.toString());
            obj = new Intent();
            ((Intent) (obj)).setAction("android.intent.action.VIEW");
            ((Intent) (obj)).setFlags(0x10000000);
            ((Intent) (obj)).setData(naviparaoption);
            context.startActivity(((Intent) (obj)));
            return;
        }
        if (naviparaoption.b != null && !naviparaoption.b.equals("") && naviparaoption.d != null && !naviparaoption.d.equals(""))
        {
            Object obj1 = new StringBuilder();
            ((StringBuilder) (obj1)).append("http://daohang.map.baidu.com/mobile/#search/search/qt=nav&sn=2$$$$$$");
            ((StringBuilder) (obj1)).append(naviparaoption.b);
            ((StringBuilder) (obj1)).append("$$$$$$&en=2$$$$$$");
            ((StringBuilder) (obj1)).append(naviparaoption.d);
            ((StringBuilder) (obj1)).append("$$$$$$&fromprod=");
            ((StringBuilder) (obj1)).append(a(context));
            naviparaoption = Uri.parse(((StringBuilder) (obj1)).toString());
            obj1 = new Intent();
            ((Intent) (obj1)).setAction("android.intent.action.VIEW");
            ((Intent) (obj1)).setData(naviparaoption);
            context.startActivity(((Intent) (obj1)));
            return;
        } else
        {
            throw new IllegalNaviArgumentException("you must set start and end point or set the start and end name.");
        }
    }

    public static void setSupportWebNavi(boolean flag)
    {
        a = flag;
    }

}
