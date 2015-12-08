// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            c, AccountRecoveryGuidance

public class AccountRecoveryData
    implements SafeParcelable
{

    public static final int ACTION_NONE = 3;
    public static final int ACTION_REQUEST_RECOVERY_INFO = 1;
    public static final int ACTION_VERIFY_RECOVERY_INFO = 2;
    public static final c CREATOR = new c();
    public static final int DETAIL_EMAIL_AND_PHONE = 1003;
    public static final int DETAIL_EMAIL_ONLY = 1001;
    public static final int DETAIL_PHONE_ONLY = 1002;
    public final String accountName;
    public final String action;
    public final String allowedRecoveryOption;
    public final List countries;
    public final String defaultCountryCode;
    public final String error;
    public final AccountRecoveryGuidance guidance;
    public final String phoneNumber;
    public final String secondaryEmail;
    public final int version;

    AccountRecoveryData(int i, AccountRecoveryGuidance accountrecoveryguidance, String s, String s1, String s2, String s3, String s4, 
            List list, String s5, String s6)
    {
        version = i;
        guidance = accountrecoveryguidance;
        action = s;
        allowedRecoveryOption = s1;
        accountName = s2;
        secondaryEmail = s3;
        phoneNumber = s4;
        if (list == null)
        {
            accountrecoveryguidance = Collections.EMPTY_LIST;
        } else
        {
            accountrecoveryguidance = Collections.unmodifiableList(list);
        }
        countries = accountrecoveryguidance;
        defaultCountryCode = s5;
        error = s6;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
