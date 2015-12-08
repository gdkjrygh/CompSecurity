// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Preconditions

public final class Ascii
{

    public static final byte ACK = 6;
    public static final byte BEL = 7;
    public static final byte BS = 8;
    public static final byte CAN = 24;
    public static final byte CR = 13;
    public static final byte DC1 = 17;
    public static final byte DC2 = 18;
    public static final byte DC3 = 19;
    public static final byte DC4 = 20;
    public static final byte DEL = 127;
    public static final byte DLE = 16;
    public static final byte EM = 25;
    public static final byte ENQ = 5;
    public static final byte EOT = 4;
    public static final byte ESC = 27;
    public static final byte ETB = 23;
    public static final byte ETX = 3;
    public static final byte FF = 12;
    public static final byte FS = 28;
    public static final byte GS = 29;
    public static final byte HT = 9;
    public static final byte LF = 10;
    public static final char MAX = 127;
    public static final char MIN = 0;
    public static final byte NAK = 21;
    public static final byte NL = 10;
    public static final byte NUL = 0;
    public static final byte RS = 30;
    public static final byte SI = 15;
    public static final byte SO = 14;
    public static final byte SOH = 1;
    public static final byte SP = 32;
    public static final byte SPACE = 32;
    public static final byte STX = 2;
    public static final byte SUB = 26;
    public static final byte SYN = 22;
    public static final byte US = 31;
    public static final byte VT = 11;
    public static final byte XOFF = 19;
    public static final byte XON = 17;

    private Ascii()
    {
    }

    public static boolean equalsIgnoreCase(CharSequence charsequence, CharSequence charsequence1)
    {
        int j = charsequence.length();
        if (charsequence != charsequence1)
        {
            if (j != charsequence1.length())
            {
                return false;
            }
            int i = 0;
            while (i < j) 
            {
                char c = charsequence.charAt(i);
                char c1 = charsequence1.charAt(i);
                int k;
                if (c != c1)
                {
                    if ((k = getAlphaIndex(c)) >= 26 || k != getAlphaIndex(c1))
                    {
                        return false;
                    }
                }
                i++;
            }
        }
        return true;
    }

    private static int getAlphaIndex(char c)
    {
        return (char)((c | 0x20) - 97);
    }

    public static boolean isLowerCase(char c)
    {
        return c >= 'a' && c <= 'z';
    }

    public static boolean isUpperCase(char c)
    {
        return c >= 'A' && c <= 'Z';
    }

    public static char toLowerCase(char c)
    {
        char c1 = c;
        if (isUpperCase(c))
        {
            c1 = (char)(c ^ 0x20);
        }
        return c1;
    }

    public static String toLowerCase(CharSequence charsequence)
    {
        if (charsequence instanceof String)
        {
            return toLowerCase((String)charsequence);
        }
        int j = charsequence.length();
        StringBuilder stringbuilder = new StringBuilder(j);
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(toLowerCase(charsequence.charAt(i)));
        }

        return stringbuilder.toString();
    }

    public static String toLowerCase(String s)
    {
        int j = s.length();
        int i = 0;
        do
        {
label0:
            {
                String s1 = s;
                if (i < j)
                {
                    if (!isUpperCase(s.charAt(i)))
                    {
                        break label0;
                    }
                    s = s.toCharArray();
                    for (; i < j; i++)
                    {
                        char c = s[i];
                        if (isUpperCase(c))
                        {
                            s[i] = (char)(c ^ 0x20);
                        }
                    }

                    s1 = String.valueOf(s);
                }
                return s1;
            }
            i++;
        } while (true);
    }

    public static char toUpperCase(char c)
    {
        char c1 = c;
        if (isLowerCase(c))
        {
            c1 = (char)(c & 0x5f);
        }
        return c1;
    }

    public static String toUpperCase(CharSequence charsequence)
    {
        if (charsequence instanceof String)
        {
            return toUpperCase((String)charsequence);
        }
        int j = charsequence.length();
        StringBuilder stringbuilder = new StringBuilder(j);
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(toUpperCase(charsequence.charAt(i)));
        }

        return stringbuilder.toString();
    }

    public static String toUpperCase(String s)
    {
        int j = s.length();
        int i = 0;
        do
        {
label0:
            {
                String s1 = s;
                if (i < j)
                {
                    if (!isLowerCase(s.charAt(i)))
                    {
                        break label0;
                    }
                    s = s.toCharArray();
                    for (; i < j; i++)
                    {
                        char c = s[i];
                        if (isLowerCase(c))
                        {
                            s[i] = (char)(c & 0x5f);
                        }
                    }

                    s1 = String.valueOf(s);
                }
                return s1;
            }
            i++;
        } while (true);
    }

    public static String truncate(CharSequence charsequence, int i, String s)
    {
        Preconditions.checkNotNull(charsequence);
        int j = i - s.length();
        Object obj;
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "maxLength (%s) must be >= length of the truncation indicator (%s)", new Object[] {
            Integer.valueOf(i), Integer.valueOf(s.length())
        });
        obj = charsequence;
        if (charsequence.length() <= i)
        {
            obj = charsequence.toString();
            if (((String) (obj)).length() <= i)
            {
                return ((String) (obj));
            }
        }
        return (new StringBuilder(i)).append(((CharSequence) (obj)), 0, j).append(s).toString();
    }
}
