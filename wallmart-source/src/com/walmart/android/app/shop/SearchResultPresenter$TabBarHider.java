// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.walmart.android.wmui.ScrollDirectionListener;

// Referenced classes of package com.walmart.android.app.shop:
//            SearchResultPresenter

private class this._cls0 extends ScrollDirectionListener
{

    final SearchResultPresenter this$0;

    public void onScrollDirectionChanged(int i)
    {
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            SearchResultPresenter.access$000(SearchResultPresenter.this).animate().y(0.0F);
            return;

        case 0: // '\0'
            SearchResultPresenter.access$000(SearchResultPresenter.this).animate().y(-SearchResultPresenter.access$100(SearchResultPresenter.this));
            return;
        }
    }

    public (Context context)
    {
        this$0 = SearchResultPresenter.this;
        super(context);
    }
}
