// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.a.f;
import android.support.v7.internal.widget.NativeActionModeAwareLayout;
import android.support.v7.internal.widget.ak;
import android.view.ActionMode;

// Referenced classes of package android.support.v7.app:
//            k, ActionBarActivity, m, a

final class l extends k
    implements ak
{

    final NativeActionModeAwareLayout b;
    private ActionMode c;

    public l(ActionBarActivity actionbaractivity, a a1)
    {
        super(actionbaractivity, a1);
        b = (NativeActionModeAwareLayout)actionbaractivity.findViewById(f.e);
        if (b != null)
        {
            b.setActionModeForChildListener(this);
        }
    }

    static ActionMode a(l l1, ActionMode actionmode)
    {
        l1.c = actionmode;
        return actionmode;
    }

    public final android.view.ActionMode.Callback a(android.view.ActionMode.Callback callback)
    {
        return new m(this, callback);
    }

    final boolean f()
    {
        return c == null && super.f();
    }
}
