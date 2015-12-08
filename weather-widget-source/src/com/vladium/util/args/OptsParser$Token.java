// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util.args;


// Referenced classes of package com.vladium.util.args:
//            OptsParser

private static final class m_value
{

    static final int CARD_ID = 9;
    static final m_value COLON = new <init>(2, ":");
    static final int COLON_ID = 2;
    static final <init> COMMA = new <init>(4, ",");
    static final int COMMA_ID = 4;
    static final <init> DETAILEDONLY = new <init>(15, "detailedonly");
    static final int DETAILEDONLY_ID = 15;
    static final <init> EOF = new <init>(0, "<EOF>");
    static final int EOF_ID = 0;
    static final <init> EXCLUDES = new <init>(13, "excludes");
    static final int EXCLUDES_ID = 13;
    static final <init> LBRACKET = new <init>(5, "{");
    static final int LBRACKET_ID = 5;
    static final <init> MERGEABLE = new <init>(14, "mergeable");
    static final int MERGEABLE_ID = 14;
    static final <init> OPTIONAL = new <init>(7, "optional");
    static final int OPTIONAL_ID = 7;
    static final <init> PATTERN = new <init>(16, "pattern");
    static final int PATTERN_ID = 16;
    static final <init> RBRACKET = new <init>(6, "}");
    static final int RBRACKET_ID = 6;
    static final <init> REQUIRED = new <init>(8, "required");
    static final int REQUIRED_ID = 8;
    static final <init> REQUIRES = new <init>(12, "requires");
    static final int REQUIRES_ID = 12;
    static final <init> SEMICOLON = new <init>(3, ";");
    static final int SEMICOLON_ID = 3;
    static final int STRING_ID = 1;
    static final int TEXT_ID = 11;
    static final <init> VALUES = new <init>(10, "values");
    static final int VALUES_ID = 10;
    private final int m_ID;
    private final String m_value;

    int getID()
    {
        return m_ID;
    }

    String getValue()
    {
        return m_value;
    }

    public String toString()
    {
        return (new StringBuilder()).append(m_ID).append(": [").append(m_value).append("]").toString();
    }


    (int i, String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null input: value");
        } else
        {
            m_ID = i;
            m_value = s;
            return;
        }
    }
}
