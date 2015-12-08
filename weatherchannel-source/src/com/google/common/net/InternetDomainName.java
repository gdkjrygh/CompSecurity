// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.net;

import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.thirdparty.publicsuffix.PublicSuffixPatterns;
import java.util.List;

public final class InternetDomainName
{

    private static final CharMatcher DASH_MATCHER;
    private static final CharMatcher DOTS_MATCHER = CharMatcher.anyOf(".\u3002\uFF0E\uFF61");
    private static final Joiner DOT_JOINER = Joiner.on('.');
    private static final String DOT_REGEX = "\\.";
    private static final Splitter DOT_SPLITTER = Splitter.on('.');
    private static final int MAX_DOMAIN_PART_LENGTH = 63;
    private static final int MAX_LENGTH = 253;
    private static final int MAX_PARTS = 127;
    private static final int NO_PUBLIC_SUFFIX_FOUND = -1;
    private static final CharMatcher PART_CHAR_MATCHER;
    private final String name;
    private final ImmutableList parts;
    private final int publicSuffixIndex = findPublicSuffix();

    InternetDomainName(String s)
    {
        String s1 = Ascii.toLowerCase(DOTS_MATCHER.replaceFrom(s, '.'));
        s = s1;
        if (s1.endsWith("."))
        {
            s = s1.substring(0, s1.length() - 1);
        }
        boolean flag;
        if (s.length() <= 253)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Domain name too long: '%s':", new Object[] {
            s
        });
        name = s;
        parts = ImmutableList.copyOf(DOT_SPLITTER.split(s));
        if (parts.size() <= 127)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Domain has too many parts: '%s'", new Object[] {
            s
        });
        Preconditions.checkArgument(validateSyntax(parts), "Not a valid domain name: '%s'", new Object[] {
            s
        });
    }

    private InternetDomainName ancestor(int i)
    {
        return from(DOT_JOINER.join(parts.subList(i, parts.size())));
    }

    private int findPublicSuffix()
    {
        int i;
        int j;
        j = parts.size();
        i = 0;
_L5:
        String s;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = DOT_JOINER.join(parts.subList(i, j));
        if (!PublicSuffixPatterns.EXACT.containsKey(s)) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        if (PublicSuffixPatterns.EXCLUDED.containsKey(s))
        {
            return i + 1;
        }
        if (matchesWildcardPublicSuffix(s)) goto _L1; else goto _L3
_L3:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        return -1;
    }

    public static InternetDomainName from(String s)
    {
        return new InternetDomainName((String)Preconditions.checkNotNull(s));
    }

    public static boolean isValid(String s)
    {
        try
        {
            from(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    private static boolean matchesWildcardPublicSuffix(String s)
    {
        s = s.split("\\.", 2);
        return s.length == 2 && PublicSuffixPatterns.UNDER.containsKey(s[1]);
    }

    private static boolean validatePart(String s, boolean flag)
    {
        String s1;
        if (s.length() >= 1 && s.length() <= 63)
        {
            if (PART_CHAR_MATCHER.matchesAllOf(s1 = CharMatcher.ASCII.retainFrom(s)) && !DASH_MATCHER.matches(s.charAt(0)) && !DASH_MATCHER.matches(s.charAt(s.length() - 1)) && (!flag || !CharMatcher.DIGIT.matches(s.charAt(0))))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean validateSyntax(List list)
    {
        int j = list.size() - 1;
        if (!validatePart((String)list.get(j), true))
        {
            return false;
        }
        for (int i = 0; i < j; i++)
        {
            if (!validatePart((String)list.get(i), false))
            {
                return false;
            }
        }

        return true;
    }

    public InternetDomainName child(String s)
    {
        s = String.valueOf(String.valueOf((String)Preconditions.checkNotNull(s)));
        String s1 = String.valueOf(String.valueOf(name));
        return from((new StringBuilder(s.length() + 1 + s1.length())).append(s).append(".").append(s1).toString());
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof InternetDomainName)
        {
            obj = (InternetDomainName)obj;
            return name.equals(((InternetDomainName) (obj)).name);
        } else
        {
            return false;
        }
    }

    public boolean hasParent()
    {
        return parts.size() > 1;
    }

    public boolean hasPublicSuffix()
    {
        return publicSuffixIndex != -1;
    }

    public int hashCode()
    {
        return name.hashCode();
    }

    public boolean isPublicSuffix()
    {
        return publicSuffixIndex == 0;
    }

    public boolean isTopPrivateDomain()
    {
        return publicSuffixIndex == 1;
    }

    public boolean isUnderPublicSuffix()
    {
        return publicSuffixIndex > 0;
    }

    public InternetDomainName parent()
    {
        Preconditions.checkState(hasParent(), "Domain '%s' has no parent", new Object[] {
            name
        });
        return ancestor(1);
    }

    public ImmutableList parts()
    {
        return parts;
    }

    public InternetDomainName publicSuffix()
    {
        if (hasPublicSuffix())
        {
            return ancestor(publicSuffixIndex);
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return name;
    }

    public InternetDomainName topPrivateDomain()
    {
        if (isTopPrivateDomain())
        {
            return this;
        } else
        {
            Preconditions.checkState(isUnderPublicSuffix(), "Not under a public suffix: %s", new Object[] {
                name
            });
            return ancestor(publicSuffixIndex - 1);
        }
    }

    static 
    {
        DASH_MATCHER = CharMatcher.anyOf("-_");
        PART_CHAR_MATCHER = CharMatcher.JAVA_LETTER_OR_DIGIT.or(DASH_MATCHER);
    }
}
