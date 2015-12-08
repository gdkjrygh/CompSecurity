// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import com.gau.go.launcherex.gowidget.language.e;

public class GoWeatherEXEditText extends EditText
{

    public GoWeatherEXEditText(Context context)
    {
        super(context);
    }

    public GoWeatherEXEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e.a(context).a(this, attributeset);
    }

    public GoWeatherEXEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        e.a(context).a(this, attributeset);
    }
}
