// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal.locations;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.weather.util.CountryCodeUtil;
import com.weather.util.FastTimeZoneUtil;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.dal.locations:
//            JsonObjectHelper, LocationType

public final class TwcLocation
    implements Serializable
{

    private static final ImmutableList CONUS_STATES = (new com.google.common.collect.ImmutableList.Builder()).add(new String[] {
        "AL", "AR", "AZ", "CA", "CO", "CT", "DC"
    }).add(new String[] {
        "DE", "FL", "GA", "IA", "ID", "IL", "IN"
    }).add(new String[] {
        "KS", "KY", "LA", "MA", "MD", "ME", "MI"
    }).add(new String[] {
        "MN", "MO", "MS", "MT", "NC", "ND", "NE"
    }).add(new String[] {
        "NH", "NJ", "NM", "NV", "NY", "OH", "OK"
    }).add(new String[] {
        "OR", "PA", "RI", "SC", "SD", "TN", "TX"
    }).add(new String[] {
        "UT", "VT", "VA", "WA", "WI", "WV", "WY"
    }).build();
    private static final String TAG = "TwcLocation";
    private static final long serialVersionUID = 0xfd319a24948a5be5L;
    private final String cID;
    private final String city;
    private final String country;
    private final String countryCode;
    private final String dma;
    private final int elv;
    private final String forecastID;
    private int hashCode;
    private final boolean isHiRadCapable = buildIsHiRadCapable();
    private final boolean isUS;
    private final String key;
    private double lat;
    private transient String latLong;
    private double lng;
    private String manufacturedName;
    private final String name;
    private final String obsID;
    private final String parentLoc;
    private final String rgn4;
    private final String rgn9;
    private final BigDecimal score;
    private final String state;
    private TimeZone timeZone;
    private final LocationType type;
    private final BigDecimal tz;
    private final String zip;
    private final String zoneInfo;

    public TwcLocation(JSONObject jsonobject)
        throws JSONException
    {
        int i = 0;
        super();
        lat = jsonobject.getDouble("lat");
        lng = jsonobject.getDouble("lng");
        JsonObjectHelper jsonobjecthelper = new JsonObjectHelper(jsonobject);
        key = jsonobject.getString("key");
        type = LocationType.getMember(jsonobject.getInt("type"));
        countryCode = jsonobject.getString("countryCode");
        jsonobject = jsonobjecthelper.getInt("elv", Integer.valueOf(0));
        String s;
        if (jsonobject != null)
        {
            i = jsonobject.intValue();
        }
        elv = i;
        tz = jsonobjecthelper.getBigDecimal("tz");
        s = jsonobjecthelper.getString("zoneInfo", "");
        jsonobject = s;
        if (s == null)
        {
            jsonobject = "";
        }
        zoneInfo = jsonobject;
        name = jsonobjecthelper.getString("name", "");
        city = jsonobjecthelper.getString("city", "");
        state = jsonobjecthelper.getString("state", "");
        country = jsonobjecthelper.getString("country", "");
        forecastID = jsonobjecthelper.getString("forecastID", "");
        obsID = jsonobjecthelper.getString("obsID", "");
        dma = jsonobjecthelper.getString("dma", "");
        rgn4 = jsonobjecthelper.getString("rgn4", "");
        rgn9 = jsonobjecthelper.getString("rgn9", "");
        zip = jsonobjecthelper.getString("zip", "");
        parentLoc = jsonobjecthelper.getString("parentLoc", "");
        cID = jsonobjecthelper.getString("cID", "");
        score = jsonobjecthelper.getBigDecimal("score", BigDecimal.ZERO);
        isUS = CountryCodeUtil.isUs(countryCode);
        timeZone = FastTimeZoneUtil.getTimeZone(zoneInfo);
        manufacturedName = buildManufacturedName();
        if (!isValid())
        {
            throw new IllegalStateException("TwcLocation: Invalid TwcLocation object");
        } else
        {
            return;
        }
    }

    private String buildCiyStateName()
    {
        String s = city;
        if (type != null && type == LocationType.Airport || !city.equals(name))
        {
            s = name;
        }
        String s1;
        if (isUS)
        {
            s1 = state;
        } else
        {
            s1 = country;
        }
        return (new StringBuilder()).append(s).append(", ").append(s1).toString();
    }

    private boolean buildIsHiRadCapable()
    {
        return isUS && CONUS_STATES.contains(state);
    }

    private String buildManufacturedNameWithLatLng()
    {
        String s = buildCiyStateName();
        return (new StringBuilder()).append(s).append(" (").append(getLatLong()).append(')').toString();
    }

    private String latLongAsString(double d, double d1)
    {
        return String.format(Locale.US, "%.2f, %.2f", new Object[] {
            Double.valueOf(d), Double.valueOf(d1)
        });
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        timeZone = FastTimeZoneUtil.getTimeZone(zoneInfo);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        timeZone = null;
        objectoutputstream.defaultWriteObject();
        timeZone = FastTimeZoneUtil.getTimeZone(zoneInfo);
    }

    public String buildManufacturedName()
    {
        String s1 = buildCiyStateName();
        String s = s1;
        if (isUS)
        {
            s = s1;
            if (type == LocationType.PostalCode)
            {
                s = (new StringBuilder()).append(s1).append(" (").append(zip).append(')').toString();
            }
        }
        return s;
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
            obj = (TwcLocation)obj;
            if (!getLatLong().equals(((TwcLocation) (obj)).getLatLong()))
            {
                return false;
            }
        }
        return true;
    }

    public String getCID()
    {
        return cID;
    }

    public String getCity()
    {
        return city;
    }

    public String getCountry()
    {
        return country;
    }

    public String getCountryCode()
    {
        return countryCode;
    }

    public String getDma()
    {
        return dma;
    }

    public int getElv()
    {
        return elv;
    }

    public String getForecastID()
    {
        return forecastID;
    }

    public String getKey()
    {
        return key;
    }

    public double getLat()
    {
        return lat;
    }

    public int getLatE6()
    {
        return (int)(lat * 1000000D);
    }

    public String getLatLong()
    {
        if (latLong == null)
        {
            latLong = latLongAsString(lat, lng);
        }
        return latLong;
    }

    public double getLng()
    {
        return lng;
    }

    public int getLngE6()
    {
        return (int)(lng * 1000000D);
    }

    public String getManufacturedName()
    {
        return manufacturedName;
    }

    public String getName()
    {
        return name;
    }

    public String getObsID()
    {
        return obsID;
    }

    public String getParentLoc()
    {
        return parentLoc;
    }

    public String getRgn4()
    {
        return rgn4;
    }

    public String getRgn9()
    {
        return rgn9;
    }

    public BigDecimal getScore()
    {
        return score;
    }

    public String getState()
    {
        return state;
    }

    public TimeZone getTimeZone()
    {
        TimeZone timezone1 = timeZone;
        TimeZone timezone = timezone1;
        if (timezone1 == null)
        {
            timezone = FastTimeZoneUtil.getTimeZone(zoneInfo);
        }
        return timezone;
    }

    public LocationType getType()
    {
        return type;
    }

    public BigDecimal getTz()
    {
        return tz;
    }

    public String getZip()
    {
        return zip;
    }

    public String getZoneInfo()
    {
        return zoneInfo;
    }

    public int hashCode()
    {
        return getLatLong().hashCode() + 31;
    }

    public boolean isHiRadCapable()
    {
        return isHiRadCapable;
    }

    public boolean isUS()
    {
        return isUS;
    }

    public boolean isValid()
    {
        while (TextUtils.isEmpty(key) || type == null || TextUtils.isEmpty(countryCode) || tz == null) 
        {
            return false;
        }
        return true;
    }

    public void setLatLong(double d, double d1)
    {
        lat = d;
        lng = d1;
        manufacturedName = buildManufacturedNameWithLatLng();
    }

    public String toFullString()
    {
        return (new StringBuilder()).append("TwcLocation [key=").append(key).append(", type=").append(type).append(']').toString();
    }

    public String toString()
    {
        return manufacturedName;
    }

}
