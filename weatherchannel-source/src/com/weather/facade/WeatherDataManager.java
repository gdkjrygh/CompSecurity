// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.facade;

import android.content.Context;
import android.util.Log;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import com.weather.Weather.hourly.HourlyDataUnavailableEvent;
import com.weather.Weather.locations.LocationDisplayData;
import com.weather.Weather.locations.LocationDisplayItem;
import com.weather.Weather.service.NotificationService;
import com.weather.Weather.tenday.TenDayForecastUnavailableEvent;
import com.weather.Weather.widgets.AmazonWidget;
import com.weather.Weather.widgets.WeatherWidgetProvider;
import com.weather.commons.facade.AirportFacade;
import com.weather.commons.facade.AirportUnavailableEvent;
import com.weather.commons.facade.BoatAndBeachFacade;
import com.weather.commons.facade.BoatAndBeachUnavailableEvent;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.facade.DailyWeather;
import com.weather.commons.facade.DailyWeatherFacade;
import com.weather.commons.facade.FluFacade;
import com.weather.commons.facade.FluFacadeUnavailableEvent;
import com.weather.commons.facade.FollowMeCurrentWeatherFacade;
import com.weather.commons.facade.HourlyWeather;
import com.weather.commons.facade.HourlyWeatherFacade;
import com.weather.commons.facade.PollenFacade;
import com.weather.commons.facade.PollenUnavailableEvent;
import com.weather.commons.facade.SkiFacade;
import com.weather.commons.facade.SkiFacadeUnavailableEvent;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.service.AbstractNotificationService;
import com.weather.commons.video.VideoFeedConnection;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.data.HourlyForecastRecord;
import com.weather.dal2.data.MarineForecastRecord;
import com.weather.dal2.data.TideRecord;
import com.weather.dal2.dsx.AirportDelaysRecord;
import com.weather.dal2.dsx.DfRecord;
import com.weather.dal2.dsx.DiRecord;
import com.weather.dal2.dsx.MoDsxRecord;
import com.weather.dal2.dsx.RecordSets;
import com.weather.dal2.locations.CurrentLocation;
import com.weather.dal2.locations.CurrentLocationChangeEvent;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.FollowMeSnapshot;
import com.weather.dal2.locations.LocationsUnavailableEvent;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.system.TwcBus;
import com.weather.dal2.weatherconnections.RequestManager;
import com.weather.dal2.weatherconnections.WeatherDataError;
import com.weather.util.UnitType;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.date.TwcDateFormatter;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.ui.UIUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class WeatherDataManager
{

    private static final String TAG = "WeatherDataManager";
    private static final int dayPhraseIndicesWhenStartingWithDayPart[] = {
        0, 2, 4, 5, 6, 7, 8, 9, 10, 11, 
        12, 13, 14, 15, 16
    };
    private static final int dayPhraseIndicesWhenStartingWithNightPart[] = {
        -1, 1, 3, 5, 6, 7, 8, 9, 10, 11, 
        12, 13, 14, 15, 16
    };
    private static final int dayTitleIndicesWhenStartingWithDayPart[] = {
        0, 2, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1
    };
    private static final int dayTitleIndicesWhenStartingWithNightPart[] = {
        -1, 1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1
    };
    private static final int nightPhraseIndicesWhenStartingWithDayPart[] = {
        1, 3, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1
    };
    private static final int nightPhraseIndicesWhenStartingWithNightPart[] = {
        0, 2, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1
    };
    private static final int nightTitleIndicesWhenStartingWithDayPart[] = {
        1, 3, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1
    };
    private static final int nightTitleIndicesWhenStartingWithNightPart[] = {
        0, 2, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1
    };
    private final Map airportMap = new ConcurrentHashMap();
    private final Map boatAndBeachMap = new ConcurrentHashMap();
    private UnitType currentUnitType;
    private final Map currentWeatherMap = new ConcurrentHashMap();
    private final Map dailyWeatherMap = new ConcurrentHashMap();
    private final Map fluFacadeMap = new ConcurrentHashMap();
    private final Map hourlyWeatherMap = new ConcurrentHashMap();
    private AirportFacade lastAirportF;
    private BoatAndBeachFacade lastBoatAndBeachF;
    private CurrentWeatherFacade lastCWF;
    private DailyWeatherFacade lastDailyWeatherF;
    private FluFacade lastFluF;
    private FollowMeCurrentWeatherFacade lastFollowMeCWF;
    private HourlyWeatherFacade lastHourlyWF;
    private PollenFacade lastPollenF;
    private SkiFacade lastSkiF;
    private final LocationManager locationManager;
    private final Map pollenMap = new ConcurrentHashMap();
    private final Map skiFacadeMap = new ConcurrentHashMap();

    public WeatherDataManager(LocationManager locationmanager, UnitType unittype)
    {
        locationManager = locationmanager;
        currentUnitType = unittype;
    }

    private void clearData()
    {
        currentWeatherMap.clear();
        hourlyWeatherMap.clear();
        dailyWeatherMap.clear();
        pollenMap.clear();
        airportMap.clear();
        boatAndBeachMap.clear();
        fluFacadeMap.clear();
        skiFacadeMap.clear();
    }

    private void clearOldKeys()
    {
        HashSet hashset = new HashSet(locationManager.getAllLocations());
        currentWeatherMap.keySet().retainAll(hashset);
        hourlyWeatherMap.keySet().retainAll(hashset);
        dailyWeatherMap.keySet().retainAll(hashset);
        pollenMap.keySet().retainAll(hashset);
        airportMap.keySet().retainAll(hashset);
        boatAndBeachMap.keySet().retainAll(hashset);
        fluFacadeMap.keySet().retainAll(hashset);
        skiFacadeMap.keySet().retainAll(hashset);
    }

    protected static List extractPhrases(boolean flag, List list, boolean flag1, int i)
    {
        ArrayList arraylist = new ArrayList();
        int k = 0;
        while (k < i) 
        {
            String s;
            int j;
            if (flag)
            {
                if (flag1)
                {
                    j = dayPhraseIndicesWhenStartingWithDayPart[k];
                } else
                {
                    j = nightTitleIndicesWhenStartingWithDayPart[k];
                }
            } else
            if (flag1)
            {
                j = dayPhraseIndicesWhenStartingWithNightPart[k];
            } else
            {
                j = nightPhraseIndicesWhenStartingWithNightPart[k];
            }
            if (j != -1)
            {
                s = ((com.weather.dal2.data.DaypartIntlForecastRecord.DaypartIntlForecastDoc.DaypartIntlForecastData)list.get(j)).getForecastText();
            } else
            {
                s = null;
            }
            arraylist.add(s);
            k++;
        }
        return arraylist;
    }

    protected static List extractTitles(boolean flag, List list, boolean flag1, int i)
    {
        ArrayList arraylist = new ArrayList();
        String s1 = AbstractTwcApplication.getRootContext().getString(0x7f0702f7);
        String s2 = AbstractTwcApplication.getRootContext().getString(0x7f0702fa);
        int k = 0;
        do
        {
            while (k < i) 
            {
                int j;
                if (flag)
                {
                    if (flag1)
                    {
                        j = dayTitleIndicesWhenStartingWithDayPart[k];
                    } else
                    {
                        j = nightPhraseIndicesWhenStartingWithDayPart[k];
                    }
                } else
                if (flag1)
                {
                    j = dayTitleIndicesWhenStartingWithNightPart[k];
                } else
                {
                    j = nightTitleIndicesWhenStartingWithNightPart[k];
                }
                if (flag1 && j == -1 && k == 0)
                {
                    arraylist.add(null);
                } else
                {
                    String s;
                    if (j != -1)
                    {
                        s = ((com.weather.dal2.data.DaypartIntlForecastRecord.DaypartIntlForecastDoc.DaypartIntlForecastData)list.get(j)).getDayPartName();
                    } else
                    if (flag1)
                    {
                        s = s1;
                    } else
                    {
                        s = s2;
                    }
                    arraylist.add(s);
                }
                k++;
            }
            return arraylist;
        } while (true);
    }

    private AirportFacade getAirportFacade(SavedLocation savedlocation)
    {
        if (savedlocation == null)
        {
            return null;
        } else
        {
            return (AirportFacade)airportMap.get(savedlocation);
        }
    }

    private BoatAndBeachFacade getBoatAndBeachFacade(SavedLocation savedlocation)
    {
        if (savedlocation == null)
        {
            return null;
        } else
        {
            return (BoatAndBeachFacade)boatAndBeachMap.get(savedlocation);
        }
    }

    private FluFacade getFluFacade(SavedLocation savedlocation)
    {
        if (savedlocation == null)
        {
            return null;
        } else
        {
            return (FluFacade)fluFacadeMap.get(savedlocation);
        }
    }

    private SkiFacade getSkiFacade(SavedLocation savedlocation)
    {
        if (savedlocation == null)
        {
            return null;
        } else
        {
            return (SkiFacade)skiFacadeMap.get(savedlocation);
        }
    }

    private static String getTimeOffSet(RecordSets recordsets)
    {
        String s = null;
        recordsets = recordsets.wxdv2DHRecord.getDhDoc();
        if (recordsets != null)
        {
            recordsets = recordsets.getDhHeader();
        } else
        {
            recordsets = null;
        }
        if (recordsets != null)
        {
            s = recordsets.getProcessTimeLocal();
        }
        return TwcDateFormatter.getTimeOffset(s);
    }

    private AirportFacade makeAirportFacade(SavedLocation savedlocation, RecordSets recordsets, UnitType unittype)
    {
        if (savedlocation != null && recordsets.hasDataFor(savedlocation))
        {
            recordsets = recordsets.wxdv2airportDelays;
            if (recordsets != null && recordsets.getAirportDelayItems() != null)
            {
                recordsets = new AirportFacade(recordsets, unittype);
                airportMap.put(savedlocation, recordsets);
                return recordsets;
            }
        }
        return null;
    }

    private BoatAndBeachFacade makeBoatAndBeachFacade(SavedLocation savedlocation, RecordSets recordsets)
    {
        if (savedlocation != null && recordsets.hasDataFor(savedlocation))
        {
            com.weather.dal2.dsx.WmRecord wmrecord = recordsets.wxdv2WMRecord;
            recordsets = recordsets.wxdv2TIRecord;
            if (wmrecord != null && recordsets != null && recordsets.getTideDoc() != null && wmrecord.getMarineForecastDoc() != null)
            {
                recordsets = new BoatAndBeachFacade(recordsets, wmrecord);
                boatAndBeachMap.put(savedlocation, recordsets);
                return recordsets;
            }
        }
        return null;
    }

    private CurrentWeatherFacade makeCurrentWeather(SavedLocation savedlocation, RecordSets recordsets)
    {
        recordsets = makeCurrentWeatherFacade(savedlocation, recordsets, currentUnitType);
        currentWeatherMap.put(savedlocation, recordsets);
        return recordsets;
    }

    public static CurrentWeatherFacade makeCurrentWeatherFacade(SavedLocation savedlocation, RecordSets recordsets, UnitType unittype)
    {
        Preconditions.checkNotNull(recordsets);
        Preconditions.checkNotNull(savedlocation);
        Preconditions.checkNotNull(unittype);
        if (!recordsets.hasDataFor(savedlocation))
        {
            return new CurrentWeatherFacade(unittype);
        }
        com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc currentconditionsdoc = recordsets.wxdv2MORecord.getMoDoc();
        com.weather.dal2.dsx.DfRecord.DfDoc dfdoc = recordsets.wxdv2DFRecord.getDailyForecastDoc();
        if (dfdoc == null || currentconditionsdoc == null)
        {
            return new CurrentWeatherFacade(unittype);
        } else
        {
            com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsHeader currentconditionsheader = currentconditionsdoc.getMoHeader();
            return new CurrentWeatherFacade(recordsets, currentconditionsdoc.getMoData(), currentconditionsheader, (com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastData)dfdoc.getDailyForecastData().get(0), recordsets.wxdv2BERecord, unittype, savedlocation);
        }
    }

    private DailyWeatherFacade makeDailyWeather(SavedLocation savedlocation, RecordSets recordsets)
    {
        Object obj = new ArrayList();
        if (savedlocation == null || recordsets == null)
        {
            recordsets = new DailyWeatherFacade(((java.util.Collection) (obj)));
        } else
        {
            if (!recordsets.hasDataFor(savedlocation))
            {
                return null;
            }
            obj = makeDailyWeatherFacade(recordsets, ((ArrayList) (obj)), savedlocation, currentUnitType);
            recordsets = ((RecordSets) (obj));
            if (obj != null)
            {
                dailyWeatherMap.put(savedlocation, obj);
                return ((DailyWeatherFacade) (obj));
            }
        }
        return recordsets;
    }

    public static DailyWeatherFacade makeDailyWeatherFacade(RecordSets recordsets, ArrayList arraylist, SavedLocation savedlocation, UnitType unittype)
    {
        Preconditions.checkNotNull(recordsets);
        Preconditions.checkNotNull(arraylist);
        Preconditions.checkNotNull(savedlocation);
        Preconditions.checkNotNull(unittype);
        com.weather.dal2.dsx.DfRecord.DfDoc dfdoc = recordsets.wxdv2DFRecord.getDailyForecastDoc();
        com.weather.dal2.data.DaypartIntlForecastRecord.DaypartIntlForecastDoc daypartintlforecastdoc = recordsets.wxdv2DIRecord.getDiDoc();
        if (daypartintlforecastdoc != null && dfdoc != null)
        {
            recordsets = dfdoc.getDailyForecastData();
            List list3 = daypartintlforecastdoc.getDiData();
            if (list3 != null)
            {
                boolean flag1 = startsWithDayPart(list3);
                int i = recordsets.size();
                List list = extractPhrases(flag1, list3, true, i);
                List list1 = extractPhrases(flag1, list3, false, i);
                List list2 = extractTitles(flag1, list3, true, i);
                list3 = extractTitles(flag1, list3, false, i);
                i = 0;
                while (i < recordsets.size()) 
                {
                    boolean flag;
                    if (i == 0)
                    {
                        flag = flag1;
                    } else
                    {
                        flag = true;
                    }
                    arraylist.add(new DailyWeather(flag, (com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastData)recordsets.get(i), unittype, (String)list.get(i), (String)list1.get(i), (String)list2.get(i), (String)list3.get(i)));
                    i++;
                }
                return new DailyWeatherFacade(arraylist, savedlocation);
            }
        }
        return null;
    }

    private void makeFacades(RecordSets recordsets)
    {
        Object obj = locationManager.getFollowMeLocation();
        if (obj != null && recordsets.hasDataFor(((SavedLocation) (obj))))
        {
            makeFacades(recordsets, ((SavedLocation) (obj)));
        }
        obj = locationManager.getFixedLocations().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            SavedLocation savedlocation = (SavedLocation)((Iterator) (obj)).next();
            if (recordsets.hasDataFor(savedlocation))
            {
                makeFacades(recordsets, savedlocation);
            }
        } while (true);
        obj = locationManager.getWidgetLocations().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            SavedLocation savedlocation1 = (SavedLocation)((Iterator) (obj)).next();
            if (recordsets.hasDataFor(savedlocation1))
            {
                makeFacades(recordsets, savedlocation1);
            }
        } while (true);
    }

    private void makeFacades(RecordSets recordsets, SavedLocation savedlocation)
    {
        CurrentWeatherFacade currentweatherfacade = makeCurrentWeather(savedlocation, recordsets);
        if (recordsets.hasDataFor(savedlocation))
        {
            updateWidgets(savedlocation, currentweatherfacade, getTimeOffSet(recordsets));
        }
        makeHourlyWeather(savedlocation, recordsets);
        makeDailyWeather(savedlocation, recordsets);
        makePollen(savedlocation, recordsets);
        makeAirportFacade(savedlocation, recordsets, currentUnitType);
        makeBoatAndBeachFacade(savedlocation, recordsets);
        makeFluFacade(savedlocation, recordsets);
        makeSkiFacade(savedlocation, recordsets);
    }

    private FluFacade makeFluFacade(SavedLocation savedlocation, RecordSets recordsets)
    {
        if (savedlocation != null && recordsets.hasDataFor(savedlocation))
        {
            recordsets = recordsets.wxdv2PastFlu;
            if (recordsets != null)
            {
                recordsets = new FluFacade(recordsets);
                fluFacadeMap.put(savedlocation, recordsets);
                return recordsets;
            }
        }
        return null;
    }

    private HourlyWeatherFacade makeHourlyWeather(SavedLocation savedlocation, RecordSets recordsets)
    {
        if (savedlocation == null || recordsets == null)
        {
            recordsets = new HourlyWeatherFacade(Lists.newArrayList());
        } else
        {
            if (!recordsets.hasDataFor(savedlocation))
            {
                return null;
            }
            HourlyWeatherFacade hourlyweatherfacade = makeHourlyWeatherFacade(savedlocation, recordsets, currentUnitType);
            recordsets = hourlyweatherfacade;
            if (hourlyweatherfacade != null)
            {
                hourlyWeatherMap.put(savedlocation, hourlyweatherfacade);
                return hourlyweatherfacade;
            }
        }
        return recordsets;
    }

    public static HourlyWeatherFacade makeHourlyWeatherFacade(SavedLocation savedlocation, RecordSets recordsets, UnitType unittype)
    {
        Preconditions.checkNotNull(recordsets);
        Preconditions.checkNotNull(savedlocation);
        Preconditions.checkNotNull(unittype);
        ArrayList arraylist = new ArrayList();
        Object obj = recordsets.wxdv2DHRecord.getDhDoc();
        if (obj != null)
        {
            recordsets = getTimeOffSet(recordsets);
            obj = ((com.weather.dal2.data.HourlyForecastRecord.HourlyForecastDoc) (obj)).getDhData();
            if (obj != null)
            {
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(new HourlyWeather((com.weather.dal2.data.HourlyForecastRecord.HourlyForecastDoc.HourlyForecastData)((Iterator) (obj)).next(), recordsets, unittype))) { }
            }
            return new HourlyWeatherFacade(arraylist, savedlocation);
        } else
        {
            return null;
        }
    }

    private PollenFacade makePollen(SavedLocation savedlocation, RecordSets recordsets)
    {
        while (savedlocation == null || recordsets == null || !recordsets.hasDataFor(savedlocation)) 
        {
            return null;
        }
        recordsets = new PollenFacade(recordsets.wxdv2Pollen, recordsets.wxdv2IDRecord);
        pollenMap.put(savedlocation, recordsets);
        return recordsets;
    }

    private SkiFacade makeSkiFacade(SavedLocation savedlocation, RecordSets recordsets)
    {
        if (savedlocation != null && recordsets.hasDataFor(savedlocation))
        {
            recordsets = recordsets.wxdv2SkiResorts;
            if (recordsets != null)
            {
                recordsets = new SkiFacade(recordsets);
                skiFacadeMap.put(savedlocation, recordsets);
                return recordsets;
            }
        }
        return null;
    }

    private void postAirport(SavedLocation savedlocation)
    {
        if (savedlocation == null)
        {
            savedlocation = null;
        } else
        {
            savedlocation = getAirportFacade(savedlocation);
        }
        if (savedlocation != null)
        {
            lastAirportF = savedlocation;
            DataAccessLayer.BUS.post(savedlocation);
            return;
        } else
        {
            lastAirportF = null;
            DataAccessLayer.BUS.post(AirportUnavailableEvent.INSTANCE);
            return;
        }
    }

    private void postBoatAndBeach(SavedLocation savedlocation)
    {
        if (savedlocation == null)
        {
            savedlocation = null;
        } else
        {
            savedlocation = getBoatAndBeachFacade(savedlocation);
        }
        if (savedlocation != null)
        {
            lastBoatAndBeachF = savedlocation;
            DataAccessLayer.BUS.post(savedlocation);
            return;
        } else
        {
            lastBoatAndBeachF = null;
            DataAccessLayer.BUS.post(BoatAndBeachUnavailableEvent.INSTANCE);
            return;
        }
    }

    private void postCurrentWeather(SavedLocation savedlocation)
    {
        savedlocation = getCurrentWeatherFacade(savedlocation);
        lastCWF = savedlocation;
        DataAccessLayer.BUS.post(savedlocation);
    }

    private void postDailyWeather(SavedLocation savedlocation)
    {
        if (savedlocation == null)
        {
            savedlocation = null;
        } else
        {
            savedlocation = getDailyWeatherFacade(savedlocation);
        }
        if (savedlocation == null)
        {
            lastDailyWeatherF = null;
            DataAccessLayer.BUS.post(TenDayForecastUnavailableEvent.INSTANCE);
            return;
        } else
        {
            lastDailyWeatherF = savedlocation;
            DataAccessLayer.BUS.post(savedlocation);
            return;
        }
    }

    private void postFacades(SavedLocation savedlocation)
    {
        postCurrentWeather(savedlocation);
        postHourlyWeather(savedlocation);
        postDailyWeather(savedlocation);
        postPollen(savedlocation);
        postAirport(savedlocation);
        postBoatAndBeach(savedlocation);
        postFlu(savedlocation);
        postSki(savedlocation);
    }

    private void postFlu(SavedLocation savedlocation)
    {
        if (savedlocation == null)
        {
            savedlocation = null;
        } else
        {
            savedlocation = getFluFacade(savedlocation);
        }
        if (savedlocation != null)
        {
            lastFluF = savedlocation;
            DataAccessLayer.BUS.post(savedlocation);
            return;
        } else
        {
            lastFluF = null;
            DataAccessLayer.BUS.post(FluFacadeUnavailableEvent.INSTANCE);
            return;
        }
    }

    private void postFollowMeConditions(SavedLocation savedlocation)
    {
        lastFollowMeCWF = new FollowMeCurrentWeatherFacade(getCurrentWeatherFacade(savedlocation));
        DataAccessLayer.BUS.post(lastFollowMeCWF);
    }

    private void postHourlyWeather(SavedLocation savedlocation)
    {
        if (savedlocation == null)
        {
            savedlocation = null;
        } else
        {
            savedlocation = getHourlyWeatherFacade(savedlocation);
        }
        if (savedlocation == null)
        {
            lastHourlyWF = null;
            DataAccessLayer.BUS.post(HourlyDataUnavailableEvent.INSTANCE);
            return;
        } else
        {
            lastHourlyWF = savedlocation;
            DataAccessLayer.BUS.post(savedlocation);
            return;
        }
    }

    private void postNotification(SavedLocation savedlocation)
    {
        Context context;
        CurrentWeatherFacade currentweatherfacade = getCurrentWeatherFacade(savedlocation);
        if (savedlocation == null || !savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.temperature) || currentweatherfacade.isEmpty())
        {
            break MISSING_BLOCK_LABEL_47;
        }
        context = AbstractTwcApplication.getRootContext();
        savedlocation = AbstractNotificationService.createNotificationIntentWithWeather(context, currentweatherfacade, savedlocation, com/weather/Weather/service/NotificationService);
        context.startService(savedlocation);
        return;
        savedlocation;
        Log.e("WeatherDataManager", savedlocation.toString(), savedlocation);
        return;
    }

    private void postPollen(SavedLocation savedlocation)
    {
        if (savedlocation == null)
        {
            savedlocation = null;
        } else
        {
            savedlocation = getPollenFacade(savedlocation);
        }
        if (savedlocation != null)
        {
            lastPollenF = savedlocation;
            DataAccessLayer.BUS.post(savedlocation);
            return;
        } else
        {
            lastPollenF = null;
            DataAccessLayer.BUS.post(PollenUnavailableEvent.INSTANCE);
            return;
        }
    }

    private void postSki(SavedLocation savedlocation)
    {
        if (savedlocation == null)
        {
            savedlocation = null;
        } else
        {
            savedlocation = getSkiFacade(savedlocation);
        }
        if (savedlocation != null)
        {
            lastSkiF = savedlocation;
            DataAccessLayer.BUS.post(savedlocation);
            return;
        } else
        {
            lastSkiF = null;
            DataAccessLayer.BUS.post(SkiFacadeUnavailableEvent.INSTANCE);
            return;
        }
    }

    private static boolean startsWithDayPart(List list)
    {
        boolean flag1 = false;
        String s = ((com.weather.dal2.data.DaypartIntlForecastRecord.DaypartIntlForecastDoc.DaypartIntlForecastData)list.get(0)).getForecastDateLocal();
        list = ((com.weather.dal2.data.DaypartIntlForecastRecord.DaypartIntlForecastDoc.DaypartIntlForecastData)list.get(1)).getForecastDateLocal();
        boolean flag = flag1;
        if (s != null)
        {
            flag = flag1;
            if (list != null)
            {
                flag = flag1;
                if (s.equals(list))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private static void updateWidgets(SavedLocation savedlocation, CurrentWeatherFacade currentweatherfacade, String s)
    {
        Object obj = savedlocation.getWidgetIds();
        ArrayList arraylist = Lists.newArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            int i = ((Integer)((Iterator) (obj)).next()).intValue();
            if (i != -1)
            {
                arraylist.add(Integer.valueOf(i));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            savedlocation = WeatherWidgetProvider.getRefreshBroadcastIntent(Ints.toArray(arraylist), currentweatherfacade, savedlocation, s);
            AbstractTwcApplication.getRootContext().sendBroadcast(savedlocation);
        }
    }

    public CurrentWeatherFacade getCurrentWeatherFacade(SavedLocation savedlocation)
    {
        if (savedlocation != null)
        {
            savedlocation = (CurrentWeatherFacade)currentWeatherMap.get(savedlocation);
            if (savedlocation != null)
            {
                return savedlocation;
            }
        }
        return new CurrentWeatherFacade(currentUnitType);
    }

    public DailyWeatherFacade getDailyWeatherFacade(SavedLocation savedlocation)
    {
        if (savedlocation == null)
        {
            return null;
        } else
        {
            return (DailyWeatherFacade)dailyWeatherMap.get(savedlocation);
        }
    }

    public FollowMeCurrentWeatherFacade getFollowMeCurrentWeatherFacade()
    {
        if (LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
        {
            return lastFollowMeCWF;
        } else
        {
            return null;
        }
    }

    public HourlyWeatherFacade getHourlyWeatherFacade(SavedLocation savedlocation)
    {
        if (savedlocation == null)
        {
            return null;
        } else
        {
            return (HourlyWeatherFacade)hourlyWeatherMap.get(savedlocation);
        }
    }

    public AirportFacade getLastAirportFacade()
    {
        return lastAirportF;
    }

    public BoatAndBeachFacade getLastBoatAndBeachFacade()
    {
        return lastBoatAndBeachF;
    }

    public CurrentWeatherFacade getLastCurrentWeatherFacade()
    {
        return lastCWF;
    }

    public DailyWeatherFacade getLastDailyWeatherFacade()
    {
        return lastDailyWeatherF;
    }

    public FluFacade getLastFluFacade()
    {
        return lastFluF;
    }

    public HourlyWeatherFacade getLastHourlyWeatherFacade()
    {
        return lastHourlyWF;
    }

    public PollenFacade getLastPollenFacade()
    {
        return lastPollenF;
    }

    public SkiFacade getLastSkiFacade()
    {
        return lastSkiF;
    }

    public LocationDisplayData getLocationDisplayData()
    {
        Object obj = locationManager.getFixedLocations();
        int j = ((List) (obj)).size();
        com.weather.Weather.locations.LocationDisplayData.Builder builder = LocationDisplayData.builder(j);
        for (int i = 0; i < j; i++)
        {
            SavedLocation savedlocation = (SavedLocation)((List) (obj)).get(i);
            builder.setItem(i, new LocationDisplayItem(getCurrentWeatherFacade(savedlocation), savedlocation));
        }

        obj = locationManager.getFollowMeLocation();
        if (obj != null)
        {
            builder.setFollowMe(new LocationDisplayItem(getCurrentWeatherFacade(((SavedLocation) (obj))), ((SavedLocation) (obj))));
        }
        return builder.build();
    }

    public PollenFacade getPollenFacade(SavedLocation savedlocation)
    {
        if (savedlocation == null)
        {
            return null;
        } else
        {
            return (PollenFacade)pollenMap.get(savedlocation);
        }
    }

    public void onChange(CurrentLocationChangeEvent currentlocationchangeevent)
    {
        currentlocationchangeevent = CurrentLocation.getInstance().getLocation();
        LogUtil.v("WeatherDataManager", LoggingMetaTags.TWC_GENERAL, (new StringBuilder()).append("onChange location=").append(currentlocationchangeevent).toString(), new Object[0]);
        postFacades(currentlocationchangeevent);
        updateLocationDisplayData();
    }

    public void onChange(UnitType unittype)
    {
        clearData();
        currentUnitType = unittype;
        RequestManager.getInstance().doForcedRefresh();
    }

    public void onLocationsUnavailable(LocationsUnavailableEvent locationsunavailableevent)
    {
        clearData();
        LogUtil.v("WeatherDataManager", LoggingMetaTags.TWC_GENERAL, "onLocationsUnavailable", new Object[0]);
        postFacades(null);
    }

    public void onReceiveWeatherData(RecordSets recordsets)
    {
        makeFacades(recordsets);
        postOnGoingTemperatureNotifications();
        SavedLocation savedlocation = locationManager.getCurrentLocation();
        if (savedlocation != null && recordsets.hasDataFor(savedlocation))
        {
            LogUtil.v("WeatherDataManager", LoggingMetaTags.TWC_GENERAL, (new StringBuilder()).append("onReceiveWeatherData curLoc=").append(savedlocation).toString(), new Object[0]);
            postFacades(savedlocation);
        }
        savedlocation = locationManager.getFollowMeLocation();
        if (savedlocation != null && recordsets.hasDataFor(savedlocation))
        {
            postFollowMeConditions(savedlocation);
            if (UIUtil.isAmazonMobile(AbstractTwcApplication.getRootContext()))
            {
                recordsets = AmazonWidget.getVideoType();
                VideoFeedConnection.getInstance().asyncFetch(recordsets, false, AmazonWidget.videoReceiver, recordsets);
            }
        }
        updateLocationDisplayData();
        clearOldKeys();
    }

    public void onWeatherDataError(WeatherDataError weatherdataerror)
    {
        if (!weatherdataerror.postedStaleData())
        {
            if (CurrentLocation.getInstance().isCurrentLocation(weatherdataerror.getLocation()))
            {
                LogUtil.v("WeatherDataManager", LoggingMetaTags.TWC_GENERAL, "onWeatherDataError", new Object[0]);
                postFacades(null);
                updateLocationDisplayData();
            }
            updateWidgets(weatherdataerror.getLocation(), null, null);
        }
    }

    public void postOnGoingTemperatureNotifications()
    {
        SavedLocation savedlocation = (new FollowMeSnapshot()).getLocation();
        if (savedlocation != null && savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.temperature))
        {
            postNotification(savedlocation);
        } else
        {
            Iterator iterator = FixedLocations.getInstance().viewLocations().iterator();
            while (iterator.hasNext()) 
            {
                SavedLocation savedlocation1 = (SavedLocation)iterator.next();
                if (savedlocation1.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.temperature))
                {
                    postNotification(savedlocation1);
                }
            }
        }
    }

    public void setUnitType(UnitType unittype)
    {
        currentUnitType = unittype;
    }

    public void updateLocationDisplayData()
    {
        DataAccessLayer.BUS.post(getLocationDisplayData());
    }

}
