// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v7.internal.view.menu.a;

// Referenced classes of package android.support.v7.internal.app:
//            ToolbarActionBar

private final class <init>
    implements android.support.v7.internal.view.menu.
{

    final ToolbarActionBar this$0;

    public void onCloseMenu(a a, boolean flag)
    {
        if (ToolbarActionBar.access$000(ToolbarActionBar.this) != null)
        {
            ToolbarActionBar.access$000(ToolbarActionBar.this)._mth0(0, a);
        }
    }

    public boolean onOpenSubMenu(a a)
    {
        if (a == null && ToolbarActionBar.access$000(ToolbarActionBar.this) != null)
        {
            ToolbarActionBar.access$000(ToolbarActionBar.this)._mth0(0, a);
        }
        return true;
    }

    private Q()
    {
        this$0 = ToolbarActionBar.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
