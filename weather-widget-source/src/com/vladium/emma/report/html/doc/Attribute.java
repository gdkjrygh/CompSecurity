// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html.doc;


// Referenced classes of package com.vladium.emma.report.html.doc:
//            IContent, HTMLWriter

public abstract class Attribute
    implements IContent
{
    private static final class AttributeImpl extends Attribute
    {

        private final String m_name;

        public void emit(HTMLWriter htmlwriter)
        {
            htmlwriter.write(m_name);
        }

        public boolean equals(Object obj)
        {
            if (this == obj)
            {
                return true;
            }
            if (!(obj instanceof AttributeImpl))
            {
                return false;
            } else
            {
                return m_name.equals(((AttributeImpl)obj).m_name);
            }
        }

        public String getName()
        {
            return m_name;
        }

        public int hashCode()
        {
            return m_name.hashCode();
        }

        public String toString()
        {
            return m_name;
        }

        AttributeImpl(String s)
        {
            m_name = s;
        }
    }


    public static final Attribute ALIGN = new AttributeImpl("ALIGN");
    public static final Attribute BORDER = new AttributeImpl("BORDER");
    public static final Attribute CELLPADDING = new AttributeImpl("CELLPADDING");
    public static final Attribute CELLSPACING = new AttributeImpl("CELLSPACING");
    public static final Attribute CLASS = new AttributeImpl("CLASS");
    public static final Attribute COLSPAN = new AttributeImpl("COLSPAN");
    public static final Attribute CONTENT = new AttributeImpl("CONTENT");
    public static final Attribute HREF = new AttributeImpl("HREF");
    public static final Attribute HTTP_EQUIV = new AttributeImpl("HTTP-EQUIV");
    public static final Attribute ID = new AttributeImpl("ID");
    public static final Attribute NAME = new AttributeImpl("NAME");
    public static final Attribute REL = new AttributeImpl("REL");
    public static final Attribute SIZE = new AttributeImpl("SIZE");
    public static final Attribute SRC = new AttributeImpl("SRC");
    public static final Attribute TITLE = new AttributeImpl("TITLE");
    public static final Attribute TYPE = new AttributeImpl("TYPE");
    public static final Attribute WIDTH = new AttributeImpl("WIDTH");

    Attribute()
    {
    }

    public abstract boolean equals(Object obj);

    public abstract String getName();

    public abstract int hashCode();

}
