// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;

import com.weather.dal2.data.SkiRecord;
import java.util.regex.Pattern;

// Referenced classes of package com.weather.dal2.dsx:
//            DsxRecord

public class SKResorts extends DsxRecord
    implements SkiRecord
{

    private static final Pattern COMPILE = Pattern.compile(";");
    private SkiDoc doc[];

    public SKResorts()
    {
    }

    private SkiDoc.SKData.DfSkiData[] getDfSkiData(int i)
    {
        SkiDoc.SKData skdata = getSkRecord(i);
    /* block-local class not found */
    class SkiDoc.SKData {}

        if (skdata != null)
        {
            return SkiDoc.SKData.access._mth1300(skdata);
        } else
        {
            return null;
        }
    }

    private SkiDoc.SKData.MoSkiData getMoData(int i)
    {
        SkiDoc.SKData skdata = getSkRecord(i);
        if (skdata != null)
        {
            return SkiDoc.SKData.access._mth1200(skdata);
        } else
        {
            return null;
        }
    }

    private SkiDoc.SKData getSkRecord(int i)
    {
        Object obj = null;
        SkiDoc.SKData skdata = obj;
        if (doc != null)
        {
            SkiDoc skidoc = doc[i];
            skdata = obj;
    /* block-local class not found */
    class SkiDoc {}

            if (skidoc != null)
            {
                skdata = SkiDoc.access._mth000(skidoc);
            }
        }
        return skdata;
    }

    public Integer getMaxSnowLevelCm(int i)
    {
        SkiDoc.SKData skdata = getSkRecord(i);
        if (skdata != null)
        {
            return SkiDoc.SKData.access._mth600(skdata);
        } else
        {
            return null;
        }
    }

    public Integer getMaxSnowLevelIn(int i)
    {
        SkiDoc.SKData skdata = getSkRecord(i);
        if (skdata != null)
        {
            return SkiDoc.SKData.access._mth500(skdata);
        } else
        {
            return null;
        }
    }

    public Integer getMinSnowLevelCm(int i)
    {
        SkiDoc.SKData skdata = getSkRecord(i);
        if (skdata != null)
        {
            return SkiDoc.SKData.access._mth800(skdata);
        } else
        {
            return null;
        }
    }

    public Integer getMinSnowLevelIn(int i)
    {
        SkiDoc.SKData skdata = getSkRecord(i);
        if (skdata != null)
        {
            return SkiDoc.SKData.access._mth700(skdata);
        } else
        {
            return null;
        }
    }

    public Integer getOpenLifts(int i)
    {
        SkiDoc.SKData skdata = getSkRecord(i);
        if (skdata != null)
        {
            return SkiDoc.SKData.access._mth1000(skdata);
        } else
        {
            return null;
        }
    }

    public String[] getOperatingHours(int i)
    {
        Object obj = null;
        SkiDoc.SKData skdata = getSkRecord(i);
        String as[] = obj;
        if (skdata != null)
        {
            as = obj;
            if (SkiDoc.SKData.access._mth900(skdata) != null)
            {
                as = COMPILE.split(SkiDoc.SKData.access._mth900(skdata));
            }
        }
        return as;
    }

    public String getResortName(int i)
    {
        SkiDoc.SKData skdata = getSkRecord(i);
        if (skdata != null)
        {
            return SkiDoc.SKData.access._mth100(skdata);
        } else
        {
            return null;
        }
    }

    public String getSnowAccumulationForecastInCentimeters(int i)
    {
        Object obj = null;
        SkiDoc.SKData.DfSkiData adfskidata[] = getDfSkiData(i);
        String s = obj;
        if (adfskidata != null)
        {
            s = obj;
    /* block-local class not found */
    class SkiDoc.SKData.DfSkiData {}

            if (adfskidata[0] != null)
            {
                s = SkiDoc.SKData.DfSkiData.access._mth2000(adfskidata[0]);
            }
        }
        return s;
    }

    public String getSnowAccumulationForecastInInches(int i)
    {
        Object obj = null;
        SkiDoc.SKData.DfSkiData adfskidata[] = getDfSkiData(i);
        String s = obj;
        if (adfskidata != null)
        {
            s = obj;
            if (adfskidata[0] != null)
            {
                s = SkiDoc.SKData.DfSkiData.access._mth1900(adfskidata[0]);
            }
        }
        return s;
    }

    public String getSnowCondition(int i)
    {
        SkiDoc.SKData skdata = getSkRecord(i);
        if (skdata != null)
        {
            return SkiDoc.SKData.access._mth400(skdata);
        } else
        {
            return null;
        }
    }

    public Integer getSnowFallenLast24HoursCm(int i)
    {
        SkiDoc.SKData skdata = getSkRecord(i);
        if (skdata != null)
        {
            return SkiDoc.SKData.access._mth300(skdata);
        } else
        {
            return null;
        }
    }

    public Integer getSnowFallenLast24HoursIn(int i)
    {
        SkiDoc.SKData skdata = getSkRecord(i);
        if (skdata != null)
        {
            return SkiDoc.SKData.access._mth200(skdata);
        } else
        {
            return null;
        }
    }

    public Integer getTemperatureC(int i)
    {
        SkiDoc.SKData.MoSkiData moskidata = getMoData(i);
    /* block-local class not found */
    class SkiDoc.SKData.MoSkiData {}

        if (moskidata != null)
        {
            return SkiDoc.SKData.MoSkiData.access._mth1500(moskidata);
        } else
        {
            return null;
        }
    }

    public Integer getTemperatureF(int i)
    {
        SkiDoc.SKData.MoSkiData moskidata = getMoData(i);
        if (moskidata != null)
        {
            return SkiDoc.SKData.MoSkiData.access._mth1400(moskidata);
        } else
        {
            return null;
        }
    }

    public Integer getTotalNumberOfLift(int i)
    {
        SkiDoc.SKData skdata = getSkRecord(i);
        if (skdata != null)
        {
            return SkiDoc.SKData.access._mth1100(skdata);
        } else
        {
            return null;
        }
    }

    public String getWindDirection(int i)
    {
        SkiDoc.SKData.MoSkiData moskidata = getMoData(i);
        if (moskidata != null)
        {
            return SkiDoc.SKData.MoSkiData.access._mth1700(moskidata);
        } else
        {
            return null;
        }
    }

    public Integer getWindSpeedKm(int i)
    {
        SkiDoc.SKData.MoSkiData moskidata = getMoData(i);
        if (moskidata != null)
        {
            return SkiDoc.SKData.MoSkiData.access._mth1800(moskidata);
        } else
        {
            return null;
        }
    }

    public Integer getWindSpeedMi(int i)
    {
        SkiDoc.SKData.MoSkiData moskidata = getMoData(i);
        if (moskidata != null)
        {
            return SkiDoc.SKData.MoSkiData.access._mth1600(moskidata);
        } else
        {
            return null;
        }
    }

    public void normalize()
    {
        if (doc == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = 0;
        j = doc.length;
_L7:
        if (i >= j) goto _L2; else goto _L3
_L3:
        if (doc[i] == null || SkiDoc.access._mth000(doc[i]) != null) goto _L5; else goto _L4
_L4:
        status = Integer.valueOf(500);
        doc = null;
_L2:
        return;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int totalNumberOfResorts()
    {
        if (doc != null)
        {
            return doc.length;
        } else
        {
            return 0;
        }
    }

}
