// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html.doc;


// Referenced classes of package com.vladium.emma.report.html.doc:
//            HTMLTable, AttributeSet, Attribute, Tag

private static class eate extends y.ElementImpl
    implements 
{

    public  setColspan(int i)
    {
        getAttributes().set(Attribute.COLSPAN, i);
        return this;
    }

    (Tag tag)
    {
        super(tag, AttributeSet.create());
    }
}
