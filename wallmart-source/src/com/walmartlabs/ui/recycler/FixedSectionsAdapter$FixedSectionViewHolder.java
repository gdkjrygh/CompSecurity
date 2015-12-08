// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            BasicViewHolder, FixedSectionsAdapter

private static class  extends BasicViewHolder
{

    public void setSectionView(View view)
    {
        ((FrameLayout)itemView).removeAllViews();
        ((FrameLayout)itemView).addView(view);
    }

    public (View view)
    {
        super(view);
        view.setLayoutParams(new android.view.tionViewHolder(-1, -1));
    }
}
