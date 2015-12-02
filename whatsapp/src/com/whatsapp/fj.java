// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.OpusRecorder;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            fm

class fj extends fm
{

    private OpusRecorder d;

    public fj(String s)
    {
        c = new File(s);
        b = 16000;
        d = new OpusRecorder(s);
    }

    public void a()
    {
        d.stop();
    }

    public void b()
    {
        d.close();
    }

    public void e()
    {
        d.start();
    }

    public void f()
    {
        d.prepare();
    }
}
