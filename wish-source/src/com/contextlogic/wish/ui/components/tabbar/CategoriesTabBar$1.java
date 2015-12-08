// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.tabbar;

import android.view.View;

// Referenced classes of package com.contextlogic.wish.ui.components.tabbar:
//            CategoriesTabBar, CategoriesTabBarTabSpec, CategoriesTabBarTab

class Spec
    implements android.view.r
{

    final CategoriesTabBar this$0;
    final CategoriesTabBarTabSpec val$tab;
    final CategoriesTabBarTab val$tabView;

    public void onClick(View view)
    {
        if (!view.isSelected())
        {
            CategoriesTabBar.access$000(CategoriesTabBar.this, val$tabView, val$tab);
        }
    }

    Spec()
    {
        this$0 = final_categoriestabbar;
        val$tabView = categoriestabbartab;
        val$tab = CategoriesTabBarTabSpec.this;
        super();
    }
}
