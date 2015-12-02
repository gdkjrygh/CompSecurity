// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;

final class ang.Object
    implements Runnable
{

    final String a;
    final cia b;
    final dcv c;

    public final void run()
    {
        String s = (new StringBuilder()).append(a).append(": ").append(b.name().toLowerCase()).toString();
        Toast.makeText(dcv.a(c), s, 0).show();
        ijg.a(String.format("Analytics event: %s - %s", new Object[] {
            b.name(), a
        }), new Object[0]);
    }

    (dcv dcv1, String s, cia cia1)
    {
        c = dcv1;
        a = s;
        b = cia1;
        super();
    }
}
