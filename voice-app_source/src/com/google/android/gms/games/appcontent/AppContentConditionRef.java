// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            MultiDataBufferRef, AppContentCondition, AppContentConditionEntity, AppContentUtils

public final class AppContentConditionRef extends MultiDataBufferRef
    implements AppContentCondition
{

    AppContentConditionRef(ArrayList arraylist, int i)
    {
        super(arraylist, 4, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return AppContentConditionEntity.zza(this, obj);
    }

    public Object freeze()
    {
        return zzsi();
    }

    public int hashCode()
    {
        return AppContentConditionEntity.zza(this);
    }

    public String toString()
    {
        return AppContentConditionEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentConditionEntity)zzsi()).writeToParcel(parcel, i);
    }

    public String zzse()
    {
        return getString("condition_default_value");
    }

    public String zzsf()
    {
        return getString("condition_expected_value");
    }

    public String zzsg()
    {
        return getString("condition_predicate");
    }

    public Bundle zzsh()
    {
        return AppContentUtils.zzd(zzWu, zzaoD, "condition_predicate_parameters", zzYs);
    }

    public AppContentCondition zzsi()
    {
        return new AppContentConditionEntity(this);
    }
}
