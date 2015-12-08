// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MenuItem;

// Referenced classes of package android.support.v4.view:
//            MenuItemCompat, MenuItemCompatIcs

static class _cls1.val.listener extends nImpl
{

    public boolean collapseActionView(MenuItem menuitem)
    {
        return MenuItemCompatIcs.collapseActionView(menuitem);
    }

    public boolean expandActionView(MenuItem menuitem)
    {
        return MenuItemCompatIcs.expandActionView(menuitem);
    }

    public boolean isActionViewExpanded(MenuItem menuitem)
    {
        return MenuItemCompatIcs.isActionViewExpanded(menuitem);
    }

    public MenuItem setOnActionExpandListener(MenuItem menuitem, final ner listener)
    {
        if (listener == null)
        {
            return MenuItemCompatIcs.setOnActionExpandListener(menuitem, null);
        } else
        {
            return MenuItemCompatIcs.setOnActionExpandListener(menuitem, new MenuItemCompatIcs.SupportActionExpandProxy() {

                final MenuItemCompat.IcsMenuVersionImpl this$0;
                final MenuItemCompat.OnActionExpandListener val$listener;

                public boolean onMenuItemActionCollapse(MenuItem menuitem1)
                {
                    return listener.onMenuItemActionCollapse(menuitem1);
                }

                public boolean onMenuItemActionExpand(MenuItem menuitem1)
                {
                    return listener.onMenuItemActionExpand(menuitem1);
                }

            
            {
                this$0 = MenuItemCompat.IcsMenuVersionImpl.this;
                listener = onactionexpandlistener;
                super();
            }
            });
        }
    }

    _cls1.val.listener()
    {
    }
}
