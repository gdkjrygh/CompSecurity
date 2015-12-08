// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson;


public final class JsonEncoding extends Enum
{

    private static final JsonEncoding $VALUES[];
    public static final JsonEncoding UTF16_BE;
    public static final JsonEncoding UTF16_LE;
    public static final JsonEncoding UTF32_BE;
    public static final JsonEncoding UTF32_LE;
    public static final JsonEncoding UTF8;
    protected final boolean _bigEndian;
    protected final String _javaName;

    private JsonEncoding(String s, int i, String s1, boolean flag)
    {
        super(s, i);
        _javaName = s1;
        _bigEndian = flag;
    }

    public static JsonEncoding valueOf(String s)
    {
        return (JsonEncoding)Enum.valueOf(org/codehaus/jackson/JsonEncoding, s);
    }

    public static JsonEncoding[] values()
    {
        return (JsonEncoding[])$VALUES.clone();
    }

    public String getJavaName()
    {
        return _javaName;
    }

    public boolean isBigEndian()
    {
        return _bigEndian;
    }

    static 
    {
        UTF8 = new JsonEncoding("UTF8", 0, "UTF-8", false);
        UTF16_BE = new JsonEncoding("UTF16_BE", 1, "UTF-16BE", true);
        UTF16_LE = new JsonEncoding("UTF16_LE", 2, "UTF-16LE", false);
        UTF32_BE = new JsonEncoding("UTF32_BE", 3, "UTF-32BE", true);
        UTF32_LE = new JsonEncoding("UTF32_LE", 4, "UTF-32LE", false);
        $VALUES = (new JsonEncoding[] {
            UTF8, UTF16_BE, UTF16_LE, UTF32_BE, UTF32_LE
        });
    }
}
