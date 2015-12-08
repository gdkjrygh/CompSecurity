// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;


// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivitySearchManager

class val.searchAutoCompleteView
    implements Runnable
{

    final RootActivitySearchManager this$0;
    final android.support.v7.widget.e val$searchAutoCompleteView;

    public void run()
    {
        val$searchAutoCompleteView.showDropDown();
    }

    ()
    {
        this$0 = final_rootactivitysearchmanager;
        val$searchAutoCompleteView = android.support.v7.widget.e.this;
        super();
    }
}
