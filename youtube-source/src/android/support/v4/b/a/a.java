// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.b.a;

import android.content.Context;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.b.a:
//            b, c

public abstract class a
{

    private static final WeakHashMap a = new WeakHashMap();

    a()
    {
    }

    public static a a(Context context)
    {
        WeakHashMap weakhashmap = a;
        weakhashmap;
        JVM INSTR monitorenter ;
        a a1 = (a)a.get(context);
        Object obj = a1;
        if (a1 != null) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        obj = new b(context);
_L3:
        a.put(context, obj);
_L2:
        weakhashmap;
        JVM INSTR monitorexit ;
        return ((a) (obj));
        obj = new c(context);
          goto _L3
        context;
        throw context;
    }

}
