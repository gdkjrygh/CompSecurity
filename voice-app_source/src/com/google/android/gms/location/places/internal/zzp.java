// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.location.places.zzg;

public class zzp
    implements zzg
{

    private int mIndex;
    private final String zzaAW;
    private final CharSequence zzaAX;
    private final int zzyZ;
    private final int zzza;

    public zzp(String s, int i, int j, CharSequence charsequence, int k)
    {
        zzaAW = s;
        zzyZ = i;
        zzza = j;
        zzaAX = charsequence;
        mIndex = k;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof zzp))
            {
                return false;
            }
            obj = (zzp)obj;
            if (((zzp) (obj)).zzyZ != zzyZ || ((zzp) (obj)).zzza != zzza || !zzt.equal(((zzp) (obj)).zzaAW, zzaAW) || !zzt.equal(((zzp) (obj)).zzaAX, zzaAX))
            {
                return false;
            }
        }
        return true;
    }

    public Object freeze()
    {
        return zzuZ();
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Integer.valueOf(zzyZ), Integer.valueOf(zzza), zzaAW, zzaAX
        });
    }

    public boolean isDataValid()
    {
        return true;
    }

    public zzg zzuZ()
    {
        return this;
    }
}
