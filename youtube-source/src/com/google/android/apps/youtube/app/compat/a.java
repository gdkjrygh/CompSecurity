// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.compat:
//            b

public final class a
    implements Menu
{

    private final Context a;
    private final List b = new LinkedList();

    public a(Context context)
    {
        a = (Context)c.a(context);
    }

    private void a(b b1)
    {
        int j = b1.getOrder();
        for (int i = b.size() - 1; i >= 0; i--)
        {
            if (((b)b.get(i)).getOrder() <= j)
            {
                b.add(i + 1, b1);
                return;
            }
        }

        b.add(b1);
    }

    public final MenuItem add(int i)
    {
        return add(0, 0, 0, ((CharSequence) (a.getResources().getString(i))));
    }

    public final MenuItem add(int i, int j, int k, int l)
    {
        return add(i, j, k, ((CharSequence) (a.getResources().getString(l))));
    }

    public final MenuItem add(int i, int j, int k, CharSequence charsequence)
    {
        charsequence = new b(a, i, j, k, charsequence);
        a(charsequence);
        return charsequence;
    }

    public final MenuItem add(CharSequence charsequence)
    {
        charsequence = new b(a, 0, 0, 0, charsequence);
        a(charsequence);
        return charsequence;
    }

    public final int addIntentOptions(int i, int j, int k, ComponentName componentname, Intent aintent[], Intent intent, int l, 
            MenuItem amenuitem[])
    {
        return 0;
    }

    public final SubMenu addSubMenu(int i)
    {
        return null;
    }

    public final SubMenu addSubMenu(int i, int j, int k, int l)
    {
        return null;
    }

    public final SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
    {
        return null;
    }

    public final SubMenu addSubMenu(CharSequence charsequence)
    {
        return null;
    }

    public final void clear()
    {
        b.clear();
    }

    public final void close()
    {
    }

    public final MenuItem findItem(int i)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            b b1 = (b)iterator.next();
            if (b1.getItemId() == i)
            {
                return b1;
            }
        }

        return null;
    }

    public final MenuItem getItem(int i)
    {
        return (MenuItem)b.get(i);
    }

    public final boolean hasVisibleItems()
    {
        return true;
    }

    public final boolean isShortcutKey(int i, KeyEvent keyevent)
    {
        return false;
    }

    public final boolean performIdentifierAction(int i, int j)
    {
        return false;
    }

    public final boolean performShortcut(int i, KeyEvent keyevent, int j)
    {
        return false;
    }

    public final void removeGroup(int i)
    {
    }

    public final void removeItem(int i)
    {
        MenuItem menuitem = findItem(i);
        if (menuitem != null)
        {
            b.remove(menuitem);
        }
    }

    public final void setGroupCheckable(int i, boolean flag, boolean flag1)
    {
    }

    public final void setGroupEnabled(int i, boolean flag)
    {
    }

    public final void setGroupVisible(int i, boolean flag)
    {
    }

    public final void setQwertyMode(boolean flag)
    {
    }

    public final int size()
    {
        return b.size();
    }
}
