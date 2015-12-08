// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class AppStatsDaoField
{

    private static final String a = "AppStatsDataStore";
    private String b;
    private AppStatsDsFieldType c;
    private AppStatsDbFieldType d;
    private AppStatsDbFieldKeyType e;
    private String f;
    private Integer g;
    private Date h;
    private Long i;
    private Float j;

    public AppStatsDaoField()
    {
        b = "";
        c = AppStatsDsFieldType.DS_FIELD_TYPE_NONE;
        d = AppStatsDbFieldType.DB_FIELD_TYPE_NONE;
        e = AppStatsDbFieldKeyType.DB_FIELD_NO_KEY;
        f = "";
        g = null;
        h = null;
        i = null;
        j = null;
    }

    public AppStatsDaoField(String s, AppStatsDsFieldType appstatsdsfieldtype, AppStatsDbFieldType appstatsdbfieldtype, AppStatsDbFieldKeyType appstatsdbfieldkeytype, Float float1)
    {
        Object obj = null;
        super();
        b = "";
        c = AppStatsDsFieldType.DS_FIELD_TYPE_NONE;
        d = AppStatsDbFieldType.DB_FIELD_TYPE_NONE;
        e = AppStatsDbFieldKeyType.DB_FIELD_NO_KEY;
        f = "";
        g = null;
        h = null;
        i = null;
        j = null;
        b = s;
        c = appstatsdsfieldtype;
        d = appstatsdbfieldtype;
        e = appstatsdbfieldkeytype;
        j = float1;
        s = obj;
        if (float1 != null)
        {
            s = Float.toString(float1.floatValue());
        }
        f = s;
    }

    public AppStatsDaoField(String s, AppStatsDsFieldType appstatsdsfieldtype, AppStatsDbFieldType appstatsdbfieldtype, AppStatsDbFieldKeyType appstatsdbfieldkeytype, Integer integer)
    {
        Object obj = null;
        super();
        b = "";
        c = AppStatsDsFieldType.DS_FIELD_TYPE_NONE;
        d = AppStatsDbFieldType.DB_FIELD_TYPE_NONE;
        e = AppStatsDbFieldKeyType.DB_FIELD_NO_KEY;
        f = "";
        g = null;
        h = null;
        i = null;
        j = null;
        b = s;
        c = appstatsdsfieldtype;
        d = appstatsdbfieldtype;
        e = appstatsdbfieldkeytype;
        g = integer;
        s = obj;
        if (integer != null)
        {
            s = Integer.toString(integer.intValue());
        }
        f = s;
    }

    public AppStatsDaoField(String s, AppStatsDsFieldType appstatsdsfieldtype, AppStatsDbFieldType appstatsdbfieldtype, AppStatsDbFieldKeyType appstatsdbfieldkeytype, Long long1)
    {
        Object obj = null;
        super();
        b = "";
        c = AppStatsDsFieldType.DS_FIELD_TYPE_NONE;
        d = AppStatsDbFieldType.DB_FIELD_TYPE_NONE;
        e = AppStatsDbFieldKeyType.DB_FIELD_NO_KEY;
        f = "";
        g = null;
        h = null;
        i = null;
        j = null;
        b = s;
        c = appstatsdsfieldtype;
        d = appstatsdbfieldtype;
        e = appstatsdbfieldkeytype;
        i = long1;
        s = obj;
        if (long1 != null)
        {
            s = Long.toString(long1.longValue());
        }
        f = s;
    }

    public AppStatsDaoField(String s, AppStatsDsFieldType appstatsdsfieldtype, AppStatsDbFieldType appstatsdbfieldtype, AppStatsDbFieldKeyType appstatsdbfieldkeytype, String s1)
    {
        b = "";
        c = AppStatsDsFieldType.DS_FIELD_TYPE_NONE;
        d = AppStatsDbFieldType.DB_FIELD_TYPE_NONE;
        e = AppStatsDbFieldKeyType.DB_FIELD_NO_KEY;
        f = "";
        g = null;
        h = null;
        i = null;
        j = null;
        b = s;
        c = appstatsdsfieldtype;
        d = appstatsdbfieldtype;
        e = appstatsdbfieldkeytype;
        f = s1;
    }

    public AppStatsDaoField(String s, AppStatsDsFieldType appstatsdsfieldtype, AppStatsDbFieldType appstatsdbfieldtype, AppStatsDbFieldKeyType appstatsdbfieldkeytype, Date date)
    {
        b = "";
        c = AppStatsDsFieldType.DS_FIELD_TYPE_NONE;
        d = AppStatsDbFieldType.DB_FIELD_TYPE_NONE;
        e = AppStatsDbFieldKeyType.DB_FIELD_NO_KEY;
        f = "";
        g = null;
        h = null;
        i = null;
        j = null;
        b = s;
        c = appstatsdsfieldtype;
        d = appstatsdbfieldtype;
        e = appstatsdbfieldkeytype;
        h = date;
        if (date != null)
        {
            s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            s.setTimeZone(TimeZone.getTimeZone("UTC"));
            f = s.format(date);
            return;
        } else
        {
            f = null;
            return;
        }
    }

    public AppStatsDbFieldKeyType getDbFieldKeyType()
    {
        return e;
    }

    public AppStatsDbFieldType getDbFieldType()
    {
        return d;
    }

    public String getDsFieldName()
    {
        return b;
    }

    public AppStatsDsFieldType getDsFieldType()
    {
        return c;
    }

    public Date getDsValueDate()
    {
        return h;
    }

    public Float getDsValueFloat()
    {
        return j;
    }

    public Integer getDsValueInt()
    {
        return g;
    }

    public Long getDsValueLong()
    {
        return i;
    }

    public String getDsValueString()
    {
        return f;
    }

    public void setDbFieldKeyType(AppStatsDbFieldKeyType appstatsdbfieldkeytype)
    {
        e = appstatsdbfieldkeytype;
    }

    public void setDbFieldType(AppStatsDbFieldType appstatsdbfieldtype)
    {
        d = appstatsdbfieldtype;
    }

    public void setDsFieldName(String s)
    {
        b = s;
    }

    public void setDsFieldType(AppStatsDsFieldType appstatsdsfieldtype)
    {
        c = appstatsdsfieldtype;
    }

    public void setDsValueDate(Date date)
    {
        h = date;
    }

    public void setDsValueFloat(Float float1)
    {
        j = float1;
    }

    public void setDsValueInt(Integer integer)
    {
        g = integer;
    }

    public void setDsValueLong(Long long1)
    {
        i = long1;
    }

    public void setDsValueString(String s)
    {
        f = s;
    }
}
