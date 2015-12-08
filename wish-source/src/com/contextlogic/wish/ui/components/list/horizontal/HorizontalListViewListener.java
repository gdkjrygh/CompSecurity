// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.list.horizontal;


// Referenced classes of package com.contextlogic.wish.ui.components.list.horizontal:
//            HorizontalListViewCell

public interface HorizontalListViewListener
{

    public abstract void onScrollChanged(int i, int j, int k);

    public abstract void onSelectCell(HorizontalListViewCell horizontallistviewcell, int i);
}
