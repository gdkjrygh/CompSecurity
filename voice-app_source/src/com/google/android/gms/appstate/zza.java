// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.appstate:
//            AppState

public final class zza
    implements AppState
{

    private final int zzOf;
    private final String zzOg;
    private final byte zzOh[];
    private final boolean zzOi;
    private final String zzOj;
    private final byte zzOk[];

    public zza(AppState appstate)
    {
        zzOf = appstate.getKey();
        zzOg = appstate.getLocalVersion();
        zzOh = appstate.getLocalData();
        zzOi = appstate.hasConflict();
        zzOj = appstate.getConflictVersion();
        zzOk = appstate.getConflictData();
    }

    static int zza(AppState appstate)
    {
        return zzt.hashCode(new Object[] {
            Integer.valueOf(appstate.getKey()), appstate.getLocalVersion(), appstate.getLocalData(), Boolean.valueOf(appstate.hasConflict()), appstate.getConflictVersion(), appstate.getConflictData()
        });
    }

    static boolean zza(AppState appstate, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof AppState) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (appstate == obj) goto _L4; else goto _L3
_L3:
        obj = (AppState)obj;
        if (!zzt.equal(Integer.valueOf(((AppState) (obj)).getKey()), Integer.valueOf(appstate.getKey())) || !zzt.equal(((AppState) (obj)).getLocalVersion(), appstate.getLocalVersion()) || !zzt.equal(((AppState) (obj)).getLocalData(), appstate.getLocalData()) || !zzt.equal(Boolean.valueOf(((AppState) (obj)).hasConflict()), Boolean.valueOf(appstate.hasConflict())) || !zzt.equal(((AppState) (obj)).getConflictVersion(), appstate.getConflictVersion()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(((AppState) (obj)).getConflictData(), appstate.getConflictData())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(AppState appstate)
    {
        return zzt.zzt(appstate).zzg("Key", Integer.valueOf(appstate.getKey())).zzg("LocalVersion", appstate.getLocalVersion()).zzg("LocalData", appstate.getLocalData()).zzg("HasConflict", Boolean.valueOf(appstate.hasConflict())).zzg("ConflictVersion", appstate.getConflictVersion()).zzg("ConflictData", appstate.getConflictData()).toString();
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Object freeze()
    {
        return zzkT();
    }

    public byte[] getConflictData()
    {
        return zzOk;
    }

    public String getConflictVersion()
    {
        return zzOj;
    }

    public int getKey()
    {
        return zzOf;
    }

    public byte[] getLocalData()
    {
        return zzOh;
    }

    public String getLocalVersion()
    {
        return zzOg;
    }

    public boolean hasConflict()
    {
        return zzOi;
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

    public AppState zzkT()
    {
        return this;
    }
}
