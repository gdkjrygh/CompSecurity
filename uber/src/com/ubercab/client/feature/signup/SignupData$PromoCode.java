// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.os.Parcelable;
import com.ubercab.rider.realtime.response.PromotionInviter;
import com.ubercab.rider.realtime.response.UserPromotion;
import java.util.Map;

// Referenced classes of package com.ubercab.client.feature.signup:
//            Shape_SignupData_PromoCode

public abstract class oCode
    implements Parcelable
{

    public static oCode a(String s, UserPromotion userpromotion)
    {
        oCode ocode = e();
        ocode.a(s);
        s = userpromotion.getInviter();
        if (s != null)
        {
            ocode.c(s.getFirstName());
            ocode.d(s.getPictureUrl());
        }
        ocode.b(userpromotion.getPromotionValueString());
        return ocode;
    }

    public static omotionValueString a(String s, Map map)
    {
        omotionValueString omotionvaluestring = e();
        omotionvaluestring.a(s);
        if (map != null)
        {
            omotionvaluestring.b((String)map.get("promotion_value_string"));
            s = (Map)map.get("inviter");
            if (s != null)
            {
                omotionvaluestring.c((String)s.get("first_name"));
                omotionvaluestring.d((String)s.get("picture_url"));
            }
        }
        return omotionvaluestring;
    }

    static d a(Map map)
    {
        if (map == null || map.isEmpty())
        {
            return null;
        } else
        {
            return a((String)map.get("promotion_code"), map);
        }
    }

    private static a e()
    {
        return new Shape_SignupData_PromoCode();
    }

    public abstract oCode a(String s);

    public abstract String a();

    public abstract oCode b(String s);

    public abstract String b();

    public abstract oCode c(String s);

    public abstract String c();

    public abstract oCode d(String s);

    public abstract String d();

    public oCode()
    {
    }
}
