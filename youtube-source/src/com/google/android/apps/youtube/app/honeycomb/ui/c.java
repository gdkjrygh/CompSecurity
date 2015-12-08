// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.ui;

import android.database.Cursor;
import android.widget.CursorAdapter;
import android.widget.SearchView;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.ui:
//            a

final class c
    implements android.widget.SearchView.OnSuggestionListener
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public final boolean onSuggestionClick(int i)
    {
        boolean flag1 = false;
        Object obj = a.b.getSuggestionsAdapter().getCursor();
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (((Cursor) (obj)).moveToPosition(i))
            {
                try
                {
                    obj = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("suggest_intent_query"));
                    flag = com.google.android.apps.youtube.app.honeycomb.ui.a.a(a, ((String) (obj)));
                }
                catch (Exception exception)
                {
                    return false;
                }
            }
        }
        return flag;
    }

    public final boolean onSuggestionSelect(int i)
    {
        return false;
    }
}
