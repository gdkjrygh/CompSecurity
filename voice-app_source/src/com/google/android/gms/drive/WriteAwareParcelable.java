// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zzu;

public abstract class WriteAwareParcelable
    implements Parcelable
{

    private volatile transient boolean zzadM;

    public WriteAwareParcelable()
    {
        zzadM = false;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag;
        if (!zzpt())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzU(flag);
        zzadM = true;
        zzI(parcel, i);
    }

    protected abstract void zzI(Parcel parcel, int i);

    public final boolean zzpt()
    {
        return zzadM;
    }
}
