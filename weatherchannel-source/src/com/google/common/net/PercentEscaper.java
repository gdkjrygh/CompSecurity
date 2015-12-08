// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.net;

import com.google.common.base.Preconditions;
import com.google.common.escape.UnicodeEscaper;

public final class PercentEscaper extends UnicodeEscaper
{

    private static final char PLUS_SIGN[] = {
        '+'
    };
    private static final char UPPER_HEX_DIGITS[] = "0123456789ABCDEF".toCharArray();
    private final boolean plusForSpace;
    private final boolean safeOctets[];

    public PercentEscaper(String s, boolean flag)
    {
        Preconditions.checkNotNull(s);
        if (s.matches(".*[0-9A-Za-z].*"))
        {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        s = String.valueOf(s).concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (flag && s.contains(" "))
        {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        } else
        {
            plusForSpace = flag;
            safeOctets = createSafeOctets(s);
            return;
        }
    }

    private static boolean[] createSafeOctets(String s)
    {
        int k = -1;
        s = s.toCharArray();
        int l = s.length;
        for (int i = 0; i < l; i++)
        {
            k = Math.max(s[i], k);
        }

        boolean aflag[] = new boolean[k + 1];
        k = s.length;
        for (int j = 0; j < k; j++)
        {
            aflag[s[j]] = true;
        }

        return aflag;
    }

    public String escape(String s)
    {
        Preconditions.checkNotNull(s);
        int j = s.length();
        int i = 0;
        do
        {
label0:
            {
                String s1 = s;
                if (i < j)
                {
                    char c = s.charAt(i);
                    if (c < safeOctets.length && safeOctets[c])
                    {
                        break label0;
                    }
                    s1 = escapeSlow(s, i);
                }
                return s1;
            }
            i++;
        } while (true);
    }

    protected char[] escape(int i)
    {
        if (i < safeOctets.length && safeOctets[i])
        {
            return null;
        }
        if (i == 32 && plusForSpace)
        {
            return PLUS_SIGN;
        }
        if (i <= 127)
        {
            char c = UPPER_HEX_DIGITS[i & 0xf];
            return (new char[] {
                '%', UPPER_HEX_DIGITS[i >>> 4], c
            });
        }
        if (i <= 2047)
        {
            char c1 = UPPER_HEX_DIGITS[i & 0xf];
            i >>>= 4;
            char c4 = UPPER_HEX_DIGITS[i & 3 | 8];
            i >>>= 2;
            char c7 = UPPER_HEX_DIGITS[i & 0xf];
            return (new char[] {
                '%', UPPER_HEX_DIGITS[i >>> 4 | 0xc], c7, '%', c4, c1
            });
        }
        if (i <= 65535)
        {
            char c2 = UPPER_HEX_DIGITS[i & 0xf];
            i >>>= 4;
            char c5 = UPPER_HEX_DIGITS[i & 3 | 8];
            i >>>= 2;
            char c8 = UPPER_HEX_DIGITS[i & 0xf];
            i >>>= 4;
            char c10 = UPPER_HEX_DIGITS[i & 3 | 8];
            return (new char[] {
                '%', 'E', UPPER_HEX_DIGITS[i >>> 2], '%', c10, c8, '%', c5, c2
            });
        }
        if (i <= 0x10ffff)
        {
            char c3 = UPPER_HEX_DIGITS[i & 0xf];
            i >>>= 4;
            char c6 = UPPER_HEX_DIGITS[i & 3 | 8];
            i >>>= 2;
            char c9 = UPPER_HEX_DIGITS[i & 0xf];
            i >>>= 4;
            char c11 = UPPER_HEX_DIGITS[i & 3 | 8];
            i >>>= 2;
            char c12 = UPPER_HEX_DIGITS[i & 0xf];
            i >>>= 4;
            char c13 = UPPER_HEX_DIGITS[i & 3 | 8];
            return (new char[] {
                '%', 'F', UPPER_HEX_DIGITS[i >>> 2 & 7], '%', c13, c12, '%', c11, c9, '%', 
                c6, c3
            });
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(43)).append("Invalid unicode character value ").append(i).toString());
        }
    }

    protected int nextEscapeIndex(CharSequence charsequence, int i, int j)
    {
        Preconditions.checkNotNull(charsequence);
        do
        {
label0:
            {
                if (i < j)
                {
                    char c = charsequence.charAt(i);
                    if (c < safeOctets.length && safeOctets[c])
                    {
                        break label0;
                    }
                }
                return i;
            }
            i++;
        } while (true);
    }

}
