// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.util;

import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.scroller.GLWidgetScrollGroup;
import com.gau.go.launcherex.gowidget.weather.scroller.WidgetScrollGroup;
import java.util.List;

public class e
{

    public static GLWidgetScrollGroup a(int i, int j, GLWidgetScrollGroup glwidgetscrollgroup)
    {
        int k = 0;
        if (glwidgetscrollgroup != null)
        {
            k = glwidgetscrollgroup.getChildCount();
        }
        if (k > 1 && i != j && i >= 0 && i < k && j >= 0 && j < k)
        {
            com.go.gl.view.GLView glview = glwidgetscrollgroup.getChildAt(i);
            glwidgetscrollgroup.removeView(glview);
            glwidgetscrollgroup.addView(glview, j);
            return glwidgetscrollgroup;
        } else
        {
            return null;
        }
    }

    public static WidgetScrollGroup a(int i, int j, WidgetScrollGroup widgetscrollgroup)
    {
        int k = 0;
        if (widgetscrollgroup != null)
        {
            k = widgetscrollgroup.getChildCount();
        }
        if (k > 1 && i != j && i >= 0 && i < k && j >= 0 && j < k)
        {
            android.view.View view = widgetscrollgroup.getChildAt(i);
            widgetscrollgroup.removeView(view);
            widgetscrollgroup.addView(view, j);
            return widgetscrollgroup;
        } else
        {
            return null;
        }
    }

    public static boolean a(int i, int j, List list)
    {
        boolean flag1 = false;
        int k;
        boolean flag;
        if (list != null)
        {
            k = list.size();
        } else
        {
            k = 0;
        }
        flag = flag1;
        if (k > 1)
        {
            flag = flag1;
            if (i != j)
            {
                flag = flag1;
                if (i >= 0)
                {
                    flag = flag1;
                    if (i < k)
                    {
                        flag = flag1;
                        if (j >= 0)
                        {
                            flag = flag1;
                            if (j < k)
                            {
                                WeatherBean weatherbean = (WeatherBean)list.get(i);
                                if (i < j)
                                {
                                    for (k = i + 1; k < j + 1; k++)
                                    {
                                        ((WeatherBean)list.get(k)).e(k - 1);
                                    }

                                } else
                                if (i > j)
                                {
                                    for (k = j; k < i; k++)
                                    {
                                        ((WeatherBean)list.get(k)).e(k + 1);
                                    }

                                }
                                weatherbean.e(j);
                                list.add(j, (WeatherBean)list.remove(i));
                                flag = true;
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }
}
