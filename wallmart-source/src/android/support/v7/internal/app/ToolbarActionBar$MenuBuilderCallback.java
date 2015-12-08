// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v7.internal.view.menu.a;
import android.support.v7.internal.widget.DecorToolbar;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.app:
//            ToolbarActionBar

private final class <init>
    implements android.support.v7.internal.view.menu.
{

    final ToolbarActionBar this$0;

    public boolean onMenuItemSelected(a a, MenuItem menuitem)
    {
        return false;
    }

    public void onMenuModeChange(a a)
    {
        if (ToolbarActionBar.access$000(ToolbarActionBar.this) != null)
        {
            if (ToolbarActionBar.access$300(ToolbarActionBar.this).isOverflowMenuShowing())
            {
                ToolbarActionBar.access$000(ToolbarActionBar.this)._mth0(8, a);
            } else
            if (ToolbarActionBar.access$000(ToolbarActionBar.this)._mth0(0, null, a))
            {
                ToolbarActionBar.access$000(ToolbarActionBar.this)._mth0(8, a);
                return;
            }
        }
    }

    private ()
    {
        this$0 = ToolbarActionBar.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
