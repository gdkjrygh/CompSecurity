// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import android.view.View;
import com.contextlogic.wish.ui.components.drawer.TabletDrawerLayout;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivity

class lastWidth
    implements android.view..OnGlobalLayoutListener
{

    private int lastWidth;
    final RootActivity this$0;

    public void onGlobalLayout()
    {
        int i = RootActivity.access$900(RootActivity.this).getWidth();
        if (i > 0 && i != lastWidth)
        {
            lastWidth = i;
            i = RootActivity.access$700(RootActivity.this).getHeight();
            resizeUi(i, true);
        }
    }

    Layout()
    {
        this$0 = RootActivity.this;
        super();
        lastWidth = -1;
    }
}
