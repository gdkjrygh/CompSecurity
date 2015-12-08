// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.gl;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import com.go.gowidget.core.WidgetCallback;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view.gl:
//            GLBaseGoWidget

public class GLWeatherWidget42 extends GLBaseGoWidget
{

    public GLWeatherWidget42(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public int getVersion()
    {
        return 0;
    }

    protected int getWidgetType()
    {
        return 1;
    }

    public boolean onActivate(boolean flag, Bundle bundle)
    {
        return false;
    }

    public void onClearMemory()
    {
    }

    public boolean onDeactivate(boolean flag, Bundle bundle)
    {
        return false;
    }

    public void onDelete()
    {
        super.onDelete();
    }

    public void onEnter()
    {
        super.onEnter();
    }

    public void onLeave()
    {
    }

    public void onStop()
    {
    }

    public void setWidgetCallback(WidgetCallback widgetcallback)
    {
    }
}
