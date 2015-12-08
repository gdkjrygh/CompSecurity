// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities;


public class MicrLine
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private CheckType h;

    public MicrLine()
    {
        a = "";
        b = "";
        c = "";
        d = "";
        e = "";
        f = "";
        g = false;
        h = CheckType.NONE;
    }

    public String getAmount()
    {
        return f;
    }

    public String getAuxiliaryOnUs()
    {
        return a;
    }

    public CheckType getCheckType()
    {
        return h;
    }

    public String getEPC()
    {
        return b;
    }

    public String getOnUs1()
    {
        return d;
    }

    public String getOnUs2()
    {
        return e;
    }

    public String getTransitNumber()
    {
        return c;
    }

    public boolean getValueSet()
    {
        return g;
    }

    public void setAmount(String s)
    {
        f = s;
        g = true;
    }

    public void setAuxiliaryOnUs(String s)
    {
        a = s;
        g = true;
    }

    public void setCheckType(CheckType checktype)
    {
        h = checktype;
    }

    public void setEPC(String s)
    {
        b = s;
        g = true;
    }

    public void setOnUs1(String s)
    {
        d = s;
        g = true;
    }

    public void setOnUs2(String s)
    {
        e = s;
        g = true;
    }

    public void setTransitNumber(String s)
    {
        c = s;
        g = true;
    }

    private class CheckType extends Enum
    {

        public static final CheckType BUSINESS_CHECK;
        public static final CheckType NONE;
        public static final CheckType PERSONAL_CHECK;
        private static final CheckType a[];

        public static CheckType valueOf(String s)
        {
            return (CheckType)Enum.valueOf(com/kofax/kmc/kut/utilities/MicrLine$CheckType, s);
        }

        public static CheckType[] values()
        {
            return (CheckType[])a.clone();
        }

        static 
        {
            NONE = new CheckType("NONE", 0);
            PERSONAL_CHECK = new CheckType("PERSONAL_CHECK", 1);
            BUSINESS_CHECK = new CheckType("BUSINESS_CHECK", 2);
            a = (new CheckType[] {
                NONE, PERSONAL_CHECK, BUSINESS_CHECK
            });
        }

        private CheckType(String s, int i)
        {
            super(s, i);
        }
    }

}
