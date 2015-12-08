// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfGridPresenter

protected class this._cls0 extends this._cls0
{

    final ShelfGridPresenter this$0;

    private String getHeaderForCount(int i)
    {
        if (i > 0)
        {
            if (mMode == 2)
            {
                return mActivity.getString(0x7f09055a, new Object[] {
                    Integer.valueOf(i), getTitleText()
                });
            }
            if (TextUtils.isEmpty(mSearchQuery))
            {
                return mActivity.getString(0x7f09055e, new Object[] {
                    Integer.valueOf(i), getTitleText()
                });
            } else
            {
                return mActivity.getString(0x7f09055d, new Object[] {
                    Integer.valueOf(i), mSearchQuery
                });
            }
        } else
        {
            return getTitleText();
        }
    }

    public void onBatchLoaded()
    {
        super.oaded();
        ShelfGridPresenter.access$000(ShelfGridPresenter.this);
    }

    public void onFirstBatchLoaded(int i)
    {
        super.atchLoaded(i);
        if (!isPopped())
        {
            ShelfGridPresenter.access$000(ShelfGridPresenter.this);
            ShelfGridPresenter.access$100(ShelfGridPresenter.this).setText(getHeaderForCount(i));
            if (mIsPushed)
            {
                ShelfGridPresenter.access$100(ShelfGridPresenter.this).setVisibility(0);
                ShelfGridPresenter.access$300(ShelfGridPresenter.this, ShelfGridPresenter.access$200(ShelfGridPresenter.this));
            }
        }
    }

    protected ()
    {
        this$0 = ShelfGridPresenter.this;
        super(ShelfGridPresenter.this);
    }
}
