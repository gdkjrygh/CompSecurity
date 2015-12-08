// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CaseFormat, Ascii, CharMatcher

static final class nit> extends CaseFormat
{

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
            return super.convert(caseformat, s);
        }
    }

    String normalizeWord(String s)
    {
        return Ascii.toLowerCase(s);
    }

    (String s, int i, CharMatcher charmatcher, String s1)
    {
        super(s, i, charmatcher, s1, null);
    }
}
