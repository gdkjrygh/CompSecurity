// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.a.a;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gau.go.launcherex.gowidget.weather.model.ExtremeCityIdBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.c;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            i

class j extends BroadcastReceiver
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
_L5:
        {
            do
            {
                do
                {
                    return;
                } while (com.gau.go.launcherex.gowidget.weather.b.i.a(a).t == 0 || !intent.getBooleanExtra("extra_extreme_notify", true));
                intent = intent.getParcelableArrayListExtra("extra_extreme_city_ids");
            } while (intent.size() <= 0);
            Object obj1 = new HashMap();
            context = com.gau.go.launcherex.gowidget.weather.b.i.a(a).F;
            Object obj;
            Object obj2;
            String s;
            c c1;
            int k;
            if (!TextUtils.isEmpty(context))
            {
                if (context.contains("#"))
                {
                    context = context.split("#");
                } else
                {
                    context = (new String[] {
                        context
                    });
                }
            } else
            {
                context = null;
            }
            obj2 = intent.iterator();
        }
        do
        {
            do
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                intent = (ExtremeCityIdBean)((Iterator) (obj2)).next();
                s = intent.a();
                obj = i.b(a).a(s);
            } while (obj == null);
            c1 = ((WeatherBean) (obj)).d(intent.b());
        } while (c1 == null || !c1.l());
        if (context == null || context.length <= 0)
        {
            break MISSING_BLOCK_LABEL_950;
        }
        k = 0;
_L3:
        if (k >= context.length)
        {
            break MISSING_BLOCK_LABEL_950;
        }
        if (!s.equals(context[k])) goto _L2; else goto _L1
_L1:
        k = 0;
_L6:
        if (k != 0)
        {
            obj = (ArrayList)com.gau.go.launcherex.gowidget.weather.b.i.c(a).get(s);
            intent = ((Intent) (obj));
            if (obj == null)
            {
                intent = new ArrayList();
            }
            com.gau.go.launcherex.gowidget.weather.b.i.c(a).put(s, intent);
            intent.add(c1);
            obj = (ArrayList)((HashMap) (obj1)).get(s);
            intent = ((Intent) (obj));
            if (obj == null)
            {
                intent = new ArrayList();
            }
            intent.add(c1);
            ((HashMap) (obj1)).put(s, intent);
        }
        break MISSING_BLOCK_LABEL_107;
_L2:
        k++;
          goto _L3
        if (((HashMap) (obj1)).isEmpty()) goto _L5; else goto _L4
_L4:
        context = a;
        if (com.gau.go.launcherex.gowidget.weather.b.i.a(a).z == 1)
        {
            flag1 = true;
        }
        com.gau.go.launcherex.gowidget.weather.b.i.a(context, ((HashMap) (obj1)), flag1);
        q.a(i.d(a)).a(new a(93, "news002"));
        return;
        boolean flag = false;
        boolean flag1 = false;
        context = intent.getAction();
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_UPDATE_EXTREME_WEATHER"))
        {
            break MISSING_BLOCK_LABEL_20;
        }
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_EXPIRED_EXTREME_WEATHER"))
        {
            break MISSING_BLOCK_LABEL_725;
        }
        if (!com.gau.go.launcherex.gowidget.weather.b.i.c(a).isEmpty() && !i.e(a).isEmpty())
        {
            context = intent.getParcelableArrayListExtra("extra_extreme_city_ids");
            if (context != null && !context.isEmpty())
            {
                intent = new HashMap();
                obj = context.iterator();
label0:
                do
                {
                    if (((Iterator) (obj)).hasNext())
                    {
                        obj2 = (ExtremeCityIdBean)((Iterator) (obj)).next();
                        if (obj2 == null)
                        {
                            continue;
                        }
                        obj1 = ((ExtremeCityIdBean) (obj2)).a();
                        if (obj2 != null)
                        {
                            context = (ArrayList)com.gau.go.launcherex.gowidget.weather.b.i.c(a).get(obj1);
                        } else
                        {
                            context = null;
                        }
                        if (context == null)
                        {
                            continue;
                        }
                        k = 0;
                        do
                        {
label1:
                            {
                                if (k < context.size())
                                {
                                    if (((c)context.get(k)).k() != ((ExtremeCityIdBean) (obj2)).b())
                                    {
                                        break label1;
                                    }
                                    context.remove(k);
                                }
                                context = (ArrayList)com.gau.go.launcherex.gowidget.weather.b.i.c(a).get(obj1);
                                if (context != null && !context.isEmpty())
                                {
                                    intent.put(obj1, com.gau.go.launcherex.gowidget.weather.b.i.c(a).get(obj1));
                                } else
                                {
                                    com.gau.go.launcherex.gowidget.weather.b.i.c(a).remove(obj1);
                                    com.gau.go.launcherex.gowidget.weather.b.i.a(a, ((Long)i.e(a).get(obj1)).longValue());
                                    i.e(a).remove(obj1);
                                }
                                continue label0;
                            }
                            k++;
                        } while (true);
                    }
                    if (!com.gau.go.launcherex.gowidget.weather.b.i.c(a).isEmpty() && !i.e(a).isEmpty())
                    {
                        com.gau.go.launcherex.gowidget.weather.b.i.a(a, intent, false);
                        return;
                    } else
                    {
                        a.b();
                        return;
                    }
                } while (true);
            }
        } else
        {
            a.b();
            a.a();
            return;
        }
          goto _L5
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CLEAR_EXTREME_WEATHER"))
        {
            a.a();
            a.b();
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION") && !com.gau.go.launcherex.gowidget.weather.b.i.c(a).isEmpty() && !i.e(a).isEmpty())
        {
            context = new ArrayList();
            intent = i.e(a).entrySet().iterator();
            do
            {
                k = ((flag) ? 1 : 0);
                if (!intent.hasNext())
                {
                    break;
                }
                obj = (String)((java.util.Map.Entry)intent.next()).getKey();
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    context.add(obj);
                }
            } while (true);
            while (k < context.size()) 
            {
                intent = (String)context.get(k);
                if (i.b(a).a(intent) == null)
                {
                    com.gau.go.launcherex.gowidget.weather.b.i.c(a).remove(intent);
                    com.gau.go.launcherex.gowidget.weather.b.i.a(a, ((Long)i.e(a).get(intent)).longValue());
                    i.e(a).remove(intent);
                }
                k++;
            }
        }
          goto _L5
        k = 1;
          goto _L6
    }
}
