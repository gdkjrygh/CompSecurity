// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.weather.dal2.dsx:
//            Pollen

public static class PolDay
    implements com.weather.dal2.data.ollenDoc
{
    public static class PolDay
        implements com.weather.dal2.data.PollenRecord.PollenDoc.PollenDay
    {

        private final String idxAux2 = null;
        private final String idxGMTTm = null;
        private final String idxPhr1 = null;
        private final Integer idxPrt1 = Integer.valueOf(0);
        private final String idxTmISO = null;

        public Integer getPollenIndexCode()
        {
            return idxPrt1;
        }

        public String getPollenIndexPhrase()
        {
            return idxPhr1;
        }

        public String getPollenIndexTimeInGMT()
        {
            return idxGMTTm;
        }

        public String getPollenTreeTimeInISO()
        {
            return idxTmISO;
        }

        public String getPollenTreeType()
        {
            return idxAux2;
        }

        public PolDay()
        {
        }
    }


    private final PolDay grass[] = null;
    private final String mold = null;
    private final PolDay tree[] = null;
    private final PolDay weed[] = null;

    public List getGrassPollen()
    {
        ArrayList arraylist = null;
        if (grass != null)
        {
            arraylist = new ArrayList(grass.length);
            Collections.addAll(arraylist, grass);
        }
        return arraylist;
    }

    public Integer getMoldCount()
    {
        Integer integer;
        try
        {
            integer = Integer.valueOf(mold);
        }
        catch (NumberFormatException numberformatexception)
        {
            return Integer.valueOf(-1);
        }
        return integer;
    }

    public List getTreePollen()
    {
        ArrayList arraylist = null;
        if (tree != null)
        {
            arraylist = new ArrayList(tree.length);
            Collections.addAll(arraylist, tree);
        }
        return arraylist;
    }

    public List getWeedPollen()
    {
        ArrayList arraylist = null;
        if (weed != null)
        {
            arraylist = new ArrayList(weed.length);
            Collections.addAll(arraylist, weed);
        }
        return arraylist;
    }

    public PolDay()
    {
    }
}
