// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.view.View;
import java.util.List;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            ViewVisitor

public static class mSeen extends or
{

    private boolean mSeen;

    public void accumulate(View view)
    {
        if (view != null && !mSeen)
        {
            fireEvent(view);
        }
        boolean flag;
        if (view != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mSeen = flag;
    }

    public void cleanup()
    {
    }

    protected String name()
    {
        return (new StringBuilder(String.valueOf(getEventName()))).append(" when Detected").toString();
    }

    public volatile void visit(View view)
    {
        super.visit(view);
    }

    public or(List list, String s, or or)
    {
        super(list, s, or, false);
        mSeen = false;
    }
}
