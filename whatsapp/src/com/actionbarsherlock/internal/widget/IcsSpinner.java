// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            IcsAbsSpinner, AbsActionBarView

public class IcsSpinner extends IcsAbsSpinner
    implements android.content.DialogInterface.OnClickListener
{

    private boolean mDisableChildrenWhenDisabled;
    int mDropDownWidth;
    private int mGravity;
    private SpinnerPopup mPopup;
    private DropDownAdapter mTempAdapter;
    private Rect mTempRect;

    public IcsSpinner(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, com.actionbarsherlock.R.attr.actionDropDownStyle);
    }

    public IcsSpinner(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mTempRect = new Rect();
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockSpinner, i, 0);
        context = new DropdownPopup(context, attributeset, i);
        mDropDownWidth = typedarray.getLayoutDimension(com.actionbarsherlock.R.styleable.SherlockSpinner_android_dropDownWidth, -2);
        context.setBackgroundDrawable(typedarray.getDrawable(com.actionbarsherlock.R.styleable.SherlockSpinner_android_popupBackground));
        i = typedarray.getDimensionPixelOffset(com.actionbarsherlock.R.styleable.SherlockSpinner_android_dropDownVerticalOffset, 0);
        if (i != 0)
        {
            context.setVerticalOffset(i);
        }
        i = typedarray.getDimensionPixelOffset(com.actionbarsherlock.R.styleable.SherlockSpinner_android_dropDownHorizontalOffset, 0);
        if (i != 0)
        {
            context.setHorizontalOffset(i);
        }
        mPopup = context;
        mGravity = typedarray.getInt(com.actionbarsherlock.R.styleable.SherlockSpinner_android_gravity, 17);
        mPopup.setPromptText(typedarray.getString(com.actionbarsherlock.R.styleable.SherlockSpinner_android_prompt));
        mDisableChildrenWhenDisabled = true;
        typedarray.recycle();
        if (mTempAdapter != null)
        {
            mPopup.setAdapter(mTempAdapter);
            mTempAdapter = null;
        }
    }

    private View makeAndAddView(int i)
    {
        if (!mDataChanged)
        {
            View view = mRecycler.get(i);
            if (view != null)
            {
                setUpChild(view);
                return view;
            }
        }
        View view1 = mAdapter.getView(i, null, this);
        setUpChild(view1);
        return view1;
    }

    private void setUpChild(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams1 = view.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, 0, layoutparams);
        view.setSelected(hasFocus());
        if (mDisableChildrenWhenDisabled)
        {
            view.setEnabled(isEnabled());
        }
        int i = ViewGroup.getChildMeasureSpec(mHeightMeasureSpec, mSpinnerPadding.top + mSpinnerPadding.bottom, layoutparams.height);
        view.measure(ViewGroup.getChildMeasureSpec(mWidthMeasureSpec, mSpinnerPadding.left + mSpinnerPadding.right, layoutparams.width), i);
        i = mSpinnerPadding.top + (getMeasuredHeight() - mSpinnerPadding.bottom - mSpinnerPadding.top - view.getMeasuredHeight()) / 2;
        int j = view.getMeasuredHeight();
        view.layout(0, i, view.getMeasuredWidth() + 0, j + i);
    }

    public int getBaseline()
    {
        Object obj;
        byte byte0;
        byte0 = -1;
        obj = null;
        if (getChildCount() <= 0) goto _L2; else goto _L1
_L1:
        View view = getChildAt(0);
_L4:
        int i = byte0;
        if (view != null)
        {
            int j = view.getBaseline();
            i = byte0;
            if (j >= 0)
            {
                i = view.getTop() + j;
            }
        }
        return i;
_L2:
        view = obj;
        if (mAdapter != null)
        {
            view = obj;
            if (mAdapter.getCount() > 0)
            {
                view = makeAndAddView(0);
                mRecycler.put(0, view);
                removeAllViewsInLayout();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void layout(int i, boolean flag)
    {
        View view;
        int j;
        int k;
        int l;
        j = mSpinnerPadding.left;
        k = getRight() - getLeft() - mSpinnerPadding.left - mSpinnerPadding.right;
        if (mDataChanged)
        {
            handleDataChanged();
        }
        if (mItemCount == 0)
        {
            resetList();
            return;
        }
        if (mNextSelectedPosition >= 0)
        {
            setSelectedPositionInt(mNextSelectedPosition);
        }
        recycleAllViews();
        removeAllViewsInLayout();
        mFirstPosition = mSelectedPosition;
        view = makeAndAddView(mSelectedPosition);
        l = view.getMeasuredWidth();
        mGravity & 7;
        JVM INSTR lookupswitch 2: default 140
    //                   1: 182
    //                   5: 201;
           goto _L1 _L2 _L3
_L1:
        i = j;
_L5:
        view.offsetLeftAndRight(i);
        mRecycler.clear();
        invalidate();
        checkSelectionChanged();
        mDataChanged = false;
        mNeedSync = false;
        setNextSelectedPositionInt(mSelectedPosition);
        return;
_L2:
        i = (k / 2 + j) - l / 2;
        if (AbsActionBarView.b == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        i = (j + k) - l;
        if (true) goto _L5; else goto _L4
_L4:
    }

    int measureContentWidth(SpinnerAdapter spinneradapter, Drawable drawable)
    {
        int j;
        int i1;
        j = 0;
        i1 = AbsActionBarView.b;
        if (spinneradapter != null) goto _L2; else goto _L1
_L1:
        return j;
_L2:
        int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int i = Math.max(0, getSelectedItemPosition());
        int l1 = Math.min(spinneradapter.getCount(), i + 15);
        int k = Math.max(0, i - (15 - (l1 - i)));
        View view = null;
        i = 0;
        j = 0;
        do
        {
label0:
            {
                if (k < l1)
                {
                    int l = spinneradapter.getItemViewType(k);
                    if (l != j)
                    {
                        view = null;
                        j = l;
                    }
                    view = spinneradapter.getView(k, view, this);
                    if (view.getLayoutParams() == null)
                    {
                        view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(j1, k1);
                    i = Math.max(i, view.getMeasuredWidth());
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                j = i;
                if (drawable != null)
                {
                    drawable.getPadding(mTempRect);
                    return i + (mTempRect.left + mTempRect.right);
                }
            }
            if (true)
            {
                continue;
            }
            k++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        setSelection(i);
        dialoginterface.dismiss();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mPopup != null && mPopup.isShowing())
        {
            mPopup.dismiss();
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        mInLayout = true;
        layout(0, false);
        mInLayout = false;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (mPopup != null && android.view.View.MeasureSpec.getMode(i) == 0x80000000)
        {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), measureContentWidth(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean performClick()
    {
        boolean flag1 = super.performClick();
        boolean flag = flag1;
        if (!flag1)
        {
            boolean flag2 = true;
            flag = flag2;
            if (!mPopup.isShowing())
            {
                mPopup.show();
                flag = flag2;
            }
        }
        return flag;
    }

    public void setAdapter(SpinnerAdapter spinneradapter)
    {
label0:
        {
            super.setAdapter(spinneradapter);
            if (mPopup != null)
            {
                mPopup.setAdapter(new DropDownAdapter(spinneradapter));
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            mTempAdapter = new DropDownAdapter(spinneradapter);
        }
    }

    public void setEnabled(boolean flag)
    {
        int j = AbsActionBarView.b;
        super.setEnabled(flag);
        if (mDisableChildrenWhenDisabled)
        {
            int k = getChildCount();
            int i = 0;
            do
            {
                if (i >= k)
                {
                    break;
                }
                getChildAt(i).setEnabled(flag);
                i++;
            } while (j == 0);
        }
    }


    private class DropdownPopup extends IcsListPopupWindow
        implements SpinnerPopup
    {

        private ListAdapter mAdapter;
        private CharSequence mHintText;
        final IcsSpinner this$0;

        public void setAdapter(ListAdapter listadapter)
        {
            super.setAdapter(listadapter);
            mAdapter = listadapter;
        }

        public void setPromptText(CharSequence charsequence)
        {
            mHintText = charsequence;
        }

        public void show()
        {
            int k;
label0:
            {
                int i = AbsActionBarView.b;
                k = getPaddingLeft();
                if (mDropDownWidth == -2)
                {
                    int l = getWidth();
                    int i1 = getPaddingRight();
                    setContentWidth(Math.max(measureContentWidth((SpinnerAdapter)mAdapter, getBackground()), l - k - i1));
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                if (mDropDownWidth == -1)
                {
                    setContentWidth(getWidth() - k - getPaddingRight());
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                setContentWidth(mDropDownWidth);
            }
            Drawable drawable = getBackground();
            int j = 0;
            if (drawable != null)
            {
                drawable.getPadding(mTempRect);
                j = -mTempRect.left;
            }
            setHorizontalOffset(j + k);
            setInputMethodMode(2);
            super.show();
            getListView().setChoiceMode(1);
            setSelection(getSelectedItemPosition());
        }

        public DropdownPopup(Context context, AttributeSet attributeset, int i)
        {
            this$0 = IcsSpinner.this;
            super(context, attributeset, 0, i);
            setAnchorView(IcsSpinner.this);
            setModal(true);
            setPromptPosition(0);
            class _cls1
                implements android.widget.AdapterView.OnItemClickListener
            {

                final DropdownPopup this$1;
                final IcsSpinner val$this$0;

                public void onItemClick(AdapterView adapterview, View view, int j, long l)
                {
                    setSelection(j);
                    dismiss();
                }


// JavaClassFileOutputException: Invalid index accessing method local variables table of <init>
            }

            setOnItemClickListener(new _cls1());
        }
    }


    private class SpinnerPopup
    {

        public abstract void dismiss();

        public abstract boolean isShowing();

        public abstract void setAdapter(ListAdapter listadapter);

        public abstract void setPromptText(CharSequence charsequence);

        public abstract void show();
    }


    private class DropDownAdapter
        implements ListAdapter, SpinnerAdapter
    {

        private SpinnerAdapter mAdapter;
        private ListAdapter mListAdapter;

        public boolean areAllItemsEnabled()
        {
            ListAdapter listadapter = mListAdapter;
            if (listadapter != null)
            {
                return listadapter.areAllItemsEnabled();
            } else
            {
                return true;
            }
        }

        public int getCount()
        {
            if (mAdapter == null)
            {
                return 0;
            } else
            {
                return mAdapter.getCount();
            }
        }

        public View getDropDownView(int i, View view, ViewGroup viewgroup)
        {
            if (mAdapter == null)
            {
                return null;
            } else
            {
                return mAdapter.getDropDownView(i, view, viewgroup);
            }
        }

        public Object getItem(int i)
        {
            if (mAdapter == null)
            {
                return null;
            } else
            {
                return mAdapter.getItem(i);
            }
        }

        public long getItemId(int i)
        {
            if (mAdapter == null)
            {
                return -1L;
            } else
            {
                return mAdapter.getItemId(i);
            }
        }

        public int getItemViewType(int i)
        {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            return getDropDownView(i, view, viewgroup);
        }

        public int getViewTypeCount()
        {
            return 1;
        }

        public boolean hasStableIds()
        {
            return mAdapter != null && mAdapter.hasStableIds();
        }

        public boolean isEmpty()
        {
            return getCount() == 0;
        }

        public boolean isEnabled(int i)
        {
            ListAdapter listadapter = mListAdapter;
            if (listadapter != null)
            {
                return listadapter.isEnabled(i);
            } else
            {
                return true;
            }
        }

        public void registerDataSetObserver(DataSetObserver datasetobserver)
        {
            if (mAdapter != null)
            {
                mAdapter.registerDataSetObserver(datasetobserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver datasetobserver)
        {
            if (mAdapter != null)
            {
                mAdapter.unregisterDataSetObserver(datasetobserver);
            }
        }

        public DropDownAdapter(SpinnerAdapter spinneradapter)
        {
            mAdapter = spinneradapter;
            if (spinneradapter instanceof ListAdapter)
            {
                mListAdapter = (ListAdapter)spinneradapter;
            }
        }
    }

}
