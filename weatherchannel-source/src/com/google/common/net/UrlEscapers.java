// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.net;

import com.google.common.escape.Escaper;

// Referenced classes of package com.google.common.net:
//            PercentEscaper

public final class UrlEscapers
{

    private static final Escaper URL_FORM_PARAMETER_ESCAPER = new PercentEscaper("-_.*", true);
    static final String URL_FORM_PARAMETER_OTHER_SAFE_CHARS = "-_.*";
    private static final Escaper URL_FRAGMENT_ESCAPER = new PercentEscaper("-._~!$'()*,;&=@:+/?", false);
    static final String URL_PATH_OTHER_SAFE_CHARS_LACKING_PLUS = "-._~!$'()*,;&=@:";
    private static final Escaper URL_PATH_SEGMENT_ESCAPER = new PercentEscaper("-._~!$'()*,;&=@:+", false);

    private UrlEscapers()
    {
    }

    public static Escaper urlFormParameterEscaper()
    {
        return URL_FORM_PARAMETER_ESCAPER;
    }

    public static Escaper urlFragmentEscaper()
    {
        return URL_FRAGMENT_ESCAPER;
    }

    public static Escaper urlPathSegmentEscaper()
    {
        return URL_PATH_SEGMENT_ESCAPER;
    }

}
