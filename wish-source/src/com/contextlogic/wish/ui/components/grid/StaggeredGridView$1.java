// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.grid;

import android.content.Context;
import android.widget.FrameLayout;

// Referenced classes of package com.contextlogic.wish.ui.components.grid:
//            StaggeredGridView

class this._cls0 extends FrameLayout
{

    final StaggeredGridView this$0;

    public void requestLayout()
    {
        if (!StaggeredGridView.access$000(StaggeredGridView.this))
        {
            super.requestLayout();
        }
    }

    (Context context)
    {
        this$0 = StaggeredGridView.this;
        super(context);
    }
}
