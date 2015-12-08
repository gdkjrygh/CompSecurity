// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2.dsx;

import com.weather.commons.video2.VideoMessage;
import com.weather.util.parsing.ValidationException;
import org.json.JSONException;
import org.json.JSONObject;

interface VideoMessageFactory
{

    public abstract VideoMessage fromJson(JSONObject jsonobject)
        throws ValidationException, JSONException;
}
