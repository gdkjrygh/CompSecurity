// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.a;
import android.support.v4.view.a.u;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            a, ViewPager, aj

final class bv extends android.support.v4.view.a
{

    final ViewPager b;

    bv(ViewPager viewpager)
    {
        b = viewpager;
        super();
    }

    private boolean b()
    {
        return android.support.v4.view.ViewPager.a(b) != null && android.support.v4.view.ViewPager.a(b).a() > 1;
    }

    public final void a(View view, a a1)
    {
        super.a(view, a1);
        a1.b(android/support/v4/view/ViewPager.getName());
        a1.i(b());
        if (b.canScrollHorizontally(1))
        {
            a1.a(4096);
        }
        if (b.canScrollHorizontally(-1))
        {
            a1.a(8192);
        }
    }

    public final boolean a(View view, int i, Bundle bundle)
    {
        if (super.a(view, i, bundle))
        {
            return true;
        }
        switch (i)
        {
        default:
            return false;

        case 4096: 
            if (b.canScrollHorizontally(1))
            {
                b.setCurrentItem(ViewPager.b(b) + 1);
                return true;
            } else
            {
                return false;
            }

        case 8192: 
            break;
        }
        if (b.canScrollHorizontally(-1))
        {
            b.setCurrentItem(ViewPager.b(b) - 1);
            return true;
        } else
        {
            return false;
        }
    }

    public final void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/view/ViewPager.getName());
        view = u.a();
        view.a(b());
        if (accessibilityevent.getEventType() == 4096 && android.support.v4.view.ViewPager.a(b) != null)
        {
            view.a(android.support.v4.view.ViewPager.a(b).a());
            view.b(ViewPager.b(b));
            view.c(ViewPager.b(b));
        }
    }
}
