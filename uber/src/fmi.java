// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fmi extends hpb
{

    private boolean a;
    private boolean b;

    fmi()
    {
    }

    private boolean a()
    {
        return b && !a;
    }

    static boolean a(fmi fmi1)
    {
        return fmi1.a();
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        i = k - j;
        if (i > 1)
        {
            b = true;
        } else
        if (i == 1)
        {
            a = true;
            return;
        }
    }
}
