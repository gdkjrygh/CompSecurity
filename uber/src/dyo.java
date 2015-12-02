// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

public final class dyo
{

    private final Context a;
    private final hkf b;
    private final String c;
    private final dyi d;
    private final gmg e;

    public dyo(Context context, String s, dyi dyi1, hkf hkf1, gmg gmg1)
    {
        a = context;
        c = s;
        d = dyi1;
        b = hkf1;
        e = gmg1;
    }

    public final boolean a()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        dym dym1;
        int i = (int)e.a(dbf.Z, "max_contacts", 2000L);
        dym1 = dyi.a(a, i);
        if (dym1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        boolean flag1 = dym1.a().isEmpty();
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        b.a(c, dym1.a()).j().a();
        flag = true;
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        throw obj;
        obj;
        if (true) goto _L1; else goto _L3
_L3:
    }
}
