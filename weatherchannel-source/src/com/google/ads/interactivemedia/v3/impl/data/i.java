// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.interactivemedia.v3.impl.data;


// Referenced classes of package com.google.ads.interactivemedia.v3.impl.data:
//            f

public abstract class i
{

    private String companionId;

    public i()
    {
    }

    private static i create(String s, String s1, String s2, a a1)
    {
        return new f(s, s1, s2, a1);
    }

    public static i create(String s, String s1, String s2, String s3, a a1)
    {
        s1 = create(s1, s2, s3, a1);
        s1.companionId = s;
        return s1;
    }

    public abstract String clickThroughUrl();

    public String companionId()
    {
        return companionId;
    }

    public abstract String size();

    public abstract String src();

    public String toString()
    {
        String s = companionId();
        String s1 = size();
        String s2 = src();
        String s3 = clickThroughUrl();
        String s4 = String.valueOf(type());
        return (new StringBuilder(String.valueOf(s).length() + 66 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append("CompanionData [companionId=").append(s).append(", size=").append(s1).append(", src=").append(s2).append(", clickThroughUrl=").append(s3).append(", type=").append(s4).append("]").toString();
    }

    public abstract a type();

    // Unreferenced inner class com/google/ads/interactivemedia/v3/impl/data/i$a
    /* block-local class not found */
    class a {}

}
