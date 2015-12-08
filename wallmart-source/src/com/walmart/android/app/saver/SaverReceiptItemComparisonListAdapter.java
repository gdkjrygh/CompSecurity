// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.View;
import android.widget.TextView;

public class SaverReceiptItemComparisonListAdapter extends SimpleCursorAdapter
{
    private class SaverCompetitorViewBinder
        implements android.support.v4.widget.SimpleCursorAdapter.ViewBinder
    {

        final SaverReceiptItemComparisonListAdapter this$0;

        public boolean setViewValue(View view, Cursor cursor, int i)
        {
            if (mPriceColumn != i) goto _L2; else goto _L1
_L1:
            i = cursor.getInt(i);
            if (view.getId() != 0x7f1004d2) goto _L4; else goto _L3
_L3:
            ((TextView)view).setText(
// JavaClassFileOutputException: get_constant: invalid tag

        private SaverCompetitorViewBinder()
        {
            this$0 = SaverReceiptItemComparisonListAdapter.this;
            super();
        }

    }


    private static final int COMPETITOR_UNIT_BASE = 1;
    private int mNameColumn;
    private final int mPrice;
    private int mPriceColumn;
    private final float mQuantity;
    private final String mUnitType;

    public SaverReceiptItemComparisonListAdapter(Context context, int i, float f, String s)
    {
        SimpleCursorAdapter(context, 0x7f040161, null, new String[] {
            "competitorName", "competitorUnitPrice", "competitorUnitPrice", "competitorUnitPrice", "competitorUnitPrice"
        }, new int[] {
            0x7f1004d1, 0x7f1000fe, 0x7f1004d2, 0x7f1004d3, 0x7f1004d4
        }, 0);
        mPrice = i;
        mQuantity = f;
        mUnitType = s;
        setViewBinder(new SaverCompetitorViewBinder());
    }

    private void findColumns(Cursor cursor)
    {
        if (cursor != null)
        {
            mNameColumn = cursor.getColumnIndex("competitorName");
            mPriceColumn = cursor.getColumnIndex("competitorUnitPrice");
        }
    }

    private int getCompetitorPrice(int i)
    {
        int j = i;
        if (mQuantity > 0.0F)
        {
            j = Math.round(mQuantity * (float)i);
        }
        return j;
    }

    public boolean isEnabled(int i)
    {
        return false;
    }

    public Cursor swapCursor(Cursor cursor)
    {
        findColumns(cursor);
        return swapCursor(cursor);
    }

















}
