// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;

public final class idb extends RuntimeException
{

    private static final long serialVersionUID = 0xd00f486d07cc9535L;
    private final Object a;

    public idb(Object obj)
    {
        super((new StringBuilder("OnError while emitting onNext value: ")).append(a(obj)).toString());
        a = obj;
    }

    private static String a(Object obj)
    {
        if (obj == null)
        {
            return "null";
        }
        if (idc.a.contains(obj.getClass()))
        {
            return obj.toString();
        }
        if (obj instanceof String)
        {
            return (String)obj;
        }
        if (obj instanceof Enum)
        {
            return ((Enum)obj).name();
        } else
        {
            iia.a().b();
            return (new StringBuilder()).append(obj.getClass().getName()).append(".class").toString();
        }
    }

    public final Object a()
    {
        return a;
    }
}
