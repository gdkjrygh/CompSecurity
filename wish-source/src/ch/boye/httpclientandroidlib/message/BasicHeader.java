// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.message;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.ParseException;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import java.io.Serializable;

// Referenced classes of package ch.boye.httpclientandroidlib.message:
//            BasicHeaderValueParser, BasicLineFormatter

public class BasicHeader
    implements Header, Serializable, Cloneable
{

    private static final long serialVersionUID = 0xb4ae9550d79ce842L;
    private final String name;
    private final String value;

    public BasicHeader(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Name may not be null");
        } else
        {
            name = s;
            value = s1;
            return;
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }

    public HeaderElement[] getElements()
        throws ParseException
    {
        if (value != null)
        {
            return BasicHeaderValueParser.parseElements(value, null);
        } else
        {
            return new HeaderElement[0];
        }
    }

    public String getName()
    {
        return name;
    }

    public String getValue()
    {
        return value;
    }

    public String toString()
    {
        return BasicLineFormatter.DEFAULT.formatHeader(null, this).toString();
    }
}
