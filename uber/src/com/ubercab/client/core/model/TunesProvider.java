// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.content.res.Resources;
import android.os.Parcelable;
import android.text.TextUtils;
import ekn;
import eko;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_TunesProvider

public abstract class TunesProvider
    implements Parcelable
{

    public static final String EXTRA_NO_TUNES_PROVIDERS_ENABLED = "com.ubercab.NO_TUNES_PROVIDERS";
    public static final String EXTRA_TUNES_PROVIDER_SELECTED = "com.ubercab.TUNES_PROVIDER_SELECTED";
    public static final int INVALID_ID = -1;
    public static final String PROVIDER_IDS[] = {
        "rdio", "spotify"
    };

    public TunesProvider()
    {
    }

    public static TunesProvider create()
    {
        return new Shape_TunesProvider();
    }

    public static TunesProvider create(String s)
    {
        byte byte0;
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 40
    //                   -1998723398: 83
    //                   3495640: 97;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_97;
_L4:
        switch (byte0)
        {
        default:
            return null;

        case 0: // '\0'
            return (new Shape_TunesProvider()).setId(s).setName("Spotify");

        case 1: // '\001'
            return (new Shape_TunesProvider()).setId(s).setName("Rdio");
        }
_L2:
        if (s.equals("spotify"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s.equals("rdio"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    public static TunesProvider create(String s, String s1)
    {
        return (new Shape_TunesProvider()).setId(s).setName(s1);
    }

    public static TunesProvider create(String s, String s1, String s2, long l, String s3, boolean flag, List list)
    {
        return (new Shape_TunesProvider()).setId(s).setName(s1).setAccessToken(s2).setAccessTokenExpiry(Long.valueOf(l)).setEligibleTrial(s3).setLinked(Boolean.valueOf(flag)).setGroups(list);
    }

    public static TunesProvider create(List list)
    {
        return (new Shape_TunesProvider()).setGroups(list);
    }

    public static int getKnownProviderCount()
    {
        return PROVIDER_IDS.length;
    }

    public abstract String getAccessToken();

    public abstract Long getAccessTokenExpiry();

    public String getAuthRedirectUri()
    {
        String s = getId();
        if ("spotify".equals(s))
        {
            return eko.b();
        }
        if ("rdio".equals(s))
        {
            return ekn.a();
        } else
        {
            return null;
        }
    }

    public String getAuthUrl(Resources resources, String s)
    {
        String s1 = getId();
        if ("spotify".equals(s1))
        {
            return eko.a(resources);
        }
        if ("rdio".equals(s1))
        {
            return ekn.a(resources, s);
        } else
        {
            return null;
        }
    }

    public String getAuthorizationCode(String s)
    {
        String s1 = getId();
        if ("spotify".equals(s1))
        {
            return eko.a(s);
        }
        if ("rdio".equals(s1))
        {
            return ekn.a(s);
        } else
        {
            return null;
        }
    }

    public abstract String getEligibleTrial();

    public abstract List getGroups();

    public int getIconResourceId()
    {
        return getIconResourceId(false);
    }

    public int getIconResourceId(boolean flag)
    {
        String s = getId();
        if ("spotify".equals(s))
        {
            return !flag ? 0x7f020224 : 0x7f020225;
        }
        if ("rdio".equals(s))
        {
            return !flag ? 0x7f02021c : 0x7f02021d;
        } else
        {
            return -1;
        }
    }

    public abstract String getId();

    public abstract Boolean getLinked();

    public int getLogoDisplayHeightResourceId()
    {
        for (String s = getId(); "spotify".equals(s) || !"rdio".equals(s);)
        {
            return 0x7f080100;
        }

        return 0x7f080101;
    }

    public int getLogoResourceId()
    {
        String s = getId();
        if ("spotify".equals(s))
        {
            return 0x7f020226;
        }
        return !"rdio".equals(s) ? -1 : 0x7f02021e;
    }

    public abstract String getName();

    public int getTaglineResource()
    {
        String s = getId();
        if ("spotify".equals(s))
        {
            return 0x7f0703e7;
        }
        return !"rdio".equals(s) ? -1 : 0x7f070212;
    }

    abstract TunesProvider setAccessToken(String s);

    abstract TunesProvider setAccessTokenExpiry(Long long1);

    abstract TunesProvider setEligibleTrial(String s);

    public abstract TunesProvider setGroups(List list);

    abstract TunesProvider setId(String s);

    public abstract TunesProvider setLinked(Boolean boolean1);

    abstract TunesProvider setName(String s);

}
