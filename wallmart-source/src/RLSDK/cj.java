// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            co, y, aj, cz, 
//            cv

final class cj extends co
{

    cj(aj aj1)
    {
        super(aj1);
    }

    public final String a()
        throws y
    {
        if (a.b < 48)
        {
            throw y.a();
        } else
        {
            StringBuffer stringbuffer = new StringBuffer();
            b(stringbuffer, 8);
            int i = b.a(48, 2);
            stringbuffer.append("(392");
            stringbuffer.append(i);
            stringbuffer.append(')');
            stringbuffer.append(b.a(50, null).a());
            return stringbuffer.toString();
        }
    }
}
