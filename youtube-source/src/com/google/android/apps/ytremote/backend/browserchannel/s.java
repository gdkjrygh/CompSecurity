// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;

import android.util.Log;
import org.json.JSONArray;

// Referenced classes of package com.google.android.apps.ytremote.backend.browserchannel:
//            e, a, u

final class s
    implements e
{

    private static final String a = com/google/android/apps/ytremote/backend/browserchannel/s.getCanonicalName();
    private final a b;
    private final u c;

    public s(a a1, u u1)
    {
        b = a1;
        c = u1;
    }

    public final void a(String s1)
    {
        int i = 0;
        s1 = new JSONArray(s1);
_L7:
        if (i >= s1.length()) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray;
        int j;
        jsonarray = s1.getJSONArray(i);
        j = jsonarray.getInt(0);
        b.a(j);
        jsonarray = jsonarray.getJSONArray(1);
        if (jsonarray.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (j != 0) goto _L4; else goto _L3
_L3:
        try
        {
            b.c = jsonarray.getString(1);
            if (!jsonarray.isNull(2))
            {
                jsonarray.getString(2);
            }
            break MISSING_BLOCK_LABEL_144;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.w(a, "Chunk stream error", s1);
        }
          goto _L2
_L4:
        if (j != 1) goto _L6; else goto _L5
_L5:
        b.a(jsonarray.getString(1));
        break MISSING_BLOCK_LABEL_144;
_L2:
        return;
_L6:
        if (j <= 1)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (c != null)
        {
            c.a(jsonarray);
        }
        i++;
          goto _L7
    }

}
