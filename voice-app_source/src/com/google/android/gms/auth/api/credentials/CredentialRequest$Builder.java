// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;


// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            CredentialRequest

public static final class 
{

    boolean zzOY;
    String zzOZ[];

    public CredentialRequest build()
    {
        if (zzOZ == null)
        {
            zzOZ = new String[0];
        }
        if (!zzOY && zzOZ.length == 0)
        {
            throw new IllegalStateException("At least one authentication method must be specified");
        } else
        {
            return new CredentialRequest(this, null);
        }
    }

    public transient zzOZ setAccountTypes(String as[])
    {
        zzOZ = as;
        return this;
    }

    public zzOZ setSupportsPasswordLogin(boolean flag)
    {
        zzOY = flag;
        return this;
    }

    public ()
    {
    }
}
