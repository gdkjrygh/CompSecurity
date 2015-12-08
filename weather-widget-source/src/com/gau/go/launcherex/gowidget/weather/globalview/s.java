// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globalview:
//            f

public class s extends f
{

    private ViewGroup b;
    private TextView c;
    private int d;

    public s(Activity activity)
    {
        super(activity);
        setContentView(0x7f030060);
        activity = a.getResources().getDisplayMetrics();
        d = (int)((float)Math.min(((DisplayMetrics) (activity)).widthPixels, ((DisplayMetrics) (activity)).heightPixels) - ((DisplayMetrics) (activity)).density * 40F);
        activity = getWindow().getAttributes();
        activity.width = -2;
        activity.height = -2;
        b = (ViewGroup)findViewById(0x7f0901a9);
        c = (TextView)findViewById(0x7f090265);
    }

    public void a(int i)
    {
        b.setBackgroundResource(i);
    }

    public void a(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            c.setVisibility(8);
            return;
        } else
        {
            c.setVisibility(0);
            c.setText(s1);
            return;
        }
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            getWindow().getAttributes().dimAmount = 1.0F;
            return;
        } else
        {
            getWindow().getAttributes().dimAmount = 0.0F;
            return;
        }
    }
}
