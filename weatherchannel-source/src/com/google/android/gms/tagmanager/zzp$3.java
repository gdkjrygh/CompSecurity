// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzlb;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzp, Container

class zzaLb
    implements a
{

    final zzp zzaKZ;
    final boolean zzaLb;

    public boolean zzb(Container container)
    {
        if (!zzaLb) goto _L2; else goto _L1
_L1:
        if (container.getLastRefreshTime() + 0x2932e00L < zzp.zzg(zzaKZ).currentTimeMillis()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (container.isDefault())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    ner(zzp zzp1, boolean flag)
    {
        zzaKZ = zzp1;
        zzaLb = flag;
        super();
    }
}
