// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.internal.zzjz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaMetadata
{
    private static class zza
    {

        private final Map zzRP = new HashMap();
        private final Map zzRQ = new HashMap();
        private final Map zzRR = new HashMap();

        public zza zzb(String s, String s1, int i)
        {
            zzRP.put(s, s1);
            zzRQ.put(s1, s);
            zzRR.put(s, Integer.valueOf(i));
            return this;
        }

        public String zzbw(String s)
        {
            return (String)zzRP.get(s);
        }

        public String zzbx(String s)
        {
            return (String)zzRQ.get(s);
        }

        public int zzby(String s)
        {
            s = (Integer)zzRR.get(s);
            if (s != null)
            {
                return s.intValue();
            } else
            {
                return 0;
            }
        }

        public zza()
        {
        }
    }


    public static final String KEY_ALBUM_ARTIST = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
    public static final String KEY_ALBUM_TITLE = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
    public static final String KEY_ARTIST = "com.google.android.gms.cast.metadata.ARTIST";
    public static final String KEY_BROADCAST_DATE = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
    public static final String KEY_COMPOSER = "com.google.android.gms.cast.metadata.COMPOSER";
    public static final String KEY_CREATION_DATE = "com.google.android.gms.cast.metadata.CREATION_DATE";
    public static final String KEY_DISC_NUMBER = "com.google.android.gms.cast.metadata.DISC_NUMBER";
    public static final String KEY_EPISODE_NUMBER = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
    public static final String KEY_HEIGHT = "com.google.android.gms.cast.metadata.HEIGHT";
    public static final String KEY_LOCATION_LATITUDE = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
    public static final String KEY_LOCATION_LONGITUDE = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
    public static final String KEY_LOCATION_NAME = "com.google.android.gms.cast.metadata.LOCATION_NAME";
    public static final String KEY_RELEASE_DATE = "com.google.android.gms.cast.metadata.RELEASE_DATE";
    public static final String KEY_SEASON_NUMBER = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
    public static final String KEY_SERIES_TITLE = "com.google.android.gms.cast.metadata.SERIES_TITLE";
    public static final String KEY_STUDIO = "com.google.android.gms.cast.metadata.STUDIO";
    public static final String KEY_SUBTITLE = "com.google.android.gms.cast.metadata.SUBTITLE";
    public static final String KEY_TITLE = "com.google.android.gms.cast.metadata.TITLE";
    public static final String KEY_TRACK_NUMBER = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
    public static final String KEY_WIDTH = "com.google.android.gms.cast.metadata.WIDTH";
    public static final int MEDIA_TYPE_GENERIC = 0;
    public static final int MEDIA_TYPE_MOVIE = 1;
    public static final int MEDIA_TYPE_MUSIC_TRACK = 3;
    public static final int MEDIA_TYPE_PHOTO = 4;
    public static final int MEDIA_TYPE_TV_SHOW = 2;
    public static final int MEDIA_TYPE_USER = 100;
    private static final String zzRL[] = {
        null, "String", "int", "double", "ISO-8601 date String"
    };
    private static final zza zzRM = (new zza()).zzb("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4).zzb("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4).zzb("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4).zzb("com.google.android.gms.cast.metadata.TITLE", "title", 1).zzb("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1).zzb("com.google.android.gms.cast.metadata.ARTIST", "artist", 1).zzb("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1).zzb("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1).zzb("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1).zzb("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2).zzb("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2).zzb("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2).zzb("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2).zzb("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1).zzb("com.google.android.gms.cast.metadata.STUDIO", "studio", 1).zzb("com.google.android.gms.cast.metadata.WIDTH", "width", 2).zzb("com.google.android.gms.cast.metadata.HEIGHT", "height", 2).zzb("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1).zzb("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3).zzb("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
    private final Bundle zzRN;
    private int zzRO;
    private final List zzvi;

    public MediaMetadata()
    {
        this(0);
    }

    public MediaMetadata(int i)
    {
        zzvi = new ArrayList();
        zzRN = new Bundle();
        zzRO = i;
    }

    private transient void zza(JSONObject jsonobject, String as[])
    {
        String s;
        Object obj;
        int i;
        int j;
        try
        {
            j = as.length;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L14:
        if (i >= j) goto _L2; else goto _L1
_L1:
        s = as[i];
        if (!zzRN.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_249;
        }
        zzRM.zzby(s);
        JVM INSTR tableswitch 1 4: default 258
    //                   1 72
    //                   2 95
    //                   3 118
    //                   4 72;
           goto _L3 _L4 _L5 _L6 _L4
_L3:
        break MISSING_BLOCK_LABEL_249;
_L4:
        jsonobject.put(zzRM.zzbw(s), zzRN.getString(s));
        break MISSING_BLOCK_LABEL_249;
_L5:
        jsonobject.put(zzRM.zzbw(s), zzRN.getInt(s));
        break MISSING_BLOCK_LABEL_249;
_L6:
        jsonobject.put(zzRM.zzbw(s), zzRN.getDouble(s));
        break MISSING_BLOCK_LABEL_249;
_L2:
        as = zzRN.keySet().iterator();
_L9:
        do
        {
            if (!as.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)as.next();
        } while (s.startsWith("com.google."));
        obj = zzRN.get(s);
        if (!(obj instanceof String)) goto _L8; else goto _L7
_L7:
        jsonobject.put(s, obj);
          goto _L9
_L8:
        if (!(obj instanceof Integer)) goto _L11; else goto _L10
_L10:
        jsonobject.put(s, obj);
          goto _L9
_L11:
        if (!(obj instanceof Double)) goto _L9; else goto _L12
_L12:
        jsonobject.put(s, obj);
          goto _L9
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L14; else goto _L13
_L13:
    }

    private transient void zzb(JSONObject jsonobject, String as[])
    {
        as = new HashSet(Arrays.asList(as));
        Iterator iterator = jsonobject.keys();
_L9:
        Object obj;
        Object obj1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (String)iterator.next();
        if ("metadataType".equals(obj))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = zzRM.zzbx(((String) (obj)));
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        boolean flag = as.contains(obj1);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = jsonobject.get(((String) (obj)));
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        zzRM.zzby(((String) (obj1)));
        JVM INSTR tableswitch 1 4: default 334
    //                   1 128
    //                   2 189
    //                   3 217
    //                   4 153;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        continue; /* Loop/switch isn't completed */
_L4:
        if (obj instanceof String)
        {
            zzRN.putString(((String) (obj1)), (String)obj);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        try
        {
            if ((obj instanceof String) && zzjz.zzbK((String)obj) != null)
            {
                zzRN.putString(((String) (obj1)), (String)obj);
            }
        }
        catch (JSONException jsonexception) { }
        continue; /* Loop/switch isn't completed */
_L5:
        if (obj instanceof Integer)
        {
            zzRN.putInt(((String) (obj1)), ((Integer)obj).intValue());
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (obj instanceof Double)
        {
            zzRN.putDouble(((String) (obj1)), ((Double)obj).doubleValue());
        }
        continue; /* Loop/switch isn't completed */
_L2:
        obj1 = jsonobject.get(((String) (obj)));
        if (obj1 instanceof String)
        {
            zzRN.putString(((String) (obj)), (String)obj1);
            continue; /* Loop/switch isn't completed */
        }
        if (obj1 instanceof Integer)
        {
            zzRN.putInt(((String) (obj)), ((Integer)obj1).intValue());
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            if (obj1 instanceof Double)
            {
                zzRN.putDouble(((String) (obj)), ((Double)obj1).doubleValue());
            }
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject) { }
        break; /* Loop/switch isn't completed */
        if (true) goto _L9; else goto _L8
_L8:
    }

    private boolean zzb(Bundle bundle, Bundle bundle1)
    {
label0:
        {
            if (bundle.size() != bundle1.size())
            {
                return false;
            }
            Iterator iterator = bundle.keySet().iterator();
            Object obj;
            Object obj1;
label1:
            do
            {
                String s;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    s = (String)iterator.next();
                    obj = bundle.get(s);
                    obj1 = bundle1.get(s);
                    if ((obj instanceof Bundle) && (obj1 instanceof Bundle) && !zzb((Bundle)obj, (Bundle)obj1))
                    {
                        return false;
                    }
                    if (obj != null)
                    {
                        continue label1;
                    }
                } while (obj1 == null && bundle1.containsKey(s));
                return false;
            } while (obj.equals(obj1));
            return false;
        }
        return true;
    }

    private void zzf(String s, int i)
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int j = zzRM.zzby(s);
        if (j != i && j != 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Value for ").append(s).append(" must be a ").append(zzRL[i]).toString());
        } else
        {
            return;
        }
    }

    public void addImage(WebImage webimage)
    {
        zzvi.add(webimage);
    }

    public void clear()
    {
        zzRN.clear();
        zzvi.clear();
    }

    public void clearImages()
    {
        zzvi.clear();
    }

    public boolean containsKey(String s)
    {
        return zzRN.containsKey(s);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof MediaMetadata))
            {
                return false;
            }
            obj = (MediaMetadata)obj;
            if (!zzb(zzRN, ((MediaMetadata) (obj)).zzRN) || !zzvi.equals(((MediaMetadata) (obj)).zzvi))
            {
                return false;
            }
        }
        return true;
    }

    public Calendar getDate(String s)
    {
        zzf(s, 4);
        s = zzRN.getString(s);
        if (s != null)
        {
            return zzjz.zzbK(s);
        } else
        {
            return null;
        }
    }

    public String getDateAsString(String s)
    {
        zzf(s, 4);
        return zzRN.getString(s);
    }

    public double getDouble(String s)
    {
        zzf(s, 3);
        return zzRN.getDouble(s);
    }

    public List getImages()
    {
        return zzvi;
    }

    public int getInt(String s)
    {
        zzf(s, 2);
        return zzRN.getInt(s);
    }

    public int getMediaType()
    {
        return zzRO;
    }

    public String getString(String s)
    {
        zzf(s, 1);
        return zzRN.getString(s);
    }

    public boolean hasImages()
    {
        return zzvi != null && !zzvi.isEmpty();
    }

    public int hashCode()
    {
        Iterator iterator = zzRN.keySet().iterator();
        String s;
        int i;
        for (i = 17; iterator.hasNext(); i = zzRN.get(s).hashCode() + i * 31)
        {
            s = (String)iterator.next();
        }

        return i * 31 + zzvi.hashCode();
    }

    public Set keySet()
    {
        return zzRN.keySet();
    }

    public void putDate(String s, Calendar calendar)
    {
        zzf(s, 4);
        zzRN.putString(s, zzjz.zza(calendar));
    }

    public void putDouble(String s, double d)
    {
        zzf(s, 3);
        zzRN.putDouble(s, d);
    }

    public void putInt(String s, int i)
    {
        zzf(s, 2);
        zzRN.putInt(s, i);
    }

    public void putString(String s, String s1)
    {
        zzf(s, 1);
        zzRN.putString(s, s1);
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("metadataType", zzRO);
        }
        catch (JSONException jsonexception) { }
        zzjz.zza(jsonobject, zzvi);
        switch (zzRO)
        {
        default:
            zza(jsonobject, new String[0]);
            return jsonobject;

        case 0: // '\0'
            zza(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
            });
            return jsonobject;

        case 1: // '\001'
            zza(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
            });
            return jsonobject;

        case 2: // '\002'
            zza(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"
            });
            return jsonobject;

        case 3: // '\003'
            zza(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"
            });
            return jsonobject;

        case 4: // '\004'
            zza(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"
            });
            break;
        }
        return jsonobject;
    }

    public void zzf(JSONObject jsonobject)
    {
        clear();
        zzRO = 0;
        try
        {
            zzRO = jsonobject.getInt("metadataType");
        }
        catch (JSONException jsonexception) { }
        zzjz.zza(zzvi, jsonobject);
        switch (zzRO)
        {
        default:
            zzb(jsonobject, new String[0]);
            return;

        case 0: // '\0'
            zzb(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
            });
            return;

        case 1: // '\001'
            zzb(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
            });
            return;

        case 2: // '\002'
            zzb(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"
            });
            return;

        case 3: // '\003'
            zzb(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"
            });
            return;

        case 4: // '\004'
            zzb(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"
            });
            break;
        }
    }

}
