// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.hourforecast;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.home.hourforecast:
//            TrendGraphs

public class ForecastHourTrend extends FrameLayout
{

    private TrendGraphs a;

    public ForecastHourTrend(Context context)
    {
        super(context);
        a(context);
    }

    public ForecastHourTrend(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    private void a(Context context)
    {
    }

    public void a()
    {
        a.a();
    }

    public void a(String s, boolean flag, ArrayList arraylist)
    {
        if (!arraylist.isEmpty())
        {
            a.a(s, arraylist, flag);
        }
        invalidate();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (TrendGraphs)findViewById(0x7f0902a0);
    }
}
