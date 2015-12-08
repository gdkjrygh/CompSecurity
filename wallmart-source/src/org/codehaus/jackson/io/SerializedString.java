// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.io;

import org.codehaus.jackson.SerializableString;

// Referenced classes of package org.codehaus.jackson.io:
//            JsonStringEncoder

public class SerializedString
    implements SerializableString
{

    protected char _quotedChars[];
    protected byte _quotedUTF8Ref[];
    protected byte _unquotedUTF8Ref[];
    protected final String _value;

    public SerializedString(String s)
    {
        _value = s;
    }

    public final char[] asQuotedChars()
    {
        char ac1[] = _quotedChars;
        char ac[] = ac1;
        if (ac1 == null)
        {
            ac = JsonStringEncoder.getInstance().quoteAsString(_value);
            _quotedChars = ac;
        }
        return ac;
    }

    public final byte[] asQuotedUTF8()
    {
        byte abyte1[] = _quotedUTF8Ref;
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = JsonStringEncoder.getInstance().quoteAsUTF8(_value);
            _quotedUTF8Ref = abyte0;
        }
        return abyte0;
    }

    public final byte[] asUnquotedUTF8()
    {
        byte abyte1[] = _unquotedUTF8Ref;
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = JsonStringEncoder.getInstance().encodeAsUTF8(_value);
            _unquotedUTF8Ref = abyte0;
        }
        return abyte0;
    }

    public final int charLength()
    {
        return _value.length();
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj == null || obj.getClass() != getClass())
        {
            return false;
        } else
        {
            obj = (SerializedString)obj;
            return _value.equals(((SerializedString) (obj))._value);
        }
    }

    public final String getValue()
    {
        return _value;
    }

    public final int hashCode()
    {
        return _value.hashCode();
    }

    public final String toString()
    {
        return _value;
    }
}
