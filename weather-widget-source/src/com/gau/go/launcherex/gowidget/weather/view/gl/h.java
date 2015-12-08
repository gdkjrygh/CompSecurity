// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.gl;

import android.os.Handler;
import android.os.Message;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.scroller.GLWidgetScrollGroup;
import com.gau.go.launcherex.gowidget.weather.util.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view.gl:
//            GLWeatherWidget41Style2, GLWeather41Style2

class h extends Handler
{

    final GLWeatherWidget41Style2 a;

    h(GLWeatherWidget41Style2 glweatherwidget41style2)
    {
        a = glweatherwidget41style2;
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
        GLWeather41Style2 glweather41style2_1;
        Iterator iterator2;
        if (message.obj != null)
        {
            message = (List)message.obj;
        } else
        {
            message = new ArrayList();
        }
        iterator = GLWeatherWidget41Style2.access$500(a).getCitys().iterator();
_L11:
        if (!iterator.hasNext()) goto _L1; else goto _L10
_L10:
        glweather41style2_1 = (GLWeather41Style2)iterator.next();
        iterator2 = message.iterator();
        do
        {
            if (!iterator2.hasNext())
            {
                break MISSING_BLOCK_LABEL_828;
            }
            obj = (WeatherBean)iterator2.next();
        } while (!((WeatherBean) (obj)).c().equals(glweather41style2_1.getCityId()));
_L12:
        if (obj != null)
        {
            glweather41style2_1.setWeatherBean(((WeatherBean) (obj)));
            glweather41style2_1.mAnimationWeatherIcon = true;
            glweather41style2_1.updateAllViews();
        }
        glweather41style2_1.showProgerssView(false);
          goto _L11
_L3:
        message = message.getData();
        if (message != null)
        {
            GLWeatherWidget41Style2.access$2400(a, message);
            return;
        }
          goto _L1
_L4:
        e.a(message.arg1, message.arg2, GLWeatherWidget41Style2.access$500(a));
        GLWeatherWidget41Style2.access$500(a).notifyViewsChanged();
        GLWeatherWidget41Style2.access$2500(a);
        return;
_L5:
        message = (WeatherBean)message.obj;
        if (message != null)
        {
            GLWeatherWidget41Style2.access$2600(a);
            message = GLWeatherWidget41Style2.access$2700(a, message);
            GLWeatherWidget41Style2.access$500(a).setCurScreen(GLWeatherWidget41Style2.access$500(a).indexOfChild(message));
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
                Iterator iterator1 = GLWeatherWidget41Style2.access$500(a).getCitys().iterator();
                GLWeather41Style2 glweather41style2_2;
                String s2;
                do
                {
                    if (!iterator1.hasNext())
                    {
                        continue label0;
                    }
                    glweather41style2_2 = (GLWeather41Style2)iterator1.next();
                    s2 = glweather41style2_2.getCityId();
                } while (!s.equals(s2));
                if (s2.equals(GLWeatherWidget41Style2.access$2800(a)))
                {
                    flag = true;
                }
                message.add(glweather41style2_2);
            } while (true);
            obj = (GLWeather41Style2)GLWeatherWidget41Style2.access$500(a).getChildAt(GLWeatherWidget41Style2.access$2900(a));
            GLWeather41Style2 glweather41style2;
            for (message = message.iterator(); message.hasNext(); GLWeatherWidget41Style2.access$500(a).removeView(glweather41style2))
            {
                glweather41style2 = (GLWeather41Style2)message.next();
            }

            GLWeatherWidget41Style2.access$500(a).notifyViewsChanged();
            if (flag)
            {
                GLWeatherWidget41Style2.access$500(a).setCurScreen(0);
                return;
            }
            GLWeatherWidget41Style2.access$2902(a, GLWeatherWidget41Style2.access$500(a).indexOfChild(((com.go.gl.view.GLView) (obj))));
            if (GLWeatherWidget41Style2.access$2900(a) == -1)
            {
                GLWeatherWidget41Style2.access$2902(a, 0);
            }
            GLWeatherWidget41Style2.access$500(a).setCurScreen(GLWeatherWidget41Style2.access$2900(a));
            return;
        }
          goto _L1
_L7:
        WeatherBean weatherbean = (WeatherBean)message.obj;
        if (weatherbean != null)
        {
            String s1 = weatherbean.c();
            Iterator iterator3 = GLWeatherWidget41Style2.access$500(a).getCitys().iterator();
            message = null;
            do
            {
                if (!iterator3.hasNext())
                {
                    break;
                }
                obj = (GLWeather41Style2)iterator3.next();
                if (obj != null && ((GLWeather41Style2) (obj)).getCityId() != null)
                {
                    if (((GLWeather41Style2) (obj)).getCityId().equals(s1))
                    {
                        message = ((Message) (obj));
                    } else
                    {
                        int i = ((GLWeather41Style2) (obj)).getWeatherBean().e();
                        if (i == 2)
                        {
                            GLWeatherWidget41Style2.access$500(a).removeView(((com.go.gl.view.GLView) (obj)));
                            GLWeatherWidget41Style2.access$500(a).notifyViewsChanged();
                        } else
                        if (i == 3)
                        {
                            ((GLWeather41Style2) (obj)).getWeatherBean().a(1);
                        }
                    }
                }
            } while (true);
            int j;
            if (message != null)
            {
                message.getWeatherBean().a(3);
                j = GLWeatherWidget41Style2.access$500(a).indexOfChild(message);
            } else
            {
                message = GLWeatherWidget41Style2.access$2700(a, weatherbean);
                GLWeatherWidget41Style2.access$500(a).notifyViewsChanged();
                j = GLWeatherWidget41Style2.access$500(a).indexOfChild(message);
            }
            if (j != -1)
            {
                GLWeatherWidget41Style2.access$500(a).setCurScreen(j);
                return;
            }
        }
          goto _L1
_L8:
        a.onBillingStatusChange(((Boolean)message.obj).booleanValue());
        return;
_L9:
        GLWeatherWidget41Style2.access$3000(a, ((Boolean)message.obj).booleanValue());
        return;
        obj = null;
          goto _L12
    }
}
