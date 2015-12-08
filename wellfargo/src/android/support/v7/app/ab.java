// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.view.d;
import android.view.ActionMode;

// Referenced classes of package android.support.v7.app:
//            y, aa

class ab extends y
{

    final aa b;

    ab(aa aa1, android.view.Window.Callback callback)
    {
        b = aa1;
        super(aa1, callback);
    }

    final ActionMode a(android.view.ActionMode.Callback callback)
    {
        callback = new d(b.a, callback);
        android.support.v7.c.a a1 = b.a(callback);
        if (a1 != null)
        {
            return callback.b(a1);
        } else
        {
            return null;
        }
    }

    public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
    {
        if (aa.a(b))
        {
            return a(callback);
        } else
        {
            return super.onWindowStartingActionMode(callback);
        }
    }
}
