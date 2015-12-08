// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.url;


// Referenced classes of package com.jiubang.commerce.ad.url:
//            AdUrlPreParseLoadingActivity

class f
    implements Runnable
{

    final AdUrlPreParseLoadingActivity a;

    f(AdUrlPreParseLoadingActivity adurlpreparseloadingactivity)
    {
        a = adurlpreparseloadingactivity;
        super();
    }

    public void run()
    {
        if (AdUrlPreParseLoadingActivity.a(a) == null || a.isFinishing())
        {
            a.finish();
            return;
        } else
        {
            AdUrlPreParseLoadingActivity.b(a);
            a.finish();
            return;
        }
    }
}
