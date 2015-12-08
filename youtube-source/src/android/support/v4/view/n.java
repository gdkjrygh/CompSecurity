// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            o, p

public abstract class n
{

    private final Context a;
    private o b;
    private p c;

    public final Context a()
    {
        return a;
    }

    public final void a(o o1)
    {
        b = o1;
    }

    public final void a(p p)
    {
        if (c != null && p != null)
        {
            Log.w("ActionProvider(support)", (new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ")).append(getClass().getSimpleName()).append(" instance while it is still in use somewhere else?").toString());
        }
        c = p;
    }

    public final void a(boolean flag)
    {
        if (b != null)
        {
            b.a(flag);
        }
    }

    public abstract View b();

    public final void c()
    {
        p p = c;
    }
}
