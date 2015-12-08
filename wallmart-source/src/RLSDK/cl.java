// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            cp, y, aj, cz

final class cl extends cp
{

    private final String c;
    private final String d;

    cl(aj aj1, String s, String s1)
    {
        super(aj1);
        c = s1;
        d = s;
    }

    protected final int a(int i)
    {
        return i % 0x186a0;
    }

    public final String a()
        throws y
    {
        if (a.b != 84)
        {
            throw y.a();
        }
        StringBuffer stringbuffer = new StringBuffer();
        b(stringbuffer, 8);
        b(stringbuffer, 48, 20);
        int j = b.a(68, 16);
        if (j != 38400)
        {
            stringbuffer.append('(');
            stringbuffer.append(c);
            stringbuffer.append(')');
            int i = j % 32;
            int k = j / 32;
            j = k % 12 + 1;
            k /= 12;
            if (k / 10 == 0)
            {
                stringbuffer.append('0');
            }
            stringbuffer.append(k);
            if (j / 10 == 0)
            {
                stringbuffer.append('0');
            }
            stringbuffer.append(j);
            if (i / 10 == 0)
            {
                stringbuffer.append('0');
            }
            stringbuffer.append(i);
        }
        return stringbuffer.toString();
    }

    protected final void a(StringBuffer stringbuffer, int i)
    {
        i /= 0x186a0;
        stringbuffer.append('(');
        stringbuffer.append(d);
        stringbuffer.append(i);
        stringbuffer.append(')');
    }
}
