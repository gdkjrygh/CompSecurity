// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzlh;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaTrack
{
    public static class Builder
    {

        private final MediaTrack zzSs;

        public MediaTrack build()
        {
            return zzSs;
        }

        public Builder setContentId(String s)
        {
            zzSs.setContentId(s);
            return this;
        }

        public Builder setContentType(String s)
        {
            zzSs.setContentType(s);
            return this;
        }

        public Builder setCustomData(JSONObject jsonobject)
        {
            zzSs.setCustomData(jsonobject);
            return this;
        }

        public Builder setLanguage(String s)
        {
            zzSs.setLanguage(s);
            return this;
        }

        public Builder setLanguage(Locale locale)
        {
            zzSs.setLanguage(com.google.android.gms.cast.internal.zzf.zzb(locale));
            return this;
        }

        public Builder setName(String s)
        {
            zzSs.setName(s);
            return this;
        }

        public Builder setSubtype(int i)
            throws IllegalArgumentException
        {
            zzSs.zzaG(i);
            return this;
        }

        public Builder(long l, int i)
            throws IllegalArgumentException
        {
            zzSs = new MediaTrack(l, i);
        }
    }


    public static final int SUBTYPE_CAPTIONS = 2;
    public static final int SUBTYPE_CHAPTERS = 4;
    public static final int SUBTYPE_DESCRIPTIONS = 3;
    public static final int SUBTYPE_METADATA = 5;
    public static final int SUBTYPE_NONE = 0;
    public static final int SUBTYPE_SUBTITLES = 1;
    public static final int SUBTYPE_UNKNOWN = -1;
    public static final int TYPE_AUDIO = 2;
    public static final int TYPE_TEXT = 1;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_VIDEO = 3;
    private String mName;
    private long zzOw;
    private String zzRA;
    private String zzRC;
    private String zzRE;
    private JSONObject zzRJ;
    private int zzSq;
    private int zzSr;

    MediaTrack(long l, int i)
        throws IllegalArgumentException
    {
        clear();
        zzOw = l;
        if (i <= 0 || i > 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid type ").append(i).toString());
        } else
        {
            zzSq = i;
            return;
        }
    }

    MediaTrack(JSONObject jsonobject)
        throws JSONException
    {
        zzf(jsonobject);
    }

    private void clear()
    {
        zzOw = 0L;
        zzSq = 0;
        zzRC = null;
        mName = null;
        zzRA = null;
        zzSr = -1;
        zzRJ = null;
    }

    private void zzf(JSONObject jsonobject)
        throws JSONException
    {
        clear();
        zzOw = jsonobject.getLong("trackId");
        String s = jsonobject.getString("type");
        if ("TEXT".equals(s))
        {
            zzSq = 1;
        } else
        if ("AUDIO".equals(s))
        {
            zzSq = 2;
        } else
        if ("VIDEO".equals(s))
        {
            zzSq = 3;
        } else
        {
            throw new JSONException((new StringBuilder()).append("invalid type: ").append(s).toString());
        }
        zzRC = jsonobject.optString("trackContentId", null);
        zzRE = jsonobject.optString("trackContentType", null);
        mName = jsonobject.optString("name", null);
        zzRA = jsonobject.optString("language", null);
        if (jsonobject.has("subtype"))
        {
            s = jsonobject.getString("subtype");
            if ("SUBTITLES".equals(s))
            {
                zzSr = 1;
            } else
            if ("CAPTIONS".equals(s))
            {
                zzSr = 2;
            } else
            if ("DESCRIPTIONS".equals(s))
            {
                zzSr = 3;
            } else
            if ("CHAPTERS".equals(s))
            {
                zzSr = 4;
            } else
            if ("METADATA".equals(s))
            {
                zzSr = 5;
            } else
            {
                throw new JSONException((new StringBuilder()).append("invalid subtype: ").append(s).toString());
            }
        } else
        {
            zzSr = 0;
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
        if (!(obj instanceof MediaTrack)) goto _L4; else goto _L3
_L3:
        obj = (MediaTrack)obj;
        boolean flag;
        boolean flag1;
        if (zzRJ == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((MediaTrack) (obj)).zzRJ == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag5;
        if (flag != flag1) goto _L4; else goto _L5
_L5:
        if (zzRJ == null || ((MediaTrack) (obj)).zzRJ == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag5;
        if (!zzlh.zzd(zzRJ, ((MediaTrack) (obj)).zzRJ)) goto _L4; else goto _L6
_L6:
        boolean flag3;
        if (zzOw == ((MediaTrack) (obj)).zzOw && zzSq == ((MediaTrack) (obj)).zzSq && com.google.android.gms.cast.internal.zzf.zza(zzRC, ((MediaTrack) (obj)).zzRC) && com.google.android.gms.cast.internal.zzf.zza(zzRE, ((MediaTrack) (obj)).zzRE) && com.google.android.gms.cast.internal.zzf.zza(mName, ((MediaTrack) (obj)).mName) && com.google.android.gms.cast.internal.zzf.zza(zzRA, ((MediaTrack) (obj)).zzRA) && zzSr == ((MediaTrack) (obj)).zzSr)
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

    public long getId()
    {
        return zzOw;
    }

    public String getLanguage()
    {
        return zzRA;
    }

    public String getName()
    {
        return mName;
    }

    public int getSubtype()
    {
        return zzSr;
    }

    public int getType()
    {
        return zzSq;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Long.valueOf(zzOw), Integer.valueOf(zzSq), zzRC, zzRE, mName, zzRA, Integer.valueOf(zzSr), zzRJ
        });
    }

    public void setContentId(String s)
    {
        zzRC = s;
    }

    public void setContentType(String s)
    {
        zzRE = s;
    }

    void setCustomData(JSONObject jsonobject)
    {
        zzRJ = jsonobject;
    }

    void setLanguage(String s)
    {
        zzRA = s;
    }

    void setName(String s)
    {
        mName = s;
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("trackId", zzOw);
        zzSq;
        JVM INSTR tableswitch 1 3: default 276
    //                   1 180
    //                   2 192
    //                   3 204;
           goto _L1 _L2 _L3 _L4
_L1:
        if (zzRC != null)
        {
            jsonobject.put("trackContentId", zzRC);
        }
        if (zzRE != null)
        {
            jsonobject.put("trackContentType", zzRE);
        }
        if (mName != null)
        {
            jsonobject.put("name", mName);
        }
        if (!TextUtils.isEmpty(zzRA))
        {
            jsonobject.put("language", zzRA);
        }
        zzSr;
        JVM INSTR tableswitch 1 5: default 279
    //                   1 216
    //                   2 228
    //                   3 240
    //                   4 252
    //                   5 264;
           goto _L5 _L6 _L7 _L8 _L9 _L10
_L5:
        if (zzRJ == null) goto _L12; else goto _L11
_L11:
        jsonobject.put("customData", zzRJ);
        return jsonobject;
_L2:
        try
        {
            jsonobject.put("type", "TEXT");
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        jsonobject.put("type", "AUDIO");
        continue; /* Loop/switch isn't completed */
_L4:
        jsonobject.put("type", "VIDEO");
        continue; /* Loop/switch isn't completed */
_L6:
        jsonobject.put("subtype", "SUBTITLES");
          goto _L5
_L7:
        jsonobject.put("subtype", "CAPTIONS");
          goto _L5
_L8:
        jsonobject.put("subtype", "DESCRIPTIONS");
          goto _L5
_L9:
        jsonobject.put("subtype", "CHAPTERS");
          goto _L5
_L10:
        jsonobject.put("subtype", "METADATA");
          goto _L5
_L12:
        return jsonobject;
        if (true) goto _L1; else goto _L13
_L13:
    }

    void zzaG(int i)
        throws IllegalArgumentException
    {
        if (i <= -1 || i > 5)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid subtype ").append(i).toString());
        }
        if (i != 0 && zzSq != 1)
        {
            throw new IllegalArgumentException("subtypes are only valid for text tracks");
        } else
        {
            zzSr = i;
            return;
        }
    }
}
