// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Ordering;
import com.weather.commons.ui.SevereCondition;
import com.weather.dal2.data.TimeParseUtil;
import com.weather.util.TwcPreconditions;
import com.weather.util.app.AbstractTwcApplication;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.weather.commons.facade:
//            WeatherAlertIcon

public class WeatherAlert
    implements Comparable
{

    public static final String MASS_NEWS_PARAMETER_LABEL = "MND";
    public static final WeatherAlertIcon THUNDER_STORM_ICON;
    public static final WeatherAlertIcon TORNADO_ICON;
    private static final Pattern TROPICAL_CYCLONE_ID_PATTERN = Pattern.compile("\\s+((AL|EP|CP|WP)[0-9]{6})");
    public static final WeatherAlertIcon TROPICAL_ICON;
    public static final WeatherAlertIcon WINTER_ICON;
    private static final ImmutableMap alertIconCodes;
    private static final List phenomenaCodeSequence;
    private static final ImmutableSet tropicalPhenomenaCodes = ImmutableSet.of("HU", "HI", "HF", "TI", "TR", "TY", new String[0]);
    private final Long alertIssueTime;
    private final String areaId;
    private final String areaName;
    private final Long beginTime;
    private final String description;
    private final Long endTime;
    private final String etn;
    private final String headline;
    private final String issueOffice;
    private final String language;
    private final Map parameters;
    private final String phenomenaCode;
    private final String productIdentificationLbl;
    private final int severity;
    private final String significance;
    private final Integer textId;
    private final List warningText;

    public WeatherAlert(com.weather.dal2.data.WeatherAlertsRecord.WeatherAlertsDoc weatheralertsdoc)
    {
        int i = 4;
        super();
        com.weather.dal2.data.WeatherAlertsRecord.WeatherAlertsDoc.WeatherAlertsHeader weatheralertsheader = weatheralertsdoc.getWeatherAlertsHeader();
        com.weather.dal2.data.WeatherAlertsRecord.WeatherAlertsDoc.WeatherAlertsData weatheralertsdata = weatheralertsdoc.getWeatherAlertsData();
        Object obj = null;
        com.weather.dal2.data.WeatherAlertsRecord.WeatherAlertsDoc.WeatherAlertsHeader.WeatherAlertsEvent weatheralertsevent = null;
        if (weatheralertsheader != null)
        {
            com.weather.dal2.data.WeatherAlertsRecord.WeatherAlertsDoc.WeatherAlertsHeader.WeatherAlertsLocations weatheralertslocations = weatheralertsheader.getWeatherAlertsLocations();
            productIdentificationLbl = weatheralertsheader.getProductIdentificationLabel();
            obj = weatheralertslocations;
            if (weatheralertslocations != null)
            {
                weatheralertsevent = weatheralertsheader.getWeatherAlertsEvent();
                obj = weatheralertslocations;
            }
        } else
        {
            productIdentificationLbl = null;
        }
        if (weatheralertsdata != null)
        {
            alertIssueTime = weatheralertsdata.getAlertIssueTime();
        } else
        {
            alertIssueTime = null;
        }
        if (obj == null)
        {
            areaId = "";
            areaName = "";
        } else
        {
            areaId = ((com.weather.dal2.data.WeatherAlertsRecord.WeatherAlertsDoc.WeatherAlertsHeader.WeatherAlertsLocations) (obj)).getAreaId();
            areaName = ((com.weather.dal2.data.WeatherAlertsRecord.WeatherAlertsDoc.WeatherAlertsHeader.WeatherAlertsLocations) (obj)).getAreaName();
        }
        if (weatheralertsevent == null)
        {
            issueOffice = "";
            etn = "";
            phenomenaCode = "";
            significance = "";
            headline = "";
            description = "";
            textId = Integer.valueOf(0);
            severity = 4;
            beginTime = Long.valueOf(0L);
            endTime = Long.valueOf(0L);
            warningText = Collections.emptyList();
            parameters = Collections.emptyMap();
            language = "";
            return;
        }
        issueOffice = weatheralertsevent.getIssuingOfficeCode();
        etn = weatheralertsevent.getEventTrackingNumber();
        phenomenaCode = weatheralertsevent.getPhenomenaCode();
        significance = weatheralertsevent.getSignificance();
        headline = weatheralertsdoc.getHeadline();
        String s = weatheralertsevent.getDescription();
        obj = s;
        if (s == null)
        {
            obj = "";
        }
        description = ((String) (obj));
        textId = weatheralertsevent.getTwcInternalId();
        obj = weatheralertsevent.getSeverity();
        if (obj != null)
        {
            i = ((Integer) (obj)).intValue();
        }
        severity = i;
        beginTime = TimeParseUtil.gmtTextToLocalTimeSeconds(weatheralertsevent.getStartTimeISO(), Long.valueOf(System.currentTimeMillis()));
        endTime = TimeParseUtil.gmtTextToLocalTimeSeconds(weatheralertsevent.getEndTimeISO(), Long.valueOf(-1L));
        warningText = weatheralertsdoc.getNarrativeText();
        parameters = weatheralertsdoc.getParameters();
        language = weatheralertsdoc.getTextLanguage();
    }

    private static boolean areEqual(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public static String formatAlert(Iterable iterable)
    {
        if (iterable == null)
        {
            return null;
        }
        TwcPreconditions.checkContainsNoNullElements(iterable);
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag = true;
        String s = "";
        Iterator iterator = iterable.iterator();
        iterable = s;
        do
        {
            if (iterator.hasNext())
            {
                Object obj = (String)iterator.next();
                if (!((String) (obj)).equals(iterable))
                {
                    if (((String) (obj)).isEmpty())
                    {
                        stringbuilder.append("\n\n");
                        flag = true;
                        iterable = ((Iterable) (obj));
                    } else
                    {
                        if (flag)
                        {
                            boolean flag1 = false;
                            flag = flag1;
                            iterable = ((Iterable) (obj));
                            if (((String) (obj)).startsWith("."))
                            {
                                flag = flag1;
                                iterable = ((Iterable) (obj));
                                if (!((String) (obj)).startsWith(".."))
                                {
                                    iterable = ((String) (obj)).substring(1, ((String) (obj)).length());
                                    flag = flag1;
                                }
                            }
                        } else
                        {
                            stringbuilder.append(' ');
                            iterable = ((Iterable) (obj));
                        }
                        if ("amp".equals(iterable))
                        {
                            obj = "--";
                        } else
                        {
                            obj = iterable;
                        }
                        stringbuilder.append(((String) (obj)));
                    }
                }
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }

    public static WeatherAlertIcon getIconCode(String s, String s1)
    {
        s = (WeatherAlertIcon)alertIconCodes.get(s);
        if ("W".equals(s1) && s != null)
        {
            return s;
        } else
        {
            return WeatherAlertIcon.GENERIC;
        }
    }

    private static int getPhenomenaCodeInt(String s)
    {
        int j = phenomenaCodeSequence.indexOf(s);
        int i = j;
        if (j == -1)
        {
            i = phenomenaCodeSequence.size();
        }
        return i;
    }

    public int compareTo(WeatherAlert weatheralert)
    {
        return ComparisonChain.start().compare(getSeverity(), weatheralert.getSeverity()).compare(getPhenomenaCodeInt(getPhenomenaCode()), getPhenomenaCodeInt(weatheralert.getPhenomenaCode())).compare(getDescription(), weatheralert.getDescription()).compare(getHeadline(), weatheralert.getHeadline(), Ordering.natural().nullsLast()).compare(getSignificance(), weatheralert.getSignificance(), Ordering.natural().nullsLast()).compare(getIssueOffice(), weatheralert.getIssueOffice(), Ordering.natural().nullsLast()).compare(getAreaName(), weatheralert.getAreaName(), Ordering.natural().nullsLast()).result();
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((WeatherAlert)obj);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (WeatherAlert)obj;
            if (!areEqual(getAreaName(), ((WeatherAlert) (obj)).getAreaName()) || !areEqual(getDescription(), ((WeatherAlert) (obj)).getDescription()) || !areEqual(getHeadline(), ((WeatherAlert) (obj)).getHeadline()) || !areEqual(getIssueOffice(), ((WeatherAlert) (obj)).getIssueOffice()) || !areEqual(getPhenomenaCode(), ((WeatherAlert) (obj)).getPhenomenaCode()) || !areEqual(Integer.valueOf(getSeverity()), Integer.valueOf(((WeatherAlert) (obj)).getSeverity())) || !areEqual(getSignificance(), ((WeatherAlert) (obj)).getSignificance()))
            {
                return false;
            }
        }
        return true;
    }

    public Long getAlertIssueTime()
    {
        return alertIssueTime;
    }

    public String getAreaId()
    {
        return areaId;
    }

    public String getAreaName()
    {
        return areaName;
    }

    public Long getBeginTime()
    {
        return beginTime;
    }

    public String getDescription()
    {
        return description;
    }

    public Long getEndTime()
    {
        return endTime;
    }

    public String getEtn()
    {
        return etn;
    }

    public String getHeadline()
    {
        return headline;
    }

    public WeatherAlertIcon getIconCode()
    {
        return getIconCode(phenomenaCode, significance);
    }

    public String getIssueOffice()
    {
        return issueOffice;
    }

    public String getLanguage()
    {
        return language;
    }

    public Map getParameters()
    {
        return parameters;
    }

    public String getPhenomenaCode()
    {
        return phenomenaCode;
    }

    public String getProductIdentificationLabel()
    {
        return productIdentificationLbl;
    }

    public int getSeverity()
    {
        return severity;
    }

    public String getSignificance()
    {
        return significance;
    }

    public Integer getTextId()
    {
        return textId;
    }

    public String getTropicalCycloneId()
    {
        Iterator iterator = parameters.entrySet().iterator();
        Object obj1;
label0:
        do
        {
            if (iterator.hasNext())
            {
                Object obj = (java.util.Map.Entry)iterator.next();
                if (!"MND".equals(((java.util.Map.Entry) (obj)).getKey()))
                {
                    continue;
                }
                obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        continue label0;
                    }
                    obj1 = (String)((Iterator) (obj)).next();
                    obj1 = TROPICAL_CYCLONE_ID_PATTERN.matcher(((CharSequence) (obj1)));
                } while (!((Matcher) (obj1)).find());
                break;
            } else
            {
                return null;
            }
        } while (true);
        return ((Matcher) (obj1)).group(1);
    }

    public List getWarningText()
    {
        return warningText;
    }

    public int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        int j1;
        int k1;
        if (areaName == null)
        {
            i = 0;
        } else
        {
            i = areaName.hashCode();
        }
        j1 = description.hashCode();
        if (headline == null)
        {
            j = 0;
        } else
        {
            j = headline.hashCode();
        }
        if (issueOffice == null)
        {
            k = 0;
        } else
        {
            k = issueOffice.hashCode();
        }
        if (phenomenaCode == null)
        {
            l = 0;
        } else
        {
            l = phenomenaCode.hashCode();
        }
        k1 = severity;
        if (significance != null)
        {
            i1 = significance.hashCode();
        }
        return ((((((i + 31) * 31 + j1) * 31 + j) * 31 + k) * 31 + l) * 31 + k1) * 31 + i1;
    }

    public boolean isForTropicalCyclone()
    {
        return tropicalPhenomenaCodes.contains(phenomenaCode) && ("W".equals(significance) || "A".equals(significance) || "S".equals(significance));
    }

    public boolean isTropicalDiscussion()
    {
        return "TCD".equals(getProductIdentificationLabel()) || "TWD".equals(getProductIdentificationLabel());
    }

    public boolean isTropicalOutlook()
    {
        return "TWO".equals(getProductIdentificationLabel());
    }

    public boolean isTropicalPublicAdvisory()
    {
        String s = getProductIdentificationLabel();
        return "TCP".equals(s) || "TCU".equals(s);
    }

    public String toString()
    {
        return (new StringBuilder()).append(getHeadline()).append(", sev: ").append(getSeverity()).append(", phen: ").append(getPhenomenaCode()).toString();
    }

    static 
    {
        WINTER_ICON = WeatherAlertIcon.createFromSkyCode(16);
        TROPICAL_ICON = WeatherAlertIcon.createFromSkyCode(2);
        THUNDER_STORM_ICON = WeatherAlertIcon.createFromSevereCondition(SevereCondition.LIGHTNING);
        TORNADO_ICON = WeatherAlertIcon.createFromSkyCode(0);
        phenomenaCodeSequence = ImmutableList.copyOf(AbstractTwcApplication.getRootContext().getResources().getStringArray(com.weather.commons.R.array.severe_alert_phenomenaCode_sequence));
        alertIconCodes = ImmutableMap.builder().put("BZ", WINTER_ICON).put("WS", WINTER_ICON).put("IS", WINTER_ICON).put("HS", WINTER_ICON).put("LE", WINTER_ICON).put("HI", TROPICAL_ICON).put("HU", TROPICAL_ICON).put("TI", TROPICAL_ICON).put("TR", TROPICAL_ICON).put("MA", THUNDER_STORM_ICON).put("SV", THUNDER_STORM_ICON).put("TSA", THUNDER_STORM_ICON).put("TO", TORNADO_ICON).build();
    }
}
