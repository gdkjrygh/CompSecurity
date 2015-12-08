// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class RecommendationRequest
{
    public static class Module
    {

        public String moduleType;

        public Module()
        {
        }
    }

    public static class UserClientInfo
    {

        public final String callType = "CLIENT";
        public final String deviceType = "android";
        public String userAgent;

        public UserClientInfo()
        {
        }
    }

    public static class UserReqInfo
    {

        public HashMap cookieMap;

        public UserReqInfo()
        {
        }
    }


    public final ArrayList modules = new ArrayList();
    public String pageType;
    public final String reqId = UUID.randomUUID().toString();
    public final String tenant = "walmart.com";
    public final UserClientInfo userClientInfo = new UserClientInfo();
    public final UserReqInfo userReqInfo = new UserReqInfo();

    public RecommendationRequest(String s)
    {
        pageType = s;
        s = new Module();
        s.moduleType = "athenaItemCarousel";
        modules.add(s);
    }
}
