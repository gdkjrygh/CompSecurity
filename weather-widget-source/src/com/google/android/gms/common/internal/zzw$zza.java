// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzw, zzx

public static final class <init>
{

    private final Object zzIr;
    private final List zzael;

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder(100)).append(zzIr.getClass().getSimpleName()).append('{');
        int j = zzael.size();
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append((String)zzael.get(i));
            if (i < j - 1)
            {
                stringbuilder.append(", ");
            }
        }

        return stringbuilder.append('}').toString();
    }

    public zzael zzg(String s, Object obj)
    {
        zzael.add((new StringBuilder()).append((String)zzx.zzv(s)).append("=").append(String.valueOf(obj)).toString());
        return this;
    }

    private (Object obj)
    {
        zzIr = zzx.zzv(obj);
        zzael = new ArrayList();
    }

    zzael(Object obj, zzael zzael1)
    {
        this(obj);
    }
}
