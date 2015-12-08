// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.a.a.a.a.af;
import com.google.a.a.a.a.ag;
import com.google.a.a.a.a.dq;
import com.google.a.a.a.a.it;
import com.google.a.a.a.a.iv;
import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.me;
import com.google.a.a.a.a.qq;
import com.google.a.a.a.a.qt;
import com.google.a.a.a.a.rp;
import com.google.a.a.a.a.rq;
import com.google.a.a.a.a.rs;
import com.google.a.a.a.a.rt;
import com.google.a.a.a.a.uv;
import com.google.a.a.a.a.wb;
import com.google.a.a.a.a.wg;
import com.google.a.a.a.a.wk;
import com.google.android.apps.youtube.common.e.j;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.fetcher.g;
import com.google.android.apps.youtube.datalib.innertube.b;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            az, ac, aj

public class WatchNextResponse
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new az();
    private final ag backgroundLoopAutoplaySet;
    private final ag backgroundLoopShuffleAutoplaySet;
    private final ag backgroundNormalAutoplaySet;
    private final ag backgroundShuffleAutoplaySet;
    private final byte clickTrackingParams[];
    private final kz currentNavigationEndpoint;
    private final ag loopAutoplaySet;
    private final ag loopShuffleAutoplaySet;
    private final ag normalAutoplaySet;
    private final ac playlistPanel;
    private final aj sectionList;
    private final ag shuffleAutoplaySet;
    private final String videoId;
    private final uv videoMetadataRenderer;
    private final wg watchNextResponseProto;

    private WatchNextResponse(Parcel parcel)
    {
        this((wg)j.b(parcel, new wg()));
    }

    WatchNextResponse(Parcel parcel, az az1)
    {
        this(parcel);
    }

    public WatchNextResponse(wg wg1)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj13;
        Object obj14;
        ag aag[];
        Object obj15;
        watchNextResponseProto = (wg)c.a(wg1);
        obj = null;
        currentNavigationEndpoint = wg1.j;
        if (currentNavigationEndpoint != null)
        {
            clickTrackingParams = currentNavigationEndpoint.b;
            Object obj3;
            int i;
            int l;
            if (currentNavigationEndpoint.i != null)
            {
                obj = currentNavigationEndpoint.i.b;
            } else
            if (currentNavigationEndpoint.w != null)
            {
                obj = currentNavigationEndpoint.w.b;
            }
        } else
        {
            clickTrackingParams = b.a;
        }
        videoId = ((String) (obj));
        if (wg1.h != null)
        {
            wg1 = wg1.h.b;
        } else
        {
            wg1 = null;
        }
        obj8 = null;
        obj3 = null;
        obj = null;
        obj1 = null;
        obj2 = null;
        obj11 = null;
        obj14 = null;
        obj13 = null;
        aag = null;
        obj7 = null;
        obj15 = null;
        obj10 = null;
        if (wg1 == null) goto _L2; else goto _L1
_L1:
        if (((rp) (wg1)).b != null)
        {
            obj8 = ((rp) (wg1)).b.b;
        }
        obj9 = obj3;
        if (((rp) (wg1)).c != null)
        {
            obj9 = obj3;
            if (((rp) (wg1)).c.b != null)
            {
                obj9 = new ac(((rp) (wg1)).c.b, clickTrackingParams);
            }
        }
        if (((rp) (wg1)).d == null || ((rp) (wg1)).d.b == null) goto _L4; else goto _L3
_L3:
        obj14 = ((rp) (wg1)).d.b;
        aag = ((af) (obj14)).b;
        l = aag.length;
        i = 0;
        wg1 = ((wg) (obj2));
_L11:
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_385;
        }
        obj2 = aag[i];
        ((ag) (obj2)).b;
        JVM INSTR tableswitch 1 4: default 276
    //                   1 340
    //                   2 356
    //                   3 348
    //                   4 370;
           goto _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_370;
_L6:
        break; /* Loop/switch isn't completed */
_L5:
        obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L12:
        i++;
        obj2 = obj1;
        obj1 = obj;
        obj = obj2;
        if (true) goto _L11; else goto _L10
_L10:
        obj = obj1;
        obj1 = obj2;
          goto _L12
_L8:
        obj1 = obj;
        obj = obj2;
          goto _L12
_L7:
        Object obj4 = obj;
        wg1 = ((wg) (obj2));
        obj = obj1;
        obj1 = obj4;
          goto _L12
        Object obj5 = obj;
        obj11 = obj2;
        obj = obj1;
        obj1 = obj5;
          goto _L12
        Object obj6;
        int k;
        int i1;
        aag = ((af) (obj14)).e;
        i1 = aag.length;
        k = 0;
        obj14 = null;
        obj6 = obj13;
        obj2 = obj10;
        obj13 = obj14;
_L19:
        if (k >= i1)
        {
            break MISSING_BLOCK_LABEL_557;
        }
        obj10 = aag[k];
        ((ag) (obj10)).b;
        JVM INSTR tableswitch 1 4: default 464
    //                   1 497
    //                   2 519
    //                   3 508
    //                   4 538;
           goto _L13 _L14 _L15 _L16 _L17
_L17:
        break MISSING_BLOCK_LABEL_538;
_L14:
        break; /* Loop/switch isn't completed */
_L13:
        obj10 = obj7;
        obj7 = obj6;
        obj6 = obj10;
_L20:
        k++;
        obj10 = obj7;
        obj7 = obj6;
        obj6 = obj10;
        if (true) goto _L19; else goto _L18
_L18:
        obj6 = obj7;
        obj7 = obj10;
          goto _L20
_L16:
        obj7 = obj6;
        obj6 = obj10;
          goto _L20
_L15:
        obj14 = obj6;
        obj2 = obj10;
        obj6 = obj7;
        obj7 = obj14;
          goto _L20
        obj14 = obj6;
        obj13 = obj10;
        obj6 = obj7;
        obj7 = obj14;
          goto _L20
        obj14 = obj8;
        obj8 = obj9;
        obj10 = obj6;
        obj9 = obj7;
        obj7 = obj2;
        obj2 = obj;
        obj = wg1;
        wg1 = ((wg) (obj11));
        obj6 = obj14;
_L31:
        int j1;
        obj11 = null;
        if (obj6 == null)
        {
            break MISSING_BLOCK_LABEL_771;
        }
        sectionList = new aj(((qq) (obj6)));
        obj14 = ((qq) (obj6)).b;
        j1 = obj14.length;
        k = 0;
_L29:
        obj6 = obj11;
        if (k >= j1) goto _L22; else goto _L21
_L21:
        obj6 = ((qt) (obj14[k])).b;
        if (obj6 == null) goto _L24; else goto _L23
_L23:
        int k1;
        obj6 = ((it) (obj6)).b;
        k1 = obj6.length;
        i1 = 0;
_L28:
        if (i1 >= k1) goto _L24; else goto _L25
_L25:
        aag = obj6[i1];
        if (((iv) (aag)).r == null) goto _L27; else goto _L26
_L26:
        obj6 = ((iv) (aag)).r;
_L22:
        videoMetadataRenderer = ((uv) (obj6));
        playlistPanel = ((ac) (obj8));
        normalAutoplaySet = ((ag) (obj2));
        loopAutoplaySet = ((ag) (obj1));
        shuffleAutoplaySet = ((ag) (obj));
        loopShuffleAutoplaySet = wg1;
        backgroundNormalAutoplaySet = ((ag) (obj10));
        backgroundLoopAutoplaySet = ((ag) (obj9));
        backgroundShuffleAutoplaySet = ((ag) (obj7));
        backgroundLoopShuffleAutoplaySet = ((ag) (obj13));
        return;
_L27:
        i1++;
          goto _L28
_L24:
        k++;
          goto _L29
        sectionList = null;
        obj6 = obj11;
          goto _L22
_L4:
        obj13 = null;
        Object obj12 = obj9;
        obj2 = null;
        obj6 = obj8;
        obj1 = null;
        obj = null;
        wg1 = null;
        obj7 = obj15;
        obj9 = aag;
        obj10 = obj14;
        obj8 = obj12;
        continue; /* Loop/switch isn't completed */
_L2:
        obj13 = null;
        obj8 = null;
        obj2 = null;
        obj6 = null;
        obj1 = null;
        obj = null;
        wg1 = null;
        obj7 = obj15;
        obj9 = aag;
        obj10 = obj14;
        if (true) goto _L31; else goto _L30
_L30:
    }

    public static final WatchNextResponse createWatchNextResponseForOfflinePlaylist(WatchNextResponse watchnextresponse, Context context, Playlist playlist, List list, int i)
    {
        c.a(watchnextresponse);
        c.a(context);
        if (playlist == null || list == null)
        {
            return watchnextresponse;
        } else
        {
            return new WatchNextResponse(g.a(context, watchnextresponse.watchNextResponseProto, playlist, list, i));
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public ag getAutoplaySet(boolean flag, boolean flag1, boolean flag2)
    {
        boolean flag4 = true;
        boolean flag3;
        if (flag && isLoopSupported())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (!flag1 || !isShuffleSupported())
        {
            flag4 = false;
        }
        if (!flag3 && !flag4)
        {
            if (flag2 && backgroundNormalAutoplaySet != null)
            {
                return backgroundNormalAutoplaySet;
            } else
            {
                return normalAutoplaySet;
            }
        }
        if (!flag3)
        {
            if (flag2 && backgroundShuffleAutoplaySet != null)
            {
                return backgroundShuffleAutoplaySet;
            } else
            {
                return shuffleAutoplaySet;
            }
        }
        if (!flag4)
        {
            if (flag2 && backgroundLoopAutoplaySet != null)
            {
                return backgroundLoopAutoplaySet;
            } else
            {
                return loopAutoplaySet;
            }
        }
        if (flag2 && backgroundLoopShuffleAutoplaySet != null)
        {
            return backgroundLoopShuffleAutoplaySet;
        } else
        {
            return loopShuffleAutoplaySet;
        }
    }

    public byte[] getClickTrackingParams()
    {
        return clickTrackingParams;
    }

    public dq getContinuationRenderers()
    {
        return watchNextResponseProto.i;
    }

    public kz getCurrentWatchEndpoint()
    {
        return currentNavigationEndpoint;
    }

    public ac getPlaylistPanel()
    {
        return playlistPanel;
    }

    public aj getSectionList()
    {
        return sectionList;
    }

    public String getVideoId()
    {
        return videoId;
    }

    public uv getVideoMetadataRenderer()
    {
        return videoMetadataRenderer;
    }

    public boolean isLoopSupported()
    {
        return loopAutoplaySet != null;
    }

    public boolean isShuffleSupported()
    {
        return shuffleAutoplaySet != null;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(parcel, watchNextResponseProto);
    }

}
