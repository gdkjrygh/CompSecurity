// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class VerticalSpaceItemDecoration extends android.support.v7.widget.RecyclerView.ItemDecoration
{

    private final int mVerticalSpaceHeight;

    public VerticalSpaceItemDecoration(Context context)
    {
        mVerticalSpaceHeight = context.getResources().getDimensionPixelSize(com.walmartlabs.android.payment.R.dimen.payment_list_divider_height);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
    {
        rect.bottom = mVerticalSpaceHeight;
    }
}
