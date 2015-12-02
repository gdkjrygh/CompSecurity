// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.ui.FloatingLabelElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fmh
{

    final List a = new ArrayList();
    private final dkn b;

    public fmh(dkn dkn1)
    {
        b = dkn1;
    }

    public final void a()
    {
        a.clear();
    }

    public final void a(FloatingLabelElement floatinglabelelement)
    {
        fmi fmi1 = new fmi();
        a.add(fmi1);
        floatinglabelelement.a(fmi1);
    }

    public final void a(String s)
    {
        Iterator iterator = a.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (fmi.a((fmi)iterator.next())) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L6:
        if (!a.isEmpty() && flag)
        {
            b.d(s);
        }
        a.clear();
        return;
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
