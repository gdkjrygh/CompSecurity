// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.app:
//            l

final class m
    implements android.view.ActionMode.Callback
{

    final l a;
    private final android.view.ActionMode.Callback b;

    m(l l1, android.view.ActionMode.Callback callback)
    {
        a = l1;
        super();
        b = callback;
    }

    public final boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        return b.onActionItemClicked(actionmode, menuitem);
    }

    public final boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        boolean flag = b.onCreateActionMode(actionmode, menu);
        if (flag)
        {
            l.a(a, actionmode);
            a.d();
        }
        return flag;
    }

    public final void onDestroyActionMode(ActionMode actionmode)
    {
        b.onDestroyActionMode(actionmode);
        a.e();
        l.a(a, null);
    }

    public final boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        return b.onPrepareActionMode(actionmode, menu);
    }
}
