// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            co, cz, aj

abstract class cp extends co
{

    cp(aj aj)
    {
        super(aj);
    }

    protected abstract int a(int i);

    protected abstract void a(StringBuffer stringbuffer, int i);

    protected final void b(StringBuffer stringbuffer, int i, int j)
    {
        i = b.a(i, j);
        a(stringbuffer, i);
        int k = a(i);
        j = 0x186a0;
        for (i = 0; i < 5; i++)
        {
            if (k / j == 0)
            {
                stringbuffer.append('0');
            }
            j /= 10;
        }

        stringbuffer.append(k);
    }
}
