// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.view.View;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            AbsActionBarView, ScrollingTabContainerView, IcsLinearLayout

class <init>
    implements android.view.nerView.TabClickListener
{

    final ScrollingTabContainerView this$0;

    public void onClick(View view)
    {
        int j = AbsActionBarView.b;
        ((<init>)view).<init>().getTab();
        int k = ScrollingTabContainerView.access$200(ScrollingTabContainerView.this).getChildCount();
        int i = 0;
        do
        {
label0:
            {
                if (i < k)
                {
                    View view1 = ScrollingTabContainerView.access$200(ScrollingTabContainerView.this).getChildAt(i);
                    boolean flag;
                    if (view1 == view)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    view1.setSelected(flag);
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                return;
            }
            i++;
        } while (true);
    }

    private ()
    {
        this$0 = ScrollingTabContainerView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
