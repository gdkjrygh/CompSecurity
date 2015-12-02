// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ifw
{

    final int a;
    final ifx b[];
    long c;

    ifw()
    {
        a = ifu.a;
        b = new ifx[a];
        for (int i = 0; i < a; i++)
        {
            b[i] = new ifx(ifu.c());
        }

    }

    public final ifx a()
    {
        ifx aifx[] = b;
        long l = c;
        c = 1L + l;
        return aifx[(int)(l % (long)a)];
    }
}
