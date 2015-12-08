// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.cf;
import com.google.android.apps.youtube.core.converter.ConverterException;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            d, AdError, al

public final class b
{

    private static final Pattern a = Pattern.compile("(\\[[a-zA-Z_]+\\])");
    private final String b;
    private final Random c;
    private final com.google.android.apps.youtube.common.e.b d;
    private String e;
    private String f;
    private VastAd g;
    private VmapAdBreak h;
    private int i;
    private int j;
    private al k;
    private final cf l;
    private final h m;

    b(String s, com.google.android.apps.youtube.common.e.b b1, Random random, cf cf1, h h1)
    {
        k = null;
        c = random;
        b = (new StringBuilder("a.")).append(s).toString();
        d = b1;
        l = cf1;
        m = h1;
        i = -1;
        j = -1;
    }

    public final Uri a(Uri uri, AdError aderror)
    {
        StringBuffer stringbuffer;
        Matcher matcher;
        stringbuffer = new StringBuffer();
        matcher = a.matcher(uri.toString());
_L8:
        if (!matcher.find()) goto _L2; else goto _L1
_L1:
        if (matcher.groupCount() != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        uri = matcher.group(1);
        uri = (Integer)d.a.get(uri);
        if (uri != null) goto _L4; else goto _L3
_L3:
        uri = null;
_L6:
        if (uri != null)
        {
            matcher.appendReplacement(stringbuffer, Uri.encode(uri));
        }
        continue; /* Loop/switch isn't completed */
_L4:
        switch (uri.intValue())
        {
        default:
            uri = "";
            break;

        case 1: // '\001'
            if (g != null && g.firstStreamUri() != null)
            {
                uri = g.firstStreamUri().toString();
            } else
            {
                uri = "";
            }
            break;

        case 2: // '\002'
            uri = Integer.toString(c.nextInt(0x55d4a7f) + 0x989680);
            break;

        case 3: // '\003'
            uri = "00:00:00.000";
            break;

        case 4: // '\004'
            uri = Integer.toString(aderror.b());
            break;

        case 5: // '\005'
            uri = TextUtils.join(",", g.getOfflineAdFormatExclusionReasons());
            break;

        case 6: // '\006'
            if (g != null)
            {
                uri = g.getAdIds();
            } else
            {
                uri = "";
            }
            break;

        case 7: // '\007'
            if (g != null)
            {
                uri = Integer.toString(g.getDuration() * 1000);
            } else
            {
                uri = "0";
            }
            break;

        case 8: // '\b'
            if (g != null)
            {
                uri = g.getAdSystems();
            } else
            {
                uri = "";
            }
            break;

        case 9: // '\t'
            if (g != null && !TextUtils.isEmpty(g.getAdVideoId()))
            {
                uri = g.getAdVideoId();
            } else
            {
                uri = "0";
            }
            break;

        case 10: // '\n'
            if (aderror.d())
            {
                uri = "1";
            } else
            {
                uri = "0";
            }
            break;

        case 11: // '\013'
            if (h != null)
            {
                uri = Integer.toString(h.getBreakType().value());
            } else
            {
                uri = "0";
            }
            break;

        case 12: // '\f'
            if (m != null)
            {
                uri = String.valueOf(m.i());
            } else
            {
                uri = "0";
            }
            break;

        case 13: // '\r'
            uri = "0";
            break;

        case 14: // '\016'
            if (f != null)
            {
                uri = f;
            } else
            {
                uri = "";
            }
            break;

        case 15: // '\017'
            if (e != null)
            {
                uri = e;
            } else
            {
                uri = "";
            }
            break;

        case 16: // '\020'
            if (aderror != null)
            {
                uri = Integer.toString(aderror.c());
            } else
            {
                uri = "0";
            }
            break;

        case 17: // '\021'
            uri = "";
            break;

        case 18: // '\022'
            uri = "detailpage";
            break;

        case 19: // '\023'
            if (g != null && g.getBillingPartner() != null)
            {
                uri = g.getBillingPartner().partnerId;
            } else
            {
                uri = "0";
            }
            break;

        case 20: // '\024'
            if (g != null)
            {
                uri = g.getAdFormatSubType().subType;
            } else
            {
                uri = "0";
            }
            break;

        case 21: // '\025'
            if (g != null)
            {
                uri = "2";
            } else
            {
                uri = "0";
            }
            break;

        case 22: // '\026'
            uri = Integer.toString(i);
            break;

        case 23: // '\027'
            uri = Integer.toString(j);
            break;

        case 24: // '\030'
            if (aderror != null)
            {
                uri = Integer.toString(aderror.a());
            } else
            {
                uri = "0";
            }
            break;

        case 25: // '\031'
            if (l == null)
            {
                L.c("userPresenceTracker is not supported and should not expect receiving LACT macro");
                uri = "-1";
            } else
            {
                uri = String.valueOf(l.b());
            }
            break;

        case 26: // '\032'
            uri = "0";
            break;

        case 27: // '\033'
            uri = "0";
            break;

        case 28: // '\034'
            if (k != null)
            {
                uri = k.b();
            } else
            {
                uri = "0";
            }
            break;

        case 29: // '\035'
            uri = "0";
            break;

        case 30: // '\036'
            if (g != null && g.getRequestTimes() != null)
            {
                uri = g.getRequestTimes();
            } else
            {
                uri = "";
            }
            break;

        case 31: // '\037'
            uri = b;
            break;

        case 32: // ' '
            uri = "0";
            break;

        case 33: // '!'
            uri = "0";
            break;

        case 34: // '"'
            uri = Long.toString(d.a());
            break;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        matcher.appendTail(stringbuffer);
        break MISSING_BLOCK_LABEL_883;
        if (true) goto _L6; else goto _L5
_L5:
        uri = p.b(stringbuffer.toString());
        return uri;
        uri;
        throw new ConverterException("Failed to convert URI", uri);
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(int i1, int j1)
    {
        i = i1;
        j = j1;
    }

    public final void a(al al1)
    {
        k = al1;
    }

    public final void a(VastAd vastad)
    {
        g = vastad;
    }

    public final void a(VmapAdBreak vmapadbreak)
    {
        h = vmapadbreak;
    }

    public final void a(String s, String s1)
    {
        e = s1;
        f = s;
    }

}
