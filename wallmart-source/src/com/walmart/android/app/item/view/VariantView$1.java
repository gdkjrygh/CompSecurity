// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view;

import android.view.View;

// Referenced classes of package com.walmart.android.app.item.view:
//            VariantView

static final class val.targetHeight
    implements Runnable
{

    final View val$child;
    final int val$targetHeight;

    public void run()
    {
        VariantView.access$000(val$child, val$targetHeight);
    }

    (View view, int i)
    {
        val$child = view;
        val$targetHeight = i;
        super();
    }
}
