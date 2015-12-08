// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            ad

public final class cb
{

    private final int a;
    private final int b[];
    private final ad c[];

    public cb(int i, int ai[], int j, int k, int l)
    {
        a = i;
        b = ai;
        c = (new ad[] {
            new ad(j, l), new ad(k, l)
        });
    }

    public final int a()
    {
        return a;
    }

    public final int[] b()
    {
        return b;
    }

    public final ad[] c()
    {
        return c;
    }
}
