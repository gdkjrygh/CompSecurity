// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.a;

import com.android.volley.NetworkError;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.android.volley.j;
import com.android.volley.n;

// Referenced classes of package com.google.android.apps.youtube.datalib.a:
//            c, d

public final class b
{

    public static final n a = new c();
    public static final n b = new d();

    public static int a(VolleyError volleyerror)
    {
        boolean flag = false;
        int i;
        if (volleyerror instanceof NetworkError)
        {
            volleyerror = (NetworkError)volleyerror;
            i = ((flag) ? 1 : 0);
            if (((NetworkError) (volleyerror)).networkResponse != null)
            {
                i = ((NetworkError) (volleyerror)).networkResponse.a;
            }
        } else
        {
            i = ((flag) ? 1 : 0);
            if (volleyerror instanceof ServerError)
            {
                volleyerror = (ServerError)volleyerror;
                i = ((flag) ? 1 : 0);
                if (((ServerError) (volleyerror)).networkResponse != null)
                {
                    return ((ServerError) (volleyerror)).networkResponse.a;
                }
            }
        }
        return i;
    }

}
