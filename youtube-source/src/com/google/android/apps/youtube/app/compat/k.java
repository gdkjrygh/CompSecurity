// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.app.compat:
//            j, q

final class k
    implements SubMenu
{

    final j a;
    private final SubMenu b;

    public k(j j1, SubMenu submenu)
    {
        a = j1;
        super();
        b = (SubMenu)c.a(submenu);
        j.a(j1, getItem());
    }

    public final MenuItem add(int i)
    {
        return j.a(a, b.add(i)).a();
    }

    public final MenuItem add(int i, int l, int i1, int j1)
    {
        return j.a(a, b.add(i, l, i1, j1)).a();
    }

    public final MenuItem add(int i, int l, int i1, CharSequence charsequence)
    {
        return j.a(a, b.add(i, l, i1, charsequence)).a();
    }

    public final MenuItem add(CharSequence charsequence)
    {
        return j.a(a, b.add(charsequence)).a();
    }

    public final int addIntentOptions(int i, int l, int i1, ComponentName componentname, Intent aintent[], Intent intent, int j1, 
            MenuItem amenuitem[])
    {
        return b.addIntentOptions(i, l, i1, componentname, aintent, intent, j1, amenuitem);
    }

    public final SubMenu addSubMenu(int i)
    {
        return new k(a, b.addSubMenu(i));
    }

    public final SubMenu addSubMenu(int i, int l, int i1, int j1)
    {
        return new k(a, b.addSubMenu(i, l, i1, j1));
    }

    public final SubMenu addSubMenu(int i, int l, int i1, CharSequence charsequence)
    {
        return new k(a, b.addSubMenu(i, l, i1, charsequence));
    }

    public final SubMenu addSubMenu(CharSequence charsequence)
    {
        return new k(a, b.addSubMenu(charsequence));
    }

    public final void clear()
    {
        b.clear();
    }

    public final void clearHeader()
    {
        b.clearHeader();
    }

    public final void close()
    {
        b.close();
    }

    public final MenuItem findItem(int i)
    {
        return b.findItem(i);
    }

    public final MenuItem getItem()
    {
        return b.getItem();
    }

    public final MenuItem getItem(int i)
    {
        return b.getItem(i);
    }

    public final boolean hasVisibleItems()
    {
        return b.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i, KeyEvent keyevent)
    {
        return b.isShortcutKey(i, keyevent);
    }

    public final boolean performIdentifierAction(int i, int l)
    {
        return b.performIdentifierAction(i, l);
    }

    public final boolean performShortcut(int i, KeyEvent keyevent, int l)
    {
        return b.performShortcut(i, keyevent, l);
    }

    public final void removeGroup(int i)
    {
        b.removeGroup(i);
    }

    public final void removeItem(int i)
    {
        b.removeItem(i);
        j.a(a).remove(i);
    }

    public final void setGroupCheckable(int i, boolean flag, boolean flag1)
    {
        b.setGroupCheckable(i, flag, flag1);
    }

    public final void setGroupEnabled(int i, boolean flag)
    {
        b.setGroupEnabled(i, flag);
    }

    public final void setGroupVisible(int i, boolean flag)
    {
        b.setGroupVisible(i, flag);
    }

    public final SubMenu setHeaderIcon(int i)
    {
        b.setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable)
    {
        b.setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i)
    {
        b.setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charsequence)
    {
        b.setHeaderTitle(charsequence);
        return this;
    }

    public final SubMenu setHeaderView(View view)
    {
        b.setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i)
    {
        b.setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable)
    {
        b.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean flag)
    {
        b.setQwertyMode(flag);
    }

    public final int size()
    {
        return b.size();
    }
}
