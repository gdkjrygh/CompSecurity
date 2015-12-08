// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.math.RoundingMode;

// Referenced classes of package com.google.common.io:
//            BaseEncoding

static final class separatorChars extends BaseEncoding
{

    private final int afterEveryChars;
    private final BaseEncoding _flddelegate;
    private final String separator;
    private final CharMatcher separatorChars;

    separatorChars decodingStream(separatorChars separatorchars)
    {
        return _flddelegate.decodingStream(ignoringInput(separatorchars, separatorChars));
    }

    separatorChars encodingStream(separatorChars separatorchars)
    {
        return _flddelegate.encodingStream(separatingOutput(separatorchars, separator, afterEveryChars));
    }

    public BaseEncoding lowerCase()
    {
        return _flddelegate.lowerCase().withSeparator(separator, afterEveryChars);
    }

    int maxDecodedSize(int i)
    {
        return _flddelegate.maxDecodedSize(i);
    }

    int maxEncodedSize(int i)
    {
        i = _flddelegate.maxEncodedSize(i);
        return separator.length() * IntMath.divide(Math.max(0, i - 1), afterEveryChars, RoundingMode.FLOOR) + i;
    }

    public BaseEncoding omitPadding()
    {
        return _flddelegate.omitPadding().withSeparator(separator, afterEveryChars);
    }

    CharMatcher padding()
    {
        return _flddelegate.padding();
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(_flddelegate.toString()));
        String s1 = String.valueOf(String.valueOf(separator));
        int i = afterEveryChars;
        return (new StringBuilder(s.length() + 31 + s1.length())).append(s).append(".withSeparator(\"").append(s1).append("\", ").append(i).append(")").toString();
    }

    public BaseEncoding upperCase()
    {
        return _flddelegate.upperCase().withSeparator(separator, afterEveryChars);
    }

    public BaseEncoding withPadChar(char c)
    {
        return _flddelegate.withPadChar(c).withSeparator(separator, afterEveryChars);
    }

    public BaseEncoding withSeparator(String s, int i)
    {
        throw new UnsupportedOperationException("Already have a separator");
    }

    (BaseEncoding baseencoding, String s, int i)
    {
        _flddelegate = (BaseEncoding)Preconditions.checkNotNull(baseencoding);
        separator = (String)Preconditions.checkNotNull(s);
        afterEveryChars = i;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Cannot add a separator after every %s chars", new Object[] {
            Integer.valueOf(i)
        });
        separatorChars = CharMatcher.anyOf(s).precomputed();
    }
}
