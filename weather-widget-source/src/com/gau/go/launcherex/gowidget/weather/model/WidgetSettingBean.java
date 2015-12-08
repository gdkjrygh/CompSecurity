// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            ab

public class WidgetSettingBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ab();
    public int a;
    public int b;
    public int c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;

    public WidgetSettingBean()
    {
        a = 2;
        c = 1;
        f = true;
        h = true;
        l = true;
    }

    private WidgetSettingBean(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        a = 2;
        c = 1;
        f = true;
        h = true;
        l = true;
        a = parcel.readInt();
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readString();
        e = parcel.readString();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        k = parcel.readInt();
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        l = flag;
    }

    WidgetSettingBean(Parcel parcel, ab ab1)
    {
        this(parcel);
    }

    public void a(Cursor cursor)
    {
        int i1;
        int j1;
        int k1;
        i1 = cursor.getColumnIndex("setting_key");
        j1 = cursor.getColumnIndex("setting_value");
        k1 = Integer.parseInt("1");
_L2:
        String s;
        s = cursor.getString(i1);
        if (!s.equals("auto_location"))
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag;
        if (cursor.getInt(j1) == k1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
_L3:
        if (!cursor.moveToNext())
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (s.equals("tempUnit"))
        {
            a = cursor.getInt(j1);
        } else
        if (s.equals("calendarType"))
        {
            boolean flag1;
            if (cursor.getInt(j1) == k1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            j = flag1;
        } else
        if (s.equals("festival"))
        {
            k = cursor.getInt(j1);
        } else
        if (s.equals("isCycle"))
        {
            boolean flag2;
            if (cursor.getInt(j1) == k1)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            f = flag2;
        } else
        if (s.equals("dateStyle"))
        {
            c = cursor.getInt(j1);
        } else
        if (s.equals("windUnit"))
        {
            b = cursor.getInt(j1);
            if (b > 6)
            {
                s = Locale.getDefault().getCountry();
                String s1 = Locale.getDefault().getLanguage();
                if (s.indexOf("CN") != -1 && s1.equalsIgnoreCase("zh"))
                {
                    b = 5;
                } else
                if (s.indexOf("KR") != -1 && s1.equalsIgnoreCase("ko"))
                {
                    b = 4;
                } else
                {
                    b = 2;
                }
            }
        } else
        if (s.equals("world_clock"))
        {
            boolean flag3;
            if (cursor.getInt(j1) == k1)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            h = flag3;
        } else
        if (s.equals("dynamic_icon_gowidget"))
        {
            boolean flag4;
            if (cursor.getInt(j1) == k1)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            g = flag4;
        } else
        if (s.equals("widgt_calendar"))
        {
            e = cursor.getString(j1);
        } else
        if (s.equals("widgt_clock"))
        {
            d = cursor.getString(j1);
        } else
        if (s.equals("widget_theme_switcher"))
        {
            boolean flag5;
            if (cursor.getInt(j1) == k1)
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            l = flag5;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        boolean flag = true;
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeString(d);
        parcel.writeString(e);
        if (f)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (g)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (h)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (i)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (j)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        parcel.writeInt(k);
        if (l)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
    }

}
