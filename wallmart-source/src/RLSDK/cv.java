// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            cx

final class cv extends cx
{

    private final String b;
    private final int c;
    private final boolean d;

    cv(int i, String s)
    {
        super(i);
        b = s;
        d = false;
        c = 0;
    }

    cv(int i, String s, int j)
    {
        super(i);
        d = true;
        c = j;
        b = s;
    }

    final String a()
    {
        return b;
    }

    final boolean b()
    {
        return d;
    }

    final int c()
    {
        return c;
    }
}
