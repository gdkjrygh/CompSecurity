// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import android.text.TextUtils;
import android.util.Log;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PromotionData
{

    private static final String TAG = com/walmart/android/data/PromotionData.getSimpleName();
    public String actualpoststart;
    public String additionaldealinfo;
    public String areashape;
    public String availableonline;
    public String availableonlineproductcode;
    public String bitmaptype;
    public String brandid;
    public String brandname;
    public String buynow;
    public long cacheMaxAge;
    public String code;
    public String coordinatetag;
    public String coverpageflag;
    public String customimagedescription;
    public String customimagelocation;
    public String description;
    public String displayflag;
    public String displayorder;
    public String displaypagenumber;
    public String enddate;
    public String featuredpromotion;
    public String finalprice;
    public String fineprint;
    public String formattedDateText;
    public String gridlistingofferid;
    public String highprice;
    public String identifier;
    public String image;
    public String imageflag;
    public int imageheight;
    public String imageurl;
    public int imagewidth;
    public String interestexposureratio;
    public String keyword;
    public String largeimage;
    public String link;
    public String linkoptionid;
    public String linktext;
    public String linktypeid;
    public String listingcount;
    public String listingend;
    public String listingid;
    public String listingstart;
    public String lowprice;
    public String mapareaid;
    public String mapareaimageheight;
    public String mapareaimagewidth;
    public String mapareatitle;
    public String mapimageheight;
    public String mapimagewidth;
    public String name;
    public String originaldeal;
    public String pagecode;
    public String pageid;
    public int pageindex;
    public String pageorder;
    public String postenddate;
    public String poststartdate;
    public String pretailerid;
    public String pretailername;
    public String previewenddate;
    public String previewstartdate;
    private String price;
    public String pricequalifier;
    public String productdescription;
    public String promotionchildtypeid;
    public String promotionchildtypename;
    public String promotioncode;
    public String promotionenddate;
    public String promotionid;
    public String promotionidentifier;
    public String promotionmessage;
    public String promotionpostenddate;
    public String promotionpoststartdate;
    public String promotionstartdate;
    public String promotiontag;
    public String promotiontitle;
    public String promotiontypeid;
    public String retailerid;
    public String retailername;
    public String retailerproductcode;
    public String saleenddate;
    public long salesEndDateInMs;
    public String salestartdate;
    public String score;
    public String storeid;
    public String tag;
    public String tagid;
    public String title;
    public String totalinterestexposureratio;
    public String typeid;
    public String vo;

    public PromotionData()
    {
    }

    private static String formatAdDate(String s, boolean flag, long al[])
    {
        if (s == null)
        {
            return "Unknown date";
        }
        Object obj = "MMM dd";
        if (flag)
        {
            obj = "MMM dd yyyy";
        }
        SimpleDateFormat simpledateformat = new SimpleDateFormat("MM/dd/yyyy");
        obj = new SimpleDateFormat(((String) (obj)));
        try
        {
            s = simpledateformat.parse(s.split(" ")[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(TAG, "Error formatting date", s);
            return "Unknown date";
        }
        if (al == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        al[0] = s.getTime();
        s = ((DateFormat) (obj)).format(s);
        return s;
    }

    private static int getYear(String s)
    {
        if (s == null)
        {
            return 0;
        }
        Object obj = new SimpleDateFormat("MM/dd/yyyy");
        int i;
        try
        {
            s = ((DateFormat) (obj)).parse(s.split(" ")[0]);
            obj = Calendar.getInstance();
            ((Calendar) (obj)).setTime(s);
            i = ((Calendar) (obj)).get(1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(TAG, "Error getting year", s);
            return 0;
        }
        return i;
    }

    private void setMaxAge(long l)
    {
        long l1 = l - System.currentTimeMillis();
        if (l1 / 0x5265c00L <= 30L) goto _L2; else goto _L1
_L1:
        l = 0x9a7ec800L;
_L4:
        cacheMaxAge = l;
        return;
_L2:
        l = l1;
        if (l1 < 0x5265c00L)
        {
            l = 0x5265c00L;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getPrice()
    {
        return price;
    }

    public void initFormattedDates()
    {
        if (!TextUtils.isEmpty(salestartdate) && !TextUtils.isEmpty(saleenddate))
        {
            int i = getYear(salestartdate);
            long al[];
            String s;
            String s1;
            boolean flag;
            if (getYear(saleenddate) > i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            al = new long[1];
            al[0] = -1L;
            s = formatAdDate(salestartdate, flag, null);
            s1 = formatAdDate(saleenddate, flag, al);
            salesEndDateInMs = al[0];
            setMaxAge(salesEndDateInMs);
            formattedDateText = (new StringBuilder()).append(s).append(" - ").append(s1).toString();
        }
    }

    public void setPrice(String s)
    {
        Object obj = Pattern.compile("\\s*(\\d{1,2})\\s?\242.*");
        String s1 = s;
        if (s != null)
        {
            obj = ((Pattern) (obj)).matcher(s);
            s1 = s;
            if (((Matcher) (obj)).matches())
            {
                s1 = String.format("0.%02d", new Object[] {
                    Integer.valueOf(Integer.parseInt(((Matcher) (obj)).group(1))), Locale.US
                });
            }
        }
        price = s1;
    }

    public void setSaleenddate(String s)
    {
        saleenddate = s;
        initFormattedDates();
    }

    public void setSalestartdate(String s)
    {
        salestartdate = s;
        initFormattedDates();
    }

}
