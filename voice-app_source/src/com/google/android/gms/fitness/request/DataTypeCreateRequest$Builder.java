// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.Field;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataTypeCreateRequest

public static class zzakq
{

    private String mName;
    private List zzakq;

    static String zza(zzakq zzakq1)
    {
        return zzakq1.mName;
    }

    static List zzb(mName mname)
    {
        return mname.zzakq;
    }

    public zzakq addField(Field field)
    {
        if (!zzakq.contains(field))
        {
            zzakq.add(field);
        }
        return this;
    }

    public zzakq addField(String s, int i)
    {
        boolean flag;
        if (s != null && !s.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Invalid name specified");
        return addField(Field.zzn(s, i));
    }

    public DataTypeCreateRequest build()
    {
        boolean flag1 = true;
        boolean flag;
        if (mName != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Must set the name");
        if (!zzakq.isEmpty())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Must specify the data fields");
        return new DataTypeCreateRequest(this, null);
    }

    public zzakq setName(String s)
    {
        mName = s;
        return this;
    }

    public ()
    {
        zzakq = new ArrayList();
    }
}
