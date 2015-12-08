// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view.menu:
//            BaseWrapper, MenuItemWrapperICS

private class this._cls0 extends BaseWrapper
    implements android.support.v4.view.stenerWrapper
{

    final MenuItemWrapperICS this$0;

    public boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        return ((android.view.ionExpandListenerWrapper)mWrappedObject).ollapse(getMenuItemWrapper(menuitem));
    }

    public boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        return ((android.view.ionExpandListenerWrapper)mWrappedObject).xpand(getMenuItemWrapper(menuitem));
    }

    (android.view.ionExpandListenerWrapper ionexpandlistenerwrapper)
    {
        this$0 = MenuItemWrapperICS.this;
        super(ionexpandlistenerwrapper);
    }
}
