// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout, CursorFilter

public abstract class CursorAdapter extends BaseAdapter
    implements Filterable, CursorFilter.CursorFilterClient
{

    private static final String z[];
    protected boolean mAutoRequery;
    protected ChangeObserver mChangeObserver;
    protected Context mContext;
    protected Cursor mCursor;
    protected CursorFilter mCursorFilter;
    protected DataSetObserver mDataSetObserver;
    protected boolean mDataValid;
    protected FilterQueryProvider mFilterQueryProvider;
    protected int mRowIDColumn;

    public abstract void bindView(View view, Context context, Cursor cursor);

    public void changeCursor(Cursor cursor)
    {
        cursor = swapCursor(cursor);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        cursor.close();
        return;
        cursor;
        throw cursor;
    }

    public CharSequence convertToString(Cursor cursor)
    {
        if (cursor == null)
        {
            return "";
        } else
        {
            return cursor.toString();
        }
    }

    public int getCount()
    {
        boolean flag = mDataValid;
        IllegalStateException illegalstateexception;
        if (flag)
        {
            try
            {
                if (mCursor != null)
                {
                    return mCursor.getCount();
                }
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        break MISSING_BLOCK_LABEL_32;
        illegalstateexception;
        throw illegalstateexception;
        return 0;
    }

    public Cursor getCursor()
    {
        return mCursor;
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
label0:
        {
            View view1;
            try
            {
                if (!mDataValid)
                {
                    break label0;
                }
                mCursor.moveToPosition(i);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            view1 = view;
            if (view == null)
            {
                view1 = newDropDownView(mContext, mCursor, viewgroup);
                if (SlidingPaneLayout.a != 0)
                {
                    view1 = view;
                }
            }
            bindView(view1, mContext, mCursor);
            return view1;
        }
        return null;
    }

    public Filter getFilter()
    {
        try
        {
            if (mCursorFilter == null)
            {
                mCursorFilter = new CursorFilter(this);
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        return mCursorFilter;
    }

    public Object getItem(int i)
    {
        boolean flag = mDataValid;
        IllegalStateException illegalstateexception;
        if (flag)
        {
            try
            {
                if (mCursor != null)
                {
                    mCursor.moveToPosition(i);
                    return mCursor;
                }
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        break MISSING_BLOCK_LABEL_38;
        illegalstateexception;
        throw illegalstateexception;
        return null;
    }

    public long getItemId(int i)
    {
        long l1 = 0L;
        boolean flag = mDataValid;
        long l;
        l = l1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        Cursor cursor = mCursor;
        l = l1;
        if (cursor != null)
        {
            l = l1;
            IllegalStateException illegalstateexception;
            try
            {
                if (mCursor.moveToPosition(i))
                {
                    l = mCursor.getLong(mRowIDColumn);
                }
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        return l;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        try
        {
            if (!mDataValid)
            {
                throw new IllegalStateException(z[1]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        try
        {
            if (!mCursor.moveToPosition(i))
            {
                throw new IllegalStateException((new StringBuilder()).append(z[0]).append(i).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        View view1 = view;
        if (view == null)
        {
            view1 = newView(mContext, mCursor, viewgroup);
            if (SlidingPaneLayout.a != 0)
            {
                view1 = view;
            }
        }
        bindView(view1, mContext, mCursor);
        return view1;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return newView(context, cursor, viewgroup);
    }

    public abstract View newView(Context context, Cursor cursor, ViewGroup viewgroup);

    protected void onContentChanged()
    {
        boolean flag = mAutoRequery;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        Cursor cursor;
        IllegalStateException illegalstateexception;
        try
        {
            cursor = mCursor;
        }
        catch (IllegalStateException illegalstateexception1)
        {
            try
            {
                throw illegalstateexception1;
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
        }
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        if (!mCursor.isClosed())
        {
            mDataValid = mCursor.requery();
        }
        return;
        illegalstateexception;
        throw illegalstateexception;
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charsequence)
    {
label0:
        {
            try
            {
                if (mFilterQueryProvider == null)
                {
                    break label0;
                }
                charsequence = mFilterQueryProvider.runQuery(charsequence);
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                throw charsequence;
            }
            return charsequence;
        }
        return mCursor;
    }

    public Cursor swapCursor(Cursor cursor)
    {
        Cursor cursor1;
        try
        {
            cursor1 = mCursor;
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            throw cursor;
        }
        if (cursor != cursor1) goto _L2; else goto _L1
_L1:
        cursor = null;
_L4:
        return cursor;
_L2:
        Cursor cursor2 = mCursor;
        if (cursor2 != null)
        {
            try
            {
                if (mChangeObserver != null)
                {
                    cursor2.unregisterContentObserver(mChangeObserver);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                throw cursor;
            }
            try
            {
                if (mDataSetObserver != null)
                {
                    cursor2.unregisterDataSetObserver(mDataSetObserver);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                throw cursor;
            }
        }
        mCursor = cursor;
        if (cursor == null)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            if (mChangeObserver != null)
            {
                cursor.registerContentObserver(mChangeObserver);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            throw cursor;
        }
        try
        {
            if (mDataSetObserver != null)
            {
                cursor.registerDataSetObserver(mDataSetObserver);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            throw cursor;
        }
        try
        {
            mRowIDColumn = cursor.getColumnIndexOrThrow(z[2]);
            mDataValid = true;
            notifyDataSetChanged();
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            throw cursor;
        }
        cursor = cursor2;
        if (SlidingPaneLayout.a == 0) goto _L4; else goto _L3
_L3:
        mRowIDColumn = -1;
        mDataValid = false;
        notifyDataSetInvalidated();
        return cursor2;
        cursor;
        throw cursor;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "LO-T\013A\007,\030\002@V=\030\fZR+W\035\017T7\030\037@S1L\006@Nx";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "[H1KO\\H7M\003K\0007V\003V\000:]OLA4T\nK\000/P\nA\000,P\n\017C-J\034@RxQ\034\017V9T\006K";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "pI<";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 111;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 47;
          goto _L9
_L5:
        byte0 = 32;
          goto _L9
_L6:
        byte0 = 88;
          goto _L9
        byte0 = 56;
          goto _L9
    }
}
