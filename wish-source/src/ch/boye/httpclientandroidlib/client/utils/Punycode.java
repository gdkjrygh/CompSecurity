// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.utils;


// Referenced classes of package ch.boye.httpclientandroidlib.client.utils:
//            JdkIdn, Rfc3492Idn, Idn

public class Punycode
{

    private static final Idn impl;

    public Punycode()
    {
    }

    public static String toUnicode(String s)
    {
        return impl.toUnicode(s);
    }

    static 
    {
        Object obj;
        try
        {
            obj = new JdkIdn();
        }
        catch (Exception exception)
        {
            exception = new Rfc3492Idn();
        }
        impl = ((Idn) (obj));
    }
}
