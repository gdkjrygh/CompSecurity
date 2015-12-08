// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;

import com.weather.dal2.data.WWIR;

// Referenced classes of package com.weather.dal2.dsx:
//            DsxRecord

public class WhenWillRainRecord extends DsxRecord
    implements WWIR
{

    private final WWIRDoc doc = null;

    public WhenWillRainRecord()
    {
    }

    private boolean hasData()
    {
        return doc != null;
    }

    public String getBluntPhrase()
    {
    /* block-local class not found */
    class WWIRDoc {}

        if (hasData())
        {
            return WWIRDoc.access._mth100(doc);
        } else
        {
            return null;
        }
    }

    public Integer getOverallType()
    {
        if (hasData())
        {
            return WWIRDoc.access._mth200(doc);
        } else
        {
            return null;
        }
    }

    public String getStandardPhrase()
    {
        if (hasData())
        {
            return WWIRDoc.access._mth000(doc);
        } else
        {
            return null;
        }
    }

    public boolean hasNarrative()
    {
        String s = getStandardPhrase();
        return hasData() && s != null && !s.isEmpty();
    }

    public void normalize()
    {
    }
}
