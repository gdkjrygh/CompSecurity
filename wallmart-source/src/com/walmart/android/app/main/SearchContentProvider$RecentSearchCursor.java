// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.database.Cursor;
import android.database.CursorWrapper;

// Referenced classes of package com.walmart.android.app.main:
//            SearchContentProvider

public static class sRefinementIndex extends CursorWrapper
{

    private static final String recentSearchId = String.valueOf(0x7f020299);
    private static final String refinementId = String.valueOf(0x7f0202bc);
    private static int sIconIndex;
    private static int sQueryIndex;
    private static int sRefinementIndex;

    public int getColumnCount()
    {
        return super.getColumnCount() + 3;
    }

    public int getColumnIndex(String s)
    {
        if ("suggest_icon_1".equals(s))
        {
            return sIconIndex;
        }
        if ("suggest_icon_2".equals(s))
        {
            return sRefinementIndex;
        }
        if ("suggest_intent_query".equals(s))
        {
            return sQueryIndex;
        } else
        {
            return super.getColumnIndex(s);
        }
    }

    public String getColumnName(int i)
    {
        if (sIconIndex == i)
        {
            return "suggest_icon_1";
        }
        if (sRefinementIndex == i)
        {
            return "suggest_icon_2";
        }
        if (sQueryIndex == i)
        {
            return "suggest_intent_query";
        } else
        {
            return super.getColumnName(i);
        }
    }

    public String[] getColumnNames()
    {
        String as[] = super.getColumnNames();
        int i = as.length;
        String as1[] = new String[i + 3];
        System.arraycopy(as, 0, as1, 0, i);
        as1[i] = "suggest_icon_1";
        as1[i + 1] = "suggest_icon_2";
        as1[i + 2] = "suggest_intent_query";
        return as1;
    }

    public String getString(int i)
    {
        if (sIconIndex == i)
        {
            return recentSearchId;
        }
        if (sRefinementIndex == i)
        {
            return refinementId;
        }
        if (sQueryIndex == i)
        {
            return super.getString(getColumnIndex("suggest_text_1"));
        }
        if (getColumnIndex("suggest_intent_extra_data") == i)
        {
            return String.valueOf(com.walmart.android.search.r.getColumnIndex);
        } else
        {
            return super.getString(i);
        }
    }


    public (Cursor cursor)
    {
        super(cursor);
        sIconIndex = super.getColumnNames().length;
        sRefinementIndex = sIconIndex + 1;
        sQueryIndex = sRefinementIndex + 1;
    }
}
