// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.text.TextUtils;
import com.google.android.apps.youtube.datalib.legacy.model.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.http.client.HttpResponseException;

public class GDataResponseException extends HttpResponseException
{

    private static final List YOUTUBE_SIGNUP_REQUIRED_LIST;
    public final List errors;

    public GDataResponseException(int i, String s, List list)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(s).append(", GData error(s):\n  ");
        if (list == null || list.size() == 0)
        {
            s = "none";
        } else
        {
            s = list.toString();
        }
        super(i, stringbuilder.append(s).toString());
        if (list == null)
        {
            s = Collections.emptyList();
        } else
        {
            s = Collections.unmodifiableList(list);
        }
        errors = s;
    }

    public static GDataResponseException createYouTubeSignupRequired(int i, String s)
    {
        return new GDataResponseException(i, s, YOUTUBE_SIGNUP_REQUIRED_LIST);
    }

    public boolean containsDisabledInMaintenanceModeError()
    {
        return containsError("yt:service", "disabled_in_maintenance_mode", null, null);
    }

    public boolean containsError(String s, String s1, String s2, String s3)
    {
        for (Iterator iterator = errors.iterator(); iterator.hasNext();)
        {
            c c1 = (c)iterator.next();
            if ((s == null || TextUtils.equals(s, c1.a)) && (s1 == null || TextUtils.equals(s1, c1.b)) && (s2 == null || TextUtils.equals(s2, c1.c)) && (s3 == null || TextUtils.equals(s3, c1.d)))
            {
                return true;
            }
        }

        return false;
    }

    public boolean containsInvalidUriError()
    {
        return containsError("GData", "InvalidRequestUriException", null, null);
    }

    public boolean containsVideoIsPrivateError()
    {
        return containsError("GData", "ServiceForbiddenException", null, "Private video");
    }

    public boolean containsYouTubeSignupRequiredError()
    {
        return containsError("yt:service", "youtube_signup_required", null, null) || containsError("GData", "InvalidRequestUriException", null, "Missing or invalid username.");
    }

    static 
    {
        ArrayList arraylist = new ArrayList(1);
        YOUTUBE_SIGNUP_REQUIRED_LIST = arraylist;
        arraylist.add(new c("yt:service", "youtube_signup_required", null, null));
    }
}
