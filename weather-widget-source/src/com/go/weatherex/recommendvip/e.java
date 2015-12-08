// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.recommendvip;


// Referenced classes of package com.go.weatherex.recommendvip:
//            RecommendVipActivity

class e
    implements Runnable
{

    final String a;
    final String b;
    final RecommendVipActivity c;

    e(RecommendVipActivity recommendvipactivity, String s, String s1)
    {
        c = recommendvipactivity;
        a = s;
        b = s1;
        super();
    }

    public void run()
    {
        RecommendVipActivity.b(c, a, b);
    }
}
