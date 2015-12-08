// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.facade;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSetMultimap;
import com.weather.dal2.data.WeatherAlertsRecord;
import com.weather.dal2.dsx.RecordSets;
import com.weather.dal2.locations.SavedLocation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class WeatherAlerts
{
    private static final class AlertMapAndValue
    {

        private final ImmutableSetMultimap phenomenaSignificanceMap;
        public final String value;

        public boolean areAnyAlertsOfInterest(WeatherAlertsRecord weatheralertsrecord)
        {
            for (weatheralertsrecord = weatheralertsrecord.getWeatherAlertsDoc().iterator(); weatheralertsrecord.hasNext();)
            {
                Object obj = ((com.weather.dal2.data.WeatherAlertsRecord.WeatherAlertsDoc)weatheralertsrecord.next()).getWeatherAlertsHeader();
                if (obj != null)
                {
                    obj = ((com.weather.dal2.data.WeatherAlertsRecord.WeatherAlertsDoc.WeatherAlertsHeader) (obj)).getWeatherAlertsEvent();
                    if (obj != null && phenomenaSignificanceMap.containsEntry(((com.weather.dal2.data.WeatherAlertsRecord.WeatherAlertsDoc.WeatherAlertsHeader.WeatherAlertsEvent) (obj)).getPhenomenaCode(), ((com.weather.dal2.data.WeatherAlertsRecord.WeatherAlertsDoc.WeatherAlertsHeader.WeatherAlertsEvent) (obj)).getSignificance()))
                    {
                        return true;
                    }
                }
            }

            return false;
        }

        AlertMapAndValue(ImmutableSetMultimap immutablesetmultimap, String s)
        {
            phenomenaSignificanceMap = immutablesetmultimap;
            value = s;
        }
    }


    private static final Collection ALERTS_OF_SIGNIFICANCE;
    public static final WeatherAlerts EMPTY = new WeatherAlerts("nl", true);
    private static final String FLOOD_ALERT_VALUE = "fld";
    private static final ImmutableSetMultimap MULTIMAP_FLOOD;
    private static final ImmutableSetMultimap MULTIMAP_NO_BB;
    private static final ImmutableSetMultimap MULTIMAP_OTHER;
    private static final ImmutableSetMultimap MULTIMAP_THUNDER;
    private static final ImmutableSetMultimap MULTIMAP_TORNADO;
    private static final ImmutableSetMultimap MULTIMAP_TROPICAL;
    private static final ImmutableSetMultimap MULTIMAP_WINTER;
    private static final AlertMapAndValue NO_BB_ALERTS;
    private static final String OTHER_ALERT_VALUE = "oth";
    private static final String SIG_A = "A";
    private static final String SIG_F = "F";
    private static final String SIG_S = "S";
    private static final String SIG_T1 = "T1";
    private static final String SIG_T2 = "T2";
    private static final String SIG_T3 = "T3";
    private static final String SIG_TB = "TB";
    private static final String SIG_TE = "TE";
    private static final String SIG_TL = "TL";
    private static final String SIG_TM = "TM";
    private static final String SIG_TR = "TR";
    private static final String SIG_TT = "TT";
    private static final String SIG_W = "W";
    private static final String SIG_Y = "Y";
    private static final String THUNDER_ALERT_VALUE = "thdr";
    private static final String TORNADO_ALERT_VALUE = "tor";
    private static final String TROPICAL_ALERT_VALUE = "trop";
    private static final String WINTER_ALERT_VALUE = "wint";
    public final boolean allowBrandedBackground;
    public final String weatherAlertSummary;

    public WeatherAlerts(RecordSets recordsets, SavedLocation savedlocation)
    {
        if (!recordsets.hasDataFor(savedlocation))
        {
            weatherAlertSummary = "nl";
            allowBrandedBackground = true;
            return;
        }
        recordsets = recordsets.wxdv2BERecord;
        if (recordsets == null)
        {
            weatherAlertSummary = "nl";
            allowBrandedBackground = true;
            return;
        }
        savedlocation = getSevereSummaryList(recordsets);
        if (savedlocation.isEmpty())
        {
            weatherAlertSummary = "nl";
        } else
        {
            weatherAlertSummary = Joiner.on(",").join(savedlocation);
        }
        allowBrandedBackground = allowBrandedBackground(recordsets);
    }

    public WeatherAlerts(String s, boolean flag)
    {
        weatherAlertSummary = s;
        allowBrandedBackground = flag;
    }

    private static boolean allowBrandedBackground(WeatherAlertsRecord weatheralertsrecord)
    {
        return !NO_BB_ALERTS.areAnyAlertsOfInterest(weatheralertsrecord);
    }

    private static List getSevereSummaryList(WeatherAlertsRecord weatheralertsrecord)
    {
        ArrayList arraylist = new ArrayList(ALERTS_OF_SIGNIFICANCE.size());
        Iterator iterator = ALERTS_OF_SIGNIFICANCE.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            AlertMapAndValue alertmapandvalue = (AlertMapAndValue)iterator.next();
            if (alertmapandvalue.areAnyAlertsOfInterest(weatheralertsrecord))
            {
                arraylist.add(alertmapandvalue.value);
            }
        } while (true);
        return arraylist;
    }

    static 
    {
        MULTIMAP_FLOOD = (new com.google.common.collect.ImmutableSetMultimap.Builder()).putAll("CF", new String[] {
            "W", "A", "Y", "S"
        }).putAll("LS", new String[] {
            "W", "A", "Y", "S"
        }).putAll("FA", new String[] {
            "W", "A", "Y", "TB"
        }).putAll("FL", new String[] {
            "W", "A", "Y"
        }).putAll("FF", new String[] {
            "W", "A"
        }).putAll("HY", new String[] {
            "S"
        }).putAll("TS", new String[] {
            "TB"
        }).putAll("RP", new String[] {
            "S"
        }).putAll("TCL", new String[] {
            "TB"
        }).putAll("TCO", new String[] {
            "F"
        }).putAll("TGR", new String[] {
            "F"
        }).putAll("TLM", new String[] {
            "TR"
        }).putAll("TRA", new String[] {
            "T1", "T2", "T3"
        }).putAll("TCW", new String[] {
            "T1", "T2", "T3"
        }).build();
        MULTIMAP_TROPICAL = (new com.google.common.collect.ImmutableSetMultimap.Builder()).putAll("HU", new String[] {
            "W", "A", "S"
        }).putAll("HI", new String[] {
            "W", "A"
        }).putAll("TI", new String[] {
            "W", "A"
        }).putAll("TR", new String[] {
            "W", "A"
        }).putAll("TTP", new String[] {
            "S"
        }).putAll("TY", new String[] {
            "W", "A"
        }).build();
        MULTIMAP_OTHER = (new com.google.common.collect.ImmutableSetMultimap.Builder()).putAll("WC", new String[] {
            "W", "A", "Y"
        }).putAll("SU", new String[] {
            "W", "Y"
        }).putAll("EW", new String[] {
            "W"
        }).putAll("FG", new String[] {
            "Y"
        }).putAll("MF", new String[] {
            "Y"
        }).putAll("AF", new String[] {
            "Y"
        }).putAll("MH", new String[] {
            "Y"
        }).putAll("BW", new String[] {
            "Y"
        }).putAll("DS", new String[] {
            "W"
        }).putAll("DU", new String[] {
            "Y"
        }).putAll("EC", new String[] {
            "W", "A"
        }).putAll("EH", new String[] {
            "W", "A"
        }).putAll("EW", new String[] {
            "W"
        }).putAll("FG", new String[] {
            "Y"
        }).putAll("FR", new String[] {
            "Y"
        }).putAll("FW", new String[] {
            "W", "A", "TB"
        }).putAll("FZ", new String[] {
            "W", "A"
        }).putAll("GL", new String[] {
            "W", "A"
        }).putAll("HF", new String[] {
            "W", "A"
        }).putAll("HT", new String[] {
            "Y"
        }).putAll("HW", new String[] {
            "W", "A"
        }).putAll("HZ", new String[] {
            "W", "A"
        }).putAll("LO", new String[] {
            "Y"
        }).putAll("LW", new String[] {
            "Y"
        }).putAll("MA", new String[] {
            "W", "S"
        }).putAll("SE", new String[] {
            "W", "A"
        }).putAll("MS", new String[] {
            "Y"
        }).putAll("SM", new String[] {
            "Y"
        }).putAll("UP", new String[] {
            "W", "A", "Y"
        }).putAll("WI", new String[] {
            "Y"
        }).putAll("ZF", new String[] {
            "Y"
        }).putAll("TAD", new String[] {
            "TM"
        }).putAll("TCA", new String[] {
            "TE"
        }).putAll("TTW", new String[] {
            "TB"
        }).putAll("TCD", new String[] {
            "W"
        }).putAll("TCE", new String[] {
            "TM"
        }).putAll("TEQ", new String[] {
            "W"
        }).putAll("TEV", new String[] {
            "TB"
        }).putAll("TLC", new String[] {
            "TE"
        }).putAll("TLA", new String[] {
            "W"
        }).putAll("RB", new String[] {
            "W"
        }).putAll("SC", new String[] {
            "Y"
        }).putAll("SI", new String[] {
            "Y"
        }).putAll("SW", new String[] {
            "Y"
        }).putAll("TNM", new String[] {
            "TT"
        }).putAll("TST", new String[] {
            "F"
        }).putAll("TNS", new String[] {
            "F"
        }).putAll("TNU", new String[] {
            "W"
        }).putAll("TOF", new String[] {
            "F"
        }).putAll("TRE", new String[] {
            "TR"
        }).putAll("TRF", new String[] {
            "S"
        }).putAll("TRH", new String[] {
            "W"
        }).putAll("TSS", new String[] {
            "F"
        }).putAll("TSG", new String[] {
            "Y", "TL"
        }).putAll("TSL", new String[] {
            "S"
        }).putAll("TSP", new String[] {
            "W"
        }).putAll("TSF", new String[] {
            "F"
        }).putAll("TNO", new String[] {
            "TE"
        }).putAll("TVO", new String[] {
            "W"
        }).putAll("TZO", new String[] {
            "F"
        }).putAll("TOZ", new String[] {
            "TL", "W"
        }).putAll("TAQ", new String[] {
            "TL", "A", "W", "Y"
        }).putAll("TAP", new String[] {
            "A", "W"
        }).putAll("TWA", new String[] {
            "T1", "T2", "T3"
        }).putAll("THT", new String[] {
            "T1", "T2", "T3"
        }).putAll("TFF", new String[] {
            "T1", "T2", "T3"
        }).putAll("TWX", new String[] {
            "TM"
        }).build();
        MULTIMAP_THUNDER = (new com.google.common.collect.ImmutableSetMultimap.Builder()).putAll("SV", new String[] {
            "W", "A"
        }).putAll("SR", new String[] {
            "W", "A"
        }).putAll("TLM", new String[] {
            "TR"
        }).putAll("TSA", new String[] {
            "W", "A"
        }).putAll("TTS", new String[] {
            "T1", "T2", "T3"
        }).build();
        MULTIMAP_TORNADO = (new com.google.common.collect.ImmutableSetMultimap.Builder()).putAll("TO", new String[] {
            "W", "A"
        }).build();
        MULTIMAP_WINTER = (new com.google.common.collect.ImmutableSetMultimap.Builder()).putAll("BZ", new String[] {
            "W", "A"
        }).putAll("IS", new String[] {
            "W"
        }).putAll("LB", new String[] {
            "Y"
        }).putAll("LE", new String[] {
            "W", "A", "Y"
        }).putAll("WS", new String[] {
            "W", "A"
        }).putAll("ZR", new String[] {
            "Y"
        }).putAll("TAV", new String[] {
            "W", "A", "TB"
        }).putAll("WW", new String[] {
            "Y", "TB"
        }).putAll("TSI", new String[] {
            "T1", "T2", "T3"
        }).putAll("TFA", new String[] {
            "T1", "T2", "T3"
        }).putAll("TLT", new String[] {
            "T1", "T2", "T3"
        }).putAll("TAA", new String[] {
            "T1", "T2", "T3"
        }).build();
        ALERTS_OF_SIGNIFICANCE = ImmutableList.of(new AlertMapAndValue(MULTIMAP_WINTER, "wint"), new AlertMapAndValue(MULTIMAP_TORNADO, "tor"), new AlertMapAndValue(MULTIMAP_THUNDER, "thdr"), new AlertMapAndValue(MULTIMAP_OTHER, "oth"), new AlertMapAndValue(MULTIMAP_TROPICAL, "trop"), new AlertMapAndValue(MULTIMAP_FLOOD, "fld"));
        MULTIMAP_NO_BB = (new com.google.common.collect.ImmutableSetMultimap.Builder()).put("BZ", "W").put("WS", "W").put("IS", "W").put("HS", "W").put("LE", "W").put("HI", "W").put("HU", "W").put("TI", "W").put("TR", "W").put("MA", "W").put("SV", "W").put("TSA", "W").put("TO", "W").build();
        NO_BB_ALERTS = new AlertMapAndValue(MULTIMAP_NO_BB, "nobb");
    }
}
