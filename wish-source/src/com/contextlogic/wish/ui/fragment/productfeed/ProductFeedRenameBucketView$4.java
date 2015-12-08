// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedRenameBucketView

class this._cls0
    implements android.widget.r
{

    final ProductFeedRenameBucketView this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            ProductFeedRenameBucketView.access$300(ProductFeedRenameBucketView.this);
            return true;
        } else
        {
            return false;
        }
    }

    Q()
    {
        this$0 = ProductFeedRenameBucketView.this;
        super();
    }
}
