// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.os.Handler;
import android.os.Message;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.scroller.WidgetScrollGroup;
import com.gau.go.launcherex.gowidget.weather.util.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            WeatherWidget41Style2, ay

class bj extends Handler
{

    final WeatherWidget41Style2 a;

    bj(WeatherWidget41Style2 weatherwidget41style2)
    {
        a = weatherwidget41style2;
        super();
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 8: default 52
    //                   1 53
    //                   2 187
    //                   3 205
    //                   4 242
    //                   5 292
    //                   6 570
    //                   7 789
    //                   8 807;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        return;
_L2:
        Object obj;
        Iterator iterator;
        ay ay2;
        Iterator iterator2;
        if (message.obj != null)
        {
            message = (List)message.obj;
        } else
        {
            message = new ArrayList();
        }
        iterator = a.mWidgetScrollGroup.b().iterator();
_L11:
        if (!iterator.hasNext()) goto _L1; else goto _L10
_L10:
        ay2 = (ay)iterator.next();
        iterator2 = message.iterator();
        do
        {
            if (!iterator2.hasNext())
            {
                break MISSING_BLOCK_LABEL_828;
            }
            obj = (WeatherBean)iterator2.next();
        } while (!((WeatherBean) (obj)).c().equals(ay2.c()));
_L12:
        if (obj != null)
        {
            ay2.a(((WeatherBean) (obj)));
            ay2.a = true;
            ay2.e();
        }
        ay2.a(false);
          goto _L11
_L3:
        message = message.getData();
        if (message != null)
        {
            WeatherWidget41Style2.a(a, message);
            return;
        }
          goto _L1
_L4:
        e.a(message.arg1, message.arg2, a.mWidgetScrollGroup);
        a.mWidgetScrollGroup.a();
        WeatherWidget41Style2.q(a);
        return;
_L5:
        message = (WeatherBean)message.obj;
        if (message != null)
        {
            WeatherWidget41Style2.r(a);
            message = WeatherWidget41Style2.a(a, message);
            a.mWidgetScrollGroup.a(a.mWidgetScrollGroup.indexOfChild(message));
            return;
        }
          goto _L1
_L6:
        obj = (ArrayList)message.obj;
        if (obj != null && !((ArrayList) (obj)).isEmpty())
        {
            message = new ArrayList();
            obj = ((ArrayList) (obj)).iterator();
            boolean flag = false;
label0:
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                String s = (String)((Iterator) (obj)).next();
                Iterator iterator1 = a.mWidgetScrollGroup.b().iterator();
                ay ay3;
                String s2;
                do
                {
                    if (!iterator1.hasNext())
                    {
                        continue label0;
                    }
                    ay3 = (ay)iterator1.next();
                    s2 = ay3.c();
                } while (!s.equals(s2));
                if (s2.equals(WeatherWidget41Style2.s(a)))
                {
                    flag = true;
                }
                message.add(ay3);
            } while (true);
            obj = (ay)a.mWidgetScrollGroup.getChildAt(WeatherWidget41Style2.t(a));
            ay ay1;
            for (message = message.iterator(); message.hasNext(); a.mWidgetScrollGroup.removeView(ay1))
            {
                ay1 = (ay)message.next();
            }

            a.mWidgetScrollGroup.a();
            if (flag)
            {
                a.mWidgetScrollGroup.a(0);
                return;
            }
            WeatherWidget41Style2.b(a, a.mWidgetScrollGroup.indexOfChild(((android.view.View) (obj))));
            if (WeatherWidget41Style2.t(a) == -1)
            {
                WeatherWidget41Style2.b(a, 0);
            }
            a.mWidgetScrollGroup.a(WeatherWidget41Style2.t(a));
            return;
        }
          goto _L1
_L7:
        WeatherBean weatherbean = (WeatherBean)message.obj;
        if (weatherbean != null)
        {
            String s1 = weatherbean.c();
            Iterator iterator3 = a.mWidgetScrollGroup.b().iterator();
            message = null;
            do
            {
                if (!iterator3.hasNext())
                {
                    break;
                }
                obj = (ay)iterator3.next();
                if (obj != null && ((ay) (obj)).c() != null)
                {
                    if (((ay) (obj)).c().equals(s1))
                    {
                        message = ((Message) (obj));
                    } else
                    {
                        int i = ((ay) (obj)).b().e();
                        if (i == 2)
                        {
                            a.mWidgetScrollGroup.removeView(((android.view.View) (obj)));
                            a.mWidgetScrollGroup.a();
                        } else
                        if (i == 3)
                        {
                            ((ay) (obj)).b().a(1);
                        }
                    }
                }
            } while (true);
            int j;
            if (message != null)
            {
                message.b().a(3);
                j = a.mWidgetScrollGroup.indexOfChild(message);
            } else
            {
                message = WeatherWidget41Style2.a(a, weatherbean);
                a.mWidgetScrollGroup.a();
                j = a.mWidgetScrollGroup.indexOfChild(message);
            }
            if (j != -1)
            {
                a.mWidgetScrollGroup.a(j);
                return;
            }
        }
          goto _L1
_L8:
        a.onBillingStatusChange(((Boolean)message.obj).booleanValue());
        return;
_L9:
        com.gau.go.launcherex.gowidget.weather.view.WeatherWidget41Style2.e(a, ((Boolean)message.obj).booleanValue());
        return;
        obj = null;
          goto _L12
    }
}
