// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui.collection.model;

import android.graphics.Rect;

// Referenced classes of package com.ubercab.ui.collection.model:
//            ViewModel, Shape_DividerViewModel

public abstract class DividerViewModel extends ViewModel
{

    public DividerViewModel()
    {
    }

    public static DividerViewModel create()
    {
        return (new Shape_DividerViewModel()).setPadding(0, 0, 0, 0);
    }

    public static DividerViewModel create(int i, int j, int k, int l)
    {
        DividerViewModel dividerviewmodel = create();
        dividerviewmodel.setPadding(i, j, k, l);
        return dividerviewmodel;
    }

    public abstract Rect getPadding();

    public DividerViewModel setPadding(int i, int j, int k, int l)
    {
        return setPadding(new Rect(i, j, k, l));
    }

    public abstract DividerViewModel setPadding(Rect rect);
}
