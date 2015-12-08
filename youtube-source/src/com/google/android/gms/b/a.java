// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.c;

// Referenced classes of package com.google.android.gms.b:
//            b, e, c, d

public final class a
{

    private static boolean a = true;
    private static final c b = new b();

    public static void a(Context context, Integer integer, Long long1, Integer integer1, Integer integer2, Bundle bundle)
    {
        if (!a)
        {
            return;
        } else
        {
            context = new e(context, b, new com.google.android.gms.b.c());
            context.b(b);
            context.a(new d(context, integer, long1, integer1, integer2, bundle));
            context.a();
            return;
        }
    }

    static boolean a(boolean flag)
    {
        a = false;
        return false;
    }

}
