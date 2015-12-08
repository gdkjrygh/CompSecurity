// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.walmart.android.wmui.ScrollDirectionListener;

// Referenced classes of package com.walmart.android.app.shop:
//            InStoreListPresenter

class it> extends ScrollDirectionListener
{

    final InStoreListPresenter this$0;
    final int val$offset;

    public void onScrollDirectionChanged(int i)
    {
        if (hasScrollableContent()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (i)
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 0: // '\0'
            break;
        }
        break MISSING_BLOCK_LABEL_93;
_L4:
        if (InStoreListPresenter.access$900(InStoreListPresenter.this) != null)
        {
            InStoreListPresenter.access$900(InStoreListPresenter.this).onScrollDirectionChanged(i);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        float f = InStoreListPresenter.access$700(InStoreListPresenter.this).getHeight() - val$offset;
        InStoreListPresenter.access$800(InStoreListPresenter.this).animate().y(f);
          goto _L4
        float f1 = InStoreListPresenter.access$700(InStoreListPresenter.this).getHeight();
        InStoreListPresenter.access$800(InStoreListPresenter.this).animate().y(f1);
          goto _L4
    }

    _cls9(int i)
    {
        this$0 = final_instorelistpresenter;
        val$offset = i;
        super(Context.this);
    }
}
