// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityInfo;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzg

public static class zzaTE
    implements CapabilityInfo
{

    private final String mName;
    private final Set zzaTE;

    public String getName()
    {
        return mName;
    }

    public Set getNodes()
    {
        return zzaTE;
    }

    public (CapabilityInfo capabilityinfo)
    {
        this(capabilityinfo.getName(), capabilityinfo.getNodes());
    }

    public tNodes(String s, Set set)
    {
        mName = s;
        zzaTE = set;
    }
}
