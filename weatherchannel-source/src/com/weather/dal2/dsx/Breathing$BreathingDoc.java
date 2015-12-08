// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.weather.dal2.dsx:
//            Breathing

public static class IDData
{

    private final hing.SAME IDData[];
    private final hing.SAME IDHdr;

    public IDData getBreathingHdr()
    {
        return IDHdr;
    }

    public List getBreathingValue()
    {
        ArrayList arraylist = null;
        if (IDData != null)
        {
            arraylist = new ArrayList(IDData.length);
            Collections.addAll(arraylist, IDData);
        }
        return arraylist;
    }

    public hing getRelativeForecast(int i)
    {
        if (IDData != null && IDData.length > i && IDData[0] != null)
        {
            Integer integer = IDData[0].getBreathingIndexCode();
            String s = IDData[0].getBreathingIndexPhrase();
            if (integer != null && s != null)
            {
                int k = integer.intValue();
                for (int j = 1; j <= i; j++)
                {
                    if (IDData[j] == null)
                    {
                        continue;
                    }
                    Integer integer1 = IDData[j].getBreathingIndexCode();
                    String s1 = IDData[j].getBreathingIndexPhrase();
                    if (integer1 == null || s1 == null)
                    {
                        continue;
                    }
                    int l = integer1.intValue();
                    if (l > k && !s1.equals(s))
                    {
                        return hing.BETTER;
                    }
                    if (l < k && !s1.equals(s))
                    {
                        return hing.WORSE;
                    }
                }

            }
            return hing.SAME;
        } else
        {
            return null;
        }
    }



    public hing(hing hing, hing ahing[])
    {
        IDHdr = hing;
        IDData = ahing;
    }
}
