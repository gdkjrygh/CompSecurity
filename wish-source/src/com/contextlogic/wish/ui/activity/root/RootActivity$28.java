// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import android.view.View;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivity

class this._cls0
    implements android.view..OnGlobalLayoutListener
{

    final RootActivity this$0;

    public void onGlobalLayout()
    {
        int i = RootActivity.access$700(RootActivity.this).getHeight();
        if (i > 0 && i != RootActivity.access$800(RootActivity.this))
        {
            RootActivity.access$802(RootActivity.this, i);
            resizeUi(i, false);
        }
    }

    ()
    {
        this$0 = RootActivity.this;
        super();
    }
}
