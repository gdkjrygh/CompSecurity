// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.util;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.device.RmidUtils;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public final class AdUtils
{

    private static final int DEVICE_ID_LENGTH = 16;
    private static final char INSERTABLE_CHARS[][];
    private static final String TAG = "AdUtils";
    private static final String UTC_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static final Random random = new Random();

    private AdUtils()
    {
    }

    public static String getAdvertisingId()
    {
        Object obj = AdvertisingIdClient.getAdvertisingIdInfo(AbstractTwcApplication.getRootContext());
        if (((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj)).isLimitAdTrackingEnabled())
        {
            return null;
        }
        obj = ((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj)).getId();
        return ((String) (obj));
        Object obj1;
        obj1;
_L2:
        EventLog.e("AdUtils", (new StringBuilder()).append("Unable to get advertising id: ").append(((Exception) (obj1)).getMessage()).toString());
        return null;
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String getAdvertisingIdWithoutDashes()
    {
        String s = getAdvertisingId();
        if (s == null)
        {
            return null;
        } else
        {
            return s.replace("-", "");
        }
    }

    public static String getDeviceId()
    {
        String s1 = android.provider.Settings.Secure.getString(AbstractTwcApplication.getRootContext().getContentResolver(), "android_id");
        String s = s1;
        if (s1 == null)
        {
            s = "nl";
        }
        return s;
    }

    public static String getMD5HashAdvertisingId()
    {
        String s1 = getAdvertisingId();
        String s = s1;
        if (s1 != null)
        {
            s = RmidUtils.getMD5HASH(s1);
        }
        return s;
    }

    public static String getObfuscatedAdvertisingId()
    {
        String s = getAdvertisingIdWithoutDashes();
        if (s == null)
        {
            return null;
        } else
        {
            return obfuscateString(s);
        }
    }

    public static String getRandomString()
    {
        StringBuilder stringbuilder = new StringBuilder(11);
        stringbuilder.append(random.nextInt(0x40000000));
        for (; stringbuilder.length() < 10; stringbuilder.append(random.nextInt(10))) { }
        return stringbuilder.toString();
    }

    private static StringBuilder getRot13Skip(String s, int i)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder = new StringBuilder("");
_L4:
        return stringbuilder;
_L2:
        StringBuilder stringbuilder1 = new StringBuilder();
        int j = 0;
        int k = s.length();
        do
        {
            stringbuilder = stringbuilder1;
            if (j >= k)
            {
                continue;
            }
            char c1 = s.charAt(j);
            char c;
            if (j < i)
            {
                c = c1;
            } else
            if (c1 >= 'a' && c1 <= 'm')
            {
                c = (char)(c1 + 13);
            } else
            if (c1 >= 'A' && c1 <= 'M')
            {
                c = (char)(c1 + 13);
            } else
            if (c1 >= 'n' && c1 <= 'z')
            {
                c = (char)(c1 - 13);
            } else
            {
                c = c1;
                if (c1 >= 'N')
                {
                    c = c1;
                    if (c1 <= 'Z')
                    {
                        c = (char)(c1 - 13);
                    }
                }
            }
            stringbuilder1.append(c);
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String getSha1AndroidId()
    {
        return RmidUtils.getSHA1(getDeviceId());
    }

    public static String getTimeInUTC(long l, Locale locale)
    {
        return (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale)).format(new Date(l));
    }

    public static String obfuscateString(String s)
    {
        char ac[];
        byte byte0;
        int i;
        int j;
        if (s.length() <= 16)
        {
            byte0 = 5;
            i = INSERTABLE_CHARS.length / 2;
        } else
        {
            byte0 = 9;
            i = INSERTABLE_CHARS.length;
        }
        i = random.nextInt(i);
        ac = INSERTABLE_CHARS[i];
        s = getRot13Skip(s, i);
        s.insert(0, ac[0]);
        j = 1;
        for (i = byte0; j < ac.length && i < s.length(); i += byte0)
        {
            s.insert(i, ac[j]);
            j++;
        }

        return s.toString();
    }

    static 
    {
        char ac[] = {
            '5', 'p', '0', 'g'
        };
        char ac1[] = {
            '7', 'c', '7', 'q'
        };
        char ac2[] = {
            '6', '2', '6', '9'
        };
        char ac3[] = {
            '4', 'q', '2', 'p'
        };
        char ac4[] = {
            'l', '7', 'n', '8'
        };
        char ac5[] = {
            'x', '2', 'z', '8'
        };
        char ac6[] = {
            'w', 'u', 'g', 'q'
        };
        char ac7[] = {
            'p', 'j', 'w', 'g'
        };
        char ac8[] = {
            'v', 's', 'i', 'u'
        };
        char ac9[] = {
            'x', 'c', 'x', 'h'
        };
        char ac10[] = {
            '7', '0', '1', '5'
        };
        char ac11[] = {
            '5', 'y', 'y', 'n'
        };
        char ac12[] = {
            '7', 'y', 'x', 'k'
        };
        char ac13[] = {
            '5', 'p', 'l', 'x'
        };
        char ac14[] = {
            '5', 'a', 'y', 't'
        };
        char ac15[] = {
            '2', 'c', 'o', 'q'
        };
        char ac16[] = {
            '9', 's', 'r', 'm'
        };
        char ac17[] = {
            '5', 'n', 'h', 'p'
        };
        char ac18[] = {
            '5', 'b', 'b', 'u'
        };
        char ac19[] = {
            '4', 'h', 'y', 'r'
        };
        char ac20[] = {
            '2', '5', '4', '1'
        };
        char ac21[] = {
            '9', 'v', 'a', 'o'
        };
        char ac22[] = {
            'r', '6', '6', '4'
        };
        char ac23[] = {
            'n', '0', '9', '5'
        };
        char ac24[] = {
            'o', '9', '4', '5'
        };
        char ac25[] = {
            'q', '9', '0', '0'
        };
        char ac26[] = {
            'y', '0', '2', '7'
        };
        char ac27[] = {
            'p', '6', '1', '8'
        };
        char ac28[] = {
            'j', '9', '5', '7'
        };
        char ac29[] = {
            't', '5', '8', '7'
        };
        INSERTABLE_CHARS = (new char[][] {
            ac, ac1, ac2, ac3, ac4, ac5, ac6, ac7, ac8, ac9, 
            ac10, ac11, ac12, ac13, ac14, ac15, ac16, ac17, ac18, ac19, 
            new char[] {
                '2', 'o', 'r', 'o'
            }, ac20, ac21, ac22, ac23, ac24, ac25, ac26, ac27, new char[] {
                'm', '4', '9', '0'
            }, 
            ac28, ac29
        });
    }
}
