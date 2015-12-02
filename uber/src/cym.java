// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cym extends ijh
{

    private final gmc a;

    public cym(gmc gmc1)
    {
        a = gmc1;
    }

    public final transient void a(String s, Object aobj[])
    {
        a.c(String.format(s, aobj));
    }

    public final transient void a(Throwable throwable, String s, Object aobj[])
    {
        a(s, aobj);
    }

    public final transient void b(String s, Object aobj[])
    {
        a((new StringBuilder("ERROR: ")).append(s).toString(), aobj);
    }

    public final transient void b(Throwable throwable, String s, Object aobj[])
    {
        b(s, aobj);
        a.a(throwable);
    }
}
