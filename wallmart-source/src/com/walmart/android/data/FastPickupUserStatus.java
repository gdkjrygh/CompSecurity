// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import java.util.Iterator;
import java.util.List;

public class FastPickupUserStatus
{
    public static class CustomerStatus
    {

        public String status;
        public String timestamp;

        public void setState(String s)
        {
            status = s;
        }

        public String toString()
        {
            return (new StringBuilder()).append("{status: ").append(status).append(", timestamp: ").append(timestamp).append("}").toString();
        }

        public CustomerStatus()
        {
        }
    }

    public static class Data
    {

        public CustomerStatus current;

        public int getUserStatus()
        {
label0:
            {
                byte byte0 = -1;
                if (current != null)
                {
                    if (!"ready".equals(current.status))
                    {
                        break label0;
                    }
                    byte0 = 2;
                }
                return byte0;
            }
            if ("checkedin".equals(current.status))
            {
                return 1;
            }
            return !"accepted".equals(current.status) ? 0 : 3;
        }

        public String toString()
        {
            return (new StringBuilder()).append("{current: ").append(current).append("}").toString();
        }

        public Data()
        {
        }

        public Data(String s)
        {
            current = null;
        }
    }

    public static class History
    {

        public String status;
        public String timestamp;

        public void setState(String s)
        {
            status = s;
        }

        public void setTimestamp(String s)
        {
            timestamp = s;
        }

        public String toString()
        {
            return (new StringBuilder()).append("{status: ").append(status).append(", timestamp: ").append(timestamp).append("}").toString();
        }

        public History()
        {
        }
    }


    public static final int CUSTOMER_STATUS_ACCEPTED = 3;
    public static final int CUSTOMER_STATUS_CHECKEDIN = 1;
    public static final int CUSTOMER_STATUS_OPEN = 0;
    public static final int CUSTOMER_STATUS_READY = 2;
    public static final int CUSTOMER_STATUS_UNDEFINED = -1;
    private static final String SERVICE_CUSTOMER_STATUS_ACCEPTED = "accepted";
    public static final String SERVICE_CUSTOMER_STATUS_CHECKEDIN = "checkedin";
    private static final String SERVICE_CUSTOMER_STATUS_NOSHOW = "noshow";
    private static final String SERVICE_CUSTOMER_STATUS_OPEN = "open";
    private static final String SERVICE_CUSTOMER_STATUS_PRECHECKIN = "precheckin";
    public static final String SERVICE_CUSTOMER_STATUS_READY = "ready";
    private static final String SERVICE_CUSTOMER_STATUS_SHOPPING = "shopping";
    public Data data;
    public int status;

    public FastPickupUserStatus()
    {
    }

    private static String print(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (list != null)
        {
            Object obj;
            for (list = list.iterator(); list.hasNext(); stringbuilder.append(obj))
            {
                obj = list.next();
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(", ");
                }
            }

        }
        return stringbuilder.toString();
    }

    private static String print(Object aobj[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (aobj != null)
        {
            int j = aobj.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = aobj[i];
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(", ");
                }
                stringbuilder.append(obj);
            }

        }
        return stringbuilder.toString();
    }

    public String toString()
    {
        return (new StringBuilder()).append("{ status:").append(status).append(", data:").append(data).append("}").toString();
    }
}
