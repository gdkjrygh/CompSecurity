// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;

import com.google.common.base.Joiner;
import com.weather.dal2.TwcDataServer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.dal2.dsx:
//            MoDsxRecord, WhenWillRainRecord, FluRecord, SKResorts, 
//            DiRecord, DfRecord, DhRecord, BeRecord, 
//            Pollen, Breathing, AirportDelaysRecord, TiRecord, 
//            WmRecord

public final class DsxRecordEnum extends Enum
{

    private static final DsxRecordEnum $VALUES[];
    public static final DsxRecordEnum AIRPORT_DELAY_RECORD;
    public static final DsxRecordEnum BE_RECORD;
    public static final DsxRecordEnum BREATHING;
    public static final DsxRecordEnum DF_RECORD;
    public static final DsxRecordEnum DH_RECORD;
    public static final DsxRecordEnum DI_RECORD;
    public static final DsxRecordEnum FLU_RECORD;
    private static final String KTC_TOKEN = "<KEY_TYPE_COUNTRY>";
    public static final DsxRecordEnum MO_RECORD;
    private static final String PATH;
    public static final DsxRecordEnum POLLEN;
    public static final String RECORD_URL_VALUES;
    public static final DsxRecordEnum SK_RECORD;
    public static final DsxRecordEnum TI_RECORD;
    public static final DsxRecordEnum WHEN_WILL_IT_RAIN_RECORD;
    public static final DsxRecordEnum WM_RECORD;
    private final Class recordClass;
    private final String value;

    private DsxRecordEnum(String s, int i, Class class1, String s1)
    {
        super(s, i);
        recordClass = class1;
        value = s1;
    }

    public static Class find(String s)
    {
        DsxRecordEnum adsxrecordenum[] = values();
        int j = adsxrecordenum.length;
        for (int i = 0; i < j; i++)
        {
            DsxRecordEnum dsxrecordenum = adsxrecordenum[i];
            if (s.contains(dsxrecordenum.value.replace("/%s", "")))
            {
                return dsxrecordenum.getRecordClass();
            }
        }

        return null;
    }

    public static String getPathWithLocaleAndKeyTypeCountry(String s, String s1)
    {
        return PATH.replaceAll("%s", s).replaceAll("<KEY_TYPE_COUNTRY>", s1);
    }

    public static DsxRecordEnum valueOf(String s)
    {
        return (DsxRecordEnum)Enum.valueOf(com/weather/dal2/dsx/DsxRecordEnum, s);
    }

    public static DsxRecordEnum[] values()
    {
        return (DsxRecordEnum[])$VALUES.clone();
    }

    public Class getRecordClass()
    {
        return recordClass;
    }

    static 
    {
        MO_RECORD = new DsxRecordEnum("MO_RECORD", 0, com/weather/dal2/dsx/MoDsxRecord, "wxd/v2/MORecord/%s");
        WHEN_WILL_IT_RAIN_RECORD = new DsxRecordEnum("WHEN_WILL_IT_RAIN_RECORD", 1, com/weather/dal2/dsx/WhenWillRainRecord, "wxd/v2/wwir/%s");
        FLU_RECORD = new DsxRecordEnum("FLU_RECORD", 2, com/weather/dal2/dsx/FluRecord, "wxd/v2/PastFlu/%s");
        SK_RECORD = new DsxRecordEnum("SK_RECORD", 3, com/weather/dal2/dsx/SKResorts, "wxd/v2/SkiResorts/%s");
        DI_RECORD = new DsxRecordEnum("DI_RECORD", 4, com/weather/dal2/dsx/DiRecord, "wxd/v2/DIRecord/%s");
        DF_RECORD = new DsxRecordEnum("DF_RECORD", 5, com/weather/dal2/dsx/DfRecord, "wxd/v2/DFRecord/%s");
        DH_RECORD = new DsxRecordEnum("DH_RECORD", 6, com/weather/dal2/dsx/DhRecord, "wxd/v2/DHRecord/%s");
        BE_RECORD = new DsxRecordEnum("BE_RECORD", 7, com/weather/dal2/dsx/BeRecord, "wxd/v2/BERecord/%s");
        POLLEN = new DsxRecordEnum("POLLEN", 8, com/weather/dal2/dsx/Pollen, "wxd/v2/Pollen/%s");
        BREATHING = new DsxRecordEnum("BREATHING", 9, com/weather/dal2/dsx/Breathing, "wxd/v2/IDRecord/2");
        AIRPORT_DELAY_RECORD = new DsxRecordEnum("AIRPORT_DELAY_RECORD", 10, com/weather/dal2/dsx/AirportDelaysRecord, "wxd/v2/airportDelays/%s");
        TI_RECORD = new DsxRecordEnum("TI_RECORD", 11, com/weather/dal2/dsx/TiRecord, "wxd/v2/TIRecord/%s");
        WM_RECORD = new DsxRecordEnum("WM_RECORD", 12, com/weather/dal2/dsx/WmRecord, "wxd/v2/WMRecord/%s");
        $VALUES = (new DsxRecordEnum[] {
            MO_RECORD, WHEN_WILL_IT_RAIN_RECORD, FLU_RECORD, SK_RECORD, DI_RECORD, DF_RECORD, DH_RECORD, BE_RECORD, POLLEN, BREATHING, 
            AIRPORT_DELAY_RECORD, TI_RECORD, WM_RECORD
        });
        Object obj = Arrays.asList(values());
        ArrayList arraylist = new ArrayList();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(((DsxRecordEnum)((Iterator) (obj)).next()).value)) { }
        RECORD_URL_VALUES = Joiner.on(";").join(arraylist);
        PATH = (new StringBuilder()).append("/(").append(RECORD_URL_VALUES).append(")(/<KEY_TYPE_COUNTRY>)?api=").append(TwcDataServer.getApiKey()).toString();
    }
}
