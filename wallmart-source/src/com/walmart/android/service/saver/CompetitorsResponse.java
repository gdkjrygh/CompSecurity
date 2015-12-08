// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.service.saver:
//            StatusResponse

public class CompetitorsResponse extends StatusResponse
{
    public static class Competitor
    {

        public String address;
        public String city;
        public String country;
        public float lat;
        public float lng;
        public String name;
        public String state;
        public String zip;

        public Competitor()
        {
        }
    }

    public static class Payload
    {

        public List competitors;

        public Payload()
        {
            competitors = new ArrayList();
        }
    }


    public Payload payload;

    public CompetitorsResponse()
    {
    }
}
