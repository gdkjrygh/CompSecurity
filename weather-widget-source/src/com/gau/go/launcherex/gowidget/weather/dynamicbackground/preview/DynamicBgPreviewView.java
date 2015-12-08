// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.gau.go.launcherex.gowidget.weather.scroller.WeatherDetailScrollGroup;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview:
//            DynamicbgDescriptionView

public class DynamicBgPreviewView extends LinearLayout
{

    private Context a;
    private LayoutInflater b;
    private WeatherDetailScrollGroup c;

    public DynamicBgPreviewView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        b = null;
        c = null;
        a = context;
    }

    public WeatherDetailScrollGroup a()
    {
        return c;
    }

    public void a(int i)
    {
    }

    public void a(int i, int j)
    {
        DynamicbgDescriptionView dynamicbgdescriptionview = (DynamicbgDescriptionView)b.inflate(0x7f03006a, null);
        dynamicbgdescriptionview.a(i, j);
        c.addView(dynamicbgdescriptionview);
        c.a();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        b = LayoutInflater.from(a);
        c = (WeatherDetailScrollGroup)findViewById(0x7f09028e);
        c.setTag(Boolean.valueOf(false));
    }
}
