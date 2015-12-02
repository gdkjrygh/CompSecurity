// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            a1x, a_b, MediaData, asg, 
//            ab6

class d5
    implements a1x
{

    final asg a;
    Runnable b;
    final c4 c;
    final MediaData d;

    d5(asg asg1, c4 c4, MediaData mediadata)
    {
        a = asg1;
        c = c4;
        d = mediadata;
        super();
        b = new a_b(this);
    }

    public boolean a(int i)
    {
        d.progress = i;
        ab6.c(a.a).post(b);
        return false;
    }
}
