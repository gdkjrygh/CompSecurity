// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.c;


// Referenced classes of package com.wf.wellsfargomobile.hcewallet.c:
//            h, j

class i
    implements Runnable
{

    final h a;

    i(h h1)
    {
        a = h1;
        super();
    }

    public void run()
    {
        h.a(a).a(true);
        a.dismiss();
    }
}
