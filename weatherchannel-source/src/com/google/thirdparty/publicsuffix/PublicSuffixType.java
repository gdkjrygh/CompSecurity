// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.thirdparty.publicsuffix;


final class PublicSuffixType extends Enum
{

    private static final PublicSuffixType $VALUES[];
    public static final PublicSuffixType ICANN;
    public static final PublicSuffixType PRIVATE;
    private final char innerNodeCode;
    private final char leafNodeCode;

    private PublicSuffixType(String s, int i, char c, char c1)
    {
        super(s, i);
        innerNodeCode = c;
        leafNodeCode = c1;
    }

    static PublicSuffixType fromCode(char c)
    {
        PublicSuffixType apublicsuffixtype[] = values();
        int j = apublicsuffixtype.length;
        for (int i = 0; i < j; i++)
        {
            PublicSuffixType publicsuffixtype = apublicsuffixtype[i];
            if (publicsuffixtype.getInnerNodeCode() == c || publicsuffixtype.getLeafNodeCode() == c)
            {
                return publicsuffixtype;
            }
        }

        throw new IllegalArgumentException((new StringBuilder(38)).append("No enum corresponding to given code: ").append(c).toString());
    }

    static PublicSuffixType fromIsPrivate(boolean flag)
    {
        if (flag)
        {
            return PRIVATE;
        } else
        {
            return ICANN;
        }
    }

    public static PublicSuffixType valueOf(String s)
    {
        return (PublicSuffixType)Enum.valueOf(com/google/thirdparty/publicsuffix/PublicSuffixType, s);
    }

    public static PublicSuffixType[] values()
    {
        return (PublicSuffixType[])$VALUES.clone();
    }

    char getInnerNodeCode()
    {
        return innerNodeCode;
    }

    char getLeafNodeCode()
    {
        return leafNodeCode;
    }

    static 
    {
        PRIVATE = new PublicSuffixType("PRIVATE", 0, ':', ',');
        ICANN = new PublicSuffixType("ICANN", 1, '!', '?');
        $VALUES = (new PublicSuffixType[] {
            PRIVATE, ICANN
        });
    }
}
