// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.RecentFareSplitter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class ebp extends dsi
{

    private final cgh a;
    private Collection b;

    public ebp(Context context, cgh cgh1)
    {
        super(context);
        a = cgh1;
        b = new ArrayList();
    }

    private Bitmap b(String s)
    {
        try
        {
            s = a.a(s).g();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private RecentFareSplitter c(String s)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            RecentFareSplitter recentfaresplitter = (RecentFareSplitter)iterator.next();
            String s1 = recentfaresplitter.getMobileDigits();
            String s2 = recentfaresplitter.getMobileCountryIso2();
            if (!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2) && duj.c(s1, s2).equalsIgnoreCase(s))
            {
                return recentfaresplitter;
            }
        }

        return null;
    }

    public final com.ubercab.client.core.ui.ChipEditText.Chip a(String s)
    {
        Object obj;
        Object obj1;
        String s1;
        obj1 = c(s);
        if (obj1 == null)
        {
            return super.a(s);
        }
        obj = null;
        if (!TextUtils.isEmpty(((RecentFareSplitter) (obj1)).getPictureUrl()))
        {
            obj = b(((RecentFareSplitter) (obj1)).getPictureUrl());
        }
        s1 = ((RecentFareSplitter) (obj1)).getName();
        obj1 = new Bundle();
        ((Bundle) (obj1)).putString("name", s1);
        ((Bundle) (obj1)).putString("number", s);
        ((Bundle) (obj1)).putParcelable("photo", ((android.os.Parcelable) (obj)));
        obj = "";
        if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        obj = String.format("%s (%s)", new Object[] {
            s1, s
        });
_L4:
        return new com.ubercab.client.core.ui.ChipEditText.Chip(s, ((Bundle) (obj1)), ((String) (obj)));
_L2:
        if (!TextUtils.isEmpty(s))
        {
            obj = s;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Client client)
    {
        b = client.getRecentFareSplitters();
    }
}
