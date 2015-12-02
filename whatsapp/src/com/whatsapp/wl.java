// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            wu, App

final class wl
    implements wu
{

    final String a[];

    wl(String as[])
    {
        a = as;
        super();
    }

    public boolean a(String s)
    {
        int j = App.am;
        if (s != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        String as[] = a;
        int k = as.length;
        int i = 0;
        do
        {
            if (i >= k)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (s.startsWith(as[i]))
            {
                return true;
            }
            i++;
        } while (j == 0);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }
}
