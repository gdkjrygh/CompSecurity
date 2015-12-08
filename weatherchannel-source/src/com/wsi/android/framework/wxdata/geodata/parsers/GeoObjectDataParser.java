// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.geodata.parsers;

import com.wsi.android.framework.wxdata.geodata.items.GeoDataCollection;
import com.wsi.android.framework.wxdata.geodata.items.GeoObject;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public abstract class GeoObjectDataParser extends DefaultHandler
{

    public static final String E_GEO_X = "X";
    public static final String E_GEO_Y = "Y";
    public static final String E_GML_COLLECTION = "collection";
    public static final String E_GML_FEATURE_MEMBER = "featureMember";
    public static final String E_HTML = "html";
    public static final String E_LATITUDE = "LATITUDE";
    public static final String E_LONGITUDE = "LONGITUDE";
    protected GeoDataCollection collection;
    private StringBuilder curElementText;
    protected GeoObject curGeoObject;

    public GeoObjectDataParser()
    {
    }

    public final void characters(char ac[], int i, int j)
        throws SAXException
    {
        super.characters(ac, i, j);
        curElementText.append(ac, i, j);
    }

    public void endDocument()
        throws SAXException
    {
        super.endDocument();
        curElementText = null;
    }

    public void endElement(String s, String s1, String s2)
        throws SAXException
    {
        if (!"collection".equals(s1)) goto _L2; else goto _L1
_L1:
        onCollectionEndTag();
_L4:
        super.endElement(s, s1, s2);
        return;
_L2:
        if ("featureMember".equals(s1))
        {
            onFeatureMemberEndTag();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected String getAttributeValue(String s, String s1, Attributes attributes)
    {
        return attributes.getValue(s, s1);
    }

    protected String getAttributeValue(String s, Attributes attributes)
    {
        return attributes.getValue("", s);
    }

    protected String getElementText()
    {
        if (curElementText != null)
        {
            return curElementText.toString();
        } else
        {
            return null;
        }
    }

    public GeoDataCollection getGeoDataCollection()
    {
        return collection;
    }

    protected void moveCurrentGeoObjectToCollection()
    {
        if (collection != null && curGeoObject != null)
        {
            collection.add(curGeoObject);
            curGeoObject = null;
        }
    }

    protected abstract void onCollectionEndTag();

    protected abstract void onCollectionStartTag();

    protected abstract void onFeatureMemberEndTag();

    protected abstract void onFeatureMemberStartTag();

    protected void setCollection(GeoDataCollection geodatacollection)
    {
        collection = geodatacollection;
    }

    protected void setCurrentGeoObject(GeoObject geoobject)
    {
        curGeoObject = geoobject;
    }

    public void startDocument()
        throws SAXException
    {
        super.startDocument();
        curElementText = new StringBuilder();
    }

    public void startElement(String s, String s1, String s2, Attributes attributes)
        throws SAXException
    {
        super.startElement(s, s1, s2, attributes);
        curElementText.setLength(0);
        if ("collection".equals(s1))
        {
            onCollectionStartTag();
        } else
        if ("featureMember".equals(s1))
        {
            onFeatureMemberStartTag();
            return;
        }
    }
}
