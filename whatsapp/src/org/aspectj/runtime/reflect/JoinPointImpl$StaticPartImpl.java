// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.reflect;

import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.SourceLocation;

// Referenced classes of package org.aspectj.runtime.reflect:
//            JoinPointImpl, StringMaker, SignatureImpl

static class id
    implements org.aspectj.lang.icPartImpl
{

    private int id;
    String kind;
    Signature signature;
    SourceLocation sourceLocation;

    public int getId()
    {
        return id;
    }

    public String getKind()
    {
        return kind;
    }

    public Signature getSignature()
    {
        return signature;
    }

    public SourceLocation getSourceLocation()
    {
        return sourceLocation;
    }

    public final String toLongString()
    {
        return toString(StringMaker.longStringMaker);
    }

    public final String toShortString()
    {
        return toString(StringMaker.shortStringMaker);
    }

    public final String toString()
    {
        return toString(StringMaker.middleStringMaker);
    }

    String toString(StringMaker stringmaker)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(stringmaker.makeKindName(getKind()));
        stringbuffer.append("(");
        stringbuffer.append(((SignatureImpl)getSignature()).toString(stringmaker));
        stringbuffer.append(")");
        return stringbuffer.toString();
    }

    public (int i, String s, Signature signature1, SourceLocation sourcelocation)
    {
        kind = s;
        signature = signature1;
        sourceLocation = sourcelocation;
        id = i;
    }
}
