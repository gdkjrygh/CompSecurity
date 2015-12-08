// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.google.android.gms.maps.model.LatLngBounds;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.weather.util.UnitConversionUtil;
import com.weather.util.UnitType;
import com.weather.util.geometry.LatLng;
import com.weather.util.json.JsonUtil;
import com.weather.util.parsing.Validation;
import com.weather.util.parsing.ValidationException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.tropical:
//            StormPosition

public class StormData
{
    private static final class StormPrediction
    {

        private final LatLng leftEndPoint;
        private final LatLng location;
        private final LatLng rightEndPoint;
        private final StormType type;

        private static StormPrediction fromJSON(JSONObject jsonobject)
            throws JSONException, ValidationException
        {
            double d = jsonobject.getDouble("HPLat");
            double d1 = jsonobject.getDouble("HPLong");
            double d2 = jsonobject.getDouble("HPLatLftEndPnt");
            double d3 = jsonobject.getDouble("HPLongLftEndPnt");
            double d4 = jsonobject.getDouble("HPLatRghtEndPnt");
            double d5 = jsonobject.getDouble("HPLongRghtEndPnt");
            jsonobject = StormData.convertCategoryToType(jsonobject.getString("HPCat"), "HPCat");
            return new StormPrediction(new LatLng(Double.valueOf(d), Double.valueOf(d1)), new LatLng(Double.valueOf(d2), Double.valueOf(d3)), new LatLng(Double.valueOf(d4), Double.valueOf(d5)), jsonobject);
        }






        private StormPrediction(LatLng latlng, LatLng latlng1, LatLng latlng2, StormType stormtype)
        {
            location = (LatLng)Preconditions.checkNotNull(latlng);
            leftEndPoint = (LatLng)Preconditions.checkNotNull(latlng1);
            rightEndPoint = (LatLng)Preconditions.checkNotNull(latlng2);
            type = (StormType)Preconditions.checkNotNull(stormtype);
        }
    }

    public static abstract class StormType extends Enum
    {

        private static final StormType $VALUES[];
        public static final StormType HURRICANE;
        public static final StormType TROPICAL_DEPRESSION;
        public static final StormType TROPICAL_STORM;

        public static StormType valueOf(String s)
        {
            return (StormType)Enum.valueOf(com/weather/commons/tropical/StormData$StormType, s);
        }

        public static StormType[] values()
        {
            return (StormType[])$VALUES.clone();
        }

        abstract String convertCategory(int i);

        static 
        {
            TROPICAL_DEPRESSION = new StormType("TROPICAL_DEPRESSION", 0) {

                String convertCategory(int i)
                {
                    return "TD";
                }

            };
            TROPICAL_STORM = new StormType("TROPICAL_STORM", 1) {

                String convertCategory(int i)
                {
                    return "TS";
                }

            };
            HURRICANE = new StormType("HURRICANE", 2) {

                String convertCategory(int i)
                {
                    return String.valueOf(i);
                }

            };
            $VALUES = (new StormType[] {
                TROPICAL_DEPRESSION, TROPICAL_STORM, HURRICANE
            });
        }

        private StormType(String s, int i)
        {
            super(s, i);
        }

    }


    private static final String EAST_HEMISPHERE_VALUE = "E";
    private static final char EXTRA_SPACE = 32;
    private static final String HP_CATEGORY_FIELD = "HPCat";
    private static final String HP_DATA_FIELD = "HPData";
    private static final String HP_LATITUDE_FIELD = "HPLat";
    private static final String HP_LEFT_LATITUDE_FIELD = "HPLatLftEndPnt";
    private static final String HP_LEFT_LONGITUDE_FIELD = "HPLongLftEndPnt";
    private static final String HP_LONGITUDE_FIELD = "HPLong";
    private static final String HP_PATH_FIELD = "HPPath";
    private static final String HP_RIGHT_LATITUDE_FIELD = "HPLatRghtEndPnt";
    private static final String HP_RIGHT_LONGITUDE_FIELD = "HPLongRghtEndPnt";
    private static final String HP_SUPPRESSED_FIELD = "HPSupprssd";
    private static final String HT_CATEGORY_FIELD = "HTCat";
    private static final String HT_DATA_FIELD = "HTData";
    private static final String HT_HEADER_FIELD = "HTHdr";
    private static final String HT_HEADING_CARDINALITY_FIELD = "HTHdngDirCrdnl";
    private static final String HT_HEADING_SPEED = "HTHdngSpdMPH";
    private static final String HT_LATITUDE_FIELD = "HTLat";
    private static final String HT_LATITUDE_HEMISPHERE_FIELD = "HTLatHmsphr";
    private static final String HT_LOCAL_REPORT_CLOCK_FIELD = "HTAdvsTmLcl__HTTmLcl";
    private static final String HT_LOCAL_REPORT_DATE_TIME_FIELD = "HTAdvsTmLcl";
    private static final String HT_LOCAL_REPORT_TIME_ZONE_FIELD = "HTAdvsTmLcl__HTTzAbbrv";
    private static final String HT_LOCATION_DIRECTION_FIELD = "HTDir1";
    private static final String HT_LOCATION_DISTANCE_FIELD = "HTDstnc1";
    private static final String HT_LOCATION_FIELD = "HTLoc1";
    private static final String HT_LONGITUDE_FIELD = "HTLong";
    private static final String HT_LONGITUDE_HEMISPHERE_FIELD = "HTLongHmsphr";
    private static final String HT_PRESSURE_IN_FIELD = "HTPrssrIn";
    private static final String HT_PRESSURE_MB_FIELD = "HTPrssrMB";
    private static final String HT_PROC_TIME = "procTm";
    private static final String HT_SPEED_FIELD = "HTMxWndSpdMPH";
    private static final String HT_STORM_ID_FIELD = "HTStrmId";
    private static final String HT_STORM_NAME_FIELD = "HTStrmId__HTStrmNm";
    private static final ThreadLocal LOCAL_TIME_DATE_FORMATTER = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("EEE MMM dd yyyy", Locale.getDefault());
        }

    };
    private static final ThreadLocal LOCAL_TIME_PARSER = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            return new SimpleDateFormat("yyyyMMddHHmm", Locale.US);
        }

    };
    private static final int MAX_SPEED = 999;
    private static final String NORTH_HEMISPHERE_VALUE = "N";
    private static final String NOT_SUPPRESSED_VALUE = "N";
    private static final String TROPICAL_DEPRESSION_CATEGORY = "TD";
    private static final String TROPICAL_STORM_CATEGORY = "TS";
    private static String headingDirectionOrDescription;
    private final String currentLatitudeString;
    private final String currentLongitudeString;
    private final LatLng currentPosition;
    private final String distanceFrom;
    private final int hurricaneCategory;
    private final int movingDescription;
    private final String pressure;
    private final List stormCone;
    private final String stormId;
    private final String stormName;
    private final List stormTrack;
    private final StormType stormType;
    private final String updatedTime;
    private final int windDescription;

    private StormData(String s, String s1, String s2, StormType stormtype, String s3, int i, int j, 
            int k, String s4, String s5, String s6, List list, List list1, LatLng latlng)
    {
        currentPosition = (LatLng)Preconditions.checkNotNull(latlng);
        stormId = (String)Preconditions.checkNotNull(s);
        stormName = (String)Preconditions.checkNotNull(s1);
        updatedTime = (String)Preconditions.checkNotNull(s2);
        stormType = (StormType)Preconditions.checkNotNull(stormtype);
        distanceFrom = (String)Preconditions.checkNotNull(s3);
        windDescription = ((Integer)Preconditions.checkNotNull(Integer.valueOf(i))).intValue();
        movingDescription = ((Integer)Preconditions.checkNotNull(Integer.valueOf(j))).intValue();
        hurricaneCategory = ((Integer)Preconditions.checkNotNull(Integer.valueOf(k))).intValue();
        currentLatitudeString = (String)Preconditions.checkNotNull(s5);
        pressure = (String)Preconditions.checkNotNull(s4);
        currentLongitudeString = (String)Preconditions.checkNotNull(s6);
        stormTrack = ImmutableList.copyOf(list);
        stormCone = ImmutableList.copyOf(list1);
    }

    private static void addPastStormTrack(com.google.common.collect.ImmutableList.Builder builder, JSONArray jsonarray, long l)
        throws JSONException, ValidationException
    {
        int i = 0;
        int j = jsonarray.length();
        while (i < j) 
        {
            JSONObject jsonobject = jsonarray.getJSONObject(i);
            if (extractHtRecProcTime(jsonobject) != l)
            {
                jsonobject = jsonobject.getJSONObject("HTData");
                double d = Validation.validateInRange("HTLat", jsonobject.getDouble("HTLat"), 0.0D, 90D);
                String s = JsonUtil.validateAndGetString(jsonobject, "HTLatHmsphr");
                double d1 = Validation.validateInRange("HTLong", jsonobject.getDouble("HTLong"), 0.0D, 180D);
                String s1 = JsonUtil.validateAndGetString(jsonobject, "HTLongHmsphr");
                if (!s.equals("N"))
                {
                    d = -d;
                }
                if (!s1.equals("E"))
                {
                    d1 = -d1;
                }
                builder.add(new StormPosition(new LatLng(Double.valueOf(d), Double.valueOf(d1)), convertCategoryToType(jsonobject.getString("HTCat"), "HTCat"), StormPosition.Status.PAST));
            }
            i++;
        }
    }

    private static void addPredictedStormTrackAndCone(com.google.common.collect.ImmutableList.Builder builder, com.google.common.collect.ImmutableList.Builder builder1, List list)
    {
        StormPrediction stormprediction;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); builder1.add(stormprediction.leftEndPoint))
        {
            stormprediction = (StormPrediction)iterator.next();
            builder.add(new StormPosition(stormprediction.location, stormprediction.type, StormPosition.Status.FUTURE));
        }

        for (builder = Lists.reverse(list).iterator(); builder.hasNext(); builder1.add(((StormPrediction)builder.next()).rightEndPoint)) { }
    }

    private static StormType convertCategoryToType(String s, String s1)
        throws ValidationException
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 7: default 72
    //                   49: 173
    //                   50: 188
    //                   51: 203
    //                   52: 218
    //                   53: 233
    //                   2672: 145
    //                   2687: 159;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_233;
_L9:
        switch (byte0)
        {
        default:
            throw new ValidationException(String.format(Locale.US, "%s has invalid category. category=%s", new Object[] {
                s1, s
            }));

        case 0: // '\0'
            return StormType.TROPICAL_DEPRESSION;

        case 1: // '\001'
            return StormType.TROPICAL_STORM;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return StormType.HURRICANE;
        }
_L7:
        if (s.equals("TD"))
        {
            byte0 = 0;
        }
          goto _L9
_L8:
        if (s.equals("TS"))
        {
            byte0 = 1;
        }
          goto _L9
_L2:
        if (s.equals("1"))
        {
            byte0 = 2;
        }
          goto _L9
_L3:
        if (s.equals("2"))
        {
            byte0 = 3;
        }
          goto _L9
_L4:
        if (s.equals("3"))
        {
            byte0 = 4;
        }
          goto _L9
_L5:
        if (s.equals("4"))
        {
            byte0 = 5;
        }
          goto _L9
        if (s.equals("5"))
        {
            byte0 = 6;
        }
          goto _L9
    }

    private static String extractDistanceFrom(JSONObject jsonobject)
        throws JSONException, ValidationException
    {
        if (jsonobject.isNull("HTLoc1"))
        {
            jsonobject = "--";
        } else
        {
            int i = jsonobject.optInt("HTDstnc1");
            String s;
            String s1;
            if (jsonobject.isNull("HTDir1"))
            {
                s = null;
            } else
            {
                s = JsonUtil.validateAndGetString(jsonobject, "HTDir1");
            }
            s1 = JsonUtil.validateAndGetString(jsonobject, "HTLoc1");
            jsonobject = s1;
            if (i != 0)
            {
                jsonobject = s1;
                if (s != null)
                {
                    return (new StringBuilder()).append(i).append(" MILES ").append(s).append(" OF ").append(s1).toString();
                }
            }
        }
        return jsonobject;
    }

    private static int extractHeading(JSONObject jsonobject)
        throws ValidationException, JSONException
    {
        if (jsonobject.isNull("HTHdngDirCrdnl"))
        {
            return 0;
        } else
        {
            headingDirectionOrDescription = JsonUtil.validateAndGetString(jsonobject, "HTHdngDirCrdnl");
            return jsonobject.optInt("HTHdngSpdMPH", -1);
        }
    }

    private static long extractHtRecProcTime(JSONObject jsonobject)
        throws JSONException
    {
        return jsonobject.getJSONObject("HTHdr").getLong("procTm");
    }

    private static String extractPressure(JSONObject jsonobject)
        throws JSONException
    {
        int i;
        boolean flag;
        if (!jsonobject.isNull("HTPrssrMB"))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!jsonobject.isNull("HTPrssrIn"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i != 0 && flag)
        {
            i = jsonobject.optInt("HTPrssrMB");
            double d = jsonobject.getDouble("HTPrssrIn");
            return String.format(Locale.US, "%d MB / %.2f In", new Object[] {
                Integer.valueOf(i), Double.valueOf(d)
            });
        }
        if (i != 0)
        {
            int j = jsonobject.optInt("HTPrssrMB");
            return (new StringBuilder()).append(j).append(" MB").toString();
        }
        if (flag)
        {
            double d1 = jsonobject.getDouble("HTPrssrIn");
            return String.format(Locale.US, "%.2f In", new Object[] {
                Double.valueOf(d1)
            });
        } else
        {
            return "--";
        }
    }

    private static String extractUpdateTime(JSONObject jsonobject)
        throws JSONException, ValidationException
    {
        Object obj;
        obj = null;
        if (jsonobject.isNull("HTAdvsTmLcl"))
        {
            return "";
        }
        java.util.Date date = ((DateFormat)LOCAL_TIME_PARSER.get()).parse(JsonUtil.validateAndGetString(jsonobject, "HTAdvsTmLcl"));
        if (!jsonobject.isNull("HTAdvsTmLcl__HTTmLcl")) goto _L2; else goto _L1
_L1:
        String s = null;
_L8:
        if (!jsonobject.isNull("HTAdvsTmLcl__HTTzAbbrv")) goto _L4; else goto _L3
_L3:
        jsonobject = obj;
_L6:
        if (s != null)
        {
            break; /* Loop/switch isn't completed */
        }
        return ((DateFormat)LOCAL_TIME_DATE_FORMATTER.get()).format(date);
_L2:
        s = JsonUtil.validateAndGetString(jsonobject, "HTAdvsTmLcl__HTTmLcl");
        continue; /* Loop/switch isn't completed */
_L4:
        jsonobject = JsonUtil.validateAndGetString(jsonobject, "HTAdvsTmLcl__HTTzAbbrv");
        if (true) goto _L6; else goto _L5
_L5:
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        return (new StringBuilder()).append(s).append(' ').append(((DateFormat)LOCAL_TIME_DATE_FORMATTER.get()).format(date)).toString();
        jsonobject = (new StringBuilder()).append(s).append(' ').append(jsonobject).append(' ').append(((DateFormat)LOCAL_TIME_DATE_FORMATTER.get()).format(date)).toString();
        return jsonobject;
        jsonobject;
        throw new ValidationException("HTAdvsTmLcl not a valid date string", jsonobject);
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static int extractWindSpeed(JSONObject jsonobject)
        throws JSONException, ValidationException
    {
        if (jsonobject.isNull("HTMxWndSpdMPH"))
        {
            return 0;
        } else
        {
            return Validation.validateInRange("HTMxWndSpdMPH", jsonobject.getInt("HTMxWndSpdMPH"), 0, 999);
        }
    }

    private static JSONObject findLatestRecord(JSONArray jsonarray)
        throws JSONException
    {
        if (jsonarray.length() != 0) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject1 = null;
_L4:
        return jsonobject1;
_L2:
        JSONObject jsonobject = jsonarray.getJSONObject(0);
        long l = extractHtRecProcTime(jsonobject);
        int i = 1;
        int j = jsonarray.length();
        do
        {
            jsonobject1 = jsonobject;
            if (i >= j)
            {
                continue;
            }
            jsonobject1 = jsonarray.getJSONObject(i);
            long l2 = extractHtRecProcTime(jsonobject1);
            long l1 = l;
            if (l2 > l)
            {
                jsonobject = jsonobject1;
                l1 = l2;
            }
            i++;
            l = l1;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static StormData fromJson(JSONArray jsonarray, JSONObject jsonobject)
        throws JSONException, ValidationException
    {
        JSONObject jsonobject2;
        String s;
        String s1;
        JSONObject jsonobject3;
        String s2;
        String s3;
        int i;
        int j;
        int k;
        JSONObject jsonobject1 = findLatestRecord(jsonarray);
        if (jsonobject1 == null)
        {
            throw new ValidationException("No htRecords in the array");
        }
        jsonobject2 = jsonobject1.getJSONObject("HTHdr");
        s = JsonUtil.validateAndGetString(jsonobject2, "HTStrmId__HTStrmNm");
        s1 = JsonUtil.validateAndGetString(jsonobject2, "HTStrmId");
        jsonobject3 = jsonobject1.getJSONObject("HTData");
        s2 = extractDistanceFrom(jsonobject3);
        j = extractWindSpeed(jsonobject3);
        k = extractHeading(jsonobject3);
        s3 = JsonUtil.validateAndGetString(jsonobject3, "HTCat");
        i = -1;
        s3.hashCode();
        JVM INSTR lookupswitch 2: default 124
    //                   2672: 435
    //                   2687: 451;
           goto _L1 _L2 _L3
_L1:
        i;
        JVM INSTR tableswitch 0 1: default 148
    //                   0 467
    //                   1 478;
           goto _L4 _L5 _L6
_L5:
        break; /* Loop/switch isn't completed */
_L4:
        double d;
        double d1;
        StormType stormtype;
        String s4;
        String s5;
        Object obj;
        Object obj1;
        com.google.common.collect.ImmutableList.Builder builder;
        try
        {
            i = Validation.validateInRange("HTCat", Integer.parseInt(s3), 1, 5);
            stormtype = StormType.HURRICANE;
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw new ValidationException(String.format(Locale.US, "Invalid storm category.  %s=%s", new Object[] {
                "HTCat", s3
            }));
        }
        d = Validation.validateInRange("HTLat", jsonobject3.getDouble("HTLat"), 0.0D, 90D);
        obj = JsonUtil.validateAndGetString(jsonobject3, "HTLatHmsphr");
        s3 = String.format(Locale.US, "%.2f\260%s", new Object[] {
            Double.valueOf(d), obj
        });
        d1 = Validation.validateInRange("HTLong", jsonobject3.getDouble("HTLong"), 0.0D, 180D);
        obj1 = JsonUtil.validateAndGetString(jsonobject3, "HTLongHmsphr");
        s4 = String.format(Locale.US, "%.2f\260%s", new Object[] {
            Double.valueOf(d1), obj1
        });
        s5 = extractPressure(jsonobject3);
        if (!((String) (obj)).equals("N"))
        {
            d = -d;
        }
        if (!((String) (obj1)).equals("E"))
        {
            d1 = -d1;
        }
        obj = new LatLng(Double.valueOf(d), Double.valueOf(d1));
        obj1 = ImmutableList.builder();
        builder = ImmutableList.builder();
        jsonobject = getPath(jsonobject);
        addPastStormTrack(((com.google.common.collect.ImmutableList.Builder) (obj1)), jsonarray, jsonobject2.getLong("procTm"));
        ((com.google.common.collect.ImmutableList.Builder) (obj1)).add(new StormPosition(((LatLng) (obj)), stormtype, StormPosition.Status.CURRENT));
        builder.add(obj);
        addPredictedStormTrackAndCone(((com.google.common.collect.ImmutableList.Builder) (obj1)), builder, jsonobject);
        return new StormData(s1, s, extractUpdateTime(jsonobject3).toUpperCase(Locale.getDefault()), stormtype, s2, j, k, i, s5, s3, s4, ((com.google.common.collect.ImmutableList.Builder) (obj1)).build(), builder.build(), ((LatLng) (obj)));
_L2:
        if (s3.equals("TD"))
        {
            i = 0;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (s3.equals("TS"))
        {
            i = 1;
        }
        if (true) goto _L1; else goto _L7
_L7:
        i = 0;
        stormtype = StormType.TROPICAL_DEPRESSION;
        break MISSING_BLOCK_LABEL_167;
_L6:
        i = 0;
        stormtype = StormType.TROPICAL_STORM;
        break MISSING_BLOCK_LABEL_167;
    }

    private static List getPath(JSONObject jsonobject)
        throws JSONException, ValidationException
    {
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        jsonobject = ImmutableList.of();
_L4:
        return jsonobject;
_L2:
        JSONArray jsonarray = jsonobject.getJSONObject("HPData").optJSONArray("HPPath");
        if (jsonarray == null)
        {
            return ImmutableList.of();
        }
        ArrayList arraylist = new ArrayList(jsonarray.length());
        int i = 0;
        int j = jsonarray.length();
        do
        {
            jsonobject = arraylist;
            if (i >= j)
            {
                continue;
            }
            jsonobject = jsonarray.getJSONObject(i);
            if ("N".equals(JsonUtil.validateAndGetString(jsonobject, "HPSupprssd")))
            {
                arraylist.add(StormPrediction.fromJSON(jsonobject));
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (getClass() == obj.getClass())
                {
                    obj = (StormData)obj;
                    flag = flag1;
                    if (hurricaneCategory == ((StormData) (obj)).hurricaneCategory)
                    {
                        flag = flag1;
                        if (stormId.equals(((StormData) (obj)).stormId))
                        {
                            flag = flag1;
                            if (stormName.equals(((StormData) (obj)).stormName))
                            {
                                flag = flag1;
                                if (updatedTime.equals(((StormData) (obj)).updatedTime))
                                {
                                    flag = flag1;
                                    if (stormType == ((StormData) (obj)).stormType)
                                    {
                                        flag = flag1;
                                        if (distanceFrom.equals(((StormData) (obj)).distanceFrom))
                                        {
                                            flag = flag1;
                                            if (windDescription == ((StormData) (obj)).windDescription)
                                            {
                                                flag = flag1;
                                                if (movingDescription == ((StormData) (obj)).movingDescription)
                                                {
                                                    flag = flag1;
                                                    if (currentLatitudeString.equals(((StormData) (obj)).currentLatitudeString))
                                                    {
                                                        flag = flag1;
                                                        if (currentLongitudeString.equals(((StormData) (obj)).currentLongitudeString))
                                                        {
                                                            flag = flag1;
                                                            if (pressure.equals(((StormData) (obj)).pressure))
                                                            {
                                                                flag = flag1;
                                                                if (stormTrack.equals(((StormData) (obj)).stormTrack))
                                                                {
                                                                    return stormCone.equals(((StormData) (obj)).stormCone);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public String getCategory()
    {
        return stormType.convertCategory(hurricaneCategory);
    }

    public LatLng getCurrentPosition()
    {
        return currentPosition;
    }

    public String getDistanceFromString()
    {
        return distanceFrom;
    }

    public int getHurricaneCategory()
    {
        return hurricaneCategory;
    }

    public String getLatitudeDescription()
    {
        return currentLatitudeString;
    }

    public String getLongitudeDescription()
    {
        return currentLongitudeString;
    }

    public String getMovingDescription(UnitType unittype)
    {
        if (movingDescription == 0)
        {
            return "--";
        }
        if (movingDescription != -1)
        {
            if (unittype == UnitType.METRIC)
            {
                unittype = (new StringBuilder()).append(UnitConversionUtil.convertMilesToKilometers(movingDescription)).append(" KMH").toString();
            } else
            {
                unittype = (new StringBuilder()).append(movingDescription).append(" MPH").toString();
            }
            return (new StringBuilder()).append(headingDirectionOrDescription).append(" @ ").append(unittype).toString();
        } else
        {
            return headingDirectionOrDescription;
        }
    }

    public String getPressure()
    {
        return pressure;
    }

    public com.weather.util.geometry.LatLngBounds getStormBounds()
    {
        Object obj = LatLngBounds.builder();
        LatLng latlng;
        for (Iterator iterator = stormTrack.iterator(); iterator.hasNext(); ((com.google.android.gms.maps.model.LatLngBounds.Builder) (obj)).include(new com.google.android.gms.maps.model.LatLng(latlng.latitude, latlng.longitude)))
        {
            latlng = ((StormPosition)iterator.next()).getLatLng();
        }

        LatLng latlng1;
        for (Iterator iterator1 = stormCone.iterator(); iterator1.hasNext(); ((com.google.android.gms.maps.model.LatLngBounds.Builder) (obj)).include(new com.google.android.gms.maps.model.LatLng(latlng1.latitude, latlng1.longitude)))
        {
            latlng1 = (LatLng)iterator1.next();
        }

        obj = ((com.google.android.gms.maps.model.LatLngBounds.Builder) (obj)).build();
        return new com.weather.util.geometry.LatLngBounds(new LatLng(Double.valueOf(((LatLngBounds) (obj)).northeast.latitude), Double.valueOf(((LatLngBounds) (obj)).northeast.longitude)), new LatLng(Double.valueOf(((LatLngBounds) (obj)).southwest.latitude), Double.valueOf(((LatLngBounds) (obj)).southwest.longitude)));
    }

    public List getStormCone()
    {
        return new ArrayList(stormCone);
    }

    public String getStormId()
    {
        return stormId;
    }

    public String getStormName()
    {
        return stormName;
    }

    public List getStormTrack()
    {
        return new ArrayList(stormTrack);
    }

    public StormType getStormType()
    {
        return stormType;
    }

    public String getUpdatedTime()
    {
        return updatedTime;
    }

    public String getWindSpeedDescription(UnitType unittype)
    {
        if (windDescription == 0)
        {
            return "--";
        }
        if (unittype == UnitType.METRIC)
        {
            return (new StringBuilder()).append(UnitConversionUtil.convertMilesToKilometers(windDescription)).append(" KMH").toString();
        } else
        {
            return (new StringBuilder()).append(windDescription).append(" MPH").toString();
        }
    }

    public int hashCode()
    {
        return (((((((((((stormId.hashCode() * 31 + stormName.hashCode()) * 31 + updatedTime.hashCode()) * 31 + stormType.hashCode()) * 31 + distanceFrom.hashCode()) * 31 + windDescription) * 31 + movingDescription) * 31 + hurricaneCategory) * 31 + currentLatitudeString.hashCode()) * 31 + currentLongitudeString.hashCode()) * 31 + pressure.hashCode()) * 31 + stormTrack.hashCode()) * 31 + stormCone.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("StormData{stormId='").append(stormId).append('\'').append(", stormName='").append(stormName).append('\'').append(", stormType=").append(stormType).append(", distanceFrom='").append(distanceFrom).append('\'').append(", windDescription='").append(windDescription).append('\'').append(", movingDescription='").append(movingDescription).append('\'').append(", hurricaneCategory=").append(hurricaneCategory).append(", currentLatitudeString='").append(currentLatitudeString).append('\'').append(", currentLongitudeString='").append(currentLongitudeString).append('\'').append(", pressure='").append(pressure).append('\'').append(", stormTrack=").append(stormTrack).append(", stormCone=").append(stormCone).append('}').toString();
    }


}
