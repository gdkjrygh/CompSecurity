// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gdata.util.common.base;

import java.io.IOException;

// Referenced classes of package com.google.gdata.util.common.base:
//            Escaper, Preconditions

public abstract class UnicodeEscaper
    implements Escaper
{

    private static final int DEST_PAD = 32;
    private static final ThreadLocal DEST_TL = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected char[] initialValue()
        {
            return new char[1024];
        }

    };

    public UnicodeEscaper()
    {
    }

    protected static final int codePointAt(CharSequence charsequence, int i, int j)
    {
        if (i < j)
        {
            int k = i + 1;
            char c = charsequence.charAt(i);
            if (c < '\uD800' || c > '\uDFFF')
            {
                return c;
            }
            if (c <= '\uDBFF')
            {
                if (k == j)
                {
                    return -c;
                }
                char c1 = charsequence.charAt(k);
                if (Character.isLowSurrogate(c1))
                {
                    return Character.toCodePoint(c, c1);
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Expected low surrogate but got char '").append(c1).append("' with value ").append(c1).append(" at index ").append(k).toString());
                }
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unexpected low surrogate character '").append(c).append("' with value ").append(c).append(" at index ").append(k - 1).toString());
            }
        } else
        {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
    }

    private static final char[] growBuffer(char ac[], int i, int j)
    {
        char ac1[] = new char[j];
        if (i > 0)
        {
            System.arraycopy(ac, 0, ac1, 0, i);
        }
        return ac1;
    }

    public Appendable escape(final Appendable out)
    {
        Preconditions.checkNotNull(out);
        return new Appendable() {

            char decodedChars[];
            int pendingHighSurrogate;
            final UnicodeEscaper this$0;
            final Appendable val$out;

            private void outputChars(char ac[], int i)
                throws IOException
            {
                for (int j = 0; j < i; j++)
                {
                    out.append(ac[j]);
                }

            }

            public Appendable append(char c)
                throws IOException
            {
                if (pendingHighSurrogate != -1)
                {
                    if (!Character.isLowSurrogate(c))
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Expected low surrogate character but got '").append(c).append("' with value ").append(c).toString());
                    }
                    char ac[] = escape(Character.toCodePoint((char)pendingHighSurrogate, c));
                    if (ac != null)
                    {
                        outputChars(ac, ac.length);
                    } else
                    {
                        out.append((char)pendingHighSurrogate);
                        out.append(c);
                    }
                    pendingHighSurrogate = -1;
                    return this;
                }
                if (Character.isHighSurrogate(c))
                {
                    pendingHighSurrogate = c;
                    return this;
                }
                if (Character.isLowSurrogate(c))
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Unexpected low surrogate character '").append(c).append("' with value ").append(c).toString());
                }
                char ac1[] = escape(c);
                if (ac1 != null)
                {
                    outputChars(ac1, ac1.length);
                    return this;
                } else
                {
                    out.append(c);
                    return this;
                }
            }

            public Appendable append(CharSequence charsequence)
                throws IOException
            {
                return append(charsequence, 0, charsequence.length());
            }

            public Appendable append(CharSequence charsequence, int i, int j)
                throws IOException
            {
                if (i >= j) goto _L2; else goto _L1
_L1:
                int k;
                int i1;
                int j1 = i;
                i1 = i;
                k = j1;
                if (pendingHighSurrogate != -1)
                {
                    char c = charsequence.charAt(i);
                    if (!Character.isLowSurrogate(c))
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Expected low surrogate character but got ").append(c).toString());
                    }
                    char ac[] = escape(Character.toCodePoint((char)pendingHighSurrogate, c));
                    if (ac != null)
                    {
                        outputChars(ac, ac.length);
                        k = j1 + 1;
                    } else
                    {
                        out.append((char)pendingHighSurrogate);
                        k = j1;
                    }
                    pendingHighSurrogate = -1;
                    i1 = i + 1;
                }
_L5:
                i1 = nextEscapeIndex(charsequence, i1, j);
                if (i1 > k)
                {
                    out.append(charsequence, k, i1);
                }
                if (i1 != j) goto _L3; else goto _L2
_L2:
                return this;
_L3:
                i = UnicodeEscaper.codePointAt(charsequence, i1, j);
                if (i < 0)
                {
                    pendingHighSurrogate = -i;
                    return this;
                }
                char ac1[] = escape(i);
                if (ac1 != null)
                {
                    outputChars(ac1, ac1.length);
                } else
                {
                    int l = Character.toChars(i, decodedChars, 0);
                    outputChars(decodedChars, l);
                }
                if (Character.isSupplementaryCodePoint(i))
                {
                    i = 2;
                } else
                {
                    i = 1;
                }
                i1 += i;
                k = i1;
                if (true) goto _L5; else goto _L4
_L4:
            }

            
            {
                this$0 = UnicodeEscaper.this;
                out = appendable;
                super();
                pendingHighSurrogate = -1;
                decodedChars = new char[2];
            }
        };
    }

    public String escape(String s)
    {
        int i = s.length();
        int j = nextEscapeIndex(s, 0, i);
        if (j == i)
        {
            return s;
        } else
        {
            return escapeSlow(s, j);
        }
    }

    protected abstract char[] escape(int i);

    protected final String escapeSlow(String s, int i)
    {
        int k1 = s.length();
        char ac[] = (char[])DEST_TL.get();
        int j = 0;
        int j1 = 0;
        int i1 = i;
        i = j;
        while (i1 < k1) 
        {
            int l1 = codePointAt(s, i1, k1);
            if (l1 < 0)
            {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char ac4[] = escape(l1);
            char ac3[] = ac;
            j = i;
            if (ac4 != null)
            {
                j = i1 - j1;
                int k = i + j + ac4.length;
                char ac1[] = ac;
                if (ac.length < k)
                {
                    ac1 = growBuffer(ac, i, (k1 - i1) + k + 32);
                }
                k = i;
                if (j > 0)
                {
                    s.getChars(j1, i1, ac1, i);
                    k = i + j;
                }
                ac3 = ac1;
                j = k;
                if (ac4.length > 0)
                {
                    System.arraycopy(ac4, 0, ac1, k, ac4.length);
                    j = k + ac4.length;
                    ac3 = ac1;
                }
            }
            if (Character.isSupplementaryCodePoint(l1))
            {
                i = 2;
            } else
            {
                i = 1;
            }
            j1 = i1 + i;
            i1 = nextEscapeIndex(s, j1, k1);
            ac = ac3;
            i = j;
        }
        int l = k1 - j1;
        char ac2[] = ac;
        j = i;
        if (l > 0)
        {
            j = i + l;
            ac2 = ac;
            if (ac.length < j)
            {
                ac2 = growBuffer(ac, i, j);
            }
            s.getChars(j1, k1, ac2, i);
        }
        return new String(ac2, 0, j);
    }

    protected int nextEscapeIndex(CharSequence charsequence, int i, int j)
    {
        do
        {
            int k;
label0:
            {
                if (i < j)
                {
                    k = codePointAt(charsequence, i, j);
                    if (k >= 0 && escape(k) == null)
                    {
                        break label0;
                    }
                }
                return i;
            }
            if (Character.isSupplementaryCodePoint(k))
            {
                k = 2;
            } else
            {
                k = 1;
            }
            i += k;
        } while (true);
    }

}
