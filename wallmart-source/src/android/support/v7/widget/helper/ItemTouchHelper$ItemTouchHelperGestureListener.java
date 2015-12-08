// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget.helper;

import android.support.v4.view.MotionEventCompat;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

// Referenced classes of package android.support.v7.widget.helper:
//            ItemTouchHelper

private class <init> extends android.view.lperGestureListener
{

    final ItemTouchHelper this$0;

    public boolean onDown(MotionEvent motionevent)
    {
        return true;
    }

    public void onLongPress(MotionEvent motionevent)
    {
        Object obj;
        obj = ItemTouchHelper.access$2400(ItemTouchHelper.this, motionevent);
        if (obj != null)
        {
            obj = ItemTouchHelper.access$300(ItemTouchHelper.this).getChildViewHolder(((android.view.View) (obj)));
            break MISSING_BLOCK_LABEL_29;
        }
_L1:
        return;
        if (obj != null && this._mth0(mCallback, ItemTouchHelper.access$300(ItemTouchHelper.this), ((android.support.v7.widget.stener.this._cls0) (obj))) && MotionEventCompat.getPointerId(motionevent, 0) == mActivePointerId)
        {
            int i = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
            float f = MotionEventCompat.getX(motionevent, i);
            float f1 = MotionEventCompat.getY(motionevent, i);
            mInitialTouchX = f;
            mInitialTouchY = f1;
            motionevent = ItemTouchHelper.this;
            mDy = 0.0F;
            motionevent.mDx = 0.0F;
            if (mCallback.())
            {
                ItemTouchHelper.access$800(ItemTouchHelper.this, ((android.support.v7.widget.stener.this._cls0) (obj)), 2);
                return;
            }
        }
          goto _L1
    }

    private ()
    {
        this$0 = ItemTouchHelper.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
