// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ija
{

    final boolean a;
    final icl b;

    ija(boolean flag, icl icl)
    {
        a = flag;
        b = icl;
    }

    final ija a()
    {
        return new ija(true, b);
    }

    final ija a(icl icl)
    {
        return new ija(a, icl);
    }
}
