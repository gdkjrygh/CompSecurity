// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import android.database.Cursor;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivitySearchManager, RootActivitySearchSuggestionsAdapter

class sAdapter
    implements android.support.v7.widget.ner
{

    final RootActivitySearchManager this$0;
    final RootActivitySearchSuggestionsAdapter val$adapter;

    public boolean onSuggestionClick(int i)
    {
        Cursor cursor = val$adapter.getCursor();
        if (cursor != null && cursor.moveToPosition(i))
        {
            RootActivitySearchManager.access$100(RootActivitySearchManager.this, cursor);
        }
        return true;
    }

    public boolean onSuggestionSelect(int i)
    {
        return false;
    }

    sAdapter()
    {
        this$0 = final_rootactivitysearchmanager;
        val$adapter = RootActivitySearchSuggestionsAdapter.this;
        super();
    }
}
