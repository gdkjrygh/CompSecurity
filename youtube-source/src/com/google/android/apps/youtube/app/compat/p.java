// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.app.compat:
//            j, q

final class p
    implements Menu
{

    private final j a;

    public p(j j1)
    {
        a = (j)c.a(j1);
    }

    public final MenuItem add(int i)
    {
        return a.a(i).a();
    }

    public final MenuItem add(int i, int k, int l, int i1)
    {
        return a.a(i, k, l, i1).a();
    }

    public final MenuItem add(int i, int k, int l, CharSequence charsequence)
    {
        return a.a(i, k, l, charsequence).a();
    }

    public final MenuItem add(CharSequence charsequence)
    {
        return a.a(charsequence).a();
    }

    public final int addIntentOptions(int i, int k, int l, ComponentName componentname, Intent aintent[], Intent intent, int i1, 
            MenuItem amenuitem[])
    {
        return a.a(i, k, l, componentname, aintent, intent, i1, amenuitem);
    }

    public final SubMenu addSubMenu(int i)
    {
        return a.b(i);
    }

    public final SubMenu addSubMenu(int i, int k, int l, int i1)
    {
        return a.b(i, k, l, i1);
    }

    public final SubMenu addSubMenu(int i, int k, int l, CharSequence charsequence)
    {
        return a.b(i, k, l, charsequence);
    }

    public final SubMenu addSubMenu(CharSequence charsequence)
    {
        return a.b(charsequence);
    }

    public final void clear()
    {
        a.a();
    }

    public final void close()
    {
        a.b();
    }

    public final MenuItem findItem(int i)
    {
        return a.c(i).a();
    }

    public final MenuItem getItem(int i)
    {
        return a.d(i).a();
    }

    public final boolean hasVisibleItems()
    {
        return a.c();
    }

    public final boolean isShortcutKey(int i, KeyEvent keyevent)
    {
        return a.a(i, keyevent);
    }

    public final boolean performIdentifierAction(int i, int k)
    {
        return a.a(i, k);
    }

    public final boolean performShortcut(int i, KeyEvent keyevent, int k)
    {
        return a.a(i, keyevent, k);
    }

    public final void removeGroup(int i)
    {
        a.e(i);
    }

    public final void removeItem(int i)
    {
        a.f(i);
    }

    public final void setGroupCheckable(int i, boolean flag, boolean flag1)
    {
        a.a(i, flag, flag1);
    }

    public final void setGroupEnabled(int i, boolean flag)
    {
        a.a(i, flag);
    }

    public final void setGroupVisible(int i, boolean flag)
    {
        a.b(i, flag);
    }

    public final void setQwertyMode(boolean flag)
    {
        a.a(flag);
    }

    public final int size()
    {
        return a.d();
    }
}
