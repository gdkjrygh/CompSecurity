// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintStream;

final class icu extends ict
{

    private final PrintStream a;

    icu(PrintStream printstream)
    {
        super((byte)0);
        a = printstream;
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
