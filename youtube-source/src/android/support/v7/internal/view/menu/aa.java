// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v4.view.n;
import android.support.v4.view.p;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            v, z

final class aa extends v
    implements p
{

    android.view.ActionProvider.VisibilityListener c;
    final z d;

    public aa(z z, n n1)
    {
        d = z;
        super(z, n1);
    }

    public final boolean isVisible()
    {
        n n1 = a;
        return true;
    }

    public final View onCreateActionView(MenuItem menuitem)
    {
        return a.b();
    }

    public final boolean overridesItemVisibility()
    {
        n n1 = a;
        return false;
    }

    public final void refreshVisibility()
    {
        a.c();
    }

    public final void setVisibilityListener(android.view.ActionProvider.VisibilityListener visibilitylistener)
    {
        c = visibilitylistener;
        n n1 = a;
        if (visibilitylistener != null)
        {
            visibilitylistener = this;
        } else
        {
            visibilitylistener = null;
        }
        n1.a(visibilitylistener);
    }
}
