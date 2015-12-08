// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.escape;

import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.common.escape:
//            UnicodeEscaper, CharEscaper, Escaper, ArrayBasedCharEscaper

public final class Escapers
{
    public static final class Builder
    {

        private final Map replacementMap;
        private char safeMax;
        private char safeMin;
        private String unsafeReplacement;

        public Builder addEscape(char c, String s)
        {
            Preconditions.checkNotNull(s);
            replacementMap.put(Character.valueOf(c), s);
            return this;
        }

        public Escaper build()
        {
            return new ArrayBasedCharEscaper(replacementMap, safeMin, safeMax) {

                private final char replacementChars[];
                final Builder this$0;

                protected char[] escapeUnsafe(char c)
                {
                    return replacementChars;
                }

            
            {
                this$0 = Builder.this;
                super(map, c, c1);
                if (unsafeReplacement != null)
                {
                    builder1 = unsafeReplacement.toCharArray();
                } else
                {
                    builder1 = null;
                }
                replacementChars = Builder.this;
            }
            };
        }

        public Builder setSafeRange(char c, char c1)
        {
            safeMin = c;
            safeMax = c1;
            return this;
        }

        public Builder setUnsafeReplacement(String s)
        {
            unsafeReplacement = s;
            return this;
        }


        private Builder()
        {
            replacementMap = new HashMap();
            safeMin = '\0';
            safeMax = '\uFFFF';
            unsafeReplacement = null;
        }

    }


    private static final Escaper NULL_ESCAPER = new CharEscaper() {

        public String escape(String s)
        {
            return (String)Preconditions.checkNotNull(s);
        }

        protected char[] escape(char c)
        {
            return null;
        }

    };

    private Escapers()
    {
    }

    static UnicodeEscaper asUnicodeEscaper(Escaper escaper)
    {
        Preconditions.checkNotNull(escaper);
        if (escaper instanceof UnicodeEscaper)
        {
            return (UnicodeEscaper)escaper;
        }
        if (escaper instanceof CharEscaper)
        {
            return wrap((CharEscaper)escaper);
        }
        escaper = String.valueOf(escaper.getClass().getName());
        if (escaper.length() != 0)
        {
            escaper = "Cannot create a UnicodeEscaper from: ".concat(escaper);
        } else
        {
            escaper = new String("Cannot create a UnicodeEscaper from: ");
        }
        throw new IllegalArgumentException(escaper);
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static String computeReplacement(CharEscaper charescaper, char c)
    {
        return stringOrNull(charescaper.escape(c));
    }

    public static String computeReplacement(UnicodeEscaper unicodeescaper, int i)
    {
        return stringOrNull(unicodeescaper.escape(i));
    }

    public static Escaper nullEscaper()
    {
        return NULL_ESCAPER;
    }

    private static String stringOrNull(char ac[])
    {
        if (ac == null)
        {
            return null;
        } else
        {
            return new String(ac);
        }
    }

    private static UnicodeEscaper wrap(CharEscaper charescaper)
    {
        return new UnicodeEscaper(charescaper) {

            final CharEscaper val$escaper;

            protected char[] escape(int i)
            {
                if (i >= 0x10000) goto _L2; else goto _L1
_L1:
                char ac[] = escaper.escape((char)i);
_L4:
                return ac;
_L2:
                char ac1[];
label0:
                {
                    ac = new char[2];
                    Character.toChars(i, ac, 0);
                    char ac3[] = escaper.escape(ac[0]);
                    char ac2[] = escaper.escape(ac[1]);
                    if (ac3 == null && ac2 == null)
                    {
                        return null;
                    }
                    int j;
                    if (ac3 != null)
                    {
                        i = ac3.length;
                    } else
                    {
                        i = 1;
                    }
                    if (ac2 != null)
                    {
                        j = ac2.length;
                    } else
                    {
                        j = 1;
                    }
                    ac1 = new char[i + j];
                    if (ac3 != null)
                    {
                        for (j = 0; j < ac3.length; j++)
                        {
                            ac1[j] = ac3[j];
                        }

                    } else
                    {
                        ac1[0] = ac[0];
                    }
                    if (ac2 == null)
                    {
                        break label0;
                    }
                    j = 0;
                    do
                    {
                        ac = ac1;
                        if (j >= ac2.length)
                        {
                            break;
                        }
                        ac1[i + j] = ac2[j];
                        j++;
                    } while (true);
                }
                if (true) goto _L4; else goto _L3
_L3:
                ac1[i] = ac[1];
                return ac1;
            }

            
            {
                escaper = charescaper;
                super();
            }
        };
    }

}
