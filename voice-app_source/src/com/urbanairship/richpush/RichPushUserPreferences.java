// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import android.content.Context;
import com.urbanairship.Logger;
import com.urbanairship.Preferences;
import com.urbanairship.util.UAStringUtil;
import java.io.UnsupportedEncodingException;

class RichPushUserPreferences extends Preferences
{

    private static final String KEY_PREFIX = "com.urbanairship.user";
    private static final String LAST_MESSAGE_REFRESH_TIME = "com.urbanairship.user.LAST_MESSAGE_REFRESH_TIME";
    private static final String LAST_UPDATE_TIME = "com.urbanairship.user.LAST_UPDATE_TIME";
    private static final String USER_ID_KEY = "com.urbanairship.user.ID";
    private static final String USER_PASSWORD_KEY = "com.urbanairship.user.PASSWORD";
    private static final String USER_TOKEN_KEY = "com.urbanairship.user.USER_TOKEN";

    RichPushUserPreferences(Context context)
    {
        super(context);
        migratePreferencesFromFileToDb("com.urbanairship.user");
        context = getString("com.urbanairship.user.PASSWORD", null);
        if (!UAStringUtil.isEmpty(context) && put("com.urbanairship.user.USER_TOKEN", encode(context, getString("com.urbanairship.user.ID", null))))
        {
            put("com.urbanairship.user.PASSWORD", null);
        }
    }

    private String decode(String s, String s1)
    {
        if (!UAStringUtil.isEmpty(s) && !UAStringUtil.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        int j;
        return null;
_L2:
        if ((j = s.length()) % 2 != 0) goto _L1; else goto _L3
_L3:
        byte abyte0[];
        int i;
        try
        {
            abyte0 = new byte[j / 2];
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.error((new StringBuilder()).append("Unable to decode string. ").append(s.getMessage()).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.error((new StringBuilder()).append("String contains invalid hex numbers. ").append(s.getMessage()).toString());
            return null;
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte0[i / 2] = Byte.parseByte(s.substring(i, i + 2), 16);
        i += 2;
        if (true) goto _L5; else goto _L4
_L5:
        break MISSING_BLOCK_LABEL_39;
_L4:
        s = new String(xor(abyte0, s1.getBytes()), "UTF-8");
        return s;
    }

    private String encode(String s, String s1)
    {
        if (UAStringUtil.isEmpty(s) || UAStringUtil.isEmpty(s1))
        {
            return null;
        }
        s = xor(s.getBytes(), s1.getBytes());
        s1 = new StringBuilder();
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            s1.append(String.format("%02x", new Object[] {
                Byte.valueOf(s[i])
            }));
        }

        return s1.toString();
    }

    private byte[] xor(byte abyte0[], byte abyte1[])
    {
        byte abyte2[] = new byte[abyte0.length];
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte2[i] = (byte)(abyte0[i] ^ abyte1[i % abyte1.length]);
        }

        return abyte2;
    }

    public String getLastMessageRefreshTime()
    {
        return getString("com.urbanairship.user.LAST_MESSAGE_REFRESH_TIME", null);
    }

    public long getLastUpdateTime()
    {
        return getLong("com.urbanairship.user.LAST_UPDATE_TIME", 0L);
    }

    public String getUserId()
    {
        return getString("com.urbanairship.user.ID", null);
    }

    public String getUserToken()
    {
        return decode(getString("com.urbanairship.user.USER_TOKEN", null), getUserId());
    }

    public void setLastMessageRefreshTime(String s)
    {
        put("com.urbanairship.user.LAST_MESSAGE_REFRESH_TIME", s);
    }

    public void setLastUpdateTime(long l)
    {
        put("com.urbanairship.user.LAST_UPDATE_TIME", Long.valueOf(l));
    }

    public void setUserCredentials(String s, String s1)
    {
        put("com.urbanairship.user.ID", s);
        put("com.urbanairship.user.USER_TOKEN", encode(s1, s));
    }
}
