// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzlh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaMetadata, MediaTrack, TextTrackStyle

public final class MediaInfo
{
    public static class Builder
    {

        private final MediaInfo zzRK;

        public MediaInfo build()
            throws IllegalArgumentException
        {
            zzRK.zzlq();
            return zzRK;
        }

        public Builder setContentType(String s)
            throws IllegalArgumentException
        {
            zzRK.setContentType(s);
            return this;
        }

        public Builder setCustomData(JSONObject jsonobject)
        {
            zzRK.setCustomData(jsonobject);
            return this;
        }

        public Builder setMediaTracks(List list)
        {
            zzRK.zzj(list);
            return this;
        }

        public Builder setMetadata(MediaMetadata mediametadata)
        {
            zzRK.zza(mediametadata);
            return this;
        }

        public Builder setStreamDuration(long l)
            throws IllegalArgumentException
        {
            zzRK.zzx(l);
            return this;
        }

        public Builder setStreamType(int i)
            throws IllegalArgumentException
        {
            zzRK.setStreamType(i);
            return this;
        }

        public Builder setTextTrackStyle(TextTrackStyle texttrackstyle)
        {
            zzRK.setTextTrackStyle(texttrackstyle);
            return this;
        }

        public Builder(String s)
            throws IllegalArgumentException
        {
            if (TextUtils.isEmpty(s))
            {
                throw new IllegalArgumentException("Content ID cannot be empty");
            } else
            {
                zzRK = new MediaInfo(s);
                return;
            }
        }
    }


    public static final int STREAM_TYPE_BUFFERED = 1;
    public static final int STREAM_TYPE_INVALID = -1;
    public static final int STREAM_TYPE_LIVE = 2;
    public static final int STREAM_TYPE_NONE = 0;
    public static final long UNKNOWN_DURATION = -1L;
    private final String zzRC;
    private int zzRD;
    private String zzRE;
    private MediaMetadata zzRF;
    private long zzRG;
    private List zzRH;
    private TextTrackStyle zzRI;
    private JSONObject zzRJ;

    MediaInfo(String s)
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        } else
        {
            zzRC = s;
            zzRD = -1;
            zzRG = -1L;
            return;
        }
    }

    MediaInfo(JSONObject jsonobject)
        throws JSONException
    {
        int i = 0;
        super();
        zzRC = jsonobject.getString("contentId");
        Object obj = jsonobject.getString("streamType");
        if ("NONE".equals(obj))
        {
            zzRD = 0;
        } else
        if ("BUFFERED".equals(obj))
        {
            zzRD = 1;
        } else
        if ("LIVE".equals(obj))
        {
            zzRD = 2;
        } else
        {
            zzRD = -1;
        }
        zzRE = jsonobject.getString("contentType");
        if (jsonobject.has("metadata"))
        {
            obj = jsonobject.getJSONObject("metadata");
            zzRF = new MediaMetadata(((JSONObject) (obj)).getInt("metadataType"));
            zzRF.zzf(((JSONObject) (obj)));
        }
        zzRG = -1L;
        if (jsonobject.has("duration") && !jsonobject.isNull("duration"))
        {
            double d = jsonobject.optDouble("duration", 0.0D);
            if (!Double.isNaN(d) && !Double.isInfinite(d))
            {
                zzRG = zzf.zze(d);
            }
        }
        if (jsonobject.has("tracks"))
        {
            zzRH = new ArrayList();
            for (obj = jsonobject.getJSONArray("tracks"); i < ((JSONArray) (obj)).length(); i++)
            {
                MediaTrack mediatrack = new MediaTrack(((JSONArray) (obj)).getJSONObject(i));
                zzRH.add(mediatrack);
            }

        } else
        {
            zzRH = null;
        }
        if (jsonobject.has("textTrackStyle"))
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("textTrackStyle");
            TextTrackStyle texttrackstyle = new TextTrackStyle();
            texttrackstyle.zzf(jsonobject1);
            zzRI = texttrackstyle;
        } else
        {
            zzRI = null;
        }
        zzRJ = jsonobject.optJSONObject("customData");
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
        if (!(obj instanceof MediaInfo)) goto _L4; else goto _L3
_L3:
        obj = (MediaInfo)obj;
        boolean flag;
        boolean flag1;
        if (zzRJ == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((MediaInfo) (obj)).zzRJ == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag5;
        if (flag != flag1) goto _L4; else goto _L5
_L5:
        if (zzRJ == null || ((MediaInfo) (obj)).zzRJ == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag5;
        if (!zzlh.zzd(zzRJ, ((MediaInfo) (obj)).zzRJ)) goto _L4; else goto _L6
_L6:
        boolean flag3;
        if (zzf.zza(zzRC, ((MediaInfo) (obj)).zzRC) && zzRD == ((MediaInfo) (obj)).zzRD && zzf.zza(zzRE, ((MediaInfo) (obj)).zzRE) && zzf.zza(zzRF, ((MediaInfo) (obj)).zzRF) && zzRG == ((MediaInfo) (obj)).zzRG)
        {
            flag3 = flag4;
        } else
        {
            flag3 = false;
        }
        return flag3;
    }

    public String getContentId()
    {
        return zzRC;
    }

    public String getContentType()
    {
        return zzRE;
    }

    public JSONObject getCustomData()
    {
        return zzRJ;
    }

    public List getMediaTracks()
    {
        return zzRH;
    }

    public MediaMetadata getMetadata()
    {
        return zzRF;
    }

    public long getStreamDuration()
    {
        return zzRG;
    }

    public int getStreamType()
    {
        return zzRD;
    }

    public TextTrackStyle getTextTrackStyle()
    {
        return zzRI;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzRC, Integer.valueOf(zzRD), zzRE, zzRF, Long.valueOf(zzRG), String.valueOf(zzRJ)
        });
    }

    void setContentType(String s)
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("content type cannot be null or empty");
        } else
        {
            zzRE = s;
            return;
        }
    }

    void setCustomData(JSONObject jsonobject)
    {
        zzRJ = jsonobject;
    }

    void setStreamType(int i)
        throws IllegalArgumentException
    {
        if (i < -1 || i > 2)
        {
            throw new IllegalArgumentException("invalid stream type");
        } else
        {
            zzRD = i;
            return;
        }
    }

    public void setTextTrackStyle(TextTrackStyle texttrackstyle)
    {
        zzRI = texttrackstyle;
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("contentId", zzRC);
        zzRD;
        JVM INSTR tableswitch 1 2: default 232
    //                   1 241
    //                   2 247;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_247;
_L12:
        Object obj;
        jsonobject.put("streamType", obj);
        if (zzRE != null)
        {
            jsonobject.put("contentType", zzRE);
        }
        if (zzRF != null)
        {
            jsonobject.put("metadata", zzRF.toJson());
        }
        if (zzRG > -1L) goto _L5; else goto _L4
_L4:
        jsonobject.put("duration", JSONObject.NULL);
_L9:
        if (zzRH == null) goto _L7; else goto _L6
_L6:
        obj = new JSONArray();
        for (Iterator iterator = zzRH.iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(((MediaTrack)iterator.next()).toJson())) { }
          goto _L8
_L5:
        jsonobject.put("duration", zzf.zzA(zzRG));
          goto _L9
_L8:
        jsonobject.put("tracks", obj);
_L7:
        if (zzRI != null)
        {
            jsonobject.put("textTrackStyle", zzRI.toJson());
        }
        if (zzRJ == null) goto _L11; else goto _L10
_L10:
        jsonobject.put("customData", zzRJ);
        return jsonobject;
_L1:
        obj = "NONE";
          goto _L12
        obj;
_L11:
        return jsonobject;
_L2:
        obj = "BUFFERED";
          goto _L12
        obj = "LIVE";
          goto _L12
    }

    void zza(MediaMetadata mediametadata)
    {
        zzRF = mediametadata;
    }

    void zzj(List list)
    {
        zzRH = list;
    }

    void zzlq()
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(zzRC))
        {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        }
        if (TextUtils.isEmpty(zzRE))
        {
            throw new IllegalArgumentException("content type cannot be null or empty");
        }
        if (zzRD == -1)
        {
            throw new IllegalArgumentException("a valid stream type must be specified");
        } else
        {
            return;
        }
    }

    void zzx(long l)
        throws IllegalArgumentException
    {
        if (l < 0L && l != -1L)
        {
            throw new IllegalArgumentException("Invalid stream duration");
        } else
        {
            zzRG = l;
            return;
        }
    }
}
