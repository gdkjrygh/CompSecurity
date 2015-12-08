// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.gl;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.e.h;
import com.gau.go.launcherex.gowidget.weather.model.WidgetSettingBean;
import java.lang.ref.WeakReference;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view.gl:
//            GLWeatherWidget41Style2

class g extends Handler
{

    private final WeakReference a;

    public g(GLWeatherWidget41Style2 glweatherwidget41style2)
    {
        a = new WeakReference(glweatherwidget41style2);
    }

    public void handleMessage(Message message)
    {
        GLWeatherWidget41Style2 glweatherwidget41style2 = (GLWeatherWidget41Style2)a.get();
        if (glweatherwidget41style2 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            glweatherwidget41style2.mIsPro = true;
            glweatherwidget41style2.mSettings.h = true;
            GLWeatherWidget41Style2.access$800(glweatherwidget41style2).a(true);
            GLWeatherWidget41Style2.access$1100(glweatherwidget41style2);
            return;

        case 2: // '\002'
            glweatherwidget41style2.mSettings.h = ((Boolean)message.obj).booleanValue();
            if (!glweatherwidget41style2.mSettings.h || glweatherwidget41style2.mIsPro)
            {
                GLWeatherWidget41Style2.access$800(glweatherwidget41style2).a(glweatherwidget41style2.mSettings.h);
                GLWeatherWidget41Style2.access$1100(glweatherwidget41style2);
                return;
            }
            break;

        case 3: // '\003'
            message = (String)message.obj;
            if (!TextUtils.isEmpty(GLWeatherWidget41Style2.access$1900(glweatherwidget41style2)) && h.a(glweatherwidget41style2.getContext(), GLWeatherWidget41Style2.access$200(glweatherwidget41style2), GLWeatherWidget41Style2.access$1900(glweatherwidget41style2)))
            {
                if (GLWeatherWidget41Style2.access$1900(glweatherwidget41style2).equals("app_widget_theme_white"))
                {
                    GLWeatherWidget41Style2.access$1902(glweatherwidget41style2, glweatherwidget41style2.getContext().getPackageName());
                    GLWeatherWidget41Style2.access$2002(glweatherwidget41style2, 0);
                } else
                if (message.equals("app_widget_theme_black"))
                {
                    GLWeatherWidget41Style2.access$1902(glweatherwidget41style2, glweatherwidget41style2.getContext().getPackageName());
                    GLWeatherWidget41Style2.access$2002(glweatherwidget41style2, 0);
                } else
                {
                    GLWeatherWidget41Style2.access$1902(glweatherwidget41style2, message);
                    GLWeatherWidget41Style2.access$2002(glweatherwidget41style2, 0);
                }
                GLWeatherWidget41Style2.access$2100(glweatherwidget41style2, GLWeatherWidget41Style2.access$1900(glweatherwidget41style2));
                return;
            }
            break;

        case 4: // '\004'
            GLWeatherWidget41Style2.access$2200(glweatherwidget41style2);
            return;

        case 5: // '\005'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
