// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//            OneoffTask

static final class 
    implements android.os.eator
{

    public Object createFromParcel(Parcel parcel)
    {
        return zzeh(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgt(i);
    }

    public OneoffTask zzeh(Parcel parcel)
    {
        return new OneoffTask(parcel, null);
    }

    public OneoffTask[] zzgt(int i)
    {
        return new OneoffTask[i];
    }

    ()
    {
    }
}
