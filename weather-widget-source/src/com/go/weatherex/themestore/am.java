// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.content.Context;
import com.jiubang.playsdk.d.a;
import com.jiubang.playsdk.d.e;
import java.util.ArrayList;
import java.util.List;

public class am
{

    public static List a(Context context, List list)
    {
        ArrayList arraylist = new ArrayList();
        if (list == null)
        {
            return arraylist;
        }
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            e e1 = (e)list.get(i);
            if (e1.f() != null && !com.jiubang.playsdk.f.a.c(context, e1.f().c()))
            {
                arraylist.add(e1);
            }
        }

        return arraylist;
    }
}
