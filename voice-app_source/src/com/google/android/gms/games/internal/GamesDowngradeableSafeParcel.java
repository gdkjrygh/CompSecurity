// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.internal.zzlf;

public abstract class GamesDowngradeableSafeParcel extends DowngradeableSafeParcel
{

    public GamesDowngradeableSafeParcel()
    {
    }

    protected static boolean zzd(Integer integer)
    {
        if (integer == null)
        {
            return false;
        } else
        {
            return zzlf.zzbQ(integer.intValue());
        }
    }
}
