// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html.doc;


// Referenced classes of package com.vladium.emma.report.html.doc:
//            IContent

public interface IElementList
    extends IContent
{

    public abstract IElementList add(int i, IContent icontent);

    public abstract IElementList add(IContent icontent);

    public abstract int size();
}
