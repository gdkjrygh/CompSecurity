// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget.helper;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package android.support.v7.widget.helper:
//            ItemTouchHelper

public static abstract class mDefaultDragDirs extends mDefaultDragDirs
{

    private int mDefaultDragDirs;
    private int mDefaultSwipeDirs;

    public int getDragDirs(RecyclerView recyclerview, android.support.v7.widget.llback llback)
    {
        return mDefaultDragDirs;
    }

    public int getMovementFlags(RecyclerView recyclerview, android.support.v7.widget.llback llback)
    {
        return makeMovementFlags(getDragDirs(recyclerview, llback), getSwipeDirs(recyclerview, llback));
    }

    public int getSwipeDirs(RecyclerView recyclerview, android.support.v7.widget.llback llback)
    {
        return mDefaultSwipeDirs;
    }

    public void setDefaultDragDirs(int i)
    {
        mDefaultDragDirs = i;
    }

    public void setDefaultSwipeDirs(int i)
    {
        mDefaultSwipeDirs = i;
    }

    public (int i, int j)
    {
        mDefaultSwipeDirs = j;
        mDefaultDragDirs = i;
    }
}
