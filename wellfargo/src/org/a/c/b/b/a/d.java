// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.a;


// Referenced classes of package org.a.c.b.b.a:
//            k, e

public class d
    implements k
{

    public static e[] a(e ae[][])
    {
        int i;
        int j;
        i = 0;
        j = 0;
_L3:
        if (i < ae.length) goto _L2; else goto _L1
_L1:
        e ae1[];
        ae1 = new e[j];
        i = 0;
        j = 0;
_L4:
        if (i >= ae.length)
        {
            return ae1;
        }
        break MISSING_BLOCK_LABEL_41;
_L2:
        j += ae[i].length;
        i++;
          goto _L3
        System.arraycopy(ae[i], 0, ae1, j, ae[i].length);
        j += ae[i].length;
        i++;
          goto _L4
    }
}
