// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.views;

import android.view.MotionEvent;
import android.widget.ListAdapter;

// Referenced classes of package com.jiubang.playsdk.views:
//            HorizontalListView, h, a

class d extends android.view.GestureDetector.SimpleOnGestureListener
{

    final HorizontalListView a;

    private d(HorizontalListView horizontallistview)
    {
        a = horizontallistview;
        super();
    }

    d(HorizontalListView horizontallistview, a a1)
    {
        this(horizontallistview);
    }

    public boolean onDoubleTapEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            HorizontalListView.b(a);
            android.widget.AdapterView.OnItemClickListener onitemclicklistener = a.getOnItemClickListener();
            int i = HorizontalListView.a(a, (int)motionevent.getX(), (int)motionevent.getY());
            if (i >= 0 && !HorizontalListView.d(a))
            {
                motionevent = a.getChildAt(i);
                i = HorizontalListView.e(a) + i;
                if (onitemclicklistener != null)
                {
                    onitemclicklistener.onItemClick(a, motionevent, i, a.b.getItemId(i));
                    return true;
                }
            }
            if (HorizontalListView.f(a) != null && !HorizontalListView.d(a))
            {
                HorizontalListView.f(a).onClick(a);
            }
            return false;
        } else
        {
            return super.onDoubleTapEvent(motionevent);
        }
    }

    public boolean onDown(MotionEvent motionevent)
    {
        return a.a(motionevent);
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return a.a(motionevent, motionevent1, f, f1);
    }

    public void onLongPress(MotionEvent motionevent)
    {
        HorizontalListView.b(a);
        int i = HorizontalListView.a(a, (int)motionevent.getX(), (int)motionevent.getY());
        if (i >= 0 && !HorizontalListView.d(a))
        {
            motionevent = a.getChildAt(i);
            i = HorizontalListView.e(a) + i;
            android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener = a.getOnItemLongClickListener();
            if (onitemlongclicklistener != null)
            {
                if (onitemlongclicklistener.onItemLongClick(a, motionevent, i, a.b.getItemId(i)))
                {
                    a.performHapticFeedback(0);
                }
            } else
            {
                android.widget.AdapterView.OnItemClickListener onitemclicklistener = a.getOnItemClickListener();
                if (onitemclicklistener != null)
                {
                    onitemclicklistener.onItemClick(a, motionevent, i, a.b.getItemId(i));
                    return;
                }
            }
        }
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        HorizontalListView.a(a, Boolean.valueOf(true));
        HorizontalListView.a(a, h.b);
        HorizontalListView.b(a);
        motionevent = a;
        motionevent.d = ((HorizontalListView) (motionevent)).d + (int)f;
        HorizontalListView.a(a, Math.round(f));
        a.requestLayout();
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        HorizontalListView.b(a);
        android.widget.AdapterView.OnItemClickListener onitemclicklistener = a.getOnItemClickListener();
        int i = HorizontalListView.a(a, (int)motionevent.getX(), (int)motionevent.getY());
        if (i >= 0 && !HorizontalListView.d(a))
        {
            motionevent = a.getChildAt(i);
            i = HorizontalListView.e(a) + i;
            if (onitemclicklistener != null)
            {
                onitemclicklistener.onItemClick(a, motionevent, i, a.b.getItemId(i));
                return true;
            }
        }
        if (HorizontalListView.f(a) != null && !HorizontalListView.d(a))
        {
            HorizontalListView.f(a).onClick(a);
        }
        return false;
    }
}
