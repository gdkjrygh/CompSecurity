// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.go.weatherex.themestore:
//            WidgetApplyThemeGuideActivity

class ao
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final WidgetApplyThemeGuideActivity a;

    ao(WidgetApplyThemeGuideActivity widgetapplythemeguideactivity)
    {
        a = widgetapplythemeguideactivity;
        super();
    }

    public void onGlobalLayout()
    {
        WidgetApplyThemeGuideActivity.a(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        WidgetApplyThemeGuideActivity.b(a);
    }
}
