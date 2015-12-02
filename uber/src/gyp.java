// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public abstract class gyp
{

    public gyp()
    {
    }

    public static gyp a(String s, String s1)
    {
        return (new gyz()).a(s).b("paypal").c(s1);
    }

    abstract gyp a(String s);

    public abstract String a();

    abstract gyp b(String s);

    public abstract String b();

    abstract gyp c(String s);

    public abstract String c();

    public final Map d()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("token_type", b());
        hashmap.put("token_data", a());
        hashmap.put("paypal_correlation_id", c());
        return hashmap;
    }
}
