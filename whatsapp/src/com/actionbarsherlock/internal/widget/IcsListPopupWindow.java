// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            AbsActionBarView

public class IcsListPopupWindow
{

    private ListAdapter mAdapter;
    private Context mContext;
    private View mDropDownAnchorView;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    private DropDownListView mDropDownList;
    private Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private Handler mHandler;
    private final ListSelectorHider mHideSelector;
    private android.widget.AdapterView.OnItemClickListener mItemClickListener;
    private android.widget.AdapterView.OnItemSelectedListener mItemSelectedListener;
    private int mListItemExpandMaximum;
    private boolean mModal;
    private DataSetObserver mObserver;
    private PopupWindow mPopup;
    private int mPromptPosition;
    private View mPromptView;
    private final ResizePopupRunnable mResizePopupRunnable;
    private final PopupScrollListener mScrollListener;
    private Rect mTempRect;
    private final PopupTouchInterceptor mTouchInterceptor;

    public IcsListPopupWindow(Context context)
    {
        this(context, null, com.actionbarsherlock.R.attr.listPopupWindowStyle);
    }

    public IcsListPopupWindow(Context context, AttributeSet attributeset, int i)
    {
        mDropDownHeight = -2;
        mDropDownWidth = -2;
        mListItemExpandMaximum = 0x7fffffff;
        mPromptPosition = 0;
        mResizePopupRunnable = new ResizePopupRunnable(null);
        mTouchInterceptor = new PopupTouchInterceptor(null);
        mScrollListener = new PopupScrollListener(null);
        mHideSelector = new ListSelectorHider(null);
        mHandler = new Handler();
        mTempRect = new Rect();
        mContext = context;
        mPopup = new PopupWindow(context, attributeset, i);
        mPopup.setInputMethodMode(1);
    }

    public IcsListPopupWindow(Context context, AttributeSet attributeset, int i, int j)
    {
label0:
        {
            super();
            mDropDownHeight = -2;
            mDropDownWidth = -2;
            mListItemExpandMaximum = 0x7fffffff;
            mPromptPosition = 0;
            mResizePopupRunnable = new ResizePopupRunnable(null);
            mTouchInterceptor = new PopupTouchInterceptor(null);
            mScrollListener = new PopupScrollListener(null);
            mHideSelector = new ListSelectorHider(null);
            mHandler = new Handler();
            mTempRect = new Rect();
            mContext = context;
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                mPopup = new PopupWindow(new ContextThemeWrapper(context, j), attributeset, i);
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            mPopup = new PopupWindow(context, attributeset, i, j);
        }
        mPopup.setInputMethodMode(1);
    }

    private int buildDropDown()
    {
        int j;
        boolean flag1;
        flag1 = true;
        j = AbsActionBarView.b;
        if (mDropDownList != null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        View view;
        android.widget.LinearLayout.LayoutParams layoutparams;
        int i;
        boolean flag;
        obj1 = mContext;
        int k;
        if (!mModal)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mDropDownList = new DropDownListView(((Context) (obj1)), flag);
        if (mDropDownListHighlight != null)
        {
            mDropDownList.setSelector(mDropDownListHighlight);
        }
        mDropDownList.setAdapter(mAdapter);
        mDropDownList.setOnItemClickListener(mItemClickListener);
        mDropDownList.setFocusable(true);
        mDropDownList.setFocusableInTouchMode(true);
        mDropDownList.setOnItemSelectedListener(new _cls1());
        mDropDownList.setOnScrollListener(mScrollListener);
        if (mItemSelectedListener != null)
        {
            mDropDownList.setOnItemSelectedListener(mItemSelectedListener);
        }
        obj = mDropDownList;
        view = mPromptView;
        if (view == null) goto _L4; else goto _L3
_L3:
        obj1 = new LinearLayout(((Context) (obj1)));
        ((LinearLayout) (obj1)).setOrientation(1);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F);
        mPromptPosition;
        JVM INSTR tableswitch 0 1: default 212
    //                   0 458
    //                   1 441;
           goto _L5 _L6 _L7
_L5:
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(mDropDownWidth, 0x80000000), 0);
        obj = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        i = view.getMeasuredHeight();
        k = ((android.widget.LinearLayout.LayoutParams) (obj)).topMargin;
        i = ((android.widget.LinearLayout.LayoutParams) (obj)).bottomMargin + (i + k);
        obj = obj1;
_L10:
        mPopup.setContentView(((View) (obj)));
        if (j == 0) goto _L9; else goto _L8
_L8:
        obj = (ViewGroup)mPopup.getContentView();
        obj = mPromptView;
        if (obj != null)
        {
            obj1 = (android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams();
            i = ((View) (obj)).getMeasuredHeight();
            j = ((android.widget.LinearLayout.LayoutParams) (obj1)).topMargin;
            i = ((android.widget.LinearLayout.LayoutParams) (obj1)).bottomMargin + (i + j);
        }
          goto _L9
_L7:
        ((LinearLayout) (obj1)).addView(((View) (obj)), layoutparams);
        ((LinearLayout) (obj1)).addView(view);
        if (j == 0) goto _L5; else goto _L6
_L6:
        ((LinearLayout) (obj1)).addView(view);
        ((LinearLayout) (obj1)).addView(((View) (obj)), layoutparams);
          goto _L5
_L9:
        obj = mPopup.getBackground();
        int l;
        int i1;
        if (obj != null)
        {
            ((Drawable) (obj)).getPadding(mTempRect);
            j = mTempRect.top;
            k = mTempRect.bottom;
            if (!mDropDownVerticalOffsetSet)
            {
                mDropDownVerticalOffset = -mTempRect.top;
            }
            j += k;
        } else
        {
            j = 0;
        }
        if (mPopup.getInputMethodMode() == 2)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        l = getMaxAvailableHeight(mDropDownAnchorView, mDropDownVerticalOffset, flag);
        if (mDropDownHeight == -1)
        {
            return l + j;
        }
        i1 = measureHeightOfChildren(0, 0, -1, l - i, -1);
        l = i;
        if (i1 > 0)
        {
            l = i + j;
        }
        return i1 + l;
_L4:
        i = 0;
          goto _L10
_L2:
        i = 0;
          goto _L8
    }

    private int getMaxAvailableHeight(View view, int i, boolean flag)
    {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        int j = rect.bottom;
        if (flag)
        {
            j = view.getContext().getResources().getDisplayMetrics().heightPixels;
        }
        j = Math.max(j - (ai[1] + view.getHeight()) - i, (ai[1] - rect.top) + i);
        i = j;
        if (mPopup.getBackground() != null)
        {
            mPopup.getBackground().getPadding(mTempRect);
            i = j - (mTempRect.top + mTempRect.bottom);
        }
        return i;
    }

    private boolean isInputMethodNotNeeded()
    {
        return mPopup.getInputMethodMode() == 2;
    }

    private int measureHeightOfChildren(int i, int j, int k, int l, int i1)
    {
        ListAdapter listadapter;
        boolean flag;
        int l2;
        flag = false;
        l2 = AbsActionBarView.b;
        listadapter = mAdapter;
        if (listadapter != null) goto _L2; else goto _L1
_L1:
        i = mDropDownList.getListPaddingTop() + mDropDownList.getListPaddingBottom();
_L4:
        return i;
_L2:
        int k2 = mDropDownList.getListPaddingTop() + mDropDownList.getListPaddingBottom();
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        if (mDropDownList.getDividerHeight() > 0 && mDropDownList.getDivider() != null)
        {
            k1 = mDropDownList.getDividerHeight();
        } else
        {
            k1 = 0;
        }
        j1 = k2;
        l1 = ((flag) ? 1 : 0);
        i2 = j;
        j2 = k;
        if (k == -1)
        {
            j2 = listadapter.getCount() - 1;
            i2 = j;
            l1 = ((flag) ? 1 : 0);
            j1 = k2;
        }
        do
        {
            j = j1;
            if (i2 > j2)
            {
                break;
            }
            View view = mAdapter.getView(i2, null, mDropDownList);
            if (mDropDownList.getCacheColorHint() != 0)
            {
                view.setDrawingCacheBackgroundColor(mDropDownList.getCacheColorHint());
            }
            measureScrapChild(view, i2, i);
            j = j1;
            if (i2 > 0)
            {
                j = j1 + k1;
            }
            j += view.getMeasuredHeight();
            if (j >= l)
            {
                i = l;
                if (i1 >= 0)
                {
                    i = l;
                    if (i2 > i1)
                    {
                        i = l;
                        if (l1 > 0)
                        {
                            i = l;
                            if (j != l)
                            {
                                return l1;
                            }
                        }
                    }
                }
                continue; /* Loop/switch isn't completed */
            }
            k = l1;
            if (i1 >= 0)
            {
                k = l1;
                if (i2 >= i1)
                {
                    k = j;
                }
            }
            i2++;
            j1 = j;
            l1 = k;
        } while (l2 == 0);
        return j;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void measureScrapChild(View view, int i, int j)
    {
label0:
        {
            android.widget.AbsListView.LayoutParams layoutparams1 = (android.widget.AbsListView.LayoutParams)view.getLayoutParams();
            android.widget.AbsListView.LayoutParams layoutparams = layoutparams1;
            if (layoutparams1 == null)
            {
                layoutparams = new android.widget.AbsListView.LayoutParams(-1, -2, 0);
                view.setLayoutParams(layoutparams);
            }
            j = ViewGroup.getChildMeasureSpec(j, mDropDownList.getPaddingLeft() + mDropDownList.getPaddingRight(), layoutparams.width);
            i = layoutparams.height;
            if (i > 0)
            {
                i = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(j, i);
    }

    public void clearListSelection()
    {
        DropDownListView dropdownlistview = mDropDownList;
        if (dropdownlistview != null)
        {
            dropdownlistview.mListSelectionHidden = true;
            dropdownlistview.requestLayout();
        }
    }

    public void dismiss()
    {
        mPopup.dismiss();
        if (mPromptView != null)
        {
            android.view.ViewParent viewparent = mPromptView.getParent();
            if (viewparent instanceof ViewGroup)
            {
                ((ViewGroup)viewparent).removeView(mPromptView);
            }
        }
        mPopup.setContentView(null);
        mDropDownList = null;
        mHandler.removeCallbacks(mResizePopupRunnable);
    }

    public ListView getListView()
    {
        return mDropDownList;
    }

    public boolean isShowing()
    {
        return mPopup.isShowing();
    }

    public void setAdapter(ListAdapter listadapter)
    {
label0:
        {
            if (mObserver == null)
            {
                mObserver = new PopupDataSetObserver(null);
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            if (mAdapter != null)
            {
                mAdapter.unregisterDataSetObserver(mObserver);
            }
        }
        mAdapter = listadapter;
        if (mAdapter != null)
        {
            listadapter.registerDataSetObserver(mObserver);
        }
        if (mDropDownList != null)
        {
            mDropDownList.setAdapter(mAdapter);
        }
    }

    public void setAnchorView(View view)
    {
        mDropDownAnchorView = view;
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        mPopup.setBackgroundDrawable(drawable);
    }

    public void setContentWidth(int i)
    {
label0:
        {
            Drawable drawable = mPopup.getBackground();
            if (drawable != null)
            {
                drawable.getPadding(mTempRect);
                mDropDownWidth = mTempRect.left + mTempRect.right + i;
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            mDropDownWidth = i;
        }
    }

    public void setHorizontalOffset(int i)
    {
        mDropDownHorizontalOffset = i;
    }

    public void setInputMethodMode(int i)
    {
        mPopup.setInputMethodMode(i);
    }

    public void setModal(boolean flag)
    {
        mModal = true;
        mPopup.setFocusable(flag);
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        mPopup.setOnDismissListener(ondismisslistener);
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        mItemClickListener = onitemclicklistener;
    }

    public void setPromptPosition(int i)
    {
        mPromptPosition = i;
    }

    public void setVerticalOffset(int i)
    {
        mDropDownVerticalOffset = i;
        mDropDownVerticalOffsetSet = true;
    }

    public void show()
    {
        int l;
        boolean flag;
        int i1;
        boolean flag1;
        flag = false;
        i1 = AbsActionBarView.b;
        l = buildDropDown();
        flag1 = isInputMethodNotNeeded();
        if (!mPopup.isShowing())
        {
            break MISSING_BLOCK_LABEL_449;
        }
        if (mDropDownWidth == -1 && i1 == 0) goto _L2; else goto _L1
_L1:
        int i;
label0:
        {
            if (mDropDownWidth == -2)
            {
                i = mDropDownAnchorView.getWidth();
                if (i1 == 0)
                {
                    break label0;
                }
            }
            i = mDropDownWidth;
        }
_L15:
        int j;
label1:
        {
            int k;
            if (mDropDownHeight == -1)
            {
                if (flag1)
                {
                    k = l;
                } else
                {
                    k = -1;
                }
                if (flag1)
                {
                    PopupWindow popupwindow = mPopup;
                    if (mDropDownWidth == -1)
                    {
                        j = -1;
                    } else
                    {
                        j = 0;
                    }
                    popupwindow.setWindowLayoutMode(j, 0);
                    j = k;
                    if (i1 == 0)
                    {
                        break label1;
                    }
                }
                popupwindow = mPopup;
                j = ((flag) ? 1 : 0);
                if (mDropDownWidth == -1)
                {
                    j = -1;
                }
                popupwindow.setWindowLayoutMode(j, -1);
                j = k;
                if (i1 == 0)
                {
                    break label1;
                }
            }
            if (mDropDownHeight != -2 || i1 != 0)
            {
                j = mDropDownHeight;
            } else
            {
                j = l;
            }
        }
        mPopup.setOutsideTouchable(true);
        mPopup.update(mDropDownAnchorView, mDropDownHorizontalOffset, mDropDownVerticalOffset, i, j);
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        if (mDropDownWidth != -1) goto _L6; else goto _L5
_L5:
        if (i1 == 0) goto _L8; else goto _L7
_L7:
        i = -1;
_L6:
label2:
        {
            if (mDropDownWidth == -2)
            {
                mPopup.setWidth(mDropDownAnchorView.getWidth());
                k = i;
                if (i1 == 0)
                {
                    break label2;
                }
            }
            mPopup.setWidth(mDropDownWidth);
            k = i;
        }
_L14:
        if (mDropDownHeight != -1) goto _L10; else goto _L9
_L9:
        if (i1 == 0) goto _L12; else goto _L11
_L11:
        j = -1;
_L10:
label3:
        {
            if (mDropDownHeight == -2)
            {
                mPopup.setHeight(l);
                i = j;
                if (i1 == 0)
                {
                    break label3;
                }
            }
            mPopup.setHeight(mDropDownHeight);
            i = j;
        }
_L13:
        mPopup.setWindowLayoutMode(k, i);
        mPopup.setOutsideTouchable(true);
        mPopup.setTouchInterceptor(mTouchInterceptor);
        mPopup.showAsDropDown(mDropDownAnchorView, mDropDownHorizontalOffset, mDropDownVerticalOffset);
        mDropDownList.setSelection(-1);
        if (!mModal || mDropDownList.isInTouchMode())
        {
            clearListSelection();
        }
        if (!mModal)
        {
            mHandler.post(mHideSelector);
        }
_L4:
        return;
_L12:
        i = -1;
        if (true) goto _L13; else goto _L8
_L8:
        k = -1;
        if (true) goto _L14; else goto _L2
_L2:
        i = -1;
          goto _L15
        j = 0;
        i = 0;
          goto _L3
    }







    private class ResizePopupRunnable
        implements Runnable
    {

        final IcsListPopupWindow this$0;

        public void run()
        {
            if (mDropDownList != null && mDropDownList.getCount() > mDropDownList.getChildCount() && mDropDownList.getChildCount() <= mListItemExpandMaximum)
            {
                mPopup.setInputMethodMode(2);
                show();
            }
        }

        private ResizePopupRunnable()
        {
            this$0 = IcsListPopupWindow.this;
            super();
        }

        ResizePopupRunnable(_cls1 _pcls1)
        {
            this();
        }
    }


    private class PopupTouchInterceptor
        implements android.view.View.OnTouchListener
    {

        final IcsListPopupWindow this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
label0:
            {
                int i = motionevent.getAction();
                int j = (int)motionevent.getX();
                int k = (int)motionevent.getY();
                if (i == 0 && mPopup != null && mPopup.isShowing() && j >= 0 && j < mPopup.getWidth() && k >= 0 && k < mPopup.getHeight())
                {
                    mHandler.postDelayed(mResizePopupRunnable, 250L);
                    if (AbsActionBarView.b == 0)
                    {
                        break label0;
                    }
                }
                if (i == 1)
                {
                    mHandler.removeCallbacks(mResizePopupRunnable);
                }
            }
            return false;
        }

        private PopupTouchInterceptor()
        {
            this$0 = IcsListPopupWindow.this;
            super();
        }

        PopupTouchInterceptor(_cls1 _pcls1)
        {
            this();
        }
    }


    private class PopupScrollListener
        implements android.widget.AbsListView.OnScrollListener
    {

        final IcsListPopupWindow this$0;

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
        }

        public void onScrollStateChanged(AbsListView abslistview, int i)
        {
            if (i == 1 && !isInputMethodNotNeeded() && mPopup.getContentView() != null)
            {
                mHandler.removeCallbacks(mResizePopupRunnable);
                mResizePopupRunnable.run();
            }
        }

        private PopupScrollListener()
        {
            this$0 = IcsListPopupWindow.this;
            super();
        }

        PopupScrollListener(_cls1 _pcls1)
        {
            this();
        }
    }


    private class ListSelectorHider
        implements Runnable
    {

        final IcsListPopupWindow this$0;

        public void run()
        {
            clearListSelection();
        }

        private ListSelectorHider()
        {
            this$0 = IcsListPopupWindow.this;
            super();
        }

        ListSelectorHider(_cls1 _pcls1)
        {
            this();
        }
    }


    private class DropDownListView extends ListView
    {

        private boolean mHijackFocus;
        private boolean mListSelectionHidden;

        public boolean hasFocus()
        {
            return mHijackFocus || super.hasFocus();
        }

        public boolean hasWindowFocus()
        {
            return mHijackFocus || super.hasWindowFocus();
        }

        public boolean isFocused()
        {
            return mHijackFocus || super.isFocused();
        }

        public boolean isInTouchMode()
        {
            return mHijackFocus && mListSelectionHidden || super.isInTouchMode();
        }


/*
        static boolean access$502(DropDownListView dropdownlistview, boolean flag)
        {
            dropdownlistview.mListSelectionHidden = flag;
            return flag;
        }

*/

        public DropDownListView(Context context, boolean flag)
        {
            super(context, null, com.actionbarsherlock.R.attr.dropDownListViewStyle);
            mHijackFocus = flag;
            setCacheColorHint(0);
        }
    }


    private class _cls1
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        final IcsListPopupWindow this$0;

        public void onItemSelected(AdapterView adapterview, View view, int i, long l)
        {
            if (i != -1)
            {
                adapterview = mDropDownList;
                if (adapterview != null)
                {
                    adapterview.mListSelectionHidden = false;
                }
            }
        }

        public void onNothingSelected(AdapterView adapterview)
        {
        }

        _cls1()
        {
            this$0 = IcsListPopupWindow.this;
            super();
        }
    }


    private class PopupDataSetObserver extends DataSetObserver
    {

        final IcsListPopupWindow this$0;

        public void onChanged()
        {
            if (isShowing())
            {
                show();
            }
        }

        public void onInvalidated()
        {
            dismiss();
        }

        private PopupDataSetObserver()
        {
            this$0 = IcsListPopupWindow.this;
            super();
        }

        PopupDataSetObserver(_cls1 _pcls1)
        {
            this();
        }
    }

}
