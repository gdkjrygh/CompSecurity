// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import android.view.View;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivitySearchManager

class this._cls1
    implements Runnable
{

    final l.searchAutoCompleteView this$1;

    public void run()
    {
        searchAutoCompleteView.showDropDown();
    }

    l.searchAutoCompleteView()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/activity/root/RootActivitySearchManager$4

/* anonymous class */
    class RootActivitySearchManager._cls4
        implements android.view.View.OnFocusChangeListener
    {

        final RootActivitySearchManager this$0;
        final android.support.v7.widget.SearchView.SearchAutoComplete val$searchAutoCompleteView;

        public void onFocusChange(View view, boolean flag)
        {
            if (view == searchAutoCompleteView && flag)
            {
                searchAutoCompleteView.post(new RootActivitySearchManager._cls4._cls1());
                searchAutoCompleteView.setOnFocusChangeListener(null);
            }
        }

            
            {
                this$0 = final_rootactivitysearchmanager;
                searchAutoCompleteView = android.support.v7.widget.SearchView.SearchAutoComplete.this;
                super();
            }
    }

}
