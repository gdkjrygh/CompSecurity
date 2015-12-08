// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.tabbar;

import android.view.View;

// Referenced classes of package com.contextlogic.wish.ui.components.tabbar:
//            HorizontalTabBar, HorizontalTabBarTabSpec, HorizontalTabBarTab

class Spec
    implements android.view.r
{

    final HorizontalTabBar this$0;
    final HorizontalTabBarTabSpec val$tab;
    final HorizontalTabBarTab val$tabView;

    public void onClick(View view)
    {
        if (!view.isSelected())
        {
            HorizontalTabBar.access$000(HorizontalTabBar.this, val$tabView, val$tab);
        }
    }

    Spec()
    {
        this$0 = final_horizontaltabbar;
        val$tabView = horizontaltabbartab;
        val$tab = HorizontalTabBarTabSpec.this;
        super();
    }
}
