// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html.doc;


// Referenced classes of package com.vladium.emma.report.html.doc:
//            Tag, AttributeSet, Attribute, IContent, 
//            IElementList, HTMLWriter, ISimpleElement, IElement

public class HyperRef extends IElement.Factory.ElementImpl
{

    public HyperRef(String s, String s1, boolean flag)
    {
        super(Tag.A, AttributeSet.create());
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("null or empty input: href");
        }
        if (s1 == null || s1.length() == 0)
        {
            throw new IllegalArgumentException("null or empty input: text");
        } else
        {
            getAttributes().set(Attribute.HREF, s);
            setText(s1, flag);
            return;
        }
    }

    public volatile IElementList add(int i, IContent icontent)
    {
        return super.add(i, icontent);
    }

    public volatile IElementList add(IContent icontent)
    {
        return super.add(icontent);
    }

    public volatile void emit(HTMLWriter htmlwriter)
    {
        super.emit(htmlwriter);
    }

    public volatile AttributeSet getAttributes()
    {
        return super.getAttributes();
    }

    public volatile Tag getTag()
    {
        return super.getTag();
    }

    public volatile ISimpleElement setClass(String s)
    {
        return super.setClass(s);
    }

    public volatile IElement setText(String s, boolean flag)
    {
        return super.setText(s, flag);
    }

    public volatile int size()
    {
        return super.size();
    }

    public volatile String toString()
    {
        return super.toString();
    }
}
