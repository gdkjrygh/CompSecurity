// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.support.v7.widget.bl;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.a:
//            b

class d
    implements bl
{

    final b a;

    d(b b1)
    {
        a = b1;
        super();
    }

    public boolean a(MenuItem menuitem)
    {
        return b.a(a).onMenuItemSelected(0, menuitem);
    }
}
