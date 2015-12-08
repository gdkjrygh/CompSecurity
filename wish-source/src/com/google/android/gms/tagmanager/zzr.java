// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcz

class zzr extends zzcz
{

    private static final String ID;

    public zzr()
    {
        super(ID);
    }

    protected boolean zza(String s, String s1, Map map)
    {
        return s.contains(s1);
    }

    static 
    {
        ID = zza.zzaw.toString();
    }
}
