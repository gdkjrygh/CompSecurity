// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.View;

// Referenced classes of package com.walmart.android.app.item:
//            BundlesShelfAdapter

class ption
    implements android.view.sShelfAdapter._cls2
{

    final BundlesShelfAdapter this$0;
    final boolean val$isOptionalGroup;
    final com.walmart.android.service.item.n val$option;

    public void onClick(View view)
    {
        if (BundlesShelfAdapter.access$000(BundlesShelfAdapter.this) != null && !val$isOptionalGroup)
        {
            BundlesShelfAdapter.access$000(BundlesShelfAdapter.this).onCheckItem(val$option);
        }
    }

    ption()
    {
        this$0 = final_bundlesshelfadapter;
        val$isOptionalGroup = flag;
        val$option = com.walmart.android.service.item.n.this;
        super();
    }
}
