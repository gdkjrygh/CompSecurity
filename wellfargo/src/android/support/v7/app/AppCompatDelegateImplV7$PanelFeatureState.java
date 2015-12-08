// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.a.b;
import android.support.v7.a.i;
import android.support.v7.a.k;
import android.support.v7.a.l;
import android.support.v7.internal.view.ContextThemeWrapper;
import android.support.v7.internal.view.menu.g;
import android.support.v7.internal.view.menu.y;
import android.support.v7.internal.view.menu.z;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

final class q
{

    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    ViewGroup g;
    View h;
    View i;
    android.support.v7.internal.view.menu.i j;
    g k;
    Context l;
    boolean m;
    boolean n;
    boolean o;
    public boolean p;
    boolean q;
    boolean r;
    Bundle s;

    z a(y y)
    {
        if (j == null)
        {
            return null;
        }
        if (k == null)
        {
            k = new g(l, i.abc_list_menu_item_layout);
            k.a(y);
            j.a(k);
        }
        return k.a(g);
    }

    void a(Context context)
    {
        TypedValue typedvalue = new TypedValue();
        android.content.res.te te = context.getResources().newTheme();
        te.te(context.getTheme());
        te.te(b.actionBarPopupTheme, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            te.te(typedvalue.resourceId, true);
        }
        te.te(b.panelMenuListTheme, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            te.te(typedvalue.resourceId, true);
        } else
        {
            te.te(k.Theme_AppCompat_CompactMenu, true);
        }
        context = new ContextThemeWrapper(context, 0);
        context.getTheme().te(te);
        l = context;
        context = context.obtainStyledAttributes(l.Theme);
        b = context.getResourceId(l.Theme_panelBackground, 0);
        f = context.getResourceId(l.Theme_android_windowAnimationStyle, 0);
        context.recycle();
    }

    void a(android.support.v7.internal.view.menu.i i1)
    {
        if (i1 != j)
        {
            if (j != null)
            {
                j.b(k);
            }
            j = i1;
            if (i1 != null && k != null)
            {
                i1.a(k);
                return;
            }
        }
    }

    public boolean a()
    {
        boolean flag1 = true;
        boolean flag;
        if (h == null)
        {
            flag = false;
        } else
        {
            flag = flag1;
            if (i == null)
            {
                flag = flag1;
                if (k.a().getCount() <= 0)
                {
                    return false;
                }
            }
        }
        return flag;
    }

    (int i1)
    {
        a = i1;
        q = false;
    }
}
