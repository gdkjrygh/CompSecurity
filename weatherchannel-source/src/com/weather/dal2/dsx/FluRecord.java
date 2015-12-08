// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;

import com.google.common.base.Preconditions;
import com.weather.dal2.data.MonthlyFluRecord;
import com.weather.util.date.TwcDateParser;
import java.util.Date;

// Referenced classes of package com.weather.dal2.dsx:
//            DsxRecord

public class FluRecord extends DsxRecord
    implements MonthlyFluRecord
{

    private FuDoc doc;

    public FluRecord()
    {
    }

    private FuDoc.PastFluDataItem getPastFluDataItem(int i)
    {
        Object obj = null;
        FuDoc.PastFluDataItem pastfludataitem = obj;
        if (isPastFluDataNotNull())
        {
            pastfludataitem = obj;
    /* block-local class not found */
    class FuDoc {}

            if (FuDoc.access._mth000(doc).length > 0)
            {
                Preconditions.checkElementIndex(i, FuDoc.access._mth000(doc).length);
                pastfludataitem = FuDoc.access._mth000(doc)[i];
            }
        }
        return pastfludataitem;
    }

    private boolean isPastFluDataNotNull()
    {
        return doc != null && FuDoc.access._mth000(doc) != null;
    }

    public String getColor(int i)
    {
        Object obj1 = getPastFluDataItem(i);
        Object obj = null;
        String s = obj;
        if (obj1 != null)
        {
    /* block-local class not found */
    class FuDoc.PastFluDataItem {}

            obj1 = FuDoc.PastFluDataItem.access._mth400(((FuDoc.PastFluDataItem) (obj1)));
            s = obj;
    /* block-local class not found */
    class FuDoc.PastFluDataItem.FluData {}

            if (obj1 != null)
            {
                s = FuDoc.PastFluDataItem.FluData.access._mth500(((FuDoc.PastFluDataItem.FluData) (obj1)));
            }
        }
        return s;
    }

    public String getCondition(int i)
    {
        Object obj1 = getPastFluDataItem(i);
        Object obj = null;
        String s = obj;
        if (obj1 != null)
        {
            obj1 = FuDoc.PastFluDataItem.access._mth400(((FuDoc.PastFluDataItem) (obj1)));
            s = obj;
            if (obj1 != null)
            {
                s = FuDoc.PastFluDataItem.FluData.access._mth600(((FuDoc.PastFluDataItem.FluData) (obj1)));
            }
        }
        return s;
    }

    public Date getDate(int i)
    {
        Object obj1 = getPastFluDataItem(i);
        Object obj = null;
        Date date = obj;
        if (obj1 != null)
        {
            obj1 = FuDoc.PastFluDataItem.access._mth100(((FuDoc.PastFluDataItem) (obj1)));
            date = obj;
            if (obj1 != null)
            {
                date = obj;
                if (((String) (obj1)).length() == 8)
                {
                    date = TwcDateParser.parseMediumDate(((String) (obj1)));
                }
            }
        }
        return date;
    }

    public int getSize()
    {
        if (isPastFluDataNotNull())
        {
            return FuDoc.access._mth000(doc).length;
        } else
        {
            return 0;
        }
    }

    public String getState(int i)
    {
        Object obj1 = getPastFluDataItem(i);
        Object obj = null;
        String s = obj;
        if (obj1 != null)
        {
            obj1 = FuDoc.PastFluDataItem.access._mth200(((FuDoc.PastFluDataItem) (obj1)));
            s = obj;
    /* block-local class not found */
    class FuDoc.PastFluDataItem.Fludr {}

            if (obj1 != null)
            {
                s = FuDoc.PastFluDataItem.Fludr.access._mth300(((FuDoc.PastFluDataItem.Fludr) (obj1)));
            }
        }
        return s;
    }

    public void normalize()
    {
        if (doc != null && FuDoc.access._mth000(doc) == null)
        {
            status = Integer.valueOf(500);
            doc = null;
        }
    }
}
