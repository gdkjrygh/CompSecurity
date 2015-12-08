// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedMoveToBucketView

class this._cls0
    implements android.widget.r
{

    final ProductFeedMoveToBucketView this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            ProductFeedMoveToBucketView.access$200(ProductFeedMoveToBucketView.this);
            return true;
        } else
        {
            return false;
        }
    }

    Q()
    {
        this$0 = ProductFeedMoveToBucketView.this;
        super();
    }
}
