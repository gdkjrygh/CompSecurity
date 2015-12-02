// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.core.model.LocationSearchResult;

final class frk
    implements gka
{

    private final String a;

    frk(String s)
    {
        a = s;
    }

    private boolean a(LocationSearchResult locationsearchresult)
    {
        locationsearchresult = locationsearchresult.getServiceType();
        return !TextUtils.isEmpty(locationsearchresult) && locationsearchresult.equals(a);
    }

    public final boolean apply(Object obj)
    {
        return a((LocationSearchResult)obj);
    }
}
