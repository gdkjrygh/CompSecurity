// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.alipay.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.client.core.vendor.alipay.model:
//            Shape_AlipayUserData

public abstract class AlipayUserData
    implements Parcelable
{

    public AlipayUserData()
    {
    }

    public static AlipayUserData create()
    {
        return new Shape_AlipayUserData();
    }

    public static AlipayUserData create(Long long1, SignupRequired signuprequired, String s, String s1)
    {
        return create().setExpireIn(long1).setSignupRequired(signuprequired).setThirdPartyType(s1).setThirdPartyToken(s);
    }

    public abstract Long getExpireIn();

    public Fields getFields()
    {
        return getSignupRequired().getFields();
    }

    public abstract SignupRequired getSignupRequired();

    public abstract String getThirdPartyToken();

    public abstract String getThirdPartyType();

    abstract AlipayUserData setExpireIn(Long long1);

    abstract AlipayUserData setSignupRequired(SignupRequired signuprequired);

    abstract AlipayUserData setThirdPartyToken(String s);

    abstract AlipayUserData setThirdPartyType(String s);

    private class SignupRequired
    {

        public static SignupRequired create()
        {
            return new Shape_AlipayUserData_SignupRequired();
        }

        public static SignupRequired create(Fields fields)
        {
            return create().setFields(fields);
        }

        public abstract Fields getFields();

        abstract SignupRequired setFields(Fields fields);

        public SignupRequired()
        {
        }
    }

}
