// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;


// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            CredentialPickerConfig

public static class mShowCancelButton
{

    private boolean mShowCancelButton;
    private boolean zzRi;

    static boolean zza(mShowCancelButton mshowcancelbutton)
    {
        return mshowcancelbutton.zzRi;
    }

    static boolean zzb(zzRi zzri)
    {
        return zzri.mShowCancelButton;
    }

    public CredentialPickerConfig build()
    {
        return new CredentialPickerConfig(this, null);
    }

    public mShowCancelButton setShowAddAccountButton(boolean flag)
    {
        zzRi = flag;
        return this;
    }

    public zzRi setShowCancelButton(boolean flag)
    {
        mShowCancelButton = flag;
        return this;
    }

    public ()
    {
        zzRi = false;
        mShowCancelButton = true;
    }
}
