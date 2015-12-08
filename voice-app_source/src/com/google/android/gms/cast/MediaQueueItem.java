// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzlh;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaInfo

public class MediaQueueItem
{
    public static class Builder
    {

        private final MediaQueueItem zzRZ;

        public MediaQueueItem build()
        {
            zzRZ.zzlq();
            return zzRZ;
        }

        public Builder clearItemId()
        {
            zzRZ.zzaC(0);
            return this;
        }

        public Builder setActiveTrackIds(long al[])
        {
            zzRZ.zza(al);
            return this;
        }

        public Builder setAutoplay(boolean flag)
        {
            zzRZ.zzP(flag);
            return this;
        }

        public Builder setCustomData(JSONObject jsonobject)
        {
            zzRZ.setCustomData(jsonobject);
            return this;
        }

        public Builder setPreloadTime(double d)
            throws IllegalArgumentException
        {
            zzRZ.zzc(d);
            return this;
        }

        public Builder setStartTime(double d)
            throws IllegalArgumentException
        {
            zzRZ.zzb(d);
            return this;
        }

        public Builder(MediaInfo mediainfo)
            throws IllegalArgumentException
        {
            zzRZ = new MediaQueueItem(mediainfo);
        }

        public Builder(MediaQueueItem mediaqueueitem)
            throws IllegalArgumentException
        {
            zzRZ = new MediaQueueItem(mediaqueueitem);
        }

        public Builder(JSONObject jsonobject)
            throws JSONException
        {
            zzRZ = new MediaQueueItem(jsonobject);
        }
    }


    public static final double DEFAULT_PLAYBACK_DURATION = (1.0D / 0.0D);
    public static final int INVALID_ITEM_ID = 0;
    private JSONObject zzRJ;
    private MediaInfo zzRS;
    private int zzRT;
    private boolean zzRU;
    private double zzRV;
    private double zzRW;
    private double zzRX;
    private long zzRY[];

    private MediaQueueItem(MediaInfo mediainfo)
        throws IllegalArgumentException
    {
        zzRT = 0;
        zzRU = true;
        zzRW = (1.0D / 0.0D);
        if (mediainfo == null)
        {
            throw new IllegalArgumentException("media cannot be null.");
        } else
        {
            zzRS = mediainfo;
            return;
        }
    }


    private MediaQueueItem(MediaQueueItem mediaqueueitem)
        throws IllegalArgumentException
    {
        zzRT = 0;
        zzRU = true;
        zzRW = (1.0D / 0.0D);
        zzRS = mediaqueueitem.getMedia();
        if (zzRS == null)
        {
            throw new IllegalArgumentException("media cannot be null.");
        } else
        {
            zzRT = mediaqueueitem.getItemId();
            zzRU = mediaqueueitem.getAutoplay();
            zzRV = mediaqueueitem.getStartTime();
            zzRW = mediaqueueitem.zzlr();
            zzRX = mediaqueueitem.getPreloadTime();
            zzRY = mediaqueueitem.getActiveTrackIds();
            zzRJ = mediaqueueitem.getCustomData();
            return;
        }
    }


    MediaQueueItem(JSONObject jsonobject)
        throws JSONException
    {
        zzRT = 0;
        zzRU = true;
        zzRW = (1.0D / 0.0D);
        zzg(jsonobject);
    }

    public boolean equals(Object obj)
    {
        boolean flag4;
        boolean flag5;
        flag4 = true;
        flag5 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag2 = true;
_L4:
        return flag2;
_L2:
        flag2 = flag5;
        if (!(obj instanceof MediaQueueItem)) goto _L4; else goto _L3
_L3:
        obj = (MediaQueueItem)obj;
        boolean flag;
        boolean flag1;
        if (zzRJ == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((MediaQueueItem) (obj)).zzRJ == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag5;
        if (flag != flag1) goto _L4; else goto _L5
_L5:
        if (zzRJ == null || ((MediaQueueItem) (obj)).zzRJ == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag5;
        if (!zzlh.zzd(zzRJ, ((MediaQueueItem) (obj)).zzRJ)) goto _L4; else goto _L6
_L6:
        boolean flag3;
        if (zzf.zza(zzRS, ((MediaQueueItem) (obj)).zzRS) && zzRT == ((MediaQueueItem) (obj)).zzRT && zzRU == ((MediaQueueItem) (obj)).zzRU && zzRV == ((MediaQueueItem) (obj)).zzRV && zzRW == ((MediaQueueItem) (obj)).zzRW && zzRX == ((MediaQueueItem) (obj)).zzRX && zzf.zza(zzRY, ((MediaQueueItem) (obj)).zzRY))
        {
            flag3 = flag4;
        } else
        {
            flag3 = false;
        }
        return flag3;
    }

    public long[] getActiveTrackIds()
    {
        return zzRY;
    }

    public boolean getAutoplay()
    {
        return zzRU;
    }

    public JSONObject getCustomData()
    {
        return zzRJ;
    }

    public int getItemId()
    {
        return zzRT;
    }

    public MediaInfo getMedia()
    {
        return zzRS;
    }

    public double getPreloadTime()
    {
        return zzRX;
    }

    public double getStartTime()
    {
        return zzRV;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzRS, Integer.valueOf(zzRT), Boolean.valueOf(zzRU), Double.valueOf(zzRV), Double.valueOf(zzRW), Double.valueOf(zzRX), zzRY, String.valueOf(zzRJ)
        });
    }

    void setCustomData(JSONObject jsonobject)
    {
        zzRJ = jsonobject;
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray;
        long al[];
        int j;
        jsonobject.put("media", zzRS.toJson());
        if (zzRT != 0)
        {
            jsonobject.put("itemId", zzRT);
        }
        jsonobject.put("autoplay", zzRU);
        jsonobject.put("startTime", zzRV);
        if (zzRW != (1.0D / 0.0D))
        {
            jsonobject.put("playbackDuration", zzRW);
        }
        jsonobject.put("preloadTime", zzRX);
        if (zzRY == null || zzRY.length <= 0)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        jsonarray = new JSONArray();
        al = zzRY;
        j = al.length;
        int i = 0;
        while (i < j) 
        {
            try
            {
                jsonarray.put(al[i]);
            }
            catch (JSONException jsonexception)
            {
                return jsonobject;
            }
            i++;
        }
        jsonobject.put("activeTrackIds", jsonarray);
        if (zzRJ != null)
        {
            jsonobject.put("customData", zzRJ);
        }
        return jsonobject;
    }

    void zzP(boolean flag)
    {
        zzRU = flag;
    }

    void zza(long al[])
    {
        zzRY = al;
    }

    void zzaC(int i)
    {
        zzRT = i;
    }

    void zzb(double d)
        throws IllegalArgumentException
    {
        if (Double.isNaN(d) || d < 0.0D)
        {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        } else
        {
            zzRV = d;
            return;
        }
    }

    void zzc(double d)
        throws IllegalArgumentException
    {
        if (Double.isNaN(d) || d < 0.0D)
        {
            throw new IllegalArgumentException("preloadTime cannot be negative or NaN.");
        } else
        {
            zzRX = d;
            return;
        }
    }

    public boolean zzg(JSONObject jsonobject)
        throws JSONException
    {
        long al[];
        JSONArray jsonarray;
        int j;
        int k;
        boolean flag;
        boolean flag1;
        if (jsonobject.has("media"))
        {
            zzRS = new MediaInfo(jsonobject.getJSONObject("media"));
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag = flag1;
        if (jsonobject.has("itemId"))
        {
            int i = jsonobject.getInt("itemId");
            flag = flag1;
            if (zzRT != i)
            {
                zzRT = i;
                flag = true;
            }
        }
        flag1 = flag;
        if (jsonobject.has("autoplay"))
        {
            boolean flag2 = jsonobject.getBoolean("autoplay");
            flag1 = flag;
            if (zzRU != flag2)
            {
                zzRU = flag2;
                flag1 = true;
            }
        }
        flag = flag1;
        if (jsonobject.has("startTime"))
        {
            double d = jsonobject.getDouble("startTime");
            flag = flag1;
            if (Math.abs(d - zzRV) > 9.9999999999999995E-08D)
            {
                zzRV = d;
                flag = true;
            }
        }
        flag1 = flag;
        if (jsonobject.has("playbackDuration"))
        {
            double d1 = jsonobject.getDouble("playbackDuration");
            flag1 = flag;
            if (Math.abs(d1 - zzRW) > 9.9999999999999995E-08D)
            {
                zzRW = d1;
                flag1 = true;
            }
        }
        flag = flag1;
        if (jsonobject.has("preloadTime"))
        {
            double d2 = jsonobject.getDouble("preloadTime");
            flag = flag1;
            if (Math.abs(d2 - zzRX) > 9.9999999999999995E-08D)
            {
                zzRX = d2;
                flag = true;
            }
        }
        if (!jsonobject.has("activeTrackIds")) goto _L2; else goto _L1
_L1:
        jsonarray = jsonobject.getJSONArray("activeTrackIds");
        k = jsonarray.length();
        al = new long[k];
        for (j = 0; j < k; j++)
        {
            al[j] = jsonarray.getLong(j);
        }

        if (zzRY != null) goto _L4; else goto _L3
_L3:
        j = 1;
_L6:
        if (j != 0)
        {
            zzRY = al;
            flag = true;
        }
        if (jsonobject.has("customData"))
        {
            zzRJ = jsonobject.getJSONObject("customData");
            return true;
        } else
        {
            return flag;
        }
_L4:
        if (zzRY.length != k)
        {
            j = 1;
            continue; /* Loop/switch isn't completed */
        }
        j = 0;
        do
        {
            if (j >= k)
            {
                break;
            }
            if (zzRY[j] != al[j])
            {
                j = 1;
                continue; /* Loop/switch isn't completed */
            }
            j++;
        } while (true);
        j = 0;
        continue; /* Loop/switch isn't completed */
_L2:
        j = 0;
        al = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    void zzlq()
        throws IllegalArgumentException
    {
        if (zzRS == null)
        {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (Double.isNaN(zzRV) || zzRV < 0.0D)
        {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(zzRW))
        {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(zzRX) || zzRX < 0.0D)
        {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        } else
        {
            return;
        }
    }

    public double zzlr()
    {
        return zzRW;
    }
}
