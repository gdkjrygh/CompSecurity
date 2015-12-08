// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;

public final class zzj
{

    private final String zzoL;
    private final AdSize zzsr[];

    public zzj(Context context, AttributeSet attributeset)
    {
        boolean flag1 = true;
        super();
        context = context.getResources().obtainAttributes(attributeset, com.google.android.gms.R.styleable.AdsAttrs);
        attributeset = context.getString(com.google.android.gms.R.styleable.AdsAttrs_adSize);
        String s = context.getString(com.google.android.gms.R.styleable.AdsAttrs_adSizes);
        boolean flag;
        if (!TextUtils.isEmpty(attributeset))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (TextUtils.isEmpty(s))
        {
            flag1 = false;
        }
        if (flag && !flag1)
        {
            zzsr = zzD(attributeset);
        } else
        if (!flag && flag1)
        {
            zzsr = zzD(s);
        } else
        if (flag && flag1)
        {
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else
        {
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        zzoL = context.getString(com.google.android.gms.R.styleable.AdsAttrs_adUnitId);
        if (TextUtils.isEmpty(zzoL))
        {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        } else
        {
            return;
        }
    }

    private static AdSize[] zzD(String s)
    {
        String as[];
        AdSize aadsize[];
        int i;
        as = s.split("\\s*,\\s*");
        aadsize = new AdSize[as.length];
        i = 0;
_L9:
        String s1;
        String as1[];
        if (i >= as.length)
        {
            break MISSING_BLOCK_LABEL_341;
        }
        s1 = as[i].trim();
        if (!s1.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$"))
        {
            break MISSING_BLOCK_LABEL_181;
        }
        as1 = s1.split("[xX]");
        as1[0] = as1[0].trim();
        as1[1] = as1[1].trim();
        if (!"FULL_WIDTH".equals(as1[0])) goto _L2; else goto _L1
_L1:
        int j = -1;
_L5:
        int k;
        boolean flag;
        try
        {
            flag = "AUTO_HEIGHT".equals(as1[1]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Could not parse XML attribute \"adSize\": ").append(s1).toString());
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        k = -2;
_L6:
        aadsize[i] = new AdSize(j, k);
_L7:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        j = Integer.parseInt(as1[0]);
          goto _L5
_L4:
        k = Integer.parseInt(as1[1]);
          goto _L6
        if ("BANNER".equals(s1))
        {
            aadsize[i] = AdSize.BANNER;
        } else
        if ("LARGE_BANNER".equals(s1))
        {
            aadsize[i] = AdSize.LARGE_BANNER;
        } else
        if ("FULL_BANNER".equals(s1))
        {
            aadsize[i] = AdSize.FULL_BANNER;
        } else
        if ("LEADERBOARD".equals(s1))
        {
            aadsize[i] = AdSize.LEADERBOARD;
        } else
        if ("MEDIUM_RECTANGLE".equals(s1))
        {
            aadsize[i] = AdSize.MEDIUM_RECTANGLE;
        } else
        if ("SMART_BANNER".equals(s1))
        {
            aadsize[i] = AdSize.SMART_BANNER;
        } else
        if ("WIDE_SKYSCRAPER".equals(s1))
        {
            aadsize[i] = AdSize.WIDE_SKYSCRAPER;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Could not parse XML attribute \"adSize\": ").append(s1).toString());
        }
          goto _L7
        if (aadsize.length == 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Could not parse XML attribute \"adSize\": ").append(s).toString());
        }
        return aadsize;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public String getAdUnitId()
    {
        return zzoL;
    }

    public AdSize[] zzi(boolean flag)
    {
        if (!flag && zzsr.length != 1)
        {
            throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
        } else
        {
            return zzsr;
        }
    }
}
