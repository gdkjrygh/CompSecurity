// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            ScrollingTabContainerView

final class aq
    implements android.view.View.OnClickListener
{

    final ScrollingTabContainerView a;

    private aq(ScrollingTabContainerView scrollingtabcontainerview)
    {
        a = scrollingtabcontainerview;
        super();
    }

    aq(ScrollingTabContainerView scrollingtabcontainerview, byte byte0)
    {
        this(scrollingtabcontainerview);
    }

    public final void onClick(View view)
    {
        ((ScrollingTabContainerView.TabView)view).a();
        int j = ScrollingTabContainerView.a(a).getChildCount();
        int i = 0;
        while (i < j) 
        {
            View view1 = ScrollingTabContainerView.a(a).getChildAt(i);
            boolean flag;
            if (view1 == view)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1.setSelected(flag);
            i++;
        }
    }
}
