// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            Credential

public static class zzwj
{

    private String mName;
    private String zzRa;
    private String zzRb;
    private Uri zzRc;
    private List zzRd;
    private String zzRe;
    private String zzRf;
    private String zzRg;
    private String zzRh;
    private final String zzwj;

    public Credential build()
    {
        if (!TextUtils.isEmpty(zzRe) && !TextUtils.isEmpty(zzRf))
        {
            throw new IllegalStateException("Only one of password or accountType may be set");
        } else
        {
            return new Credential(2, zzRa, zzRb, zzwj, mName, zzRc, zzRd, zzRe, zzRf, zzRg, zzRh);
        }
    }

    public zzRh setAccountType(String s)
    {
        String s1 = Uri.parse(s).getScheme();
        boolean flag;
        if ("http".equalsIgnoreCase(s1) || "https".equalsIgnoreCase(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzZ(flag);
        zzRf = s;
        return this;
    }

    public zzRf setName(String s)
    {
        mName = s;
        return this;
    }

    public mName setPassword(String s)
    {
        zzRe = s;
        return this;
    }

    public zzRe setProfilePictureUri(Uri uri)
    {
        zzRc = uri;
        return this;
    }

    public (Credential credential)
    {
        zzwj = Credential.zza(credential);
        mName = Credential.zzb(credential);
        zzRc = Credential.zzc(credential);
        zzRd = Credential.zzd(credential);
        zzRe = Credential.zze(credential);
        zzRf = Credential.zzf(credential);
        zzRg = Credential.zzg(credential);
        zzRa = Credential.zzh(credential);
        zzRb = Credential.zzi(credential);
        zzRh = Credential.zzj(credential);
    }

    public zzRh(String s)
    {
        zzwj = s;
    }
}
