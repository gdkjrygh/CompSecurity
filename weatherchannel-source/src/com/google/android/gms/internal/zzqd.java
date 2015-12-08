// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzpy

public class zzqd
{

    private final List zzaPn = new ArrayList();

    public zzqd()
    {
    }

    public String getId()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = zzaPn.iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            zzpy zzpy1 = (zzpy)iterator.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append("#");
            }
            stringbuilder.append(zzpy1.getContainerId());
        }
        return stringbuilder.toString();
    }

    public List zzAf()
    {
        return zzaPn;
    }

    public zzqd zzb(zzpy zzpy1)
        throws IllegalArgumentException
    {
        zzu.zzu(zzpy1);
        for (Iterator iterator = zzaPn.iterator(); iterator.hasNext();)
        {
            if (((zzpy)iterator.next()).getContainerId().equals(zzpy1.getContainerId()))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("The container is already being requested. ").append(zzpy1.getContainerId()).toString());
            }
        }

        zzaPn.add(zzpy1);
        return this;
    }
}
