// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ijc
{

    final boolean a;
    final icl b;

    ijc(boolean flag, icl icl)
    {
        a = flag;
        b = icl;
    }

    final ijc a()
    {
        return new ijc(true, b);
    }

    final ijc a(icl icl)
    {
        return new ijc(a, icl);
    }
}
