// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            Credential

public static class zzKI
{

    private String mName;
    private final String zzKI;
    private String zzOS;
    private String zzOT;
    private Uri zzOU;
    private List zzOV;
    private String zzOW;
    private String zzOX;

    public Credential build()
    {
        if (!TextUtils.isEmpty(zzOW) && !TextUtils.isEmpty(zzOX))
        {
            throw new IllegalStateException("Only one of password or accountType may be set");
        } else
        {
            return new Credential(1, zzOS, zzOT, zzKI, mName, zzOU, zzOV, zzOW, zzOX);
        }
    }

    public zzOX setAccountType(String s)
    {
        zzOX = s;
        return this;
    }

    public zzOX setName(String s)
    {
        mName = s;
        return this;
    }

    public mName setPassword(String s)
    {
        zzOW = s;
        return this;
    }

    public zzOW setProfilePictureUri(Uri uri)
    {
        zzOU = uri;
        return this;
    }

    public (Credential credential)
    {
        zzKI = Credential.zza(credential);
        mName = Credential.zzb(credential);
        zzOU = Credential.zzc(credential);
        zzOV = Credential.zzd(credential);
        zzOW = Credential.zze(credential);
        zzOX = Credential.zzf(credential);
        zzOS = Credential.zzg(credential);
        zzOT = Credential.zzh(credential);
    }

    public zzOT(String s)
    {
        zzKI = s;
    }
}
