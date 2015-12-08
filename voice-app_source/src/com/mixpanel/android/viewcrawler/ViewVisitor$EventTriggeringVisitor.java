// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.view.View;
import java.util.List;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            ViewVisitor

private static abstract class mDebounce extends ViewVisitor
{

    private final boolean mDebounce;
    private final String mEventName;
    private final mEventName mListener;

    protected void fireEvent(View view)
    {
        mListener.(view, mEventName, mDebounce);
    }

    protected String getEventName()
    {
        return mEventName;
    }

    public I(List list, String s, I i, boolean flag)
    {
        super(list);
        mListener = i;
        mEventName = s;
        mDebounce = flag;
    }
}
