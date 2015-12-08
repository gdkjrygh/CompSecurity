// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;


// Referenced classes of package com.gau.go.a:
//            w, e, f

class v
{

    final e a;

    private v(e e)
    {
        a = e;
        super();
    }

    v(e e, f f)
    {
        this(e);
    }

    public void a()
    {
        w w1 = new w(this, "gostatiscs_post_thread");
        w1.setPriority(1);
        w1.start();
    }
}
