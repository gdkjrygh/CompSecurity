// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.internal.view.menu.a;
import android.support.v7.widget.Toolbar;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            bg

class bh
    implements android.view.View.OnClickListener
{

    final a a;
    final bg b;

    bh(bg bg1)
    {
        b = bg1;
        super();
        a = new a(android.support.v7.internal.widget.bg.a(b).getContext(), 0, 0x102002c, 0, 0, bg.b(b));
    }

    public void onClick(View view)
    {
        if (bg.c(b) != null && bg.d(b))
        {
            bg.c(b).onMenuItemSelected(0, a);
        }
    }
}
