// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.text.TextUtilsCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.support.v4.widget.PopupWindowCompat;
import android.support.v7.internal.widget.AppCompatPopupWindow;
import android.support.v7.internal.widget.ListViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class ListPopupWindow
{
    private static class DropDownListView extends ListViewCompat
    {

        private ViewPropertyAnimatorCompat mClickAnimation;
        private boolean mDrawsInPressedState;
        private boolean mHijackFocus;
        private boolean mListSelectionHidden;
        private ListViewAutoScrollHelper mScrollHelper;

        private void clearPressedItem()
        {
            mDrawsInPressedState = false;
            setPressed(false);
            drawableStateChanged();
            if (mClickAnimation != null)
            {
                mClickAnimation.cancel();
                mClickAnimation = null;
            }
        }

        private void clickPressedItem(View view, int i)
        {
            performItemClick(view, i, getItemIdAtPosition(i));
        }

        private void setPressedItem(View view, int i, float f, float f1)
        {
            mDrawsInPressedState = true;
            setPressed(true);
            layoutChildren();
            setSelection(i);
            positionSelectorLikeTouchCompat(i, view, f, f1);
            setSelectorEnabled(false);
            refreshDrawableState();
        }

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

        public boolean onForwardedEvent(MotionEvent motionevent, int i)
        {
            boolean flag;
            int j;
            boolean flag1;
            boolean flag2;
            flag1 = true;
            flag2 = true;
            flag = false;
            j = MotionEventCompat.getActionMasked(motionevent);
            j;
            JVM INSTR tableswitch 1 3: default 44
        //                       1 119
        //                       2 122
        //                       3 110;
               goto _L1 _L2 _L3 _L4
_L1:
            flag1 = flag2;
            i = ((flag) ? 1 : 0);
_L10:
            if (!flag1 || i != 0)
            {
                clearPressedItem();
            }
            if (!flag1) goto _L6; else goto _L5
_L5:
            if (mScrollHelper == null)
            {
                mScrollHelper = new ListViewAutoScrollHelper(this);
            }
            mScrollHelper.setEnabled(true);
            mScrollHelper.onTouch(this, motionevent);
_L8:
            return flag1;
_L4:
            flag1 = false;
            i = ((flag) ? 1 : 0);
            continue; /* Loop/switch isn't completed */
_L2:
            flag1 = false;
_L3:
            int k = motionevent.findPointerIndex(i);
            if (k < 0)
            {
                flag1 = false;
                i = ((flag) ? 1 : 0);
            } else
            {
                i = (int)motionevent.getX(k);
                int l = (int)motionevent.getY(k);
                k = pointToPosition(i, l);
                if (k == -1)
                {
                    i = 1;
                } else
                {
                    View view = getChildAt(k - getFirstVisiblePosition());
                    setPressedItem(view, k, i, l);
                    boolean flag3 = true;
                    i = ((flag) ? 1 : 0);
                    flag1 = flag3;
                    if (j == 1)
                    {
                        clickPressedItem(view, k);
                        i = ((flag) ? 1 : 0);
                        flag1 = flag3;
                    }
                }
            }
            continue; /* Loop/switch isn't completed */
_L6:
            if (mScrollHelper == null) goto _L8; else goto _L7
_L7:
            mScrollHelper.setEnabled(false);
            return flag1;
            if (true) goto _L10; else goto _L9
_L9:
        }

        protected boolean touchModeDrawsInPressedStateCompat()
        {
            return mDrawsInPressedState || super.touchModeDrawsInPressedStateCompat();
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
            super(context, null, android.support.v7.appcompat.R.attr.dropDownListViewStyle);
            mHijackFocus = flag;
            setCacheColorHint(0);
        }
    }

    public static abstract class ForwardingListener
        implements android.view.View.OnTouchListener
    {

        private int mActivePointerId;
        private Runnable mDisallowIntercept;
        private boolean mForwarding;
        private final int mLongPressTimeout;
        private final float mScaledTouchSlop;
        private final View mSrc;
        private final int mTapTimeout = ViewConfiguration.getTapTimeout();
        private final int mTmpLocation[] = new int[2];
        private Runnable mTriggerLongPress;
        private boolean mWasLongPress;

        private void clearCallbacks()
        {
            if (mTriggerLongPress != null)
            {
                mSrc.removeCallbacks(mTriggerLongPress);
            }
            if (mDisallowIntercept != null)
            {
                mSrc.removeCallbacks(mDisallowIntercept);
            }
        }

        private void onLongPress()
        {
            clearCallbacks();
            View view;
            for (view = mSrc; !view.isEnabled() || view.isLongClickable() || !onForwardingStarted();)
            {
                return;
            }

            view.getParent().requestDisallowInterceptTouchEvent(true);
            long l = SystemClock.uptimeMillis();
            MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
            view.onTouchEvent(motionevent);
            motionevent.recycle();
            mForwarding = true;
            mWasLongPress = true;
        }

        private boolean onTouchForwarded(MotionEvent motionevent)
        {
            boolean flag = true;
            View view = mSrc;
            Object obj = getPopup();
            if (obj != null && ((ListPopupWindow) (obj)).isShowing())
            {
                if ((obj = ((ListPopupWindow) (obj)).mDropDownList) != null && ((DropDownListView) (obj)).isShown())
                {
                    MotionEvent motionevent1 = MotionEvent.obtainNoHistory(motionevent);
                    toGlobalMotionEvent(view, motionevent1);
                    toLocalMotionEvent(((View) (obj)), motionevent1);
                    boolean flag1 = ((DropDownListView) (obj)).onForwardedEvent(motionevent1, mActivePointerId);
                    motionevent1.recycle();
                    int i = MotionEventCompat.getActionMasked(motionevent);
                    if (i != 1 && i != 3)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    if (!flag1 || !i)
                    {
                        flag = false;
                    }
                    return flag;
                }
            }
            return false;
        }

        private boolean onTouchObserved(MotionEvent motionevent)
        {
            View view = mSrc;
            if (view.isEnabled()) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            switch (MotionEventCompat.getActionMasked(motionevent))
            {
            default:
                return false;

            case 0: // '\0'
                mActivePointerId = motionevent.getPointerId(0);
                mWasLongPress = false;
                if (mDisallowIntercept == null)
                {
                    mDisallowIntercept = new DisallowIntercept();
                }
                view.postDelayed(mDisallowIntercept, mTapTimeout);
                if (mTriggerLongPress == null)
                {
                    mTriggerLongPress = new TriggerLongPress();
                }
                view.postDelayed(mTriggerLongPress, mLongPressTimeout);
                return false;

            case 2: // '\002'
                int i = motionevent.findPointerIndex(mActivePointerId);
                if (i >= 0 && !pointInView(view, motionevent.getX(i), motionevent.getY(i), mScaledTouchSlop))
                {
                    clearCallbacks();
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                break;

            case 1: // '\001'
            case 3: // '\003'
                clearCallbacks();
                return false;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        private static boolean pointInView(View view, float f, float f1, float f2)
        {
            return f >= -f2 && f1 >= -f2 && f < (float)(view.getRight() - view.getLeft()) + f2 && f1 < (float)(view.getBottom() - view.getTop()) + f2;
        }

        private boolean toGlobalMotionEvent(View view, MotionEvent motionevent)
        {
            int ai[] = mTmpLocation;
            view.getLocationOnScreen(ai);
            motionevent.offsetLocation(ai[0], ai[1]);
            return true;
        }

        private boolean toLocalMotionEvent(View view, MotionEvent motionevent)
        {
            int ai[] = mTmpLocation;
            view.getLocationOnScreen(ai);
            motionevent.offsetLocation(-ai[0], -ai[1]);
            return true;
        }

        public abstract ListPopupWindow getPopup();

        protected boolean onForwardingStarted()
        {
            ListPopupWindow listpopupwindow = getPopup();
            if (listpopupwindow != null && !listpopupwindow.isShowing())
            {
                listpopupwindow.show();
            }
            return true;
        }

        protected boolean onForwardingStopped()
        {
            ListPopupWindow listpopupwindow = getPopup();
            if (listpopupwindow != null && listpopupwindow.isShowing())
            {
                listpopupwindow.dismiss();
            }
            return true;
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            boolean flag2;
            boolean flag3;
            flag2 = false;
            flag3 = mForwarding;
            if (!flag3) goto _L2; else goto _L1
_L1:
            boolean flag;
            if (mWasLongPress)
            {
                flag = onTouchForwarded(motionevent);
            } else
            if (onTouchForwarded(motionevent) || !onForwardingStopped())
            {
                flag = true;
            } else
            {
                flag = false;
            }
_L4:
label0:
            {
                mForwarding = flag;
                if (!flag)
                {
                    flag = flag2;
                    if (!flag3)
                    {
                        break label0;
                    }
                }
                flag = true;
            }
            return flag;
_L2:
            boolean flag1;
            if (onTouchObserved(motionevent) && onForwardingStarted())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag = flag1;
            if (flag1)
            {
                long l = SystemClock.uptimeMillis();
                view = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
                mSrc.onTouchEvent(view);
                view.recycle();
                flag = flag1;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }



        public ForwardingListener(View view)
        {
            mSrc = view;
            mScaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mLongPressTimeout = (mTapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
        }
    }

    private class ForwardingListener.DisallowIntercept
        implements Runnable
    {

        final ForwardingListener this$0;

        public void run()
        {
            mSrc.getParent().requestDisallowInterceptTouchEvent(true);
        }

        private ForwardingListener.DisallowIntercept()
        {
            this$0 = ForwardingListener.this;
            super();
        }

    }

    private class ForwardingListener.TriggerLongPress
        implements Runnable
    {

        final ForwardingListener this$0;

        public void run()
        {
            onLongPress();
        }

        private ForwardingListener.TriggerLongPress()
        {
            this$0 = ForwardingListener.this;
            super();
        }

    }

    private class ListSelectorHider
        implements Runnable
    {

        final ListPopupWindow this$0;

        public void run()
        {
            clearListSelection();
        }

        private ListSelectorHider()
        {
            this$0 = ListPopupWindow.this;
            super();
        }

    }

    private class PopupDataSetObserver extends DataSetObserver
    {

        final ListPopupWindow this$0;

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
            this$0 = ListPopupWindow.this;
            super();
        }

    }

    private class PopupScrollListener
        implements android.widget.AbsListView.OnScrollListener
    {

        final ListPopupWindow this$0;

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
            this$0 = ListPopupWindow.this;
            super();
        }

    }

    private class PopupTouchInterceptor
        implements android.view.View.OnTouchListener
    {

        final ListPopupWindow this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            int i;
            int j;
            int k;
            i = motionevent.getAction();
            j = (int)motionevent.getX();
            k = (int)motionevent.getY();
            if (i != 0 || mPopup == null || !mPopup.isShowing() || j < 0 || j >= mPopup.getWidth() || k < 0 || k >= mPopup.getHeight()) goto _L2; else goto _L1
_L1:
            mHandler.postDelayed(mResizePopupRunnable, 250L);
_L4:
            return false;
_L2:
            if (i == 1)
            {
                mHandler.removeCallbacks(mResizePopupRunnable);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        private PopupTouchInterceptor()
        {
            this$0 = ListPopupWindow.this;
            super();
        }

    }

    private class ResizePopupRunnable
        implements Runnable
    {

        final ListPopupWindow this$0;

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
            this$0 = ListPopupWindow.this;
            super();
        }

    }


    private static final boolean DEBUG = false;
    private static final int EXPAND_LIST_TIMEOUT = 250;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int MATCH_PARENT = -1;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    private static final String TAG = "ListPopupWindow";
    public static final int WRAP_CONTENT = -2;
    private static Method sClipToWindowEnabledMethod;
    private ListAdapter mAdapter;
    private Context mContext;
    private boolean mDropDownAlwaysVisible;
    private View mDropDownAnchorView;
    private int mDropDownGravity;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    private DropDownListView mDropDownList;
    private Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private boolean mForceIgnoreOutsideTouch;
    private Handler mHandler;
    private final ListSelectorHider mHideSelector;
    private android.widget.AdapterView.OnItemClickListener mItemClickListener;
    private android.widget.AdapterView.OnItemSelectedListener mItemSelectedListener;
    private int mLayoutDirection;
    int mListItemExpandMaximum;
    private boolean mModal;
    private DataSetObserver mObserver;
    private PopupWindow mPopup;
    private int mPromptPosition;
    private View mPromptView;
    private final ResizePopupRunnable mResizePopupRunnable;
    private final PopupScrollListener mScrollListener;
    private Runnable mShowDropDownRunnable;
    private Rect mTempRect;
    private final PopupTouchInterceptor mTouchInterceptor;

    public ListPopupWindow(Context context)
    {
        this(context, null, android.support.v7.appcompat.R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeset, int i)
    {
        this(context, attributeset, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeset, int i, int j)
    {
        mDropDownHeight = -2;
        mDropDownWidth = -2;
        mDropDownGravity = 0;
        mDropDownAlwaysVisible = false;
        mForceIgnoreOutsideTouch = false;
        mListItemExpandMaximum = 0x7fffffff;
        mPromptPosition = 0;
        mResizePopupRunnable = new ResizePopupRunnable();
        mTouchInterceptor = new PopupTouchInterceptor();
        mScrollListener = new PopupScrollListener();
        mHideSelector = new ListSelectorHider();
        mHandler = new Handler();
        mTempRect = new Rect();
        mContext = context;
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ListPopupWindow, i, j);
        mDropDownHorizontalOffset = typedarray.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        mDropDownVerticalOffset = typedarray.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (mDropDownVerticalOffset != 0)
        {
            mDropDownVerticalOffsetSet = true;
        }
        typedarray.recycle();
        mPopup = new AppCompatPopupWindow(context, attributeset, i);
        mPopup.setInputMethodMode(1);
        mLayoutDirection = TextUtilsCompat.getLayoutDirectionFromLocale(mContext.getResources().getConfiguration().locale);
    }

    private int buildDropDown()
    {
        int i;
        int j;
        j = 0;
        i = 0;
        if (mDropDownList != null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        View view;
        Object obj2;
        int k;
        int l;
        obj2 = mContext;
        mShowDropDownRunnable = new Runnable() {

            final ListPopupWindow this$0;

            public void run()
            {
                View view1 = getAnchorView();
                if (view1 != null && view1.getWindowToken() != null)
                {
                    show();
                }
            }

            
            {
                this$0 = ListPopupWindow.this;
                super();
            }
        };
        boolean flag;
        if (!mModal)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mDropDownList = new DropDownListView(((Context) (obj2)), flag);
        if (mDropDownListHighlight != null)
        {
            mDropDownList.setSelector(mDropDownListHighlight);
        }
        mDropDownList.setAdapter(mAdapter);
        mDropDownList.setOnItemClickListener(mItemClickListener);
        mDropDownList.setFocusable(true);
        mDropDownList.setFocusableInTouchMode(true);
        mDropDownList.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final ListPopupWindow this$0;

            public void onItemSelected(AdapterView adapterview, View view1, int i1, long l1)
            {
                if (i1 != -1)
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

            
            {
                this$0 = ListPopupWindow.this;
                super();
            }
        });
        mDropDownList.setOnScrollListener(mScrollListener);
        if (mItemSelectedListener != null)
        {
            mDropDownList.setOnItemSelectedListener(mItemSelectedListener);
        }
        obj1 = mDropDownList;
        view = mPromptView;
        obj = obj1;
        if (view == null) goto _L4; else goto _L3
_L3:
        obj = new LinearLayout(((Context) (obj2)));
        ((LinearLayout) (obj)).setOrientation(1);
        obj2 = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F);
        mPromptPosition;
        JVM INSTR tableswitch 0 1: default 224
    //                   0 438
    //                   1 423;
           goto _L5 _L6 _L7
_L5:
        Log.e("ListPopupWindow", (new StringBuilder()).append("Invalid hint position ").append(mPromptPosition).toString());
_L16:
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(mDropDownWidth, 0x80000000), 0);
        obj1 = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        i = view.getMeasuredHeight() + ((android.widget.LinearLayout.LayoutParams) (obj1)).topMargin + ((android.widget.LinearLayout.LayoutParams) (obj1)).bottomMargin;
_L4:
        mPopup.setContentView(((View) (obj)));
_L9:
        k = 0;
        obj = mPopup.getBackground();
        if (obj != null)
        {
            ((Drawable) (obj)).getPadding(mTempRect);
            j = mTempRect.top + mTempRect.bottom;
            k = j;
            if (!mDropDownVerticalOffsetSet)
            {
                mDropDownVerticalOffset = -mTempRect.top;
                k = j;
            }
        } else
        {
            mTempRect.setEmpty();
        }
        if (mPopup.getInputMethodMode() != 2);
        l = mPopup.getMaxAvailableHeight(getAnchorView(), mDropDownVerticalOffset);
        if (mDropDownAlwaysVisible || mDropDownHeight == -1)
        {
            return l + k;
        }
          goto _L8
_L7:
        ((LinearLayout) (obj)).addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (obj2)));
        ((LinearLayout) (obj)).addView(view);
        continue; /* Loop/switch isn't completed */
_L6:
        ((LinearLayout) (obj)).addView(view);
        ((LinearLayout) (obj)).addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (obj2)));
        continue; /* Loop/switch isn't completed */
_L2:
        obj = (ViewGroup)mPopup.getContentView();
        obj = mPromptView;
        i = j;
        if (obj != null)
        {
            obj1 = (android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams();
            i = ((View) (obj)).getMeasuredHeight() + ((android.widget.LinearLayout.LayoutParams) (obj1)).topMargin + ((android.widget.LinearLayout.LayoutParams) (obj1)).bottomMargin;
        }
          goto _L9
_L8:
        mDropDownWidth;
        JVM INSTR tableswitch -2 -1: default 544
    //                   -2 597
    //                   -1 637;
           goto _L10 _L11 _L12
_L10:
        j = android.view.View.MeasureSpec.makeMeasureSpec(mDropDownWidth, 0x40000000);
_L14:
        l = mDropDownList.measureHeightOfChildrenCompat(j, 0, -1, l - i, -1);
        j = i;
        if (l > 0)
        {
            j = i + k;
        }
        return l + j;
_L11:
        j = android.view.View.MeasureSpec.makeMeasureSpec(mContext.getResources().getDisplayMetrics().widthPixels - (mTempRect.left + mTempRect.right), 0x80000000);
        continue; /* Loop/switch isn't completed */
_L12:
        j = android.view.View.MeasureSpec.makeMeasureSpec(mContext.getResources().getDisplayMetrics().widthPixels - (mTempRect.left + mTempRect.right), 0x40000000);
        if (true) goto _L14; else goto _L13
_L13:
        if (true) goto _L16; else goto _L15
_L15:
    }

    private static boolean isConfirmKey(int i)
    {
        return i == 66 || i == 23;
    }

    private void removePromptView()
    {
        if (mPromptView != null)
        {
            ViewParent viewparent = mPromptView.getParent();
            if (viewparent instanceof ViewGroup)
            {
                ((ViewGroup)viewparent).removeView(mPromptView);
            }
        }
    }

    private void setPopupClipToScreenEnabled(boolean flag)
    {
        if (sClipToWindowEnabledMethod == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        sClipToWindowEnabledMethod.invoke(mPopup, new Object[] {
            Boolean.valueOf(flag)
        });
        return;
        Exception exception;
        exception;
        Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
        return;
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

    public android.view.View.OnTouchListener createDragToOpenListener(View view)
    {
        return new ForwardingListener(view) {

            final ListPopupWindow this$0;

            public ListPopupWindow getPopup()
            {
                return ListPopupWindow.this;
            }

            
            {
                this$0 = ListPopupWindow.this;
                super(view);
            }
        };
    }

    public void dismiss()
    {
        mPopup.dismiss();
        removePromptView();
        mPopup.setContentView(null);
        mDropDownList = null;
        mHandler.removeCallbacks(mResizePopupRunnable);
    }

    public View getAnchorView()
    {
        return mDropDownAnchorView;
    }

    public int getAnimationStyle()
    {
        return mPopup.getAnimationStyle();
    }

    public Drawable getBackground()
    {
        return mPopup.getBackground();
    }

    public int getHeight()
    {
        return mDropDownHeight;
    }

    public int getHorizontalOffset()
    {
        return mDropDownHorizontalOffset;
    }

    public int getInputMethodMode()
    {
        return mPopup.getInputMethodMode();
    }

    public ListView getListView()
    {
        return mDropDownList;
    }

    public int getPromptPosition()
    {
        return mPromptPosition;
    }

    public Object getSelectedItem()
    {
        if (!isShowing())
        {
            return null;
        } else
        {
            return mDropDownList.getSelectedItem();
        }
    }

    public long getSelectedItemId()
    {
        if (!isShowing())
        {
            return 0x8000000000000000L;
        } else
        {
            return mDropDownList.getSelectedItemId();
        }
    }

    public int getSelectedItemPosition()
    {
        if (!isShowing())
        {
            return -1;
        } else
        {
            return mDropDownList.getSelectedItemPosition();
        }
    }

    public View getSelectedView()
    {
        if (!isShowing())
        {
            return null;
        } else
        {
            return mDropDownList.getSelectedView();
        }
    }

    public int getSoftInputMode()
    {
        return mPopup.getSoftInputMode();
    }

    public int getVerticalOffset()
    {
        if (!mDropDownVerticalOffsetSet)
        {
            return 0;
        } else
        {
            return mDropDownVerticalOffset;
        }
    }

    public int getWidth()
    {
        return mDropDownWidth;
    }

    public boolean isDropDownAlwaysVisible()
    {
        return mDropDownAlwaysVisible;
    }

    public boolean isInputMethodNotNeeded()
    {
        return mPopup.getInputMethodMode() == 2;
    }

    public boolean isModal()
    {
        return mModal;
    }

    public boolean isShowing()
    {
        return mPopup.isShowing();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (!isShowing() || i == 62 || mDropDownList.getSelectedItemPosition() < 0 && isConfirmKey(i)) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        boolean flag;
        int l;
        l = mDropDownList.getSelectedItemPosition();
        ListAdapter listadapter;
        if (!mPopup.isAboveAnchor())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        listadapter = mAdapter;
        j = 0x7fffffff;
        k = 0x80000000;
        if (listadapter != null)
        {
            boolean flag1 = listadapter.areAllItemsEnabled();
            if (flag1)
            {
                j = 0;
            } else
            {
                j = mDropDownList.lookForSelectablePosition(0, true);
            }
            if (flag1)
            {
                k = listadapter.getCount() - 1;
            } else
            {
                k = mDropDownList.lookForSelectablePosition(listadapter.getCount() - 1, false);
            }
        }
        if ((!flag || i != 19 || l > j) && (flag || i != 20 || l < k)) goto _L4; else goto _L3
_L3:
        clearListSelection();
        mPopup.setInputMethodMode(1);
        show();
_L7:
        return true;
_L4:
        mDropDownList.mListSelectionHidden = false;
        if (!mDropDownList.onKeyDown(i, keyevent))
        {
            break; /* Loop/switch isn't completed */
        }
        mPopup.setInputMethodMode(2);
        mDropDownList.requestFocusFromTouch();
        show();
        i;
        JVM INSTR lookupswitch 4: default 280
    //                   19: 153
    //                   20: 153
    //                   23: 153
    //                   66: 153;
           goto _L2 _L5 _L5 _L5 _L5
_L5:
        if (true) goto _L7; else goto _L6
_L2:
        return false;
_L6:
        if (!flag || i != 20)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (l != k) goto _L2; else goto _L8
_L8:
        return true;
        if (flag || i != 19 || l != j) goto _L2; else goto _L9
_L9:
        return true;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyevent)
    {
        if (i == 4 && isShowing())
        {
            Object obj = mDropDownAnchorView;
            if (keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
            {
                obj = ((View) (obj)).getKeyDispatcherState();
                if (obj != null)
                {
                    ((android.view.KeyEvent.DispatcherState) (obj)).startTracking(keyevent, this);
                }
                return true;
            }
            if (keyevent.getAction() == 1)
            {
                obj = ((View) (obj)).getKeyDispatcherState();
                if (obj != null)
                {
                    ((android.view.KeyEvent.DispatcherState) (obj)).handleUpEvent(keyevent);
                }
                if (keyevent.isTracking() && !keyevent.isCanceled())
                {
                    dismiss();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (isShowing() && mDropDownList.getSelectedItemPosition() >= 0)
        {
            boolean flag = mDropDownList.onKeyUp(i, keyevent);
            if (flag && isConfirmKey(i))
            {
                dismiss();
            }
            return flag;
        } else
        {
            return false;
        }
    }

    public boolean performItemClick(int i)
    {
        if (isShowing())
        {
            if (mItemClickListener != null)
            {
                DropDownListView dropdownlistview = mDropDownList;
                View view = dropdownlistview.getChildAt(i - dropdownlistview.getFirstVisiblePosition());
                ListAdapter listadapter = dropdownlistview.getAdapter();
                mItemClickListener.onItemClick(dropdownlistview, view, i, listadapter.getItemId(i));
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void postShow()
    {
        mHandler.post(mShowDropDownRunnable);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        if (mObserver != null) goto _L2; else goto _L1
_L1:
        mObserver = new PopupDataSetObserver();
_L4:
        mAdapter = listadapter;
        if (mAdapter != null)
        {
            listadapter.registerDataSetObserver(mObserver);
        }
        if (mDropDownList != null)
        {
            mDropDownList.setAdapter(mAdapter);
        }
        return;
_L2:
        if (mAdapter != null)
        {
            mAdapter.unregisterDataSetObserver(mObserver);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setAnchorView(View view)
    {
        mDropDownAnchorView = view;
    }

    public void setAnimationStyle(int i)
    {
        mPopup.setAnimationStyle(i);
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        mPopup.setBackgroundDrawable(drawable);
    }

    public void setContentWidth(int i)
    {
        Drawable drawable = mPopup.getBackground();
        if (drawable != null)
        {
            drawable.getPadding(mTempRect);
            mDropDownWidth = mTempRect.left + mTempRect.right + i;
            return;
        } else
        {
            setWidth(i);
            return;
        }
    }

    public void setDropDownAlwaysVisible(boolean flag)
    {
        mDropDownAlwaysVisible = flag;
    }

    public void setDropDownGravity(int i)
    {
        mDropDownGravity = i;
    }

    public void setForceIgnoreOutsideTouch(boolean flag)
    {
        mForceIgnoreOutsideTouch = flag;
    }

    public void setHeight(int i)
    {
        mDropDownHeight = i;
    }

    public void setHorizontalOffset(int i)
    {
        mDropDownHorizontalOffset = i;
    }

    public void setInputMethodMode(int i)
    {
        mPopup.setInputMethodMode(i);
    }

    void setListItemExpandMax(int i)
    {
        mListItemExpandMaximum = i;
    }

    public void setListSelector(Drawable drawable)
    {
        mDropDownListHighlight = drawable;
    }

    public void setModal(boolean flag)
    {
        mModal = flag;
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

    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
    {
        mItemSelectedListener = onitemselectedlistener;
    }

    public void setPromptPosition(int i)
    {
        mPromptPosition = i;
    }

    public void setPromptView(View view)
    {
        boolean flag = isShowing();
        if (flag)
        {
            removePromptView();
        }
        mPromptView = view;
        if (flag)
        {
            show();
        }
    }

    public void setSelection(int i)
    {
        DropDownListView dropdownlistview = mDropDownList;
        if (isShowing() && dropdownlistview != null)
        {
            dropdownlistview.mListSelectionHidden = false;
            dropdownlistview.setSelection(i);
            if (android.os.Build.VERSION.SDK_INT >= 11 && dropdownlistview.getChoiceMode() != 0)
            {
                dropdownlistview.setItemChecked(i, true);
            }
        }
    }

    public void setSoftInputMode(int i)
    {
        mPopup.setSoftInputMode(i);
    }

    public void setVerticalOffset(int i)
    {
        mDropDownVerticalOffset = i;
        mDropDownVerticalOffsetSet = true;
    }

    public void setWidth(int i)
    {
        mDropDownWidth = i;
    }

    public void show()
    {
        int i;
        int j;
        byte byte0;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag1 = true;
        flag2 = false;
        byte0 = -1;
        j = buildDropDown();
        i = 0;
        flag = false;
        flag3 = isInputMethodNotNeeded();
        if (!mPopup.isShowing()) goto _L2; else goto _L1
_L1:
        if (mDropDownWidth == -1)
        {
            i = -1;
        } else
        if (mDropDownWidth == -2)
        {
            i = getAnchorView().getWidth();
        } else
        {
            i = mDropDownWidth;
        }
        if (mDropDownHeight != -1) goto _L4; else goto _L3
_L3:
        if (!flag3)
        {
            j = -1;
        }
        if (flag3)
        {
            PopupWindow popupwindow = mPopup;
            if (mDropDownWidth != -1)
            {
                byte0 = 0;
            }
            popupwindow.setWindowLayoutMode(byte0, 0);
        } else
        {
            PopupWindow popupwindow1 = mPopup;
            byte byte1;
            if (mDropDownWidth == -1)
            {
                byte1 = -1;
            } else
            {
                byte1 = 0;
            }
            popupwindow1.setWindowLayoutMode(byte1, -1);
        }
_L8:
        popupwindow = mPopup;
        flag1 = flag2;
        if (!mForceIgnoreOutsideTouch)
        {
            flag1 = flag2;
            if (!mDropDownAlwaysVisible)
            {
                flag1 = true;
            }
        }
        popupwindow.setOutsideTouchable(flag1);
        mPopup.update(getAnchorView(), mDropDownHorizontalOffset, mDropDownVerticalOffset, i, j);
_L6:
        return;
_L4:
        if (mDropDownHeight != -2)
        {
            j = mDropDownHeight;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        PopupWindow popupwindow2;
        if (mDropDownWidth == -1)
        {
            i = -1;
        } else
        if (mDropDownWidth == -2)
        {
            mPopup.setWidth(getAnchorView().getWidth());
        } else
        {
            mPopup.setWidth(mDropDownWidth);
        }
        if (mDropDownHeight == -1)
        {
            j = -1;
        } else
        if (mDropDownHeight == -2)
        {
            mPopup.setHeight(j);
            j = ((flag) ? 1 : 0);
        } else
        {
            mPopup.setHeight(mDropDownHeight);
            j = ((flag) ? 1 : 0);
        }
        mPopup.setWindowLayoutMode(i, j);
        setPopupClipToScreenEnabled(true);
        popupwindow2 = mPopup;
        if (mForceIgnoreOutsideTouch || mDropDownAlwaysVisible)
        {
            flag1 = false;
        }
        popupwindow2.setOutsideTouchable(flag1);
        mPopup.setTouchInterceptor(mTouchInterceptor);
        PopupWindowCompat.showAsDropDown(mPopup, getAnchorView(), mDropDownHorizontalOffset, mDropDownVerticalOffset, mDropDownGravity);
        mDropDownList.setSelection(-1);
        if (!mModal || mDropDownList.isInTouchMode())
        {
            clearListSelection();
        }
        if (mModal) goto _L6; else goto _L5
_L5:
        mHandler.post(mHideSelector);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static 
    {
        try
        {
            sClipToWindowEnabledMethod = android/widget/PopupWindow.getDeclaredMethod("setClipToScreenEnabled", new Class[] {
                Boolean.TYPE
            });
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
    }




}
