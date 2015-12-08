// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.n;

// Referenced classes of package com.google.android.gms.internal:
//            gb, gc

public final class gj extends e
{

    private static final gj a = new gj();

    private gj()
    {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View a(Context context, int i, int j)
    {
        return a.b(context, i, j);
    }

    private View b(Context context, int i, int j)
    {
        try
        {
            com.google.android.gms.dynamic.k k = n.a(context);
            context = (View)n.a(((gb)a(context)).a(k, i, j));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new com.google.android.gms.dynamic.e.a((new StringBuilder("Could not get button with size ")).append(i).append(" and color ").append(j).toString(), context);
        }
        return context;
    }

    public final Object a(IBinder ibinder)
    {
        return gc.a(ibinder);
    }

}
