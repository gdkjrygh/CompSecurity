// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;


public class Variants
{
    public static class Builder
    {

        private String _0;
        private String _1;
        private String _10;
        private String _11;
        private String _12;
        private String _13;
        private String _14;
        private String _15;
        private String _2;
        private String _3;
        private String _4;
        private String _5;
        private String _6;
        private String _7;
        private String _8;
        private String _9;

        public Variants build()
        {
            return new Variants(_0, _1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15);
        }

        public Builder set_0(String s)
        {
            _0 = s;
            return this;
        }

        public Builder set_1(String s)
        {
            _1 = s;
            return this;
        }

        public Builder set_10(String s)
        {
            _10 = s;
            return this;
        }

        public Builder set_11(String s)
        {
            _11 = s;
            return this;
        }

        public Builder set_12(String s)
        {
            _12 = s;
            return this;
        }

        public Builder set_13(String s)
        {
            _13 = s;
            return this;
        }

        public Builder set_14(String s)
        {
            _14 = s;
            return this;
        }

        public Builder set_15(String s)
        {
            _15 = s;
            return this;
        }

        public Builder set_2(String s)
        {
            _2 = s;
            return this;
        }

        public Builder set_3(String s)
        {
            _3 = s;
            return this;
        }

        public Builder set_4(String s)
        {
            _4 = s;
            return this;
        }

        public Builder set_5(String s)
        {
            _5 = s;
            return this;
        }

        public Builder set_6(String s)
        {
            _6 = s;
            return this;
        }

        public Builder set_7(String s)
        {
            _7 = s;
            return this;
        }

        public Builder set_8(String s)
        {
            _8 = s;
            return this;
        }

        public Builder set_9(String s)
        {
            _9 = s;
            return this;
        }

        private Builder()
        {
        }

    }


    public final String _0;
    public final String _1;
    public final String _10;
    public final String _11;
    public final String _12;
    public final String _13;
    public final String _14;
    public final String _15;
    public final String _2;
    public final String _3;
    public final String _4;
    public final String _5;
    public final String _6;
    public final String _7;
    public final String _8;
    public final String _9;

    public Variants()
    {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    private Variants(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, String s10, String s11, String s12, String s13, 
            String s14, String s15)
    {
        _0 = s;
        _1 = s1;
        _2 = s2;
        _3 = s3;
        _4 = s4;
        _5 = s5;
        _6 = s6;
        _7 = s7;
        _8 = s8;
        _9 = s9;
        _10 = s10;
        _11 = s11;
        _12 = s12;
        _13 = s13;
        _14 = s14;
        _15 = s15;
    }


    public static Builder builder()
    {
        return new Builder();
    }
}
