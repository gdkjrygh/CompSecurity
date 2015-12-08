// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedRenameBucketView

class this._cls0
    implements TextWatcher
{

    final ProductFeedRenameBucketView this$0;

    public void afterTextChanged(Editable editable)
    {
        if (editable != null)
        {
            editable = editable.toString().trim();
            if (editable.length() > 0)
            {
                ProductFeedRenameBucketView.access$400(ProductFeedRenameBucketView.this, editable);
                return;
            } else
            {
                ProductFeedRenameBucketView.access$100(ProductFeedRenameBucketView.this);
                return;
            }
        } else
        {
            ProductFeedRenameBucketView.access$100(ProductFeedRenameBucketView.this);
            return;
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    Q()
    {
        this$0 = ProductFeedRenameBucketView.this;
        super();
    }
}
