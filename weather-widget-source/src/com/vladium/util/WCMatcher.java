// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;


public abstract class WCMatcher
{
    private static final class AllMatcher extends WCMatcher
    {

        public final boolean matches(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("null input: s");
            } else
            {
                return true;
            }
        }

        public final boolean matches(char ac[])
        {
            if (ac == null)
            {
                throw new IllegalArgumentException("null input: chars");
            } else
            {
                return true;
            }
        }

        private AllMatcher()
        {
        }

    }

    private static final class EmptyMatcher extends WCMatcher
    {

        public final boolean matches(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("null input: s");
            } else
            {
                return false;
            }
        }

        public final boolean matches(char ac[])
        {
            if (ac == null)
            {
                throw new IllegalArgumentException("null input: chars");
            }
            return ac.length == 0;
        }

        private EmptyMatcher()
        {
        }

    }

    private static final class EndsWithMatcher extends WCMatcher
    {

        private final String m_suffix;
        private final char m_suffixChars[];

        public final boolean matches(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("null input: s");
            } else
            {
                return s.endsWith(m_suffix);
            }
        }

        public final boolean matches(char ac[])
        {
            char ac1[];
            int j;
            int k;
            if (ac == null)
            {
                throw new IllegalArgumentException("null input: chars");
            }
            ac1 = m_suffixChars;
            j = ac1.length - 1;
            k = ac.length;
            if (k >= j) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    if (ac[k - 1 - i] != ac1[j - i])
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
            if (true) goto _L1; else goto _L3
_L3:
            return true;
        }

        EndsWithMatcher(char ac[], int i)
        {
            m_suffixChars = ac;
            m_suffix = new String(ac, 1, i - 1);
        }
    }

    private static final class PatternMatcher extends WCMatcher
    {

        private final char m_pattern[];
        private final int m_patternLength;

        public final boolean matches(String s)
        {
            char ac[];
            int i;
            int j;
            boolean flag;
            int l;
            int i1;
            if (s == null)
            {
                throw new IllegalArgumentException("null input: s");
            }
            s = s.toCharArray();
            l = s.length;
            ac = m_pattern;
            i1 = m_patternLength;
            i = 0;
            j = 0;
            flag = false;
_L9:
            int k = 0;
_L5:
            if (j + k >= i1) goto _L2; else goto _L1
_L1:
            char c;
            int j1;
            c = ac[j + k];
            if (c == '*')
            {
                i += k;
                j += k + 1;
                flag = true;
                continue; /* Loop/switch isn't completed */
            }
            j1 = i + k;
            if (j1 != l) goto _L4; else goto _L3
_L3:
            return false;
_L4:
            if (c != s[j1] && c != '?')
            {
                continue; /* Loop/switch isn't completed */
            }
            k++;
              goto _L5
            if (!flag) goto _L3; else goto _L6
_L6:
            i++;
            continue; /* Loop/switch isn't completed */
_L2:
            if (i + k == l)
            {
                return true;
            }
            if (!flag) goto _L3; else goto _L7
_L7:
            i++;
            if (true) goto _L9; else goto _L8
_L8:
        }

        public final boolean matches(char ac[])
        {
            char ac1[];
            int i;
            int j;
            boolean flag;
            int l;
            int i1;
            if (ac == null)
            {
                throw new IllegalArgumentException("null input: string");
            }
            l = ac.length;
            ac1 = m_pattern;
            i1 = m_patternLength;
            i = 0;
            j = 0;
            flag = false;
_L9:
            int k = 0;
_L5:
            if (j + k >= i1) goto _L2; else goto _L1
_L1:
            char c;
            int j1;
            c = ac1[j + k];
            if (c == '*')
            {
                i += k;
                j += k + 1;
                flag = true;
                continue; /* Loop/switch isn't completed */
            }
            j1 = i + k;
            if (j1 != l) goto _L4; else goto _L3
_L3:
            return false;
_L4:
            if (c != ac[j1] && c != '?')
            {
                continue; /* Loop/switch isn't completed */
            }
            k++;
              goto _L5
            if (!flag) goto _L3; else goto _L6
_L6:
            i++;
            continue; /* Loop/switch isn't completed */
_L2:
            if (i + k == l)
            {
                return true;
            }
            if (!flag) goto _L3; else goto _L7
_L7:
            i++;
            if (true) goto _L9; else goto _L8
_L8:
        }

        PatternMatcher(char ac[], int i)
        {
            m_pattern = ac;
            m_patternLength = i;
        }
    }

    private static final class StartsWithMatcher extends WCMatcher
    {

        private final String m_prefix;
        private final char m_prefixChars[];

        public final boolean matches(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("null input: s");
            } else
            {
                return s.startsWith(m_prefix);
            }
        }

        public final boolean matches(char ac[])
        {
            char ac1[];
            int j;
            if (ac == null)
            {
                throw new IllegalArgumentException("null input: chars");
            }
            ac1 = m_prefixChars;
            j = ac1.length - 1;
            if (ac.length >= j) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    if (ac[i] != ac1[i])
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
            if (true) goto _L1; else goto _L3
_L3:
            return true;
        }

        StartsWithMatcher(char ac[], int i)
        {
            m_prefixChars = ac;
            m_prefix = new String(ac, 0, i - 1);
        }
    }


    private static final WCMatcher ALL_MATCHER = new AllMatcher();
    private static final WCMatcher EMPTY_MATCHER = new EmptyMatcher();

    WCMatcher()
    {
    }

    public static WCMatcher compile(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null input: pattern");
        }
        s = s.toCharArray();
        int k1 = s.length;
        if (k1 == 0)
        {
            return EMPTY_MATCHER;
        }
        int i1 = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int i = 0;
        while (l < k1) 
        {
            char c = s[l];
            if (c == '*')
            {
                if (k == 0)
                {
                    k = 1;
                    i1++;
                    int j1 = i + 1;
                    s[i] = '*';
                    i = j1;
                }
            } else
            {
                boolean flag = false;
                k = j;
                if (c == '?')
                {
                    k = j + 1;
                }
                j = i + 1;
                s[i] = c;
                i = j;
                j = k;
                k = ((flag) ? 1 : 0);
            }
            l++;
        }
        if (i1 == 1 && j == 0)
        {
            if (i == 1)
            {
                return ALL_MATCHER;
            }
            if (s[0] == '*')
            {
                return new EndsWithMatcher(s, i);
            }
            if (s[i - 1] == '*')
            {
                return new StartsWithMatcher(s, i);
            }
        }
        return new PatternMatcher(s, i);
    }

    public abstract boolean matches(String s);

    public abstract boolean matches(char ac[]);

}
