// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.giq;

import com.coupons.mobile.networking.NetworkHandler;
import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UpcSearchMessage
{
    public static class Request extends com.coupons.mobile.networking.NetworkHandler.SOAPSimpleRequest
    {

        private static final String NAME = "GetItemInfoForCode";
        private static final String NAMESPACE = "http:/www.coupons.com/OfferServices/";
        protected static final String PARTNER_CODE = NetworkHandler.getPartnerCodeLoyaltyCard();
        private static String PID = NetworkHandler.getPID();
        private static final String SOAP_ACTION = "http:/www.coupons.com/OfferServices/GetItemInfoForCode";
        private static final String TARGET_URI = "FamilyCodeServiceEngine.asmx?op=GetItemInfoForCode";
        private static String targetUrl;

        public String getSoapAction()
        {
            return "http:/www.coupons.com/OfferServices/GetItemInfoForCode";
        }

        public String getSoapObjectName()
        {
            return "GetItemInfoForCode";
        }

        public String getSoapObjectNameSpace()
        {
            return "http:/www.coupons.com/OfferServices/";
        }

        public String getTargetURI()
        {
            return targetUrl;
        }

        public void setUPC(String s)
        {
            mValueMap.put("sUPC", s);
        }

        static 
        {
            targetUrl = (new StringBuilder()).append(NetworkHandler.CLIP_URL).append(NetworkHandler.CLIP_CONTEXT).append("FamilyCodeServiceEngine.asmx?op=GetItemInfoForCode").toString();
        }

        public Request()
        {
            mValueMap.put("sPartnerToken", PARTNER_CODE);
            mValueMap.put("nPID", PID);
        }
    }

    public static class Response extends com.coupons.mobile.networking.NetworkHandler.SOAPSimpleResponse
    {

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



        public Response()
        {
            elemValue = new StringBuffer("");
            mResultHandler = new ResultHandler();
            mValueMap = new HashMap();
        }
    }

    public class Response.ResultHandler extends DefaultHandler
    {

        final Response this$0;

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

        public Response.ResultHandler()
        {
            this$0 = Response.this;
            super();
        }
    }


    private static final String TAG = "giq_soapmsg_upc_search";

    public UpcSearchMessage()
    {
    }
}
