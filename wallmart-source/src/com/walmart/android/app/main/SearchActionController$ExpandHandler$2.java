// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.support.v7.widget.SearchView;
import android.view.View;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.main:
//            SearchActionController

class val.searchView
    implements android.view.ExpandHandler._cls2
{

    final val.searchView this$0;
    final SearchView val$searchView;

    public void onFocusChange(View view, boolean flag)
    {
        if (!flag)
        {
            ViewUtil.hideKeyboard(val$searchView);
        }
    }

    I()
    {
        this$0 = final_i;
        val$searchView = SearchView.this;
        super();
    }
}
