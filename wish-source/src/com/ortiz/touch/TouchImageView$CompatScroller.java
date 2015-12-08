// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ortiz.touch;

import android.content.Context;
import android.widget.OverScroller;
import android.widget.Scroller;

// Referenced classes of package com.ortiz.touch:
//            TouchImageView

private class overScroller
{

    boolean isPreGingerbread;
    OverScroller overScroller;
    Scroller scroller;
    final TouchImageView this$0;

    public boolean computeScrollOffset()
    {
        if (isPreGingerbread)
        {
            return scroller.computeScrollOffset();
        } else
        {
            overScroller.computeScrollOffset();
            return overScroller.computeScrollOffset();
        }
    }

    public void fling(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        if (isPreGingerbread)
        {
            scroller.fling(i, j, k, l, i1, j1, k1, l1);
            return;
        } else
        {
            overScroller.fling(i, j, k, l, i1, j1, k1, l1);
            return;
        }
    }

    public void forceFinished(boolean flag)
    {
        if (isPreGingerbread)
        {
            scroller.forceFinished(flag);
            return;
        } else
        {
            overScroller.forceFinished(flag);
            return;
        }
    }

    public int getCurrX()
    {
        if (isPreGingerbread)
        {
            return scroller.getCurrX();
        } else
        {
            return overScroller.getCurrX();
        }
    }

    public int getCurrY()
    {
        if (isPreGingerbread)
        {
            return scroller.getCurrY();
        } else
        {
            return overScroller.getCurrY();
        }
    }

    public boolean isFinished()
    {
        if (isPreGingerbread)
        {
            return scroller.isFinished();
        } else
        {
            return overScroller.isFinished();
        }
    }

    public (Context context)
    {
        this$0 = TouchImageView.this;
        super();
        if (android.os.ller.this._fld0 < 9)
        {
            isPreGingerbread = true;
            scroller = new Scroller(context);
            return;
        } else
        {
            isPreGingerbread = false;
            overScroller = new OverScroller(context);
            return;
        }
    }
}
