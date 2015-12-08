// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            CharMatcher, Ascii, Preconditions, Converter

public abstract class CaseFormat extends Enum
{
    private static final class StringConverter extends Converter
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final CaseFormat sourceFormat;
        private final CaseFormat targetFormat;

        protected volatile Object doBackward(Object obj)
        {
            return doBackward((String)obj);
        }

        protected String doBackward(String s)
        {
            if (s == null)
            {
                return null;
            } else
            {
                return targetFormat.to(sourceFormat, s);
            }
        }

        protected volatile Object doForward(Object obj)
        {
            return doForward((String)obj);
        }

        protected String doForward(String s)
        {
            if (s == null)
            {
                return null;
            } else
            {
                return sourceFormat.to(targetFormat, s);
            }
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof StringConverter)
            {
                obj = (StringConverter)obj;
                flag = flag1;
                if (sourceFormat.equals(((StringConverter) (obj)).sourceFormat))
                {
                    flag = flag1;
                    if (targetFormat.equals(((StringConverter) (obj)).targetFormat))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return sourceFormat.hashCode() ^ targetFormat.hashCode();
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(sourceFormat));
            String s1 = String.valueOf(String.valueOf(targetFormat));
            return (new StringBuilder(s.length() + 14 + s1.length())).append(s).append(".converterTo(").append(s1).append(")").toString();
        }

        StringConverter(CaseFormat caseformat, CaseFormat caseformat1)
        {
            sourceFormat = (CaseFormat)Preconditions.checkNotNull(caseformat);
            targetFormat = (CaseFormat)Preconditions.checkNotNull(caseformat1);
        }
    }


    private static final CaseFormat $VALUES[];
    public static final CaseFormat LOWER_CAMEL;
    public static final CaseFormat LOWER_HYPHEN;
    public static final CaseFormat LOWER_UNDERSCORE;
    public static final CaseFormat UPPER_CAMEL;
    public static final CaseFormat UPPER_UNDERSCORE;
    private final CharMatcher wordBoundary;
    private final String wordSeparator;

    private CaseFormat(String s, int i, CharMatcher charmatcher, String s1)
    {
        super(s, i);
        wordBoundary = charmatcher;
        wordSeparator = s1;
    }


    private static String firstCharOnlyToUpper(String s)
    {
        if (s.isEmpty())
        {
            return s;
        } else
        {
            return (new StringBuilder(s.length())).append(Ascii.toUpperCase(s.charAt(0))).append(Ascii.toLowerCase(s.substring(1))).toString();
        }
    }

    private String normalizeFirstWord(String s)
    {
        if (this == LOWER_CAMEL)
        {
            return Ascii.toLowerCase(s);
        } else
        {
            return normalizeWord(s);
        }
    }

    public static CaseFormat valueOf(String s)
    {
        return (CaseFormat)Enum.valueOf(com/google/common/base/CaseFormat, s);
    }

    public static CaseFormat[] values()
    {
        return (CaseFormat[])$VALUES.clone();
    }

    String convert(CaseFormat caseformat, String s)
    {
        StringBuilder stringbuilder = null;
        int i = 0;
        int j = -1;
        do
        {
            j = wordBoundary.indexIn(s, j + 1);
            if (j == -1)
            {
                break;
            }
            if (i == 0)
            {
                stringbuilder = new StringBuilder(s.length() + wordSeparator.length() * 4);
                stringbuilder.append(caseformat.normalizeFirstWord(s.substring(i, j)));
            } else
            {
                stringbuilder.append(caseformat.normalizeWord(s.substring(i, j)));
            }
            stringbuilder.append(caseformat.wordSeparator);
            i = j + wordSeparator.length();
        } while (true);
        if (i == 0)
        {
            return caseformat.normalizeFirstWord(s);
        } else
        {
            return stringbuilder.append(caseformat.normalizeWord(s.substring(i))).toString();
        }
    }

    public Converter converterTo(CaseFormat caseformat)
    {
        return new StringConverter(this, caseformat);
    }

    abstract String normalizeWord(String s);

    public final String to(CaseFormat caseformat, String s)
    {
        Preconditions.checkNotNull(caseformat);
        Preconditions.checkNotNull(s);
        if (caseformat == this)
        {
            return s;
        } else
        {
            return convert(caseformat, s);
        }
    }

    static 
    {
        LOWER_HYPHEN = new CaseFormat("LOWER_HYPHEN", 0, CharMatcher.is('-'), "-") {

            String convert(CaseFormat caseformat, String s)
            {
                if (caseformat == LOWER_UNDERSCORE)
                {
                    return s.replace('-', '_');
                }
                if (caseformat == UPPER_UNDERSCORE)
                {
                    return Ascii.toUpperCase(s.replace('-', '_'));
                } else
                {
                    return convert(caseformat, s);
                }
            }

            String normalizeWord(String s)
            {
                return Ascii.toLowerCase(s);
            }

        };
        LOWER_UNDERSCORE = new CaseFormat("LOWER_UNDERSCORE", 1, CharMatcher.is('_'), "_") {

            String convert(CaseFormat caseformat, String s)
            {
                if (caseformat == LOWER_HYPHEN)
                {
                    return s.replace('_', '-');
                }
                if (caseformat == UPPER_UNDERSCORE)
                {
                    return Ascii.toUpperCase(s);
                } else
                {
                    return convert(caseformat, s);
                }
            }

            String normalizeWord(String s)
            {
                return Ascii.toLowerCase(s);
            }

        };
        LOWER_CAMEL = new CaseFormat("LOWER_CAMEL", 2, CharMatcher.inRange('A', 'Z'), "") {

            String normalizeWord(String s)
            {
                return CaseFormat.firstCharOnlyToUpper(s);
            }

        };
        UPPER_CAMEL = new CaseFormat("UPPER_CAMEL", 3, CharMatcher.inRange('A', 'Z'), "") {

            String normalizeWord(String s)
            {
                return CaseFormat.firstCharOnlyToUpper(s);
            }

        };
        UPPER_UNDERSCORE = new CaseFormat("UPPER_UNDERSCORE", 4, CharMatcher.is('_'), "_") {

            String convert(CaseFormat caseformat, String s)
            {
                if (caseformat == LOWER_HYPHEN)
                {
                    return Ascii.toLowerCase(s.replace('_', '-'));
                }
                if (caseformat == LOWER_UNDERSCORE)
                {
                    return Ascii.toLowerCase(s);
                } else
                {
                    return convert(caseformat, s);
                }
            }

            String normalizeWord(String s)
            {
                return Ascii.toUpperCase(s);
            }

        };
        $VALUES = (new CaseFormat[] {
            LOWER_HYPHEN, LOWER_UNDERSCORE, LOWER_CAMEL, UPPER_CAMEL, UPPER_UNDERSCORE
        });
    }

}
