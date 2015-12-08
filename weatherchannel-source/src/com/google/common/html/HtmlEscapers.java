// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.html;

import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;

public final class HtmlEscapers
{

    private static final Escaper HTML_ESCAPER = Escapers.builder().addEscape('"', "&quot;").addEscape('\'', "&#39;").addEscape('&', "&amp;").addEscape('<', "&lt;").addEscape('>', "&gt;").build();

    private HtmlEscapers()
    {
    }

    public static Escaper htmlEscaper()
    {
        return HTML_ESCAPER;
    }

}
