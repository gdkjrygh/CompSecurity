// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package org.a.a.a.a:
//            b

public class a
{

    public static final b a = org.a.a.a.a.b.a("yyyy-MM-dd'T'HH:mm:ss");
    public static final b b = org.a.a.a.a.b.a("yyyy-MM-dd'T'HH:mm:ssZZ");
    public static final b c = org.a.a.a.a.b.a("yyyy-MM-dd");
    public static final b d = org.a.a.a.a.b.a("yyyy-MM-ddZZ");
    public static final b e = org.a.a.a.a.b.a("'T'HH:mm:ss");
    public static final b f = org.a.a.a.a.b.a("'T'HH:mm:ssZZ");
    public static final b g = org.a.a.a.a.b.a("HH:mm:ss");
    public static final b h = org.a.a.a.a.b.a("HH:mm:ssZZ");
    public static final b i;
    private static final TimeZone j = TimeZone.getTimeZone("GMT");

    static 
    {
        i = org.a.a.a.a.b.a("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US);
    }
}
