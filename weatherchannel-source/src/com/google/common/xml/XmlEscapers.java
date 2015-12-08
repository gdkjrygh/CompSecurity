// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.xml;

import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;

public class XmlEscapers
{

    private static final char MAX_ASCII_CONTROL_CHAR = 31;
    private static final char MIN_ASCII_CONTROL_CHAR = 0;
    private static final Escaper XML_ATTRIBUTE_ESCAPER;
    private static final Escaper XML_CONTENT_ESCAPER;
    private static final Escaper XML_ESCAPER;

    private XmlEscapers()
    {
    }

    public static Escaper xmlAttributeEscaper()
    {
        return XML_ATTRIBUTE_ESCAPER;
    }

    public static Escaper xmlContentEscaper()
    {
        return XML_CONTENT_ESCAPER;
    }

    static 
    {
        com.google.common.escape.Escapers.Builder builder = Escapers.builder();
        builder.setSafeRange('\0', '\uFFFD');
        builder.setUnsafeReplacement("\uFFFD");
        for (char c = '\0'; c <= 31; c++)
        {
            if (c != 9 && c != 10 && c != 13)
            {
                builder.addEscape(c, "\uFFFD");
            }
        }

        builder.addEscape('&', "&amp;");
        builder.addEscape('<', "&lt;");
        builder.addEscape('>', "&gt;");
        XML_CONTENT_ESCAPER = builder.build();
        builder.addEscape('\'', "&apos;");
        builder.addEscape('"', "&quot;");
        XML_ESCAPER = builder.build();
        builder.addEscape('\t', "&#x9;");
        builder.addEscape('\n', "&#xA;");
        builder.addEscape('\r', "&#xD;");
        XML_ATTRIBUTE_ESCAPER = builder.build();
    }
}
