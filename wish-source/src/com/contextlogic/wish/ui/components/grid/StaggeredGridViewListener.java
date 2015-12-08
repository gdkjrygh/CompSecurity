// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.grid;


// Referenced classes of package com.contextlogic.wish.ui.components.grid:
//            StaggeredGridCellView

public interface StaggeredGridViewListener
{

    public abstract boolean onLongClickCell(StaggeredGridCellView staggeredgridcellview, int i);

    public abstract void onScrollChanged(int i, int j, int k, int l);

    public abstract void onSelectCell(StaggeredGridCellView staggeredgridcellview, int i);
}
