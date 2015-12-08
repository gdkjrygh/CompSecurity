// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import android.view.View;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivitySearchManager

class val.searchAutoCompleteView
    implements android.view.otActivitySearchManager._cls4
{

    final RootActivitySearchManager this$0;
    final android.support.v7.widget.e val$searchAutoCompleteView;

    public void onFocusChange(View view, boolean flag)
    {
        if (view == val$searchAutoCompleteView && flag)
        {
            val$searchAutoCompleteView.post(new Runnable() {

                final RootActivitySearchManager._cls4 this$1;

                public void run()
                {
                    searchAutoCompleteView.showDropDown();
                }

            
            {
                this$1 = RootActivitySearchManager._cls4.this;
                super();
            }
            });
            val$searchAutoCompleteView.setOnFocusChangeListener(null);
        }
    }

    _cls1.this._cls1()
    {
        this$0 = final_rootactivitysearchmanager;
        val$searchAutoCompleteView = android.support.v7.widget.e.this;
        super();
    }
}
