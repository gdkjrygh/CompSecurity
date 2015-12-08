// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.widget.FrameLayout;

// Referenced classes of package com.walmart.android.wmui:
//            HeaderFooterGridView

private class this._cls0 extends FrameLayout
{

    final HeaderFooterGridView this$0;

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(android.view.dViewLayout(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), android.view.ht(i)), j);
    }

    public (Context context)
    {
        this$0 = HeaderFooterGridView.this;
        super(context);
    }
}
