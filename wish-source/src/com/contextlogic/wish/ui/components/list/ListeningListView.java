// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.list;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;

public class ListeningListView extends ListView
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        SparseIntArray childrenHeights;
        int prevFirstVisibleChildHeight;
        int prevFirstVisiblePosition;
        int prevScrollY;
        int prevScrolledChildrenHeight;
        int scrollY;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(prevFirstVisiblePosition);
            parcel.writeInt(prevFirstVisibleChildHeight);
            parcel.writeInt(prevScrolledChildrenHeight);
            parcel.writeInt(prevScrollY);
            parcel.writeInt(scrollY);
            if (childrenHeights == null)
            {
                i = 0;
            } else
            {
                i = childrenHeights.size();
            }
            parcel.writeInt(i);
            if (i > 0)
            {
                for (int j = 0; j < i; j++)
                {
                    parcel.writeInt(childrenHeights.keyAt(j));
                    parcel.writeInt(childrenHeights.valueAt(j));
                }

            }
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            prevFirstVisibleChildHeight = -1;
            prevFirstVisiblePosition = parcel.readInt();
            prevFirstVisibleChildHeight = parcel.readInt();
            prevScrolledChildrenHeight = parcel.readInt();
            prevScrollY = parcel.readInt();
            scrollY = parcel.readInt();
            childrenHeights = new SparseIntArray();
            int j = parcel.readInt();
            if (j > 0)
            {
                for (int i = 0; i < j; i++)
                {
                    int k = parcel.readInt();
                    int l = parcel.readInt();
                    childrenHeights.put(k, l);
                }

            }
        }


        SavedState(Parcelable parcelable)
        {
            super(parcelable);
            prevFirstVisibleChildHeight = -1;
        }
    }

    public static final class ScrollState extends Enum
    {

        private static final ScrollState $VALUES[];
        public static final ScrollState DOWN;
        public static final ScrollState STOP;
        public static final ScrollState UP;

        public static ScrollState valueOf(String s)
        {
            return (ScrollState)Enum.valueOf(com/contextlogic/wish/ui/components/list/ListeningListView$ScrollState, s);
        }

        public static ScrollState[] values()
        {
            return (ScrollState[])$VALUES.clone();
        }

        static 
        {
            STOP = new ScrollState("STOP", 0);
            UP = new ScrollState("UP", 1);
            DOWN = new ScrollState("DOWN", 2);
            $VALUES = (new ScrollState[] {
                STOP, UP, DOWN
            });
        }

        private ScrollState(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface ScrollViewListener
    {

        public abstract void onScrollChanged(int i, int j);
    }


    private SparseIntArray mChildrenHeights;
    private boolean mDragging;
    private boolean mFirstScroll;
    private boolean mIntercepted;
    private ScrollViewListener mListener;
    private android.widget.AbsListView.OnScrollListener mOriginalScrollListener;
    private int mPrevFirstVisibleChildHeight;
    private int mPrevFirstVisiblePosition;
    private MotionEvent mPrevMoveEvent;
    private int mPrevScrollY;
    private int mPrevScrolledChildrenHeight;
    private android.widget.AbsListView.OnScrollListener mScrollListener = new android.widget.AbsListView.OnScrollListener() {

        final ListeningListView this$0;

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
            if (mOriginalScrollListener != null)
            {
                mOriginalScrollListener.onScroll(abslistview, i, j, k);
            }
            onScrollChanged();
        }

        public void onScrollStateChanged(AbsListView abslistview, int i)
        {
            if (mOriginalScrollListener != null)
            {
                mOriginalScrollListener.onScrollStateChanged(abslistview, i);
            }
        }

            
            {
                this$0 = ListeningListView.this;
                super();
            }
    };
    private ScrollState mScrollState;
    private int mScrollY;
    private ViewGroup mTouchInterceptionViewGroup;

    public ListeningListView(Context context)
    {
        super(context);
        mPrevFirstVisibleChildHeight = -1;
        init();
    }

    public ListeningListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mPrevFirstVisibleChildHeight = -1;
        init();
    }

    public ListeningListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mPrevFirstVisibleChildHeight = -1;
        init();
    }

    private void init()
    {
        mChildrenHeights = new SparseIntArray();
        super.setOnScrollListener(mScrollListener);
    }

    private void onScrollChanged()
    {
        if (mListener != null && getChildCount() > 0)
        {
            int i2 = getFirstVisiblePosition();
            int l = getFirstVisiblePosition();
            for (int i = 0; l <= getLastVisiblePosition(); i++)
            {
                if (mChildrenHeights.indexOfKey(l) < 0 || getChildAt(i).getHeight() != mChildrenHeights.get(l))
                {
                    mChildrenHeights.put(l, getChildAt(i).getHeight());
                }
                l++;
            }

            View view = getChildAt(0);
            if (view != null)
            {
                if (mPrevFirstVisiblePosition < i2)
                {
                    int k1 = 0;
                    int j = 0;
                    if (i2 - mPrevFirstVisiblePosition != 1)
                    {
                        int i1 = i2 - 1;
                        do
                        {
                            k1 = j;
                            if (i1 <= mPrevFirstVisiblePosition)
                            {
                                break;
                            }
                            if (mChildrenHeights.indexOfKey(i1) > 0)
                            {
                                j += mChildrenHeights.get(i1);
                            } else
                            {
                                j += view.getHeight();
                            }
                            i1--;
                        } while (true);
                    }
                    mPrevScrolledChildrenHeight = mPrevScrolledChildrenHeight + (mPrevFirstVisibleChildHeight + k1);
                    mPrevFirstVisibleChildHeight = view.getHeight();
                } else
                if (i2 < mPrevFirstVisiblePosition)
                {
                    int l1 = 0;
                    int k = 0;
                    if (mPrevFirstVisiblePosition - i2 != 1)
                    {
                        int j1 = mPrevFirstVisiblePosition - 1;
                        do
                        {
                            l1 = k;
                            if (j1 <= i2)
                            {
                                break;
                            }
                            if (mChildrenHeights.indexOfKey(j1) > 0)
                            {
                                k += mChildrenHeights.get(j1);
                            } else
                            {
                                k += view.getHeight();
                            }
                            j1--;
                        } while (true);
                    }
                    mPrevScrolledChildrenHeight = mPrevScrolledChildrenHeight - (view.getHeight() + l1);
                    mPrevFirstVisibleChildHeight = view.getHeight();
                } else
                if (i2 == 0)
                {
                    mPrevFirstVisibleChildHeight = view.getHeight();
                }
                if (mPrevFirstVisibleChildHeight < 0)
                {
                    mPrevFirstVisibleChildHeight = 0;
                }
                mScrollY = mPrevScrolledChildrenHeight - view.getTop();
                mPrevFirstVisiblePosition = i2;
                if (mFirstScroll)
                {
                    mFirstScroll = false;
                }
                if (mPrevScrollY < mScrollY)
                {
                    mScrollState = ScrollState.UP;
                } else
                if (mScrollY < mPrevScrollY)
                {
                    mScrollState = ScrollState.DOWN;
                } else
                {
                    mScrollState = ScrollState.STOP;
                }
                mListener.onScrollChanged(mScrollY, mScrollY - mPrevScrollY);
                mPrevScrollY = mScrollY;
            }
        }
    }

    public int getCurrentScrollY()
    {
        return mScrollY;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (mListener == null) goto _L2; else goto _L1
_L1:
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 0: default 28
    //                   0 34;
           goto _L2 _L3
_L2:
        return super.onInterceptTouchEvent(motionevent);
_L3:
        mDragging = true;
        mFirstScroll = true;
        if (true) goto _L2; else goto _L4
_L4:
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        mPrevFirstVisiblePosition = ((SavedState) (parcelable)).prevFirstVisiblePosition;
        mPrevFirstVisibleChildHeight = ((SavedState) (parcelable)).prevFirstVisibleChildHeight;
        mPrevScrolledChildrenHeight = ((SavedState) (parcelable)).prevScrolledChildrenHeight;
        mPrevScrollY = ((SavedState) (parcelable)).prevScrollY;
        mScrollY = ((SavedState) (parcelable)).scrollY;
        mChildrenHeights = ((SavedState) (parcelable)).childrenHeights;
        super.onRestoreInstanceState(parcelable.getSuperState());
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.prevFirstVisiblePosition = mPrevFirstVisiblePosition;
        savedstate.prevFirstVisibleChildHeight = mPrevFirstVisibleChildHeight;
        savedstate.prevScrolledChildrenHeight = mPrevScrolledChildrenHeight;
        savedstate.prevScrollY = mPrevScrollY;
        savedstate.scrollY = mScrollY;
        savedstate.childrenHeights = mChildrenHeights;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = false;
        if (mListener == null) goto _L2; else goto _L1
_L1:
        motionevent.getActionMasked();
        JVM INSTR tableswitch 1 3: default 40
    //                   1 50
    //                   2 63
    //                   3 50;
           goto _L2 _L3 _L4 _L3
_L2:
        flag = super.onTouchEvent(motionevent);
_L6:
        return flag;
_L3:
        mIntercepted = false;
        mDragging = false;
        continue; /* Loop/switch isn't completed */
_L4:
        if (mPrevMoveEvent == null)
        {
            mPrevMoveEvent = motionevent;
        }
        float f = motionevent.getY();
        float f2 = mPrevMoveEvent.getY();
        mPrevMoveEvent = MotionEvent.obtainNoHistory(motionevent);
        if ((float)getCurrentScrollY() - (f - f2) > 0.0F)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (mIntercepted) goto _L6; else goto _L5
_L5:
        float f1;
        float f3;
        final ViewGroup parent;
        if (mTouchInterceptionViewGroup == null)
        {
            parent = (ViewGroup)getParent();
        } else
        {
            parent = mTouchInterceptionViewGroup;
        }
        f3 = 0.0F;
        f1 = 0.0F;
        for (Object obj = this; obj != null && obj != parent; obj = (View)((View) (obj)).getParent())
        {
            f3 += ((View) (obj)).getLeft() - ((View) (obj)).getScrollX();
            f1 += ((View) (obj)).getTop() - ((View) (obj)).getScrollY();
        }

        final MotionEvent event = MotionEvent.obtainNoHistory(motionevent);
        event.offsetLocation(f3, f1);
        if (parent.onInterceptTouchEvent(event))
        {
            mIntercepted = true;
            event.setAction(0);
            post(new Runnable() {

                final ListeningListView this$0;
                final MotionEvent val$event;
                final ViewGroup val$parent;

                public void run()
                {
                    parent.dispatchTouchEvent(event);
                }

            
            {
                this$0 = ListeningListView.this;
                parent = viewgroup;
                event = motionevent;
                super();
            }
            });
            return false;
        }
        return super.onTouchEvent(motionevent);
        if (true) goto _L2; else goto _L7
_L7:
    }

    public void scrollVerticallyTo(int i)
    {
        View view = getChildAt(0);
        if (view != null)
        {
            setSelection(i / view.getHeight());
        }
    }

    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        mOriginalScrollListener = onscrolllistener;
    }

    public void setScrollViewListener(ScrollViewListener scrollviewlistener)
    {
        mListener = scrollviewlistener;
    }

    public void setTouchInterceptionViewGroup(ViewGroup viewgroup)
    {
        mTouchInterceptionViewGroup = viewgroup;
    }


}
