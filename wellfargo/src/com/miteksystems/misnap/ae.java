// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;


// Referenced classes of package com.miteksystems.misnap:
//            t, MitekAnalyzer

final class ae
    implements Runnable
{

    final t a;

    ae(t t1)
    {
        a = t1;
        super();
    }

    public final void run()
    {
        if (t.e(a) != null)
        {
            t.e(a).i = false;
        }
    }
}
