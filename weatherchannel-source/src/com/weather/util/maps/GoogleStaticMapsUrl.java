// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.maps;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.URLUtil;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.weather.util.TwcPreconditions;
import com.weather.util.device.LocaleUtil;
import com.weather.util.geometry.LatLng;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class GoogleStaticMapsUrl
{
    public static class MapIcon
        implements ParamString
    {

        private final Decoration decoration;
        private final String iconSource;
        private final List locations;

        public String getParamString()
        {
            ArrayList arraylist = Lists.newArrayList();
            arraylist.add((new StringBuilder()).append("icon:").append(iconSource).toString());
            Object obj = decoration.getStyleString();
            if (!((String) (obj)).isEmpty())
            {
                arraylist.add(obj);
            }
            obj = Lists.newArrayList();
            for (Iterator iterator = locations.iterator(); iterator.hasNext(); ((List) (obj)).add(((ParamString)iterator.next()).getParamString())) { }
            return (new StringBuilder()).append("&markers=").append(Joiner.on("%7C").join(arraylist)).append("%7C").append(Joiner.on("%7C").join(((Iterable) (obj)))).toString();
        }

        public MapIcon(String s, Decoration decoration1, MapLocation maplocation)
        {
            this(s, decoration1, ((List) (ImmutableList.of(maplocation))));
        }

        public MapIcon(String s, Decoration decoration1, List list)
        {
            decoration = (Decoration)Preconditions.checkNotNull(decoration1);
            Preconditions.checkArgument(URLUtil.isValidUrl((String)Preconditions.checkNotNull(s)));
            boolean flag;
            try
            {
                iconSource = URLEncoder.encode(s, "UTF-8");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IllegalStateException("UTF-8 encoding not found", s);
            }
            Preconditions.checkNotNull(list);
            locations = ImmutableList.copyOf(list);
            if (!locations.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
        }
    }

    public static final class MapIcon.Decoration extends Enum
    {

        private static final MapIcon.Decoration $VALUES[];
        public static final MapIcon.Decoration NONE;
        public static final MapIcon.Decoration SHADOWED;
        private final String styleString;

        private String getStyleString()
        {
            return styleString;
        }

        public static MapIcon.Decoration valueOf(String s)
        {
            return (MapIcon.Decoration)Enum.valueOf(com/weather/util/maps/GoogleStaticMapsUrl$MapIcon$Decoration, s);
        }

        public static MapIcon.Decoration[] values()
        {
            return (MapIcon.Decoration[])$VALUES.clone();
        }

        static 
        {
            NONE = new MapIcon.Decoration("NONE", 0, "shadow:false");
            SHADOWED = new MapIcon.Decoration("SHADOWED", 1, "");
            $VALUES = (new MapIcon.Decoration[] {
                NONE, SHADOWED
            });
        }


        private MapIcon.Decoration(String s, int i, String s1)
        {
            super(s, i);
            styleString = s1;
        }
    }

    public static class MapLocation
        implements ParamString
    {

        private static final ThreadLocal LOCATION_FORMAT = new ThreadLocal() {

            protected volatile Object initialValue()
            {
                return initialValue();
            }

            protected DecimalFormat initialValue()
            {
                return new DecimalFormat("#.######", DecimalFormatSymbols.getInstance(Locale.US));
            }

        };
        private final String address;
        private final LatLng latLng;

        public String getParamString()
        {
            if (latLng != null)
            {
                return (new StringBuilder()).append(((DecimalFormat)LOCATION_FORMAT.get()).format(latLng.latitude)).append(',').append(((DecimalFormat)LOCATION_FORMAT.get()).format(latLng.longitude)).toString();
            }
            String s;
            try
            {
                s = URLEncoder.encode(address, "utf-8");
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                throw new IllegalStateException("static map request has no usable center", unsupportedencodingexception);
            }
            return s;
        }


        public MapLocation(Double double1, Double double2)
        {
            latLng = new LatLng(double1, double2);
            address = null;
        }

        public MapLocation(String s)
        {
            latLng = null;
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "%s is not a valid address", new Object[] {
                s
            });
            address = s;
        }
    }

    public static class MapMarker
        implements ParamString
    {

        private static final String MARKER_SIZE_DEFAULT = "normal";
        public static final char NO_LABEL = 32;
        public static final Set markerColors = GoogleStaticMapsUrl.COLOR_NAMES;
        public static final Set markerSizes = ImmutableSet.of("normal", "mid", "small", "tiny");
        public static final Set markerSizesWithLabel = ImmutableSet.of("normal", "mid");
        private final String color;
        private final char label;
        private final List locations;
        private final String size;

        private static String checkValidColor(String s)
        {
            if (TextUtils.isEmpty(s))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("empty color ").append(s).toString());
            }
            if (s.startsWith("0x") && s.length() == 8)
            {
                try
                {
                    Long.parseLong(s.substring(2), 16);
                }
                catch (NumberFormatException numberformatexception)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("bad color string ").append(s).toString(), numberformatexception);
                }
                return s;
            } else
            {
                TwcPreconditions.checkAllowed(s, markerColors);
                return s;
            }
        }

        public String getParamString()
        {
            ArrayList arraylist = Lists.newArrayList();
            if (!"normal".equals(size))
            {
                arraylist.add((new StringBuilder()).append("size:").append(size).toString());
            }
            arraylist.add((new StringBuilder()).append("color:").append(color).toString());
            if (label != ' ' && markerSizesWithLabel.contains(size))
            {
                arraylist.add((new StringBuilder()).append("label:").append(label).toString());
            }
            ArrayList arraylist1 = Lists.newArrayList();
            for (Iterator iterator = locations.iterator(); iterator.hasNext(); arraylist1.add(((ParamString)iterator.next()).getParamString())) { }
            return (new StringBuilder()).append("&markers=").append(Joiner.on("%7C").join(arraylist)).append("%7C").append(Joiner.on("%7C").join(arraylist1)).toString();
        }


        public MapMarker(char c, String s, String s1, MapLocation maplocation)
        {
            this(c, s, s1, ((List) (ImmutableList.of(maplocation))));
        }

        public MapMarker(char c, String s, String s1, List list)
        {
            boolean flag1 = true;
            super();
            boolean flag;
            if (c == ' ' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9')
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            label = c;
            size = (String)TwcPreconditions.checkAllowed(s, markerSizes);
            color = checkValidColor(s1);
            Preconditions.checkNotNull(list);
            locations = ImmutableList.copyOf(list);
            if (!locations.isEmpty())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
        }
    }

    public static final class MapPath
        implements ParamString
    {

        private static final int DEFAULT_WEIGHT = 5;
        public static final Set pathColors = GoogleStaticMapsUrl.COLOR_NAMES;
        private final String color;
        private final String encodedLocations;
        private final String fillColor;
        private final List locations;
        private final int weight;

        private static String checkValidColor(String s)
        {
            if (TextUtils.isEmpty(s))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("empty color ").append(s).toString());
            }
            if (s.startsWith("0x") && (s.length() == 8 || s.length() == 10))
            {
                try
                {
                    Long.parseLong(s.substring(2), 16);
                }
                catch (NumberFormatException numberformatexception)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("bad color string ").append(s).toString(), numberformatexception);
                }
                return s;
            } else
            {
                TwcPreconditions.checkAllowed(s, pathColors);
                return s;
            }
        }

        public String getParamString()
        {
            ArrayList arraylist = Lists.newArrayList();
            arraylist.add((new StringBuilder()).append("color:").append(color).toString());
            if (fillColor != null)
            {
                arraylist.add((new StringBuilder()).append("fillcolor:").append(fillColor).toString());
            }
            if (weight != 5)
            {
                arraylist.add((new StringBuilder()).append("weight:").append(weight).toString());
            }
            if (locations != null)
            {
                for (Iterator iterator = locations.iterator(); iterator.hasNext(); arraylist.add(((ParamString)iterator.next()).getParamString())) { }
            } else
            {
                try
                {
                    arraylist.add((new StringBuilder()).append("enc:").append(URLEncoder.encode(encodedLocations, "UTF-8")).toString());
                }
                catch (UnsupportedEncodingException unsupportedencodingexception)
                {
                    throw new IllegalStateException(unsupportedencodingexception);
                }
            }
            return (new StringBuilder()).append("&path=").append(Joiner.on("%7C").join(arraylist)).toString();
        }


        public MapPath(String s, String s1, int i, String s2)
        {
            boolean flag;
            if (s1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            weight = i;
            color = checkValidColor(s);
            if (flag)
            {
                s = null;
            } else
            {
                s = checkValidColor(s1);
            }
            fillColor = s;
            locations = null;
            encodedLocations = (String)Preconditions.checkNotNull(s2);
        }

        public MapPath(String s, String s1, int i, List list)
        {
            boolean flag1 = true;
            super();
            boolean flag;
            if (s1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            weight = i;
            color = checkValidColor(s);
            if (flag)
            {
                s = null;
            } else
            {
                s = checkValidColor(s1);
            }
            fillColor = s;
            locations = ImmutableList.copyOf(list);
            encodedLocations = null;
            if (flag)
            {
                i = 2;
            } else
            {
                i = 3;
            }
            if (locations.size() < i)
            {
                flag1 = false;
            }
            Preconditions.checkArgument(flag1);
        }
    }

    private static interface ParamString
    {

        public abstract String getParamString();
    }


    private static final String ALGORITHM = "HmacSHA1";
    private static final String API_PATH = "/maps/api/staticmap";
    private static final String BASE_URL = "http://maps.googleapis.com";
    private static final String CHARSET_NAME = "UTF-8";
    private static final Set COLOR_NAMES = ImmutableSet.of("black", "brown", "green", "purple", "yellow", "blue", new String[] {
        "grey", "orange", "red", "white"
    });
    private static final String IMAGE_FORMAT_DEFAULT = "png";
    private static final String KEY_STRING = "eYnMDnhquTjvZ85tJGkMPpOsKKY=";
    private static final String MAP_TYPE_DEFAULT = "roadmap";
    private static final String NO_CENTER_QUERY = "size=%dx%d&client=gme-theweatherchannel&language=%s&region=%s";
    private static final String QUERY = "center=%s&zoom=%d&size=%dx%d&client=gme-theweatherchannel&language=%s&region=%s";
    private static final int SCALE_DEFAULT = 1;
    private static final String TAG = "StaticMapUrlBuilder";
    public static final Set validFormats = ImmutableSet.of("png", "png8", "gif", "jpg", "jpg-baseline");
    public static final Set validMapTypes = ImmutableSet.of("roadmap", "satellite", "hybrid", "terrain");
    private static final Range validPixels1 = Range.closed(Integer.valueOf(1), Integer.valueOf(2048));
    private static final Range validPixels2 = Range.closed(Integer.valueOf(1), Integer.valueOf(1024));
    private static final Range validPixels4 = Range.closed(Integer.valueOf(1), Integer.valueOf(512));
    public static final Set validScales = ImmutableSet.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(4));
    public static final Range validZooms = Range.closed(Integer.valueOf(0), Integer.valueOf(21));
    private final MapLocation center;
    private String format;
    private final int heightPx;
    private final String language = LocaleUtil.getLocale().getLanguage();
    private String mapType;
    private final Collection parameters = new ArrayList();
    private final String region = LocaleUtil.getLocale().getCountry();
    private final int scale;
    private final int widthPx;
    private final int zoom;

    private GoogleStaticMapsUrl(MapLocation maplocation, int i, int j, int k, int l)
    {
        format = "png";
        mapType = "roadmap";
        center = maplocation;
        Preconditions.checkArgument(validZooms.contains(Integer.valueOf(i)));
        zoom = i;
        maplocation = getValidPixels(l);
        Preconditions.checkArgument(maplocation.contains(Integer.valueOf(j)));
        widthPx = j;
        Preconditions.checkArgument(maplocation.contains(Integer.valueOf(k)));
        heightPx = k;
        scale = ((Integer)TwcPreconditions.checkAllowed(Integer.valueOf(l), validScales)).intValue();
    }

    public static String convertColorToRGB(int i)
    {
        return String.format(Locale.US, "0x%02x%02x%02x", new Object[] {
            Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i))
        });
    }

    public static String convertColorToRGBA(int i)
    {
        return String.format(Locale.US, "0x%02x%02x%02x%02x", new Object[] {
            Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i))
        });
    }

    public static GoogleStaticMapsUrl createWithAutoPosition(int i, int j, int k)
    {
        return new GoogleStaticMapsUrl(null, 1, i, j, k);
    }

    public static GoogleStaticMapsUrl createWithCenter(MapLocation maplocation, int i, int j, int k, int l)
    {
        return new GoogleStaticMapsUrl((MapLocation)Preconditions.checkNotNull(maplocation), i, j, k, l);
    }

    private String getSignature(String s)
    {
        try
        {
            byte abyte0[] = Base64.decode("eYnMDnhquTjvZ85tJGkMPpOsKKY=", 8);
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(abyte0, mac.getAlgorithm()));
            s = Base64.encodeToString(mac.doFinal(s.getBytes("UTF-8")), 8).trim();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("StaticMapUrlBuilder", "UTF-8 unsupported", s);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("StaticMapUrlBuilder", "HmacSHA1 algorithm missing", s);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("StaticMapUrlBuilder", "key was not valid", s);
            return null;
        }
        return s;
    }

    public static Range getValidPixels(int i)
    {
        TwcPreconditions.checkAllowed(Integer.valueOf(i), validScales);
        switch (i)
        {
        case 3: // '\003'
        default:
            throw new IllegalStateException((new StringBuilder()).append("unknown scaleToCheck ").append(i).toString());

        case 1: // '\001'
            return validPixels1;

        case 2: // '\002'
            return validPixels2;

        case 4: // '\004'
            return validPixels4;
        }
    }

    public GoogleStaticMapsUrl addIcon(MapIcon mapicon)
    {
        Preconditions.checkNotNull(mapicon);
        parameters.add(mapicon);
        return this;
    }

    public GoogleStaticMapsUrl addMarker(MapMarker mapmarker)
    {
        Preconditions.checkNotNull(mapmarker);
        parameters.add(mapmarker);
        return this;
    }

    public GoogleStaticMapsUrl addPath(MapPath mappath)
    {
        Preconditions.checkNotNull(mappath);
        parameters.add(mappath);
        return this;
    }

    public String get()
    {
        if (center == null && parameters.isEmpty())
        {
            throw new IllegalStateException("Cannot create url without a center attribute if no markers, icons, or paths were added");
        }
        Object obj;
        if (center != null)
        {
            obj = new StringBuilder(String.format(Locale.US, "center=%s&zoom=%d&size=%dx%d&client=gme-theweatherchannel&language=%s&region=%s", new Object[] {
                center.getParamString(), Integer.valueOf(zoom), Integer.valueOf(widthPx), Integer.valueOf(heightPx), language, region
            }));
        } else
        {
            obj = new StringBuilder(String.format(Locale.US, "size=%dx%d&client=gme-theweatherchannel&language=%s&region=%s", new Object[] {
                Integer.valueOf(widthPx), Integer.valueOf(heightPx), language, region
            }));
        }
        if (1 != scale)
        {
            ((StringBuilder) (obj)).append("&scale=").append(scale);
        }
        if (!"png".equals(format))
        {
            ((StringBuilder) (obj)).append("&format=").append(format);
        }
        if (!"roadmap".equals(mapType))
        {
            ((StringBuilder) (obj)).append("&maptype=").append(mapType);
        }
        for (Iterator iterator = parameters.iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append(((ParamString)iterator.next()).getParamString())) { }
        obj = (new StringBuilder()).append("/maps/api/staticmap?").append(obj).toString();
        String s = getSignature(((String) (obj)));
        if (s == null)
        {
            return (new StringBuilder()).append("http://maps.googleapis.com").append(((String) (obj))).toString();
        } else
        {
            return (new StringBuilder()).append("http://maps.googleapis.com").append(((String) (obj))).append("&signature=").append(s).toString();
        }
    }

    public GoogleStaticMapsUrl setFormat(String s)
    {
        format = (String)TwcPreconditions.checkAllowed(s, validFormats);
        return this;
    }

    public GoogleStaticMapsUrl setMapType(String s)
    {
        mapType = (String)TwcPreconditions.checkAllowed(s, validMapTypes);
        return this;
    }


}
