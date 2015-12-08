// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Pair;
import com.google.android.exoplayer.e.k;
import java.util.HashMap;

// Referenced classes of package com.google.android.exoplayer:
//            c

public final class aa
{

    private static final HashMap a = new HashMap();

    public static c a(String s)
    {
        Object obj = b(s);
        if (obj == null)
        {
            return null;
        }
        s = ((MediaCodecInfo)((Pair) (obj)).first).getName();
        obj = (android.media.MediaCodecInfo.CodecCapabilities)((Pair) (obj)).second;
        boolean flag;
        if (k.a >= 19)
        {
            flag = ((android.media.MediaCodecInfo.CodecCapabilities) (obj)).isFeatureSupported("adaptive-playback");
        } else
        {
            flag = false;
        }
        return new c(s, flag);
    }

    public static boolean a(int i, int j)
    {
        Object obj = b("video/avc");
        if (obj != null)
        {
            obj = (android.media.MediaCodecInfo.CodecCapabilities)((Pair) (obj)).second;
            i = 0;
            while (i < ((android.media.MediaCodecInfo.CodecCapabilities) (obj)).profileLevels.length) 
            {
                android.media.MediaCodecInfo.CodecProfileLevel codecprofilelevel = ((android.media.MediaCodecInfo.CodecCapabilities) (obj)).profileLevels[i];
                if (codecprofilelevel.profile == 2 && codecprofilelevel.level >= 64)
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    private static Pair b(String s)
    {
        com/google/android/exoplayer/aa;
        JVM INSTR monitorenter ;
        Object obj = (Pair)a.get(s);
        if (obj == null) goto _L2; else goto _L1
_L1:
        s = ((String) (obj));
_L9:
        com/google/android/exoplayer/aa;
        JVM INSTR monitorexit ;
        return s;
_L2:
        int l = MediaCodecList.getCodecCount();
        int i = 0;
_L7:
        if (i >= l) goto _L4; else goto _L3
_L3:
        String as[];
        obj = MediaCodecList.getCodecInfoAt(i);
        String s1 = ((MediaCodecInfo) (obj)).getName();
        if (((MediaCodecInfo) (obj)).isEncoder() || !s1.startsWith("OMX."))
        {
            continue; /* Loop/switch isn't completed */
        }
        as = ((MediaCodecInfo) (obj)).getSupportedTypes();
        int j = 0;
_L6:
        if (j >= as.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s2 = as[j];
        if (!s2.equalsIgnoreCase(s))
        {
            break MISSING_BLOCK_LABEL_125;
        }
        obj = Pair.create(obj, ((MediaCodecInfo) (obj)).getCapabilitiesForType(s2));
        a.put(s, obj);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L4:
        s = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

}
