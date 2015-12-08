// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.base;

import android.view.View;

// Referenced classes of package com.contextlogic.wish.ui.fragment.base:
//            BaseContentFragment

class val.monitorView
    implements Runnable
{

    final BaseContentFragment this$0;
    final View val$monitorView;
    final View val$view;

    public void run()
    {
        try
        {
            BaseContentFragment.access$100(BaseContentFragment.this, val$view, val$monitorView);
            return;
        }
        catch (Throwable throwable)
        {
            return;
        }
    }

    ()
    {
        this$0 = final_basecontentfragment;
        val$view = view1;
        val$monitorView = View.this;
        super();
    }
}
