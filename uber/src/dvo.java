// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class dvo
{

    private static String a(String s)
    {
        return (new StringBuilder("\"")).append(s).append('"').toString();
    }

    public static String a(String s, String s1, String s2, String s3)
    {
        s1 = (new gkh()).a("apiname", "com.alipay.account.auth").a("app_id", s).a("app_name", "mc").a("auth_type", "AUTHACCOUNT").a("biz_type", "openservice").a("pid", s1).a("product_id", "WAP_FAST_LOGIN").a("scope", "kuaijie").a("target_id", s2).a("sign_date", s3).a();
        s = new android.net.Uri.Builder();
        for (s1 = s1.entrySet().iterator(); s1.hasNext(); s.appendQueryParameter((String)s2.getKey(), a((String)s2.getValue())))
        {
            s2 = (java.util.Map.Entry)s1.next();
        }

        return s.build().getQuery();
    }
}
