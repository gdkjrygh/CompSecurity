// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adyen.clientencryption;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

public class Card
{
    public static class Builder
    {

        private String cvc;
        private String expiryMonth;
        private String expiryYear;
        private final Date generationtime;
        private String holderName;
        private String number;

        public Card build()
        {
            return new Card(this);
        }

        public Builder cvc(String s)
        {
            cvc = s;
            return this;
        }

        public Builder expiryMonth(String s)
        {
            expiryMonth = s;
            return this;
        }

        public Builder expiryYear(String s)
        {
            expiryYear = s;
            return this;
        }

        public Builder holderName(String s)
        {
            holderName = s;
            return this;
        }

        public Builder number(String s)
        {
            number = s;
            return this;
        }







        public Builder(Date date)
        {
            generationtime = date;
        }
    }


    private String cvc;
    private String expiryMonth;
    private String expiryYear;
    private Date generationtime;
    private String holderName;
    private String number;

    private Card(Builder builder)
    {
        generationtime = builder.generationtime;
        number = builder.number;
        holderName = builder.holderName;
        cvc = builder.cvc;
        expiryMonth = builder.expiryMonth;
        expiryYear = builder.expiryYear;
    }


    public String toString()
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("generationtime", simpledateformat.format(generationtime));
            jsonobject.put("number", number);
            jsonobject.put("holderName", holderName);
            jsonobject.put("cvc", cvc);
            jsonobject.put("expiryMonth", expiryMonth);
            jsonobject.put("expiryYear", expiryYear);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        return jsonobject.toString();
    }
}
