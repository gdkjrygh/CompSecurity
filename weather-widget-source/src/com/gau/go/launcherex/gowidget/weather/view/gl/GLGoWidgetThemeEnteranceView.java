// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.gl;

import android.content.Context;
import com.gau.go.launcherex.gowidget.weather.view.bl;
import com.go.gl.widget.GLTextView;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view.gl:
//            GLWidgetChildView, a

public class GLGoWidgetThemeEnteranceView extends GLWidgetChildView
{

    private GLTextView a;

    public GLGoWidgetThemeEnteranceView(Context context)
    {
        super(context, bl.b);
        a = (GLTextView)findViewById(0x7f09058d);
        setOnClickListener(new a(this));
    }

    public int getContentViewLayoutId()
    {
        return 0x7f030134;
    }

    public GLTextView getTipView()
    {
        return a;
    }

}
