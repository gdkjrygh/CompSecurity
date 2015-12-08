// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.zzg;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzt, zzp

public class zzq extends zzt
    implements zzg
{

    private final String zzaAW = getString("photo_fife_url");

    public zzq(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public Object freeze()
    {
        return zzuZ();
    }

    public CharSequence getAttributions()
    {
        return zzB("photo_attributions", null);
    }

    public int getMaxHeight()
    {
        return zzz("photo_max_height", 0);
    }

    public int getMaxWidth()
    {
        return zzz("photo_max_width", 0);
    }

    public zzg zzuZ()
    {
        return new zzp(zzaAW, getMaxWidth(), getMaxHeight(), getAttributions(), zzYs);
    }
}
