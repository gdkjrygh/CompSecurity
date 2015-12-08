// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Preconditions

public final class Strings
{

    private Strings()
    {
    }

    public static String commonPrefix(CharSequence charsequence, CharSequence charsequence1)
    {
        int j;
label0:
        {
            Preconditions.checkNotNull(charsequence);
            Preconditions.checkNotNull(charsequence1);
            j = Math.min(charsequence.length(), charsequence1.length());
            int i;
            for (i = 0; i < j && charsequence.charAt(i) == charsequence1.charAt(i); i++) { }
            if (!validSurrogatePairAt(charsequence, i - 1))
            {
                j = i;
                if (!validSurrogatePairAt(charsequence1, i - 1))
                {
                    break label0;
                }
            }
            j = i - 1;
        }
        return charsequence.subSequence(0, j).toString();
    }

    public static String commonSuffix(CharSequence charsequence, CharSequence charsequence1)
    {
        int j;
label0:
        {
            Preconditions.checkNotNull(charsequence);
            Preconditions.checkNotNull(charsequence1);
            j = Math.min(charsequence.length(), charsequence1.length());
            int i;
            for (i = 0; i < j && charsequence.charAt(charsequence.length() - i - 1) == charsequence1.charAt(charsequence1.length() - i - 1); i++) { }
            if (!validSurrogatePairAt(charsequence, charsequence.length() - i - 1))
            {
                j = i;
                if (!validSurrogatePairAt(charsequence1, charsequence1.length() - i - 1))
                {
                    break label0;
                }
            }
            j = i - 1;
        }
        return charsequence.subSequence(charsequence.length() - j, charsequence.length()).toString();
    }

    public static String emptyToNull(String s)
    {
        String s1 = s;
        if (isNullOrEmpty(s))
        {
            s1 = null;
        }
        return s1;
    }

    public static boolean isNullOrEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    public static String nullToEmpty(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        return s1;
    }

    public static String padEnd(String s, int i, char c)
    {
        Preconditions.checkNotNull(s);
        if (s.length() >= i)
        {
            return s;
        }
        StringBuilder stringbuilder = new StringBuilder(i);
        stringbuilder.append(s);
        for (int j = s.length(); j < i; j++)
        {
            stringbuilder.append(c);
        }

        return stringbuilder.toString();
    }

    public static String padStart(String s, int i, char c)
    {
        Preconditions.checkNotNull(s);
        if (s.length() >= i)
        {
            return s;
        }
        StringBuilder stringbuilder = new StringBuilder(i);
        for (int j = s.length(); j < i; j++)
        {
            stringbuilder.append(c);
        }

        stringbuilder.append(s);
        return stringbuilder.toString();
    }

    public static String repeat(String s, int i)
    {
        Preconditions.checkNotNull(s);
        if (i <= 1)
        {
            boolean flag;
            if (i >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "invalid count: %s", new Object[] {
                Integer.valueOf(i)
            });
            if (i == 0)
            {
                s = "";
            }
            return s;
        }
        int j = s.length();
        long l = (long)j * (long)i;
        int k = (int)l;
        if ((long)k != l)
        {
            throw new ArrayIndexOutOfBoundsException((new StringBuilder(51)).append("Required array size too large: ").append(l).toString());
        }
        char ac[] = new char[k];
        s.getChars(0, j, ac, 0);
        for (i = j; i < k - i; i <<= 1)
        {
            System.arraycopy(ac, 0, ac, i, i);
        }

        System.arraycopy(ac, 0, ac, i, k - i);
        return new String(ac);
    }

    static boolean validSurrogatePairAt(CharSequence charsequence, int i)
    {
        return i >= 0 && i <= charsequence.length() - 2 && Character.isHighSurrogate(charsequence.charAt(i)) && Character.isLowSurrogate(charsequence.charAt(i + 1));
    }
}
