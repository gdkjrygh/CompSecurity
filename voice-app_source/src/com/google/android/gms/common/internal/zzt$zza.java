// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzt, zzu

public static final class <init>
{

    private final Object zzGE;
    private final List zzabb;

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder(100)).append(zzGE.getClass().getSimpleName()).append('{');
        int j = zzabb.size();
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append((String)zzabb.get(i));
            if (i < j - 1)
            {
                stringbuilder.append(", ");
            }
        }

        return stringbuilder.append('}').toString();
    }

    public zzabb zzg(String s, Object obj)
    {
        zzabb.add((new StringBuilder()).append((String)zzu.zzu(s)).append("=").append(String.valueOf(obj)).toString());
        return this;
    }

    private (Object obj)
    {
        zzGE = zzu.zzu(obj);
        zzabb = new ArrayList();
    }

    zzabb(Object obj, zzabb zzabb1)
    {
        this(obj);
    }
}
