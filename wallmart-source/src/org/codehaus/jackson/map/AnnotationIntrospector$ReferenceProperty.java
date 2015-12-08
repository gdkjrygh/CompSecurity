// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;


// Referenced classes of package org.codehaus.jackson.map:
//            AnnotationIntrospector

public static class _name
{

    private final String _name;
    private final Type _type;

    public static _name back(String s)
    {
    /* block-local class not found */
    class Type {}

        return new <init>(Type.BACK_REFERENCE, s);
    }

    public static Type managed(String s)
    {
        return new <init>(Type.MANAGED_REFERENCE, s);
    }

    public String getName()
    {
        return _name;
    }

    public Type getType()
    {
        return _type;
    }

    public boolean isBackReference()
    {
        return _type == Type.BACK_REFERENCE;
    }

    public boolean isManagedReference()
    {
        return _type == Type.MANAGED_REFERENCE;
    }

    public Type(Type type, String s)
    {
        _type = type;
        _name = s;
    }
}
