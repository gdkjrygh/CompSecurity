// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.UserMetadata;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            zzj

public class zzp extends zzj
{

    public zzp(String s, int i)
    {
        super(s, zzcz(s), Collections.emptyList(), i);
    }

    private String zzcy(String s)
    {
        return zzw(getName(), s);
    }

    private static Collection zzcz(String s)
    {
        return Arrays.asList(new String[] {
            zzw(s, "permissionId"), zzw(s, "displayName"), zzw(s, "picture"), zzw(s, "isAuthenticatedUser"), zzw(s, "emailAddress")
        });
    }

    private static String zzw(String s, String s1)
    {
        return (new StringBuilder()).append(s).append(".").append(s1).toString();
    }

    protected boolean zzb(DataHolder dataholder, int i, int j)
    {
        return dataholder.zzbV(zzcy("permissionId")) && !dataholder.zzi(zzcy("permissionId"), i, j);
    }

    protected Object zzc(DataHolder dataholder, int i, int j)
    {
        return zzj(dataholder, i, j);
    }

    protected UserMetadata zzj(DataHolder dataholder, int i, int j)
    {
        String s = dataholder.zzd(zzcy("permissionId"), i, j);
        if (s != null)
        {
            String s1 = dataholder.zzd(zzcy("displayName"), i, j);
            String s2 = dataholder.zzd(zzcy("picture"), i, j);
            boolean flag = dataholder.zze(zzcy("isAuthenticatedUser"), i, j);
            dataholder = dataholder.zzd(zzcy("emailAddress"), i, j);
            return new UserMetadata(s, s1, s2, Boolean.valueOf(flag).booleanValue(), dataholder);
        } else
        {
            return null;
        }
    }
}
