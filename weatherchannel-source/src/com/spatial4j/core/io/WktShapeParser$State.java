// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.io;

import com.spatial4j.core.context.SpatialContext;
import java.text.ParseException;

// Referenced classes of package com.spatial4j.core.io:
//            WktShapeParser

public class rawString
{

    private WktShapeParser a;
    public String dimension;
    public int offset;
    public String rawString;

    public final boolean eof()
    {
        return offset >= rawString.length();
    }

    public SpatialContext getCtx()
    {
        return a.ctx;
    }

    public WktShapeParser getParser()
    {
        return a;
    }

    public double nextDouble()
        throws ParseException
    {
        int i = offset;
        skipDouble();
        if (i == offset)
        {
            throw new ParseException("Expected a number", offset);
        }
        double d;
        try
        {
            d = Double.parseDouble(rawString.substring(i, offset));
        }
        catch (Exception exception)
        {
            throw new ParseException(exception.toString(), offset);
        }
        nextIfWhitespace();
        return d;
    }

    public void nextExpect(char c)
        throws ParseException
    {
        if (eof())
        {
            throw new ParseException((new StringBuilder("Expected [")).append(c).append("] found EOF").toString(), offset);
        }
        char c1 = rawString.charAt(offset);
        if (c1 != c)
        {
            throw new ParseException((new StringBuilder("Expected [")).append(c).append("] found [").append(c1).append("]").toString(), offset);
        } else
        {
            offset = offset + 1;
            nextIfWhitespace();
            return;
        }
    }

    public boolean nextIf(char c)
    {
        if (!eof() && rawString.charAt(offset) == c)
        {
            offset = offset + 1;
            nextIfWhitespace();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean nextIfEmptyAndSkipZM()
        throws ParseException
    {
        char c;
        if (!eof())
        {
            if ((c = rawString.charAt(offset)) != '(' && Character.isJavaIdentifierPart(c))
            {
                String s = nextWord();
                if (s.equalsIgnoreCase("EMPTY"))
                {
                    return true;
                }
                dimension = s;
                if (!eof())
                {
                    char c1 = rawString.charAt(offset);
                    if (c1 != '(' && Character.isJavaIdentifierPart(c1))
                    {
                        String s1 = nextWord();
                        if (s1.equalsIgnoreCase("EMPTY"))
                        {
                            return true;
                        } else
                        {
                            throw new ParseException((new StringBuilder("Expected EMPTY because found dimension; but got [")).append(s1).append("]").toString(), offset);
                        }
                    }
                }
            }
        }
        return false;
    }

    public void nextIfWhitespace()
    {
        do
        {
            if (offset >= rawString.length() || !Character.isWhitespace(rawString.charAt(offset)))
            {
                return;
            }
            offset = offset + 1;
        } while (true);
    }

    public String nextSubShapeString()
        throws ParseException
    {
        int j;
        int k;
        k = offset;
        j = 0;
_L7:
        if (offset >= rawString.length()) goto _L2; else goto _L1
_L1:
        char c = rawString.charAt(offset);
        if (c != ',') goto _L4; else goto _L3
_L3:
        int i;
        i = j;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_77;
        }
_L2:
        if (j != 0)
        {
            throw new ParseException("Unbalanced parenthesis", k);
        } else
        {
            return rawString.substring(k, offset);
        }
_L4:
        if (c != ')')
        {
            break; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L2; else goto _L5
_L5:
        i = j - 1;
_L8:
        offset = offset + 1;
        j = i;
        if (true) goto _L7; else goto _L6
_L6:
        i = j;
        if (c == '(')
        {
            i = j + 1;
        }
          goto _L8
        if (true) goto _L7; else goto _L9
_L9:
    }

    public String nextWord()
        throws ParseException
    {
        int i = offset;
        for (; offset < rawString.length() && Character.isJavaIdentifierPart(rawString.charAt(offset)); offset = offset + 1) { }
        if (i == offset)
        {
            throw new ParseException("Word expected", i);
        } else
        {
            String s = rawString.substring(i, offset);
            nextIfWhitespace();
            return s;
        }
    }

    public void skipDouble()
    {
        int i = offset;
        do
        {
            if (offset >= rawString.length())
            {
                break;
            }
            char c = rawString.charAt(offset);
            if (!Character.isDigit(c) && c != '.' && c != '-' && c != '+' && (offset == i || c != 'e' && c != 'E'))
            {
                break;
            }
            offset = offset + 1;
        } while (true);
    }

    public void skipNextDoubles()
    {
        do
        {
label0:
            {
                if (!eof())
                {
                    int i = offset;
                    skipDouble();
                    if (i != offset)
                    {
                        break label0;
                    }
                }
                return;
            }
            nextIfWhitespace();
        } while (true);
    }

    public (WktShapeParser wktshapeparser, String s)
    {
        a = wktshapeparser;
        super();
        rawString = s;
    }
}
