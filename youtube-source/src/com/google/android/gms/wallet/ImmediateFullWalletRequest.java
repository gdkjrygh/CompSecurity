// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            l, c, CountrySpecification

public final class ImmediateFullWalletRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new l();
    int OA;
    boolean OB;
    boolean OC;
    boolean OD;
    boolean OE;
    CountrySpecification OF[];
    String Oz;
    Account account;
    int environment;
    String hy;
    private final int jE;

    ImmediateFullWalletRequest()
    {
        jE = 2;
    }

    ImmediateFullWalletRequest(int i, int j, Account account1, String s, int k, boolean flag, boolean flag1, 
            boolean flag2, String s1, boolean flag3, CountrySpecification acountryspecification[])
    {
        jE = i;
        environment = j;
        account = account1;
        Oz = s;
        OA = k;
        OB = flag;
        OC = flag1;
        OD = flag2;
        hy = s1;
        OE = flag3;
        OF = acountryspecification;
    }

    public static c newBuilder()
    {
        ImmediateFullWalletRequest immediatefullwalletrequest = new ImmediateFullWalletRequest();
        immediatefullwalletrequest.getClass();
        return new c(immediatefullwalletrequest, (byte)0);
    }

    public static c newBuilderFrom(ImmediateFullWalletRequest immediatefullwalletrequest)
    {
        c c1 = newBuilder();
        Object obj = immediatefullwalletrequest.getAccount();
        c1.a.account = ((Account) (obj));
        int i = immediatefullwalletrequest.getEnvironment();
        c1.a.environment = i;
        obj = immediatefullwalletrequest.getMerchantDomain();
        c1.a.Oz = ((String) (obj));
        boolean flag = immediatefullwalletrequest.isPhoneNumberRequired();
        c1.a.OB = flag;
        obj = immediatefullwalletrequest.getSessionId();
        c1.a.hy = ((String) (obj));
        flag = immediatefullwalletrequest.isShippingAddressRequired();
        c1.a.OC = flag;
        flag = immediatefullwalletrequest.shouldAllowSaveToChromeOption();
        c1.a.OE = flag;
        flag = immediatefullwalletrequest.useMinimalBillingAddress();
        c1.a.OD = flag;
        immediatefullwalletrequest = immediatefullwalletrequest.getAllowedShippingCountrySpecifications();
        c1.a.OF = immediatefullwalletrequest;
        return c1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Account getAccount()
    {
        return account;
    }

    public final CountrySpecification[] getAllowedShippingCountrySpecifications()
    {
        return OF;
    }

    public final int getEnvironment()
    {
        return environment;
    }

    public final String getMerchantDomain()
    {
        return Oz;
    }

    public final String getSessionId()
    {
        return hy;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final boolean isPhoneNumberRequired()
    {
        return OB;
    }

    public final boolean isShippingAddressRequired()
    {
        return OC;
    }

    public final boolean shouldAllowSaveToChromeOption()
    {
        return OE;
    }

    public final boolean useMinimalBillingAddress()
    {
        return OD;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        l.a(this, parcel, i);
    }

}
