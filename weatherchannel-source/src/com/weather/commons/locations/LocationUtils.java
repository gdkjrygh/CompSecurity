// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.locations;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.weather.dal2.locations.Fetcher;
import com.weather.dal2.locations.LocationChoiceConnection;
import com.weather.dal2.locations.LocationConnection;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.net.Receiver;
import com.weather.util.ExceptionUtil;
import com.weather.util.StringUtils;
import com.weather.util.ZipCodeUtils;
import com.weather.util.device.LocaleUtil;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.weather.commons.locations:
//            LocationManager, LocationReceiver

public final class LocationUtils
{
    private static class GibberishPredicate
        implements Predicate
    {

        public volatile boolean apply(Object obj)
        {
            return apply((String)obj);
        }

        public boolean apply(String s)
        {
            return !StringUtils.hasAnyDigits(s) || ZipCodeUtils.isZipCode(s);
        }

        private GibberishPredicate()
        {
        }

    }

    public static class LatLong
    {

        final String lat;
        final String lng;

        LatLong(String s, String s1)
        {
            lat = s.substring(0, Math.min(12, s.length()));
            lng = s1.substring(0, Math.min(12, s1.length()));
        }
    }

    private static class LocIdPredicate
        implements Predicate
    {

        public volatile boolean apply(Object obj)
        {
            return apply((String)obj);
        }

        public boolean apply(String s)
        {
            return s != null && s.length() > 2 && Character.isLetter(s.charAt(0)) && Character.isLetter(s.charAt(1)) && StringUtils.hasAnyDigits(s) && StringUtils.hasOnlyLettersDigits(s);
        }

        private LocIdPredicate()
        {
        }

    }

    private static class LocationChoiceReceiver
        implements Receiver
    {

        private static final String TAG = "LocationUtils.LocationChoiceReceiver";

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((List)obj, (LocationReceiver.UserData)obj1);
        }

        public void onCompletion(List list, LocationReceiver.UserData userdata)
        {
            if (!list.isEmpty())
            {
                list = (Fetcher)list.get(0);
                LogUtil.d("LocationUtils.LocationChoiceReceiver", LoggingMetaTags.TWC_DEEPLINK, "onCompletion: userData=%s, fetcher=%s", new Object[] {
                    userdata, list
                });
                list.fetch(new LocationReceiver(com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.CLICK_THRU), userdata);
                return;
            } else
            {
                LogUtil.d("LocationUtils.LocationChoiceReceiver", LoggingMetaTags.TWC_DEEPLINK, "onCompletion: userData=%s, no result.", new Object[] {
                    userdata
                });
                return;
            }
        }

        public void onError(Throwable throwable, LocationReceiver.UserData userdata)
        {
            ExceptionUtil.logExceptionWarning("LocationUtils.LocationChoiceReceiver", (new StringBuilder()).append("onError: location=").append(userdata).toString(), throwable);
        }

        public volatile void onError(Throwable throwable, Object obj)
        {
            onError(throwable, (LocationReceiver.UserData)obj);
        }

        private LocationChoiceReceiver()
        {
        }

    }


    private static final Pattern GENERIC_LOC_PATTERN;
    private static final Pattern LAT_LONG_PATTERN = Pattern.compile("(?<!\\d)([-+]?(?:[1-8]?\\d(?:\\.\\d+)?|90(?:\\.0+)?)),\\s*([-+]?(?:180(?:\\.0+)?|(?:(?:1[0-7]\\d)|(?:[1-9]?\\d))(?:\\.\\d+)?))(?!\\d)");
    private static final String TAG = "LocationUtils";
    private static final Pattern TYPE_1_LOC_PATTERN;
    private static final Pattern TYPE_27_LOC_PATTERN;
    private static final Pattern TYPE_4_US_LOC_PATTERN;
    private static final Pattern TYPE_9_LOC_PATTERN;
    private static final List locIdPatterns;
    private static final ImmutableMap states = (new com.google.common.collect.ImmutableMap.Builder()).put("AL", new String[] {
        "Alabama", "Montgomery", "USAL0375:1:US"
    }).put("AK", new String[] {
        "Alaska", "Juneau", "USAK0116:1:US"
    }).put("AZ", new String[] {
        "Arizona", "Phoenix", "USAZ0166:1:US"
    }).put("AR", new String[] {
        "Arkansas", "Little Rock", "USAR0336:1:US"
    }).put("CA", new String[] {
        "California", "Sacramento", "USCA0967:1:US"
    }).put("CO", new String[] {
        "Colorado", "Denver", "USCO0105:1:US"
    }).put("CT", new String[] {
        "Connecticut", "Hartford", "USCT0094:1:US"
    }).put("DE", new String[] {
        "Delaware", "Dover", "USDE0012:1:US"
    }).put("FL", new String[] {
        "Florida", "Tallahassee", "USFL0479:1:US"
    }).put("GA", new String[] {
        "Georgia", "Atlanta", "USGA0028:1:US"
    }).put("HI", new String[] {
        "Hawaii", "Honolulu", "USHI0026:1:US"
    }).put("ID", new String[] {
        "Idaho", "Boise", "USID0025:1:US"
    }).put("IL", new String[] {
        "Illinois", "Springfield", "USMO0828:1:US"
    }).put("IN", new String[] {
        "Indiana", "Indianapolis", "USIN0305:1:US"
    }).put("IA", new String[] {
        "Iowa", "Des Moines", "USIA0231:1:US"
    }).put("KS", new String[] {
        "Kansas", "Topeka", "USKS0571:1:US"
    }).put("KY", new String[] {
        "Kentucky", "Frankfort", "USKY0919:1:US"
    }).put("LA", new String[] {
        "Louisiana", "Baton Rouge", "USLA003:1:US"
    }).put("ME", new String[] {
        "Maine", "Augusta", "USGA0032:1:US"
    }).put("MD", new String[] {
        "Maryland", "Annapolis", "USMD0010:1:US"
    }).put("MA", new String[] {
        "Massachusetts", "Boston", "USMA0046:1:US"
    }).put("MI", new String[] {
        "Michigan", "Lansing", "USMI0477:1:US"
    }).put("MN", new String[] {
        "Minnesota", "St. Paul", "USMN0664:1:US"
    }).put("MS", new String[] {
        "Mississippi", "Jackson", "USMS0175:1:US"
    }).put("MO", new String[] {
        "Missouri", "Jefferson City", "USMO0453:1:US"
    }).put("MT", new String[] {
        "Montana", "Helena", "USMT0163:1:US"
    }).put("NE", new String[] {
        "Nebraska", "Lincoln", "USNE0283:1:US"
    }).put("NV", new String[] {
        "Nevada", "Carson City", "USNV0014:1:US"
    }).put("NH", new String[] {
        "New Hampshire", "Concord", "USNH0045:1:US"
    }).put("NJ", new String[] {
        "New Jersey", "Trenton", "USNJ0524:1:US"
    }).put("NM", new String[] {
        "New Mexico", "Santa Fe", "USNM0292:1:US"
    }).put("NY", new String[] {
        "New York", "Albany", "USNY0011:1:US"
    }).put("NC", new String[] {
        "North Carolina", "Raleigh", "USNC0558:1:US"
    }).put("ND", new String[] {
        "North Dakota", "Bismarck", "USND0037:1:US"
    }).put("OH", new String[] {
        "Ohio", "Columbus", "USOH0212:1:US"
    }).put("OK", new String[] {
        "Oklahoma", "Oklahoma City", "USOK0400:1:US"
    }).put("OR", new String[] {
        "Oregon", "Salem", "USOR0304:1:US"
    }).put("PA", new String[] {
        "Pennsylvania", "Harrisburg", "USPA0679:1:US"
    }).put("RI", new String[] {
        "Rhode Island", "Providence", "USRI0050:1:US"
    }).put("SC", new String[] {
        "South Carolina", "Columbia", "USMO0193:1:US"
    }).put("SD", new String[] {
        "South Dakota", "Pierre", "USSD0269:1:US"
    }).put("TN", new String[] {
        "Tennessee", "Nashville", "USTN0357:1:US"
    }).put("TX", new String[] {
        "Texas", "Austin", "USTX0057:1:US"
    }).put("UT", new String[] {
        "Utah", "Salt Lake City", "USUT0225:1:US"
    }).put("VT", new String[] {
        "Vermont", "Montpelier", "USVT0147:1:US"
    }).put("VA", new String[] {
        "Virginia", "Richmond", "USVA0652:1:US"
    }).put("WA", new String[] {
        "Washington", "Olympia", "USWA0318:1:US"
    }).put("WV", new String[] {
        "West Virginia", "Charleston", "USSC0051:1:US"
    }).put("WI", new String[] {
        "Wisconsin", "Madison", "USWI0411:1:US"
    }).put("WY", new String[] {
        "Wyoming", "Cheyenne", "USWY0032:1:US"
    }).put("DC", new String[] {
        "Washington D.C.", "Washington D.C.", "USDC0001:1:US"
    }).put("AS", new String[] {
        "American Samoa", "Pago Pago", "USAS0001:1:US"
    }).put("GU", new String[] {
        "Guam", "Hag\345t\361a", "USGU0001:1:US"
    }).put("MP", new String[] {
        "Northern Mariana Islands", "Saipan", "USMP0001:1:US"
    }).put("PR", new String[] {
        "Puerto Rico", "San Juan", "USPR0087:1:US"
    }).put("VI", new String[] {
        "U.S. Virgin Islands", "Charlotte Amalie", "USVI0051:1:US"
    }).build();

    private LocationUtils()
    {
    }

    public static boolean addLocationFromUri(Uri uri)
    {
        LogUtil.d("LocationUtils", LoggingMetaTags.TWC_DEEPLINK, "addLocationFromUri uri=%s", new Object[] {
            uri
        });
        boolean flag1 = false;
        LocationReceiver.UserData userdata = getReceiverUserData(uri);
        boolean flag = flag1;
        if ("follow".equals(uri.getQueryParameter("location_type")))
        {
            flag = flag1;
            if (LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
            {
                LocationManager.getLocationManager().setFollowMeAsCurrent("addLocationFromUri", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.CLICK_THRU);
                flag = true;
            }
        }
        flag1 = flag;
        if (!flag)
        {
            flag1 = tryLocId(userdata, uri.getQueryParameter("locid"));
        }
        flag = flag1;
        if (!flag1)
        {
            LatLong latlong = extractLatLong(uri.getQueryParameter("locid"));
            flag = flag1;
            if (latlong != null)
            {
                flag = tryLatLong(userdata, latlong.lat, latlong.lng);
            }
        }
        flag1 = flag;
        if (!flag)
        {
            flag1 = tryLatLong(userdata, uri.getQueryParameter("lat"), uri.getQueryParameter("lon"));
        }
        flag = flag1;
        if (!flag1)
        {
            flag = tryState(userdata, uri.getQueryParameter("st"));
        }
        flag1 = flag;
        if (!flag)
        {
            flag1 = tryPathElement(userdata, uri.getLastPathSegment());
        }
        return flag1;
    }

    public static LatLong extractLatLong(String s)
    {
        if (!Strings.isNullOrEmpty(s))
        {
            s = LAT_LONG_PATTERN.matcher(s);
            if (s.find())
            {
                return new LatLong(s.group(1), s.group(2));
            }
        }
        return null;
    }

    public static String getLocationForState(String s)
    {
        if (s != null)
        {
            if ((s = (String[])states.get(s)) != null)
            {
                return s[2];
            }
        }
        return null;
    }

    private static LocationReceiver.UserData getReceiverUserData(Uri uri)
    {
        String s;
label0:
        {
            LocationReceiver.UserData userdata = null;
            String s1 = uri.getQueryParameter("location");
            s = s1;
            if (Strings.isNullOrEmpty(s1))
            {
                s = uri.getQueryParameter("locationstring");
            }
            if (!Strings.isNullOrEmpty(s))
            {
                uri = uri.getQueryParameter("locale");
                if (!Strings.isNullOrEmpty(uri))
                {
                    break label0;
                }
                LogUtil.d("LocationUtils", LoggingMetaTags.TWC_DEEPLINK, "... using custom location name, no locale given. proposedLocationName=%s", new Object[] {
                    s
                });
                userdata = new LocationReceiver.UserData(s);
            }
            return userdata;
        }
        uri = LocaleUtil.languageForLocaleString(uri);
        if (TextUtils.equals(uri, LocaleUtil.getLocale().getLanguage()))
        {
            LogUtil.d("LocationUtils", LoggingMetaTags.TWC_DEEPLINK, "... using custom location name with locale language match. language=%s, proposedLocationName=%s", new Object[] {
                uri, s
            });
            return new LocationReceiver.UserData(s);
        } else
        {
            LogUtil.d("LocationUtils", LoggingMetaTags.TWC_DEEPLINK, "... ignoring custom location name, locale language mismatch. language=%s, proposedLocationName=%s", new Object[] {
                uri, s
            });
            return null;
        }
    }

    public static Uri getViewIntentUri(Intent intent)
    {
        String s = intent.getAction();
        if ("android.intent.action.VIEW".equals(s))
        {
            Uri uri = intent.getData();
            LogUtil.d("LocationUtils", LoggingMetaTags.TWC_DEEPLINK, "getViewIntentUri: intent=%s, type=%s, action=%s", new Object[] {
                intent, intent.getType(), s
            });
            return uri;
        } else
        {
            return null;
        }
    }

    public static boolean isInLocationsList(String s)
    {
        for (Iterator iterator = LocationManager.getLocationManager().getFollowMeAndFixedLocations().iterator(); iterator.hasNext();)
        {
            if (((SavedLocation)iterator.next()).getKeyTypeCountry().equals(s))
            {
                return true;
            }
        }

        return false;
    }

    private static boolean tryLatLong(LocationReceiver.UserData userdata, String s, String s1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!Strings.isNullOrEmpty(s))
        {
            flag = flag1;
            if (!Strings.isNullOrEmpty(s1))
            {
                LogUtil.d("LocationUtils", LoggingMetaTags.TWC_DEEPLINK, "... found latString=%s, lonString=%s", new Object[] {
                    s, s1
                });
                try
                {
                    double d = Double.parseDouble(s);
                    double d1 = Double.parseDouble(s1);
                    LocationConnection.getInstance().asyncFetch(d, d1, new LocationReceiver(com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.CLICK_THRU), userdata, false);
                }
                // Misplaced declaration of an exception variable
                catch (LocationReceiver.UserData userdata)
                {
                    ExceptionUtil.logExceptionWarning("LocationUtils", (new StringBuilder()).append("unexpected exception: latString=").append(s).append(" lonString=").append(s1).toString(), userdata);
                    return false;
                }
                flag = true;
            }
        }
        return flag;
    }

    private static boolean tryLocId(LocationReceiver.UserData userdata, String s)
    {
label0:
        {
            LogUtil.v("LocationUtils", LoggingMetaTags.TWC_DEEPLINK, "... tryLocId possibleLocId=%s", new Object[] {
                s
            });
            boolean flag1 = false;
            boolean flag = flag1;
            if (Strings.isNullOrEmpty(s))
            {
                break label0;
            }
            Iterator iterator = locIdPatterns.iterator();
            Matcher matcher;
            do
            {
                flag = flag1;
                if (!iterator.hasNext())
                {
                    break label0;
                }
                matcher = ((Pattern)iterator.next()).matcher(s);
            } while (!matcher.find());
            s = matcher.group(0);
            LogUtil.d("LocationUtils", LoggingMetaTags.TWC_DEEPLINK, "... found fully-qualified locId=%s", new Object[] {
                s
            });
            try
            {
                LocationConnection.getInstance().asyncFetch(s, new LocationReceiver(com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.CLICK_THRU), userdata, false);
            }
            // Misplaced declaration of an exception variable
            catch (LocationReceiver.UserData userdata)
            {
                ExceptionUtil.logExceptionWarning("LocationUtils", (new StringBuilder()).append("unexpected exception: locId=").append(s).toString(), userdata);
                return false;
            }
            flag = true;
        }
        return flag;
    }

    private static boolean tryPathElement(LocationReceiver.UserData userdata, String s)
    {
        boolean flag1 = false;
        if (!Strings.isNullOrEmpty(s))
        {
            s = URLDecoder.decode(s);
            flag1 = tryLocId(userdata, s);
            boolean flag = flag1;
            if (!flag1)
            {
                LatLong latlong = extractLatLong(s);
                flag = flag1;
                if (latlong != null)
                {
                    flag = tryLatLong(userdata, latlong.lat, latlong.lng);
                }
            }
            flag1 = flag;
            if (!flag)
            {
                Object obj = Iterables.filter(Splitter.on(" ").omitEmptyStrings().split(s), new GibberishPredicate());
                obj = Joiner.on(' ').join(((Iterable) (obj)));
                if (!Strings.isNullOrEmpty(((String) (obj))))
                {
                    LogUtil.d("LocationUtils", LoggingMetaTags.TWC_DEEPLINK, "... found alpha or zip location=%s", new Object[] {
                        obj
                    });
                    try
                    {
                        LocationChoiceConnection.getInstance().asyncFetch(((String) (obj)), false, new LocationChoiceReceiver(), userdata);
                    }
                    // Misplaced declaration of an exception variable
                    catch (LocationReceiver.UserData userdata)
                    {
                        ExceptionUtil.logExceptionWarning("LocationUtils", (new StringBuilder()).append("unexpected exception: filteredLocation=").append(((String) (obj))).toString(), userdata);
                        return flag;
                    }
                    flag1 = true;
                } else
                {
                    java.util.ArrayList arraylist = Lists.newArrayList(Iterables.filter(Splitter.on(CharMatcher.anyOf(", ()")).omitEmptyStrings().split(s), new LocIdPredicate()));
                    flag1 = flag;
                    if (!arraylist.isEmpty())
                    {
                        s = (new StringBuilder()).append((String)arraylist.get(0)).append(":1:").append(((String)arraylist.get(0)).substring(0, 2)).toString();
                        LogUtil.d("LocationUtils", LoggingMetaTags.TWC_DEEPLINK, "... found raw locId, trying city locid=%s, fullId=%s", new Object[] {
                            arraylist.get(0), s
                        });
                        flag1 = flag;
                        if (!Strings.isNullOrEmpty(s))
                        {
                            try
                            {
                                LocationConnection.getInstance().asyncFetch(s, new LocationReceiver(com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.CLICK_THRU), userdata, false);
                            }
                            // Misplaced declaration of an exception variable
                            catch (LocationReceiver.UserData userdata)
                            {
                                ExceptionUtil.logExceptionWarning("LocationUtils", (new StringBuilder()).append("unexpected exception: filteredLocId=").append(s).toString(), userdata);
                                return flag;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return flag1;
    }

    private static boolean tryState(LocationReceiver.UserData userdata, String s)
    {
        boolean flag = false;
        String s1 = getLocationForState(s);
        if (s1 != null)
        {
            LogUtil.d("LocationUtils", LoggingMetaTags.TWC_DEEPLINK, "... found state st=%s, keyTypeCountry=%s", new Object[] {
                s, s1
            });
            try
            {
                LocationConnection.getInstance().asyncFetch(s1, new LocationReceiver(com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.CLICK_THRU), userdata, false);
            }
            // Misplaced declaration of an exception variable
            catch (LocationReceiver.UserData userdata)
            {
                ExceptionUtil.logExceptionWarning("LocationUtils", (new StringBuilder()).append("unexpected exception: keyTypeCountry=").append(s1).toString(), userdata);
                return false;
            }
            flag = true;
        }
        return flag;
    }

    static 
    {
        TYPE_1_LOC_PATTERN = Pattern.compile("(?i)[A-Z]{4}[0-9]{4}:1:[A-Z]{2}");
        TYPE_4_US_LOC_PATTERN = Pattern.compile("(?i)[0-9]{5}:4:[A-Z]{2}");
        TYPE_9_LOC_PATTERN = Pattern.compile("(?i)[A-Z]{3}:9:[A-Z]{2}");
        TYPE_27_LOC_PATTERN = Pattern.compile("(?i)[A-Z]{4}[0-9]{4}:2[78]:[A-Z]{2}");
        GENERIC_LOC_PATTERN = Pattern.compile("(?i)[A-Z0-9]{1,20}:[0-9]{1,2}:[A-Z]{2}");
        locIdPatterns = ImmutableList.of(TYPE_1_LOC_PATTERN, TYPE_4_US_LOC_PATTERN, TYPE_9_LOC_PATTERN, TYPE_27_LOC_PATTERN, GENERIC_LOC_PATTERN);
    }
}
