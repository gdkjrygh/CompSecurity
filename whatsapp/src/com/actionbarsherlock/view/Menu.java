// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.view;


// Referenced classes of package com.actionbarsherlock.view:
//            MenuItem, SubMenu

public interface Menu
{

    public abstract MenuItem add(int i, int j, int k, int l);

    public abstract MenuItem add(int i, int j, int k, CharSequence charsequence);

    public abstract MenuItem add(CharSequence charsequence);

    public abstract SubMenu addSubMenu(int i, int j, int k, int l);

    public abstract SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence);

    public abstract void clear();

    public abstract MenuItem findItem(int i);

    public abstract boolean hasVisibleItems();

    public abstract void setGroupCheckable(int i, boolean flag, boolean flag1);

    public abstract void setGroupVisible(int i, boolean flag);

    public abstract int size();
}
