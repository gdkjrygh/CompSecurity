// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ida extends RuntimeException
{

    private static final long serialVersionUID = 0xf81885d29b9202c2L;

    public static Throwable a(Throwable throwable, Object obj)
    {
        Throwable throwable1 = icw.b(throwable);
        if (throwable1 != null && (throwable1 instanceof idb) && ((idb)throwable1).a() == obj)
        {
            return throwable;
        } else
        {
            icw.a(throwable, new idb(obj));
            return throwable;
        }
    }
}
