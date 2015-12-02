// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ejg
{

    private final String a;
    private final bkg b;

    ejg(String s, bkg bkg1)
    {
        a = s;
        b = bkg1;
    }

    final String a()
    {
        return a;
    }

    final String b()
    {
        if (b != null)
        {
            return b.toString();
        } else
        {
            return "{}";
        }
    }
}
