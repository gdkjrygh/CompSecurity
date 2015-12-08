// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.support.v4.view.ActionProvider;
import android.support.v7.widget.ListPopupWindow;

// Referenced classes of package com.walmart.android.wmui:
//            WalmartActivityChooserView

class this._cls0
    implements android.view.utListener
{

    final WalmartActivityChooserView this$0;

    public void onGlobalLayout()
    {
        if (isShowingPopup())
        {
            if (!isShown())
            {
                WalmartActivityChooserView.access$100(WalmartActivityChooserView.this).dismiss();
            } else
            {
                WalmartActivityChooserView.access$100(WalmartActivityChooserView.this).show();
                if (mProvider != null)
                {
                    mProvider.subUiVisibilityChanged(true);
                    return;
                }
            }
        }
    }

    ()
    {
        this$0 = WalmartActivityChooserView.this;
        super();
    }
}
