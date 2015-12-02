// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Adapter;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            AbsActionBarView

public abstract class IcsAdapterView extends ViewGroup
{

    private static final String z[];
    boolean mBlockLayoutRequests;
    boolean mDataChanged;
    private boolean mDesiredFocusableInTouchModeState;
    private boolean mDesiredFocusableState;
    private View mEmptyView;
    int mFirstPosition;
    boolean mInLayout;
    int mItemCount;
    private int mLayoutHeight;
    boolean mNeedSync;
    int mNextSelectedPosition;
    long mNextSelectedRowId;
    int mOldItemCount;
    int mOldSelectedPosition;
    long mOldSelectedRowId;
    OnItemSelectedListener mOnItemSelectedListener;
    int mSelectedPosition;
    long mSelectedRowId;
    private SelectionNotifier mSelectionNotifier;
    int mSpecificTop;
    long mSyncHeight;
    int mSyncMode;
    int mSyncPosition;
    long mSyncRowId;

    public IcsAdapterView(Context context)
    {
        super(context);
        mFirstPosition = 0;
        mSyncRowId = 0x8000000000000000L;
        mNeedSync = false;
        mInLayout = false;
        mNextSelectedPosition = -1;
        mNextSelectedRowId = 0x8000000000000000L;
        mSelectedPosition = -1;
        mSelectedRowId = 0x8000000000000000L;
        mOldSelectedPosition = -1;
        mOldSelectedRowId = 0x8000000000000000L;
        mBlockLayoutRequests = false;
    }

    public IcsAdapterView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mFirstPosition = 0;
        mSyncRowId = 0x8000000000000000L;
        mNeedSync = false;
        mInLayout = false;
        mNextSelectedPosition = -1;
        mNextSelectedRowId = 0x8000000000000000L;
        mSelectedPosition = -1;
        mSelectedRowId = 0x8000000000000000L;
        mOldSelectedPosition = -1;
        mOldSelectedRowId = 0x8000000000000000L;
        mBlockLayoutRequests = false;
    }

    public IcsAdapterView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mFirstPosition = 0;
        mSyncRowId = 0x8000000000000000L;
        mNeedSync = false;
        mInLayout = false;
        mNextSelectedPosition = -1;
        mNextSelectedRowId = 0x8000000000000000L;
        mSelectedPosition = -1;
        mSelectedRowId = 0x8000000000000000L;
        mOldSelectedPosition = -1;
        mOldSelectedRowId = 0x8000000000000000L;
        mBlockLayoutRequests = false;
    }

    private void fireOnSelected()
    {
        Object obj;
        try
        {
            obj = mOnItemSelectedListener;
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            throw unsupportedoperationexception;
        }
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        i = getSelectedItemPosition();
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        unsupportedoperationexception = getSelectedView();
        mOnItemSelectedListener.onItemSelected(this, unsupportedoperationexception, i, getAdapter().getItemId(i));
        if (AbsActionBarView.b == 0) goto _L1; else goto _L3
_L3:
        mOnItemSelectedListener.onNothingSelected(this);
        return;
        UnsupportedOperationException unsupportedoperationexception1;
        unsupportedoperationexception1;
        throw unsupportedoperationexception1;
    }

    private boolean isScrollableForAccessibility()
    {
        boolean flag;
        boolean flag1 = false;
        Adapter adapter = getAdapter();
        flag = flag1;
        if (adapter == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        int i = adapter.getCount();
        flag = flag1;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        int j;
        try
        {
            j = getFirstVisiblePosition();
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            try
            {
                throw unsupportedoperationexception;
            }
            catch (UnsupportedOperationException unsupportedoperationexception1)
            {
                throw unsupportedoperationexception1;
            }
        }
        if (j > 0)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        flag = flag1;
        if (getLastVisiblePosition() >= i - 1)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        flag = true;
        return flag;
    }

    private void updateEmptyStatus(boolean flag)
    {
        int i;
        i = AbsActionBarView.b;
        if (isInFilterMode())
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        View view = mEmptyView;
        if (view != null)
        {
            UnsupportedOperationException unsupportedoperationexception;
            try
            {
                mEmptyView.setVisibility(0);
                setVisibility(8);
            }
            catch (UnsupportedOperationException unsupportedoperationexception1)
            {
                throw unsupportedoperationexception1;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_49;
            }
        }
        setVisibility(0);
        flag = mDataChanged;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        onLayout(false, getLeft(), getTop(), getRight(), getBottom());
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        UnsupportedOperationException unsupportedoperationexception2;
        try
        {
            if (mEmptyView != null)
            {
                mEmptyView.setVisibility(8);
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception3)
        {
            throw unsupportedoperationexception3;
        }
        setVisibility(0);
        return;
        unsupportedoperationexception;
        throw unsupportedoperationexception;
        unsupportedoperationexception2;
        throw unsupportedoperationexception2;
        unsupportedoperationexception2;
        throw unsupportedoperationexception2;
    }

    public void addView(View view)
    {
        throw new UnsupportedOperationException(z[4]);
    }

    public void addView(View view, int i)
    {
        throw new UnsupportedOperationException(z[7]);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        throw new UnsupportedOperationException(z[3]);
    }

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        throw new UnsupportedOperationException(z[6]);
    }

    protected boolean canAnimate()
    {
        boolean flag;
        try
        {
            flag = super.canAnimate();
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            try
            {
                throw unsupportedoperationexception;
            }
            catch (UnsupportedOperationException unsupportedoperationexception1)
            {
                throw unsupportedoperationexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        if (mItemCount > 0)
        {
            return true;
        }
        return false;
    }

    void checkFocus()
    {
        Adapter adapter;
        boolean flag1;
        flag1 = false;
        adapter = getAdapter();
        if (adapter == null) goto _L2; else goto _L1
_L1:
        View view;
        int i;
        boolean flag;
        try
        {
            i = adapter.getCount();
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            throw unsupportedoperationexception;
        }
        if (i != 0) goto _L3; else goto _L2
_L2:
        i = 1;
_L13:
        if (!i) goto _L5; else goto _L4
_L4:
        try
        {
            flag = isInFilterMode();
        }
        catch (UnsupportedOperationException unsupportedoperationexception1)
        {
            throw unsupportedoperationexception1;
        }
        if (!flag) goto _L6; else goto _L5
_L5:
        i = 1;
_L14:
        if (!i) goto _L8; else goto _L7
_L7:
        try
        {
            flag = mDesiredFocusableInTouchModeState;
        }
        catch (UnsupportedOperationException unsupportedoperationexception2)
        {
            throw unsupportedoperationexception2;
        }
        if (!flag) goto _L8; else goto _L9
_L9:
        flag = true;
_L15:
        super.setFocusableInTouchMode(flag);
        if (!i) goto _L11; else goto _L10
_L10:
        try
        {
            flag = mDesiredFocusableState;
        }
        // Misplaced declaration of an exception variable
        catch (UnsupportedOperationException unsupportedoperationexception3)
        {
            throw unsupportedoperationexception3;
        }
        if (!flag) goto _L11; else goto _L12
_L12:
        flag = true;
_L16:
        super.setFocusable(flag);
        view = mEmptyView;
label0:
        {
label1:
            {
                if (view == null)
                {
                    break label0;
                }
                if (adapter != null)
                {
                    UnsupportedOperationException unsupportedoperationexception3;
                    boolean flag2;
                    try
                    {
                        flag2 = adapter.isEmpty();
                    }
                    catch (UnsupportedOperationException unsupportedoperationexception4)
                    {
                        throw unsupportedoperationexception4;
                    }
                    flag = flag1;
                    if (!flag2)
                    {
                        break label1;
                    }
                }
                flag = true;
            }
            updateEmptyStatus(flag);
        }
        return;
_L3:
        i = 0;
          goto _L13
_L6:
        i = 0;
          goto _L14
_L8:
        flag = false;
          goto _L15
        unsupportedoperationexception3;
        throw unsupportedoperationexception3;
_L11:
        flag = false;
          goto _L16
        unsupportedoperationexception3;
        throw unsupportedoperationexception3;
        unsupportedoperationexception3;
        throw unsupportedoperationexception3;
          goto _L13
    }

    void checkSelectionChanged()
    {
        int i;
        int j;
        try
        {
            i = mSelectedPosition;
            j = mOldSelectedPosition;
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            try
            {
                throw unsupportedoperationexception;
            }
            catch (UnsupportedOperationException unsupportedoperationexception1)
            {
                throw unsupportedoperationexception1;
            }
        }
        if (i != j)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (mSelectedRowId == mOldSelectedRowId)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        selectionChanged();
        mOldSelectedPosition = mSelectedPosition;
        mOldSelectedRowId = mSelectedRowId;
        return;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        View view = getSelectedView();
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        int i;
        try
        {
            i = view.getVisibility();
        }
        // Misplaced declaration of an exception variable
        catch (AccessibilityEvent accessibilityevent)
        {
            try
            {
                throw accessibilityevent;
            }
            // Misplaced declaration of an exception variable
            catch (AccessibilityEvent accessibilityevent)
            {
                throw accessibilityevent;
            }
        }
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (view.dispatchPopulateAccessibilityEvent(accessibilityevent))
        {
            return true;
        }
        return false;
    }

    protected void dispatchRestoreInstanceState(SparseArray sparsearray)
    {
        dispatchThawSelfOnly(sparsearray);
    }

    protected void dispatchSaveInstanceState(SparseArray sparsearray)
    {
        dispatchFreezeSelfOnly(sparsearray);
    }

    int findSyncPosition()
    {
        int i2;
        int j2;
        i2 = AbsActionBarView.b;
        j2 = mItemCount;
        if (j2 != 0) goto _L2; else goto _L1
_L1:
        int i1 = -1;
_L4:
        return i1;
_L2:
        Adapter adapter;
        boolean flag;
        int k;
        long l2;
        long l3;
        l2 = mSyncRowId;
        int i = mSyncPosition;
        if (l2 == 0x8000000000000000L)
        {
            return -1;
        }
        k = Math.min(j2 - 1, Math.max(0, i));
        l3 = SystemClock.uptimeMillis();
        flag = false;
        adapter = getAdapter();
        if (adapter == null)
        {
            return -1;
        }
        break MISSING_BLOCK_LABEL_276;
_L10:
        int j;
        int l;
        int k1;
        j = l;
        k = k1;
_L8:
        if (SystemClock.uptimeMillis() > l3 + 100L)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = j;
        if (adapter.getItemId(j) == l2) goto _L4; else goto _L3
_L3:
label0:
        {
            boolean flag1;
            boolean flag2;
            int l1;
            boolean flag3;
            if (k == j2 - 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (l == 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag1 && flag2 && i2 == 0)
            {
                break; /* Loop/switch isn't completed */
            }
            if (!flag2)
            {
                flag3 = flag;
                k1 = k;
                l1 = j;
                if (!flag)
                {
                    break label0;
                }
                flag3 = flag;
                k1 = k;
                l1 = j;
                if (flag1)
                {
                    break label0;
                }
            }
            j = k + 1;
            flag3 = false;
            flag = false;
            if (i2 == 0)
            {
                break MISSING_BLOCK_LABEL_264;
            }
            l1 = j;
            k1 = j;
        }
        if (flag1) goto _L6; else goto _L5
_L5:
        flag = flag3;
        k = k1;
        j = l1;
        if (flag3) goto _L8; else goto _L7
_L7:
        flag = flag3;
        k = k1;
        j = l1;
        if (flag2) goto _L8; else goto _L6
_L6:
        l--;
        flag = true;
        if (i2 == 0) goto _L10; else goto _L9
_L9:
        return -1;
        int j1 = j;
        k = j;
        j = j1;
          goto _L8
        l = k;
        j = k;
          goto _L8
    }

    public abstract Adapter getAdapter();

    public int getCount()
    {
        return mItemCount;
    }

    public int getFirstVisiblePosition()
    {
        return mFirstPosition;
    }

    public long getItemIdAtPosition(int i)
    {
        Adapter adapter = getAdapter();
        if (adapter == null || i < 0)
        {
            return 0x8000000000000000L;
        } else
        {
            return adapter.getItemId(i);
        }
    }

    public int getLastVisiblePosition()
    {
        return (mFirstPosition + getChildCount()) - 1;
    }

    public long getSelectedItemId()
    {
        return mNextSelectedRowId;
    }

    public int getSelectedItemPosition()
    {
        return mNextSelectedPosition;
    }

    public abstract View getSelectedView();

    void handleDataChanged()
    {
        int i;
        int l;
        i = 0;
        l = mItemCount;
        if (l <= 0) goto _L2; else goto _L1
_L1:
        boolean flag;
        try
        {
            flag = mNeedSync;
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            throw unsupportedoperationexception;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        mNeedSync = false;
        i = findSyncPosition();
        if (i < 0 || lookForSelectablePosition(i, true) != i) goto _L4; else goto _L5
_L5:
        setNextSelectedPositionInt(i);
        i = 1;
_L7:
        if (i == 0)
        {
            int k = getSelectedItemPosition();
            int j = k;
            if (k >= l)
            {
                j = l - 1;
            }
            k = j;
            if (j < 0)
            {
                k = 0;
            }
            j = lookForSelectablePosition(k, true);
            if (j < 0)
            {
                j = lookForSelectablePosition(k, false);
            }
            if (j >= 0)
            {
                setNextSelectedPositionInt(j);
                checkSelectionChanged();
                i = 1;
            }
        }
_L2:
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        mSelectedPosition = -1;
        mSelectedRowId = 0x8000000000000000L;
        mNextSelectedPosition = -1;
        mNextSelectedRowId = 0x8000000000000000L;
        mNeedSync = false;
        checkSelectionChanged();
        return;
        UnsupportedOperationException unsupportedoperationexception1;
        unsupportedoperationexception1;
        throw unsupportedoperationexception1;
_L4:
        i = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    boolean isInFilterMode()
    {
        return false;
    }

    int lookForSelectablePosition(int i, boolean flag)
    {
        return i;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(mSelectionNotifier);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setScrollable(isScrollableForAccessibility());
        View view = getSelectedView();
        if (view != null)
        {
            try
            {
                accessibilityevent.setEnabled(view.isEnabled());
            }
            // Misplaced declaration of an exception variable
            catch (AccessibilityEvent accessibilityevent)
            {
                throw accessibilityevent;
            }
        }
        accessibilityevent.setCurrentItemIndex(getSelectedItemPosition());
        accessibilityevent.setFromIndex(getFirstVisiblePosition());
        accessibilityevent.setToIndex(getLastVisiblePosition());
        accessibilityevent.setItemCount(getCount());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        View view;
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setScrollable(isScrollableForAccessibility());
        view = getSelectedView();
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        accessibilitynodeinfo.setEnabled(view.isEnabled());
        return;
        accessibilitynodeinfo;
        throw accessibilitynodeinfo;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        mLayoutHeight = getHeight();
    }

    public boolean onRequestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        if (super.onRequestSendAccessibilityEvent(view, accessibilityevent))
        {
            AccessibilityEvent accessibilityevent1 = AccessibilityEvent.obtain();
            onInitializeAccessibilityEvent(accessibilityevent1);
            view.dispatchPopulateAccessibilityEvent(accessibilityevent1);
            accessibilityevent.appendRecord(accessibilityevent1);
            return true;
        } else
        {
            return false;
        }
    }

    void rememberSyncState()
    {
        int i = AbsActionBarView.b;
        View view;
        Adapter adapter;
        int j;
        int k;
        try
        {
            if (getChildCount() <= 0)
            {
                break MISSING_BLOCK_LABEL_180;
            }
            mNeedSync = true;
            mSyncHeight = mLayoutHeight;
            j = mSelectedPosition;
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            throw unsupportedoperationexception;
        }
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        view = getChildAt(mSelectedPosition - mFirstPosition);
        try
        {
            mSyncRowId = mNextSelectedRowId;
            mSyncPosition = mNextSelectedPosition;
        }
        catch (UnsupportedOperationException unsupportedoperationexception1)
        {
            throw unsupportedoperationexception1;
        }
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        mSpecificTop = view.getTop();
        mSyncMode = 0;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        view = getChildAt(0);
        adapter = getAdapter();
        j = mFirstPosition;
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        j = mFirstPosition;
        k = adapter.getCount();
        if (j < k)
        {
            UnsupportedOperationException unsupportedoperationexception2;
            try
            {
                mSyncRowId = adapter.getItemId(mFirstPosition);
            }
            catch (UnsupportedOperationException unsupportedoperationexception3)
            {
                throw unsupportedoperationexception3;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_155;
            }
        }
        mSyncRowId = -1L;
        try
        {
            mSyncPosition = mFirstPosition;
        }
        catch (UnsupportedOperationException unsupportedoperationexception4)
        {
            throw unsupportedoperationexception4;
        }
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        mSpecificTop = view.getTop();
        mSyncMode = 1;
        return;
        unsupportedoperationexception2;
        throw unsupportedoperationexception2;
        unsupportedoperationexception2;
        throw unsupportedoperationexception2;
    }

    public void removeAllViews()
    {
        throw new UnsupportedOperationException(z[0]);
    }

    public void removeView(View view)
    {
        throw new UnsupportedOperationException(z[5]);
    }

    public void removeViewAt(int i)
    {
        throw new UnsupportedOperationException(z[2]);
    }

    void selectionChanged()
    {
        OnItemSelectedListener onitemselectedlistener = mOnItemSelectedListener;
        if (onitemselectedlistener == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        boolean flag = mInLayout;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        flag = mBlockLayoutRequests;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        int i;
        try
        {
            if (mSelectionNotifier == null)
            {
                mSelectionNotifier = new SelectionNotifier(null);
            }
        }
        // Misplaced declaration of an exception variable
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            throw unsupportedoperationexception;
        }
        post(mSelectionNotifier);
        if (AbsActionBarView.b == 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        fireOnSelected();
        i = mSelectedPosition;
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        UnsupportedOperationException unsupportedoperationexception;
        boolean flag1;
        try
        {
            flag1 = isShown();
        }
        catch (UnsupportedOperationException unsupportedoperationexception1)
        {
            try
            {
                throw unsupportedoperationexception1;
            }
            catch (UnsupportedOperationException unsupportedoperationexception2)
            {
                throw unsupportedoperationexception2;
            }
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (!isInTouchMode())
        {
            sendAccessibilityEvent(4);
        }
        return;
        unsupportedoperationexception;
        throw unsupportedoperationexception;
        unsupportedoperationexception;
        throw unsupportedoperationexception;
        unsupportedoperationexception;
        throw unsupportedoperationexception;
        unsupportedoperationexception;
        throw unsupportedoperationexception;
        unsupportedoperationexception;
        throw unsupportedoperationexception;
    }

    public void setFocusable(boolean flag)
    {
        Adapter adapter;
        boolean flag2;
        flag2 = true;
        adapter = getAdapter();
        if (adapter == null) goto _L2; else goto _L1
_L1:
        int i;
        boolean flag1;
        try
        {
            i = adapter.getCount();
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            throw unsupportedoperationexception;
        }
        if (i != 0) goto _L3; else goto _L2
_L2:
        flag1 = true;
_L4:
        try
        {
            mDesiredFocusableState = flag;
        }
        catch (UnsupportedOperationException unsupportedoperationexception1)
        {
            throw unsupportedoperationexception1;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        mDesiredFocusableInTouchModeState = false;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        flag = flag2;
        if (flag1)
        {
            try
            {
                flag = isInFilterMode();
            }
            catch (UnsupportedOperationException unsupportedoperationexception2)
            {
                throw unsupportedoperationexception2;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_82;
            }
            flag = flag2;
        }
_L5:
        super.setFocusable(flag);
        return;
_L3:
        flag1 = false;
          goto _L4
        flag = false;
          goto _L5
    }

    public void setFocusableInTouchMode(boolean flag)
    {
        Adapter adapter;
        boolean flag2;
        flag2 = true;
        adapter = getAdapter();
        if (adapter == null) goto _L2; else goto _L1
_L1:
        int i;
        boolean flag1;
        try
        {
            i = adapter.getCount();
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            throw unsupportedoperationexception;
        }
        if (i != 0) goto _L3; else goto _L2
_L2:
        flag1 = true;
_L4:
        try
        {
            mDesiredFocusableInTouchModeState = flag;
        }
        catch (UnsupportedOperationException unsupportedoperationexception1)
        {
            throw unsupportedoperationexception1;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        mDesiredFocusableState = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        flag = flag2;
        if (flag1)
        {
            try
            {
                flag = isInFilterMode();
            }
            catch (UnsupportedOperationException unsupportedoperationexception2)
            {
                throw unsupportedoperationexception2;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_82;
            }
            flag = flag2;
        }
_L5:
        super.setFocusableInTouchMode(flag);
        return;
_L3:
        flag1 = false;
          goto _L4
        flag = false;
          goto _L5
    }

    void setNextSelectedPositionInt(int i)
    {
        boolean flag;
        mNextSelectedPosition = i;
        mNextSelectedRowId = getItemIdAtPosition(i);
        flag = mNeedSync;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        UnsupportedOperationException unsupportedoperationexception;
        int j;
        try
        {
            j = mSyncMode;
        }
        catch (UnsupportedOperationException unsupportedoperationexception1)
        {
            try
            {
                throw unsupportedoperationexception1;
            }
            catch (UnsupportedOperationException unsupportedoperationexception2)
            {
                throw unsupportedoperationexception2;
            }
        }
        if (j != 0 || i < 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        mSyncPosition = i;
        mSyncRowId = mNextSelectedRowId;
        return;
        unsupportedoperationexception;
        throw unsupportedoperationexception;
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        throw new RuntimeException(z[1]);
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onitemselectedlistener)
    {
        mOnItemSelectedListener = onitemselectedlistener;
    }

    void setSelectedPositionInt(int i)
    {
        mSelectedPosition = i;
        mSelectedRowId = getItemIdAtPosition(i);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = ".W1SE9s0Pe5W+O\033u\0225O\0232](\034@)B,SA(W8\034Z2\022\035XR,F9Ne5W+";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\030]2\033G|Q=P_|A9H|2q0UP7~5OG9\\9N\023:].\034R2\022\035XR,F9Ne5W+\022\023\005])\034C.]>]Q0K|KR2F|OV(}2uG9_\037PZ?Y\020U@(W2YA|[2OG9S8";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ".W1SE9d5YD\035FtU](\033|U@|\\3H\023/G,L\\.F9X\0235\\|}W=B(YA\n[9K";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "=V8jZ9EtjZ9Ep\034Z2Fp\034\177=K3IG\fS.]^/\033|U@|\\3H\023/G,L\\.F9X\0235\\|}W=B(YA\n[9K";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "=V8jZ9EtjZ9Eu\034Z/\0222SG|A)LC3@(YW|[2\034r8S,HV.d5YD";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = ".W1SE9d5YDtd5YDu\0225O\0232](\034@)B,SA(W8\034Z2\022\035XR,F9Ne5W+";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "=V8jZ9EtjZ9Ep\034\177=K3IG\fS.]^/\033|U@|\\3H\023/G,L\\.F9X\0235\\|}W=B(YA\n[9K";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "=V8jZ9EtjZ9Ep\034Z2Fu\034Z/\0222SG|A)LC3@(YW|[2\034r8S,HV.d5YD";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 286
    //                   2 293
    //                   3 300;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_300;
_L3:
        byte byte1 = 51;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 92;
          goto _L9
_L5:
        byte1 = 50;
          goto _L9
_L6:
        byte1 = 92;
          goto _L9
        byte1 = 60;
          goto _L9
    }




    private class OnItemSelectedListener
    {

        public abstract void onItemSelected(IcsAdapterView icsadapterview, View view, int i, long l);

        public abstract void onNothingSelected(IcsAdapterView icsadapterview);
    }


    private class SelectionNotifier
        implements Runnable
    {

        final IcsAdapterView this$0;

        public void run()
        {
label0:
            {
                if (mDataChanged)
                {
                    if (getAdapter() == null)
                    {
                        break label0;
                    }
                    post(this);
                    if (AbsActionBarView.b == 0)
                    {
                        break label0;
                    }
                }
                fireOnSelected();
            }
        }

        private SelectionNotifier()
        {
            this$0 = IcsAdapterView.this;
            super();
        }

        SelectionNotifier(_cls1 _pcls1)
        {
            this();
        }
    }

}
