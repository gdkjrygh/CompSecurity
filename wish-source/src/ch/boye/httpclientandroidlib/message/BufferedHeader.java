// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.message;

import ch.boye.httpclientandroidlib.FormattedHeader;
import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.ParseException;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import java.io.Serializable;

// Referenced classes of package ch.boye.httpclientandroidlib.message:
//            ParserCursor, BasicHeaderValueParser

public class BufferedHeader
    implements FormattedHeader, Serializable, Cloneable
{

    private static final long serialVersionUID = 0xd994d5f69af48418L;
    private final CharArrayBuffer buffer;
    private final String name;
    private final int valuePos;

    public BufferedHeader(CharArrayBuffer chararraybuffer)
        throws ParseException
    {
        if (chararraybuffer == null)
        {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        int i = chararraybuffer.indexOf(58);
        if (i == -1)
        {
            throw new ParseException((new StringBuilder()).append("Invalid header: ").append(chararraybuffer.toString()).toString());
        }
        String s = chararraybuffer.substringTrimmed(0, i);
        if (s.length() == 0)
        {
            throw new ParseException((new StringBuilder()).append("Invalid header: ").append(chararraybuffer.toString()).toString());
        } else
        {
            buffer = chararraybuffer;
            name = s;
            valuePos = i + 1;
            return;
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }

    public CharArrayBuffer getBuffer()
    {
        return buffer;
    }

    public HeaderElement[] getElements()
        throws ParseException
    {
        ParserCursor parsercursor = new ParserCursor(0, buffer.length());
        parsercursor.updatePos(valuePos);
        return BasicHeaderValueParser.DEFAULT.parseElements(buffer, parsercursor);
    }

    public String getName()
    {
        return name;
    }

    public String getValue()
    {
        return buffer.substringTrimmed(valuePos, buffer.length());
    }

    public int getValuePos()
    {
        return valuePos;
    }

    public String toString()
    {
        return buffer.toString();
    }
}
