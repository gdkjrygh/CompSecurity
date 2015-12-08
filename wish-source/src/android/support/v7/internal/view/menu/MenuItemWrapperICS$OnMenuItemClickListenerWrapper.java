// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view.menu:
//            BaseWrapper, MenuItemWrapperICS

private class this._cls0 extends BaseWrapper
    implements android.view.ItemClickListenerWrapper
{

    final MenuItemWrapperICS this$0;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        return ((android.view.ItemClickListenerWrapper)mWrappedObject).mWrappedObject(getMenuItemWrapper(menuitem));
    }

    (android.view.ItemClickListenerWrapper itemclicklistenerwrapper)
    {
        this$0 = MenuItemWrapperICS.this;
        super(itemclicklistenerwrapper);
    }
}
