// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.maps.a.aj;
import com.google.android.gms.maps.a.cv;
import com.google.android.gms.maps.model.b;
import com.google.android.gms.maps.model.f;

// Referenced classes of package com.google.android.gms.maps:
//            b

public final class j
{

    private static boolean a = false;

    public static int a(Context context)
    {
        int i = 0;
        com/google/android/gms/maps/j;
        JVM INSTR monitorenter ;
        boolean flag;
        au.a(context, "Context is null");
        flag = a;
        if (!flag) goto _L2; else goto _L1
_L1:
        com/google/android/gms/maps/j;
        JVM INSTR monitorexit ;
        return i;
_L2:
        context = cv.a(context);
        a(((aj) (context)));
        a = true;
          goto _L1
        context;
        throw context;
        context;
        i = ((c) (context)).a;
          goto _L1
    }

    public static void a(aj aj1)
    {
        try
        {
            b.a(aj1.a());
            b.a(aj1.b());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aj aj1)
        {
            throw new f(aj1);
        }
    }

}
