// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.giq;

import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// Referenced classes of package com.walmart.android.app.shop.giq:
//            UpcSearchMessage

public static class mValueMap extends com.coupons.mobile.networking.esponse
{
    public class ResultHandler extends DefaultHandler
    {

        final UpcSearchMessage.Response this$0;

        private void upsertValue(String s, String s1)
        {
            String s2 = s1;
            if (s1 == null)
            {
                s2 = "";
            }
            String s3 = (String)mValueMap.get(s);
            s1 = mValueMap;
            if (s3 != null)
            {
                s2 = (new StringBuilder()).append(s3).append(s2).toString();
            }
            s1.put(s, s2);
        }

        public void characters(char ac[], int i, int j)
            throws SAXException
        {
            elemValue.append(ac, i, j);
        }

        public void endElement(String s, String s1, String s2)
            throws SAXException
        {
            s = elemValue.toString();
            if (s1.equals("Status"))
            {
                upsertValue("Status", s);
            } else
            {
                if (s1.equals("Message"))
                {
                    upsertValue("Message", s);
                    return;
                }
                if (s1.equals("ItemDetail"))
                {
                    upsertValue("ItemDetail", s);
                    return;
                }
                if (s1.equals("UPC"))
                {
                    upsertValue("UPC", s);
                    return;
                }
                if (s1.equals("Description"))
                {
                    upsertValue("Description", s);
                    return;
                }
                if (s1.equals("Brand"))
                {
                    upsertValue("Brand", s);
                    return;
                }
                if (s1.equals("Size"))
                {
                    upsertValue("Size", s);
                    return;
                }
                if (s1.equals("ManufacturerName"))
                {
                    upsertValue("ManufacturerName", s);
                    return;
                }
            }
        }

        public void startElement(String s, String s1, String s2, Attributes attributes)
            throws SAXException
        {
            elemValue.setLength(0);
        }

        public ResultHandler()
        {
            this$0 = UpcSearchMessage.Response.this;
            super();
        }
    }


    public static final String BRAND_TAG = "Brand";
    public static final String DESCRIPTION_TAG = "Description";
    public static final String ITEMDETAIL_TAG = "ItemDetail";
    public static final String MANUFACTURER_TAG = "ManufacturerName";
    public static final String MESSAGE_TAG = "Message";
    public static final String SIZE_TAG = "Size";
    public static final String STATUS_TAG = "Status";
    public static final String UPC_TAG = "UPC";
    private StringBuffer elemValue;
    ResultHandler mResultHandler;
    private HashMap mValueMap;

    protected DefaultHandler getResponseHandler()
    {
        return mResultHandler;
    }

    public HashMap getResponseValues()
    {
        return mValueMap;
    }

    protected boolean isResponseEncoded()
    {
        return true;
    }



    public ResultHandler.this._cls0()
    {
        elemValue = new StringBuffer("");
        mResultHandler = new ResultHandler();
        mValueMap = new HashMap();
    }
}
