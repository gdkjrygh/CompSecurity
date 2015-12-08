// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.b.a.a;
import android.support.v4.b.a.b;
import android.support.v4.b.a.c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ac, t, o, ae

public final class ab
{

    public static Menu a(Context context, a a1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new ac(context, a1);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }

    public static MenuItem a(Context context, b b)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new t(context, b);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new o(context, b);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }

    public static SubMenu a(Context context, c c)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new ae(context, c);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }
}
