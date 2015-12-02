// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            p5, qa, App, an

class pp extends p5
{

    final an s;

    pp(an an, c4 c4_1, long l, boolean flag)
    {
        s = an;
        super(c4_1, l, flag);
    }

    public void a(qa qa1)
    {
        super.a(qa1);
        if (qa1 == qa.SUCCESS && a)
        {
            qa1 = new c4(k);
            qa1.r = true;
            App.p(qa1);
        }
    }

    public void onPostExecute(Object obj)
    {
        a((qa)obj);
    }
}
