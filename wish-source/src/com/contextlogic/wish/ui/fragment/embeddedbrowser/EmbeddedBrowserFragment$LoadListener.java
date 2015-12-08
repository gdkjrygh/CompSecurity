// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.embeddedbrowser;

import com.contextlogic.wish.ui.activity.root.RootActivity;

// Referenced classes of package com.contextlogic.wish.ui.fragment.embeddedbrowser:
//            EmbeddedBrowserFragment

class this._cls0
{

    final EmbeddedBrowserFragment this$0;

    public void checkElement(boolean flag)
    {
        if (flag)
        {
            ((RootActivity)getActivity()).setTestingOutput("True");
            return;
        } else
        {
            ((RootActivity)getActivity()).setTestingOutput("False");
            return;
        }
    }

    public void getElementText(String s)
    {
        ((RootActivity)getActivity()).setTestingOutput(s);
    }

    ()
    {
        this$0 = EmbeddedBrowserFragment.this;
        super();
    }
}
