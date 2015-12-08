// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzls
{

    private static final Pattern zzage = Pattern.compile("\\\\.");
    private static final Pattern zzagf = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    public static String zzcA(String s)
    {
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        StringBuffer stringbuffer;
        Matcher matcher;
        matcher = zzagf.matcher(s);
        stringbuffer = null;
_L5:
        if (matcher.find())
        {
            StringBuffer stringbuffer1 = stringbuffer;
            if (stringbuffer == null)
            {
                stringbuffer1 = new StringBuffer();
            }
            switch (matcher.group().charAt(0))
            {
            default:
                stringbuffer = stringbuffer1;
                break;

            case 8: // '\b'
                matcher.appendReplacement(stringbuffer1, "\\\\b");
                stringbuffer = stringbuffer1;
                break;

            case 34: // '"'
                matcher.appendReplacement(stringbuffer1, "\\\\\\\"");
                stringbuffer = stringbuffer1;
                break;

            case 92: // '\\'
                matcher.appendReplacement(stringbuffer1, "\\\\\\\\");
                stringbuffer = stringbuffer1;
                break;

            case 47: // '/'
                matcher.appendReplacement(stringbuffer1, "\\\\/");
                stringbuffer = stringbuffer1;
                break;

            case 12: // '\f'
                matcher.appendReplacement(stringbuffer1, "\\\\f");
                stringbuffer = stringbuffer1;
                break;

            case 10: // '\n'
                matcher.appendReplacement(stringbuffer1, "\\\\n");
                stringbuffer = stringbuffer1;
                break;

            case 13: // '\r'
                matcher.appendReplacement(stringbuffer1, "\\\\r");
                stringbuffer = stringbuffer1;
                break;

            case 9: // '\t'
                matcher.appendReplacement(stringbuffer1, "\\\\t");
                stringbuffer = stringbuffer1;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (stringbuffer != null) goto _L3; else goto _L2
_L2:
        return s;
_L3:
        matcher.appendTail(stringbuffer);
        return stringbuffer.toString();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean zzd(Object obj, Object obj1)
    {
        boolean flag1 = false;
        if (obj != null || obj1 != null) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if ((obj instanceof JSONObject) && (obj1 instanceof JSONObject))
        {
            obj = (JSONObject)obj;
            obj1 = (JSONObject)obj1;
            flag = flag1;
            if (((JSONObject) (obj)).length() != ((JSONObject) (obj1)).length())
            {
                continue; /* Loop/switch isn't completed */
            }
            for (Iterator iterator = ((JSONObject) (obj)).keys(); iterator.hasNext();)
            {
                String s = (String)iterator.next();
                flag = flag1;
                if (!((JSONObject) (obj1)).has(s))
                {
                    continue; /* Loop/switch isn't completed */
                }
                int i;
                boolean flag2;
                try
                {
                    flag = zzd(((JSONObject) (obj)).get(s), ((JSONObject) (obj1)).get(s));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return false;
                }
                if (!flag)
                {
                    return false;
                }
            }

            return true;
        }
        if (!(obj instanceof JSONArray) || !(obj1 instanceof JSONArray))
        {
            break MISSING_BLOCK_LABEL_220;
        }
        obj = (JSONArray)obj;
        obj1 = (JSONArray)obj1;
        flag = flag1;
        if (((JSONArray) (obj)).length() != ((JSONArray) (obj1)).length())
        {
            continue; /* Loop/switch isn't completed */
        }
        i = 0;
        do
        {
            if (i >= ((JSONArray) (obj)).length())
            {
                break; /* Loop/switch isn't completed */
            }
            try
            {
                flag2 = zzd(((JSONArray) (obj)).get(i), ((JSONArray) (obj1)).get(i));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            flag = flag1;
            if (!flag2)
            {
                continue; /* Loop/switch isn't completed */
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return true;
        return obj.equals(obj1);
    }

}
