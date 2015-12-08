// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.walmart.android.wmui:
//            FlowLayout

public static class horizontalSpacing extends android.view.ayoutParams
{

    public boolean breakLine;
    public int horizontalSpacing;
    int x;
    int y;

    public (int i, int j)
    {
        super(i, j);
        horizontalSpacing = -1;
    }

    public horizontalSpacing(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        horizontalSpacing = -1;
    }
}
