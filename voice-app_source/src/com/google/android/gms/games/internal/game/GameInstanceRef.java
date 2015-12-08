// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.internal.constants.PlatformType;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameInstance

public final class GameInstanceRef extends zzc
    implements GameInstance
{

    GameInstanceRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public String getApplicationId()
    {
        return getString("external_game_id");
    }

    public String getDisplayName()
    {
        return getString("instance_display_name");
    }

    public String getPackageName()
    {
        return getString("package_name");
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("ApplicationId", getApplicationId()).zzg("DisplayName", getDisplayName()).zzg("SupportsRealTime", Boolean.valueOf(zztj())).zzg("SupportsTurnBased", Boolean.valueOf(zztk())).zzg("PlatformType", PlatformType.zzfG(zzqE())).zzg("PackageName", getPackageName()).zzg("PiracyCheckEnabled", Boolean.valueOf(zztl())).zzg("Installed", Boolean.valueOf(zztm())).toString();
    }

    public int zzqE()
    {
        return getInteger("platform_type");
    }

    public boolean zztj()
    {
        return getInteger("real_time_support") > 0;
    }

    public boolean zztk()
    {
        return getInteger("turn_based_support") > 0;
    }

    public boolean zztl()
    {
        return getInteger("piracy_check") > 0;
    }

    public boolean zztm()
    {
        return getInteger("installed") > 0;
    }
}
