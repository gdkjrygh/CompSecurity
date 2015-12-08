// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.support.v7.c.a;
import android.view.ActionMode;
import android.view.MenuInflater;

// Referenced classes of package android.support.v7.internal.view:
//            c

public final class b extends a
{

    final MenuInflater a;
    final ActionMode b;

    public b(Context context, ActionMode actionmode)
    {
        b = actionmode;
        a = new c(context);
    }

    public final void a()
    {
        b.finish();
    }
}
