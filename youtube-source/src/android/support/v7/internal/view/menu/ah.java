// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.Menu;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ai, z, u

public final class ah
{

    public static Menu a(Menu menu)
    {
        Object obj = menu;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            obj = new ai(menu);
        }
        return ((Menu) (obj));
    }

    public static MenuItem a(MenuItem menuitem)
    {
        Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            obj = new z(menuitem);
        } else
        {
            obj = menuitem;
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                return new u(menuitem);
            }
        }
        return ((MenuItem) (obj));
    }
}
