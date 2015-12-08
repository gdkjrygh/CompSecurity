// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            s

public class TokenRequest
    implements SafeParcelable
{

    public static final s CREATOR = new s();
    String accountName;
    AppDescription callingAppDescription;
    CaptchaSolution lU;
    Bundle mI;
    volatile boolean mN;
    String mZ;
    volatile boolean mm;
    volatile FACLConfig na;
    volatile PACLConfig nb;
    String nc;
    final int version;

    public TokenRequest()
    {
        mI = new Bundle();
        nc = Consent.UNKNOWN.toString();
        version = 1;
    }

    TokenRequest(int i, String s1, String s2, Bundle bundle, FACLConfig faclconfig, PACLConfig paclconfig, boolean flag, 
            boolean flag1, String s3, AppDescription appdescription, CaptchaSolution captchasolution)
    {
        mI = new Bundle();
        nc = Consent.UNKNOWN.toString();
        version = i;
        mZ = s1;
        accountName = s2;
        mI = bundle;
        na = faclconfig;
        nb = paclconfig;
        mN = flag;
        mm = flag1;
        nc = s3;
        callingAppDescription = appdescription;
        lU = captchasolution;
    }

    public TokenRequest(String s1, String s2)
    {
        mI = new Bundle();
        nc = Consent.UNKNOWN.toString();
        version = 1;
        accountName = s1;
        mZ = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountName()
    {
        return accountName;
    }

    public AppDescription getCallingAppDescription()
    {
        return callingAppDescription;
    }

    public CaptchaSolution getCaptchaSolution()
    {
        return lU;
    }

    public Consent getConsent()
    {
        return Consent.valueOf(nc);
    }

    public FACLConfig getFaclData()
    {
        return na;
    }

    public Bundle getOptions()
    {
        return new Bundle(mI);
    }

    public PACLConfig getPaclData()
    {
        return nb;
    }

    public String getService()
    {
        return mZ;
    }

    public boolean isAddingAccount()
    {
        return mN;
    }

    public boolean isCreatingAccount()
    {
        return mm;
    }

    public TokenRequest setAccountName(String s1)
    {
        accountName = s1;
        return this;
    }

    public TokenRequest setAddingAccount(boolean flag)
    {
        mN = flag;
        return this;
    }

    public TokenRequest setCallingAppDescription(AppDescription appdescription)
    {
        callingAppDescription = appdescription;
        return this;
    }

    public TokenRequest setCaptchaSolution(CaptchaSolution captchasolution)
    {
        lU = captchasolution;
        return this;
    }

    public TokenRequest setConsent(Consent consent)
    {
        nc = ((Consent)gi.a(consent, " Consent cannot be null")).toString();
        return this;
    }

    public TokenRequest setCreatingAccount(boolean flag)
    {
        mm = flag;
        return this;
    }

    public TokenRequest setFaclData(FACLConfig faclconfig)
    {
        na = faclconfig;
        return this;
    }

    public TokenRequest setOptions(Bundle bundle)
    {
        mI.clear();
        if (bundle != null)
        {
            mI.putAll(bundle);
        }
        return this;
    }

    public TokenRequest setPaclData(PACLConfig paclconfig)
    {
        nb = paclconfig;
        return this;
    }

    public TokenRequest setService(String s1)
    {
        mZ = s1;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        s.a(this, parcel, i);
    }


    private class Consent extends Enum
    {

        public static final Consent GRANTED;
        public static final Consent REJECTED;
        public static final Consent UNKNOWN;
        private static final Consent nd[];

        public static Consent valueOf(String s1)
        {
            return (Consent)Enum.valueOf(com/google/android/gms/auth/firstparty/dataservice/TokenRequest$Consent, s1);
        }

        public static Consent[] values()
        {
            return (Consent[])nd.clone();
        }

        static 
        {
            UNKNOWN = new Consent("UNKNOWN", 0);
            GRANTED = new Consent("GRANTED", 1);
            REJECTED = new Consent("REJECTED", 2);
            nd = (new Consent[] {
                UNKNOWN, GRANTED, REJECTED
            });
        }

        private Consent(String s1, int i)
        {
            super(s1, i);
        }
    }

}
