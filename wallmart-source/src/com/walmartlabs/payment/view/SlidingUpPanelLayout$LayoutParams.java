// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package com.walmartlabs.payment.view:
//            SlidingUpPanelLayout

public static class ATTRS extends android.view.ut.LayoutParams
{

    private static final int ATTRS[] = {
        0x1010181
    };


    public ()
    {
        super(-1, -1);
    }

    public (int i, int j)
    {
        super(i, j);
    }

    public (Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context.obtainStyledAttributes(attributeset, ATTRS).recycle();
    }

    public ATTRS(android.view.ut.LayoutParams layoutparams)
    {
        super(layoutparams);
    }

    public ATTRS(android.view.ut.LayoutParams layoutparams)
    {
        super(layoutparams);
    }

    public ATTRS(ATTRS attrs)
    {
        super(attrs);
    }
}
