// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import android.content.res.Resources;
import com.go.weatherex.j.c.s;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            GoWidgetFrame

class p extends s
{

    final GoWidgetFrame a;

    p(GoWidgetFrame gowidgetframe)
    {
        a = gowidgetframe;
        super();
    }

    public void onLanguageChanged(Resources resources)
    {
        a.onLanguageChanged(resources);
    }
}
