// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.app.Activity;
import android.view.View;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AdvancedRecommendVIPBaseView

class f
    implements android.view.View.OnClickListener
{

    final AdvancedRecommendVIPBaseView a;

    f(AdvancedRecommendVIPBaseView advancedrecommendvipbaseview)
    {
        a = advancedrecommendvipbaseview;
        super();
    }

    public void onClick(View view)
    {
        if (AdvancedRecommendVIPBaseView.a(a) != null)
        {
            AdvancedRecommendVIPBaseView.a(a).finish();
        }
    }
}
