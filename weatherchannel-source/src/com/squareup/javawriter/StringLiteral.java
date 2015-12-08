// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.javawriter;

import java.util.Formatter;

public final class StringLiteral
{

    private final String literal;
    private final String value;

    private StringLiteral(String s, String s1)
    {
        value = s;
        literal = s1;
    }

    public static StringLiteral forValue(String s)
    {
        return new StringLiteral(s, stringLiteral(s));
    }

    private static String stringLiteral(String s)
    {
        StringBuilder stringbuilder;
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
label4:
                        {
label5:
                            {
label6:
                                {
                                    stringbuilder = new StringBuilder();
                                    stringbuilder.append('"');
                                    int i = 0;
label7:
                                    do
                                    {
                                        {
                                            if (i >= s.length())
                                            {
                                                break label0;
                                            }
                                            char c = s.charAt(i);
                                            switch (c)
                                            {
                                            default:
                                                if (Character.isISOControl(c))
                                                {
                                                    (new Formatter(stringbuilder)).format("\\u%04x", new Object[] {
                                                        Integer.valueOf(c)
                                                    });
                                                } else
                                                {
                                                    stringbuilder.append(c);
                                                }
                                                break;

                                            case 8: // '\b'
                                                break label5;

                                            case 9: // '\t'
                                                break label4;

                                            case 10: // '\n'
                                                break label3;

                                            case 12: // '\f'
                                                break label2;

                                            case 13: // '\r'
                                                break label1;

                                            case 34: // '"'
                                                break label7;

                                            case 92: // '\\'
                                                break label6;
                                            }
                                        }
                                        i++;
                                    } while (true);
                                    stringbuilder.append("\\\"");
                                    break MISSING_BLOCK_LABEL_132;
                                }
                                stringbuilder.append("\\\\");
                                break MISSING_BLOCK_LABEL_132;
                            }
                            stringbuilder.append("\\b");
                            break MISSING_BLOCK_LABEL_132;
                        }
                        stringbuilder.append("\\t");
                        break MISSING_BLOCK_LABEL_132;
                    }
                    stringbuilder.append("\\n");
                    break MISSING_BLOCK_LABEL_132;
                }
                stringbuilder.append("\\f");
                break MISSING_BLOCK_LABEL_132;
            }
            stringbuilder.append("\\r");
            break MISSING_BLOCK_LABEL_132;
        }
        stringbuilder.append('"');
        return stringbuilder.toString();
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof StringLiteral)
        {
            return value.equals(((StringLiteral)obj).value);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return value.hashCode();
    }

    public String literal()
    {
        return literal;
    }

    public String toString()
    {
        return literal;
    }

    public String value()
    {
        return value;
    }
}
