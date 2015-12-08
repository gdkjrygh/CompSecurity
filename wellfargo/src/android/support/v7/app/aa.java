// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            z, ab, t

class aa extends z
{

    private boolean o;

    aa(Context context, Window window, t t)
    {
        super(context, window, t);
        o = true;
    }

    static boolean a(aa aa1)
    {
        return aa1.o;
    }

    android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new ab(this, callback);
    }
}
