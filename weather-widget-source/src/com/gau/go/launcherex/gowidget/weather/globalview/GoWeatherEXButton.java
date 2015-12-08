// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.gau.go.launcherex.gowidget.language.e;

public class GoWeatherEXButton extends Button
{

    public GoWeatherEXButton(Context context)
    {
        super(context);
    }

    public GoWeatherEXButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e.a(context).a(this, attributeset);
    }

    public GoWeatherEXButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        e.a(context).a(this, attributeset);
    }
}
