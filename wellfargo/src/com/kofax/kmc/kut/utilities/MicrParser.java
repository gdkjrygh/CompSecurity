// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities;

import com.kofax.kmc.kut.utilities.error.NullPointerException;

// Referenced classes of package com.kofax.kmc.kut.utilities:
//            MicrLine

public class MicrParser
{

    private MicrLine a;

    public MicrParser()
    {
        a = new MicrLine();
    }

    public MicrParser(String s)
    {
        ParseMicr(s);
    }

    public boolean ParseMicr(String s)
    {
        int i = 67;
        char c = ',';
        a = new MicrLine();
        if (s == null)
        {
            throw new NullPointerException("micrData parameter is null");
        }
        String s1;
        int l;
        if (s.contains(String.valueOf('C')) && s.contains(String.valueOf('P')))
        {
            c = 'P';
        } else
        if (s.contains(String.valueOf('.')) && s.contains(String.valueOf(',')))
        {
            i = 46;
        } else
        {
            return a.getValueSet();
        }
        s1 = (new StringBuilder(s)).reverse().toString();
        s = s1;
        if (s1.startsWith(String.valueOf('/')))
        {
            int j = s1.indexOf('/', 1);
            s = s1.substring(1, j);
            a.setAmount((new StringBuilder(s)).reverse().toString());
            s = s1.substring(j + 1);
        }
        s1 = s;
        if (!s.startsWith(String.valueOf(c)))
        {
            int k = s.indexOf(c);
            s1 = s.substring(0, k);
            a.setOnUs2((new StringBuilder(s1)).reverse().toString());
            s1 = s.substring(k);
        }
        l = s1.indexOf(i);
        s = s1.substring(1, l);
        a.setOnUs1((new StringBuilder(s)).reverse().toString());
        s = s1.substring(l);
        i = s.indexOf(i, 1);
        s1 = s.substring(1, i);
        a.setTransitNumber((new StringBuilder(s1)).reverse().toString());
        s1 = s.substring(i + 1);
        if (s1.length() > 0)
        {
            s = s1;
            if (!s1.startsWith(String.valueOf(c)))
            {
                a.setEPC(String.valueOf(s1.charAt(0)));
                s = s1.substring(1);
            }
            if (s.length() > 1)
            {
                a.setCheckType(MicrLine.CheckType.BUSINESS_CHECK);
                s = s.substring(s.indexOf(String.valueOf(c)) + 1, s.lastIndexOf(String.valueOf(c)));
                a.setAuxiliaryOnUs((new StringBuilder(s)).reverse().toString());
            } else
            {
                a.setCheckType(MicrLine.CheckType.PERSONAL_CHECK);
            }
        } else
        {
            a.setCheckType(MicrLine.CheckType.PERSONAL_CHECK);
        }
        return a.getValueSet();
    }

    public String getAccountNumber()
    {
        return a.getOnUs1();
    }

    public String getCheckNumber()
    {
        if (a.getCheckType() == MicrLine.CheckType.PERSONAL_CHECK)
        {
            return a.getOnUs2();
        } else
        {
            return a.getAuxiliaryOnUs();
        }
    }

    public MicrLine getMicrLine()
    {
        return a;
    }

    public String getTransitNumber()
    {
        return a.getTransitNumber();
    }

    public boolean isMicrValid()
    {
        return a.getValueSet();
    }
}
