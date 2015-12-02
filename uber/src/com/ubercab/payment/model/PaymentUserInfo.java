// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.model;

import android.os.Parcelable;
import bmp;
import bmr;
import bms;

// Referenced classes of package com.ubercab.payment.model:
//            Shape_PaymentUserInfo

public abstract class PaymentUserInfo
    implements Parcelable
{

    public PaymentUserInfo()
    {
    }

    public static PaymentUserInfo create()
    {
        return new Shape_PaymentUserInfo();
    }

    public abstract String getEmail();

    public abstract String getFirstName();

    public abstract String getLastName();

    public abstract String getMobile();

    public abstract String getMobileCountryIso2();

    public String getMobileWithCountryCode()
    {
        Object obj;
        try
        {
            obj = bmr.a();
            obj = ((bmr) (obj)).a(((bmr) (obj)).a(getMobile(), getMobileCountryIso2()), bms.b);
        }
        catch (bmp bmp1)
        {
            return null;
        }
        return ((String) (obj));
    }

    public abstract PaymentUserInfo setEmail(String s);

    public abstract PaymentUserInfo setFirstName(String s);

    public abstract PaymentUserInfo setLastName(String s);

    public abstract PaymentUserInfo setMobile(String s);

    public abstract PaymentUserInfo setMobileCountryIso2(String s);
}
