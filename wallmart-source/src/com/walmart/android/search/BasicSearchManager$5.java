// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.search;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.walmart.android.search:
//            BasicSearchManager

class this._cls0
    implements android.view.tener
{

    final BasicSearchManager this$0;

    public void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            if (BasicSearchManager.access$200(BasicSearchManager.this))
            {
                mSearchField.setText(BasicSearchManager.access$300(BasicSearchManager.this));
            }
            if (BasicSearchManager.access$400(BasicSearchManager.this) != null)
            {
                setSuggestionText(BasicSearchManager.access$400(BasicSearchManager.this));
            }
        }
        onSearchFieldFocusChange(flag);
        if (BasicSearchManager.access$500(BasicSearchManager.this) != null)
        {
            BasicSearchManager.access$500(BasicSearchManager.this).onFocused(flag);
        }
    }

    SearchFieldFocusedListener()
    {
        this$0 = BasicSearchManager.this;
        super();
    }
}
