// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.a;

import android.text.TextUtils;
import android.util.Base64;
import com.google.a.a.a.a.ct;
import com.google.android.apps.youtube.common.L;
import com.google.protobuf.nano.c;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class j
{

    private static Object a(Field field, c c1)
    {
        field = ((Field) (field.get(c1)));
        int k = Array.getLength(field);
        if (k == 0)
        {
            return null;
        }
        c1 = new JSONArray();
        int i = 0;
        while (i < k) 
        {
            Object obj = Array.get(field, i);
            if (obj instanceof c)
            {
                c1.put(a((c)obj));
            } else
            if (obj instanceof byte[])
            {
                c1.put(new String(Base64.encode((byte[])obj, 0)));
            } else
            {
                c1.put(obj);
            }
            i++;
        }
        return c1;
    }

    public static JSONObject a(c c1)
    {
        Object obj;
        int i;
        boolean flag;
        Class class1 = c1.getClass();
        obj = new JSONObject();
        Field afield[];
        String s;
        Object obj1;
        int k;
        try
        {
            afield = class1.getDeclaredFields();
            k = afield.length;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                L.a((new StringBuilder("Exception while trying to convert protoMessage: ")).append(c1.getClass().getSimpleName()).toString(), ((Throwable) (obj)));
                c1 = new JSONObject();
                c1.put("PROTO CONVERSION FAILED", "See error logs and file bug.");
            }
            // Misplaced declaration of an exception variable
            catch (c c1)
            {
                throw new RuntimeException("This should never happen.", c1);
            }
            return c1;
        }
        i = 0;
_L13:
        if (i >= k) goto _L2; else goto _L1
_L1:
        obj1 = afield[i];
        s = ((Field) (obj1)).getName();
        if ("EMPTY_ARRAY".equals(s))
        {
            break MISSING_BLOCK_LABEL_358;
        }
        if (!((Field) (obj1)).getType().isArray())
        {
            break MISSING_BLOCK_LABEL_88;
        }
        obj1 = a(((Field) (obj1)), c1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        ((JSONObject) (obj)).put(s, obj1);
        break MISSING_BLOCK_LABEL_358;
        if ((c1 instanceof ct) && s.equals("clientName"))
        {
            ((JSONObject) (obj)).put("clientName", "ANDROID");
            break MISSING_BLOCK_LABEL_358;
        }
        if (!((Field) (obj1)).getType().equals(java/lang/String)) goto _L4; else goto _L3
_L3:
        if (!TextUtils.isEmpty((String)((Field) (obj1)).get(c1)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L11:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        obj1 = ((Field) (obj1)).get(c1);
        if (obj1 instanceof c)
        {
            ((JSONObject) (obj)).put(s, a((c)obj1));
            break MISSING_BLOCK_LABEL_358;
        }
          goto _L5
_L4:
        if (!((Field) (obj1)).getType().equals(Integer.TYPE)) goto _L7; else goto _L6
_L6:
        if (((Field) (obj1)).getInt(c1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L8
_L7:
        if (!((Field) (obj1)).getType().equals(Boolean.TYPE)) goto _L10; else goto _L9
_L9:
        flag = ((Field) (obj1)).getBoolean(c1);
          goto _L8
_L10:
        if (((Field) (obj1)).get(c1) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L8:
        if (true) goto _L11; else goto _L5
_L5:
        if (obj1 instanceof byte[])
        {
            ((JSONObject) (obj)).put(s, new String(Base64.encode((byte[])obj1, 0)));
            break MISSING_BLOCK_LABEL_358;
        }
        ((JSONObject) (obj)).put(s, obj1);
        break MISSING_BLOCK_LABEL_358;
_L2:
        return ((JSONObject) (obj));
        i++;
        if (true) goto _L13; else goto _L12
_L12:
    }
}
