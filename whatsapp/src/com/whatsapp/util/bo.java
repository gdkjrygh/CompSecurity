// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;


// Referenced classes of package com.whatsapp.util:
//            ak

class bo
    implements Runnable
{

    final ak a;

    bo(ak ak1)
    {
        a = ak1;
        super();
    }

    public void run()
    {
        a.a();
    }
}
