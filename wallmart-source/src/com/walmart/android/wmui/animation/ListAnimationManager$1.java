// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui.animation;

import android.widget.AbsListView;

// Referenced classes of package com.walmart.android.wmui.animation:
//            ListAnimationManager

class this._cls0
    implements android.widget.tener
{

    final ListAnimationManager this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (ListAnimationManager.access$100(ListAnimationManager.this) != null)
        {
            ListAnimationManager.access$100(ListAnimationManager.this).onScroll(abslistview, i, j, k);
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        boolean flag = true;
        ListAnimationManager listanimationmanager = ListAnimationManager.this;
        if (i == 1)
        {
            flag = false;
        }
        ListAnimationManager.access$002(listanimationmanager, flag);
        if (ListAnimationManager.access$100(ListAnimationManager.this) != null)
        {
            ListAnimationManager.access$100(ListAnimationManager.this).onScrollStateChanged(abslistview, i);
        }
    }

    ()
    {
        this$0 = ListAnimationManager.this;
        super();
    }
}
