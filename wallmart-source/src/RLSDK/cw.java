// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            cx

final class cw extends cx
{

    private final int b;
    private final int c;

    cw(int i, int j, int k)
    {
        super(i);
        b = j;
        c = k;
        if (b < 0 || b > 10)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid firstDigit: ")).append(j).toString());
        }
        if (c < 0 || c > 10)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid secondDigit: ")).append(k).toString());
        } else
        {
            return;
        }
    }

    final int a()
    {
        return b;
    }

    final int b()
    {
        return c;
    }

    final boolean c()
    {
        return b == 10;
    }

    final boolean d()
    {
        return c == 10;
    }
}
