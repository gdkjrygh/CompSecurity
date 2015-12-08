// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ad

class ab
    implements ad
{

    ab()
    {
    }

    public final MenuItem a(MenuItem menuitem, View view)
    {
        return menuitem.setActionView(view);
    }

    public final void a(MenuItem menuitem, int i)
    {
        menuitem.setShowAsAction(i);
    }

    public final MenuItem b(MenuItem menuitem, int i)
    {
        return menuitem.setActionView(i);
    }
}
