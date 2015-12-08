// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector;

import com.devicecollector.collectors.CollectorEnum;
import com.devicecollector.collectors.SoftErrorCode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DataCollection
{
    public static final class PostElement extends Enum
    {

        private static final PostElement $VALUES[];
        public static final PostElement DEVICE_COOKIE;
        public static final PostElement ERROR_LIST;
        public static final PostElement GEO_DATE;
        public static final PostElement GEO_PROVIDER;
        public static final PostElement LATITUDE;
        public static final PostElement LONGITUDE;
        public static final PostElement MERCHANT_ID;
        public static final PostElement MOBILE_MODEL;
        public static final PostElement OLD_DEVICE_COOKIE;
        public static final PostElement OS_VERSION;
        public static final PostElement SDK_TYPE;
        public static final PostElement SDK_VERSION;
        public static final PostElement SESSION_ID;
        public static final PostElement USER_COOKIE;
        private String postField;

        public static PostElement valueOf(String s)
        {
            return (PostElement)Enum.valueOf(com/devicecollector/DataCollection$PostElement, s);
        }

        public static PostElement[] values()
        {
            return (PostElement[])$VALUES.clone();
        }

        public String postField()
        {
            return postField;
        }

        static 
        {
            LATITUDE = new PostElement("LATITUDE", 0, "lat");
            LONGITUDE = new PostElement("LONGITUDE", 1, "lon");
            GEO_DATE = new PostElement("GEO_DATE", 2, "ltm");
            GEO_PROVIDER = new PostElement("GEO_PROVIDER", 3, "lpv");
            OLD_DEVICE_COOKIE = new PostElement("OLD_DEVICE_COOKIE", 4, "odc");
            DEVICE_COOKIE = new PostElement("DEVICE_COOKIE", 5, "dc");
            USER_COOKIE = new PostElement("USER_COOKIE", 6, "uc");
            OS_VERSION = new PostElement("OS_VERSION", 7, "os");
            SDK_VERSION = new PostElement("SDK_VERSION", 8, "sv");
            SDK_TYPE = new PostElement("SDK_TYPE", 9, "st");
            MOBILE_MODEL = new PostElement("MOBILE_MODEL", 10, "mdl");
            ERROR_LIST = new PostElement("ERROR_LIST", 11, "err");
            MERCHANT_ID = new PostElement("MERCHANT_ID", 12, "m");
            SESSION_ID = new PostElement("SESSION_ID", 13, "s");
            $VALUES = (new PostElement[] {
                LATITUDE, LONGITUDE, GEO_DATE, GEO_PROVIDER, OLD_DEVICE_COOKIE, DEVICE_COOKIE, USER_COOKIE, OS_VERSION, SDK_VERSION, SDK_TYPE, 
                MOBILE_MODEL, ERROR_LIST, MERCHANT_ID, SESSION_ID
            });
        }

        private PostElement(String s, int i, String s1)
        {
            super(s, i);
            postField = s1;
        }
    }


    private final String collectorUrl;
    private HashMap errors;
    private final String merchantId;
    private HashMap mobileData;
    private String serverUrl;
    private final String sessionId;

    public DataCollection(String s, String s1, String s2)
    {
        collectorUrl = s;
        merchantId = s1;
        sessionId = s2;
        mobileData = new HashMap();
        errors = new HashMap();
    }

    public void addError(CollectorEnum collectorenum, SoftErrorCode softerrorcode)
    {
        this;
        JVM INSTR monitorenter ;
        errors.put(collectorenum, softerrorcode);
        this;
        JVM INSTR monitorexit ;
        return;
        collectorenum;
        throw collectorenum;
    }

    public void addMobileData(PostElement postelement, String s)
    {
        this;
        JVM INSTR monitorenter ;
        mobileData.put(postelement, s);
        this;
        JVM INSTR monitorexit ;
        return;
        postelement;
        throw postelement;
    }

    public String getCollectorUrl()
    {
        this;
        JVM INSTR monitorenter ;
        String s = collectorUrl;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String getMerchantId()
    {
        return merchantId;
    }

    public HashMap getPostData()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new HashMap();
        ((HashMap) (obj)).put(PostElement.MERCHANT_ID.postField(), merchantId);
        ((HashMap) (obj)).put(PostElement.SESSION_ID.postField(), sessionId);
        PostElement postelement;
        for (Iterator iterator = mobileData.keySet().iterator(); iterator.hasNext(); ((HashMap) (obj)).put(postelement.postField(), mobileData.get(postelement)))
        {
            postelement = (PostElement)iterator.next();
        }

        break MISSING_BLOCK_LABEL_97;
        obj;
        throw obj;
        StringBuilder stringbuilder;
        if (errors.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        stringbuilder = new StringBuilder("{");
        CollectorEnum collectorenum;
        for (Iterator iterator1 = errors.keySet().iterator(); iterator1.hasNext(); stringbuilder.append((new StringBuilder()).append("\"").append(collectorenum.postValue()).append("\":").append("\"").append(((SoftErrorCode)errors.get(collectorenum)).postValue()).append("\", ").toString()))
        {
            collectorenum = (CollectorEnum)iterator1.next();
        }

        stringbuilder.replace(stringbuilder.length() - 2, stringbuilder.length() - 1, "}");
        ((HashMap) (obj)).put(PostElement.ERROR_LIST.postField(), stringbuilder.toString());
        this;
        JVM INSTR monitorexit ;
        return ((HashMap) (obj));
    }

    public String getServerUrl()
    {
        return serverUrl;
    }

    public String getSessionId()
    {
        return sessionId;
    }

    public void setServerUrl(String s)
    {
        this;
        JVM INSTR monitorenter ;
        serverUrl = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
