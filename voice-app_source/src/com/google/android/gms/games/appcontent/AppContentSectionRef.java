// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            MultiDataBufferRef, AppContentSection, AppContentSectionEntity, AppContentUtils, 
//            AppContentCardRef

public final class AppContentSectionRef extends MultiDataBufferRef
    implements AppContentSection
{

    private final int zzaoG;

    AppContentSectionRef(ArrayList arraylist, int i, int j)
    {
        super(arraylist, 0, i);
        zzaoG = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return AppContentSectionEntity.zza(this, obj);
    }

    public Object freeze()
    {
        return zzsl();
    }

    public List getActions()
    {
        return zzsm();
    }

    public Bundle getExtras()
    {
        return AppContentUtils.zzd(zzWu, zzaoD, "section_data", zzYs);
    }

    public String getId()
    {
        return getString("section_id");
    }

    public String getTitle()
    {
        return getString("section_title");
    }

    public String getType()
    {
        return getString("section_type");
    }

    public int hashCode()
    {
        return AppContentSectionEntity.zza(this);
    }

    public String toString()
    {
        return AppContentSectionEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentSectionEntity)zzsl()).writeToParcel(parcel, i);
    }

    public String zzrP()
    {
        return getString("section_content_description");
    }

    public List zzrZ()
    {
        return zzsn();
    }

    public String zzsb()
    {
        return getString("section_subtitle");
    }

    public List zzsj()
    {
        return zzso();
    }

    public String zzsk()
    {
        return getString("section_card_type");
    }

    public AppContentSection zzsl()
    {
        return new AppContentSectionEntity(this);
    }

    public ArrayList zzsm()
    {
        return AppContentUtils.zza(zzWu, zzaoD, "section_actions", zzYs);
    }

    public ArrayList zzsn()
    {
        return AppContentUtils.zzb(zzWu, zzaoD, "section_annotations", zzYs);
    }

    public ArrayList zzso()
    {
        ArrayList arraylist = new ArrayList(zzaoG);
        for (int i = 0; i < zzaoG; i++)
        {
            arraylist.add(new AppContentCardRef(zzaoD, zzYs + i));
        }

        return arraylist;
    }
}
