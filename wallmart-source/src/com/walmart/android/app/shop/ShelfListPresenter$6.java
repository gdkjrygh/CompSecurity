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
//            ShelfListPresenter

class init> extends ScrollDirectionListener
{

    final ShelfListPresenter this$0;
    final int val$offset;
    final View val$optionsFooter;

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
        break MISSING_BLOCK_LABEL_90;
_L4:
        if (ShelfListPresenter.access$500(ShelfListPresenter.this) != null)
        {
            ShelfListPresenter.access$500(ShelfListPresenter.this).onScrollDirectionChanged(i);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        float f = mListContainer.getHeight() - val$offset;
        val$optionsFooter.animate().y(f);
          goto _L4
        float f1 = mListContainer.getHeight();
        val$optionsFooter.animate().y(f1);
          goto _L4
    }

    (View view)
    {
        this$0 = final_shelflistpresenter;
        val$offset = I.this;
        val$optionsFooter = view;
        super(final_context);
    }
}
