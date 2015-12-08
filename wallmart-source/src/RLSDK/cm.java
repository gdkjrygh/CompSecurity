// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            cp, y, aj

abstract class cm extends cp
{

    cm(aj aj1)
    {
        super(aj1);
    }

    public final String a()
        throws y
    {
        if (a.b != 60)
        {
            throw y.a();
        } else
        {
            StringBuffer stringbuffer = new StringBuffer();
            b(stringbuffer, 5);
            b(stringbuffer, 45, 15);
            return stringbuffer.toString();
        }
    }
}
