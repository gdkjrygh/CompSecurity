// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.widget.dynamicicon;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public abstract class f
{

    protected Context a;

    public f(Context context)
    {
        a = context;
    }

    public abstract void a(Canvas canvas, View view);

    public abstract void a(View view);

    public abstract boolean a();
}
