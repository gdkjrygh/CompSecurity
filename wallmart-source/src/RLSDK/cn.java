// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            co, y, cz, aj

final class cn extends co
{

    cn(aj aj)
    {
        super(aj);
    }

    public final String a()
        throws y
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("(01)");
        int i = stringbuffer.length();
        stringbuffer.append(b.a(4, 4));
        a(stringbuffer, 8, i);
        return b.a(stringbuffer, 48);
    }
}
