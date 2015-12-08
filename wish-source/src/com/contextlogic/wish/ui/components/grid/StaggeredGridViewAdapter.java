// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.grid;


// Referenced classes of package com.contextlogic.wish.ui.components.grid:
//            StaggeredGridCellView

public interface StaggeredGridViewAdapter
{

    public abstract int getHeightForViewAtIndex(int i, int j);

    public abstract int getNumColumnsInLandscape();

    public abstract int getNumColumnsInPortrait();

    public abstract int getNumItems();

    public abstract int getScreenWidthOverride();

    public abstract StaggeredGridCellView getViewAtIndex(int i, int j, boolean flag);

    public abstract boolean overrideScreenWidth();
}
