// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.a;

import java.util.Arrays;

// Referenced classes of package com.google.c.a:
//            e, d

public abstract class com.google.c.a.a
    implements e
{
    static abstract class a extends com.google.c.a.a
    {

        public volatile boolean a(Object obj)
        {
            return a((Character)obj);
        }

        a(String s)
        {
            super(s);
        }
    }

    private static class b extends com.google.c.a.a
    {

        final com.google.c.a.a q;
        final com.google.c.a.a r;

        com.google.c.a.a a(String s)
        {
            return new b(q, r, s);
        }

        public boolean a(char c1)
        {
            return q.a(c1) || r.a(c1);
        }

        public volatile boolean a(Object obj)
        {
            return a((Character)obj);
        }

        b(com.google.c.a.a a1, com.google.c.a.a a2)
        {
            this(a1, a2, (new StringBuilder()).append("CharMatcher.or(").append(a1).append(", ").append(a2).append(")").toString());
        }

        b(com.google.c.a.a a1, com.google.c.a.a a2, String s)
        {
            super(s);
            q = (com.google.c.a.a)com.google.c.a.d.a(a1);
            r = (com.google.c.a.a)com.google.c.a.d.a(a2);
        }
    }

    private static class c extends com.google.c.a.a
    {

        private final char q[];
        private final char r[];

        public boolean a(char c1)
        {
            int i1 = Arrays.binarySearch(q, c1);
            if (i1 < 0)
            {
                if ((i1 = ~i1 - 1) < 0 || c1 > r[i1])
                {
                    return false;
                }
            }
            return true;
        }

        public volatile boolean a(Object obj)
        {
            return a((Character)obj);
        }

        c(String s, char ac[], char ac1[])
        {
            super(s);
            q = ac;
            r = ac1;
            int i1;
            boolean flag;
            if (ac.length == ac1.length)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.c.a.d.a(flag);
            i1 = 0;
            while (i1 < ac.length) 
            {
                if (ac[i1] <= ac1[i1])
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.c.a.d.a(flag);
                if (i1 + 1 < ac.length)
                {
                    if (ac1[i1] < ac[i1 + 1])
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    com.google.c.a.d.a(flag);
                }
                i1++;
            }
        }
    }


    public static final com.google.c.a.a a = new com.google.c.a.a() {

        public boolean a(char c1)
        {
            switch (c1)
            {
            default:
                if (c1 < '\u2000' || c1 > '\u200A')
                {
                    break;
                }
                // fall through

            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 32: // ' '
            case 133: 
            case 5760: 
            case 8232: 
            case 8233: 
            case 8287: 
            case 12288: 
                return true;

            case 8199: 
                return false;
            }
            return false;
        }

        public volatile boolean a(Object obj)
        {
            return a((Character)obj);
        }

        public String toString()
        {
            return "CharMatcher.BREAKING_WHITESPACE";
        }

    };
    public static final com.google.c.a.a b = a('\0', '\177', "CharMatcher.ASCII");
    public static final com.google.c.a.a c;
    public static final com.google.c.a.a d = new com.google.c.a.a("CharMatcher.JAVA_DIGIT") {

        public boolean a(char c1)
        {
            return Character.isDigit(c1);
        }

        public volatile boolean a(Object obj)
        {
            return a((Character)obj);
        }

    };
    public static final com.google.c.a.a e = new com.google.c.a.a("CharMatcher.JAVA_LETTER") {

        public boolean a(char c1)
        {
            return Character.isLetter(c1);
        }

        public volatile boolean a(Object obj)
        {
            return a((Character)obj);
        }

    };
    public static final com.google.c.a.a f = new com.google.c.a.a("CharMatcher.JAVA_LETTER_OR_DIGIT") {

        public boolean a(char c1)
        {
            return Character.isLetterOrDigit(c1);
        }

        public volatile boolean a(Object obj)
        {
            return a((Character)obj);
        }

    };
    public static final com.google.c.a.a g = new com.google.c.a.a("CharMatcher.JAVA_UPPER_CASE") {

        public boolean a(char c1)
        {
            return Character.isUpperCase(c1);
        }

        public volatile boolean a(Object obj)
        {
            return a((Character)obj);
        }

    };
    public static final com.google.c.a.a h = new com.google.c.a.a("CharMatcher.JAVA_LOWER_CASE") {

        public boolean a(char c1)
        {
            return Character.isLowerCase(c1);
        }

        public volatile boolean a(Object obj)
        {
            return a((Character)obj);
        }

    };
    public static final com.google.c.a.a i = a('\0', '\037').a(a('\177', '\237')).a("CharMatcher.JAVA_ISO_CONTROL");
    public static final com.google.c.a.a j = new c("CharMatcher.INVISIBLE", "\000\177\255\u0600\u061C\u06DD\u070F\u1680\u180E\u2000\u2028\u205F\u2066\u2067\u2068\u2069\u206A\u3000\uD800\uFEFF\uFFF9\uFFFA".toCharArray(), " \240\255\u0604\u061C\u06DD\u070F\u1680\u180E\u200F\u202F\u2064\u2066\u2067\u2068\u2069\u206F\u3000\uF8FF\uFEFF\uFFF9\uFFFB".toCharArray());
    public static final com.google.c.a.a k = new c("CharMatcher.SINGLE_WIDTH", "\000\u05BE\u05D0\u05F3\u0600\u0750\u0E00\u1E00\u2100\uFB50\uFE70\uFF61".toCharArray(), "\u04F9\u05BE\u05EA\u05F4\u06FF\u077F\u0E7F\u20AF\u213A\uFDFF\uFEFF\uFFDC".toCharArray());
    public static final com.google.c.a.a l = new a("CharMatcher.ANY") {

        public com.google.c.a.a a(com.google.c.a.a a1)
        {
            com.google.c.a.d.a(a1);
            return this;
        }

        public boolean a(char c1)
        {
            return true;
        }

        public boolean a(CharSequence charsequence)
        {
            com.google.c.a.d.a(charsequence);
            return true;
        }

    };
    public static final com.google.c.a.a m = new a("CharMatcher.NONE") {

        public com.google.c.a.a a(com.google.c.a.a a1)
        {
            return (com.google.c.a.a)com.google.c.a.d.a(a1);
        }

        public boolean a(char c1)
        {
            return false;
        }

        public boolean a(CharSequence charsequence)
        {
            return charsequence.length() == 0;
        }

    };
    static final int o = Integer.numberOfLeadingZeros("\u2002\u3000\r\205\u200A\u2005\u2000\u3000\u2029\013\u3000\u2008\u2003\u205F\u3000\u1680\t \u2006\u2001\u202F\240\f\u2009\u3000\u2004\u3000\u3000\u2028\n\u2007\u3000".length() - 1);
    public static final com.google.c.a.a p = new a("WHITESPACE") {

        public boolean a(char c1)
        {
            return "\u2002\u3000\r\205\u200A\u2005\u2000\u3000\u2029\013\u3000\u2008\u2003\u205F\u3000\u1680\t \u2006\u2001\u202F\240\f\u2009\u3000\u2004\u3000\u3000\u2028\n\u2007\u3000".charAt(0x6449bf0a * c1 >>> o) == c1;
        }

    };
    private static final String q;
    final String n;

    protected com.google.c.a.a()
    {
        n = super.toString();
    }

    com.google.c.a.a(String s)
    {
        n = s;
    }

    public static com.google.c.a.a a(char c1, char c2)
    {
        boolean flag;
        if (c2 >= c1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.c.a.d.a(flag);
        return a(c1, c2, (new StringBuilder()).append("CharMatcher.inRange('").append(b(c1)).append("', '").append(b(c2)).append("')").toString());
    }

    static com.google.c.a.a a(char c1, char c2, String s)
    {
        return new a(s, c1, c2) {

            final char q;
            final char r;

            public boolean a(char c3)
            {
                return q <= c3 && c3 <= r;
            }

            
            {
                q = c1;
                r = c2;
                super(s);
            }
        };
    }

    private static String b(char c1)
    {
        char ac[] = new char[6];
        char[] _tmp = ac;
        ac[0] = '\\';
        ac[1] = 'u';
        ac[2] = '\0';
        ac[3] = '\0';
        ac[4] = '\0';
        ac[5] = '\0';
        boolean flag = false;
        char c2 = c1;
        for (c1 = flag; c1 < '\004'; c1++)
        {
            ac[5 - c1] = "0123456789ABCDEF".charAt(c2 & 0xf);
            c2 >>= '\004';
        }

        return String.copyValueOf(ac);
    }

    public com.google.c.a.a a(com.google.c.a.a a1)
    {
        return new b(this, (com.google.c.a.a)com.google.c.a.d.a(a1));
    }

    com.google.c.a.a a(String s)
    {
        throw new UnsupportedOperationException();
    }

    public abstract boolean a(char c1);

    public boolean a(CharSequence charsequence)
    {
        for (int i1 = charsequence.length() - 1; i1 >= 0; i1--)
        {
            if (!a(charsequence.charAt(i1)))
            {
                return false;
            }
        }

        return true;
    }

    public boolean a(Character character)
    {
        return a(character.charValue());
    }

    public volatile boolean a(Object obj)
    {
        return a((Character)obj);
    }

    public String toString()
    {
        return n;
    }

    static 
    {
        StringBuilder stringbuilder = new StringBuilder("0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".length());
        for (int i1 = 0; i1 < "0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".length(); i1++)
        {
            stringbuilder.append((char)("0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".charAt(i1) + 9));
        }

        q = stringbuilder.toString();
        c = new c("CharMatcher.DIGIT", "0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".toCharArray(), q.toCharArray());
    }
}
