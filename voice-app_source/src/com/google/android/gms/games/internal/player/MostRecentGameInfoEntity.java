// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            MostRecentGameInfo, MostRecentGameInfoEntityCreator

public final class MostRecentGameInfoEntity
    implements SafeParcelable, MostRecentGameInfo
{

    public static final MostRecentGameInfoEntityCreator CREATOR = new MostRecentGameInfoEntityCreator();
    private final int zzCY;
    private final String zzasP;
    private final String zzasQ;
    private final long zzasR;
    private final Uri zzasS;
    private final Uri zzasT;
    private final Uri zzasU;

    MostRecentGameInfoEntity(int i, String s, String s1, long l, Uri uri, Uri uri1, 
            Uri uri2)
    {
        zzCY = i;
        zzasP = s;
        zzasQ = s1;
        zzasR = l;
        zzasS = uri;
        zzasT = uri1;
        zzasU = uri2;
    }

    public MostRecentGameInfoEntity(MostRecentGameInfo mostrecentgameinfo)
    {
        zzCY = 2;
        zzasP = mostrecentgameinfo.zztu();
        zzasQ = mostrecentgameinfo.zztv();
        zzasR = mostrecentgameinfo.zztw();
        zzasS = mostrecentgameinfo.zztx();
        zzasT = mostrecentgameinfo.zzty();
        zzasU = mostrecentgameinfo.zztz();
    }

    static int zza(MostRecentGameInfo mostrecentgameinfo)
    {
        return zzt.hashCode(new Object[] {
            mostrecentgameinfo.zztu(), mostrecentgameinfo.zztv(), Long.valueOf(mostrecentgameinfo.zztw()), mostrecentgameinfo.zztx(), mostrecentgameinfo.zzty(), mostrecentgameinfo.zztz()
        });
    }

    static boolean zza(MostRecentGameInfo mostrecentgameinfo, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof MostRecentGameInfo) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (mostrecentgameinfo == obj) goto _L4; else goto _L3
_L3:
        obj = (MostRecentGameInfo)obj;
        if (!zzt.equal(((MostRecentGameInfo) (obj)).zztu(), mostrecentgameinfo.zztu()) || !zzt.equal(((MostRecentGameInfo) (obj)).zztv(), mostrecentgameinfo.zztv()) || !zzt.equal(Long.valueOf(((MostRecentGameInfo) (obj)).zztw()), Long.valueOf(mostrecentgameinfo.zztw())) || !zzt.equal(((MostRecentGameInfo) (obj)).zztx(), mostrecentgameinfo.zztx()) || !zzt.equal(((MostRecentGameInfo) (obj)).zzty(), mostrecentgameinfo.zzty()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(((MostRecentGameInfo) (obj)).zztz(), mostrecentgameinfo.zztz())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(MostRecentGameInfo mostrecentgameinfo)
    {
        return zzt.zzt(mostrecentgameinfo).zzg("GameId", mostrecentgameinfo.zztu()).zzg("GameName", mostrecentgameinfo.zztv()).zzg("ActivityTimestampMillis", Long.valueOf(mostrecentgameinfo.zztw())).zzg("GameIconUri", mostrecentgameinfo.zztx()).zzg("GameHiResUri", mostrecentgameinfo.zzty()).zzg("GameFeaturedUri", mostrecentgameinfo.zztz()).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Object freeze()
    {
        return zztA();
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zza(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        MostRecentGameInfoEntityCreator.zza(this, parcel, i);
    }

    public MostRecentGameInfo zztA()
    {
        return this;
    }

    public String zztu()
    {
        return zzasP;
    }

    public String zztv()
    {
        return zzasQ;
    }

    public long zztw()
    {
        return zzasR;
    }

    public Uri zztx()
    {
        return zzasS;
    }

    public Uri zzty()
    {
        return zzasT;
    }

    public Uri zztz()
    {
        return zzasU;
    }

}
