// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.os.Parcelable;
import android.text.TextUtils;
import dug;
import java.util.Map;

// Referenced classes of package com.ubercab.client.feature.signup:
//            ThirdPartyToken, Shape_SignupData

public abstract class SignupData
    implements Parcelable
{

    public SignupData()
    {
    }

    public static SignupData a(Map map)
    {
        Object obj = null;
        if (map == null)
        {
            return n();
        }
        ThirdPartyToken thirdpartytoken = ThirdPartyToken.a((String)map.get("thirdPartyType"), (String)map.get("thirdPartyToken"), dug.a((String)map.get("expireIn"), 60000L), null, (String)map.get("thirdPartyCode"));
        SignupData signupdata = n().e((String)map.get("firstName")).f((String)map.get("lastName")).a((String)map.get("email")).j((String)map.get("thirdPartyId")).k((String)map.get("mobile")).b((String)map.get("mobile")).c((String)map.get("mobileCountryIso2"));
        map = obj;
        if (thirdpartytoken.f())
        {
            map = thirdpartytoken;
        }
        return signupdata.a(((ThirdPartyToken) (map)));
    }

    public static SignupData n()
    {
        return new Shape_SignupData();
    }

    public abstract SignupData a(PromoCode promocode);

    public abstract SignupData a(ThirdPartyToken thirdpartytoken);

    public abstract SignupData a(String s);

    public abstract String a();

    public abstract SignupData b(String s);

    public abstract String b();

    public abstract SignupData c(String s);

    public abstract String c();

    public abstract SignupData d(String s);

    public abstract String d();

    public abstract SignupData e(String s);

    public abstract String e();

    public abstract SignupData f(String s);

    public abstract String f();

    public abstract SignupData g(String s);

    public abstract String g();

    public abstract PromoCode h();

    public abstract SignupData h(String s);

    public abstract SignupData i(String s);

    public abstract String i();

    public abstract SignupData j(String s);

    public abstract String j();

    public abstract SignupData k(String s);

    public abstract String k();

    public abstract String l();

    public abstract ThirdPartyToken m();

    public final boolean o()
    {
        return !TextUtils.isEmpty(e()) && !TextUtils.isEmpty(f()) && !TextUtils.isEmpty(b()) && !TextUtils.isEmpty(c());
    }

    public final String p()
    {
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
        if (e() != null)
        {
            s = "1";
        } else
        {
            s = "0";
        }
        if (f() != null)
        {
            s1 = "1";
        } else
        {
            s1 = "0";
        }
        if (a() != null)
        {
            s2 = "1";
        } else
        {
            s2 = "0";
        }
        if (d() != null)
        {
            s3 = "1";
        } else
        {
            s3 = "0";
        }
        if (b() != null)
        {
            s4 = "1";
        } else
        {
            s4 = "0";
        }
        return (new StringBuilder()).append(s).append(":").append(s1).append(":").append(s2).append(":").append(s3).append(":").append(s4).toString();
    }
}
