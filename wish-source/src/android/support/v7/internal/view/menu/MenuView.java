// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;


// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuBuilder, MenuItemImpl

public interface MenuView
{
    public static interface ItemView
    {

        public abstract MenuItemImpl getItemData();

        public abstract void initialize(MenuItemImpl menuitemimpl, int i);

        public abstract boolean prefersCondensedTitle();
    }


    public abstract void initialize(MenuBuilder menubuilder);
}
