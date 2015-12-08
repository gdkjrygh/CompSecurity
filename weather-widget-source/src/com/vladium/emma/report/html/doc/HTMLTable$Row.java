// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html.doc;


// Referenced classes of package com.vladium.emma.report.html.doc:
//            HTMLTable, Tag, AttributeSet

private static class m_th extends ry.ElementImpl
    implements 
{

    private final boolean m_th;

    public l newCell()
    {
        Object obj;
        if (m_th)
        {
            obj = Tag.TH;
        } else
        {
            obj = Tag.TD;
        }
        obj = new (((Tag) (obj)));
        add(((IContent) (obj)));
        return ((l) (obj));
    }

    l(boolean flag)
    {
        super(Tag.TR, AttributeSet.create());
        m_th = flag;
    }
}
