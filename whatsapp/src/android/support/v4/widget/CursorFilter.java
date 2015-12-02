// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

class CursorFilter extends Filter
{

    CursorFilterClient mClient;

    CursorFilter(CursorFilterClient cursorfilterclient)
    {
        mClient = cursorfilterclient;
    }

    public CharSequence convertResultToString(Object obj)
    {
        return mClient.convertToString((Cursor)obj);
    }

    protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
    {
        android.widget.Filter.FilterResults filterresults;
label0:
        {
            charsequence = mClient.runQueryOnBackgroundThread(charsequence);
            filterresults = new android.widget.Filter.FilterResults();
            if (charsequence != null)
            {
                filterresults.count = charsequence.getCount();
                filterresults.values = charsequence;
                if (SlidingPaneLayout.a == 0)
                {
                    break label0;
                }
            }
            filterresults.count = 0;
            filterresults.values = null;
        }
        return filterresults;
    }

    protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
    {
        charsequence = mClient.getCursor();
        if (filterresults.values != null && filterresults.values != charsequence)
        {
            mClient.changeCursor((Cursor)filterresults.values);
        }
    }

    private class CursorFilterClient
    {

        public abstract void changeCursor(Cursor cursor);

        public abstract CharSequence convertToString(Cursor cursor);

        public abstract Cursor getCursor();

        public abstract Cursor runQueryOnBackgroundThread(CharSequence charsequence);
    }

}
