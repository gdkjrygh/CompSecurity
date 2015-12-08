// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video.vast;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

// Referenced classes of package com.weather.commons.video.vast:
//            ContentContainer, Vast, TrackingEvent, TrackingEventType, 
//            ContentParameter

public class VastContentHandler
    implements ContentHandler
{

    private String clickThroughUrl;
    private final List clickTracking = new ArrayList();
    private ContentContainer content;
    private String eventTypeString;
    private final List impressionUrls = new ArrayList();
    private String offset;
    private final List params = new ArrayList();
    private final List trackingEvents = new ArrayList();
    private final StringBuilder value = new StringBuilder();
    private Vast vast;

    public VastContentHandler()
    {
        content = ContentContainer.DEFAULT;
        clickThroughUrl = "";
        vast = new Vast(content, impressionUrls, trackingEvents, clickThroughUrl, clickTracking, params);
    }

    public void characters(char ac[], int i, int j)
        throws SAXException
    {
        ac = new String(ac, i, j);
        value.append(ac.trim());
    }

    public void endDocument()
        throws SAXException
    {
        Preconditions.checkNotNull(content);
        Preconditions.checkNotNull(impressionUrls);
        Preconditions.checkNotNull(trackingEvents);
        Preconditions.checkNotNull(clickThroughUrl);
        Preconditions.checkNotNull(clickTracking);
        Preconditions.checkNotNull(params);
        vast = new Vast(content, impressionUrls, trackingEvents, clickThroughUrl, clickTracking, params);
    }

    public void endElement(String s, String s1, String s2)
        throws SAXException
    {
        if (s2.equals("Tracking"))
        {
            s = new TrackingEvent(value.toString(), TrackingEventType.getValue(eventTypeString), offset);
            trackingEvents.add(s);
        } else
        {
            if (s2.equals("ClickThrough"))
            {
                clickThroughUrl = value.toString();
                return;
            }
            if (s2.equals("ClickTracking"))
            {
                clickTracking.add(value.toString());
                return;
            }
            if (s2.equals("Impression"))
            {
                impressionUrls.add(value.toString());
                return;
            }
        }
    }

    public void endPrefixMapping(String s)
        throws SAXException
    {
    }

    public Vast getVast()
    {
        return vast;
    }

    public void ignorableWhitespace(char ac[], int i, int j)
        throws SAXException
    {
    }

    public void processingInstruction(String s, String s1)
        throws SAXException
    {
    }

    public void setDocumentLocator(Locator locator)
    {
    }

    public void skippedEntity(String s)
        throws SAXException
    {
    }

    public void startDocument()
    {
    }

    public void startElement(String s, String s1, String s2, Attributes attributes)
        throws SAXException
    {
        if (!s2.equals("uo:unicornOnce")) goto _L2; else goto _L1
_L1:
        content = new ContentContainer(attributes.getValue("contenturi"), attributes.getValue("contentlength"), attributes.getValue("payloadlength"));
_L4:
        value.setLength(0);
        return;
_L2:
        if (s2.equals("Tracking"))
        {
            eventTypeString = attributes.getValue("event");
            offset = attributes.getValue("offset");
        } else
        if (s2.equals("uo:parameter"))
        {
            s = new ContentParameter(attributes.getValue("key"), attributes.getValue("value"));
            params.add(s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void startPrefixMapping(String s, String s1)
        throws SAXException
    {
    }
}
