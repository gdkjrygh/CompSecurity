// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.parsing;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.weather.util.parsing:
//            ValidationException, TwcPatterns

public final class Validation
{

    private Validation()
    {
    }

    public static Object validateClass(Class class1, String s, Object obj)
        throws ValidationException
    {
        validateNotNull(s, obj);
        if (!class1.isInstance(obj))
        {
            throw new ValidationException(String.format("%s was wrong type, expected %s got %s, field=%s", new Object[] {
                s, class1.getSimpleName(), obj.getClass().getSimpleName(), obj
            }));
        } else
        {
            return obj;
        }
    }

    public static boolean validateFalse(String s, boolean flag)
        throws ValidationException
    {
        if (flag)
        {
            throw new ValidationException(String.format("expected false, was true. fieldName=%s", new Object[] {
                s
            }));
        } else
        {
            return false;
        }
    }

    public static String validateGoodIri(String s, String s1)
        throws ValidationException
    {
        validateNotNull(s, s1);
        if (!TwcPatterns.GOOD_IRI_PATTERN.matcher(s1).matches())
        {
            throw new ValidationException(String.format("invalid character. fieldName=%s, url=%s", new Object[] {
                s, s1
            }));
        } else
        {
            return s1;
        }
    }

    public static double validateInRange(String s, double d, double d1, double d2)
        throws ValidationException
    {
        if (d < d1 || d > d2)
        {
            throw new ValidationException(String.format(Locale.US, "%s was outside of expected range.  minimum=%f, maximum=%f, value=%f", new Object[] {
                s, Double.valueOf(d1), Double.valueOf(d2), Double.valueOf(d)
            }));
        } else
        {
            return d;
        }
    }

    public static int validateInRange(String s, int i, int j, int k)
        throws ValidationException
    {
        if (i < j || i > k)
        {
            throw new ValidationException(String.format(Locale.US, "%s was outside of expected range.  minimum=%d, maximum=%d, value=%d", new Object[] {
                s, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i)
            }));
        } else
        {
            return i;
        }
    }

    public static String validateLength(int i, int j, String s, String s1)
        throws ValidationException
    {
        s1 = (String)validateNotNull(s, s1);
        if (s1.length() < i || s1.length() > j)
        {
            throw new ValidationException(String.format("String is not the right length. min=%s, max=%s, fieldName=%s, str=%s, str.length()=%s", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), s, s1, Integer.valueOf(s1.length())
            }));
        } else
        {
            return s1;
        }
    }

    public static String validateNotEmpty(String s, String s1)
        throws ValidationException
    {
        s1 = (String)validateNotNull(s, s1);
        if (s1.isEmpty())
        {
            throw new ValidationException(String.format("empty. fieldName=%s, str=%s", new Object[] {
                s, s1
            }));
        } else
        {
            return s1;
        }
    }

    public static Object validateNotNull(String s, Object obj)
        throws ValidationException
    {
        if (obj == null || obj.equals(null))
        {
            throw new ValidationException(String.format("%s was null.", new Object[] {
                s
            }));
        } else
        {
            return obj;
        }
    }

    public static String validatePathFragment(String s, String s1)
        throws ValidationException
    {
        s1 = (String)validateNotNull(s, s1);
        if (s1.endsWith("/"))
        {
            throw new ValidationException(String.format("invalid trailing '/' character. fieldName=%s, path=%s", new Object[] {
                s, s1
            }));
        }
        if (!s1.startsWith("/"))
        {
            throw new ValidationException(String.format("missing leading '/' character. fieldName=%s, path=%s", new Object[] {
                s, s1
            }));
        }
        if (!TwcPatterns.WEB_URL.matcher((new StringBuilder()).append("http://www.weather.com").append(s1).append("?foo=bar").toString()).matches())
        {
            throw new ValidationException(String.format("invalid character. fieldName=%s, path=%s", new Object[] {
                s, s1
            }));
        } else
        {
            return s1;
        }
    }

    public static String validatePattern(Pattern pattern, String s, String s1)
        throws ValidationException
    {
        validateNotNull(s, s1);
        if (!pattern.matcher(s1).matches())
        {
            throw new ValidationException(String.format("Does not match pattern. pattern=%s, fieldName=%s, str=%s", new Object[] {
                pattern, s, s1
            }));
        } else
        {
            return s1;
        }
    }

    public static boolean validateTrue(String s, boolean flag)
        throws ValidationException
    {
        if (!flag)
        {
            throw new ValidationException(String.format("expected true, was false. fieldName=%s", new Object[] {
                s
            }));
        } else
        {
            return true;
        }
    }

    public static String validateUuid(String s, String s1)
        throws ValidationException
    {
        validateNotNull(s, s1);
        if (!TwcPatterns.UUID_PATTERN.matcher(s1).matches())
        {
            throw new ValidationException(String.format("invalid uuid. fieldName=%s, uuid=%s", new Object[] {
                s, s1
            }));
        } else
        {
            return s1;
        }
    }

    public static String validateWebUrl(String s, String s1)
        throws ValidationException
    {
        validateNotNull(s, s1);
        if (!TwcPatterns.WEB_URL.matcher(s1).matches())
        {
            throw new ValidationException(String.format("invalid url. fieldName=%s, url=%s", new Object[] {
                s, s1
            }));
        } else
        {
            return s1;
        }
    }
}
