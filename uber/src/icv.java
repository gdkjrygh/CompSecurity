// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintWriter;

final class icv extends ict
{

    private final PrintWriter a;

    icv(PrintWriter printwriter)
    {
        super((byte)0);
        a = printwriter;
    }

    final Object a()
    {
        return a;
    }

    final void a(Object obj)
    {
        a.println(obj);
    }
}
