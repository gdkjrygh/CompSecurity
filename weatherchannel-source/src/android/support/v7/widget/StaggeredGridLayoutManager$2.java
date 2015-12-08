// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;

// Referenced classes of package android.support.v7.widget:
//            LinearSmoothScroller, StaggeredGridLayoutManager

class this._cls0 extends LinearSmoothScroller
{

    final StaggeredGridLayoutManager this$0;

    public PointF computeScrollVectorForPosition(int i)
    {
        i = StaggeredGridLayoutManager.access$400(StaggeredGridLayoutManager.this, i);
        if (i == 0)
        {
            return null;
        }
        if (StaggeredGridLayoutManager.access$500(StaggeredGridLayoutManager.this) == 0)
        {
            return new PointF(i, 0.0F);
        } else
        {
            return new PointF(0.0F, i);
        }
    }

    (Context context)
    {
        this$0 = StaggeredGridLayoutManager.this;
        super(context);
    }
}
