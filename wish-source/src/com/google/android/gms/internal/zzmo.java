// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzmj

public class zzmo
{

    private final List zzaGZ = new ArrayList();

    public zzmo()
    {
    }

    public String getId()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = zzaGZ.iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            zzmj zzmj1 = (zzmj)iterator.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append("#");
            }
            stringbuilder.append(zzmj1.getContainerId());
        }
        return stringbuilder.toString();
    }

    public zzmo zzb(zzmj zzmj1)
        throws IllegalArgumentException
    {
        zzv.zzr(zzmj1);
        for (Iterator iterator = zzaGZ.iterator(); iterator.hasNext();)
        {
            if (((zzmj)iterator.next()).getContainerId().equals(zzmj1.getContainerId()))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("The container is already being requested. ").append(zzmj1.getContainerId()).toString());
            }
        }

        zzaGZ.add(zzmj1);
        return this;
    }

    public List zzyj()
    {
        return zzaGZ;
    }
}
