// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.app.ActionBar;
import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.nhaarman.listviewanimations.itemmanipulation.swipedismiss.contextualundo.ContextualUndoAdapter;
import com.weather.util.CursorWithDelete;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinHistoryView, CheckinHistoryAdapter, CheckinIconProvider, CheckinHistoryListController

public class CheckinHistoryListLayout extends LinearLayout
    implements CheckinHistoryView
{

    ActionBar actionBar;
    private CursorAdapter adapter;
    CheckinHistoryListController controller;
    private CursorWithDelete cursorWithDelete;
    private ContextualUndoAdapter dismissAdapter;

    public CheckinHistoryListLayout(Context context)
    {
        super(context);
    }

    public CheckinHistoryListLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CheckinHistoryListLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        adapter = new CheckinHistoryAdapter(getContext(), null, 0, CheckinIconProvider.BUTTON_PROVIDER);
        ListView listview = (ListView)findViewById(0x7f0d00a8);
        dismissAdapter = new ContextualUndoAdapter(adapter, 0x7f030027, 0x7f0d00d3, 5000, new _cls1());
        dismissAdapter.setAbsListView(listview);
        listview.setAdapter(dismissAdapter);
        listview.setOnItemClickListener(new _cls2());
    }

    public void updateCursor(Cursor cursor)
    {
        Object obj = cursor;
        if (cursor != null)
        {
            cursorWithDelete = new CursorWithDelete(cursor);
            obj = cursorWithDelete;
        }
        cursor = adapter.swapCursor(((Cursor) (obj)));
        if (cursor != null)
        {
            cursor.close();
        }
        dismissAdapter.notifyDataSetChanged();
        dismissAdapter.cancelCountDown();
    }

    public void updateTitle()
    {
        actionBar.setNavigationMode(0);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(0x7f07009c);
    }




    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
