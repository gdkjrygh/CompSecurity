// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            IcsListPopupWindow

class <init>
    implements android.widget.ow.PopupScrollListener
{

    final IcsListPopupWindow this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1 && !IcsListPopupWindow.access$1100(IcsListPopupWindow.this) && IcsListPopupWindow.access$800(IcsListPopupWindow.this).getContentView() != null)
        {
            IcsListPopupWindow.access$1000(IcsListPopupWindow.this).removeCallbacks(IcsListPopupWindow.access$900(IcsListPopupWindow.this));
            IcsListPopupWindow.access$900(IcsListPopupWindow.this).run();
        }
    }

    private ()
    {
        this$0 = IcsListPopupWindow.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
