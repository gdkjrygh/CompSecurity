// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverMerchandiseController

private static class <init> extends android.support.v7.widget.ion
{

    private final int pixelOffset;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.ion ion)
    {
        rect.left = pixelOffset;
        rect.right = pixelOffset;
        int i = ((android.support.v7.widget.ion.pixelOffset)view.getLayoutParams()).pixelOffset();
        if (i == 0)
        {
            rect.left = rect.left + pixelOffset;
        } else
        if (i == ion.pixelOffset() - 1)
        {
            rect.right = rect.right + pixelOffset;
            return;
        }
    }

    private (Activity activity)
    {
        pixelOffset = ViewUtil.dpToPixels(5, activity.getResources().getDisplayMetrics());
    }

    pixelOffset(Activity activity, pixelOffset pixeloffset)
    {
        this(activity);
    }
}
