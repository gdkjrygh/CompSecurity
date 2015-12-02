// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.view.MenuItem;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuItemWrapper

class this._cls0
    implements android.view.xpandListener
{

    final MenuItemWrapper this$0;

    public boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        if (MenuItemWrapper.access$000(MenuItemWrapper.this) != null)
        {
            return MenuItemWrapper.access$000(MenuItemWrapper.this).onMenuItemActionCollapse(MenuItemWrapper.this);
        } else
        {
            return false;
        }
    }

    public boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        if (MenuItemWrapper.access$000(MenuItemWrapper.this) != null)
        {
            return MenuItemWrapper.access$000(MenuItemWrapper.this).onMenuItemActionExpand(MenuItemWrapper.this);
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = MenuItemWrapper.this;
        super();
    }
}
