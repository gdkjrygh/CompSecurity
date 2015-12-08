// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;


// Referenced classes of package com.wf.wellsfargomobile:
//            BaseWebViewActivity

class b
    implements Runnable
{

    final BaseWebViewActivity a;

    b(BaseWebViewActivity basewebviewactivity)
    {
        a = basewebviewactivity;
        super();
    }

    public void run()
    {
        BaseWebViewActivity.a(a);
    }
}
