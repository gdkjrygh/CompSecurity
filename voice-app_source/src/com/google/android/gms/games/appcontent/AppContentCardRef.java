// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            MultiDataBufferRef, AppContentCard, AppContentCardEntity, AppContentUtils

public final class AppContentCardRef extends MultiDataBufferRef
    implements AppContentCard
{

    AppContentCardRef(ArrayList arraylist, int i)
    {
        super(arraylist, 0, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return AppContentCardEntity.zza(this, obj);
    }

    public Object freeze()
    {
        return zzsd();
    }

    public List getActions()
    {
        return AppContentUtils.zza(zzWu, zzaoD, "card_actions", zzYs);
    }

    public String getDescription()
    {
        return getString("card_description");
    }

    public Bundle getExtras()
    {
        return AppContentUtils.zzd(zzWu, zzaoD, "card_data", zzYs);
    }

    public String getId()
    {
        return getString("card_id");
    }

    public String getTitle()
    {
        return getString("card_title");
    }

    public String getType()
    {
        return getString("card_type");
    }

    public int hashCode()
    {
        return AppContentCardEntity.zza(this);
    }

    public String toString()
    {
        return AppContentCardEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentCardEntity)zzsd()).writeToParcel(parcel, i);
    }

    public List zzrO()
    {
        return AppContentUtils.zzc(zzWu, zzaoD, "card_conditions", zzYs);
    }

    public String zzrP()
    {
        return getString("card_content_description");
    }

    public List zzrZ()
    {
        return AppContentUtils.zzb(zzWu, zzaoD, "card_annotations", zzYs);
    }

    public int zzsa()
    {
        return getInteger("card_current_steps");
    }

    public String zzsb()
    {
        return getString("card_subtitle");
    }

    public int zzsc()
    {
        return getInteger("card_total_steps");
    }

    public AppContentCard zzsd()
    {
        return new AppContentCardEntity(this);
    }
}
