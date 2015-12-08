// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v4.c.a.b;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package android.support.v7.internal.view.menu:
//            l, z, u, ak

abstract class k extends l
{

    private HashMap b;
    private HashMap c;

    k(Object obj)
    {
        super(obj);
    }

    final b a(MenuItem menuitem)
    {
        if (menuitem != null)
        {
            if (b == null)
            {
                b = new HashMap();
            }
            b b1 = (b)b.get(menuitem);
            Object obj = b1;
            if (b1 == null)
            {
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    obj = new z(menuitem);
                } else
                if (android.os.Build.VERSION.SDK_INT >= 14)
                {
                    obj = new u(menuitem);
                } else
                {
                    throw new UnsupportedOperationException();
                }
                b.put(menuitem, obj);
            }
            return ((b) (obj));
        } else
        {
            return null;
        }
    }

    final SubMenu a(SubMenu submenu)
    {
label0:
        {
label1:
            {
                if (submenu == null)
                {
                    break label0;
                }
                if (c == null)
                {
                    c = new HashMap();
                }
                SubMenu submenu1 = (SubMenu)c.get(submenu);
                Object obj = submenu1;
                if (submenu1 == null)
                {
                    if (android.os.Build.VERSION.SDK_INT < 14)
                    {
                        break label1;
                    }
                    obj = new ak(submenu);
                    c.put(submenu, obj);
                }
                return ((SubMenu) (obj));
            }
            throw new UnsupportedOperationException();
        }
        return null;
    }

    final void a()
    {
        if (b != null)
        {
            b.clear();
        }
        if (c != null)
        {
            c.clear();
        }
    }

    final void a(int i)
    {
        if (b != null)
        {
            Iterator iterator = b.keySet().iterator();
            while (iterator.hasNext()) 
            {
                if (i == ((MenuItem)iterator.next()).getGroupId())
                {
                    iterator.remove();
                }
            }
        }
    }

    final void b(int i)
    {
        if (b != null)
        {
            Iterator iterator = b.keySet().iterator();
            while (iterator.hasNext()) 
            {
                if (i == ((MenuItem)iterator.next()).getItemId())
                {
                    iterator.remove();
                    return;
                }
            }
        }
    }
}
