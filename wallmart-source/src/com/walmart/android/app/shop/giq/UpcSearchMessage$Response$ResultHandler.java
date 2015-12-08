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

public class this._cls0 extends DefaultHandler
{

    final this._cls0 this$0;

    private void upsertValue(String s, String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        String s3 = (String)this._mth0(this._cls0.this).get(s);
        s1 = this._mth0(this._cls0.this);
        if (s3 != null)
        {
            s2 = (new StringBuilder()).append(s3).append(s2).toString();
        }
        s1.put(s, s2);
    }

    public void characters(char ac[], int i, int j)
        throws SAXException
    {
        this._mth0(this._cls0.this).append(ac, i, j);
    }

    public void endElement(String s, String s1, String s2)
        throws SAXException
    {
        s = this._mth0(this._cls0.this).toString();
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
        upsertValue(this._cls0.this).setLength(0);
    }

    public ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
