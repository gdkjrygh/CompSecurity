// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.facade;


// Referenced classes of package com.weather.commons.ups.facade:
//            Profile

public static class EndPointDoc
{
    public static class EndPointDoc
    {

        private final String addr = null;
        private final String chan = null;
        private final String status = null;

        public String getAddr()
        {
            return addr;
        }

        public String getChan()
        {
            return chan;
        }

        public String getStatus()
        {
            return status;
        }

        public String toString()
        {
            return (new StringBuilder()).append("EndPointDoc{addr='").append(addr).append('\'').append(", chan='").append(chan).append('\'').append(", status='").append(status).append('\'').append('}').toString();
        }

        public EndPointDoc()
        {
        }
    }


    private final EndPointDoc doc = null;
    private final String id = null;

    public EndPointDoc getDoc()
    {
        return doc;
    }

    public String getId()
    {
        return id;
    }

    public String toString()
    {
        return (new StringBuilder()).append("\nEndPoint{id='").append(id).append('\'').append(", doc=").append(doc).append('}').toString();
    }

    public EndPointDoc()
    {
    }
}
