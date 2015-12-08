// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            g, i, j

public class GoLifeBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    public static final i a = new i();
    private String b;
    private String c;
    private j d;

    private GoLifeBean(Parcel parcel)
    {
        b = parcel.readString();
        c = parcel.readString();
        d = j.a(parcel.readString());
    }

    GoLifeBean(Parcel parcel, g g1)
    {
        this(parcel);
    }

    public GoLifeBean(j j1)
    {
        d = j1;
    }

    public static List c(String s)
    {
        ArrayList arraylist = new ArrayList();
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return arraylist;
_L2:
        j aj[];
        String s1;
        String s2;
        Object obj;
        int k;
        int l;
        try
        {
            s = new JSONObject(s);
            aj = j.values();
            l = aj.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return arraylist;
        }
        k = 0;
        if (k >= l)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = aj[k];
        s1 = s.optString(((j) (obj)).j);
        s2 = s.optString((new StringBuilder()).append(((j) (obj)).j).append("Value").toString());
        if (!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2))
        {
            obj = new GoLifeBean(((j) (obj)));
            ((GoLifeBean) (obj)).a(s1);
            ((GoLifeBean) (obj)).b(s2);
            arraylist.add(obj);
        }
        k++;
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_142;
_L4:
        break MISSING_BLOCK_LABEL_37;
        if (true) goto _L1; else goto _L5
_L5:
    }

    public String a()
    {
        return b;
    }

    public void a(String s)
    {
        b = s;
    }

    public String b()
    {
        return c;
    }

    public void b(String s)
    {
        c = s;
    }

    public j c()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return d.toString();
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d.a());
    }

}
