// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.widget.Adapter;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            IcsAdapterView, AbsActionBarView

class mInstanceState extends DataSetObserver
{

    private Parcelable mInstanceState;
    final IcsAdapterView this$0;

    public void onChanged()
    {
label0:
        {
            mDataChanged = true;
            mOldItemCount = mItemCount;
            mItemCount = getAdapter().getCount();
            if (getAdapter().hasStableIds() && mInstanceState != null && mOldItemCount == 0 && mItemCount > 0)
            {
                IcsAdapterView.access$000(IcsAdapterView.this, mInstanceState);
                mInstanceState = null;
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            rememberSyncState();
        }
        checkFocus();
        requestLayout();
    }

    public void onInvalidated()
    {
        mDataChanged = true;
        if (getAdapter().hasStableIds())
        {
            mInstanceState = IcsAdapterView.access$100(IcsAdapterView.this);
        }
        mOldItemCount = mItemCount;
        mItemCount = 0;
        mSelectedPosition = -1;
        mSelectedRowId = 0x8000000000000000L;
        mNextSelectedPosition = -1;
        mNextSelectedRowId = 0x8000000000000000L;
        mNeedSync = false;
        checkFocus();
        requestLayout();
    }

    Q()
    {
        this$0 = IcsAdapterView.this;
        super();
        mInstanceState = null;
    }
}
