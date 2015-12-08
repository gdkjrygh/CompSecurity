// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget.helper;

import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;

// Referenced classes of package android.support.v7.widget.helper:
//            ItemTouchHelper

class this._cls0
    implements Runnable
{

    final ItemTouchHelper this$0;

    public void run()
    {
        if (mSelected != null && ItemTouchHelper.access$000(ItemTouchHelper.this))
        {
            if (mSelected != null)
            {
                ItemTouchHelper.access$100(ItemTouchHelper.this, mSelected);
            }
            ItemTouchHelper.access$300(ItemTouchHelper.this).removeCallbacks(ItemTouchHelper.access$200(ItemTouchHelper.this));
            ViewCompat.postOnAnimation(ItemTouchHelper.access$300(ItemTouchHelper.this), this);
        }
    }

    ()
    {
        this$0 = ItemTouchHelper.this;
        super();
    }
}
