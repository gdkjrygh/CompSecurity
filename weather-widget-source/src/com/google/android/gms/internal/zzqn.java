// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzqi

public class zzqn
{

    private final List zzaTH = new ArrayList();

    public zzqn()
    {
    }

    public String getId()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = zzaTH.iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            zzqi zzqi1 = (zzqi)iterator.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append("#");
            }
            stringbuilder.append(zzqi1.getContainerId());
        }
        return stringbuilder.toString();
    }

    public List zzBv()
    {
        return zzaTH;
    }

    public zzqn zzb(zzqi zzqi1)
        throws IllegalArgumentException
    {
        zzx.zzv(zzqi1);
        for (Iterator iterator = zzaTH.iterator(); iterator.hasNext();)
        {
            if (((zzqi)iterator.next()).getContainerId().equals(zzqi1.getContainerId()))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("The container is already being requested. ").append(zzqi1.getContainerId()).toString());
            }
        }

        zzaTH.add(zzqi1);
        return this;
    }
}
