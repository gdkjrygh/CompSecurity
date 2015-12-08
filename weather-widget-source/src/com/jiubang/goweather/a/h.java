// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.billing.p;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.service.NotifyService;
import com.gtp.a.a.a.a;
import com.gtp.a.a.b.c;
import com.jiubang.goweather.b.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.goweather.a:
//            a, g, f, e, 
//            i, c, d, b

public class h
{

    private ArrayList a;

    public h(ArrayList arraylist)
    {
        a = arraylist;
    }

    private boolean a(String s)
    {
        return s.startsWith("[");
    }

    private void b(JSONObject jsonobject, com.jiubang.goweather.a.a a1)
    {
        JSONObject jsonobject1 = jsonobject.optJSONObject("head");
        if (jsonobject1 != null)
        {
            a1.h(jsonobject1.optInt("result", -1));
        }
        if (a1.x() == 1)
        {
            long l = jsonobject.optLong("updateTimeLong", -10000L);
            JSONObject jsonobject2;
            if (l != -10000L)
            {
                a1.a(l);
            } else
            {
                String s1 = jsonobject.optString("updateTime");
                String s = s1;
                if (TextUtils.isEmpty(s1))
                {
                    s = "--";
                }
                a1.c(s);
            }
            a1.b(jsonobject.optLong("timestamp", 0L));
            jsonobject2 = jsonobject.optJSONObject("weather");
            if (jsonobject2 != null)
            {
                a1.d(jsonobject.toString());
                a1.c(jsonobject2.optLong("updateTime"));
                f(jsonobject2, a1);
                g(jsonobject2, a1);
                h(jsonobject2, a1);
                i(jsonobject2, a1);
                j(jsonobject2, a1);
                k(jsonobject2, a1);
                a(jsonobject2, a1);
                e(jsonobject2, a1);
                d(jsonobject2, a1);
                c(jsonobject2, a1);
            }
        }
    }

    private void c(JSONObject jsonobject, com.jiubang.goweather.a.a a1)
    {
        jsonobject = jsonobject.optJSONObject("radar");
        if (jsonobject != null)
        {
            a1.m = jsonobject.optString("url", "");
            int l;
            if (TextUtils.isEmpty(a1.m))
            {
                l = 0;
            } else
            {
                l = 1;
            }
            a1.a(l);
        }
    }

    private void d(JSONObject jsonobject, com.jiubang.goweather.a.a a1)
    {
        jsonobject = jsonobject.optJSONObject("weatherIndices");
        if (jsonobject != null)
        {
            a1.l = jsonobject.toString();
        }
    }

    private void e(JSONObject jsonobject, com.jiubang.goweather.a.a a1)
    {
        jsonobject = jsonobject.optJSONArray("pollenIndex");
        if (jsonobject != null)
        {
            ArrayList arraylist = new ArrayList();
            for (int l = 0; l < jsonobject.length(); l++)
            {
                Object obj = jsonobject.optJSONObject(l);
                long l1 = ((JSONObject) (obj)).optLong("dateTime", -10000L);
                float f1 = (float)((JSONObject) (obj)).optDouble("pollenLevel", -10000D);
                obj = ((JSONObject) (obj)).optJSONArray("pollenValues");
                ArrayList arraylist1 = new ArrayList();
                if (obj != null)
                {
                    for (int i1 = 0; i1 < ((JSONArray) (obj)).length(); i1++)
                    {
                        JSONObject jsonobject1 = ((JSONArray) (obj)).optJSONObject(i1);
                        arraylist1.add(new g(jsonobject1.optString("value", "--"), jsonobject1.optInt("type", -10000), jsonobject1.optString("url", "--")));
                    }

                }
                arraylist.add(new com.jiubang.goweather.a.f(l1, f1, arraylist1));
            }

            a1.o = arraylist;
        }
    }

    private void f(JSONObject jsonobject, com.jiubang.goweather.a.a a1)
    {
        JSONObject jsonobject1 = jsonobject.optJSONObject("city");
        if (jsonobject1 != null)
        {
            Object obj = jsonobject1.optString("cityId");
            jsonobject = ((JSONObject) (obj));
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                jsonobject = a1.e();
            }
            a1.c = jsonobject;
            obj = jsonobject1.optString("city");
            jsonobject = ((JSONObject) (obj));
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                jsonobject = a1.b;
            }
            a1.b = jsonobject;
            obj = jsonobject1.optString("state");
            jsonobject = ((JSONObject) (obj));
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                jsonobject = "--";
            }
            a1.a(jsonobject);
            obj = jsonobject1.optString("country");
            jsonobject = ((JSONObject) (obj));
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                jsonobject = "--";
            }
            a1.b(jsonobject);
            a1.f((int)jsonobject1.optLong("timeZone", -10000L));
            jsonobject = jsonobject1.optString("latlng");
            a1.a(-10000F);
            a1.b(-10000F);
            int l;
            if (!TextUtils.isEmpty(jsonobject))
            {
                try
                {
                    jsonobject = jsonobject.split(",");
                    if (jsonobject.length == 2)
                    {
                        a1.a(Float.valueOf(jsonobject[0]).floatValue());
                        a1.b(Float.valueOf(jsonobject[1]).floatValue());
                    }
                }
                // Misplaced declaration of an exception variable
                catch (JSONObject jsonobject)
                {
                    jsonobject.printStackTrace();
                }
            }
            if (jsonobject1.optBoolean("hasRadar", false))
            {
                l = 1;
            } else
            {
                l = 0;
            }
            a1.a(l);
            if (jsonobject1.optBoolean("hasSatellite", false))
            {
                l = 1;
            } else
            {
                l = 0;
            }
            a1.b(l);
            jsonobject = new double[2];
            JSONObject _tmp = jsonobject;
            jsonobject[0] = -10000D;
            jsonobject[1] = -10000D;
            obj = jsonobject1.optJSONArray("northeast");
            if (obj != null && ((JSONArray) (obj)).length() == 2)
            {
                try
                {
                    jsonobject[0] = Double.valueOf(String.valueOf(((JSONArray) (obj)).get(0))).doubleValue();
                    jsonobject[1] = Double.valueOf(String.valueOf(((JSONArray) (obj)).get(1))).doubleValue();
                }
                catch (NumberFormatException numberformatexception)
                {
                    numberformatexception.printStackTrace();
                }
                catch (JSONException jsonexception)
                {
                    jsonexception.printStackTrace();
                }
                if (jsonobject[0] != -10000D && jsonobject[1] != -10000D)
                {
                    a1.a(jsonobject);
                }
            }
            jsonobject = new double[2];
            JSONObject _tmp1 = jsonobject;
            jsonobject[0] = -10000D;
            jsonobject[1] = -10000D;
            obj = jsonobject1.optJSONArray("southwest");
            if (obj != null && ((JSONArray) (obj)).length() == 2)
            {
                try
                {
                    jsonobject[0] = Double.valueOf(String.valueOf(((JSONArray) (obj)).get(0))).doubleValue();
                    jsonobject[1] = Double.valueOf(String.valueOf(((JSONArray) (obj)).get(1))).doubleValue();
                }
                catch (NumberFormatException numberformatexception1)
                {
                    numberformatexception1.printStackTrace();
                }
                catch (JSONException jsonexception1)
                {
                    jsonexception1.printStackTrace();
                }
                if (jsonobject[0] != -10000D && jsonobject[1] != -10000D)
                {
                    a1.b(jsonobject);
                }
            }
        }
    }

    private void g(JSONObject jsonobject, com.jiubang.goweather.a.a a1)
    {
        JSONObject jsonobject1 = jsonobject.optJSONObject("currentWeather");
        if (jsonobject1 != null)
        {
            e e1 = new e();
            a1.g = e1;
            a1 = jsonobject1.optString("status");
            jsonobject = a1;
            if (TextUtils.isEmpty(a1))
            {
                jsonobject = "--";
            }
            e1.d(jsonobject);
            int i1 = jsonobject1.optInt("statusType");
            int l = i1;
            if (i1 == -10000)
            {
                l = 1;
            }
            e1.h(l);
            e1.i((float)jsonobject1.optDouble("realTemp", -10000D));
            e1.b((float)jsonobject1.optDouble("feelLike", -10000D));
            e1.i(jsonobject1.optInt("humidity", -10000));
            e1.g((float)jsonobject1.optDouble("high", -10000D));
            e1.h((float)jsonobject1.optDouble("low", -10000D));
            a1 = jsonobject1.optString("windDir");
            jsonobject = a1;
            if (TextUtils.isEmpty(a1))
            {
                jsonobject = "--";
            }
            e1.c(jsonobject);
            e1.f(jsonobject1.optInt("windDirType", 1));
            e1.a((float)jsonobject1.optDouble("windStrengthInt", -10000D));
            e1.c((float)jsonobject1.optDouble("visibility", -10000D));
            e1.d((float)jsonobject1.optDouble("barometer", -10000D));
            e1.e((float)jsonobject1.optDouble("dewpoint", -10000D));
            a1 = jsonobject1.optString("sunrise");
            jsonobject = a1;
            if (TextUtils.isEmpty(a1))
            {
                jsonobject = "--";
            }
            e1.a(jsonobject);
            a1 = jsonobject1.optString("sunset");
            jsonobject = a1;
            if (TextUtils.isEmpty(a1))
            {
                jsonobject = "--";
            }
            e1.b(jsonobject);
            e1.f((float)jsonobject1.optDouble("uvIndex", -10000D));
            e1.g(jsonobject1.optInt("pop", -10000));
            e1.j((float)jsonobject1.optDouble("rainfall", -10000D));
        }
    }

    private void h(JSONObject jsonobject, com.jiubang.goweather.a.a a1)
    {
        if (a1.g != null)
        {
            jsonobject = jsonobject.optJSONObject("aqi");
            if (jsonobject != null)
            {
                a1.g.j(jsonobject.optInt("aqi", -10000));
                a1.g.a(jsonobject.optInt("qualityType", -10000));
                a1.g.b(jsonobject.optInt("pm25", -10000));
                a1.g.c(jsonobject.optInt("pm10", -10000));
                a1.g.d(jsonobject.optInt("so2", -10000));
                a1.g.e(jsonobject.optInt("no2", -10000));
            }
        }
    }

    private void i(JSONObject jsonobject, com.jiubang.goweather.a.a a1)
    {
        jsonobject = jsonobject.optJSONObject("zhishu");
        if (jsonobject != null)
        {
            a1 = new i();
            a1.a(jsonobject.optString("shushi", "--"));
            a1.b(jsonobject.optString("chuanyi", "--"));
            a1.c(jsonobject.optString("liangshai", "--"));
            a1.d(jsonobject.optString("chenlian", "--"));
            a1.e(jsonobject.optString("ziwaixian", "--"));
            a1.f(jsonobject.optString("lvyou", "--"));
            a1.g(jsonobject.optString("guomin", "--"));
            a1.h(jsonobject.optString("xiche", "--"));
        }
    }

    private void j(JSONObject jsonobject, com.jiubang.goweather.a.a a1)
    {
        JSONArray jsonarray = jsonobject.optJSONArray("forecasts");
        if (jsonarray != null)
        {
            int i1 = jsonarray.length();
            for (int l = 0; l < i1; l++)
            {
                JSONObject jsonobject1 = jsonarray.optJSONObject(l);
                if (jsonobject1 == null)
                {
                    continue;
                }
                com.jiubang.goweather.a.c c1 = new com.jiubang.goweather.a.c();
                String s = jsonobject1.optString("weekDate");
                jsonobject = s;
                if (TextUtils.isEmpty(s))
                {
                    jsonobject = "--";
                }
                c1.b(jsonobject);
                s = jsonobject1.optString("status");
                jsonobject = s;
                if (TextUtils.isEmpty(s))
                {
                    jsonobject = "--";
                }
                c1.c(jsonobject);
                c1.b(jsonobject1.optInt("statusType", 1));
                c1.b((float)jsonobject1.optDouble("high", -10000D));
                c1.c((float)jsonobject1.optDouble("low", -10000D));
                s = jsonobject1.optString("windDir");
                jsonobject = s;
                if (TextUtils.isEmpty(s))
                {
                    jsonobject = "--";
                }
                c1.a(jsonobject);
                c1.a(jsonobject1.optInt("windDirType", 1));
                c1.a((float)jsonobject1.optDouble("windForceInt", -10000D));
                c1.c(jsonobject1.optInt("pop", -10000));
                s = jsonobject1.optString("statusDay");
                jsonobject = s;
                if (TextUtils.isEmpty(s))
                {
                    jsonobject = "--";
                }
                c1.d(jsonobject);
                s = jsonobject1.optString("statusNight");
                jsonobject = s;
                if (TextUtils.isEmpty(s))
                {
                    jsonobject = "--";
                }
                c1.e(jsonobject);
                s = jsonobject1.optString("date");
                jsonobject = s;
                if (TextUtils.isEmpty(s))
                {
                    jsonobject = "--";
                }
                c1.f(jsonobject);
                a1.h.add(c1);
            }

        }
    }

    private void k(JSONObject jsonobject, com.jiubang.goweather.a.a a1)
    {
        JSONArray jsonarray = jsonobject.optJSONArray("hourlies");
        if (jsonarray != null)
        {
            int i1 = jsonarray.length();
            for (int l = 0; l < i1; l++)
            {
                JSONObject jsonobject1 = jsonarray.optJSONObject(l);
                if (jsonobject1 == null)
                {
                    continue;
                }
                d d1 = new d();
                String s = jsonobject1.optString("date");
                jsonobject = s;
                if (TextUtils.isEmpty(s))
                {
                    jsonobject = "--";
                }
                d1.a(jsonobject);
                d1.b(jsonobject1.optInt("hour", -10000));
                d1.b((float)jsonobject1.optDouble("temp", -10000D));
                d1.e(jsonobject1.optInt("pop", -10000));
                d1.c(jsonobject1.optInt("humidity", -10000));
                s = jsonobject1.optString("windDir");
                jsonobject = s;
                if (TextUtils.isEmpty(s))
                {
                    jsonobject = "--";
                }
                d1.b(jsonobject);
                d1.a(jsonobject1.optInt("windDirType", 1));
                d1.a((float)jsonobject1.optDouble("windForeInt", -10000D));
                s = jsonobject1.optString("status");
                jsonobject = s;
                if (TextUtils.isEmpty(s))
                {
                    jsonobject = "--";
                }
                d1.c(jsonobject);
                d1.d(jsonobject1.optInt("statusType", 1));
                a1.i.add(d1);
            }

        }
    }

    public void a(String s, f f1, String s1, Context context)
    {
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        if (!a(s)) goto _L4; else goto _L3
_L3:
        s = new JSONArray(s);
        f1.b(1);
_L7:
        int l;
        int i1;
        i1 = a.size();
        l = 0;
_L6:
        com.jiubang.goweather.a.a a1;
        if (l >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = (com.jiubang.goweather.a.a)a.get(l);
        s1 = null;
        context = s.getJSONObject(l);
        s1 = context;
_L8:
        if (s1 != null)
        {
            context = s1.optJSONObject("head");
            if (context != null)
            {
                f1.e(context.optInt("costTime", 0));
            }
            b(s1, a1);
        }
        l++;
        if (true) goto _L6; else goto _L5
        s1;
        s = null;
_L17:
        if (p.a(context).equalsIgnoreCase("de"))
        {
            Intent intent = new Intent(context, com/gau/go/launcherex/gowidget/weather/service/NotifyService);
            intent.putExtra("notify_request", 38);
            intent.putExtra("request_extra_runtime_crash_title", "\u5929\u6C14\u63A5\u53E3Json\u89E3\u6790\u9519\u8BEF");
            intent.putExtra("request_extra_runtime_crash_text", w.a(s1, "#"));
            context.startService(intent);
        }
        f1.a(s1);
        f1.b(11);
        f1.c(10);
          goto _L7
        context;
        f1.a(context);
          goto _L8
_L4:
        s = new JSONObject(s);
        f1.b(1);
_L13:
        if (s != null)
        {
            s1 = s.optJSONObject("head");
            if (s1 != null)
            {
                f1.e(s1.optInt("costTime", 0));
            }
            b(s, (com.jiubang.goweather.a.a)a.get(0));
            f1.b(((com.jiubang.goweather.a.a)a.get(0)).x());
        }
_L5:
        if (f1.c() != 1) goto _L10; else goto _L9
_L9:
        s = a.iterator();
        l = 1;
        do
        {
            do
            {
                if (!s.hasNext())
                {
                    break MISSING_BLOCK_LABEL_557;
                }
                s1 = (com.jiubang.goweather.a.a)s.next();
            } while (s1.x() == 2);
            l = 0;
            i1 = 0;
        } while (s1.x() != 1);
        f1.b(1);
        boolean flag = true;
        l = i1;
        i1 = ((flag) ? 1 : 0);
_L18:
        if (!l) goto _L12; else goto _L11
_L11:
        f1.b(2);
_L2:
        return;
        s1;
        s = null;
_L16:
        if (p.a(context).equalsIgnoreCase("de"))
        {
            Intent intent1 = new Intent(context, com/gau/go/launcherex/gowidget/weather/service/NotifyService);
            intent1.putExtra("notify_request", 38);
            intent1.putExtra("request_extra_runtime_crash_title", "\u5929\u6C14\u63A5\u53E3Json\u89E3\u6790\u9519\u8BEF");
            intent1.putExtra("request_extra_runtime_crash_text", w.a(s1, "#"));
            context.startService(intent1);
        }
        f1.a(s1);
        f1.b(11);
        f1.c(10);
          goto _L13
_L12:
        if (i1) goto _L2; else goto _L14
_L14:
        f1.b(11);
        f1.c(0);
        return;
_L10:
        if (f1.c() == -1)
        {
            f1.b(11);
            f1.c(-1);
            return;
        }
        if (f1.c() != 0) goto _L2; else goto _L15
_L15:
        f1.b(11);
        f1.c(0);
        return;
        s1;
          goto _L16
        s1;
          goto _L17
        i1 = 0;
          goto _L18
    }

    public void a(JSONObject jsonobject, com.jiubang.goweather.a.a a1)
    {
        JSONArray jsonarray = jsonobject.optJSONArray("alarms");
        if (jsonarray != null)
        {
            int i1 = jsonarray.length();
            int l = 0;
            while (l < i1) 
            {
                JSONObject jsonobject1 = jsonarray.optJSONObject(l);
                if (jsonobject1 != null)
                {
                    b b1 = new b();
                    b1.b(jsonobject1.optInt("alert_id", -10000));
                    if (b1.i() != -10000)
                    {
                        b1.g(a1.e());
                        jsonobject = jsonobject1.optString("publish_time");
                        if (!TextUtils.isEmpty(jsonobject))
                        {
                            b1.a(jsonobject);
                            String s = jsonobject1.optString("exp_time");
                            if (!TextUtils.isEmpty(s))
                            {
                                jsonobject = s;
                                if (TextUtils.isEmpty(s))
                                {
                                    jsonobject = "--";
                                }
                                b1.b(jsonobject);
                                s = jsonobject1.optString("type");
                                jsonobject = s;
                                if (TextUtils.isEmpty(s))
                                {
                                    jsonobject = "--";
                                }
                                b1.c(jsonobject);
                                s = jsonobject1.optString("description");
                                jsonobject = s;
                                if (TextUtils.isEmpty(s))
                                {
                                    jsonobject = "--";
                                }
                                b1.d(jsonobject);
                                s = jsonobject1.optString("phenomena");
                                jsonobject = s;
                                if (TextUtils.isEmpty(s))
                                {
                                    jsonobject = "--";
                                }
                                b1.e(jsonobject);
                                b1.a(jsonobject1.optInt("level", -10000));
                                s = jsonobject1.optString("level_str");
                                jsonobject = s;
                                if (TextUtils.isEmpty(s))
                                {
                                    jsonobject = "--";
                                }
                                b1.h(jsonobject);
                                s = jsonobject1.optString("message");
                                boolean flag = jsonobject1.optBoolean("isNotify");
                                b1.a(flag);
                                com.gtp.a.a.b.c.a("extreme_weather", (new StringBuilder()).append("RemoteInfoParser isNotify: ").append(flag).toString());
                                if (!TextUtils.isEmpty(s))
                                {
                                    jsonobject = s;
                                    if (TextUtils.isEmpty(s))
                                    {
                                        jsonobject = "--";
                                    }
                                    b1.f(jsonobject);
                                    b1.c(a1.u());
                                    a1.k.add(b1);
                                    com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u5237\u65B0\u5929\u6C14\u83B7\u53D6\u9884\u8B66\uFF1A ").append(b1.toString()).toString(), "gcm_extreme_log.txt");
                                }
                            }
                        }
                    }
                }
                l++;
            }
        }
    }
}
