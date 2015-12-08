// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            MostRecentGameInfo, MostRecentGameInfoEntity, PlayerColumnNames

public final class MostRecentGameInfoRef extends zzc
    implements MostRecentGameInfo
{

    private final PlayerColumnNames zzanX;

    public MostRecentGameInfoRef(DataHolder dataholder, int i, PlayerColumnNames playercolumnnames)
    {
        super(dataholder, i);
        zzanX = playercolumnnames;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return MostRecentGameInfoEntity.zza(this, obj);
    }

    public Object freeze()
    {
        return zztA();
    }

    public int hashCode()
    {
        return MostRecentGameInfoEntity.zza(this);
    }

    public String toString()
    {
        return MostRecentGameInfoEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((MostRecentGameInfoEntity)zztA()).writeToParcel(parcel, i);
    }

    public MostRecentGameInfo zztA()
    {
        return new MostRecentGameInfoEntity(this);
    }

    public String zztu()
    {
        return getString(zzanX.zzato);
    }

    public String zztv()
    {
        return getString(zzanX.zzatp);
    }

    public long zztw()
    {
        return getLong(zzanX.zzatq);
    }

    public Uri zztx()
    {
        return zzbW(zzanX.zzatr);
    }

    public Uri zzty()
    {
        return zzbW(zzanX.zzats);
    }

    public Uri zztz()
    {
        return zzbW(zzanX.zzatt);
    }
}
