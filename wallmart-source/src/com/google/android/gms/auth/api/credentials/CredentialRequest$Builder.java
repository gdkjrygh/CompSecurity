// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;


// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            CredentialRequest, CredentialPickerConfig

public static final class 
{

    private boolean zzRj;
    private String zzRk[];
    private CredentialPickerConfig zzRl;
    private CredentialPickerConfig zzRm;

    static boolean zza( )
    {
        return .zzRj;
    }

    static String[] zzb(zzRj zzrj)
    {
        return zzrj.zzRk;
    }

    static CredentialPickerConfig zzc(zzRk zzrk)
    {
        return zzrk.zzRl;
    }

    static CredentialPickerConfig zzd(zzRl zzrl)
    {
        return zzrl.zzRm;
    }

    public CredentialRequest build()
    {
        if (zzRk == null)
        {
            zzRk = new String[0];
        }
        if (!zzRj && zzRk.length == 0)
        {
            throw new IllegalStateException("At least one authentication method must be specified");
        } else
        {
            return new CredentialRequest(this, null);
        }
    }

    public transient zzRk setAccountTypes(String as[])
    {
        zzRk = as;
        return this;
    }

    public zzRk setCredentialHintPickerConfig(CredentialPickerConfig credentialpickerconfig)
    {
        zzRm = credentialpickerconfig;
        return this;
    }

    public zzRm setCredentialPickerConfig(CredentialPickerConfig credentialpickerconfig)
    {
        zzRl = credentialpickerconfig;
        return this;
    }

    public zzRl setSupportsPasswordLogin(boolean flag)
    {
        zzRj = flag;
        return this;
    }

    public ()
    {
    }
}
