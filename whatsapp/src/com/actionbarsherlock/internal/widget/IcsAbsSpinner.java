// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.SpinnerAdapter;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            IcsAdapterView, AbsActionBarView

public abstract class IcsAbsSpinner extends IcsAdapterView
{

    private static final boolean IS_HONEYCOMB;
    SpinnerAdapter mAdapter;
    boolean mBlockLayoutRequests;
    private DataSetObserver mDataSetObserver;
    int mHeightMeasureSpec;
    final RecycleBin mRecycler;
    int mSelectionBottomPadding;
    int mSelectionLeftPadding;
    int mSelectionRightPadding;
    int mSelectionTopPadding;
    final Rect mSpinnerPadding;
    int mWidthMeasureSpec;

    public IcsAbsSpinner(Context context)
    {
        super(context);
        mSelectionLeftPadding = 0;
        mSelectionTopPadding = 0;
        mSelectionRightPadding = 0;
        mSelectionBottomPadding = 0;
        mSpinnerPadding = new Rect();
        mRecycler = new RecycleBin();
        initAbsSpinner();
    }

    public IcsAbsSpinner(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public IcsAbsSpinner(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mSelectionLeftPadding = 0;
        mSelectionTopPadding = 0;
        mSelectionRightPadding = 0;
        mSelectionBottomPadding = 0;
        mSpinnerPadding = new Rect();
        mRecycler = new RecycleBin();
        initAbsSpinner();
    }

    private void initAbsSpinner()
    {
        setFocusable(true);
        setWillNotDraw(false);
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.LayoutParams(-1, -2);
    }

    public Adapter getAdapter()
    {
        return getAdapter();
    }

    public SpinnerAdapter getAdapter()
    {
        return mAdapter;
    }

    int getChildHeight(View view)
    {
        return view.getMeasuredHeight();
    }

    int getChildWidth(View view)
    {
        return view.getMeasuredWidth();
    }

    public int getCount()
    {
        return mItemCount;
    }

    public View getSelectedView()
    {
        if (mItemCount > 0 && mSelectedPosition >= 0)
        {
            return getChildAt(mSelectedPosition - mFirstPosition);
        } else
        {
            return null;
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        int i1;
        int k1 = android.view.View.MeasureSpec.getMode(i);
        k = getPaddingLeft();
        int j1 = getPaddingTop();
        i1 = getPaddingRight();
        l = getPaddingBottom();
        Object obj = mSpinnerPadding;
        View view;
        if (k <= mSelectionLeftPadding)
        {
            k = mSelectionLeftPadding;
        }
        obj.left = k;
        obj = mSpinnerPadding;
        if (j1 > mSelectionTopPadding)
        {
            k = j1;
        } else
        {
            k = mSelectionTopPadding;
        }
        obj.top = k;
        obj = mSpinnerPadding;
        if (i1 > mSelectionRightPadding)
        {
            k = i1;
        } else
        {
            k = mSelectionRightPadding;
        }
        obj.right = k;
        obj = mSpinnerPadding;
        if (l > mSelectionBottomPadding)
        {
            k = l;
        } else
        {
            k = mSelectionBottomPadding;
        }
        obj.bottom = k;
        if (mDataChanged)
        {
            handleDataChanged();
        }
        k = getSelectedItemPosition();
        if (k < 0 || mAdapter == null || k >= mAdapter.getCount()) goto _L2; else goto _L1
_L1:
        view = mRecycler.get(k);
        obj = view;
        if (view == null)
        {
            obj = mAdapter.getView(k, null, this);
        }
        if (obj != null)
        {
            mRecycler.put(k, ((View) (obj)));
        }
        if (obj == null) goto _L2; else goto _L3
_L3:
        if (((View) (obj)).getLayoutParams() == null)
        {
            mBlockLayoutRequests = true;
            ((View) (obj)).setLayoutParams(generateDefaultLayoutParams());
            mBlockLayoutRequests = false;
        }
        measureChild(((View) (obj)), i, j);
        l = getChildHeight(((View) (obj))) + mSpinnerPadding.top + mSpinnerPadding.bottom;
        k = getChildWidth(((View) (obj))) + mSpinnerPadding.left + mSpinnerPadding.right;
        i1 = 0;
_L5:
label0:
        {
            j1 = k;
            if (i1 != 0)
            {
                i1 = mSpinnerPadding.top + mSpinnerPadding.bottom;
                j1 = k;
                l = i1;
                if (k1 == 0)
                {
                    j1 = mSpinnerPadding.left + mSpinnerPadding.right;
                    l = i1;
                }
            }
            i1 = Math.max(l, getSuggestedMinimumHeight());
            j1 = Math.max(j1, getSuggestedMinimumWidth());
            if (IS_HONEYCOMB)
            {
                k = resolveSizeAndState(i1, j, 0);
                l = resolveSizeAndState(j1, i, 0);
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            k = resolveSize(i1, j);
            l = resolveSize(j1, i);
        }
        setMeasuredDimension(l, k);
        mHeightMeasureSpec = j;
        mWidthMeasureSpec = i;
        return;
_L2:
        i1 = 1;
        k = 0;
        l = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).selectedId >= 0L)
        {
            mDataChanged = true;
            mNeedSync = true;
            mSyncRowId = ((SavedState) (parcelable)).selectedId;
            mSyncPosition = ((SavedState) (parcelable)).position;
            mSyncMode = 0;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate;
label0:
        {
            savedstate = new SavedState(super.onSaveInstanceState());
            savedstate.selectedId = getSelectedItemId();
            if (savedstate.selectedId >= 0L)
            {
                savedstate.position = getSelectedItemPosition();
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            savedstate.position = -1;
        }
        return savedstate;
    }

    void recycleAllViews()
    {
        int j = AbsActionBarView.b;
        int k = getChildCount();
        RecycleBin recyclebin = mRecycler;
        int l = mFirstPosition;
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            recyclebin.put(l + i, getChildAt(i));
            i++;
        } while (j == 0);
    }

    public void requestLayout()
    {
        if (!mBlockLayoutRequests)
        {
            super.requestLayout();
        }
    }

    void resetList()
    {
        mDataChanged = false;
        mNeedSync = false;
        removeAllViewsInLayout();
        mOldSelectedPosition = -1;
        mOldSelectedRowId = 0x8000000000000000L;
        setSelectedPositionInt(-1);
        setNextSelectedPositionInt(-1);
        invalidate();
    }

    public void setAdapter(SpinnerAdapter spinneradapter)
    {
label0:
        {
            byte byte0 = -1;
            if (mAdapter != null)
            {
                mAdapter.unregisterDataSetObserver(mDataSetObserver);
                resetList();
            }
            mAdapter = spinneradapter;
            mOldSelectedPosition = -1;
            mOldSelectedRowId = 0x8000000000000000L;
            if (mAdapter != null)
            {
                mOldItemCount = mItemCount;
                mItemCount = mAdapter.getCount();
                checkFocus();
                mDataSetObserver = new IcsAdapterView.AdapterDataSetObserver(this);
                mAdapter.registerDataSetObserver(mDataSetObserver);
                if (mItemCount > 0)
                {
                    byte0 = 0;
                }
                setSelectedPositionInt(byte0);
                setNextSelectedPositionInt(byte0);
                if (mItemCount == 0)
                {
                    checkSelectionChanged();
                }
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            checkFocus();
            resetList();
            checkSelectionChanged();
        }
        requestLayout();
    }

    public void setSelection(int i)
    {
        setNextSelectedPositionInt(i);
        requestLayout();
        invalidate();
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_HONEYCOMB = flag;
    }


    private class RecycleBin
    {

        private final SparseArray mScrapHeap = new SparseArray();
        final IcsAbsSpinner this$0;

        void clear()
        {
            int j = AbsActionBarView.b;
            SparseArray sparsearray = mScrapHeap;
            int k = sparsearray.size();
            int i = 0;
            do
            {
label0:
                {
                    if (i < k)
                    {
                        View view = (View)sparsearray.valueAt(i);
                        if (view != null)
                        {
                            removeDetachedView(view, true);
                        }
                        if (j == 0)
                        {
                            break label0;
                        }
                    }
                    sparsearray.clear();
                    return;
                }
                i++;
            } while (true);
        }

        View get(int i)
        {
            View view = (View)mScrapHeap.get(i);
            if (view != null)
            {
                mScrapHeap.delete(i);
            }
            return view;
        }

        public void put(int i, View view)
        {
            mScrapHeap.put(i, view);
        }

        RecycleBin()
        {
            this$0 = IcsAbsSpinner.this;
            super();
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR;
        private static final String z[];
        int position;
        long selectedId;

        public String toString()
        {
            return (new StringBuilder()).append(z[0]).append(Integer.toHexString(System.identityHashCode(this))).append(z[1]).append(selectedId).append(z[2]).append(position).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeLong(selectedId);
            parcel.writeInt(position);
        }

        static 
        {
            Object obj;
            String as[];
            byte byte1;
            int i;
            as = new String[3];
            obj = "f99$ N5$\022\"\t\b+\0015C\b>\026$B ";
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
                    obj = "\007(/\0335D//\023\031Cf";
                    i = 1;
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    i = 2;
                    obj = "\007+%\0049S2%\031m";
                    byte1 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    z = as;
                    class _cls1
                        implements android.os.Parcelable.Creator
                    {

                        public SavedState createFromParcel(Parcel parcel)
                        {
                            return new SavedState(parcel, null);
                        }

                        public Object createFromParcel(Parcel parcel)
                        {
                            return createFromParcel(parcel);
                        }

                        public SavedState[] newArray(int l)
                        {
                            return new SavedState[l];
                        }

                        public Object[] newArray(int l)
                        {
                            return newArray(l);
                        }

                _cls1()
                {
                }
                    }

                    CREATOR = new _cls1();
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 168
        //                       0 189
        //                       1 195
        //                       2 201
        //                       3 207;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_207;
_L3:
            byte byte0 = 80;
_L9:
            obj[j] = (char)(byte0 ^ c);
            j++;
              goto _L8
_L4:
            byte0 = 39;
              goto _L9
_L5:
            byte0 = 91;
              goto _L9
_L6:
            byte0 = 74;
              goto _L9
            byte0 = 119;
              goto _L9
        }

        private SavedState(Parcel parcel)
        {
            super(parcel);
            selectedId = parcel.readLong();
            position = parcel.readInt();
        }

        SavedState(Parcel parcel, _cls1 _pcls1)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
