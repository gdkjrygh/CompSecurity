// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.list.horizontal;

import android.content.Context;
import android.widget.FrameLayout;

// Referenced classes of package com.contextlogic.wish.ui.components.list.horizontal:
//            HorizontalListView

class this._cls0 extends FrameLayout
{

    final HorizontalListView this$0;

    public void requestLayout()
    {
        if (!HorizontalListView.access$000(HorizontalListView.this))
        {
            super.requestLayout();
        }
    }

    (Context context)
    {
        this$0 = HorizontalListView.this;
        super(context);
    }
}
