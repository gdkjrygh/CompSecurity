// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iiv
{

    static final iiw c[];
    static final iiv d;
    static final iiv e;
    final boolean a;
    final iiw b[];

    private iiv(boolean flag, iiw aiiw[])
    {
        a = flag;
        b = aiiw;
    }

    public final iiv a(iiw iiw1)
    {
        int i = b.length;
        iiw aiiw[] = new iiw[i + 1];
        System.arraycopy(b, 0, aiiw, 0, i);
        aiiw[i] = iiw1;
        return new iiv(a, aiiw);
    }

    public final iiv b(iiw iiw1)
    {
        iiw aiiw1[];
        int l;
        aiiw1 = b;
        l = aiiw1.length;
        if (l != 1 || aiiw1[0] != iiw1) goto _L2; else goto _L1
_L1:
        iiv iiv1 = e;
_L4:
        return iiv1;
_L2:
        iiv1 = this;
        if (l == 0) goto _L4; else goto _L3
_L3:
        iiw aiiw[];
        int i;
        int j;
        aiiw = new iiw[l - 1];
        j = 0;
        i = 0;
_L8:
        if (j >= l) goto _L6; else goto _L5
_L5:
        iiw iiw2;
        iiw2 = aiiw1[j];
        if (iiw2 == iiw1)
        {
            continue; /* Loop/switch isn't completed */
        }
        iiv1 = this;
        if (i == l - 1) goto _L4; else goto _L7
_L7:
        int k = i + 1;
        aiiw[i] = iiw2;
        i = k;
        j++;
          goto _L8
_L6:
        if (i == 0)
        {
            return e;
        }
        if (i < l - 1)
        {
            iiw1 = new iiw[i];
            System.arraycopy(aiiw, 0, iiw1, 0, i);
        } else
        {
            iiw1 = aiiw;
        }
        return new iiv(a, iiw1);
    }

    static 
    {
        c = new iiw[0];
        d = new iiv(true, c);
        e = new iiv(false, c);
    }
}
