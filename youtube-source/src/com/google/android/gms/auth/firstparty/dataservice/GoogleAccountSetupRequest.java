// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            n

public class GoogleAccountSetupRequest
    implements SafeParcelable
{

    public static final n CREATOR = new n();
    AppDescription callingAppDescription;
    CaptchaSolution lU;
    Bundle mI;
    boolean mJ;
    boolean mK;
    boolean mL;
    String mM;
    boolean mN;
    String mO;
    boolean mm;
    boolean mn;
    AccountCredentials mo;
    String mp;
    String mq;
    String phoneCountryCode;
    String phoneNumber;
    String secondaryEmail;
    final int version;

    public GoogleAccountSetupRequest()
    {
        version = 1;
        mI = new Bundle();
    }

    GoogleAccountSetupRequest(int i, Bundle bundle, boolean flag, boolean flag1, boolean flag2, String s, String s1, 
            String s2, String s3, boolean flag3, boolean flag4, boolean flag5, String s4, AppDescription appdescription, 
            AccountCredentials accountcredentials, CaptchaSolution captchasolution, String s5, String s6)
    {
        version = i;
        mI = bundle;
        mJ = flag;
        mK = flag1;
        mL = flag2;
        mp = s;
        mq = s1;
        secondaryEmail = s2;
        mM = s3;
        mm = flag3;
        mN = flag4;
        mn = flag5;
        mO = s4;
        callingAppDescription = appdescription;
        mo = accountcredentials;
        lU = captchasolution;
        phoneNumber = s5;
        phoneCountryCode = s6;
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

    public String getFirstName()
    {
        return mp;
    }

    public String getGender()
    {
        return mM;
    }

    public String getLastName()
    {
        return mq;
    }

    public Bundle getOptions()
    {
        return new Bundle(mI);
    }

    public String getPhoneCountryCode()
    {
        return phoneCountryCode;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getRopRevision()
    {
        return mO;
    }

    public String getSecondaryEmail()
    {
        return secondaryEmail;
    }

    public boolean isAddingAccount()
    {
        return mN;
    }

    public boolean isAgreedToMobileTos()
    {
        return mL;
    }

    public boolean isAgreedToPersonalizedContent()
    {
        return mK;
    }

    public boolean isAgreedToWebHistory()
    {
        return mJ;
    }

    public boolean isCreatingAccount()
    {
        return mm;
    }

    public boolean isSetupWizardInProgress()
    {
        return mn;
    }

    public GoogleAccountSetupRequest setAccountCredentials(AccountCredentials accountcredentials)
    {
        mo = accountcredentials;
        return this;
    }

    public GoogleAccountSetupRequest setAddingAccount(boolean flag)
    {
        mN = flag;
        return this;
    }

    public GoogleAccountSetupRequest setAgreedToMobileTos(boolean flag)
    {
        mL = flag;
        return this;
    }

    public GoogleAccountSetupRequest setAgreedToPersonalizedContent(boolean flag)
    {
        mK = flag;
        return this;
    }

    public GoogleAccountSetupRequest setAgreedToWebHistory(boolean flag)
    {
        mJ = flag;
        return this;
    }

    public GoogleAccountSetupRequest setCallingAppDescription(AppDescription appdescription)
    {
        callingAppDescription = appdescription;
        return this;
    }

    public GoogleAccountSetupRequest setCaptchaSolution(CaptchaSolution captchasolution)
    {
        lU = captchasolution;
        return this;
    }

    public GoogleAccountSetupRequest setCreatingAccount(boolean flag)
    {
        mm = flag;
        return this;
    }

    public GoogleAccountSetupRequest setFirstName(String s)
    {
        mp = s;
        return this;
    }

    public GoogleAccountSetupRequest setGender(String s)
    {
        mM = s;
        return this;
    }

    public GoogleAccountSetupRequest setLastName(String s)
    {
        mq = s;
        return this;
    }

    public GoogleAccountSetupRequest setOptions(Bundle bundle)
    {
        mI.clear();
        mI.putAll(bundle);
        return this;
    }

    public GoogleAccountSetupRequest setPhoneCountryCode(String s)
    {
        phoneCountryCode = s;
        return this;
    }

    public GoogleAccountSetupRequest setPhoneNumber(String s)
    {
        phoneNumber = s;
        return this;
    }

    public GoogleAccountSetupRequest setRopRevision(String s)
    {
        mO = s;
        return this;
    }

    public GoogleAccountSetupRequest setSecondaryEmail(String s)
    {
        secondaryEmail = s;
        return this;
    }

    public GoogleAccountSetupRequest setSetupWizardInProgress(boolean flag)
    {
        mn = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel, i);
    }

}
