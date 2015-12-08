// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.walmartlabs.ui.recycler.BasicRecyclerView;

// Referenced classes of package com.walmartlabs.ui:
//            LoadingContainerView

public class RecyclerContainerView extends LoadingContainerView
    implements com.walmartlabs.ui.recycler.BasicRecyclerView.AdapterStateHandler
{

    public RecyclerContainerView(Context context)
    {
        this(context, null);
    }

    public RecyclerContainerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RecyclerContainerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void onAdapterItemCount(int i)
    {
        if (i == 0)
        {
            setEmptyState();
            return;
        } else
        {
            setContentState();
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (!(getContentView() instanceof BasicRecyclerView))
        {
            throw new IllegalStateException("RecyclerContainerView must have a BasicRecyclerView as its content view");
        } else
        {
            ((BasicRecyclerView)getContentView()).setAdapterStateHandler(this);
            return;
        }
    }
}
