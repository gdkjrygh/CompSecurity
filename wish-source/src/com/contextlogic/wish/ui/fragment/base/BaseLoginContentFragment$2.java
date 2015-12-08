// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.base;

import android.view.View;

// Referenced classes of package com.contextlogic.wish.ui.fragment.base:
//            BaseLoginContentFragment

class val.monitorView
    implements Runnable
{

    final BaseLoginContentFragment this$0;
    final View val$monitorView;
    final View val$view;

    public void run()
    {
        try
        {
            BaseLoginContentFragment.access$000(BaseLoginContentFragment.this, val$view, val$monitorView);
            return;
        }
        catch (Throwable throwable)
        {
            return;
        }
    }

    ()
    {
        this$0 = final_baselogincontentfragment;
        val$view = view1;
        val$monitorView = View.this;
        super();
    }
}
