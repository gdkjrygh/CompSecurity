// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;


// Referenced classes of package org.apache.commons.lang3:
//            StringUtils

public class CharUtils
{

    private static final String CHAR_STRING_ARRAY[];
    public static final char CR = 13;
    public static final char LF = 10;

    public CharUtils()
    {
    }

    public static boolean isAscii(char c)
    {
        return c < '\200';
    }

    public static boolean isAsciiAlpha(char c)
    {
        return isAsciiAlphaUpper(c) || isAsciiAlphaLower(c);
    }

    public static boolean isAsciiAlphaLower(char c)
    {
        return c >= 'a' && c <= 'z';
    }

    public static boolean isAsciiAlphaUpper(char c)
    {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean isAsciiAlphanumeric(char c)
    {
        return isAsciiAlpha(c) || isAsciiNumeric(c);
    }

    public static boolean isAsciiControl(char c)
    {
        return c < ' ' || c == '\177';
    }

    public static boolean isAsciiNumeric(char c)
    {
        return c >= '0' && c <= '9';
    }

    public static boolean isAsciiPrintable(char c)
    {
        return c >= ' ' && c < '\177';
    }

    public static char toChar(Character character)
    {
        if (character == null)
        {
            throw new IllegalArgumentException("The Character must not be null");
        } else
        {
            return character.charValue();
        }
    }

    public static char toChar(Character character, char c)
    {
        if (character == null)
        {
            return c;
        } else
        {
            return character.charValue();
        }
    }

    public static char toChar(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("The String must not be empty");
        } else
        {
            return s.charAt(0);
        }
    }

    public static char toChar(String s, char c)
    {
        if (StringUtils.isEmpty(s))
        {
            return c;
        } else
        {
            return s.charAt(0);
        }
    }

    public static Character toCharacterObject(char c)
    {
        return Character.valueOf(c);
    }

    public static Character toCharacterObject(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return Character.valueOf(s.charAt(0));
        }
    }

    public static int toIntValue(char c)
    {
        if (!isAsciiNumeric(c))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("The character ").append(c).append(" is not in the range '0' - '9'").toString());
        } else
        {
            return c - 48;
        }
    }

    public static int toIntValue(char c, int i)
    {
        if (!isAsciiNumeric(c))
        {
            return i;
        } else
        {
            return c - 48;
        }
    }

    public static int toIntValue(Character character)
    {
        if (character == null)
        {
            throw new IllegalArgumentException("The character must not be null");
        } else
        {
            return toIntValue(character.charValue());
        }
    }

    public static int toIntValue(Character character, int i)
    {
        if (character == null)
        {
            return i;
        } else
        {
            return toIntValue(character.charValue(), i);
        }
    }

    public static String toString(char c)
    {
        if (c < '\200')
        {
            return CHAR_STRING_ARRAY[c];
        } else
        {
            return new String(new char[] {
                c
            });
        }
    }

    public static String toString(Character character)
    {
        if (character == null)
        {
            return null;
        } else
        {
            return toString(character.charValue());
        }
    }

    public static String unicodeEscaped(char c)
    {
        if (c < '\020')
        {
            return (new StringBuilder()).append("\\u000").append(Integer.toHexString(c)).toString();
        }
        if (c < '\u0100')
        {
            return (new StringBuilder()).append("\\u00").append(Integer.toHexString(c)).toString();
        }
        if (c < '\u1000')
        {
            return (new StringBuilder()).append("\\u0").append(Integer.toHexString(c)).toString();
        } else
        {
            return (new StringBuilder()).append("\\u").append(Integer.toHexString(c)).toString();
        }
    }

    public static String unicodeEscaped(Character character)
    {
        if (character == null)
        {
            return null;
        } else
        {
            return unicodeEscaped(character.charValue());
        }
    }

    static 
    {
        CHAR_STRING_ARRAY = new String[128];
        for (char c = '\0'; c < CHAR_STRING_ARRAY.length; c++)
        {
            CHAR_STRING_ARRAY[c] = String.valueOf(c);
        }

    }
}
