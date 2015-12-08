// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            i

public class AccountSignInRequest
    implements SafeParcelable
{

    public static final i CREATOR = new i();
    AppDescription callingAppDescription;
    CaptchaSolution lU;
    boolean mm;
    boolean mn;
    AccountCredentials mo;
    final int version;

    public AccountSignInRequest()
    {
        version = 1;
    }

    AccountSignInRequest(int j, AppDescription appdescription, boolean flag, boolean flag1, CaptchaSolution captchasolution, AccountCredentials accountcredentials)
    {
        version = j;
        callingAppDescription = appdescription;
        mm = flag;
        mn = flag1;
        lU = captchasolution;
        mo = accountcredentials;
    }

    public int describeContents()
    {
        return 0;
    }

    public AccountCredentials getAccountCredentials()
    {
        return mo;
    }

    public AppDescription getCallingAppDescription()
    {
        return callingAppDescription;
    }

    public CaptchaSolution getCaptchaSolution()
    {
        return lU;
    }

    public boolean isAccountCreationInProgress()
    {
        return mm;
    }

    public boolean isSetupWizardInProgress()
    {
        return mn;
    }

    public AccountSignInRequest setAccountCreationInProgress(boolean flag)
    {
        mm = flag;
        return this;
    }

    public AccountSignInRequest setAccountCredentials(AccountCredentials accountcredentials)
    {
        mo = accountcredentials;
        return this;
    }

    public AccountSignInRequest setBackupAccount(boolean flag)
    {
        mn = flag;
        return this;
    }

    public AccountSignInRequest setCallingAppDescription(AppDescription appdescription)
    {
        callingAppDescription = appdescription;
        return this;
    }

    public AccountSignInRequest setCaptchaSolution(CaptchaSolution captchasolution)
    {
        lU = captchasolution;
        return this;
    }

    public AccountSignInRequest setSetupWizardInProgress(boolean flag)
    {
        mn = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
