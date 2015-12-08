// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.content.Context;
import android.database.Cursor;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            BasicAdapter, BasicViewHolder

public abstract class CursorAdapter extends BasicAdapter
{

    private Context mContext;
    private Cursor mCursor;
    private boolean mDataValid;
    private int mRowIdColumn;
    private String mRowIdColumnName;

    public CursorAdapter(Context context)
    {
        this(context, null);
    }

    public CursorAdapter(Context context, String s)
    {
        mContext = context;
        if (s == null)
        {
            s = "_id";
        }
        mRowIdColumnName = s;
        setHasStableIds(true);
    }

    public void changeCursor(Cursor cursor)
    {
        cursor = swapCursor(cursor);
        if (cursor != null)
        {
            cursor.close();
        }
    }

    protected Context getContext()
    {
        return mContext;
    }

    protected Cursor getCursor()
    {
        return mCursor;
    }

    public Cursor getItem(int i)
    {
        if (mDataValid && mCursor != null)
        {
            mCursor.moveToPosition(i);
            return mCursor;
        } else
        {
            return null;
        }
    }

    public int getItemCount()
    {
        if (mDataValid && mCursor != null)
        {
            return mCursor.getCount();
        } else
        {
            return 0;
        }
    }

    public long getItemId(int i)
    {
        if (mDataValid && mCursor != null && mCursor.moveToPosition(i))
        {
            return mCursor.getLong(mRowIdColumn);
        } else
        {
            return 0L;
        }
    }

    protected boolean isDataValid()
    {
        return mDataValid;
    }

    public void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        if (!mDataValid)
        {
            throw new IllegalStateException("onPopulateViewHolder(): This should only be called when the cursor is valid");
        }
        if (!mCursor.moveToPosition(i))
        {
            throw new IllegalStateException((new StringBuilder()).append("onPopulateViewHolder(): Could not move cursor to position: ").append(i).toString());
        } else
        {
            onPopulateViewHolder(basicviewholder, mCursor);
            return;
        }
    }

    public abstract void onPopulateViewHolder(BasicViewHolder basicviewholder, Cursor cursor);

    public Cursor swapCursor(Cursor cursor)
    {
        if (cursor == mCursor)
        {
            return null;
        }
        Cursor cursor1 = mCursor;
        mCursor = cursor;
        if (cursor != null)
        {
            mRowIdColumn = cursor.getColumnIndexOrThrow(mRowIdColumnName);
            mDataValid = true;
            notifyDataSetChanged();
            return cursor1;
        } else
        {
            mRowIdColumn = -1;
            mDataValid = false;
            notifyDataSetChanged();
            return cursor1;
        }
    }
}
